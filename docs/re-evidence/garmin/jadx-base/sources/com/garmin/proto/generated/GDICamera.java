package com.garmin.proto.generated;

import ch.qos.logback.core.net.SyslogConstants;
import com.garmin.android.apps.connectmobile.f3;
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
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import vb.h;

/* JADX INFO: loaded from: classes11.dex */
public final class GDICamera {
    private static Descriptors.FileDescriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u000fGDICamera.proto\u0012\u0010GDI.Proto.Camera\u001a\rGDICore.proto\"Õ\u0004\n\u0007Service\u0012>\n\u000econfig_request\u0018\u0001 \u0001(\u000b2&.GDI.Proto.Camera.ConfigurationRequest\u0012@\n\u000fconfig_response\u0018\u0002 \u0001(\u000b2'.GDI.Proto.Camera.ConfigurationResponse\u0012H\n\u0013config_notification\u0018\u0003 \u0001(\u000b2+.GDI.Proto.Camera.ConfigurationNotification\u00129\n\u000fcapture_request\u0018\u0004 \u0001(\u000b2 .GDI.Proto.Camera.CaptureRequest\u0012;\n\u0010capture_response\u0018\u0005 \u0001(\u000b2!.GDI.Proto.Camera.CaptureResponse\u0012C\n\u0014capture_notification\u0018\u0006 \u0001(\u000b2%.GDI.Proto.Camera.CaptureNotification\u0012;\n\u0010snapshot_request\u0018\u0007 \u0001(\u000b2!.GDI.Proto.Camera.SnapshotRequest\u0012=\n\u0011snapshot_response\u0018\b \u0001(\u000b2\".GDI.Proto.Camera.SnapshotResponse\u0012E\n\u0015snapshot_notification\u0018\t \u0001(\u000b2&.GDI.Proto.Camera.SnapshotNotification\"\u0082\u0001\n\u0013CapabilitiesRequest2k\n\u0010features_request\u0012*.GDI.Proto.Core.FeatureCapabilitiesRequest\u0018\u001e \u0001(\u000b2%.GDI.Proto.Camera.CapabilitiesRequest\"T\n\fCapabilities\u0012D\n\u0015supported_resolutions\u0018\u0001 \u0003(\u000e2%.GDI.Proto.Camera.ResolutionFramerate\"¼\u0001\n\u0014CapabilitiesResponse\u00124\n\fcapabilities\u0018\u0001 \u0001(\u000b2\u001e.GDI.Proto.Camera.Capabilities2n\n\u0011features_response\u0012+.GDI.Proto.Core.FeatureCapabilitiesResponse\u0018\u001e \u0001(\u000b2&.GDI.Proto.Camera.CapabilitiesResponse\"\u0092\r\n\rConfiguration\u0012\u001f\n\u0017audio_recording_enabled\u0018\u0001 \u0001(\b\u0012!\n\u0019noise_suppression_enabled\u0018\u0002 \u0001(\b\u00125\n\beis_mode\u0018\u0003 \u0001(\u000e2#.GDI.Proto.Camera.Configuration.Eis\u0012\u001d\n\u0015speed_overlay_enabled\u0018\u0004 \u0001(\b\u0012A\n\fspeed_format\u0018\u0005 \u0001(\u000e2+.GDI.Proto.Camera.Configuration.SpeedFormat\u0012 \n\u0018location_overlay_enabled\u0018\u0006 \u0001(\b\u0012 \n\u0018datetime_overlay_enabled\u0018\u0007 \u0001(\b\u0012?\n\u000bdate_format\u0018\b \u0001(\u000e2*.GDI.Proto.Camera.Configuration.DateFormat\u0012?\n\u000btime_format\u0018\t \u0001(\u000e2*.GDI.Proto.Camera.Configuration.TimeFormat\u0012C\n\u0014resolution_framerate\u0018\n \u0001(\u000e2%.GDI.Proto.Camera.ResolutionFramerate\u0012\u0017\n\u000fpromptly_delete\u0018\u000b \u0001(\b\u0012@\n\u000borientation\u0018\f \u0001(\u000e2+.GDI.Proto.Camera.Configuration.Orientation\u0012E\n\u000erecording_mode\u0018\r \u0001(\u000e2-.GDI.Proto.Camera.Configuration.RecordingMode\u0012\u001d\n\u0015radar_overlay_enabled\u0018\u000e \u0001(\b\u0012+\n#hard_brake_event_video_save_enabled\u0018\u000f \u0001(\b\u0012\u001f\n\u0017rearview_mirror_enabled\u0018\u0010 \u0001(\b\u0012%\n\u001dclose_pass_video_save_enabled\u0018\u0011 \u0001(\b\u0012(\n protected_lane_detection_enabled\u0018\u0012 \u0001(\b\"\\\n\u000bSpeedFormat\u0012\u0018\n\u0014SPEED_FORMAT_UNKNOWN\u0010\u0000\u0012\u001b\n\u0017SPEED_FORMAT_KILOMETERS\u0010\u0001\u0012\u0016\n\u0012SPEED_FORMAT_MILES\u0010\u0002\"s\n\nDateFormat\u0012\u0017\n\u0013DATE_FORMAT_UNKNOWN\u0010\u0000\u0012\u0018\n\u0014DATE_FORMAT_MMDDYYYY\u0010\u0001\u0012\u0018\n\u0014DATE_FORMAT_DDMMYYYY\u0010\u0002\u0012\u0018\n\u0014DATE_FORMAT_YYYYMMDD\u0010\u0003\"l\n\nTimeFormat\u0012\u0017\n\u0013TIME_FORMAT_UNKNOWN\u0010\u0000\u0012\u0017\n\u0013TIME_FORMAT_24_HOUR\u0010\u0001\u0012\u0017\n\u0013TIME_FORMAT_12_HOUR\u0010\u0002\u0012\u0013\n\u000fTIME_FORMAT_UTC\u0010\u0003\"\u0088\u0001\n\rRecordingMode\u0012\u001a\n\u0016RECORDING_MODE_UNKNOWN\u0010\u0000\u0012\u001b\n\u0017RECORDING_MODE_DISABLED\u0010\u0001\u0012\u001a\n\u0016RECORDING_MODE_ENABLED\u0010\u0002\u0012\"\n\u001eRECORDING_MODE_RADAR_ACTIVATED\u0010\u0003\"¨\u0002\n\u000bOrientation\u0012\u0017\n\u0013ORIENTATION_UNKNOWN\u0010\u0000\u0012\u0018\n\u0014ORIENTATION_ROTATE_0\u0010\u0001\u0012\"\n\u001eORIENTATION_ROTATE_0_HORZ_FLIP\u0010\u0002\u0012\u0019\n\u0015ORIENTATION_ROTATE_90\u0010\u0003\u0012#\n\u001fORIENTATION_ROTATE_90_VERT_FLIP\u0010\u0004\u0012\u001a\n\u0016ORIENTATION_ROTATE_180\u0010\u0005\u0012$\n ORIENTATION_ROTATE_180_HORZ_FLIP\u0010\u0006\u0012\u001a\n\u0016ORIENTATION_ROTATE_270\u0010\u0007\u0012$\n ORIENTATION_ROTATE_270_VERT_FLIP\u0010\b\"B\n\u0003Eis\u0012\u000f\n\u000bEIS_UNKNOWN\u0010\u0000\u0012\u000b\n\u0007EIS_OFF\u0010\u0001\u0012\u000e\n\nEIS_NORMAL\u0010\u0002\u0012\r\n\tEIS_SUPER\u0010\u0003\"G\n\u0014ConfigurationRequest\u0012/\n\u0006config\u0018\u0001 \u0001(\u000b2\u001f.GDI.Proto.Camera.Configuration\"\u0094\u0002\n\u0015ConfigurationResponse\u0012K\n\u0006status\u0018\u0001 \u0001(\u000e2;.GDI.Proto.Camera.ConfigurationResponse.ConfigurationStatus\u0012/\n\u0006config\u0018\u0002 \u0001(\u000b2\u001f.GDI.Proto.Camera.Configuration\"}\n\u0013ConfigurationStatus\u0012 \n\u001cCONFIGURATION_STATUS_UNKNOWN\u0010\u0000\u0012!\n\u001dCONFIGURATION_STATUS_REJECTED\u0010\u0001\u0012!\n\u001dCONFIGURATION_STATUS_ACCEPTED\u0010\u0002\"\u0091\u0003\n\u0019ConfigurationNotification\u0012/\n\u0006config\u0018\u0001 \u0001(\u000b2\u001f.GDI.Proto.Camera.Configuration\u0012`\n\u001bconfiguration_change_reason\u0018\u0002 \u0001(\u000e2;.GDI.Proto.Camera.ConfigurationNotification.ReasonForChange\"à\u0001\n\u000fReasonForChange\u0012\u001d\n\u0019REASON_FOR_CHANGE_UNKNOWN\u0010\u0000\u0012$\n REASON_FOR_CHANGE_GARMIN_DISPLAY\u0010\u0001\u0012 \n\u001cREASON_FOR_CHANGE_MOBILE_APP\u0010\u0002\u0012\u001e\n\u001aREASON_FOR_CHANGE_OVERTEMP\u0010\u0003\u0012\"\n\u001eREASON_FOR_CHANGE_SYSTEM_ERROR\u0010\u0004\u0012\"\n\u001eREASON_FOR_CHANGE_SYSTEM_OTHER\u0010\u0005\"\u009d\u0002\n\rCaptureStatus\u0012\u0015\n\rsaving_status\u0018\u0001 \u0001(\b\u0012-\n\u000bsave_source\u0018\u0002 \u0001(\u000e2\u0018.GDI.Proto.Camera.Source\u0012B\n\ferror_status\u0018\u0003 \u0001(\u000e2,.GDI.Proto.Camera.CaptureStatus.CaptureError\"\u0081\u0001\n\fCaptureError\u0012\u0019\n\u0015CAPTURE_ERROR_UNKNOWN\u0010\u0000\u0012\u001a\n\u0016CAPTURE_ERROR_SD_ERROR\u0010\u0001\u0012\u001d\n\u0019CAPTURE_ERROR_CAMERA_BUSY\u0010\u0002\u0012\u001b\n\u0017CAPTURE_ERROR_BAD_STATE\u0010\u0003\"ç\u0001\n\u000eCaptureRequest\u0012B\n\trecording\u0018\u0001 \u0001(\u000e2/.GDI.Proto.Camera.CaptureRequest.CaptureControl\u0012-\n\u000bsave_source\u0018\u0002 \u0001(\u000e2\u0018.GDI.Proto.Camera.Source\"b\n\u000eCaptureControl\u0012\u001b\n\u0017CAPTURE_CONTROL_UNKNOWN\u0010\u0000\u0012\u0018\n\u0014CAPTURE_CONTROL_STOP\u0010\u0001\u0012\u0019\n\u0015CAPTURE_CONTROL_START\u0010\u0002\"J\n\u000fCaptureResponse\u00127\n\u000ecapture_status\u0018\u0001 \u0001(\u000b2\u001f.GDI.Proto.Camera.CaptureStatus\"N\n\u0013CaptureNotification\u00127\n\u000ecapture_status\u0018\u0001 \u0001(\u000b2\u001f.GDI.Proto.Camera.CaptureStatus\"«\u0002\n\u000eSnapshotStatus\u0012\u0017\n\u000fsnapshot_status\u0018\u0001 \u0001(\b\u00121\n\u000fsnapshot_source\u0018\u0002 \u0001(\u000e2\u0018.GDI.Proto.Camera.Source\u0012D\n\ferror_status\u0018\u0003 \u0001(\u000e2..GDI.Proto.Camera.SnapshotStatus.SnapshotError\"\u0086\u0001\n\rSnapshotError\u0012\u001a\n\u0016SNAPSHOT_ERROR_UNKNOWN\u0010\u0000\u0012\u001b\n\u0017SNAPSHOT_ERROR_SD_ERROR\u0010\u0001\u0012\u001e\n\u001aSNAPSHOT_ERROR_CAMERA_BUSY\u0010\u0002\u0012\u001c\n\u0018SNAPSHOT_ERROR_BAD_STATE\u0010\u0003\"D\n\u000fSnapshotRequest\u00121\n\u000fsnapshot_source\u0018\u0001 \u0001(\u000e2\u0018.GDI.Proto.Camera.Source\"M\n\u0010SnapshotResponse\u00129\n\u000fsnapshot_status\u0018\u0001 \u0001(\u000b2 .GDI.Proto.Camera.SnapshotStatus\"Q\n\u0014SnapshotNotification\u00129\n\u000fsnapshot_status\u0018\u0001 \u0001(\u000b2 .GDI.Proto.Camera.SnapshotStatus*æ\u0003\n\u0013ResolutionFramerate\u0012 \n\u001cRESOLUTION_FRAMERATE_UNKNOWN\u0010\u0000\u0012#\n\u001fRESOLUTION_FRAMERATE_720P_30FPS\u0010\u0001\u0012'\n#RESOLUTION_FRAMERATE_720P_30FPS_HDR\u0010\u0002\u0012$\n RESOLUTION_FRAMERATE_1080P_30FPS\u0010\u0003\u0012(\n$RESOLUTION_FRAMERATE_1080P_30FPS_HDR\u0010\u0004\u0012(\n$RESOLUTION_FRAMERATE_1080P_45FPS_HDR\u0010\u0005\u0012$\n RESOLUTION_FRAMERATE_1080P_60FPS\u0010\u0006\u0012%\n!RESOLUTION_FRAMERATE_1080P_120FPS\u0010\u0007\u0012$\n RESOLUTION_FRAMERATE_1440P_30FPS\u0010\b\u0012(\n$RESOLUTION_FRAMERATE_1440P_30FPS_HDR\u0010\t\u0012!\n\u001dRESOLUTION_FRAMERATE_4K_30FPS\u0010\n\u0012%\n!RESOLUTION_FRAMERATE_4K_30FPS_HDR\u0010\u000b*«\u0001\n\u0006Source\u0012\u0012\n\u000eSOURCE_UNKNOWN\u0010\u0000\u0012\u0017\n\u0013SOURCE_BUTTON_PRESS\u0010\u0001\u0012\u0012\n\u000eSOURCE_DISPLAY\u0010\u0002\u0012\u0013\n\u000fSOURCE_INCIDENT\u0010\u0003\u0012\u0010\n\fSOURCE_RADAR\u0010\u0004\u0012\u000f\n\u000bSOURCE_SYNC\u0010\u0005\u0012\u0018\n\u0014SOURCE_INCIDENT_SYNC\u0010\u0006\u0012\u000e\n\nSOURCE_ASR\u0010\u0007B)\n\u001acom.garmin.proto.generatedB\tGDICameraH\u0003"}, new Descriptors.FileDescriptor[]{GDICore.getDescriptor()});
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Camera_CapabilitiesRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Camera_CapabilitiesRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Camera_CapabilitiesResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Camera_CapabilitiesResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Camera_Capabilities_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Camera_Capabilities_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Camera_CaptureNotification_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Camera_CaptureNotification_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Camera_CaptureRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Camera_CaptureRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Camera_CaptureResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Camera_CaptureResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Camera_CaptureStatus_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Camera_CaptureStatus_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Camera_ConfigurationNotification_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Camera_ConfigurationNotification_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Camera_ConfigurationRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Camera_ConfigurationRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Camera_ConfigurationResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Camera_ConfigurationResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Camera_Configuration_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Camera_Configuration_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Camera_Service_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Camera_Service_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Camera_SnapshotNotification_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Camera_SnapshotNotification_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Camera_SnapshotRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Camera_SnapshotRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Camera_SnapshotResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Camera_SnapshotResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Camera_SnapshotStatus_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Camera_SnapshotStatus_fieldAccessorTable;

    public interface CapabilitiesOrBuilder extends MessageOrBuilder {
        ResolutionFramerate getSupportedResolutions(int i14);

        int getSupportedResolutionsCount();

        List<ResolutionFramerate> getSupportedResolutionsList();
    }

    public interface CapabilitiesRequestOrBuilder extends MessageOrBuilder {
    }

    public interface CapabilitiesResponseOrBuilder extends MessageOrBuilder {
        Capabilities getCapabilities();

        CapabilitiesOrBuilder getCapabilitiesOrBuilder();

        boolean hasCapabilities();
    }

    public interface CaptureNotificationOrBuilder extends MessageOrBuilder {
        CaptureStatus getCaptureStatus();

        CaptureStatusOrBuilder getCaptureStatusOrBuilder();

        boolean hasCaptureStatus();
    }

    public interface CaptureRequestOrBuilder extends MessageOrBuilder {
        CaptureRequest.CaptureControl getRecording();

        Source getSaveSource();

        boolean hasRecording();

        boolean hasSaveSource();
    }

    public interface CaptureResponseOrBuilder extends MessageOrBuilder {
        CaptureStatus getCaptureStatus();

        CaptureStatusOrBuilder getCaptureStatusOrBuilder();

        boolean hasCaptureStatus();
    }

    public interface CaptureStatusOrBuilder extends MessageOrBuilder {
        CaptureStatus.CaptureError getErrorStatus();

        Source getSaveSource();

        boolean getSavingStatus();

        boolean hasErrorStatus();

        boolean hasSaveSource();

        boolean hasSavingStatus();
    }

    public interface ConfigurationNotificationOrBuilder extends MessageOrBuilder {
        Configuration getConfig();

        ConfigurationOrBuilder getConfigOrBuilder();

        ConfigurationNotification.ReasonForChange getConfigurationChangeReason();

        boolean hasConfig();

        boolean hasConfigurationChangeReason();
    }

    public interface ConfigurationOrBuilder extends MessageOrBuilder {
        boolean getAudioRecordingEnabled();

        boolean getClosePassVideoSaveEnabled();

        Configuration.DateFormat getDateFormat();

        boolean getDatetimeOverlayEnabled();

        Configuration.Eis getEisMode();

        boolean getHardBrakeEventVideoSaveEnabled();

        boolean getLocationOverlayEnabled();

        boolean getNoiseSuppressionEnabled();

        Configuration.Orientation getOrientation();

        boolean getPromptlyDelete();

        boolean getProtectedLaneDetectionEnabled();

        boolean getRadarOverlayEnabled();

        boolean getRearviewMirrorEnabled();

        Configuration.RecordingMode getRecordingMode();

        ResolutionFramerate getResolutionFramerate();

        Configuration.SpeedFormat getSpeedFormat();

        boolean getSpeedOverlayEnabled();

        Configuration.TimeFormat getTimeFormat();

        boolean hasAudioRecordingEnabled();

        boolean hasClosePassVideoSaveEnabled();

        boolean hasDateFormat();

        boolean hasDatetimeOverlayEnabled();

        boolean hasEisMode();

        boolean hasHardBrakeEventVideoSaveEnabled();

        boolean hasLocationOverlayEnabled();

        boolean hasNoiseSuppressionEnabled();

        boolean hasOrientation();

        boolean hasPromptlyDelete();

        boolean hasProtectedLaneDetectionEnabled();

        boolean hasRadarOverlayEnabled();

        boolean hasRearviewMirrorEnabled();

        boolean hasRecordingMode();

        boolean hasResolutionFramerate();

        boolean hasSpeedFormat();

        boolean hasSpeedOverlayEnabled();

        boolean hasTimeFormat();
    }

    public interface ConfigurationRequestOrBuilder extends MessageOrBuilder {
        Configuration getConfig();

        ConfigurationOrBuilder getConfigOrBuilder();

        boolean hasConfig();
    }

    public interface ConfigurationResponseOrBuilder extends MessageOrBuilder {
        Configuration getConfig();

        ConfigurationOrBuilder getConfigOrBuilder();

        ConfigurationResponse.ConfigurationStatus getStatus();

        boolean hasConfig();

        boolean hasStatus();
    }

    public interface ServiceOrBuilder extends MessageOrBuilder {
        CaptureNotification getCaptureNotification();

        CaptureNotificationOrBuilder getCaptureNotificationOrBuilder();

        CaptureRequest getCaptureRequest();

        CaptureRequestOrBuilder getCaptureRequestOrBuilder();

        CaptureResponse getCaptureResponse();

        CaptureResponseOrBuilder getCaptureResponseOrBuilder();

        ConfigurationNotification getConfigNotification();

        ConfigurationNotificationOrBuilder getConfigNotificationOrBuilder();

        ConfigurationRequest getConfigRequest();

        ConfigurationRequestOrBuilder getConfigRequestOrBuilder();

        ConfigurationResponse getConfigResponse();

        ConfigurationResponseOrBuilder getConfigResponseOrBuilder();

        SnapshotNotification getSnapshotNotification();

        SnapshotNotificationOrBuilder getSnapshotNotificationOrBuilder();

        SnapshotRequest getSnapshotRequest();

        SnapshotRequestOrBuilder getSnapshotRequestOrBuilder();

        SnapshotResponse getSnapshotResponse();

        SnapshotResponseOrBuilder getSnapshotResponseOrBuilder();

        boolean hasCaptureNotification();

        boolean hasCaptureRequest();

        boolean hasCaptureResponse();

        boolean hasConfigNotification();

        boolean hasConfigRequest();

        boolean hasConfigResponse();

        boolean hasSnapshotNotification();

        boolean hasSnapshotRequest();

        boolean hasSnapshotResponse();
    }

    public interface SnapshotNotificationOrBuilder extends MessageOrBuilder {
        SnapshotStatus getSnapshotStatus();

        SnapshotStatusOrBuilder getSnapshotStatusOrBuilder();

        boolean hasSnapshotStatus();
    }

    public interface SnapshotRequestOrBuilder extends MessageOrBuilder {
        Source getSnapshotSource();

        boolean hasSnapshotSource();
    }

    public interface SnapshotResponseOrBuilder extends MessageOrBuilder {
        SnapshotStatus getSnapshotStatus();

        SnapshotStatusOrBuilder getSnapshotStatusOrBuilder();

        boolean hasSnapshotStatus();
    }

    public interface SnapshotStatusOrBuilder extends MessageOrBuilder {
        SnapshotStatus.SnapshotError getErrorStatus();

        Source getSnapshotSource();

        boolean getSnapshotStatus();

        boolean hasErrorStatus();

        boolean hasSnapshotSource();

        boolean hasSnapshotStatus();
    }

    static {
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_GDI_Proto_Camera_Service_descriptor = descriptor2;
        internal_static_GDI_Proto_Camera_Service_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"ConfigRequest", "ConfigResponse", "ConfigNotification", "CaptureRequest", "CaptureResponse", "CaptureNotification", "SnapshotRequest", "SnapshotResponse", "SnapshotNotification"});
        Descriptors.Descriptor descriptor3 = getDescriptor().getMessageTypes().get(1);
        internal_static_GDI_Proto_Camera_CapabilitiesRequest_descriptor = descriptor3;
        internal_static_GDI_Proto_Camera_CapabilitiesRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[0]);
        Descriptors.Descriptor descriptor4 = getDescriptor().getMessageTypes().get(2);
        internal_static_GDI_Proto_Camera_Capabilities_descriptor = descriptor4;
        internal_static_GDI_Proto_Camera_Capabilities_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[]{"SupportedResolutions"});
        Descriptors.Descriptor descriptor5 = getDescriptor().getMessageTypes().get(3);
        internal_static_GDI_Proto_Camera_CapabilitiesResponse_descriptor = descriptor5;
        internal_static_GDI_Proto_Camera_CapabilitiesResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor5, new String[]{"Capabilities"});
        Descriptors.Descriptor descriptor6 = getDescriptor().getMessageTypes().get(4);
        internal_static_GDI_Proto_Camera_Configuration_descriptor = descriptor6;
        internal_static_GDI_Proto_Camera_Configuration_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor6, new String[]{"AudioRecordingEnabled", "NoiseSuppressionEnabled", "EisMode", "SpeedOverlayEnabled", "SpeedFormat", "LocationOverlayEnabled", "DatetimeOverlayEnabled", "DateFormat", "TimeFormat", "ResolutionFramerate", "PromptlyDelete", "Orientation", "RecordingMode", "RadarOverlayEnabled", "HardBrakeEventVideoSaveEnabled", "RearviewMirrorEnabled", "ClosePassVideoSaveEnabled", "ProtectedLaneDetectionEnabled"});
        Descriptors.Descriptor descriptor7 = getDescriptor().getMessageTypes().get(5);
        internal_static_GDI_Proto_Camera_ConfigurationRequest_descriptor = descriptor7;
        internal_static_GDI_Proto_Camera_ConfigurationRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor7, new String[]{"Config"});
        Descriptors.Descriptor descriptor8 = getDescriptor().getMessageTypes().get(6);
        internal_static_GDI_Proto_Camera_ConfigurationResponse_descriptor = descriptor8;
        internal_static_GDI_Proto_Camera_ConfigurationResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor8, new String[]{"Status", "Config"});
        Descriptors.Descriptor descriptor9 = getDescriptor().getMessageTypes().get(7);
        internal_static_GDI_Proto_Camera_ConfigurationNotification_descriptor = descriptor9;
        internal_static_GDI_Proto_Camera_ConfigurationNotification_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor9, new String[]{"Config", "ConfigurationChangeReason"});
        Descriptors.Descriptor descriptor10 = getDescriptor().getMessageTypes().get(8);
        internal_static_GDI_Proto_Camera_CaptureStatus_descriptor = descriptor10;
        internal_static_GDI_Proto_Camera_CaptureStatus_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor10, new String[]{"SavingStatus", "SaveSource", "ErrorStatus"});
        Descriptors.Descriptor descriptor11 = getDescriptor().getMessageTypes().get(9);
        internal_static_GDI_Proto_Camera_CaptureRequest_descriptor = descriptor11;
        internal_static_GDI_Proto_Camera_CaptureRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor11, new String[]{"Recording", "SaveSource"});
        Descriptors.Descriptor descriptor12 = getDescriptor().getMessageTypes().get(10);
        internal_static_GDI_Proto_Camera_CaptureResponse_descriptor = descriptor12;
        internal_static_GDI_Proto_Camera_CaptureResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor12, new String[]{"CaptureStatus"});
        Descriptors.Descriptor descriptor13 = getDescriptor().getMessageTypes().get(11);
        internal_static_GDI_Proto_Camera_CaptureNotification_descriptor = descriptor13;
        internal_static_GDI_Proto_Camera_CaptureNotification_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor13, new String[]{"CaptureStatus"});
        Descriptors.Descriptor descriptor14 = getDescriptor().getMessageTypes().get(12);
        internal_static_GDI_Proto_Camera_SnapshotStatus_descriptor = descriptor14;
        internal_static_GDI_Proto_Camera_SnapshotStatus_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor14, new String[]{"SnapshotStatus", "SnapshotSource", "ErrorStatus"});
        Descriptors.Descriptor descriptor15 = getDescriptor().getMessageTypes().get(13);
        internal_static_GDI_Proto_Camera_SnapshotRequest_descriptor = descriptor15;
        internal_static_GDI_Proto_Camera_SnapshotRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor15, new String[]{"SnapshotSource"});
        Descriptors.Descriptor descriptor16 = getDescriptor().getMessageTypes().get(14);
        internal_static_GDI_Proto_Camera_SnapshotResponse_descriptor = descriptor16;
        internal_static_GDI_Proto_Camera_SnapshotResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor16, new String[]{"SnapshotStatus"});
        Descriptors.Descriptor descriptor17 = getDescriptor().getMessageTypes().get(15);
        internal_static_GDI_Proto_Camera_SnapshotNotification_descriptor = descriptor17;
        internal_static_GDI_Proto_Camera_SnapshotNotification_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor17, new String[]{"SnapshotStatus"});
        GDICore.getDescriptor();
    }

    private GDICamera() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.add(CapabilitiesRequest.featuresRequest);
        extensionRegistryLite.add(CapabilitiesResponse.featuresResponse);
    }

    public static final class CapabilitiesRequest extends GeneratedMessageV3 implements CapabilitiesRequestOrBuilder {
        public static final int FEATURES_REQUEST_FIELD_NUMBER = 30;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        private static final CapabilitiesRequest DEFAULT_INSTANCE = new CapabilitiesRequest();

        @Deprecated
        public static final Parser<CapabilitiesRequest> PARSER = new AbstractParser<CapabilitiesRequest>() { // from class: com.garmin.proto.generated.GDICamera.CapabilitiesRequest.1
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
            return GDICamera.internal_static_GDI_Proto_Camera_CapabilitiesRequest_descriptor;
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
            return GDICamera.internal_static_GDI_Proto_Camera_CapabilitiesRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(CapabilitiesRequest.class, Builder.class);
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
                return GDICamera.internal_static_GDI_Proto_Camera_CapabilitiesRequest_descriptor;
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
                return GDICamera.internal_static_GDI_Proto_Camera_CapabilitiesRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDICamera.internal_static_GDI_Proto_Camera_CapabilitiesRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(CapabilitiesRequest.class, Builder.class);
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

    public static final class Capabilities extends GeneratedMessageV3 implements CapabilitiesOrBuilder {
        public static final int SUPPORTED_RESOLUTIONS_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        private List<Integer> supportedResolutions_;
        private static final Internal.ListAdapter.Converter<Integer, ResolutionFramerate> supportedResolutions_converter_ = new Internal.ListAdapter.Converter<Integer, ResolutionFramerate>() { // from class: com.garmin.proto.generated.GDICamera.Capabilities.1
            @Override // com.google.protobuf.Internal.ListAdapter.Converter
            public ResolutionFramerate convert(Integer num) {
                ResolutionFramerate resolutionFramerateForNumber = ResolutionFramerate.forNumber(num.intValue());
                return resolutionFramerateForNumber == null ? ResolutionFramerate.RESOLUTION_FRAMERATE_UNKNOWN : resolutionFramerateForNumber;
            }
        };
        private static final Capabilities DEFAULT_INSTANCE = new Capabilities();

        @Deprecated
        public static final Parser<Capabilities> PARSER = new AbstractParser<Capabilities>() { // from class: com.garmin.proto.generated.GDICamera.Capabilities.2
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

        private Capabilities() {
            this.memoizedIsInitialized = (byte) -1;
            this.supportedResolutions_ = Collections.EMPTY_LIST;
        }

        public static Capabilities getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDICamera.internal_static_GDI_Proto_Camera_Capabilities_descriptor;
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
            return this.supportedResolutions_.equals(capabilities.supportedResolutions_) && getUnknownFields().equals(capabilities.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<Capabilities> getParserForType() {
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
                int size = this.supportedResolutions_.size();
                List<Integer> list = this.supportedResolutions_;
                if (i15 >= size) {
                    int serializedSize = getUnknownFields().getSerializedSize() + list.size() + iA;
                    this.memoizedSize = serializedSize;
                    return serializedSize;
                }
                iA = f3.a(iA, list.get(i15));
                i15++;
            }
        }

        @Override // com.garmin.proto.generated.GDICamera.CapabilitiesOrBuilder
        public ResolutionFramerate getSupportedResolutions(int i14) {
            return supportedResolutions_converter_.convert(this.supportedResolutions_.get(i14));
        }

        @Override // com.garmin.proto.generated.GDICamera.CapabilitiesOrBuilder
        public int getSupportedResolutionsCount() {
            return this.supportedResolutions_.size();
        }

        @Override // com.garmin.proto.generated.GDICamera.CapabilitiesOrBuilder
        public List<ResolutionFramerate> getSupportedResolutionsList() {
            return new Internal.ListAdapter(this.supportedResolutions_, supportedResolutions_converter_);
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (getSupportedResolutionsCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + this.supportedResolutions_.hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDICamera.internal_static_GDI_Proto_Camera_Capabilities_fieldAccessorTable.ensureFieldAccessorsInitialized(Capabilities.class, Builder.class);
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
            int iF = 0;
            while (iF < this.supportedResolutions_.size()) {
                iF = f3.f(this.supportedResolutions_.get(iF), codedOutputStream, 1, iF, 1);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CapabilitiesOrBuilder {
            private int bitField0_;
            private List<Integer> supportedResolutions_;

            private Builder() {
                this.supportedResolutions_ = Collections.EMPTY_LIST;
            }

            private void buildPartial0(Capabilities capabilities) {
            }

            private void buildPartialRepeatedFields(Capabilities capabilities) {
                if ((this.bitField0_ & 1) != 0) {
                    this.supportedResolutions_ = Collections.unmodifiableList(this.supportedResolutions_);
                    this.bitField0_ &= -2;
                }
                capabilities.supportedResolutions_ = this.supportedResolutions_;
            }

            private void ensureSupportedResolutionsIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.supportedResolutions_ = new ArrayList(this.supportedResolutions_);
                    this.bitField0_ |= 1;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDICamera.internal_static_GDI_Proto_Camera_Capabilities_descriptor;
            }

            public Builder addAllSupportedResolutions(Iterable<? extends ResolutionFramerate> iterable) {
                ensureSupportedResolutionsIsMutable();
                Iterator<? extends ResolutionFramerate> it = iterable.iterator();
                while (it.hasNext()) {
                    this.supportedResolutions_.add(Integer.valueOf(it.next().getNumber()));
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            public Builder addSupportedResolutions(ResolutionFramerate resolutionFramerate) {
                resolutionFramerate.getClass();
                ensureSupportedResolutionsIsMutable();
                this.supportedResolutions_.add(Integer.valueOf(resolutionFramerate.getNumber()));
                onChanged();
                return this;
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
                buildPartialRepeatedFields(capabilities);
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
                this.supportedResolutions_ = Collections.EMPTY_LIST;
                this.bitField0_ = 0;
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

            public Builder clearSupportedResolutions() {
                this.supportedResolutions_ = Collections.EMPTY_LIST;
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
                return GDICamera.internal_static_GDI_Proto_Camera_Capabilities_descriptor;
            }

            @Override // com.garmin.proto.generated.GDICamera.CapabilitiesOrBuilder
            public ResolutionFramerate getSupportedResolutions(int i14) {
                return (ResolutionFramerate) Capabilities.supportedResolutions_converter_.convert(this.supportedResolutions_.get(i14));
            }

            @Override // com.garmin.proto.generated.GDICamera.CapabilitiesOrBuilder
            public int getSupportedResolutionsCount() {
                return this.supportedResolutions_.size();
            }

            @Override // com.garmin.proto.generated.GDICamera.CapabilitiesOrBuilder
            public List<ResolutionFramerate> getSupportedResolutionsList() {
                return new Internal.ListAdapter(this.supportedResolutions_, Capabilities.supportedResolutions_converter_);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDICamera.internal_static_GDI_Proto_Camera_Capabilities_fieldAccessorTable.ensureFieldAccessorsInitialized(Capabilities.class, Builder.class);
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
                                    if (ResolutionFramerate.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        ensureSupportedResolutionsIsMutable();
                                        this.supportedResolutions_.add(Integer.valueOf(i14));
                                    }
                                } else if (tag == 10) {
                                    int iPushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                    while (codedInputStream.getBytesUntilLimit() > 0) {
                                        int i15 = codedInputStream.readEnum();
                                        if (ResolutionFramerate.forNumber(i15) == null) {
                                            mergeUnknownVarintField(1, i15);
                                        } else {
                                            ensureSupportedResolutionsIsMutable();
                                            this.supportedResolutions_.add(Integer.valueOf(i15));
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

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setSupportedResolutions(int i14, ResolutionFramerate resolutionFramerate) {
                resolutionFramerate.getClass();
                ensureSupportedResolutionsIsMutable();
                this.supportedResolutions_.set(i14, Integer.valueOf(resolutionFramerate.getNumber()));
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public Capabilities getDefaultInstanceForType() {
                return Capabilities.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.supportedResolutions_ = Collections.EMPTY_LIST;
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
                if (!capabilities.supportedResolutions_.isEmpty()) {
                    if (this.supportedResolutions_.isEmpty()) {
                        this.supportedResolutions_ = capabilities.supportedResolutions_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureSupportedResolutionsIsMutable();
                        this.supportedResolutions_.addAll(capabilities.supportedResolutions_);
                    }
                    onChanged();
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

        private Capabilities(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
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

        public /* synthetic */ Capabilities(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static Capabilities parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static Capabilities parseFrom(InputStream inputStream) {
            return (Capabilities) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static Capabilities parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Capabilities) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Capabilities parseFrom(CodedInputStream codedInputStream) {
            return (Capabilities) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static Capabilities parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Capabilities) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class CapabilitiesResponse extends GeneratedMessageV3 implements CapabilitiesResponseOrBuilder {
        public static final int CAPABILITIES_FIELD_NUMBER = 1;
        public static final int FEATURES_RESPONSE_FIELD_NUMBER = 30;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private Capabilities capabilities_;
        private byte memoizedIsInitialized;
        private static final CapabilitiesResponse DEFAULT_INSTANCE = new CapabilitiesResponse();

        @Deprecated
        public static final Parser<CapabilitiesResponse> PARSER = new AbstractParser<CapabilitiesResponse>() { // from class: com.garmin.proto.generated.GDICamera.CapabilitiesResponse.1
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
            return GDICamera.internal_static_GDI_Proto_Camera_CapabilitiesResponse_descriptor;
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

        @Override // com.garmin.proto.generated.GDICamera.CapabilitiesResponseOrBuilder
        public Capabilities getCapabilities() {
            Capabilities capabilities = this.capabilities_;
            return capabilities == null ? Capabilities.getDefaultInstance() : capabilities;
        }

        @Override // com.garmin.proto.generated.GDICamera.CapabilitiesResponseOrBuilder
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

        @Override // com.garmin.proto.generated.GDICamera.CapabilitiesResponseOrBuilder
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
            return GDICamera.internal_static_GDI_Proto_Camera_CapabilitiesResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(CapabilitiesResponse.class, Builder.class);
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
                return GDICamera.internal_static_GDI_Proto_Camera_CapabilitiesResponse_descriptor;
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

            @Override // com.garmin.proto.generated.GDICamera.CapabilitiesResponseOrBuilder
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

            @Override // com.garmin.proto.generated.GDICamera.CapabilitiesResponseOrBuilder
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
                return GDICamera.internal_static_GDI_Proto_Camera_CapabilitiesResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDICamera.CapabilitiesResponseOrBuilder
            public boolean hasCapabilities() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDICamera.internal_static_GDI_Proto_Camera_CapabilitiesResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(CapabilitiesResponse.class, Builder.class);
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

    public static final class CaptureNotification extends GeneratedMessageV3 implements CaptureNotificationOrBuilder {
        public static final int CAPTURE_STATUS_FIELD_NUMBER = 1;
        private static final CaptureNotification DEFAULT_INSTANCE = new CaptureNotification();

        @Deprecated
        public static final Parser<CaptureNotification> PARSER = new AbstractParser<CaptureNotification>() { // from class: com.garmin.proto.generated.GDICamera.CaptureNotification.1
            @Override // com.google.protobuf.Parser
            public CaptureNotification parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = CaptureNotification.newBuilder();
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
        private CaptureStatus captureStatus_;
        private byte memoizedIsInitialized;

        private CaptureNotification(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static CaptureNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDICamera.internal_static_GDI_Proto_Camera_CaptureNotification_descriptor;
        }

        public static Builder newBuilder(CaptureNotification captureNotification) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(captureNotification);
        }

        public static CaptureNotification parseDelimitedFrom(InputStream inputStream) {
            return (CaptureNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static CaptureNotification parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<CaptureNotification> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CaptureNotification)) {
                return super.equals(obj);
            }
            CaptureNotification captureNotification = (CaptureNotification) obj;
            if (hasCaptureStatus() != captureNotification.hasCaptureStatus()) {
                return false;
            }
            return (!hasCaptureStatus() || getCaptureStatus().equals(captureNotification.getCaptureStatus())) && getUnknownFields().equals(captureNotification.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDICamera.CaptureNotificationOrBuilder
        public CaptureStatus getCaptureStatus() {
            CaptureStatus captureStatus = this.captureStatus_;
            return captureStatus == null ? CaptureStatus.getDefaultInstance() : captureStatus;
        }

        @Override // com.garmin.proto.generated.GDICamera.CaptureNotificationOrBuilder
        public CaptureStatusOrBuilder getCaptureStatusOrBuilder() {
            CaptureStatus captureStatus = this.captureStatus_;
            return captureStatus == null ? CaptureStatus.getDefaultInstance() : captureStatus;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<CaptureNotification> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getCaptureStatus()) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDICamera.CaptureNotificationOrBuilder
        public boolean hasCaptureStatus() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasCaptureStatus()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getCaptureStatus().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDICamera.internal_static_GDI_Proto_Camera_CaptureNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(CaptureNotification.class, Builder.class);
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
            return new CaptureNotification();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getCaptureStatus());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CaptureNotificationOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<CaptureStatus, CaptureStatus.Builder, CaptureStatusOrBuilder> captureStatusBuilder_;
            private CaptureStatus captureStatus_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(CaptureNotification captureNotification) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    SingleFieldBuilderV3<CaptureStatus, CaptureStatus.Builder, CaptureStatusOrBuilder> singleFieldBuilderV3 = this.captureStatusBuilder_;
                    captureNotification.captureStatus_ = singleFieldBuilderV3 == null ? this.captureStatus_ : (CaptureStatus) singleFieldBuilderV3.build();
                } else {
                    i14 = 0;
                }
                captureNotification.bitField0_ |= i14;
            }

            private SingleFieldBuilderV3<CaptureStatus, CaptureStatus.Builder, CaptureStatusOrBuilder> getCaptureStatusFieldBuilder() {
                if (this.captureStatusBuilder_ == null) {
                    this.captureStatusBuilder_ = new SingleFieldBuilderV3<>(getCaptureStatus(), getParentForChildren(), isClean());
                    this.captureStatus_ = null;
                }
                return this.captureStatusBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDICamera.internal_static_GDI_Proto_Camera_CaptureNotification_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getCaptureStatusFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public CaptureNotification build() {
                CaptureNotification captureNotificationBuildPartial = buildPartial();
                if (captureNotificationBuildPartial.isInitialized()) {
                    return captureNotificationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) captureNotificationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public CaptureNotification buildPartial() {
                CaptureNotification captureNotification = new CaptureNotification(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(captureNotification);
                }
                onBuilt();
                return captureNotification;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.captureStatus_ = null;
                SingleFieldBuilderV3<CaptureStatus, CaptureStatus.Builder, CaptureStatusOrBuilder> singleFieldBuilderV3 = this.captureStatusBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.captureStatusBuilder_ = null;
                }
                return this;
            }

            public Builder clearCaptureStatus() {
                this.bitField0_ &= -2;
                this.captureStatus_ = null;
                SingleFieldBuilderV3<CaptureStatus, CaptureStatus.Builder, CaptureStatusOrBuilder> singleFieldBuilderV3 = this.captureStatusBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.captureStatusBuilder_ = null;
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

            @Override // com.garmin.proto.generated.GDICamera.CaptureNotificationOrBuilder
            public CaptureStatus getCaptureStatus() {
                SingleFieldBuilderV3<CaptureStatus, CaptureStatus.Builder, CaptureStatusOrBuilder> singleFieldBuilderV3 = this.captureStatusBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (CaptureStatus) singleFieldBuilderV3.getMessage();
                }
                CaptureStatus captureStatus = this.captureStatus_;
                return captureStatus == null ? CaptureStatus.getDefaultInstance() : captureStatus;
            }

            public CaptureStatus.Builder getCaptureStatusBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (CaptureStatus.Builder) getCaptureStatusFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDICamera.CaptureNotificationOrBuilder
            public CaptureStatusOrBuilder getCaptureStatusOrBuilder() {
                SingleFieldBuilderV3<CaptureStatus, CaptureStatus.Builder, CaptureStatusOrBuilder> singleFieldBuilderV3 = this.captureStatusBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (CaptureStatusOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                CaptureStatus captureStatus = this.captureStatus_;
                return captureStatus == null ? CaptureStatus.getDefaultInstance() : captureStatus;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDICamera.internal_static_GDI_Proto_Camera_CaptureNotification_descriptor;
            }

            @Override // com.garmin.proto.generated.GDICamera.CaptureNotificationOrBuilder
            public boolean hasCaptureStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDICamera.internal_static_GDI_Proto_Camera_CaptureNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(CaptureNotification.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeCaptureStatus(CaptureStatus captureStatus) {
                CaptureStatus captureStatus2;
                SingleFieldBuilderV3<CaptureStatus, CaptureStatus.Builder, CaptureStatusOrBuilder> singleFieldBuilderV3 = this.captureStatusBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(captureStatus);
                } else if ((this.bitField0_ & 1) == 0 || (captureStatus2 = this.captureStatus_) == null || captureStatus2 == CaptureStatus.getDefaultInstance()) {
                    this.captureStatus_ = captureStatus;
                } else {
                    getCaptureStatusBuilder().mergeFrom(captureStatus);
                }
                if (this.captureStatus_ != null) {
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
                                    codedInputStream.readMessage(getCaptureStatusFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder setCaptureStatus(CaptureStatus.Builder builder) {
                SingleFieldBuilderV3<CaptureStatus, CaptureStatus.Builder, CaptureStatusOrBuilder> singleFieldBuilderV3 = this.captureStatusBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.captureStatus_ = builder.build();
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
            public CaptureNotification getDefaultInstanceForType() {
                return CaptureNotification.getDefaultInstance();
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

            public Builder setCaptureStatus(CaptureStatus captureStatus) {
                SingleFieldBuilderV3<CaptureStatus, CaptureStatus.Builder, CaptureStatusOrBuilder> singleFieldBuilderV3 = this.captureStatusBuilder_;
                if (singleFieldBuilderV3 == null) {
                    captureStatus.getClass();
                    this.captureStatus_ = captureStatus;
                } else {
                    singleFieldBuilderV3.setMessage(captureStatus);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof CaptureNotification) {
                    return mergeFrom((CaptureNotification) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(CaptureNotification captureNotification) {
                if (captureNotification == CaptureNotification.getDefaultInstance()) {
                    return this;
                }
                if (captureNotification.hasCaptureStatus()) {
                    mergeCaptureStatus(captureNotification.getCaptureStatus());
                }
                mergeUnknownFields(captureNotification.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public CaptureNotification getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ CaptureNotification(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private CaptureNotification() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static CaptureNotification parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CaptureNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CaptureNotification parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static CaptureNotification parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static CaptureNotification parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CaptureNotification parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static CaptureNotification parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CaptureNotification parseFrom(InputStream inputStream) {
            return (CaptureNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static CaptureNotification parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CaptureNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CaptureNotification parseFrom(CodedInputStream codedInputStream) {
            return (CaptureNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static CaptureNotification parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CaptureNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class CaptureRequest extends GeneratedMessageV3 implements CaptureRequestOrBuilder {
        private static final CaptureRequest DEFAULT_INSTANCE = new CaptureRequest();

        @Deprecated
        public static final Parser<CaptureRequest> PARSER = new AbstractParser<CaptureRequest>() { // from class: com.garmin.proto.generated.GDICamera.CaptureRequest.1
            @Override // com.google.protobuf.Parser
            public CaptureRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = CaptureRequest.newBuilder();
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
        public static final int RECORDING_FIELD_NUMBER = 1;
        public static final int SAVE_SOURCE_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int recording_;
        private int saveSource_;

        private CaptureRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.recording_ = 0;
            this.saveSource_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static CaptureRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDICamera.internal_static_GDI_Proto_Camera_CaptureRequest_descriptor;
        }

        public static Builder newBuilder(CaptureRequest captureRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(captureRequest);
        }

        public static CaptureRequest parseDelimitedFrom(InputStream inputStream) {
            return (CaptureRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static CaptureRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<CaptureRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CaptureRequest)) {
                return super.equals(obj);
            }
            CaptureRequest captureRequest = (CaptureRequest) obj;
            if (hasRecording() != captureRequest.hasRecording()) {
                return false;
            }
            if ((!hasRecording() || this.recording_ == captureRequest.recording_) && hasSaveSource() == captureRequest.hasSaveSource()) {
                return (!hasSaveSource() || this.saveSource_ == captureRequest.saveSource_) && getUnknownFields().equals(captureRequest.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<CaptureRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDICamera.CaptureRequestOrBuilder
        public CaptureControl getRecording() {
            CaptureControl captureControlForNumber = CaptureControl.forNumber(this.recording_);
            return captureControlForNumber == null ? CaptureControl.CAPTURE_CONTROL_UNKNOWN : captureControlForNumber;
        }

        @Override // com.garmin.proto.generated.GDICamera.CaptureRequestOrBuilder
        public Source getSaveSource() {
            Source sourceForNumber = Source.forNumber(this.saveSource_);
            return sourceForNumber == null ? Source.SOURCE_UNKNOWN : sourceForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeEnumSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.recording_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeEnumSize += CodedOutputStream.computeEnumSize(2, this.saveSource_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeEnumSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDICamera.CaptureRequestOrBuilder
        public boolean hasRecording() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDICamera.CaptureRequestOrBuilder
        public boolean hasSaveSource() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasRecording()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + this.recording_;
            }
            if (hasSaveSource()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + this.saveSource_;
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDICamera.internal_static_GDI_Proto_Camera_CaptureRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(CaptureRequest.class, Builder.class);
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
            return new CaptureRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeEnum(1, this.recording_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeEnum(2, this.saveSource_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CaptureRequestOrBuilder {
            private int bitField0_;
            private int recording_;
            private int saveSource_;

            private Builder() {
                this.recording_ = 0;
                this.saveSource_ = 0;
            }

            private void buildPartial0(CaptureRequest captureRequest) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    captureRequest.recording_ = this.recording_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    captureRequest.saveSource_ = this.saveSource_;
                    i14 |= 2;
                }
                captureRequest.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDICamera.internal_static_GDI_Proto_Camera_CaptureRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public CaptureRequest build() {
                CaptureRequest captureRequestBuildPartial = buildPartial();
                if (captureRequestBuildPartial.isInitialized()) {
                    return captureRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) captureRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public CaptureRequest buildPartial() {
                CaptureRequest captureRequest = new CaptureRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(captureRequest);
                }
                onBuilt();
                return captureRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.recording_ = 0;
                this.saveSource_ = 0;
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

            public Builder clearRecording() {
                this.bitField0_ &= -2;
                this.recording_ = 0;
                onChanged();
                return this;
            }

            public Builder clearSaveSource() {
                this.bitField0_ &= -3;
                this.saveSource_ = 0;
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
                return GDICamera.internal_static_GDI_Proto_Camera_CaptureRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDICamera.CaptureRequestOrBuilder
            public CaptureControl getRecording() {
                CaptureControl captureControlForNumber = CaptureControl.forNumber(this.recording_);
                return captureControlForNumber == null ? CaptureControl.CAPTURE_CONTROL_UNKNOWN : captureControlForNumber;
            }

            @Override // com.garmin.proto.generated.GDICamera.CaptureRequestOrBuilder
            public Source getSaveSource() {
                Source sourceForNumber = Source.forNumber(this.saveSource_);
                return sourceForNumber == null ? Source.SOURCE_UNKNOWN : sourceForNumber;
            }

            @Override // com.garmin.proto.generated.GDICamera.CaptureRequestOrBuilder
            public boolean hasRecording() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDICamera.CaptureRequestOrBuilder
            public boolean hasSaveSource() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDICamera.internal_static_GDI_Proto_Camera_CaptureRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(CaptureRequest.class, Builder.class);
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
                                    if (CaptureControl.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        this.recording_ = i14;
                                        this.bitField0_ |= 1;
                                    }
                                } else if (tag == 16) {
                                    int i15 = codedInputStream.readEnum();
                                    if (Source.forNumber(i15) == null) {
                                        mergeUnknownVarintField(2, i15);
                                    } else {
                                        this.saveSource_ = i15;
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

            public Builder setRecording(CaptureControl captureControl) {
                captureControl.getClass();
                this.bitField0_ |= 1;
                this.recording_ = captureControl.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setSaveSource(Source source) {
                source.getClass();
                this.bitField0_ |= 2;
                this.saveSource_ = source.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public CaptureRequest getDefaultInstanceForType() {
                return CaptureRequest.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.recording_ = 0;
                this.saveSource_ = 0;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof CaptureRequest) {
                    return mergeFrom((CaptureRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(CaptureRequest captureRequest) {
                if (captureRequest == CaptureRequest.getDefaultInstance()) {
                    return this;
                }
                if (captureRequest.hasRecording()) {
                    setRecording(captureRequest.getRecording());
                }
                if (captureRequest.hasSaveSource()) {
                    setSaveSource(captureRequest.getSaveSource());
                }
                mergeUnknownFields(captureRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public CaptureRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static CaptureRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CaptureRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CaptureRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static CaptureRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static CaptureRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public /* synthetic */ CaptureRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static CaptureRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        private CaptureRequest() {
            this.memoizedIsInitialized = (byte) -1;
            this.recording_ = 0;
            this.saveSource_ = 0;
        }

        public static CaptureRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CaptureRequest parseFrom(InputStream inputStream) {
            return (CaptureRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static CaptureRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CaptureRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CaptureRequest parseFrom(CodedInputStream codedInputStream) {
            return (CaptureRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static CaptureRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CaptureRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum CaptureControl implements ProtocolMessageEnum {
            CAPTURE_CONTROL_UNKNOWN(0),
            CAPTURE_CONTROL_STOP(1),
            CAPTURE_CONTROL_START(2);

            public static final int CAPTURE_CONTROL_START_VALUE = 2;
            public static final int CAPTURE_CONTROL_STOP_VALUE = 1;
            public static final int CAPTURE_CONTROL_UNKNOWN_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<CaptureControl> internalValueMap = new Internal.EnumLiteMap<CaptureControl>() { // from class: com.garmin.proto.generated.GDICamera.CaptureRequest.CaptureControl.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public CaptureControl findValueByNumber(int i14) {
                    return CaptureControl.forNumber(i14);
                }
            };
            private static final CaptureControl[] VALUES = values();

            CaptureControl(int i14) {
                this.value = i14;
            }

            public static CaptureControl forNumber(int i14) {
                if (i14 == 0) {
                    return CAPTURE_CONTROL_UNKNOWN;
                }
                if (i14 == 1) {
                    return CAPTURE_CONTROL_STOP;
                }
                if (i14 != 2) {
                    return null;
                }
                return CAPTURE_CONTROL_START;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return CaptureRequest.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<CaptureControl> internalGetValueMap() {
                return internalValueMap;
            }

            public static CaptureControl valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static CaptureControl valueOf(int i14) {
                return forNumber(i14);
            }
        }
    }

    public static final class CaptureResponse extends GeneratedMessageV3 implements CaptureResponseOrBuilder {
        public static final int CAPTURE_STATUS_FIELD_NUMBER = 1;
        private static final CaptureResponse DEFAULT_INSTANCE = new CaptureResponse();

        @Deprecated
        public static final Parser<CaptureResponse> PARSER = new AbstractParser<CaptureResponse>() { // from class: com.garmin.proto.generated.GDICamera.CaptureResponse.1
            @Override // com.google.protobuf.Parser
            public CaptureResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = CaptureResponse.newBuilder();
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
        private CaptureStatus captureStatus_;
        private byte memoizedIsInitialized;

        private CaptureResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static CaptureResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDICamera.internal_static_GDI_Proto_Camera_CaptureResponse_descriptor;
        }

        public static Builder newBuilder(CaptureResponse captureResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(captureResponse);
        }

        public static CaptureResponse parseDelimitedFrom(InputStream inputStream) {
            return (CaptureResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static CaptureResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<CaptureResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CaptureResponse)) {
                return super.equals(obj);
            }
            CaptureResponse captureResponse = (CaptureResponse) obj;
            if (hasCaptureStatus() != captureResponse.hasCaptureStatus()) {
                return false;
            }
            return (!hasCaptureStatus() || getCaptureStatus().equals(captureResponse.getCaptureStatus())) && getUnknownFields().equals(captureResponse.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDICamera.CaptureResponseOrBuilder
        public CaptureStatus getCaptureStatus() {
            CaptureStatus captureStatus = this.captureStatus_;
            return captureStatus == null ? CaptureStatus.getDefaultInstance() : captureStatus;
        }

        @Override // com.garmin.proto.generated.GDICamera.CaptureResponseOrBuilder
        public CaptureStatusOrBuilder getCaptureStatusOrBuilder() {
            CaptureStatus captureStatus = this.captureStatus_;
            return captureStatus == null ? CaptureStatus.getDefaultInstance() : captureStatus;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<CaptureResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getCaptureStatus()) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDICamera.CaptureResponseOrBuilder
        public boolean hasCaptureStatus() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasCaptureStatus()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getCaptureStatus().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDICamera.internal_static_GDI_Proto_Camera_CaptureResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(CaptureResponse.class, Builder.class);
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
            return new CaptureResponse();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getCaptureStatus());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CaptureResponseOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<CaptureStatus, CaptureStatus.Builder, CaptureStatusOrBuilder> captureStatusBuilder_;
            private CaptureStatus captureStatus_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(CaptureResponse captureResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    SingleFieldBuilderV3<CaptureStatus, CaptureStatus.Builder, CaptureStatusOrBuilder> singleFieldBuilderV3 = this.captureStatusBuilder_;
                    captureResponse.captureStatus_ = singleFieldBuilderV3 == null ? this.captureStatus_ : (CaptureStatus) singleFieldBuilderV3.build();
                } else {
                    i14 = 0;
                }
                captureResponse.bitField0_ |= i14;
            }

            private SingleFieldBuilderV3<CaptureStatus, CaptureStatus.Builder, CaptureStatusOrBuilder> getCaptureStatusFieldBuilder() {
                if (this.captureStatusBuilder_ == null) {
                    this.captureStatusBuilder_ = new SingleFieldBuilderV3<>(getCaptureStatus(), getParentForChildren(), isClean());
                    this.captureStatus_ = null;
                }
                return this.captureStatusBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDICamera.internal_static_GDI_Proto_Camera_CaptureResponse_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getCaptureStatusFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public CaptureResponse build() {
                CaptureResponse captureResponseBuildPartial = buildPartial();
                if (captureResponseBuildPartial.isInitialized()) {
                    return captureResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) captureResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public CaptureResponse buildPartial() {
                CaptureResponse captureResponse = new CaptureResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(captureResponse);
                }
                onBuilt();
                return captureResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.captureStatus_ = null;
                SingleFieldBuilderV3<CaptureStatus, CaptureStatus.Builder, CaptureStatusOrBuilder> singleFieldBuilderV3 = this.captureStatusBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.captureStatusBuilder_ = null;
                }
                return this;
            }

            public Builder clearCaptureStatus() {
                this.bitField0_ &= -2;
                this.captureStatus_ = null;
                SingleFieldBuilderV3<CaptureStatus, CaptureStatus.Builder, CaptureStatusOrBuilder> singleFieldBuilderV3 = this.captureStatusBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.captureStatusBuilder_ = null;
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

            @Override // com.garmin.proto.generated.GDICamera.CaptureResponseOrBuilder
            public CaptureStatus getCaptureStatus() {
                SingleFieldBuilderV3<CaptureStatus, CaptureStatus.Builder, CaptureStatusOrBuilder> singleFieldBuilderV3 = this.captureStatusBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (CaptureStatus) singleFieldBuilderV3.getMessage();
                }
                CaptureStatus captureStatus = this.captureStatus_;
                return captureStatus == null ? CaptureStatus.getDefaultInstance() : captureStatus;
            }

            public CaptureStatus.Builder getCaptureStatusBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (CaptureStatus.Builder) getCaptureStatusFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDICamera.CaptureResponseOrBuilder
            public CaptureStatusOrBuilder getCaptureStatusOrBuilder() {
                SingleFieldBuilderV3<CaptureStatus, CaptureStatus.Builder, CaptureStatusOrBuilder> singleFieldBuilderV3 = this.captureStatusBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (CaptureStatusOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                CaptureStatus captureStatus = this.captureStatus_;
                return captureStatus == null ? CaptureStatus.getDefaultInstance() : captureStatus;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDICamera.internal_static_GDI_Proto_Camera_CaptureResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDICamera.CaptureResponseOrBuilder
            public boolean hasCaptureStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDICamera.internal_static_GDI_Proto_Camera_CaptureResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(CaptureResponse.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeCaptureStatus(CaptureStatus captureStatus) {
                CaptureStatus captureStatus2;
                SingleFieldBuilderV3<CaptureStatus, CaptureStatus.Builder, CaptureStatusOrBuilder> singleFieldBuilderV3 = this.captureStatusBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(captureStatus);
                } else if ((this.bitField0_ & 1) == 0 || (captureStatus2 = this.captureStatus_) == null || captureStatus2 == CaptureStatus.getDefaultInstance()) {
                    this.captureStatus_ = captureStatus;
                } else {
                    getCaptureStatusBuilder().mergeFrom(captureStatus);
                }
                if (this.captureStatus_ != null) {
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
                                    codedInputStream.readMessage(getCaptureStatusFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder setCaptureStatus(CaptureStatus.Builder builder) {
                SingleFieldBuilderV3<CaptureStatus, CaptureStatus.Builder, CaptureStatusOrBuilder> singleFieldBuilderV3 = this.captureStatusBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.captureStatus_ = builder.build();
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
            public CaptureResponse getDefaultInstanceForType() {
                return CaptureResponse.getDefaultInstance();
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

            public Builder setCaptureStatus(CaptureStatus captureStatus) {
                SingleFieldBuilderV3<CaptureStatus, CaptureStatus.Builder, CaptureStatusOrBuilder> singleFieldBuilderV3 = this.captureStatusBuilder_;
                if (singleFieldBuilderV3 == null) {
                    captureStatus.getClass();
                    this.captureStatus_ = captureStatus;
                } else {
                    singleFieldBuilderV3.setMessage(captureStatus);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof CaptureResponse) {
                    return mergeFrom((CaptureResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(CaptureResponse captureResponse) {
                if (captureResponse == CaptureResponse.getDefaultInstance()) {
                    return this;
                }
                if (captureResponse.hasCaptureStatus()) {
                    mergeCaptureStatus(captureResponse.getCaptureStatus());
                }
                mergeUnknownFields(captureResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public CaptureResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ CaptureResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private CaptureResponse() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static CaptureResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CaptureResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CaptureResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static CaptureResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static CaptureResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CaptureResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static CaptureResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CaptureResponse parseFrom(InputStream inputStream) {
            return (CaptureResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static CaptureResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CaptureResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CaptureResponse parseFrom(CodedInputStream codedInputStream) {
            return (CaptureResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static CaptureResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CaptureResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class CaptureStatus extends GeneratedMessageV3 implements CaptureStatusOrBuilder {
        public static final int ERROR_STATUS_FIELD_NUMBER = 3;
        public static final int SAVE_SOURCE_FIELD_NUMBER = 2;
        public static final int SAVING_STATUS_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int errorStatus_;
        private byte memoizedIsInitialized;
        private int saveSource_;
        private boolean savingStatus_;
        private static final CaptureStatus DEFAULT_INSTANCE = new CaptureStatus();

        @Deprecated
        public static final Parser<CaptureStatus> PARSER = new AbstractParser<CaptureStatus>() { // from class: com.garmin.proto.generated.GDICamera.CaptureStatus.1
            @Override // com.google.protobuf.Parser
            public CaptureStatus parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = CaptureStatus.newBuilder();
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

        private CaptureStatus(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.savingStatus_ = false;
            this.saveSource_ = 0;
            this.errorStatus_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static CaptureStatus getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDICamera.internal_static_GDI_Proto_Camera_CaptureStatus_descriptor;
        }

        public static Builder newBuilder(CaptureStatus captureStatus) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(captureStatus);
        }

        public static CaptureStatus parseDelimitedFrom(InputStream inputStream) {
            return (CaptureStatus) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static CaptureStatus parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<CaptureStatus> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CaptureStatus)) {
                return super.equals(obj);
            }
            CaptureStatus captureStatus = (CaptureStatus) obj;
            if (hasSavingStatus() != captureStatus.hasSavingStatus()) {
                return false;
            }
            if ((hasSavingStatus() && getSavingStatus() != captureStatus.getSavingStatus()) || hasSaveSource() != captureStatus.hasSaveSource()) {
                return false;
            }
            if ((!hasSaveSource() || this.saveSource_ == captureStatus.saveSource_) && hasErrorStatus() == captureStatus.hasErrorStatus()) {
                return (!hasErrorStatus() || this.errorStatus_ == captureStatus.errorStatus_) && getUnknownFields().equals(captureStatus.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDICamera.CaptureStatusOrBuilder
        public CaptureError getErrorStatus() {
            CaptureError captureErrorForNumber = CaptureError.forNumber(this.errorStatus_);
            return captureErrorForNumber == null ? CaptureError.CAPTURE_ERROR_UNKNOWN : captureErrorForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<CaptureStatus> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDICamera.CaptureStatusOrBuilder
        public Source getSaveSource() {
            Source sourceForNumber = Source.forNumber(this.saveSource_);
            return sourceForNumber == null ? Source.SOURCE_UNKNOWN : sourceForNumber;
        }

        @Override // com.garmin.proto.generated.GDICamera.CaptureStatusOrBuilder
        public boolean getSavingStatus() {
            return this.savingStatus_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeBoolSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeBoolSize(1, this.savingStatus_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeBoolSize += CodedOutputStream.computeEnumSize(2, this.saveSource_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeBoolSize += CodedOutputStream.computeEnumSize(3, this.errorStatus_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeBoolSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDICamera.CaptureStatusOrBuilder
        public boolean hasErrorStatus() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDICamera.CaptureStatusOrBuilder
        public boolean hasSaveSource() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDICamera.CaptureStatusOrBuilder
        public boolean hasSavingStatus() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasSavingStatus()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + Internal.hashBoolean(getSavingStatus());
            }
            if (hasSaveSource()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + this.saveSource_;
            }
            if (hasErrorStatus()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + this.errorStatus_;
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDICamera.internal_static_GDI_Proto_Camera_CaptureStatus_fieldAccessorTable.ensureFieldAccessorsInitialized(CaptureStatus.class, Builder.class);
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
            return new CaptureStatus();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeBool(1, this.savingStatus_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeEnum(2, this.saveSource_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeEnum(3, this.errorStatus_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CaptureStatusOrBuilder {
            private int bitField0_;
            private int errorStatus_;
            private int saveSource_;
            private boolean savingStatus_;

            private Builder() {
                this.saveSource_ = 0;
                this.errorStatus_ = 0;
            }

            private void buildPartial0(CaptureStatus captureStatus) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    captureStatus.savingStatus_ = this.savingStatus_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    captureStatus.saveSource_ = this.saveSource_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    captureStatus.errorStatus_ = this.errorStatus_;
                    i14 |= 4;
                }
                captureStatus.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDICamera.internal_static_GDI_Proto_Camera_CaptureStatus_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public CaptureStatus build() {
                CaptureStatus captureStatusBuildPartial = buildPartial();
                if (captureStatusBuildPartial.isInitialized()) {
                    return captureStatusBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) captureStatusBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public CaptureStatus buildPartial() {
                CaptureStatus captureStatus = new CaptureStatus(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(captureStatus);
                }
                onBuilt();
                return captureStatus;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.savingStatus_ = false;
                this.saveSource_ = 0;
                this.errorStatus_ = 0;
                return this;
            }

            public Builder clearErrorStatus() {
                this.bitField0_ &= -5;
                this.errorStatus_ = 0;
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

            public Builder clearSaveSource() {
                this.bitField0_ &= -3;
                this.saveSource_ = 0;
                onChanged();
                return this;
            }

            public Builder clearSavingStatus() {
                this.bitField0_ &= -2;
                this.savingStatus_ = false;
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
                return GDICamera.internal_static_GDI_Proto_Camera_CaptureStatus_descriptor;
            }

            @Override // com.garmin.proto.generated.GDICamera.CaptureStatusOrBuilder
            public CaptureError getErrorStatus() {
                CaptureError captureErrorForNumber = CaptureError.forNumber(this.errorStatus_);
                return captureErrorForNumber == null ? CaptureError.CAPTURE_ERROR_UNKNOWN : captureErrorForNumber;
            }

            @Override // com.garmin.proto.generated.GDICamera.CaptureStatusOrBuilder
            public Source getSaveSource() {
                Source sourceForNumber = Source.forNumber(this.saveSource_);
                return sourceForNumber == null ? Source.SOURCE_UNKNOWN : sourceForNumber;
            }

            @Override // com.garmin.proto.generated.GDICamera.CaptureStatusOrBuilder
            public boolean getSavingStatus() {
                return this.savingStatus_;
            }

            @Override // com.garmin.proto.generated.GDICamera.CaptureStatusOrBuilder
            public boolean hasErrorStatus() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDICamera.CaptureStatusOrBuilder
            public boolean hasSaveSource() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDICamera.CaptureStatusOrBuilder
            public boolean hasSavingStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDICamera.internal_static_GDI_Proto_Camera_CaptureStatus_fieldAccessorTable.ensureFieldAccessorsInitialized(CaptureStatus.class, Builder.class);
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
                                    this.savingStatus_ = codedInputStream.readBool();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    int i14 = codedInputStream.readEnum();
                                    if (Source.forNumber(i14) == null) {
                                        mergeUnknownVarintField(2, i14);
                                    } else {
                                        this.saveSource_ = i14;
                                        this.bitField0_ |= 2;
                                    }
                                } else if (tag == 24) {
                                    int i15 = codedInputStream.readEnum();
                                    if (CaptureError.forNumber(i15) == null) {
                                        mergeUnknownVarintField(3, i15);
                                    } else {
                                        this.errorStatus_ = i15;
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

            public Builder setErrorStatus(CaptureError captureError) {
                captureError.getClass();
                this.bitField0_ |= 4;
                this.errorStatus_ = captureError.getNumber();
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

            public Builder setSaveSource(Source source) {
                source.getClass();
                this.bitField0_ |= 2;
                this.saveSource_ = source.getNumber();
                onChanged();
                return this;
            }

            public Builder setSavingStatus(boolean z14) {
                this.savingStatus_ = z14;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public CaptureStatus getDefaultInstanceForType() {
                return CaptureStatus.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.saveSource_ = 0;
                this.errorStatus_ = 0;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof CaptureStatus) {
                    return mergeFrom((CaptureStatus) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(CaptureStatus captureStatus) {
                if (captureStatus == CaptureStatus.getDefaultInstance()) {
                    return this;
                }
                if (captureStatus.hasSavingStatus()) {
                    setSavingStatus(captureStatus.getSavingStatus());
                }
                if (captureStatus.hasSaveSource()) {
                    setSaveSource(captureStatus.getSaveSource());
                }
                if (captureStatus.hasErrorStatus()) {
                    setErrorStatus(captureStatus.getErrorStatus());
                }
                mergeUnknownFields(captureStatus.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public CaptureStatus getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static CaptureStatus parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CaptureStatus) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CaptureStatus parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static CaptureStatus parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static CaptureStatus parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CaptureStatus parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static CaptureStatus parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public /* synthetic */ CaptureStatus(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static CaptureStatus parseFrom(InputStream inputStream) {
            return (CaptureStatus) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        private CaptureStatus() {
            this.savingStatus_ = false;
            this.memoizedIsInitialized = (byte) -1;
            this.saveSource_ = 0;
            this.errorStatus_ = 0;
        }

        public static CaptureStatus parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CaptureStatus) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CaptureStatus parseFrom(CodedInputStream codedInputStream) {
            return (CaptureStatus) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static CaptureStatus parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CaptureStatus) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum CaptureError implements ProtocolMessageEnum {
            CAPTURE_ERROR_UNKNOWN(0),
            CAPTURE_ERROR_SD_ERROR(1),
            CAPTURE_ERROR_CAMERA_BUSY(2),
            CAPTURE_ERROR_BAD_STATE(3);

            public static final int CAPTURE_ERROR_BAD_STATE_VALUE = 3;
            public static final int CAPTURE_ERROR_CAMERA_BUSY_VALUE = 2;
            public static final int CAPTURE_ERROR_SD_ERROR_VALUE = 1;
            public static final int CAPTURE_ERROR_UNKNOWN_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<CaptureError> internalValueMap = new Internal.EnumLiteMap<CaptureError>() { // from class: com.garmin.proto.generated.GDICamera.CaptureStatus.CaptureError.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public CaptureError findValueByNumber(int i14) {
                    return CaptureError.forNumber(i14);
                }
            };
            private static final CaptureError[] VALUES = values();

            CaptureError(int i14) {
                this.value = i14;
            }

            public static CaptureError forNumber(int i14) {
                if (i14 == 0) {
                    return CAPTURE_ERROR_UNKNOWN;
                }
                if (i14 == 1) {
                    return CAPTURE_ERROR_SD_ERROR;
                }
                if (i14 == 2) {
                    return CAPTURE_ERROR_CAMERA_BUSY;
                }
                if (i14 != 3) {
                    return null;
                }
                return CAPTURE_ERROR_BAD_STATE;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return CaptureStatus.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<CaptureError> internalGetValueMap() {
                return internalValueMap;
            }

            public static CaptureError valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static CaptureError valueOf(int i14) {
                return forNumber(i14);
            }
        }
    }

    public static final class Configuration extends GeneratedMessageV3 implements ConfigurationOrBuilder {
        public static final int AUDIO_RECORDING_ENABLED_FIELD_NUMBER = 1;
        public static final int CLOSE_PASS_VIDEO_SAVE_ENABLED_FIELD_NUMBER = 17;
        public static final int DATETIME_OVERLAY_ENABLED_FIELD_NUMBER = 7;
        public static final int DATE_FORMAT_FIELD_NUMBER = 8;
        public static final int EIS_MODE_FIELD_NUMBER = 3;
        public static final int HARD_BRAKE_EVENT_VIDEO_SAVE_ENABLED_FIELD_NUMBER = 15;
        public static final int LOCATION_OVERLAY_ENABLED_FIELD_NUMBER = 6;
        public static final int NOISE_SUPPRESSION_ENABLED_FIELD_NUMBER = 2;
        public static final int ORIENTATION_FIELD_NUMBER = 12;
        public static final int PROMPTLY_DELETE_FIELD_NUMBER = 11;
        public static final int PROTECTED_LANE_DETECTION_ENABLED_FIELD_NUMBER = 18;
        public static final int RADAR_OVERLAY_ENABLED_FIELD_NUMBER = 14;
        public static final int REARVIEW_MIRROR_ENABLED_FIELD_NUMBER = 16;
        public static final int RECORDING_MODE_FIELD_NUMBER = 13;
        public static final int RESOLUTION_FRAMERATE_FIELD_NUMBER = 10;
        public static final int SPEED_FORMAT_FIELD_NUMBER = 5;
        public static final int SPEED_OVERLAY_ENABLED_FIELD_NUMBER = 4;
        public static final int TIME_FORMAT_FIELD_NUMBER = 9;
        private static final long serialVersionUID = 0;
        private boolean audioRecordingEnabled_;
        private int bitField0_;
        private boolean closePassVideoSaveEnabled_;
        private int dateFormat_;
        private boolean datetimeOverlayEnabled_;
        private int eisMode_;
        private boolean hardBrakeEventVideoSaveEnabled_;
        private boolean locationOverlayEnabled_;
        private byte memoizedIsInitialized;
        private boolean noiseSuppressionEnabled_;
        private int orientation_;
        private boolean promptlyDelete_;
        private boolean protectedLaneDetectionEnabled_;
        private boolean radarOverlayEnabled_;
        private boolean rearviewMirrorEnabled_;
        private int recordingMode_;
        private int resolutionFramerate_;
        private int speedFormat_;
        private boolean speedOverlayEnabled_;
        private int timeFormat_;
        private static final Configuration DEFAULT_INSTANCE = new Configuration();

        @Deprecated
        public static final Parser<Configuration> PARSER = new AbstractParser<Configuration>() { // from class: com.garmin.proto.generated.GDICamera.Configuration.1
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
            this.audioRecordingEnabled_ = false;
            this.noiseSuppressionEnabled_ = false;
            this.eisMode_ = 0;
            this.speedOverlayEnabled_ = false;
            this.speedFormat_ = 0;
            this.locationOverlayEnabled_ = false;
            this.datetimeOverlayEnabled_ = false;
            this.dateFormat_ = 0;
            this.timeFormat_ = 0;
            this.resolutionFramerate_ = 0;
            this.promptlyDelete_ = false;
            this.orientation_ = 0;
            this.recordingMode_ = 0;
            this.radarOverlayEnabled_ = false;
            this.hardBrakeEventVideoSaveEnabled_ = false;
            this.rearviewMirrorEnabled_ = false;
            this.closePassVideoSaveEnabled_ = false;
            this.protectedLaneDetectionEnabled_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Configuration getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDICamera.internal_static_GDI_Proto_Camera_Configuration_descriptor;
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
            if (hasAudioRecordingEnabled() != configuration.hasAudioRecordingEnabled()) {
                return false;
            }
            if ((hasAudioRecordingEnabled() && getAudioRecordingEnabled() != configuration.getAudioRecordingEnabled()) || hasNoiseSuppressionEnabled() != configuration.hasNoiseSuppressionEnabled()) {
                return false;
            }
            if ((hasNoiseSuppressionEnabled() && getNoiseSuppressionEnabled() != configuration.getNoiseSuppressionEnabled()) || hasEisMode() != configuration.hasEisMode()) {
                return false;
            }
            if ((hasEisMode() && this.eisMode_ != configuration.eisMode_) || hasSpeedOverlayEnabled() != configuration.hasSpeedOverlayEnabled()) {
                return false;
            }
            if ((hasSpeedOverlayEnabled() && getSpeedOverlayEnabled() != configuration.getSpeedOverlayEnabled()) || hasSpeedFormat() != configuration.hasSpeedFormat()) {
                return false;
            }
            if ((hasSpeedFormat() && this.speedFormat_ != configuration.speedFormat_) || hasLocationOverlayEnabled() != configuration.hasLocationOverlayEnabled()) {
                return false;
            }
            if ((hasLocationOverlayEnabled() && getLocationOverlayEnabled() != configuration.getLocationOverlayEnabled()) || hasDatetimeOverlayEnabled() != configuration.hasDatetimeOverlayEnabled()) {
                return false;
            }
            if ((hasDatetimeOverlayEnabled() && getDatetimeOverlayEnabled() != configuration.getDatetimeOverlayEnabled()) || hasDateFormat() != configuration.hasDateFormat()) {
                return false;
            }
            if ((hasDateFormat() && this.dateFormat_ != configuration.dateFormat_) || hasTimeFormat() != configuration.hasTimeFormat()) {
                return false;
            }
            if ((hasTimeFormat() && this.timeFormat_ != configuration.timeFormat_) || hasResolutionFramerate() != configuration.hasResolutionFramerate()) {
                return false;
            }
            if ((hasResolutionFramerate() && this.resolutionFramerate_ != configuration.resolutionFramerate_) || hasPromptlyDelete() != configuration.hasPromptlyDelete()) {
                return false;
            }
            if ((hasPromptlyDelete() && getPromptlyDelete() != configuration.getPromptlyDelete()) || hasOrientation() != configuration.hasOrientation()) {
                return false;
            }
            if ((hasOrientation() && this.orientation_ != configuration.orientation_) || hasRecordingMode() != configuration.hasRecordingMode()) {
                return false;
            }
            if ((hasRecordingMode() && this.recordingMode_ != configuration.recordingMode_) || hasRadarOverlayEnabled() != configuration.hasRadarOverlayEnabled()) {
                return false;
            }
            if ((hasRadarOverlayEnabled() && getRadarOverlayEnabled() != configuration.getRadarOverlayEnabled()) || hasHardBrakeEventVideoSaveEnabled() != configuration.hasHardBrakeEventVideoSaveEnabled()) {
                return false;
            }
            if ((hasHardBrakeEventVideoSaveEnabled() && getHardBrakeEventVideoSaveEnabled() != configuration.getHardBrakeEventVideoSaveEnabled()) || hasRearviewMirrorEnabled() != configuration.hasRearviewMirrorEnabled()) {
                return false;
            }
            if ((hasRearviewMirrorEnabled() && getRearviewMirrorEnabled() != configuration.getRearviewMirrorEnabled()) || hasClosePassVideoSaveEnabled() != configuration.hasClosePassVideoSaveEnabled()) {
                return false;
            }
            if ((!hasClosePassVideoSaveEnabled() || getClosePassVideoSaveEnabled() == configuration.getClosePassVideoSaveEnabled()) && hasProtectedLaneDetectionEnabled() == configuration.hasProtectedLaneDetectionEnabled()) {
                return (!hasProtectedLaneDetectionEnabled() || getProtectedLaneDetectionEnabled() == configuration.getProtectedLaneDetectionEnabled()) && getUnknownFields().equals(configuration.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDICamera.ConfigurationOrBuilder
        public boolean getAudioRecordingEnabled() {
            return this.audioRecordingEnabled_;
        }

        @Override // com.garmin.proto.generated.GDICamera.ConfigurationOrBuilder
        public boolean getClosePassVideoSaveEnabled() {
            return this.closePassVideoSaveEnabled_;
        }

        @Override // com.garmin.proto.generated.GDICamera.ConfigurationOrBuilder
        public DateFormat getDateFormat() {
            DateFormat dateFormatForNumber = DateFormat.forNumber(this.dateFormat_);
            return dateFormatForNumber == null ? DateFormat.DATE_FORMAT_UNKNOWN : dateFormatForNumber;
        }

        @Override // com.garmin.proto.generated.GDICamera.ConfigurationOrBuilder
        public boolean getDatetimeOverlayEnabled() {
            return this.datetimeOverlayEnabled_;
        }

        @Override // com.garmin.proto.generated.GDICamera.ConfigurationOrBuilder
        public Eis getEisMode() {
            Eis eisForNumber = Eis.forNumber(this.eisMode_);
            return eisForNumber == null ? Eis.EIS_UNKNOWN : eisForNumber;
        }

        @Override // com.garmin.proto.generated.GDICamera.ConfigurationOrBuilder
        public boolean getHardBrakeEventVideoSaveEnabled() {
            return this.hardBrakeEventVideoSaveEnabled_;
        }

        @Override // com.garmin.proto.generated.GDICamera.ConfigurationOrBuilder
        public boolean getLocationOverlayEnabled() {
            return this.locationOverlayEnabled_;
        }

        @Override // com.garmin.proto.generated.GDICamera.ConfigurationOrBuilder
        public boolean getNoiseSuppressionEnabled() {
            return this.noiseSuppressionEnabled_;
        }

        @Override // com.garmin.proto.generated.GDICamera.ConfigurationOrBuilder
        public Orientation getOrientation() {
            Orientation orientationForNumber = Orientation.forNumber(this.orientation_);
            return orientationForNumber == null ? Orientation.ORIENTATION_UNKNOWN : orientationForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<Configuration> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDICamera.ConfigurationOrBuilder
        public boolean getPromptlyDelete() {
            return this.promptlyDelete_;
        }

        @Override // com.garmin.proto.generated.GDICamera.ConfigurationOrBuilder
        public boolean getProtectedLaneDetectionEnabled() {
            return this.protectedLaneDetectionEnabled_;
        }

        @Override // com.garmin.proto.generated.GDICamera.ConfigurationOrBuilder
        public boolean getRadarOverlayEnabled() {
            return this.radarOverlayEnabled_;
        }

        @Override // com.garmin.proto.generated.GDICamera.ConfigurationOrBuilder
        public boolean getRearviewMirrorEnabled() {
            return this.rearviewMirrorEnabled_;
        }

        @Override // com.garmin.proto.generated.GDICamera.ConfigurationOrBuilder
        public RecordingMode getRecordingMode() {
            RecordingMode recordingModeForNumber = RecordingMode.forNumber(this.recordingMode_);
            return recordingModeForNumber == null ? RecordingMode.RECORDING_MODE_UNKNOWN : recordingModeForNumber;
        }

        @Override // com.garmin.proto.generated.GDICamera.ConfigurationOrBuilder
        public ResolutionFramerate getResolutionFramerate() {
            ResolutionFramerate resolutionFramerateForNumber = ResolutionFramerate.forNumber(this.resolutionFramerate_);
            return resolutionFramerateForNumber == null ? ResolutionFramerate.RESOLUTION_FRAMERATE_UNKNOWN : resolutionFramerateForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeBoolSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeBoolSize(1, this.audioRecordingEnabled_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeBoolSize += CodedOutputStream.computeBoolSize(2, this.noiseSuppressionEnabled_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeBoolSize += CodedOutputStream.computeEnumSize(3, this.eisMode_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeBoolSize += CodedOutputStream.computeBoolSize(4, this.speedOverlayEnabled_);
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeBoolSize += CodedOutputStream.computeEnumSize(5, this.speedFormat_);
            }
            if ((this.bitField0_ & 32) != 0) {
                iComputeBoolSize += CodedOutputStream.computeBoolSize(6, this.locationOverlayEnabled_);
            }
            if ((this.bitField0_ & 64) != 0) {
                iComputeBoolSize += CodedOutputStream.computeBoolSize(7, this.datetimeOverlayEnabled_);
            }
            if ((this.bitField0_ & 128) != 0) {
                iComputeBoolSize += CodedOutputStream.computeEnumSize(8, this.dateFormat_);
            }
            if ((this.bitField0_ & 256) != 0) {
                iComputeBoolSize += CodedOutputStream.computeEnumSize(9, this.timeFormat_);
            }
            if ((this.bitField0_ & 512) != 0) {
                iComputeBoolSize += CodedOutputStream.computeEnumSize(10, this.resolutionFramerate_);
            }
            if ((this.bitField0_ & 1024) != 0) {
                iComputeBoolSize += CodedOutputStream.computeBoolSize(11, this.promptlyDelete_);
            }
            if ((this.bitField0_ & 2048) != 0) {
                iComputeBoolSize += CodedOutputStream.computeEnumSize(12, this.orientation_);
            }
            if ((this.bitField0_ & 4096) != 0) {
                iComputeBoolSize += CodedOutputStream.computeEnumSize(13, this.recordingMode_);
            }
            if ((this.bitField0_ & 8192) != 0) {
                iComputeBoolSize += CodedOutputStream.computeBoolSize(14, this.radarOverlayEnabled_);
            }
            if ((this.bitField0_ & 16384) != 0) {
                iComputeBoolSize += CodedOutputStream.computeBoolSize(15, this.hardBrakeEventVideoSaveEnabled_);
            }
            if ((this.bitField0_ & 32768) != 0) {
                iComputeBoolSize += CodedOutputStream.computeBoolSize(16, this.rearviewMirrorEnabled_);
            }
            if ((this.bitField0_ & 65536) != 0) {
                iComputeBoolSize += CodedOutputStream.computeBoolSize(17, this.closePassVideoSaveEnabled_);
            }
            if ((this.bitField0_ & 131072) != 0) {
                iComputeBoolSize += CodedOutputStream.computeBoolSize(18, this.protectedLaneDetectionEnabled_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeBoolSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDICamera.ConfigurationOrBuilder
        public SpeedFormat getSpeedFormat() {
            SpeedFormat speedFormatForNumber = SpeedFormat.forNumber(this.speedFormat_);
            return speedFormatForNumber == null ? SpeedFormat.SPEED_FORMAT_UNKNOWN : speedFormatForNumber;
        }

        @Override // com.garmin.proto.generated.GDICamera.ConfigurationOrBuilder
        public boolean getSpeedOverlayEnabled() {
            return this.speedOverlayEnabled_;
        }

        @Override // com.garmin.proto.generated.GDICamera.ConfigurationOrBuilder
        public TimeFormat getTimeFormat() {
            TimeFormat timeFormatForNumber = TimeFormat.forNumber(this.timeFormat_);
            return timeFormatForNumber == null ? TimeFormat.TIME_FORMAT_UNKNOWN : timeFormatForNumber;
        }

        @Override // com.garmin.proto.generated.GDICamera.ConfigurationOrBuilder
        public boolean hasAudioRecordingEnabled() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDICamera.ConfigurationOrBuilder
        public boolean hasClosePassVideoSaveEnabled() {
            return (this.bitField0_ & 65536) != 0;
        }

        @Override // com.garmin.proto.generated.GDICamera.ConfigurationOrBuilder
        public boolean hasDateFormat() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.garmin.proto.generated.GDICamera.ConfigurationOrBuilder
        public boolean hasDatetimeOverlayEnabled() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.garmin.proto.generated.GDICamera.ConfigurationOrBuilder
        public boolean hasEisMode() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDICamera.ConfigurationOrBuilder
        public boolean hasHardBrakeEventVideoSaveEnabled() {
            return (this.bitField0_ & 16384) != 0;
        }

        @Override // com.garmin.proto.generated.GDICamera.ConfigurationOrBuilder
        public boolean hasLocationOverlayEnabled() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.garmin.proto.generated.GDICamera.ConfigurationOrBuilder
        public boolean hasNoiseSuppressionEnabled() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDICamera.ConfigurationOrBuilder
        public boolean hasOrientation() {
            return (this.bitField0_ & 2048) != 0;
        }

        @Override // com.garmin.proto.generated.GDICamera.ConfigurationOrBuilder
        public boolean hasPromptlyDelete() {
            return (this.bitField0_ & 1024) != 0;
        }

        @Override // com.garmin.proto.generated.GDICamera.ConfigurationOrBuilder
        public boolean hasProtectedLaneDetectionEnabled() {
            return (this.bitField0_ & 131072) != 0;
        }

        @Override // com.garmin.proto.generated.GDICamera.ConfigurationOrBuilder
        public boolean hasRadarOverlayEnabled() {
            return (this.bitField0_ & 8192) != 0;
        }

        @Override // com.garmin.proto.generated.GDICamera.ConfigurationOrBuilder
        public boolean hasRearviewMirrorEnabled() {
            return (this.bitField0_ & 32768) != 0;
        }

        @Override // com.garmin.proto.generated.GDICamera.ConfigurationOrBuilder
        public boolean hasRecordingMode() {
            return (this.bitField0_ & 4096) != 0;
        }

        @Override // com.garmin.proto.generated.GDICamera.ConfigurationOrBuilder
        public boolean hasResolutionFramerate() {
            return (this.bitField0_ & 512) != 0;
        }

        @Override // com.garmin.proto.generated.GDICamera.ConfigurationOrBuilder
        public boolean hasSpeedFormat() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.garmin.proto.generated.GDICamera.ConfigurationOrBuilder
        public boolean hasSpeedOverlayEnabled() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDICamera.ConfigurationOrBuilder
        public boolean hasTimeFormat() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasAudioRecordingEnabled()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + Internal.hashBoolean(getAudioRecordingEnabled());
            }
            if (hasNoiseSuppressionEnabled()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + Internal.hashBoolean(getNoiseSuppressionEnabled());
            }
            if (hasEisMode()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + this.eisMode_;
            }
            if (hasSpeedOverlayEnabled()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + Internal.hashBoolean(getSpeedOverlayEnabled());
            }
            if (hasSpeedFormat()) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + this.speedFormat_;
            }
            if (hasLocationOverlayEnabled()) {
                iHashCode = e5.c(iHashCode, 37, 6, 53) + Internal.hashBoolean(getLocationOverlayEnabled());
            }
            if (hasDatetimeOverlayEnabled()) {
                iHashCode = e5.c(iHashCode, 37, 7, 53) + Internal.hashBoolean(getDatetimeOverlayEnabled());
            }
            if (hasDateFormat()) {
                iHashCode = e5.c(iHashCode, 37, 8, 53) + this.dateFormat_;
            }
            if (hasTimeFormat()) {
                iHashCode = e5.c(iHashCode, 37, 9, 53) + this.timeFormat_;
            }
            if (hasResolutionFramerate()) {
                iHashCode = e5.c(iHashCode, 37, 10, 53) + this.resolutionFramerate_;
            }
            if (hasPromptlyDelete()) {
                iHashCode = e5.c(iHashCode, 37, 11, 53) + Internal.hashBoolean(getPromptlyDelete());
            }
            if (hasOrientation()) {
                iHashCode = e5.c(iHashCode, 37, 12, 53) + this.orientation_;
            }
            if (hasRecordingMode()) {
                iHashCode = e5.c(iHashCode, 37, 13, 53) + this.recordingMode_;
            }
            if (hasRadarOverlayEnabled()) {
                iHashCode = e5.c(iHashCode, 37, 14, 53) + Internal.hashBoolean(getRadarOverlayEnabled());
            }
            if (hasHardBrakeEventVideoSaveEnabled()) {
                iHashCode = e5.c(iHashCode, 37, 15, 53) + Internal.hashBoolean(getHardBrakeEventVideoSaveEnabled());
            }
            if (hasRearviewMirrorEnabled()) {
                iHashCode = e5.c(iHashCode, 37, 16, 53) + Internal.hashBoolean(getRearviewMirrorEnabled());
            }
            if (hasClosePassVideoSaveEnabled()) {
                iHashCode = e5.c(iHashCode, 37, 17, 53) + Internal.hashBoolean(getClosePassVideoSaveEnabled());
            }
            if (hasProtectedLaneDetectionEnabled()) {
                iHashCode = e5.c(iHashCode, 37, 18, 53) + Internal.hashBoolean(getProtectedLaneDetectionEnabled());
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDICamera.internal_static_GDI_Proto_Camera_Configuration_fieldAccessorTable.ensureFieldAccessorsInitialized(Configuration.class, Builder.class);
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
                codedOutputStream.writeBool(1, this.audioRecordingEnabled_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeBool(2, this.noiseSuppressionEnabled_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeEnum(3, this.eisMode_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeBool(4, this.speedOverlayEnabled_);
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeEnum(5, this.speedFormat_);
            }
            if ((this.bitField0_ & 32) != 0) {
                codedOutputStream.writeBool(6, this.locationOverlayEnabled_);
            }
            if ((this.bitField0_ & 64) != 0) {
                codedOutputStream.writeBool(7, this.datetimeOverlayEnabled_);
            }
            if ((this.bitField0_ & 128) != 0) {
                codedOutputStream.writeEnum(8, this.dateFormat_);
            }
            if ((this.bitField0_ & 256) != 0) {
                codedOutputStream.writeEnum(9, this.timeFormat_);
            }
            if ((this.bitField0_ & 512) != 0) {
                codedOutputStream.writeEnum(10, this.resolutionFramerate_);
            }
            if ((this.bitField0_ & 1024) != 0) {
                codedOutputStream.writeBool(11, this.promptlyDelete_);
            }
            if ((this.bitField0_ & 2048) != 0) {
                codedOutputStream.writeEnum(12, this.orientation_);
            }
            if ((this.bitField0_ & 4096) != 0) {
                codedOutputStream.writeEnum(13, this.recordingMode_);
            }
            if ((this.bitField0_ & 8192) != 0) {
                codedOutputStream.writeBool(14, this.radarOverlayEnabled_);
            }
            if ((this.bitField0_ & 16384) != 0) {
                codedOutputStream.writeBool(15, this.hardBrakeEventVideoSaveEnabled_);
            }
            if ((this.bitField0_ & 32768) != 0) {
                codedOutputStream.writeBool(16, this.rearviewMirrorEnabled_);
            }
            if ((this.bitField0_ & 65536) != 0) {
                codedOutputStream.writeBool(17, this.closePassVideoSaveEnabled_);
            }
            if ((this.bitField0_ & 131072) != 0) {
                codedOutputStream.writeBool(18, this.protectedLaneDetectionEnabled_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ConfigurationOrBuilder {
            private boolean audioRecordingEnabled_;
            private int bitField0_;
            private boolean closePassVideoSaveEnabled_;
            private int dateFormat_;
            private boolean datetimeOverlayEnabled_;
            private int eisMode_;
            private boolean hardBrakeEventVideoSaveEnabled_;
            private boolean locationOverlayEnabled_;
            private boolean noiseSuppressionEnabled_;
            private int orientation_;
            private boolean promptlyDelete_;
            private boolean protectedLaneDetectionEnabled_;
            private boolean radarOverlayEnabled_;
            private boolean rearviewMirrorEnabled_;
            private int recordingMode_;
            private int resolutionFramerate_;
            private int speedFormat_;
            private boolean speedOverlayEnabled_;
            private int timeFormat_;

            private Builder() {
                this.eisMode_ = 0;
                this.speedFormat_ = 0;
                this.dateFormat_ = 0;
                this.timeFormat_ = 0;
                this.resolutionFramerate_ = 0;
                this.orientation_ = 0;
                this.recordingMode_ = 0;
            }

            private void buildPartial0(Configuration configuration) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    configuration.audioRecordingEnabled_ = this.audioRecordingEnabled_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    configuration.noiseSuppressionEnabled_ = this.noiseSuppressionEnabled_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    configuration.eisMode_ = this.eisMode_;
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    configuration.speedOverlayEnabled_ = this.speedOverlayEnabled_;
                    i14 |= 8;
                }
                if ((i15 & 16) != 0) {
                    configuration.speedFormat_ = this.speedFormat_;
                    i14 |= 16;
                }
                if ((i15 & 32) != 0) {
                    configuration.locationOverlayEnabled_ = this.locationOverlayEnabled_;
                    i14 |= 32;
                }
                if ((i15 & 64) != 0) {
                    configuration.datetimeOverlayEnabled_ = this.datetimeOverlayEnabled_;
                    i14 |= 64;
                }
                if ((i15 & 128) != 0) {
                    configuration.dateFormat_ = this.dateFormat_;
                    i14 |= 128;
                }
                if ((i15 & 256) != 0) {
                    configuration.timeFormat_ = this.timeFormat_;
                    i14 |= 256;
                }
                if ((i15 & 512) != 0) {
                    configuration.resolutionFramerate_ = this.resolutionFramerate_;
                    i14 |= 512;
                }
                if ((i15 & 1024) != 0) {
                    configuration.promptlyDelete_ = this.promptlyDelete_;
                    i14 |= 1024;
                }
                if ((i15 & 2048) != 0) {
                    configuration.orientation_ = this.orientation_;
                    i14 |= 2048;
                }
                if ((i15 & 4096) != 0) {
                    configuration.recordingMode_ = this.recordingMode_;
                    i14 |= 4096;
                }
                if ((i15 & 8192) != 0) {
                    configuration.radarOverlayEnabled_ = this.radarOverlayEnabled_;
                    i14 |= 8192;
                }
                if ((i15 & 16384) != 0) {
                    configuration.hardBrakeEventVideoSaveEnabled_ = this.hardBrakeEventVideoSaveEnabled_;
                    i14 |= 16384;
                }
                if ((i15 & 32768) != 0) {
                    configuration.rearviewMirrorEnabled_ = this.rearviewMirrorEnabled_;
                    i14 |= 32768;
                }
                if ((i15 & 65536) != 0) {
                    configuration.closePassVideoSaveEnabled_ = this.closePassVideoSaveEnabled_;
                    i14 |= 65536;
                }
                if ((i15 & 131072) != 0) {
                    configuration.protectedLaneDetectionEnabled_ = this.protectedLaneDetectionEnabled_;
                    i14 |= 131072;
                }
                configuration.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDICamera.internal_static_GDI_Proto_Camera_Configuration_descriptor;
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
                this.audioRecordingEnabled_ = false;
                this.noiseSuppressionEnabled_ = false;
                this.eisMode_ = 0;
                this.speedOverlayEnabled_ = false;
                this.speedFormat_ = 0;
                this.locationOverlayEnabled_ = false;
                this.datetimeOverlayEnabled_ = false;
                this.dateFormat_ = 0;
                this.timeFormat_ = 0;
                this.resolutionFramerate_ = 0;
                this.promptlyDelete_ = false;
                this.orientation_ = 0;
                this.recordingMode_ = 0;
                this.radarOverlayEnabled_ = false;
                this.hardBrakeEventVideoSaveEnabled_ = false;
                this.rearviewMirrorEnabled_ = false;
                this.closePassVideoSaveEnabled_ = false;
                this.protectedLaneDetectionEnabled_ = false;
                return this;
            }

            public Builder clearAudioRecordingEnabled() {
                this.bitField0_ &= -2;
                this.audioRecordingEnabled_ = false;
                onChanged();
                return this;
            }

            public Builder clearClosePassVideoSaveEnabled() {
                this.bitField0_ &= -65537;
                this.closePassVideoSaveEnabled_ = false;
                onChanged();
                return this;
            }

            public Builder clearDateFormat() {
                this.bitField0_ &= -129;
                this.dateFormat_ = 0;
                onChanged();
                return this;
            }

            public Builder clearDatetimeOverlayEnabled() {
                this.bitField0_ &= -65;
                this.datetimeOverlayEnabled_ = false;
                onChanged();
                return this;
            }

            public Builder clearEisMode() {
                this.bitField0_ &= -5;
                this.eisMode_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearHardBrakeEventVideoSaveEnabled() {
                this.bitField0_ &= -16385;
                this.hardBrakeEventVideoSaveEnabled_ = false;
                onChanged();
                return this;
            }

            public Builder clearLocationOverlayEnabled() {
                this.bitField0_ &= -33;
                this.locationOverlayEnabled_ = false;
                onChanged();
                return this;
            }

            public Builder clearNoiseSuppressionEnabled() {
                this.bitField0_ &= -3;
                this.noiseSuppressionEnabled_ = false;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearOrientation() {
                this.bitField0_ &= -2049;
                this.orientation_ = 0;
                onChanged();
                return this;
            }

            public Builder clearPromptlyDelete() {
                this.bitField0_ &= -1025;
                this.promptlyDelete_ = false;
                onChanged();
                return this;
            }

            public Builder clearProtectedLaneDetectionEnabled() {
                this.bitField0_ &= -131073;
                this.protectedLaneDetectionEnabled_ = false;
                onChanged();
                return this;
            }

            public Builder clearRadarOverlayEnabled() {
                this.bitField0_ &= -8193;
                this.radarOverlayEnabled_ = false;
                onChanged();
                return this;
            }

            public Builder clearRearviewMirrorEnabled() {
                this.bitField0_ &= -32769;
                this.rearviewMirrorEnabled_ = false;
                onChanged();
                return this;
            }

            public Builder clearRecordingMode() {
                this.bitField0_ &= -4097;
                this.recordingMode_ = 0;
                onChanged();
                return this;
            }

            public Builder clearResolutionFramerate() {
                this.bitField0_ &= -513;
                this.resolutionFramerate_ = 0;
                onChanged();
                return this;
            }

            public Builder clearSpeedFormat() {
                this.bitField0_ &= -17;
                this.speedFormat_ = 0;
                onChanged();
                return this;
            }

            public Builder clearSpeedOverlayEnabled() {
                this.bitField0_ &= -9;
                this.speedOverlayEnabled_ = false;
                onChanged();
                return this;
            }

            public Builder clearTimeFormat() {
                this.bitField0_ &= -257;
                this.timeFormat_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.proto.generated.GDICamera.ConfigurationOrBuilder
            public boolean getAudioRecordingEnabled() {
                return this.audioRecordingEnabled_;
            }

            @Override // com.garmin.proto.generated.GDICamera.ConfigurationOrBuilder
            public boolean getClosePassVideoSaveEnabled() {
                return this.closePassVideoSaveEnabled_;
            }

            @Override // com.garmin.proto.generated.GDICamera.ConfigurationOrBuilder
            public DateFormat getDateFormat() {
                DateFormat dateFormatForNumber = DateFormat.forNumber(this.dateFormat_);
                return dateFormatForNumber == null ? DateFormat.DATE_FORMAT_UNKNOWN : dateFormatForNumber;
            }

            @Override // com.garmin.proto.generated.GDICamera.ConfigurationOrBuilder
            public boolean getDatetimeOverlayEnabled() {
                return this.datetimeOverlayEnabled_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDICamera.internal_static_GDI_Proto_Camera_Configuration_descriptor;
            }

            @Override // com.garmin.proto.generated.GDICamera.ConfigurationOrBuilder
            public Eis getEisMode() {
                Eis eisForNumber = Eis.forNumber(this.eisMode_);
                return eisForNumber == null ? Eis.EIS_UNKNOWN : eisForNumber;
            }

            @Override // com.garmin.proto.generated.GDICamera.ConfigurationOrBuilder
            public boolean getHardBrakeEventVideoSaveEnabled() {
                return this.hardBrakeEventVideoSaveEnabled_;
            }

            @Override // com.garmin.proto.generated.GDICamera.ConfigurationOrBuilder
            public boolean getLocationOverlayEnabled() {
                return this.locationOverlayEnabled_;
            }

            @Override // com.garmin.proto.generated.GDICamera.ConfigurationOrBuilder
            public boolean getNoiseSuppressionEnabled() {
                return this.noiseSuppressionEnabled_;
            }

            @Override // com.garmin.proto.generated.GDICamera.ConfigurationOrBuilder
            public Orientation getOrientation() {
                Orientation orientationForNumber = Orientation.forNumber(this.orientation_);
                return orientationForNumber == null ? Orientation.ORIENTATION_UNKNOWN : orientationForNumber;
            }

            @Override // com.garmin.proto.generated.GDICamera.ConfigurationOrBuilder
            public boolean getPromptlyDelete() {
                return this.promptlyDelete_;
            }

            @Override // com.garmin.proto.generated.GDICamera.ConfigurationOrBuilder
            public boolean getProtectedLaneDetectionEnabled() {
                return this.protectedLaneDetectionEnabled_;
            }

            @Override // com.garmin.proto.generated.GDICamera.ConfigurationOrBuilder
            public boolean getRadarOverlayEnabled() {
                return this.radarOverlayEnabled_;
            }

            @Override // com.garmin.proto.generated.GDICamera.ConfigurationOrBuilder
            public boolean getRearviewMirrorEnabled() {
                return this.rearviewMirrorEnabled_;
            }

            @Override // com.garmin.proto.generated.GDICamera.ConfigurationOrBuilder
            public RecordingMode getRecordingMode() {
                RecordingMode recordingModeForNumber = RecordingMode.forNumber(this.recordingMode_);
                return recordingModeForNumber == null ? RecordingMode.RECORDING_MODE_UNKNOWN : recordingModeForNumber;
            }

            @Override // com.garmin.proto.generated.GDICamera.ConfigurationOrBuilder
            public ResolutionFramerate getResolutionFramerate() {
                ResolutionFramerate resolutionFramerateForNumber = ResolutionFramerate.forNumber(this.resolutionFramerate_);
                return resolutionFramerateForNumber == null ? ResolutionFramerate.RESOLUTION_FRAMERATE_UNKNOWN : resolutionFramerateForNumber;
            }

            @Override // com.garmin.proto.generated.GDICamera.ConfigurationOrBuilder
            public SpeedFormat getSpeedFormat() {
                SpeedFormat speedFormatForNumber = SpeedFormat.forNumber(this.speedFormat_);
                return speedFormatForNumber == null ? SpeedFormat.SPEED_FORMAT_UNKNOWN : speedFormatForNumber;
            }

            @Override // com.garmin.proto.generated.GDICamera.ConfigurationOrBuilder
            public boolean getSpeedOverlayEnabled() {
                return this.speedOverlayEnabled_;
            }

            @Override // com.garmin.proto.generated.GDICamera.ConfigurationOrBuilder
            public TimeFormat getTimeFormat() {
                TimeFormat timeFormatForNumber = TimeFormat.forNumber(this.timeFormat_);
                return timeFormatForNumber == null ? TimeFormat.TIME_FORMAT_UNKNOWN : timeFormatForNumber;
            }

            @Override // com.garmin.proto.generated.GDICamera.ConfigurationOrBuilder
            public boolean hasAudioRecordingEnabled() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDICamera.ConfigurationOrBuilder
            public boolean hasClosePassVideoSaveEnabled() {
                return (this.bitField0_ & 65536) != 0;
            }

            @Override // com.garmin.proto.generated.GDICamera.ConfigurationOrBuilder
            public boolean hasDateFormat() {
                return (this.bitField0_ & 128) != 0;
            }

            @Override // com.garmin.proto.generated.GDICamera.ConfigurationOrBuilder
            public boolean hasDatetimeOverlayEnabled() {
                return (this.bitField0_ & 64) != 0;
            }

            @Override // com.garmin.proto.generated.GDICamera.ConfigurationOrBuilder
            public boolean hasEisMode() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDICamera.ConfigurationOrBuilder
            public boolean hasHardBrakeEventVideoSaveEnabled() {
                return (this.bitField0_ & 16384) != 0;
            }

            @Override // com.garmin.proto.generated.GDICamera.ConfigurationOrBuilder
            public boolean hasLocationOverlayEnabled() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.garmin.proto.generated.GDICamera.ConfigurationOrBuilder
            public boolean hasNoiseSuppressionEnabled() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDICamera.ConfigurationOrBuilder
            public boolean hasOrientation() {
                return (this.bitField0_ & 2048) != 0;
            }

            @Override // com.garmin.proto.generated.GDICamera.ConfigurationOrBuilder
            public boolean hasPromptlyDelete() {
                return (this.bitField0_ & 1024) != 0;
            }

            @Override // com.garmin.proto.generated.GDICamera.ConfigurationOrBuilder
            public boolean hasProtectedLaneDetectionEnabled() {
                return (this.bitField0_ & 131072) != 0;
            }

            @Override // com.garmin.proto.generated.GDICamera.ConfigurationOrBuilder
            public boolean hasRadarOverlayEnabled() {
                return (this.bitField0_ & 8192) != 0;
            }

            @Override // com.garmin.proto.generated.GDICamera.ConfigurationOrBuilder
            public boolean hasRearviewMirrorEnabled() {
                return (this.bitField0_ & 32768) != 0;
            }

            @Override // com.garmin.proto.generated.GDICamera.ConfigurationOrBuilder
            public boolean hasRecordingMode() {
                return (this.bitField0_ & 4096) != 0;
            }

            @Override // com.garmin.proto.generated.GDICamera.ConfigurationOrBuilder
            public boolean hasResolutionFramerate() {
                return (this.bitField0_ & 512) != 0;
            }

            @Override // com.garmin.proto.generated.GDICamera.ConfigurationOrBuilder
            public boolean hasSpeedFormat() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.garmin.proto.generated.GDICamera.ConfigurationOrBuilder
            public boolean hasSpeedOverlayEnabled() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDICamera.ConfigurationOrBuilder
            public boolean hasTimeFormat() {
                return (this.bitField0_ & 256) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDICamera.internal_static_GDI_Proto_Camera_Configuration_fieldAccessorTable.ensureFieldAccessorsInitialized(Configuration.class, Builder.class);
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
                                    this.audioRecordingEnabled_ = codedInputStream.readBool();
                                    this.bitField0_ |= 1;
                                    continue;
                                case 16:
                                    this.noiseSuppressionEnabled_ = codedInputStream.readBool();
                                    this.bitField0_ |= 2;
                                    continue;
                                case 24:
                                    int i14 = codedInputStream.readEnum();
                                    if (Eis.forNumber(i14) == null) {
                                        mergeUnknownVarintField(3, i14);
                                    } else {
                                        this.eisMode_ = i14;
                                        this.bitField0_ |= 4;
                                        continue;
                                    }
                                    break;
                                case 32:
                                    this.speedOverlayEnabled_ = codedInputStream.readBool();
                                    this.bitField0_ |= 8;
                                    continue;
                                case 40:
                                    int i15 = codedInputStream.readEnum();
                                    if (SpeedFormat.forNumber(i15) == null) {
                                        mergeUnknownVarintField(5, i15);
                                    } else {
                                        this.speedFormat_ = i15;
                                        this.bitField0_ |= 16;
                                        continue;
                                    }
                                    break;
                                case 48:
                                    this.locationOverlayEnabled_ = codedInputStream.readBool();
                                    this.bitField0_ |= 32;
                                    continue;
                                case 56:
                                    this.datetimeOverlayEnabled_ = codedInputStream.readBool();
                                    this.bitField0_ |= 64;
                                    continue;
                                case 64:
                                    int i16 = codedInputStream.readEnum();
                                    if (DateFormat.forNumber(i16) == null) {
                                        mergeUnknownVarintField(8, i16);
                                    } else {
                                        this.dateFormat_ = i16;
                                        this.bitField0_ |= 128;
                                        continue;
                                    }
                                    break;
                                case 72:
                                    int i17 = codedInputStream.readEnum();
                                    if (TimeFormat.forNumber(i17) == null) {
                                        mergeUnknownVarintField(9, i17);
                                    } else {
                                        this.timeFormat_ = i17;
                                        this.bitField0_ |= 256;
                                        continue;
                                    }
                                    break;
                                case 80:
                                    int i18 = codedInputStream.readEnum();
                                    if (ResolutionFramerate.forNumber(i18) == null) {
                                        mergeUnknownVarintField(10, i18);
                                    } else {
                                        this.resolutionFramerate_ = i18;
                                        this.bitField0_ |= 512;
                                        continue;
                                    }
                                    break;
                                case 88:
                                    this.promptlyDelete_ = codedInputStream.readBool();
                                    this.bitField0_ |= 1024;
                                    continue;
                                case 96:
                                    int i19 = codedInputStream.readEnum();
                                    if (Orientation.forNumber(i19) == null) {
                                        mergeUnknownVarintField(12, i19);
                                    } else {
                                        this.orientation_ = i19;
                                        this.bitField0_ |= 2048;
                                        continue;
                                    }
                                    break;
                                case 104:
                                    int i24 = codedInputStream.readEnum();
                                    if (RecordingMode.forNumber(i24) == null) {
                                        mergeUnknownVarintField(13, i24);
                                    } else {
                                        this.recordingMode_ = i24;
                                        this.bitField0_ |= 4096;
                                        continue;
                                    }
                                    break;
                                case 112:
                                    this.radarOverlayEnabled_ = codedInputStream.readBool();
                                    this.bitField0_ |= 8192;
                                    continue;
                                case 120:
                                    this.hardBrakeEventVideoSaveEnabled_ = codedInputStream.readBool();
                                    this.bitField0_ |= 16384;
                                    continue;
                                case 128:
                                    this.rearviewMirrorEnabled_ = codedInputStream.readBool();
                                    this.bitField0_ |= 32768;
                                    continue;
                                case SyslogConstants.LOG_LOCAL1 /* 136 */:
                                    this.closePassVideoSaveEnabled_ = codedInputStream.readBool();
                                    this.bitField0_ |= 65536;
                                    continue;
                                case SyslogConstants.LOG_LOCAL2 /* 144 */:
                                    this.protectedLaneDetectionEnabled_ = codedInputStream.readBool();
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

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder setAudioRecordingEnabled(boolean z14) {
                this.audioRecordingEnabled_ = z14;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setClosePassVideoSaveEnabled(boolean z14) {
                this.closePassVideoSaveEnabled_ = z14;
                this.bitField0_ |= 65536;
                onChanged();
                return this;
            }

            public Builder setDateFormat(DateFormat dateFormat) {
                dateFormat.getClass();
                this.bitField0_ |= 128;
                this.dateFormat_ = dateFormat.getNumber();
                onChanged();
                return this;
            }

            public Builder setDatetimeOverlayEnabled(boolean z14) {
                this.datetimeOverlayEnabled_ = z14;
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setEisMode(Eis eis) {
                eis.getClass();
                this.bitField0_ |= 4;
                this.eisMode_ = eis.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setHardBrakeEventVideoSaveEnabled(boolean z14) {
                this.hardBrakeEventVideoSaveEnabled_ = z14;
                this.bitField0_ |= 16384;
                onChanged();
                return this;
            }

            public Builder setLocationOverlayEnabled(boolean z14) {
                this.locationOverlayEnabled_ = z14;
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setNoiseSuppressionEnabled(boolean z14) {
                this.noiseSuppressionEnabled_ = z14;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setOrientation(Orientation orientation) {
                orientation.getClass();
                this.bitField0_ |= 2048;
                this.orientation_ = orientation.getNumber();
                onChanged();
                return this;
            }

            public Builder setPromptlyDelete(boolean z14) {
                this.promptlyDelete_ = z14;
                this.bitField0_ |= 1024;
                onChanged();
                return this;
            }

            public Builder setProtectedLaneDetectionEnabled(boolean z14) {
                this.protectedLaneDetectionEnabled_ = z14;
                this.bitField0_ |= 131072;
                onChanged();
                return this;
            }

            public Builder setRadarOverlayEnabled(boolean z14) {
                this.radarOverlayEnabled_ = z14;
                this.bitField0_ |= 8192;
                onChanged();
                return this;
            }

            public Builder setRearviewMirrorEnabled(boolean z14) {
                this.rearviewMirrorEnabled_ = z14;
                this.bitField0_ |= 32768;
                onChanged();
                return this;
            }

            public Builder setRecordingMode(RecordingMode recordingMode) {
                recordingMode.getClass();
                this.bitField0_ |= 4096;
                this.recordingMode_ = recordingMode.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setResolutionFramerate(ResolutionFramerate resolutionFramerate) {
                resolutionFramerate.getClass();
                this.bitField0_ |= 512;
                this.resolutionFramerate_ = resolutionFramerate.getNumber();
                onChanged();
                return this;
            }

            public Builder setSpeedFormat(SpeedFormat speedFormat) {
                speedFormat.getClass();
                this.bitField0_ |= 16;
                this.speedFormat_ = speedFormat.getNumber();
                onChanged();
                return this;
            }

            public Builder setSpeedOverlayEnabled(boolean z14) {
                this.speedOverlayEnabled_ = z14;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setTimeFormat(TimeFormat timeFormat) {
                timeFormat.getClass();
                this.bitField0_ |= 256;
                this.timeFormat_ = timeFormat.getNumber();
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
                this.eisMode_ = 0;
                this.speedFormat_ = 0;
                this.dateFormat_ = 0;
                this.timeFormat_ = 0;
                this.resolutionFramerate_ = 0;
                this.orientation_ = 0;
                this.recordingMode_ = 0;
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
                if (configuration.hasAudioRecordingEnabled()) {
                    setAudioRecordingEnabled(configuration.getAudioRecordingEnabled());
                }
                if (configuration.hasNoiseSuppressionEnabled()) {
                    setNoiseSuppressionEnabled(configuration.getNoiseSuppressionEnabled());
                }
                if (configuration.hasEisMode()) {
                    setEisMode(configuration.getEisMode());
                }
                if (configuration.hasSpeedOverlayEnabled()) {
                    setSpeedOverlayEnabled(configuration.getSpeedOverlayEnabled());
                }
                if (configuration.hasSpeedFormat()) {
                    setSpeedFormat(configuration.getSpeedFormat());
                }
                if (configuration.hasLocationOverlayEnabled()) {
                    setLocationOverlayEnabled(configuration.getLocationOverlayEnabled());
                }
                if (configuration.hasDatetimeOverlayEnabled()) {
                    setDatetimeOverlayEnabled(configuration.getDatetimeOverlayEnabled());
                }
                if (configuration.hasDateFormat()) {
                    setDateFormat(configuration.getDateFormat());
                }
                if (configuration.hasTimeFormat()) {
                    setTimeFormat(configuration.getTimeFormat());
                }
                if (configuration.hasResolutionFramerate()) {
                    setResolutionFramerate(configuration.getResolutionFramerate());
                }
                if (configuration.hasPromptlyDelete()) {
                    setPromptlyDelete(configuration.getPromptlyDelete());
                }
                if (configuration.hasOrientation()) {
                    setOrientation(configuration.getOrientation());
                }
                if (configuration.hasRecordingMode()) {
                    setRecordingMode(configuration.getRecordingMode());
                }
                if (configuration.hasRadarOverlayEnabled()) {
                    setRadarOverlayEnabled(configuration.getRadarOverlayEnabled());
                }
                if (configuration.hasHardBrakeEventVideoSaveEnabled()) {
                    setHardBrakeEventVideoSaveEnabled(configuration.getHardBrakeEventVideoSaveEnabled());
                }
                if (configuration.hasRearviewMirrorEnabled()) {
                    setRearviewMirrorEnabled(configuration.getRearviewMirrorEnabled());
                }
                if (configuration.hasClosePassVideoSaveEnabled()) {
                    setClosePassVideoSaveEnabled(configuration.getClosePassVideoSaveEnabled());
                }
                if (configuration.hasProtectedLaneDetectionEnabled()) {
                    setProtectedLaneDetectionEnabled(configuration.getProtectedLaneDetectionEnabled());
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

        public static Configuration parseFrom(CodedInputStream codedInputStream) {
            return (Configuration) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static Configuration parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Configuration) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum DateFormat implements ProtocolMessageEnum {
            DATE_FORMAT_UNKNOWN(0),
            DATE_FORMAT_MMDDYYYY(1),
            DATE_FORMAT_DDMMYYYY(2),
            DATE_FORMAT_YYYYMMDD(3);

            public static final int DATE_FORMAT_DDMMYYYY_VALUE = 2;
            public static final int DATE_FORMAT_MMDDYYYY_VALUE = 1;
            public static final int DATE_FORMAT_UNKNOWN_VALUE = 0;
            public static final int DATE_FORMAT_YYYYMMDD_VALUE = 3;
            private final int value;
            private static final Internal.EnumLiteMap<DateFormat> internalValueMap = new Internal.EnumLiteMap<DateFormat>() { // from class: com.garmin.proto.generated.GDICamera.Configuration.DateFormat.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public DateFormat findValueByNumber(int i14) {
                    return DateFormat.forNumber(i14);
                }
            };
            private static final DateFormat[] VALUES = values();

            DateFormat(int i14) {
                this.value = i14;
            }

            public static DateFormat forNumber(int i14) {
                if (i14 == 0) {
                    return DATE_FORMAT_UNKNOWN;
                }
                if (i14 == 1) {
                    return DATE_FORMAT_MMDDYYYY;
                }
                if (i14 == 2) {
                    return DATE_FORMAT_DDMMYYYY;
                }
                if (i14 != 3) {
                    return null;
                }
                return DATE_FORMAT_YYYYMMDD;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return Configuration.getDescriptor().getEnumTypes().get(1);
            }

            public static Internal.EnumLiteMap<DateFormat> internalGetValueMap() {
                return internalValueMap;
            }

            public static DateFormat valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static DateFormat valueOf(int i14) {
                return forNumber(i14);
            }
        }

        public enum Eis implements ProtocolMessageEnum {
            EIS_UNKNOWN(0),
            EIS_OFF(1),
            EIS_NORMAL(2),
            EIS_SUPER(3);

            public static final int EIS_NORMAL_VALUE = 2;
            public static final int EIS_OFF_VALUE = 1;
            public static final int EIS_SUPER_VALUE = 3;
            public static final int EIS_UNKNOWN_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<Eis> internalValueMap = new Internal.EnumLiteMap<Eis>() { // from class: com.garmin.proto.generated.GDICamera.Configuration.Eis.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public Eis findValueByNumber(int i14) {
                    return Eis.forNumber(i14);
                }
            };
            private static final Eis[] VALUES = values();

            Eis(int i14) {
                this.value = i14;
            }

            public static Eis forNumber(int i14) {
                if (i14 == 0) {
                    return EIS_UNKNOWN;
                }
                if (i14 == 1) {
                    return EIS_OFF;
                }
                if (i14 == 2) {
                    return EIS_NORMAL;
                }
                if (i14 != 3) {
                    return null;
                }
                return EIS_SUPER;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return Configuration.getDescriptor().getEnumTypes().get(5);
            }

            public static Internal.EnumLiteMap<Eis> internalGetValueMap() {
                return internalValueMap;
            }

            public static Eis valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static Eis valueOf(int i14) {
                return forNumber(i14);
            }
        }

        public enum Orientation implements ProtocolMessageEnum {
            ORIENTATION_UNKNOWN(0),
            ORIENTATION_ROTATE_0(1),
            ORIENTATION_ROTATE_0_HORZ_FLIP(2),
            ORIENTATION_ROTATE_90(3),
            ORIENTATION_ROTATE_90_VERT_FLIP(4),
            ORIENTATION_ROTATE_180(5),
            ORIENTATION_ROTATE_180_HORZ_FLIP(6),
            ORIENTATION_ROTATE_270(7),
            ORIENTATION_ROTATE_270_VERT_FLIP(8);

            public static final int ORIENTATION_ROTATE_0_HORZ_FLIP_VALUE = 2;
            public static final int ORIENTATION_ROTATE_0_VALUE = 1;
            public static final int ORIENTATION_ROTATE_180_HORZ_FLIP_VALUE = 6;
            public static final int ORIENTATION_ROTATE_180_VALUE = 5;
            public static final int ORIENTATION_ROTATE_270_VALUE = 7;
            public static final int ORIENTATION_ROTATE_270_VERT_FLIP_VALUE = 8;
            public static final int ORIENTATION_ROTATE_90_VALUE = 3;
            public static final int ORIENTATION_ROTATE_90_VERT_FLIP_VALUE = 4;
            public static final int ORIENTATION_UNKNOWN_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<Orientation> internalValueMap = new Internal.EnumLiteMap<Orientation>() { // from class: com.garmin.proto.generated.GDICamera.Configuration.Orientation.1
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
                switch (i14) {
                    case 0:
                        return ORIENTATION_UNKNOWN;
                    case 1:
                        return ORIENTATION_ROTATE_0;
                    case 2:
                        return ORIENTATION_ROTATE_0_HORZ_FLIP;
                    case 3:
                        return ORIENTATION_ROTATE_90;
                    case 4:
                        return ORIENTATION_ROTATE_90_VERT_FLIP;
                    case 5:
                        return ORIENTATION_ROTATE_180;
                    case 6:
                        return ORIENTATION_ROTATE_180_HORZ_FLIP;
                    case 7:
                        return ORIENTATION_ROTATE_270;
                    case 8:
                        return ORIENTATION_ROTATE_270_VERT_FLIP;
                    default:
                        return null;
                }
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return Configuration.getDescriptor().getEnumTypes().get(4);
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

        public enum RecordingMode implements ProtocolMessageEnum {
            RECORDING_MODE_UNKNOWN(0),
            RECORDING_MODE_DISABLED(1),
            RECORDING_MODE_ENABLED(2),
            RECORDING_MODE_RADAR_ACTIVATED(3);

            public static final int RECORDING_MODE_DISABLED_VALUE = 1;
            public static final int RECORDING_MODE_ENABLED_VALUE = 2;
            public static final int RECORDING_MODE_RADAR_ACTIVATED_VALUE = 3;
            public static final int RECORDING_MODE_UNKNOWN_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<RecordingMode> internalValueMap = new Internal.EnumLiteMap<RecordingMode>() { // from class: com.garmin.proto.generated.GDICamera.Configuration.RecordingMode.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public RecordingMode findValueByNumber(int i14) {
                    return RecordingMode.forNumber(i14);
                }
            };
            private static final RecordingMode[] VALUES = values();

            RecordingMode(int i14) {
                this.value = i14;
            }

            public static RecordingMode forNumber(int i14) {
                if (i14 == 0) {
                    return RECORDING_MODE_UNKNOWN;
                }
                if (i14 == 1) {
                    return RECORDING_MODE_DISABLED;
                }
                if (i14 == 2) {
                    return RECORDING_MODE_ENABLED;
                }
                if (i14 != 3) {
                    return null;
                }
                return RECORDING_MODE_RADAR_ACTIVATED;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return Configuration.getDescriptor().getEnumTypes().get(3);
            }

            public static Internal.EnumLiteMap<RecordingMode> internalGetValueMap() {
                return internalValueMap;
            }

            public static RecordingMode valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static RecordingMode valueOf(int i14) {
                return forNumber(i14);
            }
        }

        public enum SpeedFormat implements ProtocolMessageEnum {
            SPEED_FORMAT_UNKNOWN(0),
            SPEED_FORMAT_KILOMETERS(1),
            SPEED_FORMAT_MILES(2);

            public static final int SPEED_FORMAT_KILOMETERS_VALUE = 1;
            public static final int SPEED_FORMAT_MILES_VALUE = 2;
            public static final int SPEED_FORMAT_UNKNOWN_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<SpeedFormat> internalValueMap = new Internal.EnumLiteMap<SpeedFormat>() { // from class: com.garmin.proto.generated.GDICamera.Configuration.SpeedFormat.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public SpeedFormat findValueByNumber(int i14) {
                    return SpeedFormat.forNumber(i14);
                }
            };
            private static final SpeedFormat[] VALUES = values();

            SpeedFormat(int i14) {
                this.value = i14;
            }

            public static SpeedFormat forNumber(int i14) {
                if (i14 == 0) {
                    return SPEED_FORMAT_UNKNOWN;
                }
                if (i14 == 1) {
                    return SPEED_FORMAT_KILOMETERS;
                }
                if (i14 != 2) {
                    return null;
                }
                return SPEED_FORMAT_MILES;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return Configuration.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<SpeedFormat> internalGetValueMap() {
                return internalValueMap;
            }

            public static SpeedFormat valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static SpeedFormat valueOf(int i14) {
                return forNumber(i14);
            }
        }

        public enum TimeFormat implements ProtocolMessageEnum {
            TIME_FORMAT_UNKNOWN(0),
            TIME_FORMAT_24_HOUR(1),
            TIME_FORMAT_12_HOUR(2),
            TIME_FORMAT_UTC(3);

            public static final int TIME_FORMAT_12_HOUR_VALUE = 2;
            public static final int TIME_FORMAT_24_HOUR_VALUE = 1;
            public static final int TIME_FORMAT_UNKNOWN_VALUE = 0;
            public static final int TIME_FORMAT_UTC_VALUE = 3;
            private final int value;
            private static final Internal.EnumLiteMap<TimeFormat> internalValueMap = new Internal.EnumLiteMap<TimeFormat>() { // from class: com.garmin.proto.generated.GDICamera.Configuration.TimeFormat.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public TimeFormat findValueByNumber(int i14) {
                    return TimeFormat.forNumber(i14);
                }
            };
            private static final TimeFormat[] VALUES = values();

            TimeFormat(int i14) {
                this.value = i14;
            }

            public static TimeFormat forNumber(int i14) {
                if (i14 == 0) {
                    return TIME_FORMAT_UNKNOWN;
                }
                if (i14 == 1) {
                    return TIME_FORMAT_24_HOUR;
                }
                if (i14 == 2) {
                    return TIME_FORMAT_12_HOUR;
                }
                if (i14 != 3) {
                    return null;
                }
                return TIME_FORMAT_UTC;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return Configuration.getDescriptor().getEnumTypes().get(2);
            }

            public static Internal.EnumLiteMap<TimeFormat> internalGetValueMap() {
                return internalValueMap;
            }

            public static TimeFormat valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static TimeFormat valueOf(int i14) {
                return forNumber(i14);
            }
        }

        public /* synthetic */ Configuration(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private Configuration() {
            this.audioRecordingEnabled_ = false;
            this.noiseSuppressionEnabled_ = false;
            this.speedOverlayEnabled_ = false;
            this.locationOverlayEnabled_ = false;
            this.datetimeOverlayEnabled_ = false;
            this.promptlyDelete_ = false;
            this.radarOverlayEnabled_ = false;
            this.hardBrakeEventVideoSaveEnabled_ = false;
            this.rearviewMirrorEnabled_ = false;
            this.closePassVideoSaveEnabled_ = false;
            this.protectedLaneDetectionEnabled_ = false;
            this.memoizedIsInitialized = (byte) -1;
            this.eisMode_ = 0;
            this.speedFormat_ = 0;
            this.dateFormat_ = 0;
            this.timeFormat_ = 0;
            this.resolutionFramerate_ = 0;
            this.orientation_ = 0;
            this.recordingMode_ = 0;
        }
    }

    public static final class ConfigurationNotification extends GeneratedMessageV3 implements ConfigurationNotificationOrBuilder {
        public static final int CONFIGURATION_CHANGE_REASON_FIELD_NUMBER = 2;
        public static final int CONFIG_FIELD_NUMBER = 1;
        private static final ConfigurationNotification DEFAULT_INSTANCE = new ConfigurationNotification();

        @Deprecated
        public static final Parser<ConfigurationNotification> PARSER = new AbstractParser<ConfigurationNotification>() { // from class: com.garmin.proto.generated.GDICamera.ConfigurationNotification.1
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
        private int configurationChangeReason_;
        private byte memoizedIsInitialized;

        private ConfigurationNotification(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.configurationChangeReason_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ConfigurationNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDICamera.internal_static_GDI_Proto_Camera_ConfigurationNotification_descriptor;
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
            if ((!hasConfig() || getConfig().equals(configurationNotification.getConfig())) && hasConfigurationChangeReason() == configurationNotification.hasConfigurationChangeReason()) {
                return (!hasConfigurationChangeReason() || this.configurationChangeReason_ == configurationNotification.configurationChangeReason_) && getUnknownFields().equals(configurationNotification.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDICamera.ConfigurationNotificationOrBuilder
        public Configuration getConfig() {
            Configuration configuration = this.config_;
            return configuration == null ? Configuration.getDefaultInstance() : configuration;
        }

        @Override // com.garmin.proto.generated.GDICamera.ConfigurationNotificationOrBuilder
        public ConfigurationOrBuilder getConfigOrBuilder() {
            Configuration configuration = this.config_;
            return configuration == null ? Configuration.getDefaultInstance() : configuration;
        }

        @Override // com.garmin.proto.generated.GDICamera.ConfigurationNotificationOrBuilder
        public ReasonForChange getConfigurationChangeReason() {
            ReasonForChange reasonForChangeForNumber = ReasonForChange.forNumber(this.configurationChangeReason_);
            return reasonForChangeForNumber == null ? ReasonForChange.REASON_FOR_CHANGE_UNKNOWN : reasonForChangeForNumber;
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
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getConfig()) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += CodedOutputStream.computeEnumSize(2, this.configurationChangeReason_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDICamera.ConfigurationNotificationOrBuilder
        public boolean hasConfig() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDICamera.ConfigurationNotificationOrBuilder
        public boolean hasConfigurationChangeReason() {
            return (this.bitField0_ & 2) != 0;
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
            if (hasConfigurationChangeReason()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + this.configurationChangeReason_;
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDICamera.internal_static_GDI_Proto_Camera_ConfigurationNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(ConfigurationNotification.class, Builder.class);
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
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeEnum(2, this.configurationChangeReason_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ConfigurationNotificationOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<Configuration, Configuration.Builder, ConfigurationOrBuilder> configBuilder_;
            private Configuration config_;
            private int configurationChangeReason_;

            private Builder() {
                this.configurationChangeReason_ = 0;
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(ConfigurationNotification configurationNotification) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    SingleFieldBuilderV3<Configuration, Configuration.Builder, ConfigurationOrBuilder> singleFieldBuilderV3 = this.configBuilder_;
                    configurationNotification.config_ = singleFieldBuilderV3 == null ? this.config_ : (Configuration) singleFieldBuilderV3.build();
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    configurationNotification.configurationChangeReason_ = this.configurationChangeReason_;
                    i14 |= 2;
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
                return GDICamera.internal_static_GDI_Proto_Camera_ConfigurationNotification_descriptor;
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
                this.configurationChangeReason_ = 0;
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

            public Builder clearConfigurationChangeReason() {
                this.bitField0_ &= -3;
                this.configurationChangeReason_ = 0;
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

            @Override // com.garmin.proto.generated.GDICamera.ConfigurationNotificationOrBuilder
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

            @Override // com.garmin.proto.generated.GDICamera.ConfigurationNotificationOrBuilder
            public ConfigurationOrBuilder getConfigOrBuilder() {
                SingleFieldBuilderV3<Configuration, Configuration.Builder, ConfigurationOrBuilder> singleFieldBuilderV3 = this.configBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ConfigurationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                Configuration configuration = this.config_;
                return configuration == null ? Configuration.getDefaultInstance() : configuration;
            }

            @Override // com.garmin.proto.generated.GDICamera.ConfigurationNotificationOrBuilder
            public ReasonForChange getConfigurationChangeReason() {
                ReasonForChange reasonForChangeForNumber = ReasonForChange.forNumber(this.configurationChangeReason_);
                return reasonForChangeForNumber == null ? ReasonForChange.REASON_FOR_CHANGE_UNKNOWN : reasonForChangeForNumber;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDICamera.internal_static_GDI_Proto_Camera_ConfigurationNotification_descriptor;
            }

            @Override // com.garmin.proto.generated.GDICamera.ConfigurationNotificationOrBuilder
            public boolean hasConfig() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDICamera.ConfigurationNotificationOrBuilder
            public boolean hasConfigurationChangeReason() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDICamera.internal_static_GDI_Proto_Camera_ConfigurationNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(ConfigurationNotification.class, Builder.class);
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
                                } else if (tag == 16) {
                                    int i14 = codedInputStream.readEnum();
                                    if (ReasonForChange.forNumber(i14) == null) {
                                        mergeUnknownVarintField(2, i14);
                                    } else {
                                        this.configurationChangeReason_ = i14;
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

            public Builder setConfigurationChangeReason(ReasonForChange reasonForChange) {
                reasonForChange.getClass();
                this.bitField0_ |= 2;
                this.configurationChangeReason_ = reasonForChange.getNumber();
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
                this.configurationChangeReason_ = 0;
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
                if (configurationNotification.hasConfigurationChangeReason()) {
                    setConfigurationChangeReason(configurationNotification.getConfigurationChangeReason());
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

        public /* synthetic */ ConfigurationNotification(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static ConfigurationNotification parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private ConfigurationNotification() {
            this.memoizedIsInitialized = (byte) -1;
            this.configurationChangeReason_ = 0;
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

        public enum ReasonForChange implements ProtocolMessageEnum {
            REASON_FOR_CHANGE_UNKNOWN(0),
            REASON_FOR_CHANGE_GARMIN_DISPLAY(1),
            REASON_FOR_CHANGE_MOBILE_APP(2),
            REASON_FOR_CHANGE_OVERTEMP(3),
            REASON_FOR_CHANGE_SYSTEM_ERROR(4),
            REASON_FOR_CHANGE_SYSTEM_OTHER(5);

            public static final int REASON_FOR_CHANGE_GARMIN_DISPLAY_VALUE = 1;
            public static final int REASON_FOR_CHANGE_MOBILE_APP_VALUE = 2;
            public static final int REASON_FOR_CHANGE_OVERTEMP_VALUE = 3;
            public static final int REASON_FOR_CHANGE_SYSTEM_ERROR_VALUE = 4;
            public static final int REASON_FOR_CHANGE_SYSTEM_OTHER_VALUE = 5;
            public static final int REASON_FOR_CHANGE_UNKNOWN_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<ReasonForChange> internalValueMap = new Internal.EnumLiteMap<ReasonForChange>() { // from class: com.garmin.proto.generated.GDICamera.ConfigurationNotification.ReasonForChange.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public ReasonForChange findValueByNumber(int i14) {
                    return ReasonForChange.forNumber(i14);
                }
            };
            private static final ReasonForChange[] VALUES = values();

            ReasonForChange(int i14) {
                this.value = i14;
            }

            public static ReasonForChange forNumber(int i14) {
                if (i14 == 0) {
                    return REASON_FOR_CHANGE_UNKNOWN;
                }
                if (i14 == 1) {
                    return REASON_FOR_CHANGE_GARMIN_DISPLAY;
                }
                if (i14 == 2) {
                    return REASON_FOR_CHANGE_MOBILE_APP;
                }
                if (i14 == 3) {
                    return REASON_FOR_CHANGE_OVERTEMP;
                }
                if (i14 == 4) {
                    return REASON_FOR_CHANGE_SYSTEM_ERROR;
                }
                if (i14 != 5) {
                    return null;
                }
                return REASON_FOR_CHANGE_SYSTEM_OTHER;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return ConfigurationNotification.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<ReasonForChange> internalGetValueMap() {
                return internalValueMap;
            }

            public static ReasonForChange valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static ReasonForChange valueOf(int i14) {
                return forNumber(i14);
            }
        }
    }

    public static final class ConfigurationRequest extends GeneratedMessageV3 implements ConfigurationRequestOrBuilder {
        public static final int CONFIG_FIELD_NUMBER = 1;
        private static final ConfigurationRequest DEFAULT_INSTANCE = new ConfigurationRequest();

        @Deprecated
        public static final Parser<ConfigurationRequest> PARSER = new AbstractParser<ConfigurationRequest>() { // from class: com.garmin.proto.generated.GDICamera.ConfigurationRequest.1
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
            return GDICamera.internal_static_GDI_Proto_Camera_ConfigurationRequest_descriptor;
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

        @Override // com.garmin.proto.generated.GDICamera.ConfigurationRequestOrBuilder
        public Configuration getConfig() {
            Configuration configuration = this.config_;
            return configuration == null ? Configuration.getDefaultInstance() : configuration;
        }

        @Override // com.garmin.proto.generated.GDICamera.ConfigurationRequestOrBuilder
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

        @Override // com.garmin.proto.generated.GDICamera.ConfigurationRequestOrBuilder
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
            return GDICamera.internal_static_GDI_Proto_Camera_ConfigurationRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(ConfigurationRequest.class, Builder.class);
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
                return GDICamera.internal_static_GDI_Proto_Camera_ConfigurationRequest_descriptor;
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

            @Override // com.garmin.proto.generated.GDICamera.ConfigurationRequestOrBuilder
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

            @Override // com.garmin.proto.generated.GDICamera.ConfigurationRequestOrBuilder
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
                return GDICamera.internal_static_GDI_Proto_Camera_ConfigurationRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDICamera.ConfigurationRequestOrBuilder
            public boolean hasConfig() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDICamera.internal_static_GDI_Proto_Camera_ConfigurationRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(ConfigurationRequest.class, Builder.class);
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
        public static final Parser<ConfigurationResponse> PARSER = new AbstractParser<ConfigurationResponse>() { // from class: com.garmin.proto.generated.GDICamera.ConfigurationResponse.1
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
            return GDICamera.internal_static_GDI_Proto_Camera_ConfigurationResponse_descriptor;
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

        @Override // com.garmin.proto.generated.GDICamera.ConfigurationResponseOrBuilder
        public Configuration getConfig() {
            Configuration configuration = this.config_;
            return configuration == null ? Configuration.getDefaultInstance() : configuration;
        }

        @Override // com.garmin.proto.generated.GDICamera.ConfigurationResponseOrBuilder
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

        @Override // com.garmin.proto.generated.GDICamera.ConfigurationResponseOrBuilder
        public ConfigurationStatus getStatus() {
            ConfigurationStatus configurationStatusForNumber = ConfigurationStatus.forNumber(this.status_);
            return configurationStatusForNumber == null ? ConfigurationStatus.CONFIGURATION_STATUS_UNKNOWN : configurationStatusForNumber;
        }

        @Override // com.garmin.proto.generated.GDICamera.ConfigurationResponseOrBuilder
        public boolean hasConfig() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDICamera.ConfigurationResponseOrBuilder
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
            return GDICamera.internal_static_GDI_Proto_Camera_ConfigurationResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(ConfigurationResponse.class, Builder.class);
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
                return GDICamera.internal_static_GDI_Proto_Camera_ConfigurationResponse_descriptor;
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

            @Override // com.garmin.proto.generated.GDICamera.ConfigurationResponseOrBuilder
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

            @Override // com.garmin.proto.generated.GDICamera.ConfigurationResponseOrBuilder
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
                return GDICamera.internal_static_GDI_Proto_Camera_ConfigurationResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDICamera.ConfigurationResponseOrBuilder
            public ConfigurationStatus getStatus() {
                ConfigurationStatus configurationStatusForNumber = ConfigurationStatus.forNumber(this.status_);
                return configurationStatusForNumber == null ? ConfigurationStatus.CONFIGURATION_STATUS_UNKNOWN : configurationStatusForNumber;
            }

            @Override // com.garmin.proto.generated.GDICamera.ConfigurationResponseOrBuilder
            public boolean hasConfig() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDICamera.ConfigurationResponseOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDICamera.internal_static_GDI_Proto_Camera_ConfigurationResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(ConfigurationResponse.class, Builder.class);
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
                                    if (ConfigurationStatus.forNumber(i14) == null) {
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

            public Builder setStatus(ConfigurationStatus configurationStatus) {
                configurationStatus.getClass();
                this.bitField0_ |= 1;
                this.status_ = configurationStatus.getNumber();
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

        public enum ConfigurationStatus implements ProtocolMessageEnum {
            CONFIGURATION_STATUS_UNKNOWN(0),
            CONFIGURATION_STATUS_REJECTED(1),
            CONFIGURATION_STATUS_ACCEPTED(2);

            public static final int CONFIGURATION_STATUS_ACCEPTED_VALUE = 2;
            public static final int CONFIGURATION_STATUS_REJECTED_VALUE = 1;
            public static final int CONFIGURATION_STATUS_UNKNOWN_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<ConfigurationStatus> internalValueMap = new Internal.EnumLiteMap<ConfigurationStatus>() { // from class: com.garmin.proto.generated.GDICamera.ConfigurationResponse.ConfigurationStatus.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public ConfigurationStatus findValueByNumber(int i14) {
                    return ConfigurationStatus.forNumber(i14);
                }
            };
            private static final ConfigurationStatus[] VALUES = values();

            ConfigurationStatus(int i14) {
                this.value = i14;
            }

            public static ConfigurationStatus forNumber(int i14) {
                if (i14 == 0) {
                    return CONFIGURATION_STATUS_UNKNOWN;
                }
                if (i14 == 1) {
                    return CONFIGURATION_STATUS_REJECTED;
                }
                if (i14 != 2) {
                    return null;
                }
                return CONFIGURATION_STATUS_ACCEPTED;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return ConfigurationResponse.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<ConfigurationStatus> internalGetValueMap() {
                return internalValueMap;
            }

            public static ConfigurationStatus valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static ConfigurationStatus valueOf(int i14) {
                return forNumber(i14);
            }
        }
    }

    public static final class Service extends GeneratedMessageV3 implements ServiceOrBuilder {
        public static final int CAPTURE_NOTIFICATION_FIELD_NUMBER = 6;
        public static final int CAPTURE_REQUEST_FIELD_NUMBER = 4;
        public static final int CAPTURE_RESPONSE_FIELD_NUMBER = 5;
        public static final int CONFIG_NOTIFICATION_FIELD_NUMBER = 3;
        public static final int CONFIG_REQUEST_FIELD_NUMBER = 1;
        public static final int CONFIG_RESPONSE_FIELD_NUMBER = 2;
        private static final Service DEFAULT_INSTANCE = new Service();

        @Deprecated
        public static final Parser<Service> PARSER = new AbstractParser<Service>() { // from class: com.garmin.proto.generated.GDICamera.Service.1
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
        public static final int SNAPSHOT_NOTIFICATION_FIELD_NUMBER = 9;
        public static final int SNAPSHOT_REQUEST_FIELD_NUMBER = 7;
        public static final int SNAPSHOT_RESPONSE_FIELD_NUMBER = 8;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private CaptureNotification captureNotification_;
        private CaptureRequest captureRequest_;
        private CaptureResponse captureResponse_;
        private ConfigurationNotification configNotification_;
        private ConfigurationRequest configRequest_;
        private ConfigurationResponse configResponse_;
        private byte memoizedIsInitialized;
        private SnapshotNotification snapshotNotification_;
        private SnapshotRequest snapshotRequest_;
        private SnapshotResponse snapshotResponse_;

        private Service(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Service getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDICamera.internal_static_GDI_Proto_Camera_Service_descriptor;
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
            if (hasConfigRequest() != service.hasConfigRequest()) {
                return false;
            }
            if ((hasConfigRequest() && !getConfigRequest().equals(service.getConfigRequest())) || hasConfigResponse() != service.hasConfigResponse()) {
                return false;
            }
            if ((hasConfigResponse() && !getConfigResponse().equals(service.getConfigResponse())) || hasConfigNotification() != service.hasConfigNotification()) {
                return false;
            }
            if ((hasConfigNotification() && !getConfigNotification().equals(service.getConfigNotification())) || hasCaptureRequest() != service.hasCaptureRequest()) {
                return false;
            }
            if ((hasCaptureRequest() && !getCaptureRequest().equals(service.getCaptureRequest())) || hasCaptureResponse() != service.hasCaptureResponse()) {
                return false;
            }
            if ((hasCaptureResponse() && !getCaptureResponse().equals(service.getCaptureResponse())) || hasCaptureNotification() != service.hasCaptureNotification()) {
                return false;
            }
            if ((hasCaptureNotification() && !getCaptureNotification().equals(service.getCaptureNotification())) || hasSnapshotRequest() != service.hasSnapshotRequest()) {
                return false;
            }
            if ((hasSnapshotRequest() && !getSnapshotRequest().equals(service.getSnapshotRequest())) || hasSnapshotResponse() != service.hasSnapshotResponse()) {
                return false;
            }
            if ((!hasSnapshotResponse() || getSnapshotResponse().equals(service.getSnapshotResponse())) && hasSnapshotNotification() == service.hasSnapshotNotification()) {
                return (!hasSnapshotNotification() || getSnapshotNotification().equals(service.getSnapshotNotification())) && getUnknownFields().equals(service.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDICamera.ServiceOrBuilder
        public CaptureNotification getCaptureNotification() {
            CaptureNotification captureNotification = this.captureNotification_;
            return captureNotification == null ? CaptureNotification.getDefaultInstance() : captureNotification;
        }

        @Override // com.garmin.proto.generated.GDICamera.ServiceOrBuilder
        public CaptureNotificationOrBuilder getCaptureNotificationOrBuilder() {
            CaptureNotification captureNotification = this.captureNotification_;
            return captureNotification == null ? CaptureNotification.getDefaultInstance() : captureNotification;
        }

        @Override // com.garmin.proto.generated.GDICamera.ServiceOrBuilder
        public CaptureRequest getCaptureRequest() {
            CaptureRequest captureRequest = this.captureRequest_;
            return captureRequest == null ? CaptureRequest.getDefaultInstance() : captureRequest;
        }

        @Override // com.garmin.proto.generated.GDICamera.ServiceOrBuilder
        public CaptureRequestOrBuilder getCaptureRequestOrBuilder() {
            CaptureRequest captureRequest = this.captureRequest_;
            return captureRequest == null ? CaptureRequest.getDefaultInstance() : captureRequest;
        }

        @Override // com.garmin.proto.generated.GDICamera.ServiceOrBuilder
        public CaptureResponse getCaptureResponse() {
            CaptureResponse captureResponse = this.captureResponse_;
            return captureResponse == null ? CaptureResponse.getDefaultInstance() : captureResponse;
        }

        @Override // com.garmin.proto.generated.GDICamera.ServiceOrBuilder
        public CaptureResponseOrBuilder getCaptureResponseOrBuilder() {
            CaptureResponse captureResponse = this.captureResponse_;
            return captureResponse == null ? CaptureResponse.getDefaultInstance() : captureResponse;
        }

        @Override // com.garmin.proto.generated.GDICamera.ServiceOrBuilder
        public ConfigurationNotification getConfigNotification() {
            ConfigurationNotification configurationNotification = this.configNotification_;
            return configurationNotification == null ? ConfigurationNotification.getDefaultInstance() : configurationNotification;
        }

        @Override // com.garmin.proto.generated.GDICamera.ServiceOrBuilder
        public ConfigurationNotificationOrBuilder getConfigNotificationOrBuilder() {
            ConfigurationNotification configurationNotification = this.configNotification_;
            return configurationNotification == null ? ConfigurationNotification.getDefaultInstance() : configurationNotification;
        }

        @Override // com.garmin.proto.generated.GDICamera.ServiceOrBuilder
        public ConfigurationRequest getConfigRequest() {
            ConfigurationRequest configurationRequest = this.configRequest_;
            return configurationRequest == null ? ConfigurationRequest.getDefaultInstance() : configurationRequest;
        }

        @Override // com.garmin.proto.generated.GDICamera.ServiceOrBuilder
        public ConfigurationRequestOrBuilder getConfigRequestOrBuilder() {
            ConfigurationRequest configurationRequest = this.configRequest_;
            return configurationRequest == null ? ConfigurationRequest.getDefaultInstance() : configurationRequest;
        }

        @Override // com.garmin.proto.generated.GDICamera.ServiceOrBuilder
        public ConfigurationResponse getConfigResponse() {
            ConfigurationResponse configurationResponse = this.configResponse_;
            return configurationResponse == null ? ConfigurationResponse.getDefaultInstance() : configurationResponse;
        }

        @Override // com.garmin.proto.generated.GDICamera.ServiceOrBuilder
        public ConfigurationResponseOrBuilder getConfigResponseOrBuilder() {
            ConfigurationResponse configurationResponse = this.configResponse_;
            return configurationResponse == null ? ConfigurationResponse.getDefaultInstance() : configurationResponse;
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
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getConfigRequest()) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, getConfigResponse());
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(3, getConfigNotification());
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(4, getCaptureRequest());
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(5, getCaptureResponse());
            }
            if ((this.bitField0_ & 32) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(6, getCaptureNotification());
            }
            if ((this.bitField0_ & 64) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(7, getSnapshotRequest());
            }
            if ((this.bitField0_ & 128) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(8, getSnapshotResponse());
            }
            if ((this.bitField0_ & 256) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(9, getSnapshotNotification());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDICamera.ServiceOrBuilder
        public SnapshotNotification getSnapshotNotification() {
            SnapshotNotification snapshotNotification = this.snapshotNotification_;
            return snapshotNotification == null ? SnapshotNotification.getDefaultInstance() : snapshotNotification;
        }

        @Override // com.garmin.proto.generated.GDICamera.ServiceOrBuilder
        public SnapshotNotificationOrBuilder getSnapshotNotificationOrBuilder() {
            SnapshotNotification snapshotNotification = this.snapshotNotification_;
            return snapshotNotification == null ? SnapshotNotification.getDefaultInstance() : snapshotNotification;
        }

        @Override // com.garmin.proto.generated.GDICamera.ServiceOrBuilder
        public SnapshotRequest getSnapshotRequest() {
            SnapshotRequest snapshotRequest = this.snapshotRequest_;
            return snapshotRequest == null ? SnapshotRequest.getDefaultInstance() : snapshotRequest;
        }

        @Override // com.garmin.proto.generated.GDICamera.ServiceOrBuilder
        public SnapshotRequestOrBuilder getSnapshotRequestOrBuilder() {
            SnapshotRequest snapshotRequest = this.snapshotRequest_;
            return snapshotRequest == null ? SnapshotRequest.getDefaultInstance() : snapshotRequest;
        }

        @Override // com.garmin.proto.generated.GDICamera.ServiceOrBuilder
        public SnapshotResponse getSnapshotResponse() {
            SnapshotResponse snapshotResponse = this.snapshotResponse_;
            return snapshotResponse == null ? SnapshotResponse.getDefaultInstance() : snapshotResponse;
        }

        @Override // com.garmin.proto.generated.GDICamera.ServiceOrBuilder
        public SnapshotResponseOrBuilder getSnapshotResponseOrBuilder() {
            SnapshotResponse snapshotResponse = this.snapshotResponse_;
            return snapshotResponse == null ? SnapshotResponse.getDefaultInstance() : snapshotResponse;
        }

        @Override // com.garmin.proto.generated.GDICamera.ServiceOrBuilder
        public boolean hasCaptureNotification() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.garmin.proto.generated.GDICamera.ServiceOrBuilder
        public boolean hasCaptureRequest() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDICamera.ServiceOrBuilder
        public boolean hasCaptureResponse() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.garmin.proto.generated.GDICamera.ServiceOrBuilder
        public boolean hasConfigNotification() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDICamera.ServiceOrBuilder
        public boolean hasConfigRequest() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDICamera.ServiceOrBuilder
        public boolean hasConfigResponse() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDICamera.ServiceOrBuilder
        public boolean hasSnapshotNotification() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // com.garmin.proto.generated.GDICamera.ServiceOrBuilder
        public boolean hasSnapshotRequest() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.garmin.proto.generated.GDICamera.ServiceOrBuilder
        public boolean hasSnapshotResponse() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasConfigRequest()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getConfigRequest().hashCode();
            }
            if (hasConfigResponse()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getConfigResponse().hashCode();
            }
            if (hasConfigNotification()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getConfigNotification().hashCode();
            }
            if (hasCaptureRequest()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getCaptureRequest().hashCode();
            }
            if (hasCaptureResponse()) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + getCaptureResponse().hashCode();
            }
            if (hasCaptureNotification()) {
                iHashCode = e5.c(iHashCode, 37, 6, 53) + getCaptureNotification().hashCode();
            }
            if (hasSnapshotRequest()) {
                iHashCode = e5.c(iHashCode, 37, 7, 53) + getSnapshotRequest().hashCode();
            }
            if (hasSnapshotResponse()) {
                iHashCode = e5.c(iHashCode, 37, 8, 53) + getSnapshotResponse().hashCode();
            }
            if (hasSnapshotNotification()) {
                iHashCode = e5.c(iHashCode, 37, 9, 53) + getSnapshotNotification().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDICamera.internal_static_GDI_Proto_Camera_Service_fieldAccessorTable.ensureFieldAccessorsInitialized(Service.class, Builder.class);
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
                codedOutputStream.writeMessage(1, getConfigRequest());
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeMessage(2, getConfigResponse());
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeMessage(3, getConfigNotification());
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeMessage(4, getCaptureRequest());
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeMessage(5, getCaptureResponse());
            }
            if ((this.bitField0_ & 32) != 0) {
                codedOutputStream.writeMessage(6, getCaptureNotification());
            }
            if ((this.bitField0_ & 64) != 0) {
                codedOutputStream.writeMessage(7, getSnapshotRequest());
            }
            if ((this.bitField0_ & 128) != 0) {
                codedOutputStream.writeMessage(8, getSnapshotResponse());
            }
            if ((this.bitField0_ & 256) != 0) {
                codedOutputStream.writeMessage(9, getSnapshotNotification());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ServiceOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<CaptureNotification, CaptureNotification.Builder, CaptureNotificationOrBuilder> captureNotificationBuilder_;
            private CaptureNotification captureNotification_;
            private SingleFieldBuilderV3<CaptureRequest, CaptureRequest.Builder, CaptureRequestOrBuilder> captureRequestBuilder_;
            private CaptureRequest captureRequest_;
            private SingleFieldBuilderV3<CaptureResponse, CaptureResponse.Builder, CaptureResponseOrBuilder> captureResponseBuilder_;
            private CaptureResponse captureResponse_;
            private SingleFieldBuilderV3<ConfigurationNotification, ConfigurationNotification.Builder, ConfigurationNotificationOrBuilder> configNotificationBuilder_;
            private ConfigurationNotification configNotification_;
            private SingleFieldBuilderV3<ConfigurationRequest, ConfigurationRequest.Builder, ConfigurationRequestOrBuilder> configRequestBuilder_;
            private ConfigurationRequest configRequest_;
            private SingleFieldBuilderV3<ConfigurationResponse, ConfigurationResponse.Builder, ConfigurationResponseOrBuilder> configResponseBuilder_;
            private ConfigurationResponse configResponse_;
            private SingleFieldBuilderV3<SnapshotNotification, SnapshotNotification.Builder, SnapshotNotificationOrBuilder> snapshotNotificationBuilder_;
            private SnapshotNotification snapshotNotification_;
            private SingleFieldBuilderV3<SnapshotRequest, SnapshotRequest.Builder, SnapshotRequestOrBuilder> snapshotRequestBuilder_;
            private SnapshotRequest snapshotRequest_;
            private SingleFieldBuilderV3<SnapshotResponse, SnapshotResponse.Builder, SnapshotResponseOrBuilder> snapshotResponseBuilder_;
            private SnapshotResponse snapshotResponse_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(Service service) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    SingleFieldBuilderV3<ConfigurationRequest, ConfigurationRequest.Builder, ConfigurationRequestOrBuilder> singleFieldBuilderV3 = this.configRequestBuilder_;
                    service.configRequest_ = singleFieldBuilderV3 == null ? this.configRequest_ : (ConfigurationRequest) singleFieldBuilderV3.build();
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    SingleFieldBuilderV3<ConfigurationResponse, ConfigurationResponse.Builder, ConfigurationResponseOrBuilder> singleFieldBuilderV4 = this.configResponseBuilder_;
                    service.configResponse_ = singleFieldBuilderV4 == null ? this.configResponse_ : (ConfigurationResponse) singleFieldBuilderV4.build();
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    SingleFieldBuilderV3<ConfigurationNotification, ConfigurationNotification.Builder, ConfigurationNotificationOrBuilder> singleFieldBuilderV5 = this.configNotificationBuilder_;
                    service.configNotification_ = singleFieldBuilderV5 == null ? this.configNotification_ : (ConfigurationNotification) singleFieldBuilderV5.build();
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    SingleFieldBuilderV3<CaptureRequest, CaptureRequest.Builder, CaptureRequestOrBuilder> singleFieldBuilderV6 = this.captureRequestBuilder_;
                    service.captureRequest_ = singleFieldBuilderV6 == null ? this.captureRequest_ : (CaptureRequest) singleFieldBuilderV6.build();
                    i14 |= 8;
                }
                if ((i15 & 16) != 0) {
                    SingleFieldBuilderV3<CaptureResponse, CaptureResponse.Builder, CaptureResponseOrBuilder> singleFieldBuilderV7 = this.captureResponseBuilder_;
                    service.captureResponse_ = singleFieldBuilderV7 == null ? this.captureResponse_ : (CaptureResponse) singleFieldBuilderV7.build();
                    i14 |= 16;
                }
                if ((i15 & 32) != 0) {
                    SingleFieldBuilderV3<CaptureNotification, CaptureNotification.Builder, CaptureNotificationOrBuilder> singleFieldBuilderV8 = this.captureNotificationBuilder_;
                    service.captureNotification_ = singleFieldBuilderV8 == null ? this.captureNotification_ : (CaptureNotification) singleFieldBuilderV8.build();
                    i14 |= 32;
                }
                if ((i15 & 64) != 0) {
                    SingleFieldBuilderV3<SnapshotRequest, SnapshotRequest.Builder, SnapshotRequestOrBuilder> singleFieldBuilderV9 = this.snapshotRequestBuilder_;
                    service.snapshotRequest_ = singleFieldBuilderV9 == null ? this.snapshotRequest_ : (SnapshotRequest) singleFieldBuilderV9.build();
                    i14 |= 64;
                }
                if ((i15 & 128) != 0) {
                    SingleFieldBuilderV3<SnapshotResponse, SnapshotResponse.Builder, SnapshotResponseOrBuilder> singleFieldBuilderV10 = this.snapshotResponseBuilder_;
                    service.snapshotResponse_ = singleFieldBuilderV10 == null ? this.snapshotResponse_ : (SnapshotResponse) singleFieldBuilderV10.build();
                    i14 |= 128;
                }
                if ((i15 & 256) != 0) {
                    SingleFieldBuilderV3<SnapshotNotification, SnapshotNotification.Builder, SnapshotNotificationOrBuilder> singleFieldBuilderV11 = this.snapshotNotificationBuilder_;
                    service.snapshotNotification_ = singleFieldBuilderV11 == null ? this.snapshotNotification_ : (SnapshotNotification) singleFieldBuilderV11.build();
                    i14 |= 256;
                }
                service.bitField0_ |= i14;
            }

            private SingleFieldBuilderV3<CaptureNotification, CaptureNotification.Builder, CaptureNotificationOrBuilder> getCaptureNotificationFieldBuilder() {
                if (this.captureNotificationBuilder_ == null) {
                    this.captureNotificationBuilder_ = new SingleFieldBuilderV3<>(getCaptureNotification(), getParentForChildren(), isClean());
                    this.captureNotification_ = null;
                }
                return this.captureNotificationBuilder_;
            }

            private SingleFieldBuilderV3<CaptureRequest, CaptureRequest.Builder, CaptureRequestOrBuilder> getCaptureRequestFieldBuilder() {
                if (this.captureRequestBuilder_ == null) {
                    this.captureRequestBuilder_ = new SingleFieldBuilderV3<>(getCaptureRequest(), getParentForChildren(), isClean());
                    this.captureRequest_ = null;
                }
                return this.captureRequestBuilder_;
            }

            private SingleFieldBuilderV3<CaptureResponse, CaptureResponse.Builder, CaptureResponseOrBuilder> getCaptureResponseFieldBuilder() {
                if (this.captureResponseBuilder_ == null) {
                    this.captureResponseBuilder_ = new SingleFieldBuilderV3<>(getCaptureResponse(), getParentForChildren(), isClean());
                    this.captureResponse_ = null;
                }
                return this.captureResponseBuilder_;
            }

            private SingleFieldBuilderV3<ConfigurationNotification, ConfigurationNotification.Builder, ConfigurationNotificationOrBuilder> getConfigNotificationFieldBuilder() {
                if (this.configNotificationBuilder_ == null) {
                    this.configNotificationBuilder_ = new SingleFieldBuilderV3<>(getConfigNotification(), getParentForChildren(), isClean());
                    this.configNotification_ = null;
                }
                return this.configNotificationBuilder_;
            }

            private SingleFieldBuilderV3<ConfigurationRequest, ConfigurationRequest.Builder, ConfigurationRequestOrBuilder> getConfigRequestFieldBuilder() {
                if (this.configRequestBuilder_ == null) {
                    this.configRequestBuilder_ = new SingleFieldBuilderV3<>(getConfigRequest(), getParentForChildren(), isClean());
                    this.configRequest_ = null;
                }
                return this.configRequestBuilder_;
            }

            private SingleFieldBuilderV3<ConfigurationResponse, ConfigurationResponse.Builder, ConfigurationResponseOrBuilder> getConfigResponseFieldBuilder() {
                if (this.configResponseBuilder_ == null) {
                    this.configResponseBuilder_ = new SingleFieldBuilderV3<>(getConfigResponse(), getParentForChildren(), isClean());
                    this.configResponse_ = null;
                }
                return this.configResponseBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDICamera.internal_static_GDI_Proto_Camera_Service_descriptor;
            }

            private SingleFieldBuilderV3<SnapshotNotification, SnapshotNotification.Builder, SnapshotNotificationOrBuilder> getSnapshotNotificationFieldBuilder() {
                if (this.snapshotNotificationBuilder_ == null) {
                    this.snapshotNotificationBuilder_ = new SingleFieldBuilderV3<>(getSnapshotNotification(), getParentForChildren(), isClean());
                    this.snapshotNotification_ = null;
                }
                return this.snapshotNotificationBuilder_;
            }

            private SingleFieldBuilderV3<SnapshotRequest, SnapshotRequest.Builder, SnapshotRequestOrBuilder> getSnapshotRequestFieldBuilder() {
                if (this.snapshotRequestBuilder_ == null) {
                    this.snapshotRequestBuilder_ = new SingleFieldBuilderV3<>(getSnapshotRequest(), getParentForChildren(), isClean());
                    this.snapshotRequest_ = null;
                }
                return this.snapshotRequestBuilder_;
            }

            private SingleFieldBuilderV3<SnapshotResponse, SnapshotResponse.Builder, SnapshotResponseOrBuilder> getSnapshotResponseFieldBuilder() {
                if (this.snapshotResponseBuilder_ == null) {
                    this.snapshotResponseBuilder_ = new SingleFieldBuilderV3<>(getSnapshotResponse(), getParentForChildren(), isClean());
                    this.snapshotResponse_ = null;
                }
                return this.snapshotResponseBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getConfigRequestFieldBuilder();
                    getConfigResponseFieldBuilder();
                    getConfigNotificationFieldBuilder();
                    getCaptureRequestFieldBuilder();
                    getCaptureResponseFieldBuilder();
                    getCaptureNotificationFieldBuilder();
                    getSnapshotRequestFieldBuilder();
                    getSnapshotResponseFieldBuilder();
                    getSnapshotNotificationFieldBuilder();
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
                this.configRequest_ = null;
                SingleFieldBuilderV3<ConfigurationRequest, ConfigurationRequest.Builder, ConfigurationRequestOrBuilder> singleFieldBuilderV3 = this.configRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.configRequestBuilder_ = null;
                }
                this.configResponse_ = null;
                SingleFieldBuilderV3<ConfigurationResponse, ConfigurationResponse.Builder, ConfigurationResponseOrBuilder> singleFieldBuilderV4 = this.configResponseBuilder_;
                if (singleFieldBuilderV4 != null) {
                    singleFieldBuilderV4.dispose();
                    this.configResponseBuilder_ = null;
                }
                this.configNotification_ = null;
                SingleFieldBuilderV3<ConfigurationNotification, ConfigurationNotification.Builder, ConfigurationNotificationOrBuilder> singleFieldBuilderV5 = this.configNotificationBuilder_;
                if (singleFieldBuilderV5 != null) {
                    singleFieldBuilderV5.dispose();
                    this.configNotificationBuilder_ = null;
                }
                this.captureRequest_ = null;
                SingleFieldBuilderV3<CaptureRequest, CaptureRequest.Builder, CaptureRequestOrBuilder> singleFieldBuilderV6 = this.captureRequestBuilder_;
                if (singleFieldBuilderV6 != null) {
                    singleFieldBuilderV6.dispose();
                    this.captureRequestBuilder_ = null;
                }
                this.captureResponse_ = null;
                SingleFieldBuilderV3<CaptureResponse, CaptureResponse.Builder, CaptureResponseOrBuilder> singleFieldBuilderV7 = this.captureResponseBuilder_;
                if (singleFieldBuilderV7 != null) {
                    singleFieldBuilderV7.dispose();
                    this.captureResponseBuilder_ = null;
                }
                this.captureNotification_ = null;
                SingleFieldBuilderV3<CaptureNotification, CaptureNotification.Builder, CaptureNotificationOrBuilder> singleFieldBuilderV8 = this.captureNotificationBuilder_;
                if (singleFieldBuilderV8 != null) {
                    singleFieldBuilderV8.dispose();
                    this.captureNotificationBuilder_ = null;
                }
                this.snapshotRequest_ = null;
                SingleFieldBuilderV3<SnapshotRequest, SnapshotRequest.Builder, SnapshotRequestOrBuilder> singleFieldBuilderV9 = this.snapshotRequestBuilder_;
                if (singleFieldBuilderV9 != null) {
                    singleFieldBuilderV9.dispose();
                    this.snapshotRequestBuilder_ = null;
                }
                this.snapshotResponse_ = null;
                SingleFieldBuilderV3<SnapshotResponse, SnapshotResponse.Builder, SnapshotResponseOrBuilder> singleFieldBuilderV10 = this.snapshotResponseBuilder_;
                if (singleFieldBuilderV10 != null) {
                    singleFieldBuilderV10.dispose();
                    this.snapshotResponseBuilder_ = null;
                }
                this.snapshotNotification_ = null;
                SingleFieldBuilderV3<SnapshotNotification, SnapshotNotification.Builder, SnapshotNotificationOrBuilder> singleFieldBuilderV11 = this.snapshotNotificationBuilder_;
                if (singleFieldBuilderV11 != null) {
                    singleFieldBuilderV11.dispose();
                    this.snapshotNotificationBuilder_ = null;
                }
                return this;
            }

            public Builder clearCaptureNotification() {
                this.bitField0_ &= -33;
                this.captureNotification_ = null;
                SingleFieldBuilderV3<CaptureNotification, CaptureNotification.Builder, CaptureNotificationOrBuilder> singleFieldBuilderV3 = this.captureNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.captureNotificationBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearCaptureRequest() {
                this.bitField0_ &= -9;
                this.captureRequest_ = null;
                SingleFieldBuilderV3<CaptureRequest, CaptureRequest.Builder, CaptureRequestOrBuilder> singleFieldBuilderV3 = this.captureRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.captureRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearCaptureResponse() {
                this.bitField0_ &= -17;
                this.captureResponse_ = null;
                SingleFieldBuilderV3<CaptureResponse, CaptureResponse.Builder, CaptureResponseOrBuilder> singleFieldBuilderV3 = this.captureResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.captureResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearConfigNotification() {
                this.bitField0_ &= -5;
                this.configNotification_ = null;
                SingleFieldBuilderV3<ConfigurationNotification, ConfigurationNotification.Builder, ConfigurationNotificationOrBuilder> singleFieldBuilderV3 = this.configNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.configNotificationBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearConfigRequest() {
                this.bitField0_ &= -2;
                this.configRequest_ = null;
                SingleFieldBuilderV3<ConfigurationRequest, ConfigurationRequest.Builder, ConfigurationRequestOrBuilder> singleFieldBuilderV3 = this.configRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.configRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearConfigResponse() {
                this.bitField0_ &= -3;
                this.configResponse_ = null;
                SingleFieldBuilderV3<ConfigurationResponse, ConfigurationResponse.Builder, ConfigurationResponseOrBuilder> singleFieldBuilderV3 = this.configResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.configResponseBuilder_ = null;
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

            public Builder clearSnapshotNotification() {
                this.bitField0_ &= -257;
                this.snapshotNotification_ = null;
                SingleFieldBuilderV3<SnapshotNotification, SnapshotNotification.Builder, SnapshotNotificationOrBuilder> singleFieldBuilderV3 = this.snapshotNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.snapshotNotificationBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearSnapshotRequest() {
                this.bitField0_ &= -65;
                this.snapshotRequest_ = null;
                SingleFieldBuilderV3<SnapshotRequest, SnapshotRequest.Builder, SnapshotRequestOrBuilder> singleFieldBuilderV3 = this.snapshotRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.snapshotRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearSnapshotResponse() {
                this.bitField0_ &= -129;
                this.snapshotResponse_ = null;
                SingleFieldBuilderV3<SnapshotResponse, SnapshotResponse.Builder, SnapshotResponseOrBuilder> singleFieldBuilderV3 = this.snapshotResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.snapshotResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.proto.generated.GDICamera.ServiceOrBuilder
            public CaptureNotification getCaptureNotification() {
                SingleFieldBuilderV3<CaptureNotification, CaptureNotification.Builder, CaptureNotificationOrBuilder> singleFieldBuilderV3 = this.captureNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (CaptureNotification) singleFieldBuilderV3.getMessage();
                }
                CaptureNotification captureNotification = this.captureNotification_;
                return captureNotification == null ? CaptureNotification.getDefaultInstance() : captureNotification;
            }

            public CaptureNotification.Builder getCaptureNotificationBuilder() {
                this.bitField0_ |= 32;
                onChanged();
                return (CaptureNotification.Builder) getCaptureNotificationFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDICamera.ServiceOrBuilder
            public CaptureNotificationOrBuilder getCaptureNotificationOrBuilder() {
                SingleFieldBuilderV3<CaptureNotification, CaptureNotification.Builder, CaptureNotificationOrBuilder> singleFieldBuilderV3 = this.captureNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (CaptureNotificationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                CaptureNotification captureNotification = this.captureNotification_;
                return captureNotification == null ? CaptureNotification.getDefaultInstance() : captureNotification;
            }

            @Override // com.garmin.proto.generated.GDICamera.ServiceOrBuilder
            public CaptureRequest getCaptureRequest() {
                SingleFieldBuilderV3<CaptureRequest, CaptureRequest.Builder, CaptureRequestOrBuilder> singleFieldBuilderV3 = this.captureRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (CaptureRequest) singleFieldBuilderV3.getMessage();
                }
                CaptureRequest captureRequest = this.captureRequest_;
                return captureRequest == null ? CaptureRequest.getDefaultInstance() : captureRequest;
            }

            public CaptureRequest.Builder getCaptureRequestBuilder() {
                this.bitField0_ |= 8;
                onChanged();
                return (CaptureRequest.Builder) getCaptureRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDICamera.ServiceOrBuilder
            public CaptureRequestOrBuilder getCaptureRequestOrBuilder() {
                SingleFieldBuilderV3<CaptureRequest, CaptureRequest.Builder, CaptureRequestOrBuilder> singleFieldBuilderV3 = this.captureRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (CaptureRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                CaptureRequest captureRequest = this.captureRequest_;
                return captureRequest == null ? CaptureRequest.getDefaultInstance() : captureRequest;
            }

            @Override // com.garmin.proto.generated.GDICamera.ServiceOrBuilder
            public CaptureResponse getCaptureResponse() {
                SingleFieldBuilderV3<CaptureResponse, CaptureResponse.Builder, CaptureResponseOrBuilder> singleFieldBuilderV3 = this.captureResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (CaptureResponse) singleFieldBuilderV3.getMessage();
                }
                CaptureResponse captureResponse = this.captureResponse_;
                return captureResponse == null ? CaptureResponse.getDefaultInstance() : captureResponse;
            }

            public CaptureResponse.Builder getCaptureResponseBuilder() {
                this.bitField0_ |= 16;
                onChanged();
                return (CaptureResponse.Builder) getCaptureResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDICamera.ServiceOrBuilder
            public CaptureResponseOrBuilder getCaptureResponseOrBuilder() {
                SingleFieldBuilderV3<CaptureResponse, CaptureResponse.Builder, CaptureResponseOrBuilder> singleFieldBuilderV3 = this.captureResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (CaptureResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                CaptureResponse captureResponse = this.captureResponse_;
                return captureResponse == null ? CaptureResponse.getDefaultInstance() : captureResponse;
            }

            @Override // com.garmin.proto.generated.GDICamera.ServiceOrBuilder
            public ConfigurationNotification getConfigNotification() {
                SingleFieldBuilderV3<ConfigurationNotification, ConfigurationNotification.Builder, ConfigurationNotificationOrBuilder> singleFieldBuilderV3 = this.configNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ConfigurationNotification) singleFieldBuilderV3.getMessage();
                }
                ConfigurationNotification configurationNotification = this.configNotification_;
                return configurationNotification == null ? ConfigurationNotification.getDefaultInstance() : configurationNotification;
            }

            public ConfigurationNotification.Builder getConfigNotificationBuilder() {
                this.bitField0_ |= 4;
                onChanged();
                return (ConfigurationNotification.Builder) getConfigNotificationFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDICamera.ServiceOrBuilder
            public ConfigurationNotificationOrBuilder getConfigNotificationOrBuilder() {
                SingleFieldBuilderV3<ConfigurationNotification, ConfigurationNotification.Builder, ConfigurationNotificationOrBuilder> singleFieldBuilderV3 = this.configNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ConfigurationNotificationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                ConfigurationNotification configurationNotification = this.configNotification_;
                return configurationNotification == null ? ConfigurationNotification.getDefaultInstance() : configurationNotification;
            }

            @Override // com.garmin.proto.generated.GDICamera.ServiceOrBuilder
            public ConfigurationRequest getConfigRequest() {
                SingleFieldBuilderV3<ConfigurationRequest, ConfigurationRequest.Builder, ConfigurationRequestOrBuilder> singleFieldBuilderV3 = this.configRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ConfigurationRequest) singleFieldBuilderV3.getMessage();
                }
                ConfigurationRequest configurationRequest = this.configRequest_;
                return configurationRequest == null ? ConfigurationRequest.getDefaultInstance() : configurationRequest;
            }

            public ConfigurationRequest.Builder getConfigRequestBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (ConfigurationRequest.Builder) getConfigRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDICamera.ServiceOrBuilder
            public ConfigurationRequestOrBuilder getConfigRequestOrBuilder() {
                SingleFieldBuilderV3<ConfigurationRequest, ConfigurationRequest.Builder, ConfigurationRequestOrBuilder> singleFieldBuilderV3 = this.configRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ConfigurationRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                ConfigurationRequest configurationRequest = this.configRequest_;
                return configurationRequest == null ? ConfigurationRequest.getDefaultInstance() : configurationRequest;
            }

            @Override // com.garmin.proto.generated.GDICamera.ServiceOrBuilder
            public ConfigurationResponse getConfigResponse() {
                SingleFieldBuilderV3<ConfigurationResponse, ConfigurationResponse.Builder, ConfigurationResponseOrBuilder> singleFieldBuilderV3 = this.configResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ConfigurationResponse) singleFieldBuilderV3.getMessage();
                }
                ConfigurationResponse configurationResponse = this.configResponse_;
                return configurationResponse == null ? ConfigurationResponse.getDefaultInstance() : configurationResponse;
            }

            public ConfigurationResponse.Builder getConfigResponseBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (ConfigurationResponse.Builder) getConfigResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDICamera.ServiceOrBuilder
            public ConfigurationResponseOrBuilder getConfigResponseOrBuilder() {
                SingleFieldBuilderV3<ConfigurationResponse, ConfigurationResponse.Builder, ConfigurationResponseOrBuilder> singleFieldBuilderV3 = this.configResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ConfigurationResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                ConfigurationResponse configurationResponse = this.configResponse_;
                return configurationResponse == null ? ConfigurationResponse.getDefaultInstance() : configurationResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDICamera.internal_static_GDI_Proto_Camera_Service_descriptor;
            }

            @Override // com.garmin.proto.generated.GDICamera.ServiceOrBuilder
            public SnapshotNotification getSnapshotNotification() {
                SingleFieldBuilderV3<SnapshotNotification, SnapshotNotification.Builder, SnapshotNotificationOrBuilder> singleFieldBuilderV3 = this.snapshotNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SnapshotNotification) singleFieldBuilderV3.getMessage();
                }
                SnapshotNotification snapshotNotification = this.snapshotNotification_;
                return snapshotNotification == null ? SnapshotNotification.getDefaultInstance() : snapshotNotification;
            }

            public SnapshotNotification.Builder getSnapshotNotificationBuilder() {
                this.bitField0_ |= 256;
                onChanged();
                return (SnapshotNotification.Builder) getSnapshotNotificationFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDICamera.ServiceOrBuilder
            public SnapshotNotificationOrBuilder getSnapshotNotificationOrBuilder() {
                SingleFieldBuilderV3<SnapshotNotification, SnapshotNotification.Builder, SnapshotNotificationOrBuilder> singleFieldBuilderV3 = this.snapshotNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SnapshotNotificationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                SnapshotNotification snapshotNotification = this.snapshotNotification_;
                return snapshotNotification == null ? SnapshotNotification.getDefaultInstance() : snapshotNotification;
            }

            @Override // com.garmin.proto.generated.GDICamera.ServiceOrBuilder
            public SnapshotRequest getSnapshotRequest() {
                SingleFieldBuilderV3<SnapshotRequest, SnapshotRequest.Builder, SnapshotRequestOrBuilder> singleFieldBuilderV3 = this.snapshotRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SnapshotRequest) singleFieldBuilderV3.getMessage();
                }
                SnapshotRequest snapshotRequest = this.snapshotRequest_;
                return snapshotRequest == null ? SnapshotRequest.getDefaultInstance() : snapshotRequest;
            }

            public SnapshotRequest.Builder getSnapshotRequestBuilder() {
                this.bitField0_ |= 64;
                onChanged();
                return (SnapshotRequest.Builder) getSnapshotRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDICamera.ServiceOrBuilder
            public SnapshotRequestOrBuilder getSnapshotRequestOrBuilder() {
                SingleFieldBuilderV3<SnapshotRequest, SnapshotRequest.Builder, SnapshotRequestOrBuilder> singleFieldBuilderV3 = this.snapshotRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SnapshotRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                SnapshotRequest snapshotRequest = this.snapshotRequest_;
                return snapshotRequest == null ? SnapshotRequest.getDefaultInstance() : snapshotRequest;
            }

            @Override // com.garmin.proto.generated.GDICamera.ServiceOrBuilder
            public SnapshotResponse getSnapshotResponse() {
                SingleFieldBuilderV3<SnapshotResponse, SnapshotResponse.Builder, SnapshotResponseOrBuilder> singleFieldBuilderV3 = this.snapshotResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SnapshotResponse) singleFieldBuilderV3.getMessage();
                }
                SnapshotResponse snapshotResponse = this.snapshotResponse_;
                return snapshotResponse == null ? SnapshotResponse.getDefaultInstance() : snapshotResponse;
            }

            public SnapshotResponse.Builder getSnapshotResponseBuilder() {
                this.bitField0_ |= 128;
                onChanged();
                return (SnapshotResponse.Builder) getSnapshotResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDICamera.ServiceOrBuilder
            public SnapshotResponseOrBuilder getSnapshotResponseOrBuilder() {
                SingleFieldBuilderV3<SnapshotResponse, SnapshotResponse.Builder, SnapshotResponseOrBuilder> singleFieldBuilderV3 = this.snapshotResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SnapshotResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                SnapshotResponse snapshotResponse = this.snapshotResponse_;
                return snapshotResponse == null ? SnapshotResponse.getDefaultInstance() : snapshotResponse;
            }

            @Override // com.garmin.proto.generated.GDICamera.ServiceOrBuilder
            public boolean hasCaptureNotification() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.garmin.proto.generated.GDICamera.ServiceOrBuilder
            public boolean hasCaptureRequest() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDICamera.ServiceOrBuilder
            public boolean hasCaptureResponse() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.garmin.proto.generated.GDICamera.ServiceOrBuilder
            public boolean hasConfigNotification() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDICamera.ServiceOrBuilder
            public boolean hasConfigRequest() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDICamera.ServiceOrBuilder
            public boolean hasConfigResponse() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDICamera.ServiceOrBuilder
            public boolean hasSnapshotNotification() {
                return (this.bitField0_ & 256) != 0;
            }

            @Override // com.garmin.proto.generated.GDICamera.ServiceOrBuilder
            public boolean hasSnapshotRequest() {
                return (this.bitField0_ & 64) != 0;
            }

            @Override // com.garmin.proto.generated.GDICamera.ServiceOrBuilder
            public boolean hasSnapshotResponse() {
                return (this.bitField0_ & 128) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDICamera.internal_static_GDI_Proto_Camera_Service_fieldAccessorTable.ensureFieldAccessorsInitialized(Service.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeCaptureNotification(CaptureNotification captureNotification) {
                CaptureNotification captureNotification2;
                SingleFieldBuilderV3<CaptureNotification, CaptureNotification.Builder, CaptureNotificationOrBuilder> singleFieldBuilderV3 = this.captureNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(captureNotification);
                } else if ((this.bitField0_ & 32) == 0 || (captureNotification2 = this.captureNotification_) == null || captureNotification2 == CaptureNotification.getDefaultInstance()) {
                    this.captureNotification_ = captureNotification;
                } else {
                    getCaptureNotificationBuilder().mergeFrom(captureNotification);
                }
                if (this.captureNotification_ != null) {
                    this.bitField0_ |= 32;
                    onChanged();
                }
                return this;
            }

            public Builder mergeCaptureRequest(CaptureRequest captureRequest) {
                CaptureRequest captureRequest2;
                SingleFieldBuilderV3<CaptureRequest, CaptureRequest.Builder, CaptureRequestOrBuilder> singleFieldBuilderV3 = this.captureRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(captureRequest);
                } else if ((this.bitField0_ & 8) == 0 || (captureRequest2 = this.captureRequest_) == null || captureRequest2 == CaptureRequest.getDefaultInstance()) {
                    this.captureRequest_ = captureRequest;
                } else {
                    getCaptureRequestBuilder().mergeFrom(captureRequest);
                }
                if (this.captureRequest_ != null) {
                    this.bitField0_ |= 8;
                    onChanged();
                }
                return this;
            }

            public Builder mergeCaptureResponse(CaptureResponse captureResponse) {
                CaptureResponse captureResponse2;
                SingleFieldBuilderV3<CaptureResponse, CaptureResponse.Builder, CaptureResponseOrBuilder> singleFieldBuilderV3 = this.captureResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(captureResponse);
                } else if ((this.bitField0_ & 16) == 0 || (captureResponse2 = this.captureResponse_) == null || captureResponse2 == CaptureResponse.getDefaultInstance()) {
                    this.captureResponse_ = captureResponse;
                } else {
                    getCaptureResponseBuilder().mergeFrom(captureResponse);
                }
                if (this.captureResponse_ != null) {
                    this.bitField0_ |= 16;
                    onChanged();
                }
                return this;
            }

            public Builder mergeConfigNotification(ConfigurationNotification configurationNotification) {
                ConfigurationNotification configurationNotification2;
                SingleFieldBuilderV3<ConfigurationNotification, ConfigurationNotification.Builder, ConfigurationNotificationOrBuilder> singleFieldBuilderV3 = this.configNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(configurationNotification);
                } else if ((this.bitField0_ & 4) == 0 || (configurationNotification2 = this.configNotification_) == null || configurationNotification2 == ConfigurationNotification.getDefaultInstance()) {
                    this.configNotification_ = configurationNotification;
                } else {
                    getConfigNotificationBuilder().mergeFrom(configurationNotification);
                }
                if (this.configNotification_ != null) {
                    this.bitField0_ |= 4;
                    onChanged();
                }
                return this;
            }

            public Builder mergeConfigRequest(ConfigurationRequest configurationRequest) {
                ConfigurationRequest configurationRequest2;
                SingleFieldBuilderV3<ConfigurationRequest, ConfigurationRequest.Builder, ConfigurationRequestOrBuilder> singleFieldBuilderV3 = this.configRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(configurationRequest);
                } else if ((this.bitField0_ & 1) == 0 || (configurationRequest2 = this.configRequest_) == null || configurationRequest2 == ConfigurationRequest.getDefaultInstance()) {
                    this.configRequest_ = configurationRequest;
                } else {
                    getConfigRequestBuilder().mergeFrom(configurationRequest);
                }
                if (this.configRequest_ != null) {
                    this.bitField0_ |= 1;
                    onChanged();
                }
                return this;
            }

            public Builder mergeConfigResponse(ConfigurationResponse configurationResponse) {
                ConfigurationResponse configurationResponse2;
                SingleFieldBuilderV3<ConfigurationResponse, ConfigurationResponse.Builder, ConfigurationResponseOrBuilder> singleFieldBuilderV3 = this.configResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(configurationResponse);
                } else if ((this.bitField0_ & 2) == 0 || (configurationResponse2 = this.configResponse_) == null || configurationResponse2 == ConfigurationResponse.getDefaultInstance()) {
                    this.configResponse_ = configurationResponse;
                } else {
                    getConfigResponseBuilder().mergeFrom(configurationResponse);
                }
                if (this.configResponse_ != null) {
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
                                    codedInputStream.readMessage(getConfigRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    codedInputStream.readMessage(getConfigResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 2;
                                } else if (tag == 26) {
                                    codedInputStream.readMessage(getConfigNotificationFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 4;
                                } else if (tag == 34) {
                                    codedInputStream.readMessage(getCaptureRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 8;
                                } else if (tag == 42) {
                                    codedInputStream.readMessage(getCaptureResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 16;
                                } else if (tag == 50) {
                                    codedInputStream.readMessage(getCaptureNotificationFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 32;
                                } else if (tag == 58) {
                                    codedInputStream.readMessage(getSnapshotRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 64;
                                } else if (tag == 66) {
                                    codedInputStream.readMessage(getSnapshotResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 128;
                                } else if (tag == 74) {
                                    codedInputStream.readMessage(getSnapshotNotificationFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder mergeSnapshotNotification(SnapshotNotification snapshotNotification) {
                SnapshotNotification snapshotNotification2;
                SingleFieldBuilderV3<SnapshotNotification, SnapshotNotification.Builder, SnapshotNotificationOrBuilder> singleFieldBuilderV3 = this.snapshotNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(snapshotNotification);
                } else if ((this.bitField0_ & 256) == 0 || (snapshotNotification2 = this.snapshotNotification_) == null || snapshotNotification2 == SnapshotNotification.getDefaultInstance()) {
                    this.snapshotNotification_ = snapshotNotification;
                } else {
                    getSnapshotNotificationBuilder().mergeFrom(snapshotNotification);
                }
                if (this.snapshotNotification_ != null) {
                    this.bitField0_ |= 256;
                    onChanged();
                }
                return this;
            }

            public Builder mergeSnapshotRequest(SnapshotRequest snapshotRequest) {
                SnapshotRequest snapshotRequest2;
                SingleFieldBuilderV3<SnapshotRequest, SnapshotRequest.Builder, SnapshotRequestOrBuilder> singleFieldBuilderV3 = this.snapshotRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(snapshotRequest);
                } else if ((this.bitField0_ & 64) == 0 || (snapshotRequest2 = this.snapshotRequest_) == null || snapshotRequest2 == SnapshotRequest.getDefaultInstance()) {
                    this.snapshotRequest_ = snapshotRequest;
                } else {
                    getSnapshotRequestBuilder().mergeFrom(snapshotRequest);
                }
                if (this.snapshotRequest_ != null) {
                    this.bitField0_ |= 64;
                    onChanged();
                }
                return this;
            }

            public Builder mergeSnapshotResponse(SnapshotResponse snapshotResponse) {
                SnapshotResponse snapshotResponse2;
                SingleFieldBuilderV3<SnapshotResponse, SnapshotResponse.Builder, SnapshotResponseOrBuilder> singleFieldBuilderV3 = this.snapshotResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(snapshotResponse);
                } else if ((this.bitField0_ & 128) == 0 || (snapshotResponse2 = this.snapshotResponse_) == null || snapshotResponse2 == SnapshotResponse.getDefaultInstance()) {
                    this.snapshotResponse_ = snapshotResponse;
                } else {
                    getSnapshotResponseBuilder().mergeFrom(snapshotResponse);
                }
                if (this.snapshotResponse_ != null) {
                    this.bitField0_ |= 128;
                    onChanged();
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder setCaptureNotification(CaptureNotification.Builder builder) {
                SingleFieldBuilderV3<CaptureNotification, CaptureNotification.Builder, CaptureNotificationOrBuilder> singleFieldBuilderV3 = this.captureNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.captureNotification_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setCaptureRequest(CaptureRequest.Builder builder) {
                SingleFieldBuilderV3<CaptureRequest, CaptureRequest.Builder, CaptureRequestOrBuilder> singleFieldBuilderV3 = this.captureRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.captureRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setCaptureResponse(CaptureResponse.Builder builder) {
                SingleFieldBuilderV3<CaptureResponse, CaptureResponse.Builder, CaptureResponseOrBuilder> singleFieldBuilderV3 = this.captureResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.captureResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setConfigNotification(ConfigurationNotification.Builder builder) {
                SingleFieldBuilderV3<ConfigurationNotification, ConfigurationNotification.Builder, ConfigurationNotificationOrBuilder> singleFieldBuilderV3 = this.configNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.configNotification_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setConfigRequest(ConfigurationRequest.Builder builder) {
                SingleFieldBuilderV3<ConfigurationRequest, ConfigurationRequest.Builder, ConfigurationRequestOrBuilder> singleFieldBuilderV3 = this.configRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.configRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setConfigResponse(ConfigurationResponse.Builder builder) {
                SingleFieldBuilderV3<ConfigurationResponse, ConfigurationResponse.Builder, ConfigurationResponseOrBuilder> singleFieldBuilderV3 = this.configResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.configResponse_ = builder.build();
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

            public Builder setSnapshotNotification(SnapshotNotification.Builder builder) {
                SingleFieldBuilderV3<SnapshotNotification, SnapshotNotification.Builder, SnapshotNotificationOrBuilder> singleFieldBuilderV3 = this.snapshotNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.snapshotNotification_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 256;
                onChanged();
                return this;
            }

            public Builder setSnapshotRequest(SnapshotRequest.Builder builder) {
                SingleFieldBuilderV3<SnapshotRequest, SnapshotRequest.Builder, SnapshotRequestOrBuilder> singleFieldBuilderV3 = this.snapshotRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.snapshotRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setSnapshotResponse(SnapshotResponse.Builder builder) {
                SingleFieldBuilderV3<SnapshotResponse, SnapshotResponse.Builder, SnapshotResponseOrBuilder> singleFieldBuilderV3 = this.snapshotResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.snapshotResponse_ = builder.build();
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

            public Builder setCaptureNotification(CaptureNotification captureNotification) {
                SingleFieldBuilderV3<CaptureNotification, CaptureNotification.Builder, CaptureNotificationOrBuilder> singleFieldBuilderV3 = this.captureNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    captureNotification.getClass();
                    this.captureNotification_ = captureNotification;
                } else {
                    singleFieldBuilderV3.setMessage(captureNotification);
                }
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setCaptureRequest(CaptureRequest captureRequest) {
                SingleFieldBuilderV3<CaptureRequest, CaptureRequest.Builder, CaptureRequestOrBuilder> singleFieldBuilderV3 = this.captureRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    captureRequest.getClass();
                    this.captureRequest_ = captureRequest;
                } else {
                    singleFieldBuilderV3.setMessage(captureRequest);
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setCaptureResponse(CaptureResponse captureResponse) {
                SingleFieldBuilderV3<CaptureResponse, CaptureResponse.Builder, CaptureResponseOrBuilder> singleFieldBuilderV3 = this.captureResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    captureResponse.getClass();
                    this.captureResponse_ = captureResponse;
                } else {
                    singleFieldBuilderV3.setMessage(captureResponse);
                }
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setConfigNotification(ConfigurationNotification configurationNotification) {
                SingleFieldBuilderV3<ConfigurationNotification, ConfigurationNotification.Builder, ConfigurationNotificationOrBuilder> singleFieldBuilderV3 = this.configNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    configurationNotification.getClass();
                    this.configNotification_ = configurationNotification;
                } else {
                    singleFieldBuilderV3.setMessage(configurationNotification);
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setConfigRequest(ConfigurationRequest configurationRequest) {
                SingleFieldBuilderV3<ConfigurationRequest, ConfigurationRequest.Builder, ConfigurationRequestOrBuilder> singleFieldBuilderV3 = this.configRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    configurationRequest.getClass();
                    this.configRequest_ = configurationRequest;
                } else {
                    singleFieldBuilderV3.setMessage(configurationRequest);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setConfigResponse(ConfigurationResponse configurationResponse) {
                SingleFieldBuilderV3<ConfigurationResponse, ConfigurationResponse.Builder, ConfigurationResponseOrBuilder> singleFieldBuilderV3 = this.configResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    configurationResponse.getClass();
                    this.configResponse_ = configurationResponse;
                } else {
                    singleFieldBuilderV3.setMessage(configurationResponse);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setSnapshotNotification(SnapshotNotification snapshotNotification) {
                SingleFieldBuilderV3<SnapshotNotification, SnapshotNotification.Builder, SnapshotNotificationOrBuilder> singleFieldBuilderV3 = this.snapshotNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    snapshotNotification.getClass();
                    this.snapshotNotification_ = snapshotNotification;
                } else {
                    singleFieldBuilderV3.setMessage(snapshotNotification);
                }
                this.bitField0_ |= 256;
                onChanged();
                return this;
            }

            public Builder setSnapshotRequest(SnapshotRequest snapshotRequest) {
                SingleFieldBuilderV3<SnapshotRequest, SnapshotRequest.Builder, SnapshotRequestOrBuilder> singleFieldBuilderV3 = this.snapshotRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    snapshotRequest.getClass();
                    this.snapshotRequest_ = snapshotRequest;
                } else {
                    singleFieldBuilderV3.setMessage(snapshotRequest);
                }
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setSnapshotResponse(SnapshotResponse snapshotResponse) {
                SingleFieldBuilderV3<SnapshotResponse, SnapshotResponse.Builder, SnapshotResponseOrBuilder> singleFieldBuilderV3 = this.snapshotResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    snapshotResponse.getClass();
                    this.snapshotResponse_ = snapshotResponse;
                } else {
                    singleFieldBuilderV3.setMessage(snapshotResponse);
                }
                this.bitField0_ |= 128;
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
                if (service.hasConfigRequest()) {
                    mergeConfigRequest(service.getConfigRequest());
                }
                if (service.hasConfigResponse()) {
                    mergeConfigResponse(service.getConfigResponse());
                }
                if (service.hasConfigNotification()) {
                    mergeConfigNotification(service.getConfigNotification());
                }
                if (service.hasCaptureRequest()) {
                    mergeCaptureRequest(service.getCaptureRequest());
                }
                if (service.hasCaptureResponse()) {
                    mergeCaptureResponse(service.getCaptureResponse());
                }
                if (service.hasCaptureNotification()) {
                    mergeCaptureNotification(service.getCaptureNotification());
                }
                if (service.hasSnapshotRequest()) {
                    mergeSnapshotRequest(service.getSnapshotRequest());
                }
                if (service.hasSnapshotResponse()) {
                    mergeSnapshotResponse(service.getSnapshotResponse());
                }
                if (service.hasSnapshotNotification()) {
                    mergeSnapshotNotification(service.getSnapshotNotification());
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

    public static final class SnapshotNotification extends GeneratedMessageV3 implements SnapshotNotificationOrBuilder {
        private static final SnapshotNotification DEFAULT_INSTANCE = new SnapshotNotification();

        @Deprecated
        public static final Parser<SnapshotNotification> PARSER = new AbstractParser<SnapshotNotification>() { // from class: com.garmin.proto.generated.GDICamera.SnapshotNotification.1
            @Override // com.google.protobuf.Parser
            public SnapshotNotification parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SnapshotNotification.newBuilder();
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
        public static final int SNAPSHOT_STATUS_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private SnapshotStatus snapshotStatus_;

        private SnapshotNotification(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SnapshotNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDICamera.internal_static_GDI_Proto_Camera_SnapshotNotification_descriptor;
        }

        public static Builder newBuilder(SnapshotNotification snapshotNotification) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(snapshotNotification);
        }

        public static SnapshotNotification parseDelimitedFrom(InputStream inputStream) {
            return (SnapshotNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SnapshotNotification parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SnapshotNotification> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SnapshotNotification)) {
                return super.equals(obj);
            }
            SnapshotNotification snapshotNotification = (SnapshotNotification) obj;
            if (hasSnapshotStatus() != snapshotNotification.hasSnapshotStatus()) {
                return false;
            }
            return (!hasSnapshotStatus() || getSnapshotStatus().equals(snapshotNotification.getSnapshotStatus())) && getUnknownFields().equals(snapshotNotification.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SnapshotNotification> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getSnapshotStatus()) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDICamera.SnapshotNotificationOrBuilder
        public SnapshotStatus getSnapshotStatus() {
            SnapshotStatus snapshotStatus = this.snapshotStatus_;
            return snapshotStatus == null ? SnapshotStatus.getDefaultInstance() : snapshotStatus;
        }

        @Override // com.garmin.proto.generated.GDICamera.SnapshotNotificationOrBuilder
        public SnapshotStatusOrBuilder getSnapshotStatusOrBuilder() {
            SnapshotStatus snapshotStatus = this.snapshotStatus_;
            return snapshotStatus == null ? SnapshotStatus.getDefaultInstance() : snapshotStatus;
        }

        @Override // com.garmin.proto.generated.GDICamera.SnapshotNotificationOrBuilder
        public boolean hasSnapshotStatus() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasSnapshotStatus()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getSnapshotStatus().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDICamera.internal_static_GDI_Proto_Camera_SnapshotNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(SnapshotNotification.class, Builder.class);
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
            return new SnapshotNotification();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getSnapshotStatus());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SnapshotNotificationOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<SnapshotStatus, SnapshotStatus.Builder, SnapshotStatusOrBuilder> snapshotStatusBuilder_;
            private SnapshotStatus snapshotStatus_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(SnapshotNotification snapshotNotification) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    SingleFieldBuilderV3<SnapshotStatus, SnapshotStatus.Builder, SnapshotStatusOrBuilder> singleFieldBuilderV3 = this.snapshotStatusBuilder_;
                    snapshotNotification.snapshotStatus_ = singleFieldBuilderV3 == null ? this.snapshotStatus_ : (SnapshotStatus) singleFieldBuilderV3.build();
                } else {
                    i14 = 0;
                }
                snapshotNotification.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDICamera.internal_static_GDI_Proto_Camera_SnapshotNotification_descriptor;
            }

            private SingleFieldBuilderV3<SnapshotStatus, SnapshotStatus.Builder, SnapshotStatusOrBuilder> getSnapshotStatusFieldBuilder() {
                if (this.snapshotStatusBuilder_ == null) {
                    this.snapshotStatusBuilder_ = new SingleFieldBuilderV3<>(getSnapshotStatus(), getParentForChildren(), isClean());
                    this.snapshotStatus_ = null;
                }
                return this.snapshotStatusBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getSnapshotStatusFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SnapshotNotification build() {
                SnapshotNotification snapshotNotificationBuildPartial = buildPartial();
                if (snapshotNotificationBuildPartial.isInitialized()) {
                    return snapshotNotificationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) snapshotNotificationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SnapshotNotification buildPartial() {
                SnapshotNotification snapshotNotification = new SnapshotNotification(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(snapshotNotification);
                }
                onBuilt();
                return snapshotNotification;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.snapshotStatus_ = null;
                SingleFieldBuilderV3<SnapshotStatus, SnapshotStatus.Builder, SnapshotStatusOrBuilder> singleFieldBuilderV3 = this.snapshotStatusBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.snapshotStatusBuilder_ = null;
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

            public Builder clearSnapshotStatus() {
                this.bitField0_ &= -2;
                this.snapshotStatus_ = null;
                SingleFieldBuilderV3<SnapshotStatus, SnapshotStatus.Builder, SnapshotStatusOrBuilder> singleFieldBuilderV3 = this.snapshotStatusBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.snapshotStatusBuilder_ = null;
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
                return GDICamera.internal_static_GDI_Proto_Camera_SnapshotNotification_descriptor;
            }

            @Override // com.garmin.proto.generated.GDICamera.SnapshotNotificationOrBuilder
            public SnapshotStatus getSnapshotStatus() {
                SingleFieldBuilderV3<SnapshotStatus, SnapshotStatus.Builder, SnapshotStatusOrBuilder> singleFieldBuilderV3 = this.snapshotStatusBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SnapshotStatus) singleFieldBuilderV3.getMessage();
                }
                SnapshotStatus snapshotStatus = this.snapshotStatus_;
                return snapshotStatus == null ? SnapshotStatus.getDefaultInstance() : snapshotStatus;
            }

            public SnapshotStatus.Builder getSnapshotStatusBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (SnapshotStatus.Builder) getSnapshotStatusFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDICamera.SnapshotNotificationOrBuilder
            public SnapshotStatusOrBuilder getSnapshotStatusOrBuilder() {
                SingleFieldBuilderV3<SnapshotStatus, SnapshotStatus.Builder, SnapshotStatusOrBuilder> singleFieldBuilderV3 = this.snapshotStatusBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SnapshotStatusOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                SnapshotStatus snapshotStatus = this.snapshotStatus_;
                return snapshotStatus == null ? SnapshotStatus.getDefaultInstance() : snapshotStatus;
            }

            @Override // com.garmin.proto.generated.GDICamera.SnapshotNotificationOrBuilder
            public boolean hasSnapshotStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDICamera.internal_static_GDI_Proto_Camera_SnapshotNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(SnapshotNotification.class, Builder.class);
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
                                    codedInputStream.readMessage(getSnapshotStatusFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder mergeSnapshotStatus(SnapshotStatus snapshotStatus) {
                SnapshotStatus snapshotStatus2;
                SingleFieldBuilderV3<SnapshotStatus, SnapshotStatus.Builder, SnapshotStatusOrBuilder> singleFieldBuilderV3 = this.snapshotStatusBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(snapshotStatus);
                } else if ((this.bitField0_ & 1) == 0 || (snapshotStatus2 = this.snapshotStatus_) == null || snapshotStatus2 == SnapshotStatus.getDefaultInstance()) {
                    this.snapshotStatus_ = snapshotStatus;
                } else {
                    getSnapshotStatusBuilder().mergeFrom(snapshotStatus);
                }
                if (this.snapshotStatus_ != null) {
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

            public Builder setSnapshotStatus(SnapshotStatus.Builder builder) {
                SingleFieldBuilderV3<SnapshotStatus, SnapshotStatus.Builder, SnapshotStatusOrBuilder> singleFieldBuilderV3 = this.snapshotStatusBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.snapshotStatus_ = builder.build();
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
            public SnapshotNotification getDefaultInstanceForType() {
                return SnapshotNotification.getDefaultInstance();
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

            public Builder setSnapshotStatus(SnapshotStatus snapshotStatus) {
                SingleFieldBuilderV3<SnapshotStatus, SnapshotStatus.Builder, SnapshotStatusOrBuilder> singleFieldBuilderV3 = this.snapshotStatusBuilder_;
                if (singleFieldBuilderV3 == null) {
                    snapshotStatus.getClass();
                    this.snapshotStatus_ = snapshotStatus;
                } else {
                    singleFieldBuilderV3.setMessage(snapshotStatus);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SnapshotNotification) {
                    return mergeFrom((SnapshotNotification) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SnapshotNotification snapshotNotification) {
                if (snapshotNotification == SnapshotNotification.getDefaultInstance()) {
                    return this;
                }
                if (snapshotNotification.hasSnapshotStatus()) {
                    mergeSnapshotStatus(snapshotNotification.getSnapshotStatus());
                }
                mergeUnknownFields(snapshotNotification.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SnapshotNotification getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ SnapshotNotification(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private SnapshotNotification() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SnapshotNotification parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SnapshotNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SnapshotNotification parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SnapshotNotification parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SnapshotNotification parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SnapshotNotification parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static SnapshotNotification parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SnapshotNotification parseFrom(InputStream inputStream) {
            return (SnapshotNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static SnapshotNotification parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SnapshotNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SnapshotNotification parseFrom(CodedInputStream codedInputStream) {
            return (SnapshotNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static SnapshotNotification parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SnapshotNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class SnapshotRequest extends GeneratedMessageV3 implements SnapshotRequestOrBuilder {
        private static final SnapshotRequest DEFAULT_INSTANCE = new SnapshotRequest();

        @Deprecated
        public static final Parser<SnapshotRequest> PARSER = new AbstractParser<SnapshotRequest>() { // from class: com.garmin.proto.generated.GDICamera.SnapshotRequest.1
            @Override // com.google.protobuf.Parser
            public SnapshotRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SnapshotRequest.newBuilder();
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
        public static final int SNAPSHOT_SOURCE_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int snapshotSource_;

        private SnapshotRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.snapshotSource_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SnapshotRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDICamera.internal_static_GDI_Proto_Camera_SnapshotRequest_descriptor;
        }

        public static Builder newBuilder(SnapshotRequest snapshotRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(snapshotRequest);
        }

        public static SnapshotRequest parseDelimitedFrom(InputStream inputStream) {
            return (SnapshotRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SnapshotRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SnapshotRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SnapshotRequest)) {
                return super.equals(obj);
            }
            SnapshotRequest snapshotRequest = (SnapshotRequest) obj;
            if (hasSnapshotSource() != snapshotRequest.hasSnapshotSource()) {
                return false;
            }
            return (!hasSnapshotSource() || this.snapshotSource_ == snapshotRequest.snapshotSource_) && getUnknownFields().equals(snapshotRequest.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SnapshotRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.snapshotSource_) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDICamera.SnapshotRequestOrBuilder
        public Source getSnapshotSource() {
            Source sourceForNumber = Source.forNumber(this.snapshotSource_);
            return sourceForNumber == null ? Source.SOURCE_UNKNOWN : sourceForNumber;
        }

        @Override // com.garmin.proto.generated.GDICamera.SnapshotRequestOrBuilder
        public boolean hasSnapshotSource() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasSnapshotSource()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + this.snapshotSource_;
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDICamera.internal_static_GDI_Proto_Camera_SnapshotRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(SnapshotRequest.class, Builder.class);
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
            return new SnapshotRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeEnum(1, this.snapshotSource_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SnapshotRequestOrBuilder {
            private int bitField0_;
            private int snapshotSource_;

            private Builder() {
                this.snapshotSource_ = 0;
            }

            private void buildPartial0(SnapshotRequest snapshotRequest) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    snapshotRequest.snapshotSource_ = this.snapshotSource_;
                } else {
                    i14 = 0;
                }
                snapshotRequest.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDICamera.internal_static_GDI_Proto_Camera_SnapshotRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SnapshotRequest build() {
                SnapshotRequest snapshotRequestBuildPartial = buildPartial();
                if (snapshotRequestBuildPartial.isInitialized()) {
                    return snapshotRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) snapshotRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SnapshotRequest buildPartial() {
                SnapshotRequest snapshotRequest = new SnapshotRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(snapshotRequest);
                }
                onBuilt();
                return snapshotRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.snapshotSource_ = 0;
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

            public Builder clearSnapshotSource() {
                this.bitField0_ &= -2;
                this.snapshotSource_ = 0;
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
                return GDICamera.internal_static_GDI_Proto_Camera_SnapshotRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDICamera.SnapshotRequestOrBuilder
            public Source getSnapshotSource() {
                Source sourceForNumber = Source.forNumber(this.snapshotSource_);
                return sourceForNumber == null ? Source.SOURCE_UNKNOWN : sourceForNumber;
            }

            @Override // com.garmin.proto.generated.GDICamera.SnapshotRequestOrBuilder
            public boolean hasSnapshotSource() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDICamera.internal_static_GDI_Proto_Camera_SnapshotRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(SnapshotRequest.class, Builder.class);
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
                                        this.snapshotSource_ = i14;
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

            public Builder setSnapshotSource(Source source) {
                source.getClass();
                this.bitField0_ |= 1;
                this.snapshotSource_ = source.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SnapshotRequest getDefaultInstanceForType() {
                return SnapshotRequest.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.snapshotSource_ = 0;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SnapshotRequest) {
                    return mergeFrom((SnapshotRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SnapshotRequest snapshotRequest) {
                if (snapshotRequest == SnapshotRequest.getDefaultInstance()) {
                    return this;
                }
                if (snapshotRequest.hasSnapshotSource()) {
                    setSnapshotSource(snapshotRequest.getSnapshotSource());
                }
                mergeUnknownFields(snapshotRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SnapshotRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static SnapshotRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SnapshotRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SnapshotRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ SnapshotRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static SnapshotRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private SnapshotRequest() {
            this.memoizedIsInitialized = (byte) -1;
            this.snapshotSource_ = 0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SnapshotRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SnapshotRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static SnapshotRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SnapshotRequest parseFrom(InputStream inputStream) {
            return (SnapshotRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static SnapshotRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SnapshotRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SnapshotRequest parseFrom(CodedInputStream codedInputStream) {
            return (SnapshotRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static SnapshotRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SnapshotRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class SnapshotResponse extends GeneratedMessageV3 implements SnapshotResponseOrBuilder {
        private static final SnapshotResponse DEFAULT_INSTANCE = new SnapshotResponse();

        @Deprecated
        public static final Parser<SnapshotResponse> PARSER = new AbstractParser<SnapshotResponse>() { // from class: com.garmin.proto.generated.GDICamera.SnapshotResponse.1
            @Override // com.google.protobuf.Parser
            public SnapshotResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SnapshotResponse.newBuilder();
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
        public static final int SNAPSHOT_STATUS_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private SnapshotStatus snapshotStatus_;

        private SnapshotResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SnapshotResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDICamera.internal_static_GDI_Proto_Camera_SnapshotResponse_descriptor;
        }

        public static Builder newBuilder(SnapshotResponse snapshotResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(snapshotResponse);
        }

        public static SnapshotResponse parseDelimitedFrom(InputStream inputStream) {
            return (SnapshotResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SnapshotResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SnapshotResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SnapshotResponse)) {
                return super.equals(obj);
            }
            SnapshotResponse snapshotResponse = (SnapshotResponse) obj;
            if (hasSnapshotStatus() != snapshotResponse.hasSnapshotStatus()) {
                return false;
            }
            return (!hasSnapshotStatus() || getSnapshotStatus().equals(snapshotResponse.getSnapshotStatus())) && getUnknownFields().equals(snapshotResponse.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SnapshotResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getSnapshotStatus()) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDICamera.SnapshotResponseOrBuilder
        public SnapshotStatus getSnapshotStatus() {
            SnapshotStatus snapshotStatus = this.snapshotStatus_;
            return snapshotStatus == null ? SnapshotStatus.getDefaultInstance() : snapshotStatus;
        }

        @Override // com.garmin.proto.generated.GDICamera.SnapshotResponseOrBuilder
        public SnapshotStatusOrBuilder getSnapshotStatusOrBuilder() {
            SnapshotStatus snapshotStatus = this.snapshotStatus_;
            return snapshotStatus == null ? SnapshotStatus.getDefaultInstance() : snapshotStatus;
        }

        @Override // com.garmin.proto.generated.GDICamera.SnapshotResponseOrBuilder
        public boolean hasSnapshotStatus() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasSnapshotStatus()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getSnapshotStatus().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDICamera.internal_static_GDI_Proto_Camera_SnapshotResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(SnapshotResponse.class, Builder.class);
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
            return new SnapshotResponse();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getSnapshotStatus());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SnapshotResponseOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<SnapshotStatus, SnapshotStatus.Builder, SnapshotStatusOrBuilder> snapshotStatusBuilder_;
            private SnapshotStatus snapshotStatus_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(SnapshotResponse snapshotResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    SingleFieldBuilderV3<SnapshotStatus, SnapshotStatus.Builder, SnapshotStatusOrBuilder> singleFieldBuilderV3 = this.snapshotStatusBuilder_;
                    snapshotResponse.snapshotStatus_ = singleFieldBuilderV3 == null ? this.snapshotStatus_ : (SnapshotStatus) singleFieldBuilderV3.build();
                } else {
                    i14 = 0;
                }
                snapshotResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDICamera.internal_static_GDI_Proto_Camera_SnapshotResponse_descriptor;
            }

            private SingleFieldBuilderV3<SnapshotStatus, SnapshotStatus.Builder, SnapshotStatusOrBuilder> getSnapshotStatusFieldBuilder() {
                if (this.snapshotStatusBuilder_ == null) {
                    this.snapshotStatusBuilder_ = new SingleFieldBuilderV3<>(getSnapshotStatus(), getParentForChildren(), isClean());
                    this.snapshotStatus_ = null;
                }
                return this.snapshotStatusBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getSnapshotStatusFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SnapshotResponse build() {
                SnapshotResponse snapshotResponseBuildPartial = buildPartial();
                if (snapshotResponseBuildPartial.isInitialized()) {
                    return snapshotResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) snapshotResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SnapshotResponse buildPartial() {
                SnapshotResponse snapshotResponse = new SnapshotResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(snapshotResponse);
                }
                onBuilt();
                return snapshotResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.snapshotStatus_ = null;
                SingleFieldBuilderV3<SnapshotStatus, SnapshotStatus.Builder, SnapshotStatusOrBuilder> singleFieldBuilderV3 = this.snapshotStatusBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.snapshotStatusBuilder_ = null;
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

            public Builder clearSnapshotStatus() {
                this.bitField0_ &= -2;
                this.snapshotStatus_ = null;
                SingleFieldBuilderV3<SnapshotStatus, SnapshotStatus.Builder, SnapshotStatusOrBuilder> singleFieldBuilderV3 = this.snapshotStatusBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.snapshotStatusBuilder_ = null;
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
                return GDICamera.internal_static_GDI_Proto_Camera_SnapshotResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDICamera.SnapshotResponseOrBuilder
            public SnapshotStatus getSnapshotStatus() {
                SingleFieldBuilderV3<SnapshotStatus, SnapshotStatus.Builder, SnapshotStatusOrBuilder> singleFieldBuilderV3 = this.snapshotStatusBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SnapshotStatus) singleFieldBuilderV3.getMessage();
                }
                SnapshotStatus snapshotStatus = this.snapshotStatus_;
                return snapshotStatus == null ? SnapshotStatus.getDefaultInstance() : snapshotStatus;
            }

            public SnapshotStatus.Builder getSnapshotStatusBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (SnapshotStatus.Builder) getSnapshotStatusFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDICamera.SnapshotResponseOrBuilder
            public SnapshotStatusOrBuilder getSnapshotStatusOrBuilder() {
                SingleFieldBuilderV3<SnapshotStatus, SnapshotStatus.Builder, SnapshotStatusOrBuilder> singleFieldBuilderV3 = this.snapshotStatusBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SnapshotStatusOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                SnapshotStatus snapshotStatus = this.snapshotStatus_;
                return snapshotStatus == null ? SnapshotStatus.getDefaultInstance() : snapshotStatus;
            }

            @Override // com.garmin.proto.generated.GDICamera.SnapshotResponseOrBuilder
            public boolean hasSnapshotStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDICamera.internal_static_GDI_Proto_Camera_SnapshotResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(SnapshotResponse.class, Builder.class);
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
                                    codedInputStream.readMessage(getSnapshotStatusFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder mergeSnapshotStatus(SnapshotStatus snapshotStatus) {
                SnapshotStatus snapshotStatus2;
                SingleFieldBuilderV3<SnapshotStatus, SnapshotStatus.Builder, SnapshotStatusOrBuilder> singleFieldBuilderV3 = this.snapshotStatusBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(snapshotStatus);
                } else if ((this.bitField0_ & 1) == 0 || (snapshotStatus2 = this.snapshotStatus_) == null || snapshotStatus2 == SnapshotStatus.getDefaultInstance()) {
                    this.snapshotStatus_ = snapshotStatus;
                } else {
                    getSnapshotStatusBuilder().mergeFrom(snapshotStatus);
                }
                if (this.snapshotStatus_ != null) {
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

            public Builder setSnapshotStatus(SnapshotStatus.Builder builder) {
                SingleFieldBuilderV3<SnapshotStatus, SnapshotStatus.Builder, SnapshotStatusOrBuilder> singleFieldBuilderV3 = this.snapshotStatusBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.snapshotStatus_ = builder.build();
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
            public SnapshotResponse getDefaultInstanceForType() {
                return SnapshotResponse.getDefaultInstance();
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

            public Builder setSnapshotStatus(SnapshotStatus snapshotStatus) {
                SingleFieldBuilderV3<SnapshotStatus, SnapshotStatus.Builder, SnapshotStatusOrBuilder> singleFieldBuilderV3 = this.snapshotStatusBuilder_;
                if (singleFieldBuilderV3 == null) {
                    snapshotStatus.getClass();
                    this.snapshotStatus_ = snapshotStatus;
                } else {
                    singleFieldBuilderV3.setMessage(snapshotStatus);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SnapshotResponse) {
                    return mergeFrom((SnapshotResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SnapshotResponse snapshotResponse) {
                if (snapshotResponse == SnapshotResponse.getDefaultInstance()) {
                    return this;
                }
                if (snapshotResponse.hasSnapshotStatus()) {
                    mergeSnapshotStatus(snapshotResponse.getSnapshotStatus());
                }
                mergeUnknownFields(snapshotResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SnapshotResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ SnapshotResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private SnapshotResponse() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SnapshotResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SnapshotResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SnapshotResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SnapshotResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SnapshotResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SnapshotResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static SnapshotResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SnapshotResponse parseFrom(InputStream inputStream) {
            return (SnapshotResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static SnapshotResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SnapshotResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SnapshotResponse parseFrom(CodedInputStream codedInputStream) {
            return (SnapshotResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static SnapshotResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SnapshotResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class SnapshotStatus extends GeneratedMessageV3 implements SnapshotStatusOrBuilder {
        public static final int ERROR_STATUS_FIELD_NUMBER = 3;
        public static final int SNAPSHOT_SOURCE_FIELD_NUMBER = 2;
        public static final int SNAPSHOT_STATUS_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int errorStatus_;
        private byte memoizedIsInitialized;
        private int snapshotSource_;
        private boolean snapshotStatus_;
        private static final SnapshotStatus DEFAULT_INSTANCE = new SnapshotStatus();

        @Deprecated
        public static final Parser<SnapshotStatus> PARSER = new AbstractParser<SnapshotStatus>() { // from class: com.garmin.proto.generated.GDICamera.SnapshotStatus.1
            @Override // com.google.protobuf.Parser
            public SnapshotStatus parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SnapshotStatus.newBuilder();
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

        private SnapshotStatus(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.snapshotStatus_ = false;
            this.snapshotSource_ = 0;
            this.errorStatus_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SnapshotStatus getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDICamera.internal_static_GDI_Proto_Camera_SnapshotStatus_descriptor;
        }

        public static Builder newBuilder(SnapshotStatus snapshotStatus) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(snapshotStatus);
        }

        public static SnapshotStatus parseDelimitedFrom(InputStream inputStream) {
            return (SnapshotStatus) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SnapshotStatus parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SnapshotStatus> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SnapshotStatus)) {
                return super.equals(obj);
            }
            SnapshotStatus snapshotStatus = (SnapshotStatus) obj;
            if (hasSnapshotStatus() != snapshotStatus.hasSnapshotStatus()) {
                return false;
            }
            if ((hasSnapshotStatus() && getSnapshotStatus() != snapshotStatus.getSnapshotStatus()) || hasSnapshotSource() != snapshotStatus.hasSnapshotSource()) {
                return false;
            }
            if ((!hasSnapshotSource() || this.snapshotSource_ == snapshotStatus.snapshotSource_) && hasErrorStatus() == snapshotStatus.hasErrorStatus()) {
                return (!hasErrorStatus() || this.errorStatus_ == snapshotStatus.errorStatus_) && getUnknownFields().equals(snapshotStatus.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDICamera.SnapshotStatusOrBuilder
        public SnapshotError getErrorStatus() {
            SnapshotError snapshotErrorForNumber = SnapshotError.forNumber(this.errorStatus_);
            return snapshotErrorForNumber == null ? SnapshotError.SNAPSHOT_ERROR_UNKNOWN : snapshotErrorForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SnapshotStatus> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeBoolSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeBoolSize(1, this.snapshotStatus_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeBoolSize += CodedOutputStream.computeEnumSize(2, this.snapshotSource_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeBoolSize += CodedOutputStream.computeEnumSize(3, this.errorStatus_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeBoolSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDICamera.SnapshotStatusOrBuilder
        public Source getSnapshotSource() {
            Source sourceForNumber = Source.forNumber(this.snapshotSource_);
            return sourceForNumber == null ? Source.SOURCE_UNKNOWN : sourceForNumber;
        }

        @Override // com.garmin.proto.generated.GDICamera.SnapshotStatusOrBuilder
        public boolean getSnapshotStatus() {
            return this.snapshotStatus_;
        }

        @Override // com.garmin.proto.generated.GDICamera.SnapshotStatusOrBuilder
        public boolean hasErrorStatus() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDICamera.SnapshotStatusOrBuilder
        public boolean hasSnapshotSource() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDICamera.SnapshotStatusOrBuilder
        public boolean hasSnapshotStatus() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasSnapshotStatus()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + Internal.hashBoolean(getSnapshotStatus());
            }
            if (hasSnapshotSource()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + this.snapshotSource_;
            }
            if (hasErrorStatus()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + this.errorStatus_;
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDICamera.internal_static_GDI_Proto_Camera_SnapshotStatus_fieldAccessorTable.ensureFieldAccessorsInitialized(SnapshotStatus.class, Builder.class);
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
            return new SnapshotStatus();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeBool(1, this.snapshotStatus_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeEnum(2, this.snapshotSource_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeEnum(3, this.errorStatus_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SnapshotStatusOrBuilder {
            private int bitField0_;
            private int errorStatus_;
            private int snapshotSource_;
            private boolean snapshotStatus_;

            private Builder() {
                this.snapshotSource_ = 0;
                this.errorStatus_ = 0;
            }

            private void buildPartial0(SnapshotStatus snapshotStatus) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    snapshotStatus.snapshotStatus_ = this.snapshotStatus_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    snapshotStatus.snapshotSource_ = this.snapshotSource_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    snapshotStatus.errorStatus_ = this.errorStatus_;
                    i14 |= 4;
                }
                snapshotStatus.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDICamera.internal_static_GDI_Proto_Camera_SnapshotStatus_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SnapshotStatus build() {
                SnapshotStatus snapshotStatusBuildPartial = buildPartial();
                if (snapshotStatusBuildPartial.isInitialized()) {
                    return snapshotStatusBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) snapshotStatusBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SnapshotStatus buildPartial() {
                SnapshotStatus snapshotStatus = new SnapshotStatus(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(snapshotStatus);
                }
                onBuilt();
                return snapshotStatus;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.snapshotStatus_ = false;
                this.snapshotSource_ = 0;
                this.errorStatus_ = 0;
                return this;
            }

            public Builder clearErrorStatus() {
                this.bitField0_ &= -5;
                this.errorStatus_ = 0;
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

            public Builder clearSnapshotSource() {
                this.bitField0_ &= -3;
                this.snapshotSource_ = 0;
                onChanged();
                return this;
            }

            public Builder clearSnapshotStatus() {
                this.bitField0_ &= -2;
                this.snapshotStatus_ = false;
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
                return GDICamera.internal_static_GDI_Proto_Camera_SnapshotStatus_descriptor;
            }

            @Override // com.garmin.proto.generated.GDICamera.SnapshotStatusOrBuilder
            public SnapshotError getErrorStatus() {
                SnapshotError snapshotErrorForNumber = SnapshotError.forNumber(this.errorStatus_);
                return snapshotErrorForNumber == null ? SnapshotError.SNAPSHOT_ERROR_UNKNOWN : snapshotErrorForNumber;
            }

            @Override // com.garmin.proto.generated.GDICamera.SnapshotStatusOrBuilder
            public Source getSnapshotSource() {
                Source sourceForNumber = Source.forNumber(this.snapshotSource_);
                return sourceForNumber == null ? Source.SOURCE_UNKNOWN : sourceForNumber;
            }

            @Override // com.garmin.proto.generated.GDICamera.SnapshotStatusOrBuilder
            public boolean getSnapshotStatus() {
                return this.snapshotStatus_;
            }

            @Override // com.garmin.proto.generated.GDICamera.SnapshotStatusOrBuilder
            public boolean hasErrorStatus() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDICamera.SnapshotStatusOrBuilder
            public boolean hasSnapshotSource() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDICamera.SnapshotStatusOrBuilder
            public boolean hasSnapshotStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDICamera.internal_static_GDI_Proto_Camera_SnapshotStatus_fieldAccessorTable.ensureFieldAccessorsInitialized(SnapshotStatus.class, Builder.class);
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
                                    this.snapshotStatus_ = codedInputStream.readBool();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    int i14 = codedInputStream.readEnum();
                                    if (Source.forNumber(i14) == null) {
                                        mergeUnknownVarintField(2, i14);
                                    } else {
                                        this.snapshotSource_ = i14;
                                        this.bitField0_ |= 2;
                                    }
                                } else if (tag == 24) {
                                    int i15 = codedInputStream.readEnum();
                                    if (SnapshotError.forNumber(i15) == null) {
                                        mergeUnknownVarintField(3, i15);
                                    } else {
                                        this.errorStatus_ = i15;
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

            public Builder setErrorStatus(SnapshotError snapshotError) {
                snapshotError.getClass();
                this.bitField0_ |= 4;
                this.errorStatus_ = snapshotError.getNumber();
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

            public Builder setSnapshotSource(Source source) {
                source.getClass();
                this.bitField0_ |= 2;
                this.snapshotSource_ = source.getNumber();
                onChanged();
                return this;
            }

            public Builder setSnapshotStatus(boolean z14) {
                this.snapshotStatus_ = z14;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SnapshotStatus getDefaultInstanceForType() {
                return SnapshotStatus.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.snapshotSource_ = 0;
                this.errorStatus_ = 0;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SnapshotStatus) {
                    return mergeFrom((SnapshotStatus) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SnapshotStatus snapshotStatus) {
                if (snapshotStatus == SnapshotStatus.getDefaultInstance()) {
                    return this;
                }
                if (snapshotStatus.hasSnapshotStatus()) {
                    setSnapshotStatus(snapshotStatus.getSnapshotStatus());
                }
                if (snapshotStatus.hasSnapshotSource()) {
                    setSnapshotSource(snapshotStatus.getSnapshotSource());
                }
                if (snapshotStatus.hasErrorStatus()) {
                    setErrorStatus(snapshotStatus.getErrorStatus());
                }
                mergeUnknownFields(snapshotStatus.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SnapshotStatus getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static SnapshotStatus parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SnapshotStatus) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SnapshotStatus parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SnapshotStatus parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SnapshotStatus parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SnapshotStatus parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static SnapshotStatus parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public /* synthetic */ SnapshotStatus(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static SnapshotStatus parseFrom(InputStream inputStream) {
            return (SnapshotStatus) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        private SnapshotStatus() {
            this.snapshotStatus_ = false;
            this.memoizedIsInitialized = (byte) -1;
            this.snapshotSource_ = 0;
            this.errorStatus_ = 0;
        }

        public static SnapshotStatus parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SnapshotStatus) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SnapshotStatus parseFrom(CodedInputStream codedInputStream) {
            return (SnapshotStatus) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static SnapshotStatus parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SnapshotStatus) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum SnapshotError implements ProtocolMessageEnum {
            SNAPSHOT_ERROR_UNKNOWN(0),
            SNAPSHOT_ERROR_SD_ERROR(1),
            SNAPSHOT_ERROR_CAMERA_BUSY(2),
            SNAPSHOT_ERROR_BAD_STATE(3);

            public static final int SNAPSHOT_ERROR_BAD_STATE_VALUE = 3;
            public static final int SNAPSHOT_ERROR_CAMERA_BUSY_VALUE = 2;
            public static final int SNAPSHOT_ERROR_SD_ERROR_VALUE = 1;
            public static final int SNAPSHOT_ERROR_UNKNOWN_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<SnapshotError> internalValueMap = new Internal.EnumLiteMap<SnapshotError>() { // from class: com.garmin.proto.generated.GDICamera.SnapshotStatus.SnapshotError.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public SnapshotError findValueByNumber(int i14) {
                    return SnapshotError.forNumber(i14);
                }
            };
            private static final SnapshotError[] VALUES = values();

            SnapshotError(int i14) {
                this.value = i14;
            }

            public static SnapshotError forNumber(int i14) {
                if (i14 == 0) {
                    return SNAPSHOT_ERROR_UNKNOWN;
                }
                if (i14 == 1) {
                    return SNAPSHOT_ERROR_SD_ERROR;
                }
                if (i14 == 2) {
                    return SNAPSHOT_ERROR_CAMERA_BUSY;
                }
                if (i14 != 3) {
                    return null;
                }
                return SNAPSHOT_ERROR_BAD_STATE;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return SnapshotStatus.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<SnapshotError> internalGetValueMap() {
                return internalValueMap;
            }

            public static SnapshotError valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static SnapshotError valueOf(int i14) {
                return forNumber(i14);
            }
        }
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }

    public enum ResolutionFramerate implements ProtocolMessageEnum {
        RESOLUTION_FRAMERATE_UNKNOWN(0),
        RESOLUTION_FRAMERATE_720P_30FPS(1),
        RESOLUTION_FRAMERATE_720P_30FPS_HDR(2),
        RESOLUTION_FRAMERATE_1080P_30FPS(3),
        RESOLUTION_FRAMERATE_1080P_30FPS_HDR(4),
        RESOLUTION_FRAMERATE_1080P_45FPS_HDR(5),
        RESOLUTION_FRAMERATE_1080P_60FPS(6),
        RESOLUTION_FRAMERATE_1080P_120FPS(7),
        RESOLUTION_FRAMERATE_1440P_30FPS(8),
        RESOLUTION_FRAMERATE_1440P_30FPS_HDR(9),
        RESOLUTION_FRAMERATE_4K_30FPS(10),
        RESOLUTION_FRAMERATE_4K_30FPS_HDR(11);

        public static final int RESOLUTION_FRAMERATE_1080P_120FPS_VALUE = 7;
        public static final int RESOLUTION_FRAMERATE_1080P_30FPS_HDR_VALUE = 4;
        public static final int RESOLUTION_FRAMERATE_1080P_30FPS_VALUE = 3;
        public static final int RESOLUTION_FRAMERATE_1080P_45FPS_HDR_VALUE = 5;
        public static final int RESOLUTION_FRAMERATE_1080P_60FPS_VALUE = 6;
        public static final int RESOLUTION_FRAMERATE_1440P_30FPS_HDR_VALUE = 9;
        public static final int RESOLUTION_FRAMERATE_1440P_30FPS_VALUE = 8;
        public static final int RESOLUTION_FRAMERATE_4K_30FPS_HDR_VALUE = 11;
        public static final int RESOLUTION_FRAMERATE_4K_30FPS_VALUE = 10;
        public static final int RESOLUTION_FRAMERATE_720P_30FPS_HDR_VALUE = 2;
        public static final int RESOLUTION_FRAMERATE_720P_30FPS_VALUE = 1;
        public static final int RESOLUTION_FRAMERATE_UNKNOWN_VALUE = 0;
        private final int value;
        private static final Internal.EnumLiteMap<ResolutionFramerate> internalValueMap = new Internal.EnumLiteMap<ResolutionFramerate>() { // from class: com.garmin.proto.generated.GDICamera.ResolutionFramerate.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public ResolutionFramerate findValueByNumber(int i14) {
                return ResolutionFramerate.forNumber(i14);
            }
        };
        private static final ResolutionFramerate[] VALUES = values();

        ResolutionFramerate(int i14) {
            this.value = i14;
        }

        public static ResolutionFramerate forNumber(int i14) {
            switch (i14) {
                case 0:
                    return RESOLUTION_FRAMERATE_UNKNOWN;
                case 1:
                    return RESOLUTION_FRAMERATE_720P_30FPS;
                case 2:
                    return RESOLUTION_FRAMERATE_720P_30FPS_HDR;
                case 3:
                    return RESOLUTION_FRAMERATE_1080P_30FPS;
                case 4:
                    return RESOLUTION_FRAMERATE_1080P_30FPS_HDR;
                case 5:
                    return RESOLUTION_FRAMERATE_1080P_45FPS_HDR;
                case 6:
                    return RESOLUTION_FRAMERATE_1080P_60FPS;
                case 7:
                    return RESOLUTION_FRAMERATE_1080P_120FPS;
                case 8:
                    return RESOLUTION_FRAMERATE_1440P_30FPS;
                case 9:
                    return RESOLUTION_FRAMERATE_1440P_30FPS_HDR;
                case 10:
                    return RESOLUTION_FRAMERATE_4K_30FPS;
                case 11:
                    return RESOLUTION_FRAMERATE_4K_30FPS_HDR;
                default:
                    return null;
            }
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return GDICamera.getDescriptor().getEnumTypes().get(0);
        }

        public static Internal.EnumLiteMap<ResolutionFramerate> internalGetValueMap() {
            return internalValueMap;
        }

        public static ResolutionFramerate valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
        public static ResolutionFramerate valueOf(int i14) {
            return forNumber(i14);
        }
    }

    public enum Source implements ProtocolMessageEnum {
        SOURCE_UNKNOWN(0),
        SOURCE_BUTTON_PRESS(1),
        SOURCE_DISPLAY(2),
        SOURCE_INCIDENT(3),
        SOURCE_RADAR(4),
        SOURCE_SYNC(5),
        SOURCE_INCIDENT_SYNC(6),
        SOURCE_ASR(7);

        public static final int SOURCE_ASR_VALUE = 7;
        public static final int SOURCE_BUTTON_PRESS_VALUE = 1;
        public static final int SOURCE_DISPLAY_VALUE = 2;
        public static final int SOURCE_INCIDENT_SYNC_VALUE = 6;
        public static final int SOURCE_INCIDENT_VALUE = 3;
        public static final int SOURCE_RADAR_VALUE = 4;
        public static final int SOURCE_SYNC_VALUE = 5;
        public static final int SOURCE_UNKNOWN_VALUE = 0;
        private final int value;
        private static final Internal.EnumLiteMap<Source> internalValueMap = new Internal.EnumLiteMap<Source>() { // from class: com.garmin.proto.generated.GDICamera.Source.1
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
            switch (i14) {
                case 0:
                    return SOURCE_UNKNOWN;
                case 1:
                    return SOURCE_BUTTON_PRESS;
                case 2:
                    return SOURCE_DISPLAY;
                case 3:
                    return SOURCE_INCIDENT;
                case 4:
                    return SOURCE_RADAR;
                case 5:
                    return SOURCE_SYNC;
                case 6:
                    return SOURCE_INCIDENT_SYNC;
                case 7:
                    return SOURCE_ASR;
                default:
                    return null;
            }
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return GDICamera.getDescriptor().getEnumTypes().get(1);
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
