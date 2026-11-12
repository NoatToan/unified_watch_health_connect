package com.garmin.proto.generated;

import com.garmin.android.apps.connectmobile.f3;
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
import com.google.protobuf.LazyStringArrayList;
import com.google.protobuf.LazyStringList;
import com.google.protobuf.Message;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.ProtocolStringList;
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
public final class GDILiveTrackProto {
    private static Descriptors.FileDescriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0012GDILiveTrack.proto\u0012\u0013GDI.Proto.LiveTrack\u001a\rGDICore.proto\"\u009e\u0001\n\u0013CapabilitiesRequest\u0012\u0017\n\u000fservice_version\u0018\u0001 \u0001(\r2n\n\u0010features_request\u0012*.GDI.Proto.Core.FeatureCapabilitiesRequest\u0018) \u0001(\u000b2(.GDI.Proto.LiveTrack.CapabilitiesRequest\"\u0089\u0001\n\u0014CapabilitiesResponse2q\n\u0011features_response\u0012+.GDI.Proto.Core.FeatureCapabilitiesResponse\u0018) \u0001(\u000b2).GDI.Proto.LiveTrack.CapabilitiesResponse\"Ç\t\n\u0010LiveTrackService\u0012_\n\u001eshare_meta_config_notification\u0018\u0001 \u0001(\u000b27.GDI.Proto.LiveTrack.ShareMetaConfigurationNotification\u0012Z\n\u0019share_social_notification\u0018\u0002 \u0001(\u000b27.GDI.Proto.LiveTrack.ShareSocialCredentialsNotification\u00128\n\rstart_request\u0018\u0003 \u0001(\u000b2!.GDI.Proto.LiveTrack.StartRequest\u0012:\n\u000estart_response\u0018\u0004 \u0001(\u000b2\".GDI.Proto.LiveTrack.StartResponse\u0012@\n\u0011stop_notification\u0018\u0005 \u0001(\u000b2%.GDI.Proto.LiveTrack.StopNotification\u0012^\n!share_device_setting_notification\u0018\u0006 \u0001(\u000b23.GDI.Proto.LiveTrack.ShareDeviceSettingNotification\u0012D\n\u0013status_notification\u0018\u0007 \u0001(\u000b2'.GDI.Proto.LiveTrack.StatusNotification\u0012U\n\u001cconsent_changed_notification\u0018\b \u0001(\u000b2/.GDI.Proto.LiveTrack.ConsentChangedNotification\u0012Z\n\u001flive_event_sharing_notification\u0018\t \u0001(\u000b21.GDI.Proto.LiveTrack.LiveEventSharingNotification\u0012K\n\u0017session_support_request\u0018\n \u0001(\u000b2*.GDI.Proto.LiveTrack.SessionSupportRequest\u0012M\n\u0018session_support_response\u0018\u000b \u0001(\u000b2+.GDI.Proto.LiveTrack.SessionSupportResponse\u0012U\n\u001cupdate_settings_notification\u0018\f \u0001(\u000b2/.GDI.Proto.LiveTrack.UpdateSettingsNotification\u0012]\n emergency_countdown_notification\u0018\r \u0001(\u000b23.GDI.Proto.LiveTrack.EmergencyCountdownNotification\u0012F\n\u0014consent_notification\u0018\u000e \u0001(\u000b2(.GDI.Proto.LiveTrack.ConsentNotification\u0012K\n\u0017group_ride_notification\u0018\u000f \u0001(\u000b2*.GDI.Proto.LiveTrack.GroupRideNotification\"Z\n\u0007Session\u0012\n\n\u0002id\u0018\u0001 \u0002(\t\u0012\r\n\u0005token\u0018\u0002 \u0002(\t\u00124\n\u000bdevice_type\u0018\u0003 \u0001(\u000e2\u001f.GDI.Proto.LiveTrack.DeviceType\"¶\u0001\n\fSessionGroup\u00126\n\fsession_type\u0018\u0001 \u0002(\u000e2 .GDI.Proto.LiveTrack.SessionType\u0012\f\n\u0004name\u0018\u0002 \u0002(\t\u0012\u001c\n\u0014start_unix_timestamp\u0018\u0003 \u0002(\u0004\u0012\u0012\n\nduration_s\u0018\u0004 \u0002(\u0004\u0012.\n\bsessions\u0018\u0005 \u0003(\u000b2\u001c.GDI.Proto.LiveTrack.Session\"\u009d\u0001\n\u001eShareDeviceSettingNotification\u0012\u001a\n\u0012auto_start_enabled\u0018\u0001 \u0001(\b\u0012\u001f\n\u0017spectator_audio_enabled\u0018\u0002 \u0001(\b\u0012\u001e\n\u0016spectator_text_enabled\u0018\u0003 \u0001(\b\u0012\u001e\n\u0016course_sharing_enabled\u0018\u0004 \u0001(\b\"8\n\u001aConsentChangedNotification\u0012\u001a\n\u0012has_strava_consent\u0018\u0002 \u0001(\b\";\n\u001cLiveEventSharingNotification\u0012\u001b\n\u0013livetrack_requested\u0018\u0001 \u0001(\b\"ä\u0001\n\"ShareMetaConfigurationNotification\u0012\"\n\u001agrouptrack_sharing_enabled\u0018\u0003 \u0001(\b\u0012 \n\u0018extend_livetrack_enabled\u0018\u0004 \u0001(\b\u0012\u001d\n\u0015email_sharing_enabled\u0018\u0005 \u0001(\b\u0012\u001f\n\u0017twitter_sharing_enabled\u0018\u0006 \u0001(\b\u0012\u0014\n\fsession_name\u0018\u0007 \u0001(\t\u0012\"\n\u001agrouptrack_all_connections\u0018\b \u0001(\b\"\u007f\n\"ShareSocialCredentialsNotification\u00128\n\u0007twitter\u0018\u0002 \u0001(\u000b2'.GDI.Proto.LiveTrack.TwitterCredentials\u0012\u001f\n\u0017strava_beacon_connected\u0018\u0003 \u0001(\b\"\u0017\n\u0015SessionSupportRequest\"\u0081\u0001\n\u0016SessionSupportResponse\u0012@\n\u0017supported_session_types\u0018\u0001 \u0003(\u000e2\u001f.GDI.Proto.LiveTrack.DeviceType\u0012%\n\u001dspectator_messaging_supported\u0018\u0002 \u0001(\b\"v\n\fStartRequest\u00122\n\u0007session\u0018\u0001 \u0002(\u000b2!.GDI.Proto.LiveTrack.SessionGroup\u00122\n\ntracker_id\u0018\u0002 \u0002(\u000b2\u001e.GDI.Proto.LiveTrack.TrackerId\"\u0091\u0001\n\rStartResponse\u0012?\n\fstart_status\u0018\u0001 \u0002(\u000e2).GDI.Proto.LiveTrack.StartResponse.Status\"?\n\u0006Status\u0012\t\n\u0005ERROR\u0010\u0000\u0012\u001d\n\u0019ERROR_ALREADY_IN_PROGRESS\u0010\u0001\u0012\u000b\n\u0007SUCCESS\u0010\u0002\"|\n\u0012StatusNotification\u00122\n\u0007session\u0018\u0001 \u0001(\u000b2!.GDI.Proto.LiveTrack.SessionGroup\u00122\n\ntracker_id\u0018\u0002 \u0001(\u000b2\u001e.GDI.Proto.LiveTrack.TrackerId\"M\n\u0010StopNotification\u0012\u0013\n\u000bsession_ids\u0018\u0001 \u0003(\t\u0012$\n\u001cextended_viewable_duration_s\u0018\u0002 \u0001(\u0004\"x\n\tTrackerId\u0012\u0012\n\ntracker_id\u0018\u0001 \u0001(\t\u0012\u000f\n\u0007unit_id\u0018\u0002 \u0001(\t\u00124\n\u000bdevice_type\u0018\u0003 \u0001(\u000e2\u001f.GDI.Proto.LiveTrack.DeviceType\u0012\u0010\n\bnickname\u0018\u0004 \u0001(\t\"a\n\u0012TwitterCredentials\u0012\u0012\n\nuser_token\u0018\u0001 \u0002(\t\u0012\u0013\n\u000buser_secret\u0018\u0002 \u0002(\t\u0012\u000e\n\u0006app_id\u0018\u0003 \u0002(\t\u0012\u0012\n\napp_secret\u0018\u0004 \u0002(\t\"\u001c\n\u001aUpdateSettingsNotification\"\u008c\u0002\n\u001eEmergencyCountdownNotification\u0012H\n\u0005state\u0018\u0001 \u0001(\u000e29.GDI.Proto.LiveTrack.EmergencyCountdownNotification.State\u0012\u0013\n\u000btime_left_s\u0018\u0002 \u0001(\r\u0012\u0012\n\nutc_time_s\u0018\u0003 \u0001(\r\u00126\n\fsession_type\u0018\u0004 \u0001(\u000e2 .GDI.Proto.LiveTrack.SessionType\"?\n\u0005State\u0012\n\n\u0006PAUSED\u0010\u0000\u0012\u000f\n\u000bIN_PROGRESS\u0010\u0001\u0012\f\n\bCANCELED\u0010\u0002\u0012\u000b\n\u0007EXPIRED\u0010\u0003\"Á\u0001\n\u0013ConsentNotification\u0012!\n\u0019prompt_group_ride_consent\u0018\u0001 \u0001(\b\u0012W\n\u0013consent_page_action\u0018\u0002 \u0001(\u000e2:.GDI.Proto.LiveTrack.ConsentNotification.ConsentPageAction\".\n\u0011ConsentPageAction\u0012\u000b\n\u0007GRANTED\u0010\u0000\u0012\f\n\bREJECTED\u0010\u0001\"3\n\u0015GroupRideNotification\u0012\u001a\n\u0012share_session_code\u0018\u0001 \u0001(\t*«\u0002\n\nDeviceType\u0012\u0007\n\u0003PND\u0010\u0000\u0012\t\n\u0005GTU10\u0010\u0001\u0012\t\n\u0005EMAIL\u0010\u0002\u0012\u000b\n\u0007TWITTER\u0010\u0004\u0012\f\n\bMYGARMIN\u0010\u0005\u0012\u0010\n\fMYGARMINUSER\u0010\u0006\u0012\r\n\tMYGTUUSER\u0010\u0007\u0012\u000e\n\nFITNESSAPP\u0010\b\u0012\u000e\n\nGROUPTRACK\u0010\t\u0012\u000e\n\nCONNECTION\u0010\n\u0012\n\n\u0006STRAVA\u0010\u000b\u0012\f\n\bWEARABLE\u0010\f\u0012\r\n\tEMERGENCY\u0010\r\u0012\r\n\tANONYMOUS\u0010\u000e\u0012\t\n\u0005WALDO\u0010\u000f\u0012\u000f\n\u000bJRMOBILEAPP\u0010\u0010\u0012\r\n\tLIVEEVENT\u0010\u0011\u0012\u0012\n\u000eSMS_SUBSCRIBER\u0010\u0012\u0012\u001b\n\u0017SUBSCRIPTION_SUBSCRIBER\u0010\u0013*y\n\u000bSessionType\u0012\u0014\n\u0007UNKNOWN\u0010ÿÿÿÿÿÿÿÿÿ\u0001\u0012\f\n\bSTANDARD\u0010\u0000\u0012\u0007\n\u0003SOS\u0010\u0001\u0012\u0013\n\u000fINCIDENT_DETECT\u0010\u0002\u0012\u0012\n\u000eFALL_DETECTION\u0010\u0003\u0012\u0014\n\u0010FAMILY_EMERGENCY\u0010\u0004B1\n\u001acom.garmin.proto.generatedB\u0011GDILiveTrackProtoH\u0003"}, new Descriptors.FileDescriptor[]{GDICore.getDescriptor()});
    private static final Descriptors.Descriptor internal_static_GDI_Proto_LiveTrack_CapabilitiesRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_LiveTrack_CapabilitiesRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_LiveTrack_CapabilitiesResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_LiveTrack_CapabilitiesResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_LiveTrack_ConsentChangedNotification_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_LiveTrack_ConsentChangedNotification_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_LiveTrack_ConsentNotification_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_LiveTrack_ConsentNotification_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_LiveTrack_EmergencyCountdownNotification_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_LiveTrack_EmergencyCountdownNotification_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_LiveTrack_GroupRideNotification_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_LiveTrack_GroupRideNotification_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_LiveTrack_LiveEventSharingNotification_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_LiveTrack_LiveEventSharingNotification_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_LiveTrack_LiveTrackService_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_LiveTrack_LiveTrackService_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_LiveTrack_SessionGroup_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_LiveTrack_SessionGroup_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_LiveTrack_SessionSupportRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_LiveTrack_SessionSupportRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_LiveTrack_SessionSupportResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_LiveTrack_SessionSupportResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_LiveTrack_Session_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_LiveTrack_Session_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_LiveTrack_ShareDeviceSettingNotification_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_LiveTrack_ShareDeviceSettingNotification_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_LiveTrack_ShareMetaConfigurationNotification_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_LiveTrack_ShareMetaConfigurationNotification_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_LiveTrack_ShareSocialCredentialsNotification_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_LiveTrack_ShareSocialCredentialsNotification_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_LiveTrack_StartRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_LiveTrack_StartRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_LiveTrack_StartResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_LiveTrack_StartResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_LiveTrack_StatusNotification_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_LiveTrack_StatusNotification_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_LiveTrack_StopNotification_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_LiveTrack_StopNotification_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_LiveTrack_TrackerId_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_LiveTrack_TrackerId_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_LiveTrack_TwitterCredentials_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_LiveTrack_TwitterCredentials_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_LiveTrack_UpdateSettingsNotification_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_LiveTrack_UpdateSettingsNotification_fieldAccessorTable;

    public interface CapabilitiesRequestOrBuilder extends MessageOrBuilder {
        int getServiceVersion();

        boolean hasServiceVersion();
    }

    public interface CapabilitiesResponseOrBuilder extends MessageOrBuilder {
    }

    public interface ConsentChangedNotificationOrBuilder extends MessageOrBuilder {
        boolean getHasStravaConsent();

        boolean hasHasStravaConsent();
    }

    public interface ConsentNotificationOrBuilder extends MessageOrBuilder {
        ConsentNotification.ConsentPageAction getConsentPageAction();

        boolean getPromptGroupRideConsent();

        boolean hasConsentPageAction();

        boolean hasPromptGroupRideConsent();
    }

    public interface EmergencyCountdownNotificationOrBuilder extends MessageOrBuilder {
        SessionType getSessionType();

        EmergencyCountdownNotification.State getState();

        int getTimeLeftS();

        int getUtcTimeS();

        boolean hasSessionType();

        boolean hasState();

        boolean hasTimeLeftS();

        boolean hasUtcTimeS();
    }

    public interface GroupRideNotificationOrBuilder extends MessageOrBuilder {
        String getShareSessionCode();

        ByteString getShareSessionCodeBytes();

        boolean hasShareSessionCode();
    }

    public interface LiveEventSharingNotificationOrBuilder extends MessageOrBuilder {
        boolean getLivetrackRequested();

        boolean hasLivetrackRequested();
    }

    public interface LiveTrackServiceOrBuilder extends MessageOrBuilder {
        ConsentChangedNotification getConsentChangedNotification();

        ConsentChangedNotificationOrBuilder getConsentChangedNotificationOrBuilder();

        ConsentNotification getConsentNotification();

        ConsentNotificationOrBuilder getConsentNotificationOrBuilder();

        EmergencyCountdownNotification getEmergencyCountdownNotification();

        EmergencyCountdownNotificationOrBuilder getEmergencyCountdownNotificationOrBuilder();

        GroupRideNotification getGroupRideNotification();

        GroupRideNotificationOrBuilder getGroupRideNotificationOrBuilder();

        LiveEventSharingNotification getLiveEventSharingNotification();

        LiveEventSharingNotificationOrBuilder getLiveEventSharingNotificationOrBuilder();

        SessionSupportRequest getSessionSupportRequest();

        SessionSupportRequestOrBuilder getSessionSupportRequestOrBuilder();

        SessionSupportResponse getSessionSupportResponse();

        SessionSupportResponseOrBuilder getSessionSupportResponseOrBuilder();

        ShareDeviceSettingNotification getShareDeviceSettingNotification();

        ShareDeviceSettingNotificationOrBuilder getShareDeviceSettingNotificationOrBuilder();

        ShareMetaConfigurationNotification getShareMetaConfigNotification();

        ShareMetaConfigurationNotificationOrBuilder getShareMetaConfigNotificationOrBuilder();

        ShareSocialCredentialsNotification getShareSocialNotification();

        ShareSocialCredentialsNotificationOrBuilder getShareSocialNotificationOrBuilder();

        StartRequest getStartRequest();

        StartRequestOrBuilder getStartRequestOrBuilder();

        StartResponse getStartResponse();

        StartResponseOrBuilder getStartResponseOrBuilder();

        StatusNotification getStatusNotification();

        StatusNotificationOrBuilder getStatusNotificationOrBuilder();

        StopNotification getStopNotification();

        StopNotificationOrBuilder getStopNotificationOrBuilder();

        UpdateSettingsNotification getUpdateSettingsNotification();

        UpdateSettingsNotificationOrBuilder getUpdateSettingsNotificationOrBuilder();

        boolean hasConsentChangedNotification();

        boolean hasConsentNotification();

        boolean hasEmergencyCountdownNotification();

        boolean hasGroupRideNotification();

        boolean hasLiveEventSharingNotification();

        boolean hasSessionSupportRequest();

        boolean hasSessionSupportResponse();

        boolean hasShareDeviceSettingNotification();

        boolean hasShareMetaConfigNotification();

        boolean hasShareSocialNotification();

        boolean hasStartRequest();

        boolean hasStartResponse();

        boolean hasStatusNotification();

        boolean hasStopNotification();

        boolean hasUpdateSettingsNotification();
    }

    public interface SessionGroupOrBuilder extends MessageOrBuilder {
        long getDurationS();

        String getName();

        ByteString getNameBytes();

        SessionType getSessionType();

        Session getSessions(int i14);

        int getSessionsCount();

        List<Session> getSessionsList();

        SessionOrBuilder getSessionsOrBuilder(int i14);

        List<? extends SessionOrBuilder> getSessionsOrBuilderList();

        long getStartUnixTimestamp();

        boolean hasDurationS();

        boolean hasName();

        boolean hasSessionType();

        boolean hasStartUnixTimestamp();
    }

    public interface SessionOrBuilder extends MessageOrBuilder {
        DeviceType getDeviceType();

        String getId();

        ByteString getIdBytes();

        String getToken();

        ByteString getTokenBytes();

        boolean hasDeviceType();

        boolean hasId();

        boolean hasToken();
    }

    public interface SessionSupportRequestOrBuilder extends MessageOrBuilder {
    }

    public interface SessionSupportResponseOrBuilder extends MessageOrBuilder {
        boolean getSpectatorMessagingSupported();

        DeviceType getSupportedSessionTypes(int i14);

        int getSupportedSessionTypesCount();

        List<DeviceType> getSupportedSessionTypesList();

        boolean hasSpectatorMessagingSupported();
    }

    public interface ShareDeviceSettingNotificationOrBuilder extends MessageOrBuilder {
        boolean getAutoStartEnabled();

        boolean getCourseSharingEnabled();

        boolean getSpectatorAudioEnabled();

        boolean getSpectatorTextEnabled();

        boolean hasAutoStartEnabled();

        boolean hasCourseSharingEnabled();

        boolean hasSpectatorAudioEnabled();

        boolean hasSpectatorTextEnabled();
    }

    public interface ShareMetaConfigurationNotificationOrBuilder extends MessageOrBuilder {
        boolean getEmailSharingEnabled();

        boolean getExtendLivetrackEnabled();

        boolean getGrouptrackAllConnections();

        boolean getGrouptrackSharingEnabled();

        String getSessionName();

        ByteString getSessionNameBytes();

        boolean getTwitterSharingEnabled();

        boolean hasEmailSharingEnabled();

        boolean hasExtendLivetrackEnabled();

        boolean hasGrouptrackAllConnections();

        boolean hasGrouptrackSharingEnabled();

        boolean hasSessionName();

        boolean hasTwitterSharingEnabled();
    }

    public interface ShareSocialCredentialsNotificationOrBuilder extends MessageOrBuilder {
        boolean getStravaBeaconConnected();

        TwitterCredentials getTwitter();

        TwitterCredentialsOrBuilder getTwitterOrBuilder();

        boolean hasStravaBeaconConnected();

        boolean hasTwitter();
    }

    public interface StartRequestOrBuilder extends MessageOrBuilder {
        SessionGroup getSession();

        SessionGroupOrBuilder getSessionOrBuilder();

        TrackerId getTrackerId();

        TrackerIdOrBuilder getTrackerIdOrBuilder();

        boolean hasSession();

        boolean hasTrackerId();
    }

    public interface StartResponseOrBuilder extends MessageOrBuilder {
        StartResponse.Status getStartStatus();

        boolean hasStartStatus();
    }

    public interface StatusNotificationOrBuilder extends MessageOrBuilder {
        SessionGroup getSession();

        SessionGroupOrBuilder getSessionOrBuilder();

        TrackerId getTrackerId();

        TrackerIdOrBuilder getTrackerIdOrBuilder();

        boolean hasSession();

        boolean hasTrackerId();
    }

    public interface StopNotificationOrBuilder extends MessageOrBuilder {
        long getExtendedViewableDurationS();

        String getSessionIds(int i14);

        ByteString getSessionIdsBytes(int i14);

        int getSessionIdsCount();

        List<String> getSessionIdsList();

        boolean hasExtendedViewableDurationS();
    }

    public interface TrackerIdOrBuilder extends MessageOrBuilder {
        DeviceType getDeviceType();

        String getNickname();

        ByteString getNicknameBytes();

        String getTrackerId();

        ByteString getTrackerIdBytes();

        String getUnitId();

        ByteString getUnitIdBytes();

        boolean hasDeviceType();

        boolean hasNickname();

        boolean hasTrackerId();

        boolean hasUnitId();
    }

    public interface TwitterCredentialsOrBuilder extends MessageOrBuilder {
        String getAppId();

        ByteString getAppIdBytes();

        String getAppSecret();

        ByteString getAppSecretBytes();

        String getUserSecret();

        ByteString getUserSecretBytes();

        String getUserToken();

        ByteString getUserTokenBytes();

        boolean hasAppId();

        boolean hasAppSecret();

        boolean hasUserSecret();

        boolean hasUserToken();
    }

    public interface UpdateSettingsNotificationOrBuilder extends MessageOrBuilder {
    }

    static {
        Descriptors.Descriptor descriptor2 = (Descriptors.Descriptor) a.n(0);
        internal_static_GDI_Proto_LiveTrack_CapabilitiesRequest_descriptor = descriptor2;
        internal_static_GDI_Proto_LiveTrack_CapabilitiesRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"ServiceVersion"});
        Descriptors.Descriptor descriptor3 = (Descriptors.Descriptor) a.n(1);
        internal_static_GDI_Proto_LiveTrack_CapabilitiesResponse_descriptor = descriptor3;
        internal_static_GDI_Proto_LiveTrack_CapabilitiesResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[0]);
        Descriptors.Descriptor descriptor4 = (Descriptors.Descriptor) a.n(2);
        internal_static_GDI_Proto_LiveTrack_LiveTrackService_descriptor = descriptor4;
        internal_static_GDI_Proto_LiveTrack_LiveTrackService_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[]{"ShareMetaConfigNotification", "ShareSocialNotification", "StartRequest", "StartResponse", "StopNotification", "ShareDeviceSettingNotification", "StatusNotification", "ConsentChangedNotification", "LiveEventSharingNotification", "SessionSupportRequest", "SessionSupportResponse", "UpdateSettingsNotification", "EmergencyCountdownNotification", "ConsentNotification", "GroupRideNotification"});
        Descriptors.Descriptor descriptor5 = (Descriptors.Descriptor) a.n(3);
        internal_static_GDI_Proto_LiveTrack_Session_descriptor = descriptor5;
        internal_static_GDI_Proto_LiveTrack_Session_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor5, new String[]{"Id", "Token", "DeviceType"});
        Descriptors.Descriptor descriptor6 = (Descriptors.Descriptor) a.n(4);
        internal_static_GDI_Proto_LiveTrack_SessionGroup_descriptor = descriptor6;
        internal_static_GDI_Proto_LiveTrack_SessionGroup_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor6, new String[]{"SessionType", "Name", "StartUnixTimestamp", "DurationS", "Sessions"});
        Descriptors.Descriptor descriptor7 = (Descriptors.Descriptor) a.n(5);
        internal_static_GDI_Proto_LiveTrack_ShareDeviceSettingNotification_descriptor = descriptor7;
        internal_static_GDI_Proto_LiveTrack_ShareDeviceSettingNotification_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor7, new String[]{"AutoStartEnabled", "SpectatorAudioEnabled", "SpectatorTextEnabled", "CourseSharingEnabled"});
        Descriptors.Descriptor descriptor8 = (Descriptors.Descriptor) a.n(6);
        internal_static_GDI_Proto_LiveTrack_ConsentChangedNotification_descriptor = descriptor8;
        internal_static_GDI_Proto_LiveTrack_ConsentChangedNotification_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor8, new String[]{"HasStravaConsent"});
        Descriptors.Descriptor descriptor9 = (Descriptors.Descriptor) a.n(7);
        internal_static_GDI_Proto_LiveTrack_LiveEventSharingNotification_descriptor = descriptor9;
        internal_static_GDI_Proto_LiveTrack_LiveEventSharingNotification_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor9, new String[]{"LivetrackRequested"});
        Descriptors.Descriptor descriptor10 = (Descriptors.Descriptor) a.n(8);
        internal_static_GDI_Proto_LiveTrack_ShareMetaConfigurationNotification_descriptor = descriptor10;
        internal_static_GDI_Proto_LiveTrack_ShareMetaConfigurationNotification_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor10, new String[]{"GrouptrackSharingEnabled", "ExtendLivetrackEnabled", "EmailSharingEnabled", "TwitterSharingEnabled", "SessionName", "GrouptrackAllConnections"});
        Descriptors.Descriptor descriptor11 = (Descriptors.Descriptor) a.n(9);
        internal_static_GDI_Proto_LiveTrack_ShareSocialCredentialsNotification_descriptor = descriptor11;
        internal_static_GDI_Proto_LiveTrack_ShareSocialCredentialsNotification_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor11, new String[]{"Twitter", "StravaBeaconConnected"});
        Descriptors.Descriptor descriptor12 = (Descriptors.Descriptor) a.n(10);
        internal_static_GDI_Proto_LiveTrack_SessionSupportRequest_descriptor = descriptor12;
        internal_static_GDI_Proto_LiveTrack_SessionSupportRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor12, new String[0]);
        Descriptors.Descriptor descriptor13 = (Descriptors.Descriptor) a.n(11);
        internal_static_GDI_Proto_LiveTrack_SessionSupportResponse_descriptor = descriptor13;
        internal_static_GDI_Proto_LiveTrack_SessionSupportResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor13, new String[]{"SupportedSessionTypes", "SpectatorMessagingSupported"});
        Descriptors.Descriptor descriptor14 = (Descriptors.Descriptor) a.n(12);
        internal_static_GDI_Proto_LiveTrack_StartRequest_descriptor = descriptor14;
        internal_static_GDI_Proto_LiveTrack_StartRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor14, new String[]{"Session", "TrackerId"});
        Descriptors.Descriptor descriptor15 = (Descriptors.Descriptor) a.n(13);
        internal_static_GDI_Proto_LiveTrack_StartResponse_descriptor = descriptor15;
        internal_static_GDI_Proto_LiveTrack_StartResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor15, new String[]{"StartStatus"});
        Descriptors.Descriptor descriptor16 = (Descriptors.Descriptor) a.n(14);
        internal_static_GDI_Proto_LiveTrack_StatusNotification_descriptor = descriptor16;
        internal_static_GDI_Proto_LiveTrack_StatusNotification_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor16, new String[]{"Session", "TrackerId"});
        Descriptors.Descriptor descriptor17 = (Descriptors.Descriptor) a.n(15);
        internal_static_GDI_Proto_LiveTrack_StopNotification_descriptor = descriptor17;
        internal_static_GDI_Proto_LiveTrack_StopNotification_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor17, new String[]{"SessionIds", "ExtendedViewableDurationS"});
        Descriptors.Descriptor descriptor18 = (Descriptors.Descriptor) a.n(16);
        internal_static_GDI_Proto_LiveTrack_TrackerId_descriptor = descriptor18;
        internal_static_GDI_Proto_LiveTrack_TrackerId_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor18, new String[]{"TrackerId", "UnitId", "DeviceType", "Nickname"});
        Descriptors.Descriptor descriptor19 = (Descriptors.Descriptor) a.n(17);
        internal_static_GDI_Proto_LiveTrack_TwitterCredentials_descriptor = descriptor19;
        internal_static_GDI_Proto_LiveTrack_TwitterCredentials_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor19, new String[]{"UserToken", "UserSecret", "AppId", "AppSecret"});
        Descriptors.Descriptor descriptor20 = (Descriptors.Descriptor) a.n(18);
        internal_static_GDI_Proto_LiveTrack_UpdateSettingsNotification_descriptor = descriptor20;
        internal_static_GDI_Proto_LiveTrack_UpdateSettingsNotification_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor20, new String[0]);
        Descriptors.Descriptor descriptor21 = (Descriptors.Descriptor) a.n(19);
        internal_static_GDI_Proto_LiveTrack_EmergencyCountdownNotification_descriptor = descriptor21;
        internal_static_GDI_Proto_LiveTrack_EmergencyCountdownNotification_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor21, new String[]{"State", "TimeLeftS", "UtcTimeS", "SessionType"});
        Descriptors.Descriptor descriptor22 = (Descriptors.Descriptor) a.n(20);
        internal_static_GDI_Proto_LiveTrack_ConsentNotification_descriptor = descriptor22;
        internal_static_GDI_Proto_LiveTrack_ConsentNotification_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor22, new String[]{"PromptGroupRideConsent", "ConsentPageAction"});
        Descriptors.Descriptor descriptor23 = (Descriptors.Descriptor) a.n(21);
        internal_static_GDI_Proto_LiveTrack_GroupRideNotification_descriptor = descriptor23;
        internal_static_GDI_Proto_LiveTrack_GroupRideNotification_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor23, new String[]{"ShareSessionCode"});
        GDICore.getDescriptor();
    }

    private GDILiveTrackProto() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.add(CapabilitiesRequest.featuresRequest);
        extensionRegistryLite.add(CapabilitiesResponse.featuresResponse);
    }

    public static final class CapabilitiesRequest extends GeneratedMessageV3 implements CapabilitiesRequestOrBuilder {
        public static final int FEATURES_REQUEST_FIELD_NUMBER = 41;
        public static final int SERVICE_VERSION_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int serviceVersion_;
        private static final CapabilitiesRequest DEFAULT_INSTANCE = new CapabilitiesRequest();

        @Deprecated
        public static final Parser<CapabilitiesRequest> PARSER = new AbstractParser<CapabilitiesRequest>() { // from class: com.garmin.proto.generated.GDILiveTrackProto.CapabilitiesRequest.1
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
            this.serviceVersion_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static CapabilitiesRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDILiveTrackProto.internal_static_GDI_Proto_LiveTrack_CapabilitiesRequest_descriptor;
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
            if (hasServiceVersion() != capabilitiesRequest.hasServiceVersion()) {
                return false;
            }
            return (!hasServiceVersion() || getServiceVersion() == capabilitiesRequest.getServiceVersion()) && getUnknownFields().equals(capabilitiesRequest.getUnknownFields());
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
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.serviceVersion_) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.CapabilitiesRequestOrBuilder
        public int getServiceVersion() {
            return this.serviceVersion_;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.CapabilitiesRequestOrBuilder
        public boolean hasServiceVersion() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasServiceVersion()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getServiceVersion();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDILiveTrackProto.internal_static_GDI_Proto_LiveTrack_CapabilitiesRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(CapabilitiesRequest.class, Builder.class);
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
                codedOutputStream.writeUInt32(1, this.serviceVersion_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CapabilitiesRequestOrBuilder {
            private int bitField0_;
            private int serviceVersion_;

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private void buildPartial0(CapabilitiesRequest capabilitiesRequest) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    capabilitiesRequest.serviceVersion_ = this.serviceVersion_;
                } else {
                    i14 = 0;
                }
                capabilitiesRequest.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDILiveTrackProto.internal_static_GDI_Proto_LiveTrack_CapabilitiesRequest_descriptor;
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
                this.serviceVersion_ = 0;
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

            public Builder clearServiceVersion() {
                this.bitField0_ &= -2;
                this.serviceVersion_ = 0;
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
                return GDILiveTrackProto.internal_static_GDI_Proto_LiveTrack_CapabilitiesRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.CapabilitiesRequestOrBuilder
            public int getServiceVersion() {
                return this.serviceVersion_;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.CapabilitiesRequestOrBuilder
            public boolean hasServiceVersion() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDILiveTrackProto.internal_static_GDI_Proto_LiveTrack_CapabilitiesRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(CapabilitiesRequest.class, Builder.class);
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
                                    this.serviceVersion_ = codedInputStream.readUInt32();
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

            public Builder setServiceVersion(int i14) {
                this.serviceVersion_ = i14;
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
                if (capabilitiesRequest.hasServiceVersion()) {
                    setServiceVersion(capabilitiesRequest.getServiceVersion());
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
            this.serviceVersion_ = 0;
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

    public static final class CapabilitiesResponse extends GeneratedMessageV3 implements CapabilitiesResponseOrBuilder {
        public static final int FEATURES_RESPONSE_FIELD_NUMBER = 41;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        private static final CapabilitiesResponse DEFAULT_INSTANCE = new CapabilitiesResponse();

        @Deprecated
        public static final Parser<CapabilitiesResponse> PARSER = new AbstractParser<CapabilitiesResponse>() { // from class: com.garmin.proto.generated.GDILiveTrackProto.CapabilitiesResponse.1
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
            return GDILiveTrackProto.internal_static_GDI_Proto_LiveTrack_CapabilitiesResponse_descriptor;
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
            if (obj instanceof CapabilitiesResponse) {
                return getUnknownFields().equals(((CapabilitiesResponse) obj).getUnknownFields());
            }
            return super.equals(obj);
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
            return GDILiveTrackProto.internal_static_GDI_Proto_LiveTrack_CapabilitiesResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(CapabilitiesResponse.class, Builder.class);
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
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CapabilitiesResponseOrBuilder {
            public /* synthetic */ Builder(int i14) {
                this();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDILiveTrackProto.internal_static_GDI_Proto_LiveTrack_CapabilitiesResponse_descriptor;
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
                onBuilt();
                return capabilitiesResponse;
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
                return GDILiveTrackProto.internal_static_GDI_Proto_LiveTrack_CapabilitiesResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDILiveTrackProto.internal_static_GDI_Proto_LiveTrack_CapabilitiesResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(CapabilitiesResponse.class, Builder.class);
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
            public CapabilitiesResponse getDefaultInstanceForType() {
                return CapabilitiesResponse.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
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

    public static final class ConsentChangedNotification extends GeneratedMessageV3 implements ConsentChangedNotificationOrBuilder {
        public static final int HAS_STRAVA_CONSENT_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private boolean hasStravaConsent_;
        private byte memoizedIsInitialized;
        private static final ConsentChangedNotification DEFAULT_INSTANCE = new ConsentChangedNotification();

        @Deprecated
        public static final Parser<ConsentChangedNotification> PARSER = new AbstractParser<ConsentChangedNotification>() { // from class: com.garmin.proto.generated.GDILiveTrackProto.ConsentChangedNotification.1
            @Override // com.google.protobuf.Parser
            public ConsentChangedNotification parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = ConsentChangedNotification.newBuilder();
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

        private ConsentChangedNotification(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.hasStravaConsent_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ConsentChangedNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDILiveTrackProto.internal_static_GDI_Proto_LiveTrack_ConsentChangedNotification_descriptor;
        }

        public static Builder newBuilder(ConsentChangedNotification consentChangedNotification) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(consentChangedNotification);
        }

        public static ConsentChangedNotification parseDelimitedFrom(InputStream inputStream) {
            return (ConsentChangedNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ConsentChangedNotification parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<ConsentChangedNotification> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ConsentChangedNotification)) {
                return super.equals(obj);
            }
            ConsentChangedNotification consentChangedNotification = (ConsentChangedNotification) obj;
            if (hasHasStravaConsent() != consentChangedNotification.hasHasStravaConsent()) {
                return false;
            }
            return (!hasHasStravaConsent() || getHasStravaConsent() == consentChangedNotification.getHasStravaConsent()) && getUnknownFields().equals(consentChangedNotification.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.ConsentChangedNotificationOrBuilder
        public boolean getHasStravaConsent() {
            return this.hasStravaConsent_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ConsentChangedNotification> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeBoolSize(2, this.hasStravaConsent_) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.ConsentChangedNotificationOrBuilder
        public boolean hasHasStravaConsent() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasHasStravaConsent()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + Internal.hashBoolean(getHasStravaConsent());
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDILiveTrackProto.internal_static_GDI_Proto_LiveTrack_ConsentChangedNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(ConsentChangedNotification.class, Builder.class);
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
            return new ConsentChangedNotification();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeBool(2, this.hasStravaConsent_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ConsentChangedNotificationOrBuilder {
            private int bitField0_;
            private boolean hasStravaConsent_;

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private void buildPartial0(ConsentChangedNotification consentChangedNotification) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    consentChangedNotification.hasStravaConsent_ = this.hasStravaConsent_;
                } else {
                    i14 = 0;
                }
                consentChangedNotification.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDILiveTrackProto.internal_static_GDI_Proto_LiveTrack_ConsentChangedNotification_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ConsentChangedNotification build() {
                ConsentChangedNotification consentChangedNotificationBuildPartial = buildPartial();
                if (consentChangedNotificationBuildPartial.isInitialized()) {
                    return consentChangedNotificationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) consentChangedNotificationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ConsentChangedNotification buildPartial() {
                ConsentChangedNotification consentChangedNotification = new ConsentChangedNotification(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(consentChangedNotification);
                }
                onBuilt();
                return consentChangedNotification;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.hasStravaConsent_ = false;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearHasStravaConsent() {
                this.bitField0_ &= -2;
                this.hasStravaConsent_ = false;
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
                return GDILiveTrackProto.internal_static_GDI_Proto_LiveTrack_ConsentChangedNotification_descriptor;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.ConsentChangedNotificationOrBuilder
            public boolean getHasStravaConsent() {
                return this.hasStravaConsent_;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.ConsentChangedNotificationOrBuilder
            public boolean hasHasStravaConsent() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDILiveTrackProto.internal_static_GDI_Proto_LiveTrack_ConsentChangedNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(ConsentChangedNotification.class, Builder.class);
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
                                if (tag == 16) {
                                    this.hasStravaConsent_ = codedInputStream.readBool();
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

            public Builder setHasStravaConsent(boolean z14) {
                this.hasStravaConsent_ = z14;
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
            public ConsentChangedNotification getDefaultInstanceForType() {
                return ConsentChangedNotification.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ConsentChangedNotification) {
                    return mergeFrom((ConsentChangedNotification) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ConsentChangedNotification consentChangedNotification) {
                if (consentChangedNotification == ConsentChangedNotification.getDefaultInstance()) {
                    return this;
                }
                if (consentChangedNotification.hasHasStravaConsent()) {
                    setHasStravaConsent(consentChangedNotification.getHasStravaConsent());
                }
                mergeUnknownFields(consentChangedNotification.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ConsentChangedNotification getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static ConsentChangedNotification parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConsentChangedNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ConsentChangedNotification parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ ConsentChangedNotification(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static ConsentChangedNotification parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private ConsentChangedNotification() {
            this.hasStravaConsent_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ConsentChangedNotification parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ConsentChangedNotification parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static ConsentChangedNotification parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static ConsentChangedNotification parseFrom(InputStream inputStream) {
            return (ConsentChangedNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static ConsentChangedNotification parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConsentChangedNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ConsentChangedNotification parseFrom(CodedInputStream codedInputStream) {
            return (ConsentChangedNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static ConsentChangedNotification parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConsentChangedNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class LiveEventSharingNotification extends GeneratedMessageV3 implements LiveEventSharingNotificationOrBuilder {
        public static final int LIVETRACK_REQUESTED_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private boolean livetrackRequested_;
        private byte memoizedIsInitialized;
        private static final LiveEventSharingNotification DEFAULT_INSTANCE = new LiveEventSharingNotification();

        @Deprecated
        public static final Parser<LiveEventSharingNotification> PARSER = new AbstractParser<LiveEventSharingNotification>() { // from class: com.garmin.proto.generated.GDILiveTrackProto.LiveEventSharingNotification.1
            @Override // com.google.protobuf.Parser
            public LiveEventSharingNotification parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = LiveEventSharingNotification.newBuilder();
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

        private LiveEventSharingNotification(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.livetrackRequested_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static LiveEventSharingNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDILiveTrackProto.internal_static_GDI_Proto_LiveTrack_LiveEventSharingNotification_descriptor;
        }

        public static Builder newBuilder(LiveEventSharingNotification liveEventSharingNotification) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(liveEventSharingNotification);
        }

        public static LiveEventSharingNotification parseDelimitedFrom(InputStream inputStream) {
            return (LiveEventSharingNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static LiveEventSharingNotification parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<LiveEventSharingNotification> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof LiveEventSharingNotification)) {
                return super.equals(obj);
            }
            LiveEventSharingNotification liveEventSharingNotification = (LiveEventSharingNotification) obj;
            if (hasLivetrackRequested() != liveEventSharingNotification.hasLivetrackRequested()) {
                return false;
            }
            return (!hasLivetrackRequested() || getLivetrackRequested() == liveEventSharingNotification.getLivetrackRequested()) && getUnknownFields().equals(liveEventSharingNotification.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.LiveEventSharingNotificationOrBuilder
        public boolean getLivetrackRequested() {
            return this.livetrackRequested_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<LiveEventSharingNotification> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeBoolSize(1, this.livetrackRequested_) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.LiveEventSharingNotificationOrBuilder
        public boolean hasLivetrackRequested() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasLivetrackRequested()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + Internal.hashBoolean(getLivetrackRequested());
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDILiveTrackProto.internal_static_GDI_Proto_LiveTrack_LiveEventSharingNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(LiveEventSharingNotification.class, Builder.class);
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
            return new LiveEventSharingNotification();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeBool(1, this.livetrackRequested_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements LiveEventSharingNotificationOrBuilder {
            private int bitField0_;
            private boolean livetrackRequested_;

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private void buildPartial0(LiveEventSharingNotification liveEventSharingNotification) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    liveEventSharingNotification.livetrackRequested_ = this.livetrackRequested_;
                } else {
                    i14 = 0;
                }
                liveEventSharingNotification.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDILiveTrackProto.internal_static_GDI_Proto_LiveTrack_LiveEventSharingNotification_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public LiveEventSharingNotification build() {
                LiveEventSharingNotification liveEventSharingNotificationBuildPartial = buildPartial();
                if (liveEventSharingNotificationBuildPartial.isInitialized()) {
                    return liveEventSharingNotificationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) liveEventSharingNotificationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public LiveEventSharingNotification buildPartial() {
                LiveEventSharingNotification liveEventSharingNotification = new LiveEventSharingNotification(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(liveEventSharingNotification);
                }
                onBuilt();
                return liveEventSharingNotification;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.livetrackRequested_ = false;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearLivetrackRequested() {
                this.bitField0_ &= -2;
                this.livetrackRequested_ = false;
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
                return GDILiveTrackProto.internal_static_GDI_Proto_LiveTrack_LiveEventSharingNotification_descriptor;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.LiveEventSharingNotificationOrBuilder
            public boolean getLivetrackRequested() {
                return this.livetrackRequested_;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.LiveEventSharingNotificationOrBuilder
            public boolean hasLivetrackRequested() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDILiveTrackProto.internal_static_GDI_Proto_LiveTrack_LiveEventSharingNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(LiveEventSharingNotification.class, Builder.class);
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
                                    this.livetrackRequested_ = codedInputStream.readBool();
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

            public Builder setLivetrackRequested(boolean z14) {
                this.livetrackRequested_ = z14;
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
            public LiveEventSharingNotification getDefaultInstanceForType() {
                return LiveEventSharingNotification.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof LiveEventSharingNotification) {
                    return mergeFrom((LiveEventSharingNotification) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(LiveEventSharingNotification liveEventSharingNotification) {
                if (liveEventSharingNotification == LiveEventSharingNotification.getDefaultInstance()) {
                    return this;
                }
                if (liveEventSharingNotification.hasLivetrackRequested()) {
                    setLivetrackRequested(liveEventSharingNotification.getLivetrackRequested());
                }
                mergeUnknownFields(liveEventSharingNotification.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public LiveEventSharingNotification getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static LiveEventSharingNotification parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LiveEventSharingNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static LiveEventSharingNotification parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ LiveEventSharingNotification(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static LiveEventSharingNotification parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private LiveEventSharingNotification() {
            this.livetrackRequested_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static LiveEventSharingNotification parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static LiveEventSharingNotification parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static LiveEventSharingNotification parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static LiveEventSharingNotification parseFrom(InputStream inputStream) {
            return (LiveEventSharingNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static LiveEventSharingNotification parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LiveEventSharingNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static LiveEventSharingNotification parseFrom(CodedInputStream codedInputStream) {
            return (LiveEventSharingNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static LiveEventSharingNotification parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LiveEventSharingNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class SessionSupportRequest extends GeneratedMessageV3 implements SessionSupportRequestOrBuilder {
        private static final SessionSupportRequest DEFAULT_INSTANCE = new SessionSupportRequest();

        @Deprecated
        public static final Parser<SessionSupportRequest> PARSER = new AbstractParser<SessionSupportRequest>() { // from class: com.garmin.proto.generated.GDILiveTrackProto.SessionSupportRequest.1
            @Override // com.google.protobuf.Parser
            public SessionSupportRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SessionSupportRequest.newBuilder();
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

        private SessionSupportRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SessionSupportRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDILiveTrackProto.internal_static_GDI_Proto_LiveTrack_SessionSupportRequest_descriptor;
        }

        public static Builder newBuilder(SessionSupportRequest sessionSupportRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sessionSupportRequest);
        }

        public static SessionSupportRequest parseDelimitedFrom(InputStream inputStream) {
            return (SessionSupportRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SessionSupportRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SessionSupportRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof SessionSupportRequest) {
                return getUnknownFields().equals(((SessionSupportRequest) obj).getUnknownFields());
            }
            return super.equals(obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SessionSupportRequest> getParserForType() {
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
            return GDILiveTrackProto.internal_static_GDI_Proto_LiveTrack_SessionSupportRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(SessionSupportRequest.class, Builder.class);
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
            return new SessionSupportRequest();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SessionSupportRequestOrBuilder {
            public /* synthetic */ Builder(int i14) {
                this();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDILiveTrackProto.internal_static_GDI_Proto_LiveTrack_SessionSupportRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SessionSupportRequest build() {
                SessionSupportRequest sessionSupportRequestBuildPartial = buildPartial();
                if (sessionSupportRequestBuildPartial.isInitialized()) {
                    return sessionSupportRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sessionSupportRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SessionSupportRequest buildPartial() {
                SessionSupportRequest sessionSupportRequest = new SessionSupportRequest(this);
                onBuilt();
                return sessionSupportRequest;
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
                return GDILiveTrackProto.internal_static_GDI_Proto_LiveTrack_SessionSupportRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDILiveTrackProto.internal_static_GDI_Proto_LiveTrack_SessionSupportRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(SessionSupportRequest.class, Builder.class);
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
            public SessionSupportRequest getDefaultInstanceForType() {
                return SessionSupportRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SessionSupportRequest) {
                    return mergeFrom((SessionSupportRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SessionSupportRequest sessionSupportRequest) {
                if (sessionSupportRequest == SessionSupportRequest.getDefaultInstance()) {
                    return this;
                }
                mergeUnknownFields(sessionSupportRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SessionSupportRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ SessionSupportRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private SessionSupportRequest() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SessionSupportRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SessionSupportRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SessionSupportRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SessionSupportRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SessionSupportRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SessionSupportRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static SessionSupportRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SessionSupportRequest parseFrom(InputStream inputStream) {
            return (SessionSupportRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static SessionSupportRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SessionSupportRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SessionSupportRequest parseFrom(CodedInputStream codedInputStream) {
            return (SessionSupportRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static SessionSupportRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SessionSupportRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class ShareDeviceSettingNotification extends GeneratedMessageV3 implements ShareDeviceSettingNotificationOrBuilder {
        public static final int AUTO_START_ENABLED_FIELD_NUMBER = 1;
        public static final int COURSE_SHARING_ENABLED_FIELD_NUMBER = 4;
        private static final ShareDeviceSettingNotification DEFAULT_INSTANCE = new ShareDeviceSettingNotification();

        @Deprecated
        public static final Parser<ShareDeviceSettingNotification> PARSER = new AbstractParser<ShareDeviceSettingNotification>() { // from class: com.garmin.proto.generated.GDILiveTrackProto.ShareDeviceSettingNotification.1
            @Override // com.google.protobuf.Parser
            public ShareDeviceSettingNotification parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = ShareDeviceSettingNotification.newBuilder();
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
        public static final int SPECTATOR_AUDIO_ENABLED_FIELD_NUMBER = 2;
        public static final int SPECTATOR_TEXT_ENABLED_FIELD_NUMBER = 3;
        private static final long serialVersionUID = 0;
        private boolean autoStartEnabled_;
        private int bitField0_;
        private boolean courseSharingEnabled_;
        private byte memoizedIsInitialized;
        private boolean spectatorAudioEnabled_;
        private boolean spectatorTextEnabled_;

        private ShareDeviceSettingNotification(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.autoStartEnabled_ = false;
            this.spectatorAudioEnabled_ = false;
            this.spectatorTextEnabled_ = false;
            this.courseSharingEnabled_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ShareDeviceSettingNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDILiveTrackProto.internal_static_GDI_Proto_LiveTrack_ShareDeviceSettingNotification_descriptor;
        }

        public static Builder newBuilder(ShareDeviceSettingNotification shareDeviceSettingNotification) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(shareDeviceSettingNotification);
        }

        public static ShareDeviceSettingNotification parseDelimitedFrom(InputStream inputStream) {
            return (ShareDeviceSettingNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ShareDeviceSettingNotification parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<ShareDeviceSettingNotification> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ShareDeviceSettingNotification)) {
                return super.equals(obj);
            }
            ShareDeviceSettingNotification shareDeviceSettingNotification = (ShareDeviceSettingNotification) obj;
            if (hasAutoStartEnabled() != shareDeviceSettingNotification.hasAutoStartEnabled()) {
                return false;
            }
            if ((hasAutoStartEnabled() && getAutoStartEnabled() != shareDeviceSettingNotification.getAutoStartEnabled()) || hasSpectatorAudioEnabled() != shareDeviceSettingNotification.hasSpectatorAudioEnabled()) {
                return false;
            }
            if ((hasSpectatorAudioEnabled() && getSpectatorAudioEnabled() != shareDeviceSettingNotification.getSpectatorAudioEnabled()) || hasSpectatorTextEnabled() != shareDeviceSettingNotification.hasSpectatorTextEnabled()) {
                return false;
            }
            if ((!hasSpectatorTextEnabled() || getSpectatorTextEnabled() == shareDeviceSettingNotification.getSpectatorTextEnabled()) && hasCourseSharingEnabled() == shareDeviceSettingNotification.hasCourseSharingEnabled()) {
                return (!hasCourseSharingEnabled() || getCourseSharingEnabled() == shareDeviceSettingNotification.getCourseSharingEnabled()) && getUnknownFields().equals(shareDeviceSettingNotification.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.ShareDeviceSettingNotificationOrBuilder
        public boolean getAutoStartEnabled() {
            return this.autoStartEnabled_;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.ShareDeviceSettingNotificationOrBuilder
        public boolean getCourseSharingEnabled() {
            return this.courseSharingEnabled_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ShareDeviceSettingNotification> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeBoolSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeBoolSize(1, this.autoStartEnabled_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeBoolSize += CodedOutputStream.computeBoolSize(2, this.spectatorAudioEnabled_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeBoolSize += CodedOutputStream.computeBoolSize(3, this.spectatorTextEnabled_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeBoolSize += CodedOutputStream.computeBoolSize(4, this.courseSharingEnabled_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeBoolSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.ShareDeviceSettingNotificationOrBuilder
        public boolean getSpectatorAudioEnabled() {
            return this.spectatorAudioEnabled_;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.ShareDeviceSettingNotificationOrBuilder
        public boolean getSpectatorTextEnabled() {
            return this.spectatorTextEnabled_;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.ShareDeviceSettingNotificationOrBuilder
        public boolean hasAutoStartEnabled() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.ShareDeviceSettingNotificationOrBuilder
        public boolean hasCourseSharingEnabled() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.ShareDeviceSettingNotificationOrBuilder
        public boolean hasSpectatorAudioEnabled() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.ShareDeviceSettingNotificationOrBuilder
        public boolean hasSpectatorTextEnabled() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasAutoStartEnabled()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + Internal.hashBoolean(getAutoStartEnabled());
            }
            if (hasSpectatorAudioEnabled()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + Internal.hashBoolean(getSpectatorAudioEnabled());
            }
            if (hasSpectatorTextEnabled()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + Internal.hashBoolean(getSpectatorTextEnabled());
            }
            if (hasCourseSharingEnabled()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + Internal.hashBoolean(getCourseSharingEnabled());
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDILiveTrackProto.internal_static_GDI_Proto_LiveTrack_ShareDeviceSettingNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(ShareDeviceSettingNotification.class, Builder.class);
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
            return new ShareDeviceSettingNotification();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeBool(1, this.autoStartEnabled_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeBool(2, this.spectatorAudioEnabled_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeBool(3, this.spectatorTextEnabled_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeBool(4, this.courseSharingEnabled_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ShareDeviceSettingNotificationOrBuilder {
            private boolean autoStartEnabled_;
            private int bitField0_;
            private boolean courseSharingEnabled_;
            private boolean spectatorAudioEnabled_;
            private boolean spectatorTextEnabled_;

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private void buildPartial0(ShareDeviceSettingNotification shareDeviceSettingNotification) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    shareDeviceSettingNotification.autoStartEnabled_ = this.autoStartEnabled_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    shareDeviceSettingNotification.spectatorAudioEnabled_ = this.spectatorAudioEnabled_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    shareDeviceSettingNotification.spectatorTextEnabled_ = this.spectatorTextEnabled_;
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    shareDeviceSettingNotification.courseSharingEnabled_ = this.courseSharingEnabled_;
                    i14 |= 8;
                }
                shareDeviceSettingNotification.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDILiveTrackProto.internal_static_GDI_Proto_LiveTrack_ShareDeviceSettingNotification_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ShareDeviceSettingNotification build() {
                ShareDeviceSettingNotification shareDeviceSettingNotificationBuildPartial = buildPartial();
                if (shareDeviceSettingNotificationBuildPartial.isInitialized()) {
                    return shareDeviceSettingNotificationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) shareDeviceSettingNotificationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ShareDeviceSettingNotification buildPartial() {
                ShareDeviceSettingNotification shareDeviceSettingNotification = new ShareDeviceSettingNotification(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(shareDeviceSettingNotification);
                }
                onBuilt();
                return shareDeviceSettingNotification;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.autoStartEnabled_ = false;
                this.spectatorAudioEnabled_ = false;
                this.spectatorTextEnabled_ = false;
                this.courseSharingEnabled_ = false;
                return this;
            }

            public Builder clearAutoStartEnabled() {
                this.bitField0_ &= -2;
                this.autoStartEnabled_ = false;
                onChanged();
                return this;
            }

            public Builder clearCourseSharingEnabled() {
                this.bitField0_ &= -9;
                this.courseSharingEnabled_ = false;
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

            public Builder clearSpectatorAudioEnabled() {
                this.bitField0_ &= -3;
                this.spectatorAudioEnabled_ = false;
                onChanged();
                return this;
            }

            public Builder clearSpectatorTextEnabled() {
                this.bitField0_ &= -5;
                this.spectatorTextEnabled_ = false;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.ShareDeviceSettingNotificationOrBuilder
            public boolean getAutoStartEnabled() {
                return this.autoStartEnabled_;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.ShareDeviceSettingNotificationOrBuilder
            public boolean getCourseSharingEnabled() {
                return this.courseSharingEnabled_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDILiveTrackProto.internal_static_GDI_Proto_LiveTrack_ShareDeviceSettingNotification_descriptor;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.ShareDeviceSettingNotificationOrBuilder
            public boolean getSpectatorAudioEnabled() {
                return this.spectatorAudioEnabled_;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.ShareDeviceSettingNotificationOrBuilder
            public boolean getSpectatorTextEnabled() {
                return this.spectatorTextEnabled_;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.ShareDeviceSettingNotificationOrBuilder
            public boolean hasAutoStartEnabled() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.ShareDeviceSettingNotificationOrBuilder
            public boolean hasCourseSharingEnabled() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.ShareDeviceSettingNotificationOrBuilder
            public boolean hasSpectatorAudioEnabled() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.ShareDeviceSettingNotificationOrBuilder
            public boolean hasSpectatorTextEnabled() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDILiveTrackProto.internal_static_GDI_Proto_LiveTrack_ShareDeviceSettingNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(ShareDeviceSettingNotification.class, Builder.class);
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
                                    this.autoStartEnabled_ = codedInputStream.readBool();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    this.spectatorAudioEnabled_ = codedInputStream.readBool();
                                    this.bitField0_ |= 2;
                                } else if (tag == 24) {
                                    this.spectatorTextEnabled_ = codedInputStream.readBool();
                                    this.bitField0_ |= 4;
                                } else if (tag == 32) {
                                    this.courseSharingEnabled_ = codedInputStream.readBool();
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

            public Builder setAutoStartEnabled(boolean z14) {
                this.autoStartEnabled_ = z14;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setCourseSharingEnabled(boolean z14) {
                this.courseSharingEnabled_ = z14;
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

            public Builder setSpectatorAudioEnabled(boolean z14) {
                this.spectatorAudioEnabled_ = z14;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setSpectatorTextEnabled(boolean z14) {
                this.spectatorTextEnabled_ = z14;
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
            public ShareDeviceSettingNotification getDefaultInstanceForType() {
                return ShareDeviceSettingNotification.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ShareDeviceSettingNotification) {
                    return mergeFrom((ShareDeviceSettingNotification) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ShareDeviceSettingNotification shareDeviceSettingNotification) {
                if (shareDeviceSettingNotification == ShareDeviceSettingNotification.getDefaultInstance()) {
                    return this;
                }
                if (shareDeviceSettingNotification.hasAutoStartEnabled()) {
                    setAutoStartEnabled(shareDeviceSettingNotification.getAutoStartEnabled());
                }
                if (shareDeviceSettingNotification.hasSpectatorAudioEnabled()) {
                    setSpectatorAudioEnabled(shareDeviceSettingNotification.getSpectatorAudioEnabled());
                }
                if (shareDeviceSettingNotification.hasSpectatorTextEnabled()) {
                    setSpectatorTextEnabled(shareDeviceSettingNotification.getSpectatorTextEnabled());
                }
                if (shareDeviceSettingNotification.hasCourseSharingEnabled()) {
                    setCourseSharingEnabled(shareDeviceSettingNotification.getCourseSharingEnabled());
                }
                mergeUnknownFields(shareDeviceSettingNotification.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ShareDeviceSettingNotification getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static ShareDeviceSettingNotification parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ShareDeviceSettingNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ShareDeviceSettingNotification parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static ShareDeviceSettingNotification parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ShareDeviceSettingNotification parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ShareDeviceSettingNotification parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static ShareDeviceSettingNotification parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static ShareDeviceSettingNotification parseFrom(InputStream inputStream) {
            return (ShareDeviceSettingNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public /* synthetic */ ShareDeviceSettingNotification(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static ShareDeviceSettingNotification parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ShareDeviceSettingNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        private ShareDeviceSettingNotification() {
            this.autoStartEnabled_ = false;
            this.spectatorAudioEnabled_ = false;
            this.spectatorTextEnabled_ = false;
            this.courseSharingEnabled_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ShareDeviceSettingNotification parseFrom(CodedInputStream codedInputStream) {
            return (ShareDeviceSettingNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static ShareDeviceSettingNotification parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ShareDeviceSettingNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class UpdateSettingsNotification extends GeneratedMessageV3 implements UpdateSettingsNotificationOrBuilder {
        private static final UpdateSettingsNotification DEFAULT_INSTANCE = new UpdateSettingsNotification();

        @Deprecated
        public static final Parser<UpdateSettingsNotification> PARSER = new AbstractParser<UpdateSettingsNotification>() { // from class: com.garmin.proto.generated.GDILiveTrackProto.UpdateSettingsNotification.1
            @Override // com.google.protobuf.Parser
            public UpdateSettingsNotification parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = UpdateSettingsNotification.newBuilder();
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

        private UpdateSettingsNotification(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static UpdateSettingsNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDILiveTrackProto.internal_static_GDI_Proto_LiveTrack_UpdateSettingsNotification_descriptor;
        }

        public static Builder newBuilder(UpdateSettingsNotification updateSettingsNotification) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(updateSettingsNotification);
        }

        public static UpdateSettingsNotification parseDelimitedFrom(InputStream inputStream) {
            return (UpdateSettingsNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static UpdateSettingsNotification parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<UpdateSettingsNotification> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof UpdateSettingsNotification) {
                return getUnknownFields().equals(((UpdateSettingsNotification) obj).getUnknownFields());
            }
            return super.equals(obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<UpdateSettingsNotification> getParserForType() {
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
            return GDILiveTrackProto.internal_static_GDI_Proto_LiveTrack_UpdateSettingsNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(UpdateSettingsNotification.class, Builder.class);
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
            return new UpdateSettingsNotification();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements UpdateSettingsNotificationOrBuilder {
            public /* synthetic */ Builder(int i14) {
                this();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDILiveTrackProto.internal_static_GDI_Proto_LiveTrack_UpdateSettingsNotification_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public UpdateSettingsNotification build() {
                UpdateSettingsNotification updateSettingsNotificationBuildPartial = buildPartial();
                if (updateSettingsNotificationBuildPartial.isInitialized()) {
                    return updateSettingsNotificationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) updateSettingsNotificationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public UpdateSettingsNotification buildPartial() {
                UpdateSettingsNotification updateSettingsNotification = new UpdateSettingsNotification(this);
                onBuilt();
                return updateSettingsNotification;
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
                return GDILiveTrackProto.internal_static_GDI_Proto_LiveTrack_UpdateSettingsNotification_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDILiveTrackProto.internal_static_GDI_Proto_LiveTrack_UpdateSettingsNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(UpdateSettingsNotification.class, Builder.class);
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
            public UpdateSettingsNotification getDefaultInstanceForType() {
                return UpdateSettingsNotification.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof UpdateSettingsNotification) {
                    return mergeFrom((UpdateSettingsNotification) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(UpdateSettingsNotification updateSettingsNotification) {
                if (updateSettingsNotification == UpdateSettingsNotification.getDefaultInstance()) {
                    return this;
                }
                mergeUnknownFields(updateSettingsNotification.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public UpdateSettingsNotification getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ UpdateSettingsNotification(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private UpdateSettingsNotification() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static UpdateSettingsNotification parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (UpdateSettingsNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static UpdateSettingsNotification parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static UpdateSettingsNotification parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static UpdateSettingsNotification parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static UpdateSettingsNotification parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static UpdateSettingsNotification parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static UpdateSettingsNotification parseFrom(InputStream inputStream) {
            return (UpdateSettingsNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static UpdateSettingsNotification parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (UpdateSettingsNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static UpdateSettingsNotification parseFrom(CodedInputStream codedInputStream) {
            return (UpdateSettingsNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static UpdateSettingsNotification parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (UpdateSettingsNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class ConsentNotification extends GeneratedMessageV3 implements ConsentNotificationOrBuilder {
        public static final int CONSENT_PAGE_ACTION_FIELD_NUMBER = 2;
        private static final ConsentNotification DEFAULT_INSTANCE = new ConsentNotification();

        @Deprecated
        public static final Parser<ConsentNotification> PARSER = new AbstractParser<ConsentNotification>() { // from class: com.garmin.proto.generated.GDILiveTrackProto.ConsentNotification.1
            @Override // com.google.protobuf.Parser
            public ConsentNotification parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = ConsentNotification.newBuilder();
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
        public static final int PROMPT_GROUP_RIDE_CONSENT_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int consentPageAction_;
        private byte memoizedIsInitialized;
        private boolean promptGroupRideConsent_;

        private ConsentNotification(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.promptGroupRideConsent_ = false;
            this.consentPageAction_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ConsentNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDILiveTrackProto.internal_static_GDI_Proto_LiveTrack_ConsentNotification_descriptor;
        }

        public static Builder newBuilder(ConsentNotification consentNotification) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(consentNotification);
        }

        public static ConsentNotification parseDelimitedFrom(InputStream inputStream) {
            return (ConsentNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ConsentNotification parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<ConsentNotification> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ConsentNotification)) {
                return super.equals(obj);
            }
            ConsentNotification consentNotification = (ConsentNotification) obj;
            if (hasPromptGroupRideConsent() != consentNotification.hasPromptGroupRideConsent()) {
                return false;
            }
            if ((!hasPromptGroupRideConsent() || getPromptGroupRideConsent() == consentNotification.getPromptGroupRideConsent()) && hasConsentPageAction() == consentNotification.hasConsentPageAction()) {
                return (!hasConsentPageAction() || this.consentPageAction_ == consentNotification.consentPageAction_) && getUnknownFields().equals(consentNotification.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.ConsentNotificationOrBuilder
        public ConsentPageAction getConsentPageAction() {
            ConsentPageAction consentPageActionForNumber = ConsentPageAction.forNumber(this.consentPageAction_);
            return consentPageActionForNumber == null ? ConsentPageAction.GRANTED : consentPageActionForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ConsentNotification> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.ConsentNotificationOrBuilder
        public boolean getPromptGroupRideConsent() {
            return this.promptGroupRideConsent_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeBoolSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeBoolSize(1, this.promptGroupRideConsent_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeBoolSize += CodedOutputStream.computeEnumSize(2, this.consentPageAction_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeBoolSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.ConsentNotificationOrBuilder
        public boolean hasConsentPageAction() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.ConsentNotificationOrBuilder
        public boolean hasPromptGroupRideConsent() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasPromptGroupRideConsent()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + Internal.hashBoolean(getPromptGroupRideConsent());
            }
            if (hasConsentPageAction()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + this.consentPageAction_;
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDILiveTrackProto.internal_static_GDI_Proto_LiveTrack_ConsentNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(ConsentNotification.class, Builder.class);
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
            return new ConsentNotification();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeBool(1, this.promptGroupRideConsent_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeEnum(2, this.consentPageAction_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ConsentNotificationOrBuilder {
            private int bitField0_;
            private int consentPageAction_;
            private boolean promptGroupRideConsent_;

            private Builder() {
                this.consentPageAction_ = 0;
            }

            private void buildPartial0(ConsentNotification consentNotification) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    consentNotification.promptGroupRideConsent_ = this.promptGroupRideConsent_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    consentNotification.consentPageAction_ = this.consentPageAction_;
                    i14 |= 2;
                }
                consentNotification.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDILiveTrackProto.internal_static_GDI_Proto_LiveTrack_ConsentNotification_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ConsentNotification build() {
                ConsentNotification consentNotificationBuildPartial = buildPartial();
                if (consentNotificationBuildPartial.isInitialized()) {
                    return consentNotificationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) consentNotificationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ConsentNotification buildPartial() {
                ConsentNotification consentNotification = new ConsentNotification(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(consentNotification);
                }
                onBuilt();
                return consentNotification;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.promptGroupRideConsent_ = false;
                this.consentPageAction_ = 0;
                return this;
            }

            public Builder clearConsentPageAction() {
                this.bitField0_ &= -3;
                this.consentPageAction_ = 0;
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

            public Builder clearPromptGroupRideConsent() {
                this.bitField0_ &= -2;
                this.promptGroupRideConsent_ = false;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.ConsentNotificationOrBuilder
            public ConsentPageAction getConsentPageAction() {
                ConsentPageAction consentPageActionForNumber = ConsentPageAction.forNumber(this.consentPageAction_);
                return consentPageActionForNumber == null ? ConsentPageAction.GRANTED : consentPageActionForNumber;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDILiveTrackProto.internal_static_GDI_Proto_LiveTrack_ConsentNotification_descriptor;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.ConsentNotificationOrBuilder
            public boolean getPromptGroupRideConsent() {
                return this.promptGroupRideConsent_;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.ConsentNotificationOrBuilder
            public boolean hasConsentPageAction() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.ConsentNotificationOrBuilder
            public boolean hasPromptGroupRideConsent() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDILiveTrackProto.internal_static_GDI_Proto_LiveTrack_ConsentNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(ConsentNotification.class, Builder.class);
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
                                    this.promptGroupRideConsent_ = codedInputStream.readBool();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    int i14 = codedInputStream.readEnum();
                                    if (ConsentPageAction.forNumber(i14) == null) {
                                        mergeUnknownVarintField(2, i14);
                                    } else {
                                        this.consentPageAction_ = i14;
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

            public Builder setConsentPageAction(ConsentPageAction consentPageAction) {
                consentPageAction.getClass();
                this.bitField0_ |= 2;
                this.consentPageAction_ = consentPageAction.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setPromptGroupRideConsent(boolean z14) {
                this.promptGroupRideConsent_ = z14;
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
            public ConsentNotification getDefaultInstanceForType() {
                return ConsentNotification.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.consentPageAction_ = 0;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ConsentNotification) {
                    return mergeFrom((ConsentNotification) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ConsentNotification consentNotification) {
                if (consentNotification == ConsentNotification.getDefaultInstance()) {
                    return this;
                }
                if (consentNotification.hasPromptGroupRideConsent()) {
                    setPromptGroupRideConsent(consentNotification.getPromptGroupRideConsent());
                }
                if (consentNotification.hasConsentPageAction()) {
                    setConsentPageAction(consentNotification.getConsentPageAction());
                }
                mergeUnknownFields(consentNotification.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ConsentNotification getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static ConsentNotification parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConsentNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ConsentNotification parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static ConsentNotification parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ConsentNotification parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public /* synthetic */ ConsentNotification(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static ConsentNotification parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        private ConsentNotification() {
            this.promptGroupRideConsent_ = false;
            this.memoizedIsInitialized = (byte) -1;
            this.consentPageAction_ = 0;
        }

        public static ConsentNotification parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static ConsentNotification parseFrom(InputStream inputStream) {
            return (ConsentNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static ConsentNotification parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConsentNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ConsentNotification parseFrom(CodedInputStream codedInputStream) {
            return (ConsentNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static ConsentNotification parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConsentNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum ConsentPageAction implements ProtocolMessageEnum {
            GRANTED(0),
            REJECTED(1);

            public static final int GRANTED_VALUE = 0;
            public static final int REJECTED_VALUE = 1;
            private final int value;
            private static final Internal.EnumLiteMap<ConsentPageAction> internalValueMap = new Internal.EnumLiteMap<ConsentPageAction>() { // from class: com.garmin.proto.generated.GDILiveTrackProto.ConsentNotification.ConsentPageAction.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public ConsentPageAction findValueByNumber(int i14) {
                    return ConsentPageAction.forNumber(i14);
                }
            };
            private static final ConsentPageAction[] VALUES = values();

            ConsentPageAction(int i14) {
                this.value = i14;
            }

            public static ConsentPageAction forNumber(int i14) {
                if (i14 == 0) {
                    return GRANTED;
                }
                if (i14 != 1) {
                    return null;
                }
                return REJECTED;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return ConsentNotification.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<ConsentPageAction> internalGetValueMap() {
                return internalValueMap;
            }

            public static ConsentPageAction valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static ConsentPageAction valueOf(int i14) {
                return forNumber(i14);
            }
        }
    }

    public static final class EmergencyCountdownNotification extends GeneratedMessageV3 implements EmergencyCountdownNotificationOrBuilder {
        private static final EmergencyCountdownNotification DEFAULT_INSTANCE = new EmergencyCountdownNotification();

        @Deprecated
        public static final Parser<EmergencyCountdownNotification> PARSER = new AbstractParser<EmergencyCountdownNotification>() { // from class: com.garmin.proto.generated.GDILiveTrackProto.EmergencyCountdownNotification.1
            @Override // com.google.protobuf.Parser
            public EmergencyCountdownNotification parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = EmergencyCountdownNotification.newBuilder();
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
        public static final int SESSION_TYPE_FIELD_NUMBER = 4;
        public static final int STATE_FIELD_NUMBER = 1;
        public static final int TIME_LEFT_S_FIELD_NUMBER = 2;
        public static final int UTC_TIME_S_FIELD_NUMBER = 3;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int sessionType_;
        private int state_;
        private int timeLeftS_;
        private int utcTimeS_;

        private EmergencyCountdownNotification(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.state_ = 0;
            this.timeLeftS_ = 0;
            this.utcTimeS_ = 0;
            this.sessionType_ = -1;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static EmergencyCountdownNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDILiveTrackProto.internal_static_GDI_Proto_LiveTrack_EmergencyCountdownNotification_descriptor;
        }

        public static Builder newBuilder(EmergencyCountdownNotification emergencyCountdownNotification) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(emergencyCountdownNotification);
        }

        public static EmergencyCountdownNotification parseDelimitedFrom(InputStream inputStream) {
            return (EmergencyCountdownNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static EmergencyCountdownNotification parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<EmergencyCountdownNotification> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof EmergencyCountdownNotification)) {
                return super.equals(obj);
            }
            EmergencyCountdownNotification emergencyCountdownNotification = (EmergencyCountdownNotification) obj;
            if (hasState() != emergencyCountdownNotification.hasState()) {
                return false;
            }
            if ((hasState() && this.state_ != emergencyCountdownNotification.state_) || hasTimeLeftS() != emergencyCountdownNotification.hasTimeLeftS()) {
                return false;
            }
            if ((hasTimeLeftS() && getTimeLeftS() != emergencyCountdownNotification.getTimeLeftS()) || hasUtcTimeS() != emergencyCountdownNotification.hasUtcTimeS()) {
                return false;
            }
            if ((!hasUtcTimeS() || getUtcTimeS() == emergencyCountdownNotification.getUtcTimeS()) && hasSessionType() == emergencyCountdownNotification.hasSessionType()) {
                return (!hasSessionType() || this.sessionType_ == emergencyCountdownNotification.sessionType_) && getUnknownFields().equals(emergencyCountdownNotification.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<EmergencyCountdownNotification> getParserForType() {
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
                iComputeEnumSize += CodedOutputStream.computeUInt32Size(2, this.timeLeftS_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeEnumSize += CodedOutputStream.computeUInt32Size(3, this.utcTimeS_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeEnumSize += CodedOutputStream.computeEnumSize(4, this.sessionType_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeEnumSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.EmergencyCountdownNotificationOrBuilder
        public SessionType getSessionType() {
            SessionType sessionTypeForNumber = SessionType.forNumber(this.sessionType_);
            return sessionTypeForNumber == null ? SessionType.UNKNOWN : sessionTypeForNumber;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.EmergencyCountdownNotificationOrBuilder
        public State getState() {
            State stateForNumber = State.forNumber(this.state_);
            return stateForNumber == null ? State.PAUSED : stateForNumber;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.EmergencyCountdownNotificationOrBuilder
        public int getTimeLeftS() {
            return this.timeLeftS_;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.EmergencyCountdownNotificationOrBuilder
        public int getUtcTimeS() {
            return this.utcTimeS_;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.EmergencyCountdownNotificationOrBuilder
        public boolean hasSessionType() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.EmergencyCountdownNotificationOrBuilder
        public boolean hasState() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.EmergencyCountdownNotificationOrBuilder
        public boolean hasTimeLeftS() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.EmergencyCountdownNotificationOrBuilder
        public boolean hasUtcTimeS() {
            return (this.bitField0_ & 4) != 0;
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
            if (hasTimeLeftS()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getTimeLeftS();
            }
            if (hasUtcTimeS()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getUtcTimeS();
            }
            if (hasSessionType()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + this.sessionType_;
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDILiveTrackProto.internal_static_GDI_Proto_LiveTrack_EmergencyCountdownNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(EmergencyCountdownNotification.class, Builder.class);
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
            return new EmergencyCountdownNotification();
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
                codedOutputStream.writeUInt32(2, this.timeLeftS_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeUInt32(3, this.utcTimeS_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeEnum(4, this.sessionType_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements EmergencyCountdownNotificationOrBuilder {
            private int bitField0_;
            private int sessionType_;
            private int state_;
            private int timeLeftS_;
            private int utcTimeS_;

            private Builder() {
                this.state_ = 0;
                this.sessionType_ = -1;
            }

            private void buildPartial0(EmergencyCountdownNotification emergencyCountdownNotification) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    emergencyCountdownNotification.state_ = this.state_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    emergencyCountdownNotification.timeLeftS_ = this.timeLeftS_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    emergencyCountdownNotification.utcTimeS_ = this.utcTimeS_;
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    emergencyCountdownNotification.sessionType_ = this.sessionType_;
                    i14 |= 8;
                }
                emergencyCountdownNotification.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDILiveTrackProto.internal_static_GDI_Proto_LiveTrack_EmergencyCountdownNotification_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public EmergencyCountdownNotification build() {
                EmergencyCountdownNotification emergencyCountdownNotificationBuildPartial = buildPartial();
                if (emergencyCountdownNotificationBuildPartial.isInitialized()) {
                    return emergencyCountdownNotificationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) emergencyCountdownNotificationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public EmergencyCountdownNotification buildPartial() {
                EmergencyCountdownNotification emergencyCountdownNotification = new EmergencyCountdownNotification(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(emergencyCountdownNotification);
                }
                onBuilt();
                return emergencyCountdownNotification;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.state_ = 0;
                this.timeLeftS_ = 0;
                this.utcTimeS_ = 0;
                this.sessionType_ = -1;
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

            public Builder clearSessionType() {
                this.bitField0_ &= -9;
                this.sessionType_ = -1;
                onChanged();
                return this;
            }

            public Builder clearState() {
                this.bitField0_ &= -2;
                this.state_ = 0;
                onChanged();
                return this;
            }

            public Builder clearTimeLeftS() {
                this.bitField0_ &= -3;
                this.timeLeftS_ = 0;
                onChanged();
                return this;
            }

            public Builder clearUtcTimeS() {
                this.bitField0_ &= -5;
                this.utcTimeS_ = 0;
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
                return GDILiveTrackProto.internal_static_GDI_Proto_LiveTrack_EmergencyCountdownNotification_descriptor;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.EmergencyCountdownNotificationOrBuilder
            public SessionType getSessionType() {
                SessionType sessionTypeForNumber = SessionType.forNumber(this.sessionType_);
                return sessionTypeForNumber == null ? SessionType.UNKNOWN : sessionTypeForNumber;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.EmergencyCountdownNotificationOrBuilder
            public State getState() {
                State stateForNumber = State.forNumber(this.state_);
                return stateForNumber == null ? State.PAUSED : stateForNumber;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.EmergencyCountdownNotificationOrBuilder
            public int getTimeLeftS() {
                return this.timeLeftS_;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.EmergencyCountdownNotificationOrBuilder
            public int getUtcTimeS() {
                return this.utcTimeS_;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.EmergencyCountdownNotificationOrBuilder
            public boolean hasSessionType() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.EmergencyCountdownNotificationOrBuilder
            public boolean hasState() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.EmergencyCountdownNotificationOrBuilder
            public boolean hasTimeLeftS() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.EmergencyCountdownNotificationOrBuilder
            public boolean hasUtcTimeS() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDILiveTrackProto.internal_static_GDI_Proto_LiveTrack_EmergencyCountdownNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(EmergencyCountdownNotification.class, Builder.class);
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
                                    if (State.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        this.state_ = i14;
                                        this.bitField0_ |= 1;
                                    }
                                } else if (tag == 16) {
                                    this.timeLeftS_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 2;
                                } else if (tag == 24) {
                                    this.utcTimeS_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 4;
                                } else if (tag == 32) {
                                    int i15 = codedInputStream.readEnum();
                                    if (SessionType.forNumber(i15) == null) {
                                        mergeUnknownVarintField(4, i15);
                                    } else {
                                        this.sessionType_ = i15;
                                        this.bitField0_ |= 8;
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

            public Builder setSessionType(SessionType sessionType) {
                sessionType.getClass();
                this.bitField0_ |= 8;
                this.sessionType_ = sessionType.getNumber();
                onChanged();
                return this;
            }

            public Builder setState(State state) {
                state.getClass();
                this.bitField0_ |= 1;
                this.state_ = state.getNumber();
                onChanged();
                return this;
            }

            public Builder setTimeLeftS(int i14) {
                this.timeLeftS_ = i14;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            public Builder setUtcTimeS(int i14) {
                this.utcTimeS_ = i14;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public EmergencyCountdownNotification getDefaultInstanceForType() {
                return EmergencyCountdownNotification.getDefaultInstance();
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
                this.sessionType_ = -1;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof EmergencyCountdownNotification) {
                    return mergeFrom((EmergencyCountdownNotification) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(EmergencyCountdownNotification emergencyCountdownNotification) {
                if (emergencyCountdownNotification == EmergencyCountdownNotification.getDefaultInstance()) {
                    return this;
                }
                if (emergencyCountdownNotification.hasState()) {
                    setState(emergencyCountdownNotification.getState());
                }
                if (emergencyCountdownNotification.hasTimeLeftS()) {
                    setTimeLeftS(emergencyCountdownNotification.getTimeLeftS());
                }
                if (emergencyCountdownNotification.hasUtcTimeS()) {
                    setUtcTimeS(emergencyCountdownNotification.getUtcTimeS());
                }
                if (emergencyCountdownNotification.hasSessionType()) {
                    setSessionType(emergencyCountdownNotification.getSessionType());
                }
                mergeUnknownFields(emergencyCountdownNotification.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public EmergencyCountdownNotification getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static EmergencyCountdownNotification parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EmergencyCountdownNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static EmergencyCountdownNotification parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static EmergencyCountdownNotification parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static EmergencyCountdownNotification parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static EmergencyCountdownNotification parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static EmergencyCountdownNotification parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static EmergencyCountdownNotification parseFrom(InputStream inputStream) {
            return (EmergencyCountdownNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public /* synthetic */ EmergencyCountdownNotification(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static EmergencyCountdownNotification parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EmergencyCountdownNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        private EmergencyCountdownNotification() {
            this.timeLeftS_ = 0;
            this.utcTimeS_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.state_ = 0;
            this.sessionType_ = -1;
        }

        public static EmergencyCountdownNotification parseFrom(CodedInputStream codedInputStream) {
            return (EmergencyCountdownNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static EmergencyCountdownNotification parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EmergencyCountdownNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum State implements ProtocolMessageEnum {
            PAUSED(0),
            IN_PROGRESS(1),
            CANCELED(2),
            EXPIRED(3);

            public static final int CANCELED_VALUE = 2;
            public static final int EXPIRED_VALUE = 3;
            public static final int IN_PROGRESS_VALUE = 1;
            public static final int PAUSED_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<State> internalValueMap = new Internal.EnumLiteMap<State>() { // from class: com.garmin.proto.generated.GDILiveTrackProto.EmergencyCountdownNotification.State.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public State findValueByNumber(int i14) {
                    return State.forNumber(i14);
                }
            };
            private static final State[] VALUES = values();

            State(int i14) {
                this.value = i14;
            }

            public static State forNumber(int i14) {
                if (i14 == 0) {
                    return PAUSED;
                }
                if (i14 == 1) {
                    return IN_PROGRESS;
                }
                if (i14 == 2) {
                    return CANCELED;
                }
                if (i14 != 3) {
                    return null;
                }
                return EXPIRED;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return EmergencyCountdownNotification.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<State> internalGetValueMap() {
                return internalValueMap;
            }

            public static State valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static State valueOf(int i14) {
                return forNumber(i14);
            }
        }
    }

    public static final class GroupRideNotification extends GeneratedMessageV3 implements GroupRideNotificationOrBuilder {
        private static final GroupRideNotification DEFAULT_INSTANCE = new GroupRideNotification();

        @Deprecated
        public static final Parser<GroupRideNotification> PARSER = new AbstractParser<GroupRideNotification>() { // from class: com.garmin.proto.generated.GDILiveTrackProto.GroupRideNotification.1
            @Override // com.google.protobuf.Parser
            public GroupRideNotification parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = GroupRideNotification.newBuilder();
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
        public static final int SHARE_SESSION_CODE_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private volatile Object shareSessionCode_;

        private GroupRideNotification() {
            this.shareSessionCode_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.shareSessionCode_ = "";
        }

        public static GroupRideNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDILiveTrackProto.internal_static_GDI_Proto_LiveTrack_GroupRideNotification_descriptor;
        }

        public static Builder newBuilder(GroupRideNotification groupRideNotification) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(groupRideNotification);
        }

        public static GroupRideNotification parseDelimitedFrom(InputStream inputStream) {
            return (GroupRideNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static GroupRideNotification parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<GroupRideNotification> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GroupRideNotification)) {
                return super.equals(obj);
            }
            GroupRideNotification groupRideNotification = (GroupRideNotification) obj;
            if (hasShareSessionCode() != groupRideNotification.hasShareSessionCode()) {
                return false;
            }
            return (!hasShareSessionCode() || getShareSessionCode().equals(groupRideNotification.getShareSessionCode())) && getUnknownFields().equals(groupRideNotification.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<GroupRideNotification> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? GeneratedMessageV3.computeStringSize(1, this.shareSessionCode_) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.GroupRideNotificationOrBuilder
        public String getShareSessionCode() {
            Object obj = this.shareSessionCode_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.shareSessionCode_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.GroupRideNotificationOrBuilder
        public ByteString getShareSessionCodeBytes() {
            Object obj = this.shareSessionCode_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.shareSessionCode_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.GroupRideNotificationOrBuilder
        public boolean hasShareSessionCode() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasShareSessionCode()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getShareSessionCode().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDILiveTrackProto.internal_static_GDI_Proto_LiveTrack_GroupRideNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(GroupRideNotification.class, Builder.class);
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
            return new GroupRideNotification();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.shareSessionCode_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements GroupRideNotificationOrBuilder {
            private int bitField0_;
            private Object shareSessionCode_;

            private Builder() {
                this.shareSessionCode_ = "";
            }

            private void buildPartial0(GroupRideNotification groupRideNotification) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    groupRideNotification.shareSessionCode_ = this.shareSessionCode_;
                } else {
                    i14 = 0;
                }
                groupRideNotification.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDILiveTrackProto.internal_static_GDI_Proto_LiveTrack_GroupRideNotification_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public GroupRideNotification build() {
                GroupRideNotification groupRideNotificationBuildPartial = buildPartial();
                if (groupRideNotificationBuildPartial.isInitialized()) {
                    return groupRideNotificationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) groupRideNotificationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public GroupRideNotification buildPartial() {
                GroupRideNotification groupRideNotification = new GroupRideNotification(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(groupRideNotification);
                }
                onBuilt();
                return groupRideNotification;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.shareSessionCode_ = "";
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

            public Builder clearShareSessionCode() {
                this.shareSessionCode_ = GroupRideNotification.getDefaultInstance().getShareSessionCode();
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
                return GDILiveTrackProto.internal_static_GDI_Proto_LiveTrack_GroupRideNotification_descriptor;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.GroupRideNotificationOrBuilder
            public String getShareSessionCode() {
                Object obj = this.shareSessionCode_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.shareSessionCode_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.GroupRideNotificationOrBuilder
            public ByteString getShareSessionCodeBytes() {
                Object obj = this.shareSessionCode_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.shareSessionCode_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.GroupRideNotificationOrBuilder
            public boolean hasShareSessionCode() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDILiveTrackProto.internal_static_GDI_Proto_LiveTrack_GroupRideNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(GroupRideNotification.class, Builder.class);
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
                                    this.shareSessionCode_ = codedInputStream.readBytes();
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

            public Builder setShareSessionCode(String str) {
                str.getClass();
                this.shareSessionCode_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setShareSessionCodeBytes(ByteString byteString) {
                byteString.getClass();
                this.shareSessionCode_ = byteString;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public GroupRideNotification getDefaultInstanceForType() {
                return GroupRideNotification.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.shareSessionCode_ = "";
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof GroupRideNotification) {
                    return mergeFrom((GroupRideNotification) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(GroupRideNotification groupRideNotification) {
                if (groupRideNotification == GroupRideNotification.getDefaultInstance()) {
                    return this;
                }
                if (groupRideNotification.hasShareSessionCode()) {
                    this.shareSessionCode_ = groupRideNotification.shareSessionCode_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                mergeUnknownFields(groupRideNotification.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public GroupRideNotification getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static GroupRideNotification parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GroupRideNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static GroupRideNotification parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static GroupRideNotification parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static GroupRideNotification parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static GroupRideNotification parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        private GroupRideNotification(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.shareSessionCode_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public static GroupRideNotification parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static GroupRideNotification parseFrom(InputStream inputStream) {
            return (GroupRideNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public /* synthetic */ GroupRideNotification(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static GroupRideNotification parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GroupRideNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static GroupRideNotification parseFrom(CodedInputStream codedInputStream) {
            return (GroupRideNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static GroupRideNotification parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GroupRideNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class LiveTrackService extends GeneratedMessageV3 implements LiveTrackServiceOrBuilder {
        public static final int CONSENT_CHANGED_NOTIFICATION_FIELD_NUMBER = 8;
        public static final int CONSENT_NOTIFICATION_FIELD_NUMBER = 14;
        public static final int EMERGENCY_COUNTDOWN_NOTIFICATION_FIELD_NUMBER = 13;
        public static final int GROUP_RIDE_NOTIFICATION_FIELD_NUMBER = 15;
        public static final int LIVE_EVENT_SHARING_NOTIFICATION_FIELD_NUMBER = 9;
        public static final int SESSION_SUPPORT_REQUEST_FIELD_NUMBER = 10;
        public static final int SESSION_SUPPORT_RESPONSE_FIELD_NUMBER = 11;
        public static final int SHARE_DEVICE_SETTING_NOTIFICATION_FIELD_NUMBER = 6;
        public static final int SHARE_META_CONFIG_NOTIFICATION_FIELD_NUMBER = 1;
        public static final int SHARE_SOCIAL_NOTIFICATION_FIELD_NUMBER = 2;
        public static final int START_REQUEST_FIELD_NUMBER = 3;
        public static final int START_RESPONSE_FIELD_NUMBER = 4;
        public static final int STATUS_NOTIFICATION_FIELD_NUMBER = 7;
        public static final int STOP_NOTIFICATION_FIELD_NUMBER = 5;
        public static final int UPDATE_SETTINGS_NOTIFICATION_FIELD_NUMBER = 12;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private ConsentChangedNotification consentChangedNotification_;
        private ConsentNotification consentNotification_;
        private EmergencyCountdownNotification emergencyCountdownNotification_;
        private GroupRideNotification groupRideNotification_;
        private LiveEventSharingNotification liveEventSharingNotification_;
        private byte memoizedIsInitialized;
        private SessionSupportRequest sessionSupportRequest_;
        private SessionSupportResponse sessionSupportResponse_;
        private ShareDeviceSettingNotification shareDeviceSettingNotification_;
        private ShareMetaConfigurationNotification shareMetaConfigNotification_;
        private ShareSocialCredentialsNotification shareSocialNotification_;
        private StartRequest startRequest_;
        private StartResponse startResponse_;
        private StatusNotification statusNotification_;
        private StopNotification stopNotification_;
        private UpdateSettingsNotification updateSettingsNotification_;
        private static final LiveTrackService DEFAULT_INSTANCE = new LiveTrackService();

        @Deprecated
        public static final Parser<LiveTrackService> PARSER = new AbstractParser<LiveTrackService>() { // from class: com.garmin.proto.generated.GDILiveTrackProto.LiveTrackService.1
            @Override // com.google.protobuf.Parser
            public LiveTrackService parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = LiveTrackService.newBuilder();
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

        private LiveTrackService(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static LiveTrackService getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDILiveTrackProto.internal_static_GDI_Proto_LiveTrack_LiveTrackService_descriptor;
        }

        public static Builder newBuilder(LiveTrackService liveTrackService) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(liveTrackService);
        }

        public static LiveTrackService parseDelimitedFrom(InputStream inputStream) {
            return (LiveTrackService) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static LiveTrackService parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<LiveTrackService> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof LiveTrackService)) {
                return super.equals(obj);
            }
            LiveTrackService liveTrackService = (LiveTrackService) obj;
            if (hasShareMetaConfigNotification() != liveTrackService.hasShareMetaConfigNotification()) {
                return false;
            }
            if ((hasShareMetaConfigNotification() && !getShareMetaConfigNotification().equals(liveTrackService.getShareMetaConfigNotification())) || hasShareSocialNotification() != liveTrackService.hasShareSocialNotification()) {
                return false;
            }
            if ((hasShareSocialNotification() && !getShareSocialNotification().equals(liveTrackService.getShareSocialNotification())) || hasStartRequest() != liveTrackService.hasStartRequest()) {
                return false;
            }
            if ((hasStartRequest() && !getStartRequest().equals(liveTrackService.getStartRequest())) || hasStartResponse() != liveTrackService.hasStartResponse()) {
                return false;
            }
            if ((hasStartResponse() && !getStartResponse().equals(liveTrackService.getStartResponse())) || hasStopNotification() != liveTrackService.hasStopNotification()) {
                return false;
            }
            if ((hasStopNotification() && !getStopNotification().equals(liveTrackService.getStopNotification())) || hasShareDeviceSettingNotification() != liveTrackService.hasShareDeviceSettingNotification()) {
                return false;
            }
            if ((hasShareDeviceSettingNotification() && !getShareDeviceSettingNotification().equals(liveTrackService.getShareDeviceSettingNotification())) || hasStatusNotification() != liveTrackService.hasStatusNotification()) {
                return false;
            }
            if ((hasStatusNotification() && !getStatusNotification().equals(liveTrackService.getStatusNotification())) || hasConsentChangedNotification() != liveTrackService.hasConsentChangedNotification()) {
                return false;
            }
            if ((hasConsentChangedNotification() && !getConsentChangedNotification().equals(liveTrackService.getConsentChangedNotification())) || hasLiveEventSharingNotification() != liveTrackService.hasLiveEventSharingNotification()) {
                return false;
            }
            if ((hasLiveEventSharingNotification() && !getLiveEventSharingNotification().equals(liveTrackService.getLiveEventSharingNotification())) || hasSessionSupportRequest() != liveTrackService.hasSessionSupportRequest()) {
                return false;
            }
            if ((hasSessionSupportRequest() && !getSessionSupportRequest().equals(liveTrackService.getSessionSupportRequest())) || hasSessionSupportResponse() != liveTrackService.hasSessionSupportResponse()) {
                return false;
            }
            if ((hasSessionSupportResponse() && !getSessionSupportResponse().equals(liveTrackService.getSessionSupportResponse())) || hasUpdateSettingsNotification() != liveTrackService.hasUpdateSettingsNotification()) {
                return false;
            }
            if ((hasUpdateSettingsNotification() && !getUpdateSettingsNotification().equals(liveTrackService.getUpdateSettingsNotification())) || hasEmergencyCountdownNotification() != liveTrackService.hasEmergencyCountdownNotification()) {
                return false;
            }
            if ((hasEmergencyCountdownNotification() && !getEmergencyCountdownNotification().equals(liveTrackService.getEmergencyCountdownNotification())) || hasConsentNotification() != liveTrackService.hasConsentNotification()) {
                return false;
            }
            if ((!hasConsentNotification() || getConsentNotification().equals(liveTrackService.getConsentNotification())) && hasGroupRideNotification() == liveTrackService.hasGroupRideNotification()) {
                return (!hasGroupRideNotification() || getGroupRideNotification().equals(liveTrackService.getGroupRideNotification())) && getUnknownFields().equals(liveTrackService.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.LiveTrackServiceOrBuilder
        public ConsentChangedNotification getConsentChangedNotification() {
            ConsentChangedNotification consentChangedNotification = this.consentChangedNotification_;
            return consentChangedNotification == null ? ConsentChangedNotification.getDefaultInstance() : consentChangedNotification;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.LiveTrackServiceOrBuilder
        public ConsentChangedNotificationOrBuilder getConsentChangedNotificationOrBuilder() {
            ConsentChangedNotification consentChangedNotification = this.consentChangedNotification_;
            return consentChangedNotification == null ? ConsentChangedNotification.getDefaultInstance() : consentChangedNotification;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.LiveTrackServiceOrBuilder
        public ConsentNotification getConsentNotification() {
            ConsentNotification consentNotification = this.consentNotification_;
            return consentNotification == null ? ConsentNotification.getDefaultInstance() : consentNotification;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.LiveTrackServiceOrBuilder
        public ConsentNotificationOrBuilder getConsentNotificationOrBuilder() {
            ConsentNotification consentNotification = this.consentNotification_;
            return consentNotification == null ? ConsentNotification.getDefaultInstance() : consentNotification;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.LiveTrackServiceOrBuilder
        public EmergencyCountdownNotification getEmergencyCountdownNotification() {
            EmergencyCountdownNotification emergencyCountdownNotification = this.emergencyCountdownNotification_;
            return emergencyCountdownNotification == null ? EmergencyCountdownNotification.getDefaultInstance() : emergencyCountdownNotification;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.LiveTrackServiceOrBuilder
        public EmergencyCountdownNotificationOrBuilder getEmergencyCountdownNotificationOrBuilder() {
            EmergencyCountdownNotification emergencyCountdownNotification = this.emergencyCountdownNotification_;
            return emergencyCountdownNotification == null ? EmergencyCountdownNotification.getDefaultInstance() : emergencyCountdownNotification;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.LiveTrackServiceOrBuilder
        public GroupRideNotification getGroupRideNotification() {
            GroupRideNotification groupRideNotification = this.groupRideNotification_;
            return groupRideNotification == null ? GroupRideNotification.getDefaultInstance() : groupRideNotification;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.LiveTrackServiceOrBuilder
        public GroupRideNotificationOrBuilder getGroupRideNotificationOrBuilder() {
            GroupRideNotification groupRideNotification = this.groupRideNotification_;
            return groupRideNotification == null ? GroupRideNotification.getDefaultInstance() : groupRideNotification;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.LiveTrackServiceOrBuilder
        public LiveEventSharingNotification getLiveEventSharingNotification() {
            LiveEventSharingNotification liveEventSharingNotification = this.liveEventSharingNotification_;
            return liveEventSharingNotification == null ? LiveEventSharingNotification.getDefaultInstance() : liveEventSharingNotification;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.LiveTrackServiceOrBuilder
        public LiveEventSharingNotificationOrBuilder getLiveEventSharingNotificationOrBuilder() {
            LiveEventSharingNotification liveEventSharingNotification = this.liveEventSharingNotification_;
            return liveEventSharingNotification == null ? LiveEventSharingNotification.getDefaultInstance() : liveEventSharingNotification;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<LiveTrackService> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getShareMetaConfigNotification()) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, getShareSocialNotification());
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(3, getStartRequest());
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(4, getStartResponse());
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(5, getStopNotification());
            }
            if ((this.bitField0_ & 32) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(6, getShareDeviceSettingNotification());
            }
            if ((this.bitField0_ & 64) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(7, getStatusNotification());
            }
            if ((this.bitField0_ & 128) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(8, getConsentChangedNotification());
            }
            if ((this.bitField0_ & 256) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(9, getLiveEventSharingNotification());
            }
            if ((this.bitField0_ & 512) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(10, getSessionSupportRequest());
            }
            if ((this.bitField0_ & 1024) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(11, getSessionSupportResponse());
            }
            if ((this.bitField0_ & 2048) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(12, getUpdateSettingsNotification());
            }
            if ((this.bitField0_ & 4096) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(13, getEmergencyCountdownNotification());
            }
            if ((this.bitField0_ & 8192) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(14, getConsentNotification());
            }
            if ((this.bitField0_ & 16384) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(15, getGroupRideNotification());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.LiveTrackServiceOrBuilder
        public SessionSupportRequest getSessionSupportRequest() {
            SessionSupportRequest sessionSupportRequest = this.sessionSupportRequest_;
            return sessionSupportRequest == null ? SessionSupportRequest.getDefaultInstance() : sessionSupportRequest;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.LiveTrackServiceOrBuilder
        public SessionSupportRequestOrBuilder getSessionSupportRequestOrBuilder() {
            SessionSupportRequest sessionSupportRequest = this.sessionSupportRequest_;
            return sessionSupportRequest == null ? SessionSupportRequest.getDefaultInstance() : sessionSupportRequest;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.LiveTrackServiceOrBuilder
        public SessionSupportResponse getSessionSupportResponse() {
            SessionSupportResponse sessionSupportResponse = this.sessionSupportResponse_;
            return sessionSupportResponse == null ? SessionSupportResponse.getDefaultInstance() : sessionSupportResponse;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.LiveTrackServiceOrBuilder
        public SessionSupportResponseOrBuilder getSessionSupportResponseOrBuilder() {
            SessionSupportResponse sessionSupportResponse = this.sessionSupportResponse_;
            return sessionSupportResponse == null ? SessionSupportResponse.getDefaultInstance() : sessionSupportResponse;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.LiveTrackServiceOrBuilder
        public ShareDeviceSettingNotification getShareDeviceSettingNotification() {
            ShareDeviceSettingNotification shareDeviceSettingNotification = this.shareDeviceSettingNotification_;
            return shareDeviceSettingNotification == null ? ShareDeviceSettingNotification.getDefaultInstance() : shareDeviceSettingNotification;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.LiveTrackServiceOrBuilder
        public ShareDeviceSettingNotificationOrBuilder getShareDeviceSettingNotificationOrBuilder() {
            ShareDeviceSettingNotification shareDeviceSettingNotification = this.shareDeviceSettingNotification_;
            return shareDeviceSettingNotification == null ? ShareDeviceSettingNotification.getDefaultInstance() : shareDeviceSettingNotification;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.LiveTrackServiceOrBuilder
        public ShareMetaConfigurationNotification getShareMetaConfigNotification() {
            ShareMetaConfigurationNotification shareMetaConfigurationNotification = this.shareMetaConfigNotification_;
            return shareMetaConfigurationNotification == null ? ShareMetaConfigurationNotification.getDefaultInstance() : shareMetaConfigurationNotification;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.LiveTrackServiceOrBuilder
        public ShareMetaConfigurationNotificationOrBuilder getShareMetaConfigNotificationOrBuilder() {
            ShareMetaConfigurationNotification shareMetaConfigurationNotification = this.shareMetaConfigNotification_;
            return shareMetaConfigurationNotification == null ? ShareMetaConfigurationNotification.getDefaultInstance() : shareMetaConfigurationNotification;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.LiveTrackServiceOrBuilder
        public ShareSocialCredentialsNotification getShareSocialNotification() {
            ShareSocialCredentialsNotification shareSocialCredentialsNotification = this.shareSocialNotification_;
            return shareSocialCredentialsNotification == null ? ShareSocialCredentialsNotification.getDefaultInstance() : shareSocialCredentialsNotification;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.LiveTrackServiceOrBuilder
        public ShareSocialCredentialsNotificationOrBuilder getShareSocialNotificationOrBuilder() {
            ShareSocialCredentialsNotification shareSocialCredentialsNotification = this.shareSocialNotification_;
            return shareSocialCredentialsNotification == null ? ShareSocialCredentialsNotification.getDefaultInstance() : shareSocialCredentialsNotification;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.LiveTrackServiceOrBuilder
        public StartRequest getStartRequest() {
            StartRequest startRequest = this.startRequest_;
            return startRequest == null ? StartRequest.getDefaultInstance() : startRequest;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.LiveTrackServiceOrBuilder
        public StartRequestOrBuilder getStartRequestOrBuilder() {
            StartRequest startRequest = this.startRequest_;
            return startRequest == null ? StartRequest.getDefaultInstance() : startRequest;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.LiveTrackServiceOrBuilder
        public StartResponse getStartResponse() {
            StartResponse startResponse = this.startResponse_;
            return startResponse == null ? StartResponse.getDefaultInstance() : startResponse;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.LiveTrackServiceOrBuilder
        public StartResponseOrBuilder getStartResponseOrBuilder() {
            StartResponse startResponse = this.startResponse_;
            return startResponse == null ? StartResponse.getDefaultInstance() : startResponse;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.LiveTrackServiceOrBuilder
        public StatusNotification getStatusNotification() {
            StatusNotification statusNotification = this.statusNotification_;
            return statusNotification == null ? StatusNotification.getDefaultInstance() : statusNotification;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.LiveTrackServiceOrBuilder
        public StatusNotificationOrBuilder getStatusNotificationOrBuilder() {
            StatusNotification statusNotification = this.statusNotification_;
            return statusNotification == null ? StatusNotification.getDefaultInstance() : statusNotification;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.LiveTrackServiceOrBuilder
        public StopNotification getStopNotification() {
            StopNotification stopNotification = this.stopNotification_;
            return stopNotification == null ? StopNotification.getDefaultInstance() : stopNotification;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.LiveTrackServiceOrBuilder
        public StopNotificationOrBuilder getStopNotificationOrBuilder() {
            StopNotification stopNotification = this.stopNotification_;
            return stopNotification == null ? StopNotification.getDefaultInstance() : stopNotification;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.LiveTrackServiceOrBuilder
        public UpdateSettingsNotification getUpdateSettingsNotification() {
            UpdateSettingsNotification updateSettingsNotification = this.updateSettingsNotification_;
            return updateSettingsNotification == null ? UpdateSettingsNotification.getDefaultInstance() : updateSettingsNotification;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.LiveTrackServiceOrBuilder
        public UpdateSettingsNotificationOrBuilder getUpdateSettingsNotificationOrBuilder() {
            UpdateSettingsNotification updateSettingsNotification = this.updateSettingsNotification_;
            return updateSettingsNotification == null ? UpdateSettingsNotification.getDefaultInstance() : updateSettingsNotification;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.LiveTrackServiceOrBuilder
        public boolean hasConsentChangedNotification() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.LiveTrackServiceOrBuilder
        public boolean hasConsentNotification() {
            return (this.bitField0_ & 8192) != 0;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.LiveTrackServiceOrBuilder
        public boolean hasEmergencyCountdownNotification() {
            return (this.bitField0_ & 4096) != 0;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.LiveTrackServiceOrBuilder
        public boolean hasGroupRideNotification() {
            return (this.bitField0_ & 16384) != 0;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.LiveTrackServiceOrBuilder
        public boolean hasLiveEventSharingNotification() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.LiveTrackServiceOrBuilder
        public boolean hasSessionSupportRequest() {
            return (this.bitField0_ & 512) != 0;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.LiveTrackServiceOrBuilder
        public boolean hasSessionSupportResponse() {
            return (this.bitField0_ & 1024) != 0;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.LiveTrackServiceOrBuilder
        public boolean hasShareDeviceSettingNotification() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.LiveTrackServiceOrBuilder
        public boolean hasShareMetaConfigNotification() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.LiveTrackServiceOrBuilder
        public boolean hasShareSocialNotification() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.LiveTrackServiceOrBuilder
        public boolean hasStartRequest() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.LiveTrackServiceOrBuilder
        public boolean hasStartResponse() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.LiveTrackServiceOrBuilder
        public boolean hasStatusNotification() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.LiveTrackServiceOrBuilder
        public boolean hasStopNotification() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.LiveTrackServiceOrBuilder
        public boolean hasUpdateSettingsNotification() {
            return (this.bitField0_ & 2048) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasShareMetaConfigNotification()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getShareMetaConfigNotification().hashCode();
            }
            if (hasShareSocialNotification()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getShareSocialNotification().hashCode();
            }
            if (hasStartRequest()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getStartRequest().hashCode();
            }
            if (hasStartResponse()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getStartResponse().hashCode();
            }
            if (hasStopNotification()) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + getStopNotification().hashCode();
            }
            if (hasShareDeviceSettingNotification()) {
                iHashCode = e5.c(iHashCode, 37, 6, 53) + getShareDeviceSettingNotification().hashCode();
            }
            if (hasStatusNotification()) {
                iHashCode = e5.c(iHashCode, 37, 7, 53) + getStatusNotification().hashCode();
            }
            if (hasConsentChangedNotification()) {
                iHashCode = e5.c(iHashCode, 37, 8, 53) + getConsentChangedNotification().hashCode();
            }
            if (hasLiveEventSharingNotification()) {
                iHashCode = e5.c(iHashCode, 37, 9, 53) + getLiveEventSharingNotification().hashCode();
            }
            if (hasSessionSupportRequest()) {
                iHashCode = e5.c(iHashCode, 37, 10, 53) + getSessionSupportRequest().hashCode();
            }
            if (hasSessionSupportResponse()) {
                iHashCode = e5.c(iHashCode, 37, 11, 53) + getSessionSupportResponse().hashCode();
            }
            if (hasUpdateSettingsNotification()) {
                iHashCode = e5.c(iHashCode, 37, 12, 53) + getUpdateSettingsNotification().hashCode();
            }
            if (hasEmergencyCountdownNotification()) {
                iHashCode = e5.c(iHashCode, 37, 13, 53) + getEmergencyCountdownNotification().hashCode();
            }
            if (hasConsentNotification()) {
                iHashCode = e5.c(iHashCode, 37, 14, 53) + getConsentNotification().hashCode();
            }
            if (hasGroupRideNotification()) {
                iHashCode = e5.c(iHashCode, 37, 15, 53) + getGroupRideNotification().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDILiveTrackProto.internal_static_GDI_Proto_LiveTrack_LiveTrackService_fieldAccessorTable.ensureFieldAccessorsInitialized(LiveTrackService.class, Builder.class);
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
            if (hasShareSocialNotification() && !getShareSocialNotification().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasStartRequest() && !getStartRequest().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasStartResponse() && !getStartResponse().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasStatusNotification() || getStatusNotification().isInitialized()) {
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
            return new LiveTrackService();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getShareMetaConfigNotification());
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeMessage(2, getShareSocialNotification());
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeMessage(3, getStartRequest());
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeMessage(4, getStartResponse());
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeMessage(5, getStopNotification());
            }
            if ((this.bitField0_ & 32) != 0) {
                codedOutputStream.writeMessage(6, getShareDeviceSettingNotification());
            }
            if ((this.bitField0_ & 64) != 0) {
                codedOutputStream.writeMessage(7, getStatusNotification());
            }
            if ((this.bitField0_ & 128) != 0) {
                codedOutputStream.writeMessage(8, getConsentChangedNotification());
            }
            if ((this.bitField0_ & 256) != 0) {
                codedOutputStream.writeMessage(9, getLiveEventSharingNotification());
            }
            if ((this.bitField0_ & 512) != 0) {
                codedOutputStream.writeMessage(10, getSessionSupportRequest());
            }
            if ((this.bitField0_ & 1024) != 0) {
                codedOutputStream.writeMessage(11, getSessionSupportResponse());
            }
            if ((this.bitField0_ & 2048) != 0) {
                codedOutputStream.writeMessage(12, getUpdateSettingsNotification());
            }
            if ((this.bitField0_ & 4096) != 0) {
                codedOutputStream.writeMessage(13, getEmergencyCountdownNotification());
            }
            if ((this.bitField0_ & 8192) != 0) {
                codedOutputStream.writeMessage(14, getConsentNotification());
            }
            if ((this.bitField0_ & 16384) != 0) {
                codedOutputStream.writeMessage(15, getGroupRideNotification());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements LiveTrackServiceOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<ConsentChangedNotification, ConsentChangedNotification.Builder, ConsentChangedNotificationOrBuilder> consentChangedNotificationBuilder_;
            private ConsentChangedNotification consentChangedNotification_;
            private SingleFieldBuilderV3<ConsentNotification, ConsentNotification.Builder, ConsentNotificationOrBuilder> consentNotificationBuilder_;
            private ConsentNotification consentNotification_;
            private SingleFieldBuilderV3<EmergencyCountdownNotification, EmergencyCountdownNotification.Builder, EmergencyCountdownNotificationOrBuilder> emergencyCountdownNotificationBuilder_;
            private EmergencyCountdownNotification emergencyCountdownNotification_;
            private SingleFieldBuilderV3<GroupRideNotification, GroupRideNotification.Builder, GroupRideNotificationOrBuilder> groupRideNotificationBuilder_;
            private GroupRideNotification groupRideNotification_;
            private SingleFieldBuilderV3<LiveEventSharingNotification, LiveEventSharingNotification.Builder, LiveEventSharingNotificationOrBuilder> liveEventSharingNotificationBuilder_;
            private LiveEventSharingNotification liveEventSharingNotification_;
            private SingleFieldBuilderV3<SessionSupportRequest, SessionSupportRequest.Builder, SessionSupportRequestOrBuilder> sessionSupportRequestBuilder_;
            private SessionSupportRequest sessionSupportRequest_;
            private SingleFieldBuilderV3<SessionSupportResponse, SessionSupportResponse.Builder, SessionSupportResponseOrBuilder> sessionSupportResponseBuilder_;
            private SessionSupportResponse sessionSupportResponse_;
            private SingleFieldBuilderV3<ShareDeviceSettingNotification, ShareDeviceSettingNotification.Builder, ShareDeviceSettingNotificationOrBuilder> shareDeviceSettingNotificationBuilder_;
            private ShareDeviceSettingNotification shareDeviceSettingNotification_;
            private SingleFieldBuilderV3<ShareMetaConfigurationNotification, ShareMetaConfigurationNotification.Builder, ShareMetaConfigurationNotificationOrBuilder> shareMetaConfigNotificationBuilder_;
            private ShareMetaConfigurationNotification shareMetaConfigNotification_;
            private SingleFieldBuilderV3<ShareSocialCredentialsNotification, ShareSocialCredentialsNotification.Builder, ShareSocialCredentialsNotificationOrBuilder> shareSocialNotificationBuilder_;
            private ShareSocialCredentialsNotification shareSocialNotification_;
            private SingleFieldBuilderV3<StartRequest, StartRequest.Builder, StartRequestOrBuilder> startRequestBuilder_;
            private StartRequest startRequest_;
            private SingleFieldBuilderV3<StartResponse, StartResponse.Builder, StartResponseOrBuilder> startResponseBuilder_;
            private StartResponse startResponse_;
            private SingleFieldBuilderV3<StatusNotification, StatusNotification.Builder, StatusNotificationOrBuilder> statusNotificationBuilder_;
            private StatusNotification statusNotification_;
            private SingleFieldBuilderV3<StopNotification, StopNotification.Builder, StopNotificationOrBuilder> stopNotificationBuilder_;
            private StopNotification stopNotification_;
            private SingleFieldBuilderV3<UpdateSettingsNotification, UpdateSettingsNotification.Builder, UpdateSettingsNotificationOrBuilder> updateSettingsNotificationBuilder_;
            private UpdateSettingsNotification updateSettingsNotification_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(LiveTrackService liveTrackService) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    SingleFieldBuilderV3<ShareMetaConfigurationNotification, ShareMetaConfigurationNotification.Builder, ShareMetaConfigurationNotificationOrBuilder> singleFieldBuilderV3 = this.shareMetaConfigNotificationBuilder_;
                    liveTrackService.shareMetaConfigNotification_ = singleFieldBuilderV3 == null ? this.shareMetaConfigNotification_ : (ShareMetaConfigurationNotification) singleFieldBuilderV3.build();
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    SingleFieldBuilderV3<ShareSocialCredentialsNotification, ShareSocialCredentialsNotification.Builder, ShareSocialCredentialsNotificationOrBuilder> singleFieldBuilderV4 = this.shareSocialNotificationBuilder_;
                    liveTrackService.shareSocialNotification_ = singleFieldBuilderV4 == null ? this.shareSocialNotification_ : (ShareSocialCredentialsNotification) singleFieldBuilderV4.build();
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    SingleFieldBuilderV3<StartRequest, StartRequest.Builder, StartRequestOrBuilder> singleFieldBuilderV5 = this.startRequestBuilder_;
                    liveTrackService.startRequest_ = singleFieldBuilderV5 == null ? this.startRequest_ : (StartRequest) singleFieldBuilderV5.build();
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    SingleFieldBuilderV3<StartResponse, StartResponse.Builder, StartResponseOrBuilder> singleFieldBuilderV6 = this.startResponseBuilder_;
                    liveTrackService.startResponse_ = singleFieldBuilderV6 == null ? this.startResponse_ : (StartResponse) singleFieldBuilderV6.build();
                    i14 |= 8;
                }
                if ((i15 & 16) != 0) {
                    SingleFieldBuilderV3<StopNotification, StopNotification.Builder, StopNotificationOrBuilder> singleFieldBuilderV7 = this.stopNotificationBuilder_;
                    liveTrackService.stopNotification_ = singleFieldBuilderV7 == null ? this.stopNotification_ : (StopNotification) singleFieldBuilderV7.build();
                    i14 |= 16;
                }
                if ((i15 & 32) != 0) {
                    SingleFieldBuilderV3<ShareDeviceSettingNotification, ShareDeviceSettingNotification.Builder, ShareDeviceSettingNotificationOrBuilder> singleFieldBuilderV8 = this.shareDeviceSettingNotificationBuilder_;
                    liveTrackService.shareDeviceSettingNotification_ = singleFieldBuilderV8 == null ? this.shareDeviceSettingNotification_ : (ShareDeviceSettingNotification) singleFieldBuilderV8.build();
                    i14 |= 32;
                }
                if ((i15 & 64) != 0) {
                    SingleFieldBuilderV3<StatusNotification, StatusNotification.Builder, StatusNotificationOrBuilder> singleFieldBuilderV9 = this.statusNotificationBuilder_;
                    liveTrackService.statusNotification_ = singleFieldBuilderV9 == null ? this.statusNotification_ : (StatusNotification) singleFieldBuilderV9.build();
                    i14 |= 64;
                }
                if ((i15 & 128) != 0) {
                    SingleFieldBuilderV3<ConsentChangedNotification, ConsentChangedNotification.Builder, ConsentChangedNotificationOrBuilder> singleFieldBuilderV10 = this.consentChangedNotificationBuilder_;
                    liveTrackService.consentChangedNotification_ = singleFieldBuilderV10 == null ? this.consentChangedNotification_ : (ConsentChangedNotification) singleFieldBuilderV10.build();
                    i14 |= 128;
                }
                if ((i15 & 256) != 0) {
                    SingleFieldBuilderV3<LiveEventSharingNotification, LiveEventSharingNotification.Builder, LiveEventSharingNotificationOrBuilder> singleFieldBuilderV11 = this.liveEventSharingNotificationBuilder_;
                    liveTrackService.liveEventSharingNotification_ = singleFieldBuilderV11 == null ? this.liveEventSharingNotification_ : (LiveEventSharingNotification) singleFieldBuilderV11.build();
                    i14 |= 256;
                }
                if ((i15 & 512) != 0) {
                    SingleFieldBuilderV3<SessionSupportRequest, SessionSupportRequest.Builder, SessionSupportRequestOrBuilder> singleFieldBuilderV12 = this.sessionSupportRequestBuilder_;
                    liveTrackService.sessionSupportRequest_ = singleFieldBuilderV12 == null ? this.sessionSupportRequest_ : (SessionSupportRequest) singleFieldBuilderV12.build();
                    i14 |= 512;
                }
                if ((i15 & 1024) != 0) {
                    SingleFieldBuilderV3<SessionSupportResponse, SessionSupportResponse.Builder, SessionSupportResponseOrBuilder> singleFieldBuilderV13 = this.sessionSupportResponseBuilder_;
                    liveTrackService.sessionSupportResponse_ = singleFieldBuilderV13 == null ? this.sessionSupportResponse_ : (SessionSupportResponse) singleFieldBuilderV13.build();
                    i14 |= 1024;
                }
                if ((i15 & 2048) != 0) {
                    SingleFieldBuilderV3<UpdateSettingsNotification, UpdateSettingsNotification.Builder, UpdateSettingsNotificationOrBuilder> singleFieldBuilderV14 = this.updateSettingsNotificationBuilder_;
                    liveTrackService.updateSettingsNotification_ = singleFieldBuilderV14 == null ? this.updateSettingsNotification_ : (UpdateSettingsNotification) singleFieldBuilderV14.build();
                    i14 |= 2048;
                }
                if ((i15 & 4096) != 0) {
                    SingleFieldBuilderV3<EmergencyCountdownNotification, EmergencyCountdownNotification.Builder, EmergencyCountdownNotificationOrBuilder> singleFieldBuilderV15 = this.emergencyCountdownNotificationBuilder_;
                    liveTrackService.emergencyCountdownNotification_ = singleFieldBuilderV15 == null ? this.emergencyCountdownNotification_ : (EmergencyCountdownNotification) singleFieldBuilderV15.build();
                    i14 |= 4096;
                }
                if ((i15 & 8192) != 0) {
                    SingleFieldBuilderV3<ConsentNotification, ConsentNotification.Builder, ConsentNotificationOrBuilder> singleFieldBuilderV16 = this.consentNotificationBuilder_;
                    liveTrackService.consentNotification_ = singleFieldBuilderV16 == null ? this.consentNotification_ : (ConsentNotification) singleFieldBuilderV16.build();
                    i14 |= 8192;
                }
                if ((i15 & 16384) != 0) {
                    SingleFieldBuilderV3<GroupRideNotification, GroupRideNotification.Builder, GroupRideNotificationOrBuilder> singleFieldBuilderV17 = this.groupRideNotificationBuilder_;
                    liveTrackService.groupRideNotification_ = singleFieldBuilderV17 == null ? this.groupRideNotification_ : (GroupRideNotification) singleFieldBuilderV17.build();
                    i14 |= 16384;
                }
                liveTrackService.bitField0_ |= i14;
            }

            private SingleFieldBuilderV3<ConsentChangedNotification, ConsentChangedNotification.Builder, ConsentChangedNotificationOrBuilder> getConsentChangedNotificationFieldBuilder() {
                if (this.consentChangedNotificationBuilder_ == null) {
                    this.consentChangedNotificationBuilder_ = new SingleFieldBuilderV3<>(getConsentChangedNotification(), getParentForChildren(), isClean());
                    this.consentChangedNotification_ = null;
                }
                return this.consentChangedNotificationBuilder_;
            }

            private SingleFieldBuilderV3<ConsentNotification, ConsentNotification.Builder, ConsentNotificationOrBuilder> getConsentNotificationFieldBuilder() {
                if (this.consentNotificationBuilder_ == null) {
                    this.consentNotificationBuilder_ = new SingleFieldBuilderV3<>(getConsentNotification(), getParentForChildren(), isClean());
                    this.consentNotification_ = null;
                }
                return this.consentNotificationBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDILiveTrackProto.internal_static_GDI_Proto_LiveTrack_LiveTrackService_descriptor;
            }

            private SingleFieldBuilderV3<EmergencyCountdownNotification, EmergencyCountdownNotification.Builder, EmergencyCountdownNotificationOrBuilder> getEmergencyCountdownNotificationFieldBuilder() {
                if (this.emergencyCountdownNotificationBuilder_ == null) {
                    this.emergencyCountdownNotificationBuilder_ = new SingleFieldBuilderV3<>(getEmergencyCountdownNotification(), getParentForChildren(), isClean());
                    this.emergencyCountdownNotification_ = null;
                }
                return this.emergencyCountdownNotificationBuilder_;
            }

            private SingleFieldBuilderV3<GroupRideNotification, GroupRideNotification.Builder, GroupRideNotificationOrBuilder> getGroupRideNotificationFieldBuilder() {
                if (this.groupRideNotificationBuilder_ == null) {
                    this.groupRideNotificationBuilder_ = new SingleFieldBuilderV3<>(getGroupRideNotification(), getParentForChildren(), isClean());
                    this.groupRideNotification_ = null;
                }
                return this.groupRideNotificationBuilder_;
            }

            private SingleFieldBuilderV3<LiveEventSharingNotification, LiveEventSharingNotification.Builder, LiveEventSharingNotificationOrBuilder> getLiveEventSharingNotificationFieldBuilder() {
                if (this.liveEventSharingNotificationBuilder_ == null) {
                    this.liveEventSharingNotificationBuilder_ = new SingleFieldBuilderV3<>(getLiveEventSharingNotification(), getParentForChildren(), isClean());
                    this.liveEventSharingNotification_ = null;
                }
                return this.liveEventSharingNotificationBuilder_;
            }

            private SingleFieldBuilderV3<SessionSupportRequest, SessionSupportRequest.Builder, SessionSupportRequestOrBuilder> getSessionSupportRequestFieldBuilder() {
                if (this.sessionSupportRequestBuilder_ == null) {
                    this.sessionSupportRequestBuilder_ = new SingleFieldBuilderV3<>(getSessionSupportRequest(), getParentForChildren(), isClean());
                    this.sessionSupportRequest_ = null;
                }
                return this.sessionSupportRequestBuilder_;
            }

            private SingleFieldBuilderV3<SessionSupportResponse, SessionSupportResponse.Builder, SessionSupportResponseOrBuilder> getSessionSupportResponseFieldBuilder() {
                if (this.sessionSupportResponseBuilder_ == null) {
                    this.sessionSupportResponseBuilder_ = new SingleFieldBuilderV3<>(getSessionSupportResponse(), getParentForChildren(), isClean());
                    this.sessionSupportResponse_ = null;
                }
                return this.sessionSupportResponseBuilder_;
            }

            private SingleFieldBuilderV3<ShareDeviceSettingNotification, ShareDeviceSettingNotification.Builder, ShareDeviceSettingNotificationOrBuilder> getShareDeviceSettingNotificationFieldBuilder() {
                if (this.shareDeviceSettingNotificationBuilder_ == null) {
                    this.shareDeviceSettingNotificationBuilder_ = new SingleFieldBuilderV3<>(getShareDeviceSettingNotification(), getParentForChildren(), isClean());
                    this.shareDeviceSettingNotification_ = null;
                }
                return this.shareDeviceSettingNotificationBuilder_;
            }

            private SingleFieldBuilderV3<ShareMetaConfigurationNotification, ShareMetaConfigurationNotification.Builder, ShareMetaConfigurationNotificationOrBuilder> getShareMetaConfigNotificationFieldBuilder() {
                if (this.shareMetaConfigNotificationBuilder_ == null) {
                    this.shareMetaConfigNotificationBuilder_ = new SingleFieldBuilderV3<>(getShareMetaConfigNotification(), getParentForChildren(), isClean());
                    this.shareMetaConfigNotification_ = null;
                }
                return this.shareMetaConfigNotificationBuilder_;
            }

            private SingleFieldBuilderV3<ShareSocialCredentialsNotification, ShareSocialCredentialsNotification.Builder, ShareSocialCredentialsNotificationOrBuilder> getShareSocialNotificationFieldBuilder() {
                if (this.shareSocialNotificationBuilder_ == null) {
                    this.shareSocialNotificationBuilder_ = new SingleFieldBuilderV3<>(getShareSocialNotification(), getParentForChildren(), isClean());
                    this.shareSocialNotification_ = null;
                }
                return this.shareSocialNotificationBuilder_;
            }

            private SingleFieldBuilderV3<StartRequest, StartRequest.Builder, StartRequestOrBuilder> getStartRequestFieldBuilder() {
                if (this.startRequestBuilder_ == null) {
                    this.startRequestBuilder_ = new SingleFieldBuilderV3<>(getStartRequest(), getParentForChildren(), isClean());
                    this.startRequest_ = null;
                }
                return this.startRequestBuilder_;
            }

            private SingleFieldBuilderV3<StartResponse, StartResponse.Builder, StartResponseOrBuilder> getStartResponseFieldBuilder() {
                if (this.startResponseBuilder_ == null) {
                    this.startResponseBuilder_ = new SingleFieldBuilderV3<>(getStartResponse(), getParentForChildren(), isClean());
                    this.startResponse_ = null;
                }
                return this.startResponseBuilder_;
            }

            private SingleFieldBuilderV3<StatusNotification, StatusNotification.Builder, StatusNotificationOrBuilder> getStatusNotificationFieldBuilder() {
                if (this.statusNotificationBuilder_ == null) {
                    this.statusNotificationBuilder_ = new SingleFieldBuilderV3<>(getStatusNotification(), getParentForChildren(), isClean());
                    this.statusNotification_ = null;
                }
                return this.statusNotificationBuilder_;
            }

            private SingleFieldBuilderV3<StopNotification, StopNotification.Builder, StopNotificationOrBuilder> getStopNotificationFieldBuilder() {
                if (this.stopNotificationBuilder_ == null) {
                    this.stopNotificationBuilder_ = new SingleFieldBuilderV3<>(getStopNotification(), getParentForChildren(), isClean());
                    this.stopNotification_ = null;
                }
                return this.stopNotificationBuilder_;
            }

            private SingleFieldBuilderV3<UpdateSettingsNotification, UpdateSettingsNotification.Builder, UpdateSettingsNotificationOrBuilder> getUpdateSettingsNotificationFieldBuilder() {
                if (this.updateSettingsNotificationBuilder_ == null) {
                    this.updateSettingsNotificationBuilder_ = new SingleFieldBuilderV3<>(getUpdateSettingsNotification(), getParentForChildren(), isClean());
                    this.updateSettingsNotification_ = null;
                }
                return this.updateSettingsNotificationBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getShareMetaConfigNotificationFieldBuilder();
                    getShareSocialNotificationFieldBuilder();
                    getStartRequestFieldBuilder();
                    getStartResponseFieldBuilder();
                    getStopNotificationFieldBuilder();
                    getShareDeviceSettingNotificationFieldBuilder();
                    getStatusNotificationFieldBuilder();
                    getConsentChangedNotificationFieldBuilder();
                    getLiveEventSharingNotificationFieldBuilder();
                    getSessionSupportRequestFieldBuilder();
                    getSessionSupportResponseFieldBuilder();
                    getUpdateSettingsNotificationFieldBuilder();
                    getEmergencyCountdownNotificationFieldBuilder();
                    getConsentNotificationFieldBuilder();
                    getGroupRideNotificationFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public LiveTrackService build() {
                LiveTrackService liveTrackServiceBuildPartial = buildPartial();
                if (liveTrackServiceBuildPartial.isInitialized()) {
                    return liveTrackServiceBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) liveTrackServiceBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public LiveTrackService buildPartial() {
                LiveTrackService liveTrackService = new LiveTrackService(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(liveTrackService);
                }
                onBuilt();
                return liveTrackService;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.shareMetaConfigNotification_ = null;
                SingleFieldBuilderV3<ShareMetaConfigurationNotification, ShareMetaConfigurationNotification.Builder, ShareMetaConfigurationNotificationOrBuilder> singleFieldBuilderV3 = this.shareMetaConfigNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.shareMetaConfigNotificationBuilder_ = null;
                }
                this.shareSocialNotification_ = null;
                SingleFieldBuilderV3<ShareSocialCredentialsNotification, ShareSocialCredentialsNotification.Builder, ShareSocialCredentialsNotificationOrBuilder> singleFieldBuilderV4 = this.shareSocialNotificationBuilder_;
                if (singleFieldBuilderV4 != null) {
                    singleFieldBuilderV4.dispose();
                    this.shareSocialNotificationBuilder_ = null;
                }
                this.startRequest_ = null;
                SingleFieldBuilderV3<StartRequest, StartRequest.Builder, StartRequestOrBuilder> singleFieldBuilderV5 = this.startRequestBuilder_;
                if (singleFieldBuilderV5 != null) {
                    singleFieldBuilderV5.dispose();
                    this.startRequestBuilder_ = null;
                }
                this.startResponse_ = null;
                SingleFieldBuilderV3<StartResponse, StartResponse.Builder, StartResponseOrBuilder> singleFieldBuilderV6 = this.startResponseBuilder_;
                if (singleFieldBuilderV6 != null) {
                    singleFieldBuilderV6.dispose();
                    this.startResponseBuilder_ = null;
                }
                this.stopNotification_ = null;
                SingleFieldBuilderV3<StopNotification, StopNotification.Builder, StopNotificationOrBuilder> singleFieldBuilderV7 = this.stopNotificationBuilder_;
                if (singleFieldBuilderV7 != null) {
                    singleFieldBuilderV7.dispose();
                    this.stopNotificationBuilder_ = null;
                }
                this.shareDeviceSettingNotification_ = null;
                SingleFieldBuilderV3<ShareDeviceSettingNotification, ShareDeviceSettingNotification.Builder, ShareDeviceSettingNotificationOrBuilder> singleFieldBuilderV8 = this.shareDeviceSettingNotificationBuilder_;
                if (singleFieldBuilderV8 != null) {
                    singleFieldBuilderV8.dispose();
                    this.shareDeviceSettingNotificationBuilder_ = null;
                }
                this.statusNotification_ = null;
                SingleFieldBuilderV3<StatusNotification, StatusNotification.Builder, StatusNotificationOrBuilder> singleFieldBuilderV9 = this.statusNotificationBuilder_;
                if (singleFieldBuilderV9 != null) {
                    singleFieldBuilderV9.dispose();
                    this.statusNotificationBuilder_ = null;
                }
                this.consentChangedNotification_ = null;
                SingleFieldBuilderV3<ConsentChangedNotification, ConsentChangedNotification.Builder, ConsentChangedNotificationOrBuilder> singleFieldBuilderV10 = this.consentChangedNotificationBuilder_;
                if (singleFieldBuilderV10 != null) {
                    singleFieldBuilderV10.dispose();
                    this.consentChangedNotificationBuilder_ = null;
                }
                this.liveEventSharingNotification_ = null;
                SingleFieldBuilderV3<LiveEventSharingNotification, LiveEventSharingNotification.Builder, LiveEventSharingNotificationOrBuilder> singleFieldBuilderV11 = this.liveEventSharingNotificationBuilder_;
                if (singleFieldBuilderV11 != null) {
                    singleFieldBuilderV11.dispose();
                    this.liveEventSharingNotificationBuilder_ = null;
                }
                this.sessionSupportRequest_ = null;
                SingleFieldBuilderV3<SessionSupportRequest, SessionSupportRequest.Builder, SessionSupportRequestOrBuilder> singleFieldBuilderV12 = this.sessionSupportRequestBuilder_;
                if (singleFieldBuilderV12 != null) {
                    singleFieldBuilderV12.dispose();
                    this.sessionSupportRequestBuilder_ = null;
                }
                this.sessionSupportResponse_ = null;
                SingleFieldBuilderV3<SessionSupportResponse, SessionSupportResponse.Builder, SessionSupportResponseOrBuilder> singleFieldBuilderV13 = this.sessionSupportResponseBuilder_;
                if (singleFieldBuilderV13 != null) {
                    singleFieldBuilderV13.dispose();
                    this.sessionSupportResponseBuilder_ = null;
                }
                this.updateSettingsNotification_ = null;
                SingleFieldBuilderV3<UpdateSettingsNotification, UpdateSettingsNotification.Builder, UpdateSettingsNotificationOrBuilder> singleFieldBuilderV14 = this.updateSettingsNotificationBuilder_;
                if (singleFieldBuilderV14 != null) {
                    singleFieldBuilderV14.dispose();
                    this.updateSettingsNotificationBuilder_ = null;
                }
                this.emergencyCountdownNotification_ = null;
                SingleFieldBuilderV3<EmergencyCountdownNotification, EmergencyCountdownNotification.Builder, EmergencyCountdownNotificationOrBuilder> singleFieldBuilderV15 = this.emergencyCountdownNotificationBuilder_;
                if (singleFieldBuilderV15 != null) {
                    singleFieldBuilderV15.dispose();
                    this.emergencyCountdownNotificationBuilder_ = null;
                }
                this.consentNotification_ = null;
                SingleFieldBuilderV3<ConsentNotification, ConsentNotification.Builder, ConsentNotificationOrBuilder> singleFieldBuilderV16 = this.consentNotificationBuilder_;
                if (singleFieldBuilderV16 != null) {
                    singleFieldBuilderV16.dispose();
                    this.consentNotificationBuilder_ = null;
                }
                this.groupRideNotification_ = null;
                SingleFieldBuilderV3<GroupRideNotification, GroupRideNotification.Builder, GroupRideNotificationOrBuilder> singleFieldBuilderV17 = this.groupRideNotificationBuilder_;
                if (singleFieldBuilderV17 != null) {
                    singleFieldBuilderV17.dispose();
                    this.groupRideNotificationBuilder_ = null;
                }
                return this;
            }

            public Builder clearConsentChangedNotification() {
                this.bitField0_ &= -129;
                this.consentChangedNotification_ = null;
                SingleFieldBuilderV3<ConsentChangedNotification, ConsentChangedNotification.Builder, ConsentChangedNotificationOrBuilder> singleFieldBuilderV3 = this.consentChangedNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.consentChangedNotificationBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearConsentNotification() {
                this.bitField0_ &= -8193;
                this.consentNotification_ = null;
                SingleFieldBuilderV3<ConsentNotification, ConsentNotification.Builder, ConsentNotificationOrBuilder> singleFieldBuilderV3 = this.consentNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.consentNotificationBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearEmergencyCountdownNotification() {
                this.bitField0_ &= -4097;
                this.emergencyCountdownNotification_ = null;
                SingleFieldBuilderV3<EmergencyCountdownNotification, EmergencyCountdownNotification.Builder, EmergencyCountdownNotificationOrBuilder> singleFieldBuilderV3 = this.emergencyCountdownNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.emergencyCountdownNotificationBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearGroupRideNotification() {
                this.bitField0_ &= -16385;
                this.groupRideNotification_ = null;
                SingleFieldBuilderV3<GroupRideNotification, GroupRideNotification.Builder, GroupRideNotificationOrBuilder> singleFieldBuilderV3 = this.groupRideNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.groupRideNotificationBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearLiveEventSharingNotification() {
                this.bitField0_ &= -257;
                this.liveEventSharingNotification_ = null;
                SingleFieldBuilderV3<LiveEventSharingNotification, LiveEventSharingNotification.Builder, LiveEventSharingNotificationOrBuilder> singleFieldBuilderV3 = this.liveEventSharingNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.liveEventSharingNotificationBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearSessionSupportRequest() {
                this.bitField0_ &= -513;
                this.sessionSupportRequest_ = null;
                SingleFieldBuilderV3<SessionSupportRequest, SessionSupportRequest.Builder, SessionSupportRequestOrBuilder> singleFieldBuilderV3 = this.sessionSupportRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.sessionSupportRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearSessionSupportResponse() {
                this.bitField0_ &= -1025;
                this.sessionSupportResponse_ = null;
                SingleFieldBuilderV3<SessionSupportResponse, SessionSupportResponse.Builder, SessionSupportResponseOrBuilder> singleFieldBuilderV3 = this.sessionSupportResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.sessionSupportResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearShareDeviceSettingNotification() {
                this.bitField0_ &= -33;
                this.shareDeviceSettingNotification_ = null;
                SingleFieldBuilderV3<ShareDeviceSettingNotification, ShareDeviceSettingNotification.Builder, ShareDeviceSettingNotificationOrBuilder> singleFieldBuilderV3 = this.shareDeviceSettingNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.shareDeviceSettingNotificationBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearShareMetaConfigNotification() {
                this.bitField0_ &= -2;
                this.shareMetaConfigNotification_ = null;
                SingleFieldBuilderV3<ShareMetaConfigurationNotification, ShareMetaConfigurationNotification.Builder, ShareMetaConfigurationNotificationOrBuilder> singleFieldBuilderV3 = this.shareMetaConfigNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.shareMetaConfigNotificationBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearShareSocialNotification() {
                this.bitField0_ &= -3;
                this.shareSocialNotification_ = null;
                SingleFieldBuilderV3<ShareSocialCredentialsNotification, ShareSocialCredentialsNotification.Builder, ShareSocialCredentialsNotificationOrBuilder> singleFieldBuilderV3 = this.shareSocialNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.shareSocialNotificationBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearStartRequest() {
                this.bitField0_ &= -5;
                this.startRequest_ = null;
                SingleFieldBuilderV3<StartRequest, StartRequest.Builder, StartRequestOrBuilder> singleFieldBuilderV3 = this.startRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.startRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearStartResponse() {
                this.bitField0_ &= -9;
                this.startResponse_ = null;
                SingleFieldBuilderV3<StartResponse, StartResponse.Builder, StartResponseOrBuilder> singleFieldBuilderV3 = this.startResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.startResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearStatusNotification() {
                this.bitField0_ &= -65;
                this.statusNotification_ = null;
                SingleFieldBuilderV3<StatusNotification, StatusNotification.Builder, StatusNotificationOrBuilder> singleFieldBuilderV3 = this.statusNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.statusNotificationBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearStopNotification() {
                this.bitField0_ &= -17;
                this.stopNotification_ = null;
                SingleFieldBuilderV3<StopNotification, StopNotification.Builder, StopNotificationOrBuilder> singleFieldBuilderV3 = this.stopNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.stopNotificationBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearUpdateSettingsNotification() {
                this.bitField0_ &= -2049;
                this.updateSettingsNotification_ = null;
                SingleFieldBuilderV3<UpdateSettingsNotification, UpdateSettingsNotification.Builder, UpdateSettingsNotificationOrBuilder> singleFieldBuilderV3 = this.updateSettingsNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.updateSettingsNotificationBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.LiveTrackServiceOrBuilder
            public ConsentChangedNotification getConsentChangedNotification() {
                SingleFieldBuilderV3<ConsentChangedNotification, ConsentChangedNotification.Builder, ConsentChangedNotificationOrBuilder> singleFieldBuilderV3 = this.consentChangedNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ConsentChangedNotification) singleFieldBuilderV3.getMessage();
                }
                ConsentChangedNotification consentChangedNotification = this.consentChangedNotification_;
                return consentChangedNotification == null ? ConsentChangedNotification.getDefaultInstance() : consentChangedNotification;
            }

            public ConsentChangedNotification.Builder getConsentChangedNotificationBuilder() {
                this.bitField0_ |= 128;
                onChanged();
                return (ConsentChangedNotification.Builder) getConsentChangedNotificationFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.LiveTrackServiceOrBuilder
            public ConsentChangedNotificationOrBuilder getConsentChangedNotificationOrBuilder() {
                SingleFieldBuilderV3<ConsentChangedNotification, ConsentChangedNotification.Builder, ConsentChangedNotificationOrBuilder> singleFieldBuilderV3 = this.consentChangedNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ConsentChangedNotificationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                ConsentChangedNotification consentChangedNotification = this.consentChangedNotification_;
                return consentChangedNotification == null ? ConsentChangedNotification.getDefaultInstance() : consentChangedNotification;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.LiveTrackServiceOrBuilder
            public ConsentNotification getConsentNotification() {
                SingleFieldBuilderV3<ConsentNotification, ConsentNotification.Builder, ConsentNotificationOrBuilder> singleFieldBuilderV3 = this.consentNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ConsentNotification) singleFieldBuilderV3.getMessage();
                }
                ConsentNotification consentNotification = this.consentNotification_;
                return consentNotification == null ? ConsentNotification.getDefaultInstance() : consentNotification;
            }

            public ConsentNotification.Builder getConsentNotificationBuilder() {
                this.bitField0_ |= 8192;
                onChanged();
                return (ConsentNotification.Builder) getConsentNotificationFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.LiveTrackServiceOrBuilder
            public ConsentNotificationOrBuilder getConsentNotificationOrBuilder() {
                SingleFieldBuilderV3<ConsentNotification, ConsentNotification.Builder, ConsentNotificationOrBuilder> singleFieldBuilderV3 = this.consentNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ConsentNotificationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                ConsentNotification consentNotification = this.consentNotification_;
                return consentNotification == null ? ConsentNotification.getDefaultInstance() : consentNotification;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDILiveTrackProto.internal_static_GDI_Proto_LiveTrack_LiveTrackService_descriptor;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.LiveTrackServiceOrBuilder
            public EmergencyCountdownNotification getEmergencyCountdownNotification() {
                SingleFieldBuilderV3<EmergencyCountdownNotification, EmergencyCountdownNotification.Builder, EmergencyCountdownNotificationOrBuilder> singleFieldBuilderV3 = this.emergencyCountdownNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (EmergencyCountdownNotification) singleFieldBuilderV3.getMessage();
                }
                EmergencyCountdownNotification emergencyCountdownNotification = this.emergencyCountdownNotification_;
                return emergencyCountdownNotification == null ? EmergencyCountdownNotification.getDefaultInstance() : emergencyCountdownNotification;
            }

            public EmergencyCountdownNotification.Builder getEmergencyCountdownNotificationBuilder() {
                this.bitField0_ |= 4096;
                onChanged();
                return (EmergencyCountdownNotification.Builder) getEmergencyCountdownNotificationFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.LiveTrackServiceOrBuilder
            public EmergencyCountdownNotificationOrBuilder getEmergencyCountdownNotificationOrBuilder() {
                SingleFieldBuilderV3<EmergencyCountdownNotification, EmergencyCountdownNotification.Builder, EmergencyCountdownNotificationOrBuilder> singleFieldBuilderV3 = this.emergencyCountdownNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (EmergencyCountdownNotificationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                EmergencyCountdownNotification emergencyCountdownNotification = this.emergencyCountdownNotification_;
                return emergencyCountdownNotification == null ? EmergencyCountdownNotification.getDefaultInstance() : emergencyCountdownNotification;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.LiveTrackServiceOrBuilder
            public GroupRideNotification getGroupRideNotification() {
                SingleFieldBuilderV3<GroupRideNotification, GroupRideNotification.Builder, GroupRideNotificationOrBuilder> singleFieldBuilderV3 = this.groupRideNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GroupRideNotification) singleFieldBuilderV3.getMessage();
                }
                GroupRideNotification groupRideNotification = this.groupRideNotification_;
                return groupRideNotification == null ? GroupRideNotification.getDefaultInstance() : groupRideNotification;
            }

            public GroupRideNotification.Builder getGroupRideNotificationBuilder() {
                this.bitField0_ |= 16384;
                onChanged();
                return (GroupRideNotification.Builder) getGroupRideNotificationFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.LiveTrackServiceOrBuilder
            public GroupRideNotificationOrBuilder getGroupRideNotificationOrBuilder() {
                SingleFieldBuilderV3<GroupRideNotification, GroupRideNotification.Builder, GroupRideNotificationOrBuilder> singleFieldBuilderV3 = this.groupRideNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GroupRideNotificationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                GroupRideNotification groupRideNotification = this.groupRideNotification_;
                return groupRideNotification == null ? GroupRideNotification.getDefaultInstance() : groupRideNotification;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.LiveTrackServiceOrBuilder
            public LiveEventSharingNotification getLiveEventSharingNotification() {
                SingleFieldBuilderV3<LiveEventSharingNotification, LiveEventSharingNotification.Builder, LiveEventSharingNotificationOrBuilder> singleFieldBuilderV3 = this.liveEventSharingNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (LiveEventSharingNotification) singleFieldBuilderV3.getMessage();
                }
                LiveEventSharingNotification liveEventSharingNotification = this.liveEventSharingNotification_;
                return liveEventSharingNotification == null ? LiveEventSharingNotification.getDefaultInstance() : liveEventSharingNotification;
            }

            public LiveEventSharingNotification.Builder getLiveEventSharingNotificationBuilder() {
                this.bitField0_ |= 256;
                onChanged();
                return (LiveEventSharingNotification.Builder) getLiveEventSharingNotificationFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.LiveTrackServiceOrBuilder
            public LiveEventSharingNotificationOrBuilder getLiveEventSharingNotificationOrBuilder() {
                SingleFieldBuilderV3<LiveEventSharingNotification, LiveEventSharingNotification.Builder, LiveEventSharingNotificationOrBuilder> singleFieldBuilderV3 = this.liveEventSharingNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (LiveEventSharingNotificationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                LiveEventSharingNotification liveEventSharingNotification = this.liveEventSharingNotification_;
                return liveEventSharingNotification == null ? LiveEventSharingNotification.getDefaultInstance() : liveEventSharingNotification;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.LiveTrackServiceOrBuilder
            public SessionSupportRequest getSessionSupportRequest() {
                SingleFieldBuilderV3<SessionSupportRequest, SessionSupportRequest.Builder, SessionSupportRequestOrBuilder> singleFieldBuilderV3 = this.sessionSupportRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SessionSupportRequest) singleFieldBuilderV3.getMessage();
                }
                SessionSupportRequest sessionSupportRequest = this.sessionSupportRequest_;
                return sessionSupportRequest == null ? SessionSupportRequest.getDefaultInstance() : sessionSupportRequest;
            }

            public SessionSupportRequest.Builder getSessionSupportRequestBuilder() {
                this.bitField0_ |= 512;
                onChanged();
                return (SessionSupportRequest.Builder) getSessionSupportRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.LiveTrackServiceOrBuilder
            public SessionSupportRequestOrBuilder getSessionSupportRequestOrBuilder() {
                SingleFieldBuilderV3<SessionSupportRequest, SessionSupportRequest.Builder, SessionSupportRequestOrBuilder> singleFieldBuilderV3 = this.sessionSupportRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SessionSupportRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                SessionSupportRequest sessionSupportRequest = this.sessionSupportRequest_;
                return sessionSupportRequest == null ? SessionSupportRequest.getDefaultInstance() : sessionSupportRequest;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.LiveTrackServiceOrBuilder
            public SessionSupportResponse getSessionSupportResponse() {
                SingleFieldBuilderV3<SessionSupportResponse, SessionSupportResponse.Builder, SessionSupportResponseOrBuilder> singleFieldBuilderV3 = this.sessionSupportResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SessionSupportResponse) singleFieldBuilderV3.getMessage();
                }
                SessionSupportResponse sessionSupportResponse = this.sessionSupportResponse_;
                return sessionSupportResponse == null ? SessionSupportResponse.getDefaultInstance() : sessionSupportResponse;
            }

            public SessionSupportResponse.Builder getSessionSupportResponseBuilder() {
                this.bitField0_ |= 1024;
                onChanged();
                return (SessionSupportResponse.Builder) getSessionSupportResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.LiveTrackServiceOrBuilder
            public SessionSupportResponseOrBuilder getSessionSupportResponseOrBuilder() {
                SingleFieldBuilderV3<SessionSupportResponse, SessionSupportResponse.Builder, SessionSupportResponseOrBuilder> singleFieldBuilderV3 = this.sessionSupportResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SessionSupportResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                SessionSupportResponse sessionSupportResponse = this.sessionSupportResponse_;
                return sessionSupportResponse == null ? SessionSupportResponse.getDefaultInstance() : sessionSupportResponse;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.LiveTrackServiceOrBuilder
            public ShareDeviceSettingNotification getShareDeviceSettingNotification() {
                SingleFieldBuilderV3<ShareDeviceSettingNotification, ShareDeviceSettingNotification.Builder, ShareDeviceSettingNotificationOrBuilder> singleFieldBuilderV3 = this.shareDeviceSettingNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ShareDeviceSettingNotification) singleFieldBuilderV3.getMessage();
                }
                ShareDeviceSettingNotification shareDeviceSettingNotification = this.shareDeviceSettingNotification_;
                return shareDeviceSettingNotification == null ? ShareDeviceSettingNotification.getDefaultInstance() : shareDeviceSettingNotification;
            }

            public ShareDeviceSettingNotification.Builder getShareDeviceSettingNotificationBuilder() {
                this.bitField0_ |= 32;
                onChanged();
                return (ShareDeviceSettingNotification.Builder) getShareDeviceSettingNotificationFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.LiveTrackServiceOrBuilder
            public ShareDeviceSettingNotificationOrBuilder getShareDeviceSettingNotificationOrBuilder() {
                SingleFieldBuilderV3<ShareDeviceSettingNotification, ShareDeviceSettingNotification.Builder, ShareDeviceSettingNotificationOrBuilder> singleFieldBuilderV3 = this.shareDeviceSettingNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ShareDeviceSettingNotificationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                ShareDeviceSettingNotification shareDeviceSettingNotification = this.shareDeviceSettingNotification_;
                return shareDeviceSettingNotification == null ? ShareDeviceSettingNotification.getDefaultInstance() : shareDeviceSettingNotification;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.LiveTrackServiceOrBuilder
            public ShareMetaConfigurationNotification getShareMetaConfigNotification() {
                SingleFieldBuilderV3<ShareMetaConfigurationNotification, ShareMetaConfigurationNotification.Builder, ShareMetaConfigurationNotificationOrBuilder> singleFieldBuilderV3 = this.shareMetaConfigNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ShareMetaConfigurationNotification) singleFieldBuilderV3.getMessage();
                }
                ShareMetaConfigurationNotification shareMetaConfigurationNotification = this.shareMetaConfigNotification_;
                return shareMetaConfigurationNotification == null ? ShareMetaConfigurationNotification.getDefaultInstance() : shareMetaConfigurationNotification;
            }

            public ShareMetaConfigurationNotification.Builder getShareMetaConfigNotificationBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (ShareMetaConfigurationNotification.Builder) getShareMetaConfigNotificationFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.LiveTrackServiceOrBuilder
            public ShareMetaConfigurationNotificationOrBuilder getShareMetaConfigNotificationOrBuilder() {
                SingleFieldBuilderV3<ShareMetaConfigurationNotification, ShareMetaConfigurationNotification.Builder, ShareMetaConfigurationNotificationOrBuilder> singleFieldBuilderV3 = this.shareMetaConfigNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ShareMetaConfigurationNotificationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                ShareMetaConfigurationNotification shareMetaConfigurationNotification = this.shareMetaConfigNotification_;
                return shareMetaConfigurationNotification == null ? ShareMetaConfigurationNotification.getDefaultInstance() : shareMetaConfigurationNotification;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.LiveTrackServiceOrBuilder
            public ShareSocialCredentialsNotification getShareSocialNotification() {
                SingleFieldBuilderV3<ShareSocialCredentialsNotification, ShareSocialCredentialsNotification.Builder, ShareSocialCredentialsNotificationOrBuilder> singleFieldBuilderV3 = this.shareSocialNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ShareSocialCredentialsNotification) singleFieldBuilderV3.getMessage();
                }
                ShareSocialCredentialsNotification shareSocialCredentialsNotification = this.shareSocialNotification_;
                return shareSocialCredentialsNotification == null ? ShareSocialCredentialsNotification.getDefaultInstance() : shareSocialCredentialsNotification;
            }

            public ShareSocialCredentialsNotification.Builder getShareSocialNotificationBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (ShareSocialCredentialsNotification.Builder) getShareSocialNotificationFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.LiveTrackServiceOrBuilder
            public ShareSocialCredentialsNotificationOrBuilder getShareSocialNotificationOrBuilder() {
                SingleFieldBuilderV3<ShareSocialCredentialsNotification, ShareSocialCredentialsNotification.Builder, ShareSocialCredentialsNotificationOrBuilder> singleFieldBuilderV3 = this.shareSocialNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ShareSocialCredentialsNotificationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                ShareSocialCredentialsNotification shareSocialCredentialsNotification = this.shareSocialNotification_;
                return shareSocialCredentialsNotification == null ? ShareSocialCredentialsNotification.getDefaultInstance() : shareSocialCredentialsNotification;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.LiveTrackServiceOrBuilder
            public StartRequest getStartRequest() {
                SingleFieldBuilderV3<StartRequest, StartRequest.Builder, StartRequestOrBuilder> singleFieldBuilderV3 = this.startRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (StartRequest) singleFieldBuilderV3.getMessage();
                }
                StartRequest startRequest = this.startRequest_;
                return startRequest == null ? StartRequest.getDefaultInstance() : startRequest;
            }

            public StartRequest.Builder getStartRequestBuilder() {
                this.bitField0_ |= 4;
                onChanged();
                return (StartRequest.Builder) getStartRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.LiveTrackServiceOrBuilder
            public StartRequestOrBuilder getStartRequestOrBuilder() {
                SingleFieldBuilderV3<StartRequest, StartRequest.Builder, StartRequestOrBuilder> singleFieldBuilderV3 = this.startRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (StartRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                StartRequest startRequest = this.startRequest_;
                return startRequest == null ? StartRequest.getDefaultInstance() : startRequest;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.LiveTrackServiceOrBuilder
            public StartResponse getStartResponse() {
                SingleFieldBuilderV3<StartResponse, StartResponse.Builder, StartResponseOrBuilder> singleFieldBuilderV3 = this.startResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (StartResponse) singleFieldBuilderV3.getMessage();
                }
                StartResponse startResponse = this.startResponse_;
                return startResponse == null ? StartResponse.getDefaultInstance() : startResponse;
            }

            public StartResponse.Builder getStartResponseBuilder() {
                this.bitField0_ |= 8;
                onChanged();
                return (StartResponse.Builder) getStartResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.LiveTrackServiceOrBuilder
            public StartResponseOrBuilder getStartResponseOrBuilder() {
                SingleFieldBuilderV3<StartResponse, StartResponse.Builder, StartResponseOrBuilder> singleFieldBuilderV3 = this.startResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (StartResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                StartResponse startResponse = this.startResponse_;
                return startResponse == null ? StartResponse.getDefaultInstance() : startResponse;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.LiveTrackServiceOrBuilder
            public StatusNotification getStatusNotification() {
                SingleFieldBuilderV3<StatusNotification, StatusNotification.Builder, StatusNotificationOrBuilder> singleFieldBuilderV3 = this.statusNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (StatusNotification) singleFieldBuilderV3.getMessage();
                }
                StatusNotification statusNotification = this.statusNotification_;
                return statusNotification == null ? StatusNotification.getDefaultInstance() : statusNotification;
            }

            public StatusNotification.Builder getStatusNotificationBuilder() {
                this.bitField0_ |= 64;
                onChanged();
                return (StatusNotification.Builder) getStatusNotificationFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.LiveTrackServiceOrBuilder
            public StatusNotificationOrBuilder getStatusNotificationOrBuilder() {
                SingleFieldBuilderV3<StatusNotification, StatusNotification.Builder, StatusNotificationOrBuilder> singleFieldBuilderV3 = this.statusNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (StatusNotificationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                StatusNotification statusNotification = this.statusNotification_;
                return statusNotification == null ? StatusNotification.getDefaultInstance() : statusNotification;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.LiveTrackServiceOrBuilder
            public StopNotification getStopNotification() {
                SingleFieldBuilderV3<StopNotification, StopNotification.Builder, StopNotificationOrBuilder> singleFieldBuilderV3 = this.stopNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (StopNotification) singleFieldBuilderV3.getMessage();
                }
                StopNotification stopNotification = this.stopNotification_;
                return stopNotification == null ? StopNotification.getDefaultInstance() : stopNotification;
            }

            public StopNotification.Builder getStopNotificationBuilder() {
                this.bitField0_ |= 16;
                onChanged();
                return (StopNotification.Builder) getStopNotificationFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.LiveTrackServiceOrBuilder
            public StopNotificationOrBuilder getStopNotificationOrBuilder() {
                SingleFieldBuilderV3<StopNotification, StopNotification.Builder, StopNotificationOrBuilder> singleFieldBuilderV3 = this.stopNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (StopNotificationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                StopNotification stopNotification = this.stopNotification_;
                return stopNotification == null ? StopNotification.getDefaultInstance() : stopNotification;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.LiveTrackServiceOrBuilder
            public UpdateSettingsNotification getUpdateSettingsNotification() {
                SingleFieldBuilderV3<UpdateSettingsNotification, UpdateSettingsNotification.Builder, UpdateSettingsNotificationOrBuilder> singleFieldBuilderV3 = this.updateSettingsNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (UpdateSettingsNotification) singleFieldBuilderV3.getMessage();
                }
                UpdateSettingsNotification updateSettingsNotification = this.updateSettingsNotification_;
                return updateSettingsNotification == null ? UpdateSettingsNotification.getDefaultInstance() : updateSettingsNotification;
            }

            public UpdateSettingsNotification.Builder getUpdateSettingsNotificationBuilder() {
                this.bitField0_ |= 2048;
                onChanged();
                return (UpdateSettingsNotification.Builder) getUpdateSettingsNotificationFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.LiveTrackServiceOrBuilder
            public UpdateSettingsNotificationOrBuilder getUpdateSettingsNotificationOrBuilder() {
                SingleFieldBuilderV3<UpdateSettingsNotification, UpdateSettingsNotification.Builder, UpdateSettingsNotificationOrBuilder> singleFieldBuilderV3 = this.updateSettingsNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (UpdateSettingsNotificationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                UpdateSettingsNotification updateSettingsNotification = this.updateSettingsNotification_;
                return updateSettingsNotification == null ? UpdateSettingsNotification.getDefaultInstance() : updateSettingsNotification;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.LiveTrackServiceOrBuilder
            public boolean hasConsentChangedNotification() {
                return (this.bitField0_ & 128) != 0;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.LiveTrackServiceOrBuilder
            public boolean hasConsentNotification() {
                return (this.bitField0_ & 8192) != 0;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.LiveTrackServiceOrBuilder
            public boolean hasEmergencyCountdownNotification() {
                return (this.bitField0_ & 4096) != 0;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.LiveTrackServiceOrBuilder
            public boolean hasGroupRideNotification() {
                return (this.bitField0_ & 16384) != 0;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.LiveTrackServiceOrBuilder
            public boolean hasLiveEventSharingNotification() {
                return (this.bitField0_ & 256) != 0;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.LiveTrackServiceOrBuilder
            public boolean hasSessionSupportRequest() {
                return (this.bitField0_ & 512) != 0;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.LiveTrackServiceOrBuilder
            public boolean hasSessionSupportResponse() {
                return (this.bitField0_ & 1024) != 0;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.LiveTrackServiceOrBuilder
            public boolean hasShareDeviceSettingNotification() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.LiveTrackServiceOrBuilder
            public boolean hasShareMetaConfigNotification() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.LiveTrackServiceOrBuilder
            public boolean hasShareSocialNotification() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.LiveTrackServiceOrBuilder
            public boolean hasStartRequest() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.LiveTrackServiceOrBuilder
            public boolean hasStartResponse() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.LiveTrackServiceOrBuilder
            public boolean hasStatusNotification() {
                return (this.bitField0_ & 64) != 0;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.LiveTrackServiceOrBuilder
            public boolean hasStopNotification() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.LiveTrackServiceOrBuilder
            public boolean hasUpdateSettingsNotification() {
                return (this.bitField0_ & 2048) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDILiveTrackProto.internal_static_GDI_Proto_LiveTrack_LiveTrackService_fieldAccessorTable.ensureFieldAccessorsInitialized(LiveTrackService.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (hasShareSocialNotification() && !getShareSocialNotification().isInitialized()) {
                    return false;
                }
                if (hasStartRequest() && !getStartRequest().isInitialized()) {
                    return false;
                }
                if (!hasStartResponse() || getStartResponse().isInitialized()) {
                    return !hasStatusNotification() || getStatusNotification().isInitialized();
                }
                return false;
            }

            public Builder mergeConsentChangedNotification(ConsentChangedNotification consentChangedNotification) {
                ConsentChangedNotification consentChangedNotification2;
                SingleFieldBuilderV3<ConsentChangedNotification, ConsentChangedNotification.Builder, ConsentChangedNotificationOrBuilder> singleFieldBuilderV3 = this.consentChangedNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(consentChangedNotification);
                } else if ((this.bitField0_ & 128) == 0 || (consentChangedNotification2 = this.consentChangedNotification_) == null || consentChangedNotification2 == ConsentChangedNotification.getDefaultInstance()) {
                    this.consentChangedNotification_ = consentChangedNotification;
                } else {
                    getConsentChangedNotificationBuilder().mergeFrom(consentChangedNotification);
                }
                if (this.consentChangedNotification_ != null) {
                    this.bitField0_ |= 128;
                    onChanged();
                }
                return this;
            }

            public Builder mergeConsentNotification(ConsentNotification consentNotification) {
                ConsentNotification consentNotification2;
                SingleFieldBuilderV3<ConsentNotification, ConsentNotification.Builder, ConsentNotificationOrBuilder> singleFieldBuilderV3 = this.consentNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(consentNotification);
                } else if ((this.bitField0_ & 8192) == 0 || (consentNotification2 = this.consentNotification_) == null || consentNotification2 == ConsentNotification.getDefaultInstance()) {
                    this.consentNotification_ = consentNotification;
                } else {
                    getConsentNotificationBuilder().mergeFrom(consentNotification);
                }
                if (this.consentNotification_ != null) {
                    this.bitField0_ |= 8192;
                    onChanged();
                }
                return this;
            }

            public Builder mergeEmergencyCountdownNotification(EmergencyCountdownNotification emergencyCountdownNotification) {
                EmergencyCountdownNotification emergencyCountdownNotification2;
                SingleFieldBuilderV3<EmergencyCountdownNotification, EmergencyCountdownNotification.Builder, EmergencyCountdownNotificationOrBuilder> singleFieldBuilderV3 = this.emergencyCountdownNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(emergencyCountdownNotification);
                } else if ((this.bitField0_ & 4096) == 0 || (emergencyCountdownNotification2 = this.emergencyCountdownNotification_) == null || emergencyCountdownNotification2 == EmergencyCountdownNotification.getDefaultInstance()) {
                    this.emergencyCountdownNotification_ = emergencyCountdownNotification;
                } else {
                    getEmergencyCountdownNotificationBuilder().mergeFrom(emergencyCountdownNotification);
                }
                if (this.emergencyCountdownNotification_ != null) {
                    this.bitField0_ |= 4096;
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
                                    codedInputStream.readMessage(getShareMetaConfigNotificationFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1;
                                    continue;
                                case 18:
                                    codedInputStream.readMessage(getShareSocialNotificationFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 2;
                                    continue;
                                case 26:
                                    codedInputStream.readMessage(getStartRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 4;
                                    continue;
                                case 34:
                                    codedInputStream.readMessage(getStartResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 8;
                                    continue;
                                case 42:
                                    codedInputStream.readMessage(getStopNotificationFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 16;
                                    continue;
                                case 50:
                                    codedInputStream.readMessage(getShareDeviceSettingNotificationFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 32;
                                    continue;
                                case 58:
                                    codedInputStream.readMessage(getStatusNotificationFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 64;
                                    continue;
                                case 66:
                                    codedInputStream.readMessage(getConsentChangedNotificationFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 128;
                                    continue;
                                case 74:
                                    codedInputStream.readMessage(getLiveEventSharingNotificationFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 256;
                                    continue;
                                case 82:
                                    codedInputStream.readMessage(getSessionSupportRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 512;
                                    continue;
                                case 90:
                                    codedInputStream.readMessage(getSessionSupportResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1024;
                                    continue;
                                case 98:
                                    codedInputStream.readMessage(getUpdateSettingsNotificationFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 2048;
                                    continue;
                                case 106:
                                    codedInputStream.readMessage(getEmergencyCountdownNotificationFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 4096;
                                    continue;
                                case 114:
                                    codedInputStream.readMessage(getConsentNotificationFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 8192;
                                    continue;
                                case 122:
                                    codedInputStream.readMessage(getGroupRideNotificationFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder mergeGroupRideNotification(GroupRideNotification groupRideNotification) {
                GroupRideNotification groupRideNotification2;
                SingleFieldBuilderV3<GroupRideNotification, GroupRideNotification.Builder, GroupRideNotificationOrBuilder> singleFieldBuilderV3 = this.groupRideNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(groupRideNotification);
                } else if ((this.bitField0_ & 16384) == 0 || (groupRideNotification2 = this.groupRideNotification_) == null || groupRideNotification2 == GroupRideNotification.getDefaultInstance()) {
                    this.groupRideNotification_ = groupRideNotification;
                } else {
                    getGroupRideNotificationBuilder().mergeFrom(groupRideNotification);
                }
                if (this.groupRideNotification_ != null) {
                    this.bitField0_ |= 16384;
                    onChanged();
                }
                return this;
            }

            public Builder mergeLiveEventSharingNotification(LiveEventSharingNotification liveEventSharingNotification) {
                LiveEventSharingNotification liveEventSharingNotification2;
                SingleFieldBuilderV3<LiveEventSharingNotification, LiveEventSharingNotification.Builder, LiveEventSharingNotificationOrBuilder> singleFieldBuilderV3 = this.liveEventSharingNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(liveEventSharingNotification);
                } else if ((this.bitField0_ & 256) == 0 || (liveEventSharingNotification2 = this.liveEventSharingNotification_) == null || liveEventSharingNotification2 == LiveEventSharingNotification.getDefaultInstance()) {
                    this.liveEventSharingNotification_ = liveEventSharingNotification;
                } else {
                    getLiveEventSharingNotificationBuilder().mergeFrom(liveEventSharingNotification);
                }
                if (this.liveEventSharingNotification_ != null) {
                    this.bitField0_ |= 256;
                    onChanged();
                }
                return this;
            }

            public Builder mergeSessionSupportRequest(SessionSupportRequest sessionSupportRequest) {
                SessionSupportRequest sessionSupportRequest2;
                SingleFieldBuilderV3<SessionSupportRequest, SessionSupportRequest.Builder, SessionSupportRequestOrBuilder> singleFieldBuilderV3 = this.sessionSupportRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(sessionSupportRequest);
                } else if ((this.bitField0_ & 512) == 0 || (sessionSupportRequest2 = this.sessionSupportRequest_) == null || sessionSupportRequest2 == SessionSupportRequest.getDefaultInstance()) {
                    this.sessionSupportRequest_ = sessionSupportRequest;
                } else {
                    getSessionSupportRequestBuilder().mergeFrom(sessionSupportRequest);
                }
                if (this.sessionSupportRequest_ != null) {
                    this.bitField0_ |= 512;
                    onChanged();
                }
                return this;
            }

            public Builder mergeSessionSupportResponse(SessionSupportResponse sessionSupportResponse) {
                SessionSupportResponse sessionSupportResponse2;
                SingleFieldBuilderV3<SessionSupportResponse, SessionSupportResponse.Builder, SessionSupportResponseOrBuilder> singleFieldBuilderV3 = this.sessionSupportResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(sessionSupportResponse);
                } else if ((this.bitField0_ & 1024) == 0 || (sessionSupportResponse2 = this.sessionSupportResponse_) == null || sessionSupportResponse2 == SessionSupportResponse.getDefaultInstance()) {
                    this.sessionSupportResponse_ = sessionSupportResponse;
                } else {
                    getSessionSupportResponseBuilder().mergeFrom(sessionSupportResponse);
                }
                if (this.sessionSupportResponse_ != null) {
                    this.bitField0_ |= 1024;
                    onChanged();
                }
                return this;
            }

            public Builder mergeShareDeviceSettingNotification(ShareDeviceSettingNotification shareDeviceSettingNotification) {
                ShareDeviceSettingNotification shareDeviceSettingNotification2;
                SingleFieldBuilderV3<ShareDeviceSettingNotification, ShareDeviceSettingNotification.Builder, ShareDeviceSettingNotificationOrBuilder> singleFieldBuilderV3 = this.shareDeviceSettingNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(shareDeviceSettingNotification);
                } else if ((this.bitField0_ & 32) == 0 || (shareDeviceSettingNotification2 = this.shareDeviceSettingNotification_) == null || shareDeviceSettingNotification2 == ShareDeviceSettingNotification.getDefaultInstance()) {
                    this.shareDeviceSettingNotification_ = shareDeviceSettingNotification;
                } else {
                    getShareDeviceSettingNotificationBuilder().mergeFrom(shareDeviceSettingNotification);
                }
                if (this.shareDeviceSettingNotification_ != null) {
                    this.bitField0_ |= 32;
                    onChanged();
                }
                return this;
            }

            public Builder mergeShareMetaConfigNotification(ShareMetaConfigurationNotification shareMetaConfigurationNotification) {
                ShareMetaConfigurationNotification shareMetaConfigurationNotification2;
                SingleFieldBuilderV3<ShareMetaConfigurationNotification, ShareMetaConfigurationNotification.Builder, ShareMetaConfigurationNotificationOrBuilder> singleFieldBuilderV3 = this.shareMetaConfigNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(shareMetaConfigurationNotification);
                } else if ((this.bitField0_ & 1) == 0 || (shareMetaConfigurationNotification2 = this.shareMetaConfigNotification_) == null || shareMetaConfigurationNotification2 == ShareMetaConfigurationNotification.getDefaultInstance()) {
                    this.shareMetaConfigNotification_ = shareMetaConfigurationNotification;
                } else {
                    getShareMetaConfigNotificationBuilder().mergeFrom(shareMetaConfigurationNotification);
                }
                if (this.shareMetaConfigNotification_ != null) {
                    this.bitField0_ |= 1;
                    onChanged();
                }
                return this;
            }

            public Builder mergeShareSocialNotification(ShareSocialCredentialsNotification shareSocialCredentialsNotification) {
                ShareSocialCredentialsNotification shareSocialCredentialsNotification2;
                SingleFieldBuilderV3<ShareSocialCredentialsNotification, ShareSocialCredentialsNotification.Builder, ShareSocialCredentialsNotificationOrBuilder> singleFieldBuilderV3 = this.shareSocialNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(shareSocialCredentialsNotification);
                } else if ((this.bitField0_ & 2) == 0 || (shareSocialCredentialsNotification2 = this.shareSocialNotification_) == null || shareSocialCredentialsNotification2 == ShareSocialCredentialsNotification.getDefaultInstance()) {
                    this.shareSocialNotification_ = shareSocialCredentialsNotification;
                } else {
                    getShareSocialNotificationBuilder().mergeFrom(shareSocialCredentialsNotification);
                }
                if (this.shareSocialNotification_ != null) {
                    this.bitField0_ |= 2;
                    onChanged();
                }
                return this;
            }

            public Builder mergeStartRequest(StartRequest startRequest) {
                StartRequest startRequest2;
                SingleFieldBuilderV3<StartRequest, StartRequest.Builder, StartRequestOrBuilder> singleFieldBuilderV3 = this.startRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(startRequest);
                } else if ((this.bitField0_ & 4) == 0 || (startRequest2 = this.startRequest_) == null || startRequest2 == StartRequest.getDefaultInstance()) {
                    this.startRequest_ = startRequest;
                } else {
                    getStartRequestBuilder().mergeFrom(startRequest);
                }
                if (this.startRequest_ != null) {
                    this.bitField0_ |= 4;
                    onChanged();
                }
                return this;
            }

            public Builder mergeStartResponse(StartResponse startResponse) {
                StartResponse startResponse2;
                SingleFieldBuilderV3<StartResponse, StartResponse.Builder, StartResponseOrBuilder> singleFieldBuilderV3 = this.startResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(startResponse);
                } else if ((this.bitField0_ & 8) == 0 || (startResponse2 = this.startResponse_) == null || startResponse2 == StartResponse.getDefaultInstance()) {
                    this.startResponse_ = startResponse;
                } else {
                    getStartResponseBuilder().mergeFrom(startResponse);
                }
                if (this.startResponse_ != null) {
                    this.bitField0_ |= 8;
                    onChanged();
                }
                return this;
            }

            public Builder mergeStatusNotification(StatusNotification statusNotification) {
                StatusNotification statusNotification2;
                SingleFieldBuilderV3<StatusNotification, StatusNotification.Builder, StatusNotificationOrBuilder> singleFieldBuilderV3 = this.statusNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(statusNotification);
                } else if ((this.bitField0_ & 64) == 0 || (statusNotification2 = this.statusNotification_) == null || statusNotification2 == StatusNotification.getDefaultInstance()) {
                    this.statusNotification_ = statusNotification;
                } else {
                    getStatusNotificationBuilder().mergeFrom(statusNotification);
                }
                if (this.statusNotification_ != null) {
                    this.bitField0_ |= 64;
                    onChanged();
                }
                return this;
            }

            public Builder mergeStopNotification(StopNotification stopNotification) {
                StopNotification stopNotification2;
                SingleFieldBuilderV3<StopNotification, StopNotification.Builder, StopNotificationOrBuilder> singleFieldBuilderV3 = this.stopNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(stopNotification);
                } else if ((this.bitField0_ & 16) == 0 || (stopNotification2 = this.stopNotification_) == null || stopNotification2 == StopNotification.getDefaultInstance()) {
                    this.stopNotification_ = stopNotification;
                } else {
                    getStopNotificationBuilder().mergeFrom(stopNotification);
                }
                if (this.stopNotification_ != null) {
                    this.bitField0_ |= 16;
                    onChanged();
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder mergeUpdateSettingsNotification(UpdateSettingsNotification updateSettingsNotification) {
                UpdateSettingsNotification updateSettingsNotification2;
                SingleFieldBuilderV3<UpdateSettingsNotification, UpdateSettingsNotification.Builder, UpdateSettingsNotificationOrBuilder> singleFieldBuilderV3 = this.updateSettingsNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(updateSettingsNotification);
                } else if ((this.bitField0_ & 2048) == 0 || (updateSettingsNotification2 = this.updateSettingsNotification_) == null || updateSettingsNotification2 == UpdateSettingsNotification.getDefaultInstance()) {
                    this.updateSettingsNotification_ = updateSettingsNotification;
                } else {
                    getUpdateSettingsNotificationBuilder().mergeFrom(updateSettingsNotification);
                }
                if (this.updateSettingsNotification_ != null) {
                    this.bitField0_ |= 2048;
                    onChanged();
                }
                return this;
            }

            public Builder setConsentChangedNotification(ConsentChangedNotification.Builder builder) {
                SingleFieldBuilderV3<ConsentChangedNotification, ConsentChangedNotification.Builder, ConsentChangedNotificationOrBuilder> singleFieldBuilderV3 = this.consentChangedNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.consentChangedNotification_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 128;
                onChanged();
                return this;
            }

            public Builder setConsentNotification(ConsentNotification.Builder builder) {
                SingleFieldBuilderV3<ConsentNotification, ConsentNotification.Builder, ConsentNotificationOrBuilder> singleFieldBuilderV3 = this.consentNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.consentNotification_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 8192;
                onChanged();
                return this;
            }

            public Builder setEmergencyCountdownNotification(EmergencyCountdownNotification.Builder builder) {
                SingleFieldBuilderV3<EmergencyCountdownNotification, EmergencyCountdownNotification.Builder, EmergencyCountdownNotificationOrBuilder> singleFieldBuilderV3 = this.emergencyCountdownNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.emergencyCountdownNotification_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 4096;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setGroupRideNotification(GroupRideNotification.Builder builder) {
                SingleFieldBuilderV3<GroupRideNotification, GroupRideNotification.Builder, GroupRideNotificationOrBuilder> singleFieldBuilderV3 = this.groupRideNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.groupRideNotification_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 16384;
                onChanged();
                return this;
            }

            public Builder setLiveEventSharingNotification(LiveEventSharingNotification.Builder builder) {
                SingleFieldBuilderV3<LiveEventSharingNotification, LiveEventSharingNotification.Builder, LiveEventSharingNotificationOrBuilder> singleFieldBuilderV3 = this.liveEventSharingNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.liveEventSharingNotification_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 256;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setSessionSupportRequest(SessionSupportRequest.Builder builder) {
                SingleFieldBuilderV3<SessionSupportRequest, SessionSupportRequest.Builder, SessionSupportRequestOrBuilder> singleFieldBuilderV3 = this.sessionSupportRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.sessionSupportRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 512;
                onChanged();
                return this;
            }

            public Builder setSessionSupportResponse(SessionSupportResponse.Builder builder) {
                SingleFieldBuilderV3<SessionSupportResponse, SessionSupportResponse.Builder, SessionSupportResponseOrBuilder> singleFieldBuilderV3 = this.sessionSupportResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.sessionSupportResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 1024;
                onChanged();
                return this;
            }

            public Builder setShareDeviceSettingNotification(ShareDeviceSettingNotification.Builder builder) {
                SingleFieldBuilderV3<ShareDeviceSettingNotification, ShareDeviceSettingNotification.Builder, ShareDeviceSettingNotificationOrBuilder> singleFieldBuilderV3 = this.shareDeviceSettingNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.shareDeviceSettingNotification_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setShareMetaConfigNotification(ShareMetaConfigurationNotification.Builder builder) {
                SingleFieldBuilderV3<ShareMetaConfigurationNotification, ShareMetaConfigurationNotification.Builder, ShareMetaConfigurationNotificationOrBuilder> singleFieldBuilderV3 = this.shareMetaConfigNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.shareMetaConfigNotification_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setShareSocialNotification(ShareSocialCredentialsNotification.Builder builder) {
                SingleFieldBuilderV3<ShareSocialCredentialsNotification, ShareSocialCredentialsNotification.Builder, ShareSocialCredentialsNotificationOrBuilder> singleFieldBuilderV3 = this.shareSocialNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.shareSocialNotification_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setStartRequest(StartRequest.Builder builder) {
                SingleFieldBuilderV3<StartRequest, StartRequest.Builder, StartRequestOrBuilder> singleFieldBuilderV3 = this.startRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.startRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setStartResponse(StartResponse.Builder builder) {
                SingleFieldBuilderV3<StartResponse, StartResponse.Builder, StartResponseOrBuilder> singleFieldBuilderV3 = this.startResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.startResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setStatusNotification(StatusNotification.Builder builder) {
                SingleFieldBuilderV3<StatusNotification, StatusNotification.Builder, StatusNotificationOrBuilder> singleFieldBuilderV3 = this.statusNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.statusNotification_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setStopNotification(StopNotification.Builder builder) {
                SingleFieldBuilderV3<StopNotification, StopNotification.Builder, StopNotificationOrBuilder> singleFieldBuilderV3 = this.stopNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.stopNotification_ = builder.build();
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

            public Builder setUpdateSettingsNotification(UpdateSettingsNotification.Builder builder) {
                SingleFieldBuilderV3<UpdateSettingsNotification, UpdateSettingsNotification.Builder, UpdateSettingsNotificationOrBuilder> singleFieldBuilderV3 = this.updateSettingsNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.updateSettingsNotification_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 2048;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public LiveTrackService getDefaultInstanceForType() {
                return LiveTrackService.getDefaultInstance();
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

            public Builder setConsentChangedNotification(ConsentChangedNotification consentChangedNotification) {
                SingleFieldBuilderV3<ConsentChangedNotification, ConsentChangedNotification.Builder, ConsentChangedNotificationOrBuilder> singleFieldBuilderV3 = this.consentChangedNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    consentChangedNotification.getClass();
                    this.consentChangedNotification_ = consentChangedNotification;
                } else {
                    singleFieldBuilderV3.setMessage(consentChangedNotification);
                }
                this.bitField0_ |= 128;
                onChanged();
                return this;
            }

            public Builder setConsentNotification(ConsentNotification consentNotification) {
                SingleFieldBuilderV3<ConsentNotification, ConsentNotification.Builder, ConsentNotificationOrBuilder> singleFieldBuilderV3 = this.consentNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    consentNotification.getClass();
                    this.consentNotification_ = consentNotification;
                } else {
                    singleFieldBuilderV3.setMessage(consentNotification);
                }
                this.bitField0_ |= 8192;
                onChanged();
                return this;
            }

            public Builder setEmergencyCountdownNotification(EmergencyCountdownNotification emergencyCountdownNotification) {
                SingleFieldBuilderV3<EmergencyCountdownNotification, EmergencyCountdownNotification.Builder, EmergencyCountdownNotificationOrBuilder> singleFieldBuilderV3 = this.emergencyCountdownNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    emergencyCountdownNotification.getClass();
                    this.emergencyCountdownNotification_ = emergencyCountdownNotification;
                } else {
                    singleFieldBuilderV3.setMessage(emergencyCountdownNotification);
                }
                this.bitField0_ |= 4096;
                onChanged();
                return this;
            }

            public Builder setGroupRideNotification(GroupRideNotification groupRideNotification) {
                SingleFieldBuilderV3<GroupRideNotification, GroupRideNotification.Builder, GroupRideNotificationOrBuilder> singleFieldBuilderV3 = this.groupRideNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    groupRideNotification.getClass();
                    this.groupRideNotification_ = groupRideNotification;
                } else {
                    singleFieldBuilderV3.setMessage(groupRideNotification);
                }
                this.bitField0_ |= 16384;
                onChanged();
                return this;
            }

            public Builder setLiveEventSharingNotification(LiveEventSharingNotification liveEventSharingNotification) {
                SingleFieldBuilderV3<LiveEventSharingNotification, LiveEventSharingNotification.Builder, LiveEventSharingNotificationOrBuilder> singleFieldBuilderV3 = this.liveEventSharingNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    liveEventSharingNotification.getClass();
                    this.liveEventSharingNotification_ = liveEventSharingNotification;
                } else {
                    singleFieldBuilderV3.setMessage(liveEventSharingNotification);
                }
                this.bitField0_ |= 256;
                onChanged();
                return this;
            }

            public Builder setSessionSupportRequest(SessionSupportRequest sessionSupportRequest) {
                SingleFieldBuilderV3<SessionSupportRequest, SessionSupportRequest.Builder, SessionSupportRequestOrBuilder> singleFieldBuilderV3 = this.sessionSupportRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    sessionSupportRequest.getClass();
                    this.sessionSupportRequest_ = sessionSupportRequest;
                } else {
                    singleFieldBuilderV3.setMessage(sessionSupportRequest);
                }
                this.bitField0_ |= 512;
                onChanged();
                return this;
            }

            public Builder setSessionSupportResponse(SessionSupportResponse sessionSupportResponse) {
                SingleFieldBuilderV3<SessionSupportResponse, SessionSupportResponse.Builder, SessionSupportResponseOrBuilder> singleFieldBuilderV3 = this.sessionSupportResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    sessionSupportResponse.getClass();
                    this.sessionSupportResponse_ = sessionSupportResponse;
                } else {
                    singleFieldBuilderV3.setMessage(sessionSupportResponse);
                }
                this.bitField0_ |= 1024;
                onChanged();
                return this;
            }

            public Builder setShareDeviceSettingNotification(ShareDeviceSettingNotification shareDeviceSettingNotification) {
                SingleFieldBuilderV3<ShareDeviceSettingNotification, ShareDeviceSettingNotification.Builder, ShareDeviceSettingNotificationOrBuilder> singleFieldBuilderV3 = this.shareDeviceSettingNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    shareDeviceSettingNotification.getClass();
                    this.shareDeviceSettingNotification_ = shareDeviceSettingNotification;
                } else {
                    singleFieldBuilderV3.setMessage(shareDeviceSettingNotification);
                }
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setShareMetaConfigNotification(ShareMetaConfigurationNotification shareMetaConfigurationNotification) {
                SingleFieldBuilderV3<ShareMetaConfigurationNotification, ShareMetaConfigurationNotification.Builder, ShareMetaConfigurationNotificationOrBuilder> singleFieldBuilderV3 = this.shareMetaConfigNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    shareMetaConfigurationNotification.getClass();
                    this.shareMetaConfigNotification_ = shareMetaConfigurationNotification;
                } else {
                    singleFieldBuilderV3.setMessage(shareMetaConfigurationNotification);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setShareSocialNotification(ShareSocialCredentialsNotification shareSocialCredentialsNotification) {
                SingleFieldBuilderV3<ShareSocialCredentialsNotification, ShareSocialCredentialsNotification.Builder, ShareSocialCredentialsNotificationOrBuilder> singleFieldBuilderV3 = this.shareSocialNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    shareSocialCredentialsNotification.getClass();
                    this.shareSocialNotification_ = shareSocialCredentialsNotification;
                } else {
                    singleFieldBuilderV3.setMessage(shareSocialCredentialsNotification);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setStartRequest(StartRequest startRequest) {
                SingleFieldBuilderV3<StartRequest, StartRequest.Builder, StartRequestOrBuilder> singleFieldBuilderV3 = this.startRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    startRequest.getClass();
                    this.startRequest_ = startRequest;
                } else {
                    singleFieldBuilderV3.setMessage(startRequest);
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setStartResponse(StartResponse startResponse) {
                SingleFieldBuilderV3<StartResponse, StartResponse.Builder, StartResponseOrBuilder> singleFieldBuilderV3 = this.startResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    startResponse.getClass();
                    this.startResponse_ = startResponse;
                } else {
                    singleFieldBuilderV3.setMessage(startResponse);
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setStatusNotification(StatusNotification statusNotification) {
                SingleFieldBuilderV3<StatusNotification, StatusNotification.Builder, StatusNotificationOrBuilder> singleFieldBuilderV3 = this.statusNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    statusNotification.getClass();
                    this.statusNotification_ = statusNotification;
                } else {
                    singleFieldBuilderV3.setMessage(statusNotification);
                }
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setStopNotification(StopNotification stopNotification) {
                SingleFieldBuilderV3<StopNotification, StopNotification.Builder, StopNotificationOrBuilder> singleFieldBuilderV3 = this.stopNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    stopNotification.getClass();
                    this.stopNotification_ = stopNotification;
                } else {
                    singleFieldBuilderV3.setMessage(stopNotification);
                }
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setUpdateSettingsNotification(UpdateSettingsNotification updateSettingsNotification) {
                SingleFieldBuilderV3<UpdateSettingsNotification, UpdateSettingsNotification.Builder, UpdateSettingsNotificationOrBuilder> singleFieldBuilderV3 = this.updateSettingsNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    updateSettingsNotification.getClass();
                    this.updateSettingsNotification_ = updateSettingsNotification;
                } else {
                    singleFieldBuilderV3.setMessage(updateSettingsNotification);
                }
                this.bitField0_ |= 2048;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof LiveTrackService) {
                    return mergeFrom((LiveTrackService) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(LiveTrackService liveTrackService) {
                if (liveTrackService == LiveTrackService.getDefaultInstance()) {
                    return this;
                }
                if (liveTrackService.hasShareMetaConfigNotification()) {
                    mergeShareMetaConfigNotification(liveTrackService.getShareMetaConfigNotification());
                }
                if (liveTrackService.hasShareSocialNotification()) {
                    mergeShareSocialNotification(liveTrackService.getShareSocialNotification());
                }
                if (liveTrackService.hasStartRequest()) {
                    mergeStartRequest(liveTrackService.getStartRequest());
                }
                if (liveTrackService.hasStartResponse()) {
                    mergeStartResponse(liveTrackService.getStartResponse());
                }
                if (liveTrackService.hasStopNotification()) {
                    mergeStopNotification(liveTrackService.getStopNotification());
                }
                if (liveTrackService.hasShareDeviceSettingNotification()) {
                    mergeShareDeviceSettingNotification(liveTrackService.getShareDeviceSettingNotification());
                }
                if (liveTrackService.hasStatusNotification()) {
                    mergeStatusNotification(liveTrackService.getStatusNotification());
                }
                if (liveTrackService.hasConsentChangedNotification()) {
                    mergeConsentChangedNotification(liveTrackService.getConsentChangedNotification());
                }
                if (liveTrackService.hasLiveEventSharingNotification()) {
                    mergeLiveEventSharingNotification(liveTrackService.getLiveEventSharingNotification());
                }
                if (liveTrackService.hasSessionSupportRequest()) {
                    mergeSessionSupportRequest(liveTrackService.getSessionSupportRequest());
                }
                if (liveTrackService.hasSessionSupportResponse()) {
                    mergeSessionSupportResponse(liveTrackService.getSessionSupportResponse());
                }
                if (liveTrackService.hasUpdateSettingsNotification()) {
                    mergeUpdateSettingsNotification(liveTrackService.getUpdateSettingsNotification());
                }
                if (liveTrackService.hasEmergencyCountdownNotification()) {
                    mergeEmergencyCountdownNotification(liveTrackService.getEmergencyCountdownNotification());
                }
                if (liveTrackService.hasConsentNotification()) {
                    mergeConsentNotification(liveTrackService.getConsentNotification());
                }
                if (liveTrackService.hasGroupRideNotification()) {
                    mergeGroupRideNotification(liveTrackService.getGroupRideNotification());
                }
                mergeUnknownFields(liveTrackService.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public LiveTrackService getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ LiveTrackService(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private LiveTrackService() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static LiveTrackService parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LiveTrackService) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static LiveTrackService parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static LiveTrackService parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static LiveTrackService parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static LiveTrackService parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static LiveTrackService parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static LiveTrackService parseFrom(InputStream inputStream) {
            return (LiveTrackService) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static LiveTrackService parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LiveTrackService) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static LiveTrackService parseFrom(CodedInputStream codedInputStream) {
            return (LiveTrackService) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static LiveTrackService parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LiveTrackService) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class Session extends GeneratedMessageV3 implements SessionOrBuilder {
        public static final int DEVICE_TYPE_FIELD_NUMBER = 3;
        public static final int ID_FIELD_NUMBER = 1;
        public static final int TOKEN_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int deviceType_;
        private volatile Object id_;
        private byte memoizedIsInitialized;
        private volatile Object token_;
        private static final Session DEFAULT_INSTANCE = new Session();

        @Deprecated
        public static final Parser<Session> PARSER = new AbstractParser<Session>() { // from class: com.garmin.proto.generated.GDILiveTrackProto.Session.1
            @Override // com.google.protobuf.Parser
            public Session parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = Session.newBuilder();
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

        private Session() {
            this.id_ = "";
            this.token_ = "";
            this.deviceType_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.id_ = "";
            this.token_ = "";
            this.deviceType_ = 0;
        }

        public static Session getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDILiveTrackProto.internal_static_GDI_Proto_LiveTrack_Session_descriptor;
        }

        public static Builder newBuilder(Session session) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(session);
        }

        public static Session parseDelimitedFrom(InputStream inputStream) {
            return (Session) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Session parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<Session> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Session)) {
                return super.equals(obj);
            }
            Session session = (Session) obj;
            if (hasId() != session.hasId()) {
                return false;
            }
            if ((hasId() && !getId().equals(session.getId())) || hasToken() != session.hasToken()) {
                return false;
            }
            if ((!hasToken() || getToken().equals(session.getToken())) && hasDeviceType() == session.hasDeviceType()) {
                return (!hasDeviceType() || this.deviceType_ == session.deviceType_) && getUnknownFields().equals(session.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.SessionOrBuilder
        public DeviceType getDeviceType() {
            DeviceType deviceTypeForNumber = DeviceType.forNumber(this.deviceType_);
            return deviceTypeForNumber == null ? DeviceType.PND : deviceTypeForNumber;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.SessionOrBuilder
        public String getId() {
            Object obj = this.id_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.id_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.SessionOrBuilder
        public ByteString getIdBytes() {
            Object obj = this.id_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.id_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<Session> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeStringSize = (this.bitField0_ & 1) != 0 ? GeneratedMessageV3.computeStringSize(1, this.id_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(2, this.token_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeStringSize += CodedOutputStream.computeEnumSize(3, this.deviceType_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeStringSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.SessionOrBuilder
        public String getToken() {
            Object obj = this.token_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.token_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.SessionOrBuilder
        public ByteString getTokenBytes() {
            Object obj = this.token_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.token_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.SessionOrBuilder
        public boolean hasDeviceType() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.SessionOrBuilder
        public boolean hasId() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.SessionOrBuilder
        public boolean hasToken() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasId()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getId().hashCode();
            }
            if (hasToken()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getToken().hashCode();
            }
            if (hasDeviceType()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + this.deviceType_;
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDILiveTrackProto.internal_static_GDI_Proto_LiveTrack_Session_fieldAccessorTable.ensureFieldAccessorsInitialized(Session.class, Builder.class);
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
            if (!hasId()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasToken()) {
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
            return new Session();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.id_);
            }
            if ((this.bitField0_ & 2) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 2, this.token_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeEnum(3, this.deviceType_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SessionOrBuilder {
            private int bitField0_;
            private int deviceType_;
            private Object id_;
            private Object token_;

            private Builder() {
                this.id_ = "";
                this.token_ = "";
                this.deviceType_ = 0;
            }

            private void buildPartial0(Session session) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    session.id_ = this.id_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    session.token_ = this.token_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    session.deviceType_ = this.deviceType_;
                    i14 |= 4;
                }
                session.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDILiveTrackProto.internal_static_GDI_Proto_LiveTrack_Session_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Session build() {
                Session sessionBuildPartial = buildPartial();
                if (sessionBuildPartial.isInitialized()) {
                    return sessionBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sessionBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Session buildPartial() {
                Session session = new Session(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(session);
                }
                onBuilt();
                return session;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.id_ = "";
                this.token_ = "";
                this.deviceType_ = 0;
                return this;
            }

            public Builder clearDeviceType() {
                this.bitField0_ &= -5;
                this.deviceType_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearId() {
                this.id_ = Session.getDefaultInstance().getId();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearToken() {
                this.token_ = Session.getDefaultInstance().getToken();
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
                return GDILiveTrackProto.internal_static_GDI_Proto_LiveTrack_Session_descriptor;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.SessionOrBuilder
            public DeviceType getDeviceType() {
                DeviceType deviceTypeForNumber = DeviceType.forNumber(this.deviceType_);
                return deviceTypeForNumber == null ? DeviceType.PND : deviceTypeForNumber;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.SessionOrBuilder
            public String getId() {
                Object obj = this.id_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.id_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.SessionOrBuilder
            public ByteString getIdBytes() {
                Object obj = this.id_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.id_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.SessionOrBuilder
            public String getToken() {
                Object obj = this.token_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.token_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.SessionOrBuilder
            public ByteString getTokenBytes() {
                Object obj = this.token_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.token_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.SessionOrBuilder
            public boolean hasDeviceType() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.SessionOrBuilder
            public boolean hasId() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.SessionOrBuilder
            public boolean hasToken() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDILiveTrackProto.internal_static_GDI_Proto_LiveTrack_Session_fieldAccessorTable.ensureFieldAccessorsInitialized(Session.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasId() && hasToken();
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
                                    this.id_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    this.token_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 2;
                                } else if (tag == 24) {
                                    int i14 = codedInputStream.readEnum();
                                    if (DeviceType.forNumber(i14) == null) {
                                        mergeUnknownVarintField(3, i14);
                                    } else {
                                        this.deviceType_ = i14;
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

            public Builder setDeviceType(DeviceType deviceType) {
                deviceType.getClass();
                this.bitField0_ |= 4;
                this.deviceType_ = deviceType.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setId(String str) {
                str.getClass();
                this.id_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setIdBytes(ByteString byteString) {
                byteString.getClass();
                this.id_ = byteString;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setToken(String str) {
                str.getClass();
                this.token_ = str;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setTokenBytes(ByteString byteString) {
                byteString.getClass();
                this.token_ = byteString;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public Session getDefaultInstanceForType() {
                return Session.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.id_ = "";
                this.token_ = "";
                this.deviceType_ = 0;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof Session) {
                    return mergeFrom((Session) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(Session session) {
                if (session == Session.getDefaultInstance()) {
                    return this;
                }
                if (session.hasId()) {
                    this.id_ = session.id_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (session.hasToken()) {
                    this.token_ = session.token_;
                    this.bitField0_ |= 2;
                    onChanged();
                }
                if (session.hasDeviceType()) {
                    setDeviceType(session.getDeviceType());
                }
                mergeUnknownFields(session.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public Session getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static Session parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Session) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Session parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Session parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Session parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static Session parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static Session parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static Session parseFrom(InputStream inputStream) {
            return (Session) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static Session parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Session) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Session parseFrom(CodedInputStream codedInputStream) {
            return (Session) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static Session parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Session) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        private Session(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.id_ = "";
            this.token_ = "";
            this.deviceType_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public /* synthetic */ Session(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }
    }

    public static final class SessionGroup extends GeneratedMessageV3 implements SessionGroupOrBuilder {
        public static final int DURATION_S_FIELD_NUMBER = 4;
        public static final int NAME_FIELD_NUMBER = 2;
        public static final int SESSIONS_FIELD_NUMBER = 5;
        public static final int SESSION_TYPE_FIELD_NUMBER = 1;
        public static final int START_UNIX_TIMESTAMP_FIELD_NUMBER = 3;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private long durationS_;
        private byte memoizedIsInitialized;
        private volatile Object name_;
        private int sessionType_;
        private List<Session> sessions_;
        private long startUnixTimestamp_;
        private static final SessionGroup DEFAULT_INSTANCE = new SessionGroup();

        @Deprecated
        public static final Parser<SessionGroup> PARSER = new AbstractParser<SessionGroup>() { // from class: com.garmin.proto.generated.GDILiveTrackProto.SessionGroup.1
            @Override // com.google.protobuf.Parser
            public SessionGroup parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SessionGroup.newBuilder();
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

        private SessionGroup() {
            this.sessionType_ = -1;
            this.name_ = "";
            this.startUnixTimestamp_ = 0L;
            this.durationS_ = 0L;
            this.memoizedIsInitialized = (byte) -1;
            this.sessionType_ = -1;
            this.name_ = "";
            this.sessions_ = Collections.EMPTY_LIST;
        }

        public static SessionGroup getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDILiveTrackProto.internal_static_GDI_Proto_LiveTrack_SessionGroup_descriptor;
        }

        public static Builder newBuilder(SessionGroup sessionGroup) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sessionGroup);
        }

        public static SessionGroup parseDelimitedFrom(InputStream inputStream) {
            return (SessionGroup) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SessionGroup parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SessionGroup> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SessionGroup)) {
                return super.equals(obj);
            }
            SessionGroup sessionGroup = (SessionGroup) obj;
            if (hasSessionType() != sessionGroup.hasSessionType()) {
                return false;
            }
            if ((hasSessionType() && this.sessionType_ != sessionGroup.sessionType_) || hasName() != sessionGroup.hasName()) {
                return false;
            }
            if ((hasName() && !getName().equals(sessionGroup.getName())) || hasStartUnixTimestamp() != sessionGroup.hasStartUnixTimestamp()) {
                return false;
            }
            if ((!hasStartUnixTimestamp() || getStartUnixTimestamp() == sessionGroup.getStartUnixTimestamp()) && hasDurationS() == sessionGroup.hasDurationS()) {
                return (!hasDurationS() || getDurationS() == sessionGroup.getDurationS()) && getSessionsList().equals(sessionGroup.getSessionsList()) && getUnknownFields().equals(sessionGroup.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.SessionGroupOrBuilder
        public long getDurationS() {
            return this.durationS_;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.SessionGroupOrBuilder
        public String getName() {
            Object obj = this.name_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.name_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.SessionGroupOrBuilder
        public ByteString getNameBytes() {
            Object obj = this.name_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.name_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SessionGroup> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeEnumSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.sessionType_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeEnumSize += GeneratedMessageV3.computeStringSize(2, this.name_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeEnumSize += CodedOutputStream.computeUInt64Size(3, this.startUnixTimestamp_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeEnumSize += CodedOutputStream.computeUInt64Size(4, this.durationS_);
            }
            for (int i15 = 0; i15 < this.sessions_.size(); i15++) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(5, this.sessions_.get(i15));
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeEnumSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.SessionGroupOrBuilder
        public SessionType getSessionType() {
            SessionType sessionTypeForNumber = SessionType.forNumber(this.sessionType_);
            return sessionTypeForNumber == null ? SessionType.UNKNOWN : sessionTypeForNumber;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.SessionGroupOrBuilder
        public Session getSessions(int i14) {
            return this.sessions_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.SessionGroupOrBuilder
        public int getSessionsCount() {
            return this.sessions_.size();
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.SessionGroupOrBuilder
        public List<Session> getSessionsList() {
            return this.sessions_;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.SessionGroupOrBuilder
        public SessionOrBuilder getSessionsOrBuilder(int i14) {
            return this.sessions_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.SessionGroupOrBuilder
        public List<? extends SessionOrBuilder> getSessionsOrBuilderList() {
            return this.sessions_;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.SessionGroupOrBuilder
        public long getStartUnixTimestamp() {
            return this.startUnixTimestamp_;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.SessionGroupOrBuilder
        public boolean hasDurationS() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.SessionGroupOrBuilder
        public boolean hasName() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.SessionGroupOrBuilder
        public boolean hasSessionType() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.SessionGroupOrBuilder
        public boolean hasStartUnixTimestamp() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasSessionType()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + this.sessionType_;
            }
            if (hasName()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getName().hashCode();
            }
            if (hasStartUnixTimestamp()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + Internal.hashLong(getStartUnixTimestamp());
            }
            if (hasDurationS()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + Internal.hashLong(getDurationS());
            }
            if (getSessionsCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + getSessionsList().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDILiveTrackProto.internal_static_GDI_Proto_LiveTrack_SessionGroup_fieldAccessorTable.ensureFieldAccessorsInitialized(SessionGroup.class, Builder.class);
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
            if (!hasSessionType()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasName()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasStartUnixTimestamp()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasDurationS()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            for (int i14 = 0; i14 < getSessionsCount(); i14++) {
                if (!getSessions(i14).isInitialized()) {
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
            return new SessionGroup();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeEnum(1, this.sessionType_);
            }
            if ((this.bitField0_ & 2) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 2, this.name_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeUInt64(3, this.startUnixTimestamp_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeUInt64(4, this.durationS_);
            }
            for (int i14 = 0; i14 < this.sessions_.size(); i14++) {
                codedOutputStream.writeMessage(5, this.sessions_.get(i14));
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SessionGroupOrBuilder {
            private int bitField0_;
            private long durationS_;
            private Object name_;
            private int sessionType_;
            private RepeatedFieldBuilderV3<Session, Session.Builder, SessionOrBuilder> sessionsBuilder_;
            private List<Session> sessions_;
            private long startUnixTimestamp_;

            private Builder() {
                this.sessionType_ = -1;
                this.name_ = "";
                this.sessions_ = Collections.EMPTY_LIST;
            }

            private void buildPartial0(SessionGroup sessionGroup) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    sessionGroup.sessionType_ = this.sessionType_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    sessionGroup.name_ = this.name_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    sessionGroup.startUnixTimestamp_ = this.startUnixTimestamp_;
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    sessionGroup.durationS_ = this.durationS_;
                    i14 |= 8;
                }
                sessionGroup.bitField0_ |= i14;
            }

            private void buildPartialRepeatedFields(SessionGroup sessionGroup) {
                RepeatedFieldBuilderV3<Session, Session.Builder, SessionOrBuilder> repeatedFieldBuilderV3 = this.sessionsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    sessionGroup.sessions_ = repeatedFieldBuilderV3.build();
                    return;
                }
                if ((this.bitField0_ & 16) != 0) {
                    this.sessions_ = Collections.unmodifiableList(this.sessions_);
                    this.bitField0_ &= -17;
                }
                sessionGroup.sessions_ = this.sessions_;
            }

            private void ensureSessionsIsMutable() {
                if ((this.bitField0_ & 16) == 0) {
                    this.sessions_ = new ArrayList(this.sessions_);
                    this.bitField0_ |= 16;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDILiveTrackProto.internal_static_GDI_Proto_LiveTrack_SessionGroup_descriptor;
            }

            private RepeatedFieldBuilderV3<Session, Session.Builder, SessionOrBuilder> getSessionsFieldBuilder() {
                if (this.sessionsBuilder_ == null) {
                    this.sessionsBuilder_ = new RepeatedFieldBuilderV3<>(this.sessions_, (this.bitField0_ & 16) != 0, getParentForChildren(), isClean());
                    this.sessions_ = null;
                }
                return this.sessionsBuilder_;
            }

            public Builder addAllSessions(Iterable<? extends Session> iterable) {
                RepeatedFieldBuilderV3<Session, Session.Builder, SessionOrBuilder> repeatedFieldBuilderV3 = this.sessionsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                    return this;
                }
                ensureSessionsIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.sessions_);
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            public Builder addSessions(Session.Builder builder) {
                RepeatedFieldBuilderV3<Session, Session.Builder, SessionOrBuilder> repeatedFieldBuilderV3 = this.sessionsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(builder.build());
                    return this;
                }
                ensureSessionsIsMutable();
                this.sessions_.add(builder.build());
                onChanged();
                return this;
            }

            public Session.Builder addSessionsBuilder() {
                return (Session.Builder) getSessionsFieldBuilder().addBuilder(Session.getDefaultInstance());
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SessionGroup build() {
                SessionGroup sessionGroupBuildPartial = buildPartial();
                if (sessionGroupBuildPartial.isInitialized()) {
                    return sessionGroupBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sessionGroupBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SessionGroup buildPartial() {
                SessionGroup sessionGroup = new SessionGroup(this);
                buildPartialRepeatedFields(sessionGroup);
                if (this.bitField0_ != 0) {
                    buildPartial0(sessionGroup);
                }
                onBuilt();
                return sessionGroup;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.sessionType_ = -1;
                this.name_ = "";
                this.startUnixTimestamp_ = 0L;
                this.durationS_ = 0L;
                RepeatedFieldBuilderV3<Session, Session.Builder, SessionOrBuilder> repeatedFieldBuilderV3 = this.sessionsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.sessions_ = Collections.EMPTY_LIST;
                } else {
                    this.sessions_ = null;
                    repeatedFieldBuilderV3.clear();
                }
                this.bitField0_ &= -17;
                return this;
            }

            public Builder clearDurationS() {
                this.bitField0_ &= -9;
                this.durationS_ = 0L;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearName() {
                this.name_ = SessionGroup.getDefaultInstance().getName();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearSessionType() {
                this.bitField0_ &= -2;
                this.sessionType_ = -1;
                onChanged();
                return this;
            }

            public Builder clearSessions() {
                RepeatedFieldBuilderV3<Session, Session.Builder, SessionOrBuilder> repeatedFieldBuilderV3 = this.sessionsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.clear();
                    return this;
                }
                this.sessions_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -17;
                onChanged();
                return this;
            }

            public Builder clearStartUnixTimestamp() {
                this.bitField0_ &= -5;
                this.startUnixTimestamp_ = 0L;
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
                return GDILiveTrackProto.internal_static_GDI_Proto_LiveTrack_SessionGroup_descriptor;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.SessionGroupOrBuilder
            public long getDurationS() {
                return this.durationS_;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.SessionGroupOrBuilder
            public String getName() {
                Object obj = this.name_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.name_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.SessionGroupOrBuilder
            public ByteString getNameBytes() {
                Object obj = this.name_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.name_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.SessionGroupOrBuilder
            public SessionType getSessionType() {
                SessionType sessionTypeForNumber = SessionType.forNumber(this.sessionType_);
                return sessionTypeForNumber == null ? SessionType.UNKNOWN : sessionTypeForNumber;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.SessionGroupOrBuilder
            public Session getSessions(int i14) {
                RepeatedFieldBuilderV3<Session, Session.Builder, SessionOrBuilder> repeatedFieldBuilderV3 = this.sessionsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.sessions_.get(i14) : (Session) repeatedFieldBuilderV3.getMessage(i14);
            }

            public Session.Builder getSessionsBuilder(int i14) {
                return (Session.Builder) getSessionsFieldBuilder().getBuilder(i14);
            }

            public List<Session.Builder> getSessionsBuilderList() {
                return getSessionsFieldBuilder().getBuilderList();
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.SessionGroupOrBuilder
            public int getSessionsCount() {
                RepeatedFieldBuilderV3<Session, Session.Builder, SessionOrBuilder> repeatedFieldBuilderV3 = this.sessionsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.sessions_.size() : repeatedFieldBuilderV3.getCount();
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.SessionGroupOrBuilder
            public List<Session> getSessionsList() {
                RepeatedFieldBuilderV3<Session, Session.Builder, SessionOrBuilder> repeatedFieldBuilderV3 = this.sessionsBuilder_;
                return repeatedFieldBuilderV3 == null ? Collections.unmodifiableList(this.sessions_) : repeatedFieldBuilderV3.getMessageList();
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.SessionGroupOrBuilder
            public SessionOrBuilder getSessionsOrBuilder(int i14) {
                RepeatedFieldBuilderV3<Session, Session.Builder, SessionOrBuilder> repeatedFieldBuilderV3 = this.sessionsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.sessions_.get(i14) : (SessionOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i14);
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.SessionGroupOrBuilder
            public List<? extends SessionOrBuilder> getSessionsOrBuilderList() {
                RepeatedFieldBuilderV3<Session, Session.Builder, SessionOrBuilder> repeatedFieldBuilderV3 = this.sessionsBuilder_;
                return repeatedFieldBuilderV3 != null ? repeatedFieldBuilderV3.getMessageOrBuilderList() : Collections.unmodifiableList(this.sessions_);
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.SessionGroupOrBuilder
            public long getStartUnixTimestamp() {
                return this.startUnixTimestamp_;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.SessionGroupOrBuilder
            public boolean hasDurationS() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.SessionGroupOrBuilder
            public boolean hasName() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.SessionGroupOrBuilder
            public boolean hasSessionType() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.SessionGroupOrBuilder
            public boolean hasStartUnixTimestamp() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDILiveTrackProto.internal_static_GDI_Proto_LiveTrack_SessionGroup_fieldAccessorTable.ensureFieldAccessorsInitialized(SessionGroup.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (!hasSessionType() || !hasName() || !hasStartUnixTimestamp() || !hasDurationS()) {
                    return false;
                }
                for (int i14 = 0; i14 < getSessionsCount(); i14++) {
                    if (!getSessions(i14).isInitialized()) {
                        return false;
                    }
                }
                return true;
            }

            public Builder mergeFrom(SessionGroup sessionGroup) {
                if (sessionGroup == SessionGroup.getDefaultInstance()) {
                    return this;
                }
                if (sessionGroup.hasSessionType()) {
                    setSessionType(sessionGroup.getSessionType());
                }
                if (sessionGroup.hasName()) {
                    this.name_ = sessionGroup.name_;
                    this.bitField0_ |= 2;
                    onChanged();
                }
                if (sessionGroup.hasStartUnixTimestamp()) {
                    setStartUnixTimestamp(sessionGroup.getStartUnixTimestamp());
                }
                if (sessionGroup.hasDurationS()) {
                    setDurationS(sessionGroup.getDurationS());
                }
                if (this.sessionsBuilder_ == null) {
                    if (!sessionGroup.sessions_.isEmpty()) {
                        if (this.sessions_.isEmpty()) {
                            this.sessions_ = sessionGroup.sessions_;
                            this.bitField0_ &= -17;
                        } else {
                            ensureSessionsIsMutable();
                            this.sessions_.addAll(sessionGroup.sessions_);
                        }
                        onChanged();
                    }
                } else if (!sessionGroup.sessions_.isEmpty()) {
                    boolean zIsEmpty = this.sessionsBuilder_.isEmpty();
                    RepeatedFieldBuilderV3<Session, Session.Builder, SessionOrBuilder> repeatedFieldBuilderV3 = this.sessionsBuilder_;
                    if (zIsEmpty) {
                        repeatedFieldBuilderV3.dispose();
                        this.sessionsBuilder_ = null;
                        this.sessions_ = sessionGroup.sessions_;
                        this.bitField0_ &= -17;
                        this.sessionsBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getSessionsFieldBuilder() : null;
                    } else {
                        repeatedFieldBuilderV3.addAllMessages(sessionGroup.sessions_);
                    }
                }
                mergeUnknownFields(sessionGroup.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder removeSessions(int i14) {
                RepeatedFieldBuilderV3<Session, Session.Builder, SessionOrBuilder> repeatedFieldBuilderV3 = this.sessionsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.remove(i14);
                    return this;
                }
                ensureSessionsIsMutable();
                this.sessions_.remove(i14);
                onChanged();
                return this;
            }

            public Builder setDurationS(long j8) {
                this.durationS_ = j8;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setName(String str) {
                str.getClass();
                this.name_ = str;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setNameBytes(ByteString byteString) {
                byteString.getClass();
                this.name_ = byteString;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setSessionType(SessionType sessionType) {
                sessionType.getClass();
                this.bitField0_ |= 1;
                this.sessionType_ = sessionType.getNumber();
                onChanged();
                return this;
            }

            public Builder setSessions(int i14, Session.Builder builder) {
                RepeatedFieldBuilderV3<Session, Session.Builder, SessionOrBuilder> repeatedFieldBuilderV3 = this.sessionsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.setMessage(i14, builder.build());
                    return this;
                }
                ensureSessionsIsMutable();
                this.sessions_.set(i14, builder.build());
                onChanged();
                return this;
            }

            public Builder setStartUnixTimestamp(long j8) {
                this.startUnixTimestamp_ = j8;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SessionGroup getDefaultInstanceForType() {
                return SessionGroup.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public Session.Builder addSessionsBuilder(int i14) {
                return (Session.Builder) getSessionsFieldBuilder().addBuilder(i14, Session.getDefaultInstance());
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.sessionType_ = -1;
                this.name_ = "";
                this.sessions_ = Collections.EMPTY_LIST;
            }

            public Builder addSessions(int i14, Session session) {
                RepeatedFieldBuilderV3<Session, Session.Builder, SessionOrBuilder> repeatedFieldBuilderV3 = this.sessionsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    session.getClass();
                    ensureSessionsIsMutable();
                    this.sessions_.add(i14, session);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, session);
                return this;
            }

            public Builder setSessions(int i14, Session session) {
                RepeatedFieldBuilderV3<Session, Session.Builder, SessionOrBuilder> repeatedFieldBuilderV3 = this.sessionsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    session.getClass();
                    ensureSessionsIsMutable();
                    this.sessions_.set(i14, session);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.setMessage(i14, session);
                return this;
            }

            public Builder addSessions(Session session) {
                RepeatedFieldBuilderV3<Session, Session.Builder, SessionOrBuilder> repeatedFieldBuilderV3 = this.sessionsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    session.getClass();
                    ensureSessionsIsMutable();
                    this.sessions_.add(session);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(session);
                return this;
            }

            public Builder addSessions(int i14, Session.Builder builder) {
                RepeatedFieldBuilderV3<Session, Session.Builder, SessionOrBuilder> repeatedFieldBuilderV3 = this.sessionsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureSessionsIsMutable();
                    this.sessions_.add(i14, builder.build());
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, builder.build());
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SessionGroup) {
                    return mergeFrom((SessionGroup) message);
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
                                    if (SessionType.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        this.sessionType_ = i14;
                                        this.bitField0_ |= 1;
                                    }
                                } else if (tag == 18) {
                                    this.name_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 2;
                                } else if (tag == 24) {
                                    this.startUnixTimestamp_ = codedInputStream.readUInt64();
                                    this.bitField0_ |= 4;
                                } else if (tag == 32) {
                                    this.durationS_ = codedInputStream.readUInt64();
                                    this.bitField0_ |= 8;
                                } else if (tag != 42) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    Session session = (Session) codedInputStream.readMessage(Session.PARSER, extensionRegistryLite);
                                    RepeatedFieldBuilderV3<Session, Session.Builder, SessionOrBuilder> repeatedFieldBuilderV3 = this.sessionsBuilder_;
                                    if (repeatedFieldBuilderV3 == null) {
                                        ensureSessionsIsMutable();
                                        this.sessions_.add(session);
                                    } else {
                                        repeatedFieldBuilderV3.addMessage(session);
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
        public SessionGroup getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static SessionGroup parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SessionGroup) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SessionGroup parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SessionGroup parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SessionGroup parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SessionGroup parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static SessionGroup parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SessionGroup parseFrom(InputStream inputStream) {
            return (SessionGroup) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static SessionGroup parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SessionGroup) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SessionGroup parseFrom(CodedInputStream codedInputStream) {
            return (SessionGroup) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static SessionGroup parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SessionGroup) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        private SessionGroup(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.sessionType_ = -1;
            this.name_ = "";
            this.startUnixTimestamp_ = 0L;
            this.durationS_ = 0L;
            this.memoizedIsInitialized = (byte) -1;
        }

        public /* synthetic */ SessionGroup(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }
    }

    public static final class SessionSupportResponse extends GeneratedMessageV3 implements SessionSupportResponseOrBuilder {
        public static final int SPECTATOR_MESSAGING_SUPPORTED_FIELD_NUMBER = 2;
        public static final int SUPPORTED_SESSION_TYPES_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private boolean spectatorMessagingSupported_;
        private List<Integer> supportedSessionTypes_;
        private static final Internal.ListAdapter.Converter<Integer, DeviceType> supportedSessionTypes_converter_ = new Internal.ListAdapter.Converter<Integer, DeviceType>() { // from class: com.garmin.proto.generated.GDILiveTrackProto.SessionSupportResponse.1
            @Override // com.google.protobuf.Internal.ListAdapter.Converter
            public DeviceType convert(Integer num) {
                DeviceType deviceTypeForNumber = DeviceType.forNumber(num.intValue());
                return deviceTypeForNumber == null ? DeviceType.PND : deviceTypeForNumber;
            }
        };
        private static final SessionSupportResponse DEFAULT_INSTANCE = new SessionSupportResponse();

        @Deprecated
        public static final Parser<SessionSupportResponse> PARSER = new AbstractParser<SessionSupportResponse>() { // from class: com.garmin.proto.generated.GDILiveTrackProto.SessionSupportResponse.2
            @Override // com.google.protobuf.Parser
            public SessionSupportResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SessionSupportResponse.newBuilder();
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

        private SessionSupportResponse() {
            this.spectatorMessagingSupported_ = false;
            this.memoizedIsInitialized = (byte) -1;
            this.supportedSessionTypes_ = Collections.EMPTY_LIST;
        }

        public static SessionSupportResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDILiveTrackProto.internal_static_GDI_Proto_LiveTrack_SessionSupportResponse_descriptor;
        }

        public static Builder newBuilder(SessionSupportResponse sessionSupportResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sessionSupportResponse);
        }

        public static SessionSupportResponse parseDelimitedFrom(InputStream inputStream) {
            return (SessionSupportResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SessionSupportResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SessionSupportResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SessionSupportResponse)) {
                return super.equals(obj);
            }
            SessionSupportResponse sessionSupportResponse = (SessionSupportResponse) obj;
            if (this.supportedSessionTypes_.equals(sessionSupportResponse.supportedSessionTypes_) && hasSpectatorMessagingSupported() == sessionSupportResponse.hasSpectatorMessagingSupported()) {
                return (!hasSpectatorMessagingSupported() || getSpectatorMessagingSupported() == sessionSupportResponse.getSpectatorMessagingSupported()) && getUnknownFields().equals(sessionSupportResponse.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SessionSupportResponse> getParserForType() {
            return PARSER;
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
                int size = this.supportedSessionTypes_.size();
                list = this.supportedSessionTypes_;
                if (i15 >= size) {
                    break;
                }
                iA = f3.a(iA, list.get(i15));
                i15++;
            }
            int size2 = list.size() + iA;
            if ((this.bitField0_ & 1) != 0) {
                size2 += CodedOutputStream.computeBoolSize(2, this.spectatorMessagingSupported_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + size2;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.SessionSupportResponseOrBuilder
        public boolean getSpectatorMessagingSupported() {
            return this.spectatorMessagingSupported_;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.SessionSupportResponseOrBuilder
        public DeviceType getSupportedSessionTypes(int i14) {
            return supportedSessionTypes_converter_.convert(this.supportedSessionTypes_.get(i14));
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.SessionSupportResponseOrBuilder
        public int getSupportedSessionTypesCount() {
            return this.supportedSessionTypes_.size();
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.SessionSupportResponseOrBuilder
        public List<DeviceType> getSupportedSessionTypesList() {
            return new Internal.ListAdapter(this.supportedSessionTypes_, supportedSessionTypes_converter_);
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.SessionSupportResponseOrBuilder
        public boolean hasSpectatorMessagingSupported() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (getSupportedSessionTypesCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + this.supportedSessionTypes_.hashCode();
            }
            if (hasSpectatorMessagingSupported()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + Internal.hashBoolean(getSpectatorMessagingSupported());
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDILiveTrackProto.internal_static_GDI_Proto_LiveTrack_SessionSupportResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(SessionSupportResponse.class, Builder.class);
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
            return new SessionSupportResponse();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            int iF = 0;
            while (iF < this.supportedSessionTypes_.size()) {
                iF = f3.f(this.supportedSessionTypes_.get(iF), codedOutputStream, 1, iF, 1);
            }
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeBool(2, this.spectatorMessagingSupported_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SessionSupportResponseOrBuilder {
            private int bitField0_;
            private boolean spectatorMessagingSupported_;
            private List<Integer> supportedSessionTypes_;

            private Builder() {
                this.supportedSessionTypes_ = Collections.EMPTY_LIST;
            }

            private void buildPartial0(SessionSupportResponse sessionSupportResponse) {
                int i14;
                if ((this.bitField0_ & 2) != 0) {
                    sessionSupportResponse.spectatorMessagingSupported_ = this.spectatorMessagingSupported_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                sessionSupportResponse.bitField0_ = i14 | sessionSupportResponse.bitField0_;
            }

            private void buildPartialRepeatedFields(SessionSupportResponse sessionSupportResponse) {
                if ((this.bitField0_ & 1) != 0) {
                    this.supportedSessionTypes_ = Collections.unmodifiableList(this.supportedSessionTypes_);
                    this.bitField0_ &= -2;
                }
                sessionSupportResponse.supportedSessionTypes_ = this.supportedSessionTypes_;
            }

            private void ensureSupportedSessionTypesIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.supportedSessionTypes_ = new ArrayList(this.supportedSessionTypes_);
                    this.bitField0_ |= 1;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDILiveTrackProto.internal_static_GDI_Proto_LiveTrack_SessionSupportResponse_descriptor;
            }

            public Builder addAllSupportedSessionTypes(Iterable<? extends DeviceType> iterable) {
                ensureSupportedSessionTypesIsMutable();
                Iterator<? extends DeviceType> it = iterable.iterator();
                while (it.hasNext()) {
                    this.supportedSessionTypes_.add(Integer.valueOf(it.next().getNumber()));
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            public Builder addSupportedSessionTypes(DeviceType deviceType) {
                deviceType.getClass();
                ensureSupportedSessionTypesIsMutable();
                this.supportedSessionTypes_.add(Integer.valueOf(deviceType.getNumber()));
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SessionSupportResponse build() {
                SessionSupportResponse sessionSupportResponseBuildPartial = buildPartial();
                if (sessionSupportResponseBuildPartial.isInitialized()) {
                    return sessionSupportResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sessionSupportResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SessionSupportResponse buildPartial() {
                SessionSupportResponse sessionSupportResponse = new SessionSupportResponse(this);
                buildPartialRepeatedFields(sessionSupportResponse);
                if (this.bitField0_ != 0) {
                    buildPartial0(sessionSupportResponse);
                }
                onBuilt();
                return sessionSupportResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.supportedSessionTypes_ = Collections.EMPTY_LIST;
                this.bitField0_ = 0;
                this.spectatorMessagingSupported_ = false;
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

            public Builder clearSpectatorMessagingSupported() {
                this.bitField0_ &= -3;
                this.spectatorMessagingSupported_ = false;
                onChanged();
                return this;
            }

            public Builder clearSupportedSessionTypes() {
                this.supportedSessionTypes_ = Collections.EMPTY_LIST;
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
                return GDILiveTrackProto.internal_static_GDI_Proto_LiveTrack_SessionSupportResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.SessionSupportResponseOrBuilder
            public boolean getSpectatorMessagingSupported() {
                return this.spectatorMessagingSupported_;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.SessionSupportResponseOrBuilder
            public DeviceType getSupportedSessionTypes(int i14) {
                return (DeviceType) SessionSupportResponse.supportedSessionTypes_converter_.convert(this.supportedSessionTypes_.get(i14));
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.SessionSupportResponseOrBuilder
            public int getSupportedSessionTypesCount() {
                return this.supportedSessionTypes_.size();
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.SessionSupportResponseOrBuilder
            public List<DeviceType> getSupportedSessionTypesList() {
                return new Internal.ListAdapter(this.supportedSessionTypes_, SessionSupportResponse.supportedSessionTypes_converter_);
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.SessionSupportResponseOrBuilder
            public boolean hasSpectatorMessagingSupported() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDILiveTrackProto.internal_static_GDI_Proto_LiveTrack_SessionSupportResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(SessionSupportResponse.class, Builder.class);
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
                                    if (DeviceType.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        ensureSupportedSessionTypesIsMutable();
                                        this.supportedSessionTypes_.add(Integer.valueOf(i14));
                                    }
                                } else if (tag == 10) {
                                    int iPushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                    while (codedInputStream.getBytesUntilLimit() > 0) {
                                        int i15 = codedInputStream.readEnum();
                                        if (DeviceType.forNumber(i15) == null) {
                                            mergeUnknownVarintField(1, i15);
                                        } else {
                                            ensureSupportedSessionTypesIsMutable();
                                            this.supportedSessionTypes_.add(Integer.valueOf(i15));
                                        }
                                    }
                                    codedInputStream.popLimit(iPushLimit);
                                } else if (tag == 16) {
                                    this.spectatorMessagingSupported_ = codedInputStream.readBool();
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

            public Builder setSpectatorMessagingSupported(boolean z14) {
                this.spectatorMessagingSupported_ = z14;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setSupportedSessionTypes(int i14, DeviceType deviceType) {
                deviceType.getClass();
                ensureSupportedSessionTypesIsMutable();
                this.supportedSessionTypes_.set(i14, Integer.valueOf(deviceType.getNumber()));
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SessionSupportResponse getDefaultInstanceForType() {
                return SessionSupportResponse.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.supportedSessionTypes_ = Collections.EMPTY_LIST;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SessionSupportResponse) {
                    return mergeFrom((SessionSupportResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SessionSupportResponse sessionSupportResponse) {
                if (sessionSupportResponse == SessionSupportResponse.getDefaultInstance()) {
                    return this;
                }
                if (!sessionSupportResponse.supportedSessionTypes_.isEmpty()) {
                    if (this.supportedSessionTypes_.isEmpty()) {
                        this.supportedSessionTypes_ = sessionSupportResponse.supportedSessionTypes_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureSupportedSessionTypesIsMutable();
                        this.supportedSessionTypes_.addAll(sessionSupportResponse.supportedSessionTypes_);
                    }
                    onChanged();
                }
                if (sessionSupportResponse.hasSpectatorMessagingSupported()) {
                    setSpectatorMessagingSupported(sessionSupportResponse.getSpectatorMessagingSupported());
                }
                mergeUnknownFields(sessionSupportResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SessionSupportResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static SessionSupportResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SessionSupportResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SessionSupportResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SessionSupportResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SessionSupportResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SessionSupportResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static SessionSupportResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        private SessionSupportResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.spectatorMessagingSupported_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SessionSupportResponse parseFrom(InputStream inputStream) {
            return (SessionSupportResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static SessionSupportResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SessionSupportResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public /* synthetic */ SessionSupportResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static SessionSupportResponse parseFrom(CodedInputStream codedInputStream) {
            return (SessionSupportResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static SessionSupportResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SessionSupportResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class ShareMetaConfigurationNotification extends GeneratedMessageV3 implements ShareMetaConfigurationNotificationOrBuilder {
        public static final int EMAIL_SHARING_ENABLED_FIELD_NUMBER = 5;
        public static final int EXTEND_LIVETRACK_ENABLED_FIELD_NUMBER = 4;
        public static final int GROUPTRACK_ALL_CONNECTIONS_FIELD_NUMBER = 8;
        public static final int GROUPTRACK_SHARING_ENABLED_FIELD_NUMBER = 3;
        public static final int SESSION_NAME_FIELD_NUMBER = 7;
        public static final int TWITTER_SHARING_ENABLED_FIELD_NUMBER = 6;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private boolean emailSharingEnabled_;
        private boolean extendLivetrackEnabled_;
        private boolean grouptrackAllConnections_;
        private boolean grouptrackSharingEnabled_;
        private byte memoizedIsInitialized;
        private volatile Object sessionName_;
        private boolean twitterSharingEnabled_;
        private static final ShareMetaConfigurationNotification DEFAULT_INSTANCE = new ShareMetaConfigurationNotification();

        @Deprecated
        public static final Parser<ShareMetaConfigurationNotification> PARSER = new AbstractParser<ShareMetaConfigurationNotification>() { // from class: com.garmin.proto.generated.GDILiveTrackProto.ShareMetaConfigurationNotification.1
            @Override // com.google.protobuf.Parser
            public ShareMetaConfigurationNotification parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = ShareMetaConfigurationNotification.newBuilder();
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

        private ShareMetaConfigurationNotification() {
            this.grouptrackSharingEnabled_ = false;
            this.extendLivetrackEnabled_ = false;
            this.emailSharingEnabled_ = false;
            this.twitterSharingEnabled_ = false;
            this.sessionName_ = "";
            this.grouptrackAllConnections_ = false;
            this.memoizedIsInitialized = (byte) -1;
            this.sessionName_ = "";
        }

        public static ShareMetaConfigurationNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDILiveTrackProto.internal_static_GDI_Proto_LiveTrack_ShareMetaConfigurationNotification_descriptor;
        }

        public static Builder newBuilder(ShareMetaConfigurationNotification shareMetaConfigurationNotification) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(shareMetaConfigurationNotification);
        }

        public static ShareMetaConfigurationNotification parseDelimitedFrom(InputStream inputStream) {
            return (ShareMetaConfigurationNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ShareMetaConfigurationNotification parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<ShareMetaConfigurationNotification> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ShareMetaConfigurationNotification)) {
                return super.equals(obj);
            }
            ShareMetaConfigurationNotification shareMetaConfigurationNotification = (ShareMetaConfigurationNotification) obj;
            if (hasGrouptrackSharingEnabled() != shareMetaConfigurationNotification.hasGrouptrackSharingEnabled()) {
                return false;
            }
            if ((hasGrouptrackSharingEnabled() && getGrouptrackSharingEnabled() != shareMetaConfigurationNotification.getGrouptrackSharingEnabled()) || hasExtendLivetrackEnabled() != shareMetaConfigurationNotification.hasExtendLivetrackEnabled()) {
                return false;
            }
            if ((hasExtendLivetrackEnabled() && getExtendLivetrackEnabled() != shareMetaConfigurationNotification.getExtendLivetrackEnabled()) || hasEmailSharingEnabled() != shareMetaConfigurationNotification.hasEmailSharingEnabled()) {
                return false;
            }
            if ((hasEmailSharingEnabled() && getEmailSharingEnabled() != shareMetaConfigurationNotification.getEmailSharingEnabled()) || hasTwitterSharingEnabled() != shareMetaConfigurationNotification.hasTwitterSharingEnabled()) {
                return false;
            }
            if ((hasTwitterSharingEnabled() && getTwitterSharingEnabled() != shareMetaConfigurationNotification.getTwitterSharingEnabled()) || hasSessionName() != shareMetaConfigurationNotification.hasSessionName()) {
                return false;
            }
            if ((!hasSessionName() || getSessionName().equals(shareMetaConfigurationNotification.getSessionName())) && hasGrouptrackAllConnections() == shareMetaConfigurationNotification.hasGrouptrackAllConnections()) {
                return (!hasGrouptrackAllConnections() || getGrouptrackAllConnections() == shareMetaConfigurationNotification.getGrouptrackAllConnections()) && getUnknownFields().equals(shareMetaConfigurationNotification.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.ShareMetaConfigurationNotificationOrBuilder
        public boolean getEmailSharingEnabled() {
            return this.emailSharingEnabled_;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.ShareMetaConfigurationNotificationOrBuilder
        public boolean getExtendLivetrackEnabled() {
            return this.extendLivetrackEnabled_;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.ShareMetaConfigurationNotificationOrBuilder
        public boolean getGrouptrackAllConnections() {
            return this.grouptrackAllConnections_;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.ShareMetaConfigurationNotificationOrBuilder
        public boolean getGrouptrackSharingEnabled() {
            return this.grouptrackSharingEnabled_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ShareMetaConfigurationNotification> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeBoolSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeBoolSize(3, this.grouptrackSharingEnabled_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeBoolSize += CodedOutputStream.computeBoolSize(4, this.extendLivetrackEnabled_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeBoolSize += CodedOutputStream.computeBoolSize(5, this.emailSharingEnabled_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeBoolSize += CodedOutputStream.computeBoolSize(6, this.twitterSharingEnabled_);
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeBoolSize += GeneratedMessageV3.computeStringSize(7, this.sessionName_);
            }
            if ((this.bitField0_ & 32) != 0) {
                iComputeBoolSize += CodedOutputStream.computeBoolSize(8, this.grouptrackAllConnections_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeBoolSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.ShareMetaConfigurationNotificationOrBuilder
        public String getSessionName() {
            Object obj = this.sessionName_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.sessionName_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.ShareMetaConfigurationNotificationOrBuilder
        public ByteString getSessionNameBytes() {
            Object obj = this.sessionName_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.sessionName_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.ShareMetaConfigurationNotificationOrBuilder
        public boolean getTwitterSharingEnabled() {
            return this.twitterSharingEnabled_;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.ShareMetaConfigurationNotificationOrBuilder
        public boolean hasEmailSharingEnabled() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.ShareMetaConfigurationNotificationOrBuilder
        public boolean hasExtendLivetrackEnabled() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.ShareMetaConfigurationNotificationOrBuilder
        public boolean hasGrouptrackAllConnections() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.ShareMetaConfigurationNotificationOrBuilder
        public boolean hasGrouptrackSharingEnabled() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.ShareMetaConfigurationNotificationOrBuilder
        public boolean hasSessionName() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.ShareMetaConfigurationNotificationOrBuilder
        public boolean hasTwitterSharingEnabled() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasGrouptrackSharingEnabled()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + Internal.hashBoolean(getGrouptrackSharingEnabled());
            }
            if (hasExtendLivetrackEnabled()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + Internal.hashBoolean(getExtendLivetrackEnabled());
            }
            if (hasEmailSharingEnabled()) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + Internal.hashBoolean(getEmailSharingEnabled());
            }
            if (hasTwitterSharingEnabled()) {
                iHashCode = e5.c(iHashCode, 37, 6, 53) + Internal.hashBoolean(getTwitterSharingEnabled());
            }
            if (hasSessionName()) {
                iHashCode = e5.c(iHashCode, 37, 7, 53) + getSessionName().hashCode();
            }
            if (hasGrouptrackAllConnections()) {
                iHashCode = e5.c(iHashCode, 37, 8, 53) + Internal.hashBoolean(getGrouptrackAllConnections());
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDILiveTrackProto.internal_static_GDI_Proto_LiveTrack_ShareMetaConfigurationNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(ShareMetaConfigurationNotification.class, Builder.class);
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
            return new ShareMetaConfigurationNotification();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeBool(3, this.grouptrackSharingEnabled_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeBool(4, this.extendLivetrackEnabled_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeBool(5, this.emailSharingEnabled_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeBool(6, this.twitterSharingEnabled_);
            }
            if ((this.bitField0_ & 16) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 7, this.sessionName_);
            }
            if ((this.bitField0_ & 32) != 0) {
                codedOutputStream.writeBool(8, this.grouptrackAllConnections_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ShareMetaConfigurationNotificationOrBuilder {
            private int bitField0_;
            private boolean emailSharingEnabled_;
            private boolean extendLivetrackEnabled_;
            private boolean grouptrackAllConnections_;
            private boolean grouptrackSharingEnabled_;
            private Object sessionName_;
            private boolean twitterSharingEnabled_;

            private Builder() {
                this.sessionName_ = "";
            }

            private void buildPartial0(ShareMetaConfigurationNotification shareMetaConfigurationNotification) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    shareMetaConfigurationNotification.grouptrackSharingEnabled_ = this.grouptrackSharingEnabled_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    shareMetaConfigurationNotification.extendLivetrackEnabled_ = this.extendLivetrackEnabled_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    shareMetaConfigurationNotification.emailSharingEnabled_ = this.emailSharingEnabled_;
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    shareMetaConfigurationNotification.twitterSharingEnabled_ = this.twitterSharingEnabled_;
                    i14 |= 8;
                }
                if ((i15 & 16) != 0) {
                    shareMetaConfigurationNotification.sessionName_ = this.sessionName_;
                    i14 |= 16;
                }
                if ((i15 & 32) != 0) {
                    shareMetaConfigurationNotification.grouptrackAllConnections_ = this.grouptrackAllConnections_;
                    i14 |= 32;
                }
                shareMetaConfigurationNotification.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDILiveTrackProto.internal_static_GDI_Proto_LiveTrack_ShareMetaConfigurationNotification_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ShareMetaConfigurationNotification build() {
                ShareMetaConfigurationNotification shareMetaConfigurationNotificationBuildPartial = buildPartial();
                if (shareMetaConfigurationNotificationBuildPartial.isInitialized()) {
                    return shareMetaConfigurationNotificationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) shareMetaConfigurationNotificationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ShareMetaConfigurationNotification buildPartial() {
                ShareMetaConfigurationNotification shareMetaConfigurationNotification = new ShareMetaConfigurationNotification(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(shareMetaConfigurationNotification);
                }
                onBuilt();
                return shareMetaConfigurationNotification;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.grouptrackSharingEnabled_ = false;
                this.extendLivetrackEnabled_ = false;
                this.emailSharingEnabled_ = false;
                this.twitterSharingEnabled_ = false;
                this.sessionName_ = "";
                this.grouptrackAllConnections_ = false;
                return this;
            }

            public Builder clearEmailSharingEnabled() {
                this.bitField0_ &= -5;
                this.emailSharingEnabled_ = false;
                onChanged();
                return this;
            }

            public Builder clearExtendLivetrackEnabled() {
                this.bitField0_ &= -3;
                this.extendLivetrackEnabled_ = false;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearGrouptrackAllConnections() {
                this.bitField0_ &= -33;
                this.grouptrackAllConnections_ = false;
                onChanged();
                return this;
            }

            public Builder clearGrouptrackSharingEnabled() {
                this.bitField0_ &= -2;
                this.grouptrackSharingEnabled_ = false;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearSessionName() {
                this.sessionName_ = ShareMetaConfigurationNotification.getDefaultInstance().getSessionName();
                this.bitField0_ &= -17;
                onChanged();
                return this;
            }

            public Builder clearTwitterSharingEnabled() {
                this.bitField0_ &= -9;
                this.twitterSharingEnabled_ = false;
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
                return GDILiveTrackProto.internal_static_GDI_Proto_LiveTrack_ShareMetaConfigurationNotification_descriptor;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.ShareMetaConfigurationNotificationOrBuilder
            public boolean getEmailSharingEnabled() {
                return this.emailSharingEnabled_;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.ShareMetaConfigurationNotificationOrBuilder
            public boolean getExtendLivetrackEnabled() {
                return this.extendLivetrackEnabled_;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.ShareMetaConfigurationNotificationOrBuilder
            public boolean getGrouptrackAllConnections() {
                return this.grouptrackAllConnections_;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.ShareMetaConfigurationNotificationOrBuilder
            public boolean getGrouptrackSharingEnabled() {
                return this.grouptrackSharingEnabled_;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.ShareMetaConfigurationNotificationOrBuilder
            public String getSessionName() {
                Object obj = this.sessionName_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.sessionName_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.ShareMetaConfigurationNotificationOrBuilder
            public ByteString getSessionNameBytes() {
                Object obj = this.sessionName_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.sessionName_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.ShareMetaConfigurationNotificationOrBuilder
            public boolean getTwitterSharingEnabled() {
                return this.twitterSharingEnabled_;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.ShareMetaConfigurationNotificationOrBuilder
            public boolean hasEmailSharingEnabled() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.ShareMetaConfigurationNotificationOrBuilder
            public boolean hasExtendLivetrackEnabled() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.ShareMetaConfigurationNotificationOrBuilder
            public boolean hasGrouptrackAllConnections() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.ShareMetaConfigurationNotificationOrBuilder
            public boolean hasGrouptrackSharingEnabled() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.ShareMetaConfigurationNotificationOrBuilder
            public boolean hasSessionName() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.ShareMetaConfigurationNotificationOrBuilder
            public boolean hasTwitterSharingEnabled() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDILiveTrackProto.internal_static_GDI_Proto_LiveTrack_ShareMetaConfigurationNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(ShareMetaConfigurationNotification.class, Builder.class);
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
                                if (tag == 24) {
                                    this.grouptrackSharingEnabled_ = codedInputStream.readBool();
                                    this.bitField0_ |= 1;
                                } else if (tag == 32) {
                                    this.extendLivetrackEnabled_ = codedInputStream.readBool();
                                    this.bitField0_ |= 2;
                                } else if (tag == 40) {
                                    this.emailSharingEnabled_ = codedInputStream.readBool();
                                    this.bitField0_ |= 4;
                                } else if (tag == 48) {
                                    this.twitterSharingEnabled_ = codedInputStream.readBool();
                                    this.bitField0_ |= 8;
                                } else if (tag == 58) {
                                    this.sessionName_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 16;
                                } else if (tag == 64) {
                                    this.grouptrackAllConnections_ = codedInputStream.readBool();
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

            public Builder setEmailSharingEnabled(boolean z14) {
                this.emailSharingEnabled_ = z14;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setExtendLivetrackEnabled(boolean z14) {
                this.extendLivetrackEnabled_ = z14;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setGrouptrackAllConnections(boolean z14) {
                this.grouptrackAllConnections_ = z14;
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setGrouptrackSharingEnabled(boolean z14) {
                this.grouptrackSharingEnabled_ = z14;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setSessionName(String str) {
                str.getClass();
                this.sessionName_ = str;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setSessionNameBytes(ByteString byteString) {
                byteString.getClass();
                this.sessionName_ = byteString;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setTwitterSharingEnabled(boolean z14) {
                this.twitterSharingEnabled_ = z14;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public ShareMetaConfigurationNotification getDefaultInstanceForType() {
                return ShareMetaConfigurationNotification.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.sessionName_ = "";
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ShareMetaConfigurationNotification) {
                    return mergeFrom((ShareMetaConfigurationNotification) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ShareMetaConfigurationNotification shareMetaConfigurationNotification) {
                if (shareMetaConfigurationNotification == ShareMetaConfigurationNotification.getDefaultInstance()) {
                    return this;
                }
                if (shareMetaConfigurationNotification.hasGrouptrackSharingEnabled()) {
                    setGrouptrackSharingEnabled(shareMetaConfigurationNotification.getGrouptrackSharingEnabled());
                }
                if (shareMetaConfigurationNotification.hasExtendLivetrackEnabled()) {
                    setExtendLivetrackEnabled(shareMetaConfigurationNotification.getExtendLivetrackEnabled());
                }
                if (shareMetaConfigurationNotification.hasEmailSharingEnabled()) {
                    setEmailSharingEnabled(shareMetaConfigurationNotification.getEmailSharingEnabled());
                }
                if (shareMetaConfigurationNotification.hasTwitterSharingEnabled()) {
                    setTwitterSharingEnabled(shareMetaConfigurationNotification.getTwitterSharingEnabled());
                }
                if (shareMetaConfigurationNotification.hasSessionName()) {
                    this.sessionName_ = shareMetaConfigurationNotification.sessionName_;
                    this.bitField0_ |= 16;
                    onChanged();
                }
                if (shareMetaConfigurationNotification.hasGrouptrackAllConnections()) {
                    setGrouptrackAllConnections(shareMetaConfigurationNotification.getGrouptrackAllConnections());
                }
                mergeUnknownFields(shareMetaConfigurationNotification.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ShareMetaConfigurationNotification getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static ShareMetaConfigurationNotification parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ShareMetaConfigurationNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ShareMetaConfigurationNotification parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static ShareMetaConfigurationNotification parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ShareMetaConfigurationNotification parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ShareMetaConfigurationNotification parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static ShareMetaConfigurationNotification parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static ShareMetaConfigurationNotification parseFrom(InputStream inputStream) {
            return (ShareMetaConfigurationNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static ShareMetaConfigurationNotification parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ShareMetaConfigurationNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ShareMetaConfigurationNotification parseFrom(CodedInputStream codedInputStream) {
            return (ShareMetaConfigurationNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static ShareMetaConfigurationNotification parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ShareMetaConfigurationNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        private ShareMetaConfigurationNotification(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.grouptrackSharingEnabled_ = false;
            this.extendLivetrackEnabled_ = false;
            this.emailSharingEnabled_ = false;
            this.twitterSharingEnabled_ = false;
            this.sessionName_ = "";
            this.grouptrackAllConnections_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public /* synthetic */ ShareMetaConfigurationNotification(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }
    }

    public static final class ShareSocialCredentialsNotification extends GeneratedMessageV3 implements ShareSocialCredentialsNotificationOrBuilder {
        private static final ShareSocialCredentialsNotification DEFAULT_INSTANCE = new ShareSocialCredentialsNotification();

        @Deprecated
        public static final Parser<ShareSocialCredentialsNotification> PARSER = new AbstractParser<ShareSocialCredentialsNotification>() { // from class: com.garmin.proto.generated.GDILiveTrackProto.ShareSocialCredentialsNotification.1
            @Override // com.google.protobuf.Parser
            public ShareSocialCredentialsNotification parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = ShareSocialCredentialsNotification.newBuilder();
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
        public static final int STRAVA_BEACON_CONNECTED_FIELD_NUMBER = 3;
        public static final int TWITTER_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private boolean stravaBeaconConnected_;
        private TwitterCredentials twitter_;

        private ShareSocialCredentialsNotification(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.stravaBeaconConnected_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ShareSocialCredentialsNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDILiveTrackProto.internal_static_GDI_Proto_LiveTrack_ShareSocialCredentialsNotification_descriptor;
        }

        public static Builder newBuilder(ShareSocialCredentialsNotification shareSocialCredentialsNotification) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(shareSocialCredentialsNotification);
        }

        public static ShareSocialCredentialsNotification parseDelimitedFrom(InputStream inputStream) {
            return (ShareSocialCredentialsNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ShareSocialCredentialsNotification parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<ShareSocialCredentialsNotification> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ShareSocialCredentialsNotification)) {
                return super.equals(obj);
            }
            ShareSocialCredentialsNotification shareSocialCredentialsNotification = (ShareSocialCredentialsNotification) obj;
            if (hasTwitter() != shareSocialCredentialsNotification.hasTwitter()) {
                return false;
            }
            if ((!hasTwitter() || getTwitter().equals(shareSocialCredentialsNotification.getTwitter())) && hasStravaBeaconConnected() == shareSocialCredentialsNotification.hasStravaBeaconConnected()) {
                return (!hasStravaBeaconConnected() || getStravaBeaconConnected() == shareSocialCredentialsNotification.getStravaBeaconConnected()) && getUnknownFields().equals(shareSocialCredentialsNotification.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ShareSocialCredentialsNotification> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(2, getTwitter()) : 0;
            if ((2 & this.bitField0_) != 0) {
                iComputeMessageSize += CodedOutputStream.computeBoolSize(3, this.stravaBeaconConnected_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.ShareSocialCredentialsNotificationOrBuilder
        public boolean getStravaBeaconConnected() {
            return this.stravaBeaconConnected_;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.ShareSocialCredentialsNotificationOrBuilder
        public TwitterCredentials getTwitter() {
            TwitterCredentials twitterCredentials = this.twitter_;
            return twitterCredentials == null ? TwitterCredentials.getDefaultInstance() : twitterCredentials;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.ShareSocialCredentialsNotificationOrBuilder
        public TwitterCredentialsOrBuilder getTwitterOrBuilder() {
            TwitterCredentials twitterCredentials = this.twitter_;
            return twitterCredentials == null ? TwitterCredentials.getDefaultInstance() : twitterCredentials;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.ShareSocialCredentialsNotificationOrBuilder
        public boolean hasStravaBeaconConnected() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.ShareSocialCredentialsNotificationOrBuilder
        public boolean hasTwitter() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasTwitter()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getTwitter().hashCode();
            }
            if (hasStravaBeaconConnected()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + Internal.hashBoolean(getStravaBeaconConnected());
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDILiveTrackProto.internal_static_GDI_Proto_LiveTrack_ShareSocialCredentialsNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(ShareSocialCredentialsNotification.class, Builder.class);
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
            if (!hasTwitter() || getTwitter().isInitialized()) {
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
            return new ShareSocialCredentialsNotification();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(2, getTwitter());
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeBool(3, this.stravaBeaconConnected_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ShareSocialCredentialsNotificationOrBuilder {
            private int bitField0_;
            private boolean stravaBeaconConnected_;
            private SingleFieldBuilderV3<TwitterCredentials, TwitterCredentials.Builder, TwitterCredentialsOrBuilder> twitterBuilder_;
            private TwitterCredentials twitter_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(ShareSocialCredentialsNotification shareSocialCredentialsNotification) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    SingleFieldBuilderV3<TwitterCredentials, TwitterCredentials.Builder, TwitterCredentialsOrBuilder> singleFieldBuilderV3 = this.twitterBuilder_;
                    shareSocialCredentialsNotification.twitter_ = singleFieldBuilderV3 == null ? this.twitter_ : (TwitterCredentials) singleFieldBuilderV3.build();
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    shareSocialCredentialsNotification.stravaBeaconConnected_ = this.stravaBeaconConnected_;
                    i14 |= 2;
                }
                shareSocialCredentialsNotification.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDILiveTrackProto.internal_static_GDI_Proto_LiveTrack_ShareSocialCredentialsNotification_descriptor;
            }

            private SingleFieldBuilderV3<TwitterCredentials, TwitterCredentials.Builder, TwitterCredentialsOrBuilder> getTwitterFieldBuilder() {
                if (this.twitterBuilder_ == null) {
                    this.twitterBuilder_ = new SingleFieldBuilderV3<>(getTwitter(), getParentForChildren(), isClean());
                    this.twitter_ = null;
                }
                return this.twitterBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getTwitterFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ShareSocialCredentialsNotification build() {
                ShareSocialCredentialsNotification shareSocialCredentialsNotificationBuildPartial = buildPartial();
                if (shareSocialCredentialsNotificationBuildPartial.isInitialized()) {
                    return shareSocialCredentialsNotificationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) shareSocialCredentialsNotificationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ShareSocialCredentialsNotification buildPartial() {
                ShareSocialCredentialsNotification shareSocialCredentialsNotification = new ShareSocialCredentialsNotification(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(shareSocialCredentialsNotification);
                }
                onBuilt();
                return shareSocialCredentialsNotification;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.twitter_ = null;
                SingleFieldBuilderV3<TwitterCredentials, TwitterCredentials.Builder, TwitterCredentialsOrBuilder> singleFieldBuilderV3 = this.twitterBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.twitterBuilder_ = null;
                }
                this.stravaBeaconConnected_ = false;
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

            public Builder clearStravaBeaconConnected() {
                this.bitField0_ &= -3;
                this.stravaBeaconConnected_ = false;
                onChanged();
                return this;
            }

            public Builder clearTwitter() {
                this.bitField0_ &= -2;
                this.twitter_ = null;
                SingleFieldBuilderV3<TwitterCredentials, TwitterCredentials.Builder, TwitterCredentialsOrBuilder> singleFieldBuilderV3 = this.twitterBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.twitterBuilder_ = null;
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
                return GDILiveTrackProto.internal_static_GDI_Proto_LiveTrack_ShareSocialCredentialsNotification_descriptor;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.ShareSocialCredentialsNotificationOrBuilder
            public boolean getStravaBeaconConnected() {
                return this.stravaBeaconConnected_;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.ShareSocialCredentialsNotificationOrBuilder
            public TwitterCredentials getTwitter() {
                SingleFieldBuilderV3<TwitterCredentials, TwitterCredentials.Builder, TwitterCredentialsOrBuilder> singleFieldBuilderV3 = this.twitterBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (TwitterCredentials) singleFieldBuilderV3.getMessage();
                }
                TwitterCredentials twitterCredentials = this.twitter_;
                return twitterCredentials == null ? TwitterCredentials.getDefaultInstance() : twitterCredentials;
            }

            public TwitterCredentials.Builder getTwitterBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (TwitterCredentials.Builder) getTwitterFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.ShareSocialCredentialsNotificationOrBuilder
            public TwitterCredentialsOrBuilder getTwitterOrBuilder() {
                SingleFieldBuilderV3<TwitterCredentials, TwitterCredentials.Builder, TwitterCredentialsOrBuilder> singleFieldBuilderV3 = this.twitterBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (TwitterCredentialsOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                TwitterCredentials twitterCredentials = this.twitter_;
                return twitterCredentials == null ? TwitterCredentials.getDefaultInstance() : twitterCredentials;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.ShareSocialCredentialsNotificationOrBuilder
            public boolean hasStravaBeaconConnected() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.ShareSocialCredentialsNotificationOrBuilder
            public boolean hasTwitter() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDILiveTrackProto.internal_static_GDI_Proto_LiveTrack_ShareSocialCredentialsNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(ShareSocialCredentialsNotification.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return !hasTwitter() || getTwitter().isInitialized();
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
                                if (tag == 18) {
                                    codedInputStream.readMessage(getTwitterFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1;
                                } else if (tag == 24) {
                                    this.stravaBeaconConnected_ = codedInputStream.readBool();
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

            public Builder mergeTwitter(TwitterCredentials twitterCredentials) {
                TwitterCredentials twitterCredentials2;
                SingleFieldBuilderV3<TwitterCredentials, TwitterCredentials.Builder, TwitterCredentialsOrBuilder> singleFieldBuilderV3 = this.twitterBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(twitterCredentials);
                } else if ((this.bitField0_ & 1) == 0 || (twitterCredentials2 = this.twitter_) == null || twitterCredentials2 == TwitterCredentials.getDefaultInstance()) {
                    this.twitter_ = twitterCredentials;
                } else {
                    getTwitterBuilder().mergeFrom(twitterCredentials);
                }
                if (this.twitter_ != null) {
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

            public Builder setStravaBeaconConnected(boolean z14) {
                this.stravaBeaconConnected_ = z14;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setTwitter(TwitterCredentials.Builder builder) {
                SingleFieldBuilderV3<TwitterCredentials, TwitterCredentials.Builder, TwitterCredentialsOrBuilder> singleFieldBuilderV3 = this.twitterBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.twitter_ = builder.build();
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
            public ShareSocialCredentialsNotification getDefaultInstanceForType() {
                return ShareSocialCredentialsNotification.getDefaultInstance();
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

            public Builder setTwitter(TwitterCredentials twitterCredentials) {
                SingleFieldBuilderV3<TwitterCredentials, TwitterCredentials.Builder, TwitterCredentialsOrBuilder> singleFieldBuilderV3 = this.twitterBuilder_;
                if (singleFieldBuilderV3 == null) {
                    twitterCredentials.getClass();
                    this.twitter_ = twitterCredentials;
                } else {
                    singleFieldBuilderV3.setMessage(twitterCredentials);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ShareSocialCredentialsNotification) {
                    return mergeFrom((ShareSocialCredentialsNotification) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ShareSocialCredentialsNotification shareSocialCredentialsNotification) {
                if (shareSocialCredentialsNotification == ShareSocialCredentialsNotification.getDefaultInstance()) {
                    return this;
                }
                if (shareSocialCredentialsNotification.hasTwitter()) {
                    mergeTwitter(shareSocialCredentialsNotification.getTwitter());
                }
                if (shareSocialCredentialsNotification.hasStravaBeaconConnected()) {
                    setStravaBeaconConnected(shareSocialCredentialsNotification.getStravaBeaconConnected());
                }
                mergeUnknownFields(shareSocialCredentialsNotification.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ShareSocialCredentialsNotification getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static ShareSocialCredentialsNotification parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ShareSocialCredentialsNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ShareSocialCredentialsNotification parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ ShareSocialCredentialsNotification(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static ShareSocialCredentialsNotification parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private ShareSocialCredentialsNotification() {
            this.stravaBeaconConnected_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ShareSocialCredentialsNotification parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ShareSocialCredentialsNotification parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static ShareSocialCredentialsNotification parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static ShareSocialCredentialsNotification parseFrom(InputStream inputStream) {
            return (ShareSocialCredentialsNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static ShareSocialCredentialsNotification parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ShareSocialCredentialsNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ShareSocialCredentialsNotification parseFrom(CodedInputStream codedInputStream) {
            return (ShareSocialCredentialsNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static ShareSocialCredentialsNotification parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ShareSocialCredentialsNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class StartRequest extends GeneratedMessageV3 implements StartRequestOrBuilder {
        private static final StartRequest DEFAULT_INSTANCE = new StartRequest();

        @Deprecated
        public static final Parser<StartRequest> PARSER = new AbstractParser<StartRequest>() { // from class: com.garmin.proto.generated.GDILiveTrackProto.StartRequest.1
            @Override // com.google.protobuf.Parser
            public StartRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = StartRequest.newBuilder();
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
        public static final int SESSION_FIELD_NUMBER = 1;
        public static final int TRACKER_ID_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private SessionGroup session_;
        private TrackerId trackerId_;

        private StartRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static StartRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDILiveTrackProto.internal_static_GDI_Proto_LiveTrack_StartRequest_descriptor;
        }

        public static Builder newBuilder(StartRequest startRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(startRequest);
        }

        public static StartRequest parseDelimitedFrom(InputStream inputStream) {
            return (StartRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static StartRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<StartRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof StartRequest)) {
                return super.equals(obj);
            }
            StartRequest startRequest = (StartRequest) obj;
            if (hasSession() != startRequest.hasSession()) {
                return false;
            }
            if ((!hasSession() || getSession().equals(startRequest.getSession())) && hasTrackerId() == startRequest.hasTrackerId()) {
                return (!hasTrackerId() || getTrackerId().equals(startRequest.getTrackerId())) && getUnknownFields().equals(startRequest.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<StartRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getSession()) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, getTrackerId());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.StartRequestOrBuilder
        public SessionGroup getSession() {
            SessionGroup sessionGroup = this.session_;
            return sessionGroup == null ? SessionGroup.getDefaultInstance() : sessionGroup;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.StartRequestOrBuilder
        public SessionGroupOrBuilder getSessionOrBuilder() {
            SessionGroup sessionGroup = this.session_;
            return sessionGroup == null ? SessionGroup.getDefaultInstance() : sessionGroup;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.StartRequestOrBuilder
        public TrackerId getTrackerId() {
            TrackerId trackerId = this.trackerId_;
            return trackerId == null ? TrackerId.getDefaultInstance() : trackerId;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.StartRequestOrBuilder
        public TrackerIdOrBuilder getTrackerIdOrBuilder() {
            TrackerId trackerId = this.trackerId_;
            return trackerId == null ? TrackerId.getDefaultInstance() : trackerId;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.StartRequestOrBuilder
        public boolean hasSession() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.StartRequestOrBuilder
        public boolean hasTrackerId() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasSession()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getSession().hashCode();
            }
            if (hasTrackerId()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getTrackerId().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDILiveTrackProto.internal_static_GDI_Proto_LiveTrack_StartRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(StartRequest.class, Builder.class);
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
            if (!hasSession()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasTrackerId()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (getSession().isInitialized()) {
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
            return new StartRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getSession());
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeMessage(2, getTrackerId());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements StartRequestOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<SessionGroup, SessionGroup.Builder, SessionGroupOrBuilder> sessionBuilder_;
            private SessionGroup session_;
            private SingleFieldBuilderV3<TrackerId, TrackerId.Builder, TrackerIdOrBuilder> trackerIdBuilder_;
            private TrackerId trackerId_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(StartRequest startRequest) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    SingleFieldBuilderV3<SessionGroup, SessionGroup.Builder, SessionGroupOrBuilder> singleFieldBuilderV3 = this.sessionBuilder_;
                    startRequest.session_ = singleFieldBuilderV3 == null ? this.session_ : (SessionGroup) singleFieldBuilderV3.build();
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    SingleFieldBuilderV3<TrackerId, TrackerId.Builder, TrackerIdOrBuilder> singleFieldBuilderV4 = this.trackerIdBuilder_;
                    startRequest.trackerId_ = singleFieldBuilderV4 == null ? this.trackerId_ : (TrackerId) singleFieldBuilderV4.build();
                    i14 |= 2;
                }
                startRequest.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDILiveTrackProto.internal_static_GDI_Proto_LiveTrack_StartRequest_descriptor;
            }

            private SingleFieldBuilderV3<SessionGroup, SessionGroup.Builder, SessionGroupOrBuilder> getSessionFieldBuilder() {
                if (this.sessionBuilder_ == null) {
                    this.sessionBuilder_ = new SingleFieldBuilderV3<>(getSession(), getParentForChildren(), isClean());
                    this.session_ = null;
                }
                return this.sessionBuilder_;
            }

            private SingleFieldBuilderV3<TrackerId, TrackerId.Builder, TrackerIdOrBuilder> getTrackerIdFieldBuilder() {
                if (this.trackerIdBuilder_ == null) {
                    this.trackerIdBuilder_ = new SingleFieldBuilderV3<>(getTrackerId(), getParentForChildren(), isClean());
                    this.trackerId_ = null;
                }
                return this.trackerIdBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getSessionFieldBuilder();
                    getTrackerIdFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public StartRequest build() {
                StartRequest startRequestBuildPartial = buildPartial();
                if (startRequestBuildPartial.isInitialized()) {
                    return startRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) startRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public StartRequest buildPartial() {
                StartRequest startRequest = new StartRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(startRequest);
                }
                onBuilt();
                return startRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.session_ = null;
                SingleFieldBuilderV3<SessionGroup, SessionGroup.Builder, SessionGroupOrBuilder> singleFieldBuilderV3 = this.sessionBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.sessionBuilder_ = null;
                }
                this.trackerId_ = null;
                SingleFieldBuilderV3<TrackerId, TrackerId.Builder, TrackerIdOrBuilder> singleFieldBuilderV4 = this.trackerIdBuilder_;
                if (singleFieldBuilderV4 != null) {
                    singleFieldBuilderV4.dispose();
                    this.trackerIdBuilder_ = null;
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

            public Builder clearSession() {
                this.bitField0_ &= -2;
                this.session_ = null;
                SingleFieldBuilderV3<SessionGroup, SessionGroup.Builder, SessionGroupOrBuilder> singleFieldBuilderV3 = this.sessionBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.sessionBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearTrackerId() {
                this.bitField0_ &= -3;
                this.trackerId_ = null;
                SingleFieldBuilderV3<TrackerId, TrackerId.Builder, TrackerIdOrBuilder> singleFieldBuilderV3 = this.trackerIdBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.trackerIdBuilder_ = null;
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
                return GDILiveTrackProto.internal_static_GDI_Proto_LiveTrack_StartRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.StartRequestOrBuilder
            public SessionGroup getSession() {
                SingleFieldBuilderV3<SessionGroup, SessionGroup.Builder, SessionGroupOrBuilder> singleFieldBuilderV3 = this.sessionBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SessionGroup) singleFieldBuilderV3.getMessage();
                }
                SessionGroup sessionGroup = this.session_;
                return sessionGroup == null ? SessionGroup.getDefaultInstance() : sessionGroup;
            }

            public SessionGroup.Builder getSessionBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (SessionGroup.Builder) getSessionFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.StartRequestOrBuilder
            public SessionGroupOrBuilder getSessionOrBuilder() {
                SingleFieldBuilderV3<SessionGroup, SessionGroup.Builder, SessionGroupOrBuilder> singleFieldBuilderV3 = this.sessionBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SessionGroupOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                SessionGroup sessionGroup = this.session_;
                return sessionGroup == null ? SessionGroup.getDefaultInstance() : sessionGroup;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.StartRequestOrBuilder
            public TrackerId getTrackerId() {
                SingleFieldBuilderV3<TrackerId, TrackerId.Builder, TrackerIdOrBuilder> singleFieldBuilderV3 = this.trackerIdBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (TrackerId) singleFieldBuilderV3.getMessage();
                }
                TrackerId trackerId = this.trackerId_;
                return trackerId == null ? TrackerId.getDefaultInstance() : trackerId;
            }

            public TrackerId.Builder getTrackerIdBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (TrackerId.Builder) getTrackerIdFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.StartRequestOrBuilder
            public TrackerIdOrBuilder getTrackerIdOrBuilder() {
                SingleFieldBuilderV3<TrackerId, TrackerId.Builder, TrackerIdOrBuilder> singleFieldBuilderV3 = this.trackerIdBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (TrackerIdOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                TrackerId trackerId = this.trackerId_;
                return trackerId == null ? TrackerId.getDefaultInstance() : trackerId;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.StartRequestOrBuilder
            public boolean hasSession() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.StartRequestOrBuilder
            public boolean hasTrackerId() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDILiveTrackProto.internal_static_GDI_Proto_LiveTrack_StartRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(StartRequest.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasSession() && hasTrackerId() && getSession().isInitialized();
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
                                    codedInputStream.readMessage(getSessionFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    codedInputStream.readMessage(getTrackerIdFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder mergeSession(SessionGroup sessionGroup) {
                SessionGroup sessionGroup2;
                SingleFieldBuilderV3<SessionGroup, SessionGroup.Builder, SessionGroupOrBuilder> singleFieldBuilderV3 = this.sessionBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(sessionGroup);
                } else if ((this.bitField0_ & 1) == 0 || (sessionGroup2 = this.session_) == null || sessionGroup2 == SessionGroup.getDefaultInstance()) {
                    this.session_ = sessionGroup;
                } else {
                    getSessionBuilder().mergeFrom(sessionGroup);
                }
                if (this.session_ != null) {
                    this.bitField0_ |= 1;
                    onChanged();
                }
                return this;
            }

            public Builder mergeTrackerId(TrackerId trackerId) {
                TrackerId trackerId2;
                SingleFieldBuilderV3<TrackerId, TrackerId.Builder, TrackerIdOrBuilder> singleFieldBuilderV3 = this.trackerIdBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(trackerId);
                } else if ((this.bitField0_ & 2) == 0 || (trackerId2 = this.trackerId_) == null || trackerId2 == TrackerId.getDefaultInstance()) {
                    this.trackerId_ = trackerId;
                } else {
                    getTrackerIdBuilder().mergeFrom(trackerId);
                }
                if (this.trackerId_ != null) {
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

            public Builder setSession(SessionGroup.Builder builder) {
                SingleFieldBuilderV3<SessionGroup, SessionGroup.Builder, SessionGroupOrBuilder> singleFieldBuilderV3 = this.sessionBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.session_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setTrackerId(TrackerId.Builder builder) {
                SingleFieldBuilderV3<TrackerId, TrackerId.Builder, TrackerIdOrBuilder> singleFieldBuilderV3 = this.trackerIdBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.trackerId_ = builder.build();
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
            public StartRequest getDefaultInstanceForType() {
                return StartRequest.getDefaultInstance();
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

            public Builder setSession(SessionGroup sessionGroup) {
                SingleFieldBuilderV3<SessionGroup, SessionGroup.Builder, SessionGroupOrBuilder> singleFieldBuilderV3 = this.sessionBuilder_;
                if (singleFieldBuilderV3 == null) {
                    sessionGroup.getClass();
                    this.session_ = sessionGroup;
                } else {
                    singleFieldBuilderV3.setMessage(sessionGroup);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setTrackerId(TrackerId trackerId) {
                SingleFieldBuilderV3<TrackerId, TrackerId.Builder, TrackerIdOrBuilder> singleFieldBuilderV3 = this.trackerIdBuilder_;
                if (singleFieldBuilderV3 == null) {
                    trackerId.getClass();
                    this.trackerId_ = trackerId;
                } else {
                    singleFieldBuilderV3.setMessage(trackerId);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof StartRequest) {
                    return mergeFrom((StartRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(StartRequest startRequest) {
                if (startRequest == StartRequest.getDefaultInstance()) {
                    return this;
                }
                if (startRequest.hasSession()) {
                    mergeSession(startRequest.getSession());
                }
                if (startRequest.hasTrackerId()) {
                    mergeTrackerId(startRequest.getTrackerId());
                }
                mergeUnknownFields(startRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public StartRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ StartRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private StartRequest() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static StartRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StartRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static StartRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static StartRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static StartRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static StartRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static StartRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static StartRequest parseFrom(InputStream inputStream) {
            return (StartRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static StartRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StartRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static StartRequest parseFrom(CodedInputStream codedInputStream) {
            return (StartRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static StartRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StartRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class StartResponse extends GeneratedMessageV3 implements StartResponseOrBuilder {
        private static final StartResponse DEFAULT_INSTANCE = new StartResponse();

        @Deprecated
        public static final Parser<StartResponse> PARSER = new AbstractParser<StartResponse>() { // from class: com.garmin.proto.generated.GDILiveTrackProto.StartResponse.1
            @Override // com.google.protobuf.Parser
            public StartResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = StartResponse.newBuilder();
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
        public static final int START_STATUS_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int startStatus_;

        private StartResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.startStatus_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static StartResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDILiveTrackProto.internal_static_GDI_Proto_LiveTrack_StartResponse_descriptor;
        }

        public static Builder newBuilder(StartResponse startResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(startResponse);
        }

        public static StartResponse parseDelimitedFrom(InputStream inputStream) {
            return (StartResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static StartResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<StartResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof StartResponse)) {
                return super.equals(obj);
            }
            StartResponse startResponse = (StartResponse) obj;
            if (hasStartStatus() != startResponse.hasStartStatus()) {
                return false;
            }
            return (!hasStartStatus() || this.startStatus_ == startResponse.startStatus_) && getUnknownFields().equals(startResponse.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<StartResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.startStatus_) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.StartResponseOrBuilder
        public Status getStartStatus() {
            Status statusForNumber = Status.forNumber(this.startStatus_);
            return statusForNumber == null ? Status.ERROR : statusForNumber;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.StartResponseOrBuilder
        public boolean hasStartStatus() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasStartStatus()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + this.startStatus_;
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDILiveTrackProto.internal_static_GDI_Proto_LiveTrack_StartResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(StartResponse.class, Builder.class);
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
            if (hasStartStatus()) {
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
            return new StartResponse();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeEnum(1, this.startStatus_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements StartResponseOrBuilder {
            private int bitField0_;
            private int startStatus_;

            private Builder() {
                this.startStatus_ = 0;
            }

            private void buildPartial0(StartResponse startResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    startResponse.startStatus_ = this.startStatus_;
                } else {
                    i14 = 0;
                }
                startResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDILiveTrackProto.internal_static_GDI_Proto_LiveTrack_StartResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public StartResponse build() {
                StartResponse startResponseBuildPartial = buildPartial();
                if (startResponseBuildPartial.isInitialized()) {
                    return startResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) startResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public StartResponse buildPartial() {
                StartResponse startResponse = new StartResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(startResponse);
                }
                onBuilt();
                return startResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.startStatus_ = 0;
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

            public Builder clearStartStatus() {
                this.bitField0_ &= -2;
                this.startStatus_ = 0;
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
                return GDILiveTrackProto.internal_static_GDI_Proto_LiveTrack_StartResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.StartResponseOrBuilder
            public Status getStartStatus() {
                Status statusForNumber = Status.forNumber(this.startStatus_);
                return statusForNumber == null ? Status.ERROR : statusForNumber;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.StartResponseOrBuilder
            public boolean hasStartStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDILiveTrackProto.internal_static_GDI_Proto_LiveTrack_StartResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(StartResponse.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasStartStatus();
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
                                        this.startStatus_ = i14;
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

            public Builder setStartStatus(Status status) {
                status.getClass();
                this.bitField0_ |= 1;
                this.startStatus_ = status.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public StartResponse getDefaultInstanceForType() {
                return StartResponse.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.startStatus_ = 0;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof StartResponse) {
                    return mergeFrom((StartResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(StartResponse startResponse) {
                if (startResponse == StartResponse.getDefaultInstance()) {
                    return this;
                }
                if (startResponse.hasStartStatus()) {
                    setStartStatus(startResponse.getStartStatus());
                }
                mergeUnknownFields(startResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public StartResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static StartResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StartResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static StartResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ StartResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static StartResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private StartResponse() {
            this.memoizedIsInitialized = (byte) -1;
            this.startStatus_ = 0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static StartResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static StartResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static StartResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static StartResponse parseFrom(InputStream inputStream) {
            return (StartResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static StartResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StartResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static StartResponse parseFrom(CodedInputStream codedInputStream) {
            return (StartResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static StartResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StartResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum Status implements ProtocolMessageEnum {
            ERROR(0),
            ERROR_ALREADY_IN_PROGRESS(1),
            SUCCESS(2);

            public static final int ERROR_ALREADY_IN_PROGRESS_VALUE = 1;
            public static final int ERROR_VALUE = 0;
            public static final int SUCCESS_VALUE = 2;
            private final int value;
            private static final Internal.EnumLiteMap<Status> internalValueMap = new Internal.EnumLiteMap<Status>() { // from class: com.garmin.proto.generated.GDILiveTrackProto.StartResponse.Status.1
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
                    return ERROR;
                }
                if (i14 == 1) {
                    return ERROR_ALREADY_IN_PROGRESS;
                }
                if (i14 != 2) {
                    return null;
                }
                return SUCCESS;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return StartResponse.getDescriptor().getEnumTypes().get(0);
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

    public static final class StatusNotification extends GeneratedMessageV3 implements StatusNotificationOrBuilder {
        private static final StatusNotification DEFAULT_INSTANCE = new StatusNotification();

        @Deprecated
        public static final Parser<StatusNotification> PARSER = new AbstractParser<StatusNotification>() { // from class: com.garmin.proto.generated.GDILiveTrackProto.StatusNotification.1
            @Override // com.google.protobuf.Parser
            public StatusNotification parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = StatusNotification.newBuilder();
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
        public static final int SESSION_FIELD_NUMBER = 1;
        public static final int TRACKER_ID_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private SessionGroup session_;
        private TrackerId trackerId_;

        private StatusNotification(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static StatusNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDILiveTrackProto.internal_static_GDI_Proto_LiveTrack_StatusNotification_descriptor;
        }

        public static Builder newBuilder(StatusNotification statusNotification) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(statusNotification);
        }

        public static StatusNotification parseDelimitedFrom(InputStream inputStream) {
            return (StatusNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static StatusNotification parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<StatusNotification> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof StatusNotification)) {
                return super.equals(obj);
            }
            StatusNotification statusNotification = (StatusNotification) obj;
            if (hasSession() != statusNotification.hasSession()) {
                return false;
            }
            if ((!hasSession() || getSession().equals(statusNotification.getSession())) && hasTrackerId() == statusNotification.hasTrackerId()) {
                return (!hasTrackerId() || getTrackerId().equals(statusNotification.getTrackerId())) && getUnknownFields().equals(statusNotification.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<StatusNotification> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getSession()) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, getTrackerId());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.StatusNotificationOrBuilder
        public SessionGroup getSession() {
            SessionGroup sessionGroup = this.session_;
            return sessionGroup == null ? SessionGroup.getDefaultInstance() : sessionGroup;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.StatusNotificationOrBuilder
        public SessionGroupOrBuilder getSessionOrBuilder() {
            SessionGroup sessionGroup = this.session_;
            return sessionGroup == null ? SessionGroup.getDefaultInstance() : sessionGroup;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.StatusNotificationOrBuilder
        public TrackerId getTrackerId() {
            TrackerId trackerId = this.trackerId_;
            return trackerId == null ? TrackerId.getDefaultInstance() : trackerId;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.StatusNotificationOrBuilder
        public TrackerIdOrBuilder getTrackerIdOrBuilder() {
            TrackerId trackerId = this.trackerId_;
            return trackerId == null ? TrackerId.getDefaultInstance() : trackerId;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.StatusNotificationOrBuilder
        public boolean hasSession() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.StatusNotificationOrBuilder
        public boolean hasTrackerId() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasSession()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getSession().hashCode();
            }
            if (hasTrackerId()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getTrackerId().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDILiveTrackProto.internal_static_GDI_Proto_LiveTrack_StatusNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(StatusNotification.class, Builder.class);
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
            if (!hasSession() || getSession().isInitialized()) {
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
            return new StatusNotification();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getSession());
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeMessage(2, getTrackerId());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements StatusNotificationOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<SessionGroup, SessionGroup.Builder, SessionGroupOrBuilder> sessionBuilder_;
            private SessionGroup session_;
            private SingleFieldBuilderV3<TrackerId, TrackerId.Builder, TrackerIdOrBuilder> trackerIdBuilder_;
            private TrackerId trackerId_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(StatusNotification statusNotification) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    SingleFieldBuilderV3<SessionGroup, SessionGroup.Builder, SessionGroupOrBuilder> singleFieldBuilderV3 = this.sessionBuilder_;
                    statusNotification.session_ = singleFieldBuilderV3 == null ? this.session_ : (SessionGroup) singleFieldBuilderV3.build();
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    SingleFieldBuilderV3<TrackerId, TrackerId.Builder, TrackerIdOrBuilder> singleFieldBuilderV4 = this.trackerIdBuilder_;
                    statusNotification.trackerId_ = singleFieldBuilderV4 == null ? this.trackerId_ : (TrackerId) singleFieldBuilderV4.build();
                    i14 |= 2;
                }
                statusNotification.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDILiveTrackProto.internal_static_GDI_Proto_LiveTrack_StatusNotification_descriptor;
            }

            private SingleFieldBuilderV3<SessionGroup, SessionGroup.Builder, SessionGroupOrBuilder> getSessionFieldBuilder() {
                if (this.sessionBuilder_ == null) {
                    this.sessionBuilder_ = new SingleFieldBuilderV3<>(getSession(), getParentForChildren(), isClean());
                    this.session_ = null;
                }
                return this.sessionBuilder_;
            }

            private SingleFieldBuilderV3<TrackerId, TrackerId.Builder, TrackerIdOrBuilder> getTrackerIdFieldBuilder() {
                if (this.trackerIdBuilder_ == null) {
                    this.trackerIdBuilder_ = new SingleFieldBuilderV3<>(getTrackerId(), getParentForChildren(), isClean());
                    this.trackerId_ = null;
                }
                return this.trackerIdBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getSessionFieldBuilder();
                    getTrackerIdFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public StatusNotification build() {
                StatusNotification statusNotificationBuildPartial = buildPartial();
                if (statusNotificationBuildPartial.isInitialized()) {
                    return statusNotificationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) statusNotificationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public StatusNotification buildPartial() {
                StatusNotification statusNotification = new StatusNotification(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(statusNotification);
                }
                onBuilt();
                return statusNotification;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.session_ = null;
                SingleFieldBuilderV3<SessionGroup, SessionGroup.Builder, SessionGroupOrBuilder> singleFieldBuilderV3 = this.sessionBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.sessionBuilder_ = null;
                }
                this.trackerId_ = null;
                SingleFieldBuilderV3<TrackerId, TrackerId.Builder, TrackerIdOrBuilder> singleFieldBuilderV4 = this.trackerIdBuilder_;
                if (singleFieldBuilderV4 != null) {
                    singleFieldBuilderV4.dispose();
                    this.trackerIdBuilder_ = null;
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

            public Builder clearSession() {
                this.bitField0_ &= -2;
                this.session_ = null;
                SingleFieldBuilderV3<SessionGroup, SessionGroup.Builder, SessionGroupOrBuilder> singleFieldBuilderV3 = this.sessionBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.sessionBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearTrackerId() {
                this.bitField0_ &= -3;
                this.trackerId_ = null;
                SingleFieldBuilderV3<TrackerId, TrackerId.Builder, TrackerIdOrBuilder> singleFieldBuilderV3 = this.trackerIdBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.trackerIdBuilder_ = null;
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
                return GDILiveTrackProto.internal_static_GDI_Proto_LiveTrack_StatusNotification_descriptor;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.StatusNotificationOrBuilder
            public SessionGroup getSession() {
                SingleFieldBuilderV3<SessionGroup, SessionGroup.Builder, SessionGroupOrBuilder> singleFieldBuilderV3 = this.sessionBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SessionGroup) singleFieldBuilderV3.getMessage();
                }
                SessionGroup sessionGroup = this.session_;
                return sessionGroup == null ? SessionGroup.getDefaultInstance() : sessionGroup;
            }

            public SessionGroup.Builder getSessionBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (SessionGroup.Builder) getSessionFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.StatusNotificationOrBuilder
            public SessionGroupOrBuilder getSessionOrBuilder() {
                SingleFieldBuilderV3<SessionGroup, SessionGroup.Builder, SessionGroupOrBuilder> singleFieldBuilderV3 = this.sessionBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SessionGroupOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                SessionGroup sessionGroup = this.session_;
                return sessionGroup == null ? SessionGroup.getDefaultInstance() : sessionGroup;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.StatusNotificationOrBuilder
            public TrackerId getTrackerId() {
                SingleFieldBuilderV3<TrackerId, TrackerId.Builder, TrackerIdOrBuilder> singleFieldBuilderV3 = this.trackerIdBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (TrackerId) singleFieldBuilderV3.getMessage();
                }
                TrackerId trackerId = this.trackerId_;
                return trackerId == null ? TrackerId.getDefaultInstance() : trackerId;
            }

            public TrackerId.Builder getTrackerIdBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (TrackerId.Builder) getTrackerIdFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.StatusNotificationOrBuilder
            public TrackerIdOrBuilder getTrackerIdOrBuilder() {
                SingleFieldBuilderV3<TrackerId, TrackerId.Builder, TrackerIdOrBuilder> singleFieldBuilderV3 = this.trackerIdBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (TrackerIdOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                TrackerId trackerId = this.trackerId_;
                return trackerId == null ? TrackerId.getDefaultInstance() : trackerId;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.StatusNotificationOrBuilder
            public boolean hasSession() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.StatusNotificationOrBuilder
            public boolean hasTrackerId() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDILiveTrackProto.internal_static_GDI_Proto_LiveTrack_StatusNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(StatusNotification.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return !hasSession() || getSession().isInitialized();
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
                                    codedInputStream.readMessage(getSessionFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    codedInputStream.readMessage(getTrackerIdFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder mergeSession(SessionGroup sessionGroup) {
                SessionGroup sessionGroup2;
                SingleFieldBuilderV3<SessionGroup, SessionGroup.Builder, SessionGroupOrBuilder> singleFieldBuilderV3 = this.sessionBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(sessionGroup);
                } else if ((this.bitField0_ & 1) == 0 || (sessionGroup2 = this.session_) == null || sessionGroup2 == SessionGroup.getDefaultInstance()) {
                    this.session_ = sessionGroup;
                } else {
                    getSessionBuilder().mergeFrom(sessionGroup);
                }
                if (this.session_ != null) {
                    this.bitField0_ |= 1;
                    onChanged();
                }
                return this;
            }

            public Builder mergeTrackerId(TrackerId trackerId) {
                TrackerId trackerId2;
                SingleFieldBuilderV3<TrackerId, TrackerId.Builder, TrackerIdOrBuilder> singleFieldBuilderV3 = this.trackerIdBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(trackerId);
                } else if ((this.bitField0_ & 2) == 0 || (trackerId2 = this.trackerId_) == null || trackerId2 == TrackerId.getDefaultInstance()) {
                    this.trackerId_ = trackerId;
                } else {
                    getTrackerIdBuilder().mergeFrom(trackerId);
                }
                if (this.trackerId_ != null) {
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

            public Builder setSession(SessionGroup.Builder builder) {
                SingleFieldBuilderV3<SessionGroup, SessionGroup.Builder, SessionGroupOrBuilder> singleFieldBuilderV3 = this.sessionBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.session_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setTrackerId(TrackerId.Builder builder) {
                SingleFieldBuilderV3<TrackerId, TrackerId.Builder, TrackerIdOrBuilder> singleFieldBuilderV3 = this.trackerIdBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.trackerId_ = builder.build();
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
            public StatusNotification getDefaultInstanceForType() {
                return StatusNotification.getDefaultInstance();
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

            public Builder setSession(SessionGroup sessionGroup) {
                SingleFieldBuilderV3<SessionGroup, SessionGroup.Builder, SessionGroupOrBuilder> singleFieldBuilderV3 = this.sessionBuilder_;
                if (singleFieldBuilderV3 == null) {
                    sessionGroup.getClass();
                    this.session_ = sessionGroup;
                } else {
                    singleFieldBuilderV3.setMessage(sessionGroup);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setTrackerId(TrackerId trackerId) {
                SingleFieldBuilderV3<TrackerId, TrackerId.Builder, TrackerIdOrBuilder> singleFieldBuilderV3 = this.trackerIdBuilder_;
                if (singleFieldBuilderV3 == null) {
                    trackerId.getClass();
                    this.trackerId_ = trackerId;
                } else {
                    singleFieldBuilderV3.setMessage(trackerId);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof StatusNotification) {
                    return mergeFrom((StatusNotification) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(StatusNotification statusNotification) {
                if (statusNotification == StatusNotification.getDefaultInstance()) {
                    return this;
                }
                if (statusNotification.hasSession()) {
                    mergeSession(statusNotification.getSession());
                }
                if (statusNotification.hasTrackerId()) {
                    mergeTrackerId(statusNotification.getTrackerId());
                }
                mergeUnknownFields(statusNotification.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public StatusNotification getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ StatusNotification(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private StatusNotification() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static StatusNotification parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StatusNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static StatusNotification parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static StatusNotification parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static StatusNotification parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static StatusNotification parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static StatusNotification parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static StatusNotification parseFrom(InputStream inputStream) {
            return (StatusNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static StatusNotification parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StatusNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static StatusNotification parseFrom(CodedInputStream codedInputStream) {
            return (StatusNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static StatusNotification parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StatusNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class StopNotification extends GeneratedMessageV3 implements StopNotificationOrBuilder {
        public static final int EXTENDED_VIEWABLE_DURATION_S_FIELD_NUMBER = 2;
        public static final int SESSION_IDS_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private long extendedViewableDurationS_;
        private byte memoizedIsInitialized;
        private LazyStringArrayList sessionIds_;
        private static final StopNotification DEFAULT_INSTANCE = new StopNotification();

        @Deprecated
        public static final Parser<StopNotification> PARSER = new AbstractParser<StopNotification>() { // from class: com.garmin.proto.generated.GDILiveTrackProto.StopNotification.1
            @Override // com.google.protobuf.Parser
            public StopNotification parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = StopNotification.newBuilder();
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

        private StopNotification() {
            this.sessionIds_ = LazyStringArrayList.emptyList();
            this.extendedViewableDurationS_ = 0L;
            this.memoizedIsInitialized = (byte) -1;
            this.sessionIds_ = LazyStringArrayList.emptyList();
        }

        public static StopNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDILiveTrackProto.internal_static_GDI_Proto_LiveTrack_StopNotification_descriptor;
        }

        public static Builder newBuilder(StopNotification stopNotification) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(stopNotification);
        }

        public static StopNotification parseDelimitedFrom(InputStream inputStream) {
            return (StopNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static StopNotification parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<StopNotification> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof StopNotification)) {
                return super.equals(obj);
            }
            StopNotification stopNotification = (StopNotification) obj;
            if (getSessionIdsList().equals(stopNotification.getSessionIdsList()) && hasExtendedViewableDurationS() == stopNotification.hasExtendedViewableDurationS()) {
                return (!hasExtendedViewableDurationS() || getExtendedViewableDurationS() == stopNotification.getExtendedViewableDurationS()) && getUnknownFields().equals(stopNotification.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.StopNotificationOrBuilder
        public long getExtendedViewableDurationS() {
            return this.extendedViewableDurationS_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<StopNotification> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iD = 0;
            for (int i15 = 0; i15 < this.sessionIds_.size(); i15++) {
                iD = f3.d(this.sessionIds_, i15, iD);
            }
            int size = getSessionIdsList().size() + iD;
            if ((this.bitField0_ & 1) != 0) {
                size += CodedOutputStream.computeUInt64Size(2, this.extendedViewableDurationS_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.StopNotificationOrBuilder
        public String getSessionIds(int i14) {
            return this.sessionIds_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.StopNotificationOrBuilder
        public ByteString getSessionIdsBytes(int i14) {
            return this.sessionIds_.getByteString(i14);
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.StopNotificationOrBuilder
        public int getSessionIdsCount() {
            return this.sessionIds_.size();
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.StopNotificationOrBuilder
        public boolean hasExtendedViewableDurationS() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (getSessionIdsCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getSessionIdsList().hashCode();
            }
            if (hasExtendedViewableDurationS()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + Internal.hashLong(getExtendedViewableDurationS());
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDILiveTrackProto.internal_static_GDI_Proto_LiveTrack_StopNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(StopNotification.class, Builder.class);
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
            return new StopNotification();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            int iE = 0;
            while (iE < this.sessionIds_.size()) {
                iE = f3.e(this.sessionIds_, iE, codedOutputStream, 1, iE, 1);
            }
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt64(2, this.extendedViewableDurationS_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements StopNotificationOrBuilder {
            private int bitField0_;
            private long extendedViewableDurationS_;
            private LazyStringArrayList sessionIds_;

            private Builder() {
                this.sessionIds_ = LazyStringArrayList.emptyList();
            }

            private void buildPartial0(StopNotification stopNotification) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    this.sessionIds_.makeImmutable();
                    stopNotification.sessionIds_ = this.sessionIds_;
                }
                if ((i15 & 2) != 0) {
                    stopNotification.extendedViewableDurationS_ = this.extendedViewableDurationS_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                stopNotification.bitField0_ = i14 | stopNotification.bitField0_;
            }

            private void ensureSessionIdsIsMutable() {
                if (!this.sessionIds_.isModifiable()) {
                    this.sessionIds_ = new LazyStringArrayList((LazyStringList) this.sessionIds_);
                }
                this.bitField0_ |= 1;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDILiveTrackProto.internal_static_GDI_Proto_LiveTrack_StopNotification_descriptor;
            }

            public Builder addAllSessionIds(Iterable<String> iterable) {
                ensureSessionIdsIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.sessionIds_);
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            public Builder addSessionIds(String str) {
                str.getClass();
                ensureSessionIdsIsMutable();
                this.sessionIds_.add(str);
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder addSessionIdsBytes(ByteString byteString) {
                byteString.getClass();
                ensureSessionIdsIsMutable();
                this.sessionIds_.add(byteString);
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public StopNotification build() {
                StopNotification stopNotificationBuildPartial = buildPartial();
                if (stopNotificationBuildPartial.isInitialized()) {
                    return stopNotificationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) stopNotificationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public StopNotification buildPartial() {
                StopNotification stopNotification = new StopNotification(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(stopNotification);
                }
                onBuilt();
                return stopNotification;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.sessionIds_ = LazyStringArrayList.emptyList();
                this.extendedViewableDurationS_ = 0L;
                return this;
            }

            public Builder clearExtendedViewableDurationS() {
                this.bitField0_ &= -3;
                this.extendedViewableDurationS_ = 0L;
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

            public Builder clearSessionIds() {
                this.sessionIds_ = LazyStringArrayList.emptyList();
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
                return GDILiveTrackProto.internal_static_GDI_Proto_LiveTrack_StopNotification_descriptor;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.StopNotificationOrBuilder
            public long getExtendedViewableDurationS() {
                return this.extendedViewableDurationS_;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.StopNotificationOrBuilder
            public String getSessionIds(int i14) {
                return this.sessionIds_.get(i14);
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.StopNotificationOrBuilder
            public ByteString getSessionIdsBytes(int i14) {
                return this.sessionIds_.getByteString(i14);
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.StopNotificationOrBuilder
            public int getSessionIdsCount() {
                return this.sessionIds_.size();
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.StopNotificationOrBuilder
            public ProtocolStringList getSessionIdsList() {
                this.sessionIds_.makeImmutable();
                return this.sessionIds_;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.StopNotificationOrBuilder
            public boolean hasExtendedViewableDurationS() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDILiveTrackProto.internal_static_GDI_Proto_LiveTrack_StopNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(StopNotification.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(StopNotification stopNotification) {
                if (stopNotification == StopNotification.getDefaultInstance()) {
                    return this;
                }
                if (!stopNotification.sessionIds_.isEmpty()) {
                    if (this.sessionIds_.isEmpty()) {
                        this.sessionIds_ = stopNotification.sessionIds_;
                        this.bitField0_ |= 1;
                    } else {
                        ensureSessionIdsIsMutable();
                        this.sessionIds_.addAll(stopNotification.sessionIds_);
                    }
                    onChanged();
                }
                if (stopNotification.hasExtendedViewableDurationS()) {
                    setExtendedViewableDurationS(stopNotification.getExtendedViewableDurationS());
                }
                mergeUnknownFields(stopNotification.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder setExtendedViewableDurationS(long j8) {
                this.extendedViewableDurationS_ = j8;
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

            public Builder setSessionIds(int i14, String str) {
                str.getClass();
                ensureSessionIdsIsMutable();
                this.sessionIds_.set(i14, str);
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public StopNotification getDefaultInstanceForType() {
                return StopNotification.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.sessionIds_ = LazyStringArrayList.emptyList();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof StopNotification) {
                    return mergeFrom((StopNotification) message);
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
                                    ByteString bytes = codedInputStream.readBytes();
                                    ensureSessionIdsIsMutable();
                                    this.sessionIds_.add(bytes);
                                } else if (tag != 16) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    this.extendedViewableDurationS_ = codedInputStream.readUInt64();
                                    this.bitField0_ |= 2;
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

        @Override // com.garmin.proto.generated.GDILiveTrackProto.StopNotificationOrBuilder
        public ProtocolStringList getSessionIdsList() {
            return this.sessionIds_;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public StopNotification getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static StopNotification parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StopNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static StopNotification parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static StopNotification parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static StopNotification parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static StopNotification parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static StopNotification parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static StopNotification parseFrom(InputStream inputStream) {
            return (StopNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static StopNotification parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StopNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static StopNotification parseFrom(CodedInputStream codedInputStream) {
            return (StopNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static StopNotification parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StopNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        private StopNotification(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.sessionIds_ = LazyStringArrayList.emptyList();
            this.extendedViewableDurationS_ = 0L;
            this.memoizedIsInitialized = (byte) -1;
        }

        public /* synthetic */ StopNotification(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }
    }

    public static final class TrackerId extends GeneratedMessageV3 implements TrackerIdOrBuilder {
        public static final int DEVICE_TYPE_FIELD_NUMBER = 3;
        public static final int NICKNAME_FIELD_NUMBER = 4;
        public static final int TRACKER_ID_FIELD_NUMBER = 1;
        public static final int UNIT_ID_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int deviceType_;
        private byte memoizedIsInitialized;
        private volatile Object nickname_;
        private volatile Object trackerId_;
        private volatile Object unitId_;
        private static final TrackerId DEFAULT_INSTANCE = new TrackerId();

        @Deprecated
        public static final Parser<TrackerId> PARSER = new AbstractParser<TrackerId>() { // from class: com.garmin.proto.generated.GDILiveTrackProto.TrackerId.1
            @Override // com.google.protobuf.Parser
            public TrackerId parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = TrackerId.newBuilder();
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

        private TrackerId() {
            this.trackerId_ = "";
            this.unitId_ = "";
            this.deviceType_ = 0;
            this.nickname_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.trackerId_ = "";
            this.unitId_ = "";
            this.deviceType_ = 0;
            this.nickname_ = "";
        }

        public static TrackerId getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDILiveTrackProto.internal_static_GDI_Proto_LiveTrack_TrackerId_descriptor;
        }

        public static Builder newBuilder(TrackerId trackerId) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(trackerId);
        }

        public static TrackerId parseDelimitedFrom(InputStream inputStream) {
            return (TrackerId) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static TrackerId parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<TrackerId> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TrackerId)) {
                return super.equals(obj);
            }
            TrackerId trackerId = (TrackerId) obj;
            if (hasTrackerId() != trackerId.hasTrackerId()) {
                return false;
            }
            if ((hasTrackerId() && !getTrackerId().equals(trackerId.getTrackerId())) || hasUnitId() != trackerId.hasUnitId()) {
                return false;
            }
            if ((hasUnitId() && !getUnitId().equals(trackerId.getUnitId())) || hasDeviceType() != trackerId.hasDeviceType()) {
                return false;
            }
            if ((!hasDeviceType() || this.deviceType_ == trackerId.deviceType_) && hasNickname() == trackerId.hasNickname()) {
                return (!hasNickname() || getNickname().equals(trackerId.getNickname())) && getUnknownFields().equals(trackerId.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.TrackerIdOrBuilder
        public DeviceType getDeviceType() {
            DeviceType deviceTypeForNumber = DeviceType.forNumber(this.deviceType_);
            return deviceTypeForNumber == null ? DeviceType.PND : deviceTypeForNumber;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.TrackerIdOrBuilder
        public String getNickname() {
            Object obj = this.nickname_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.nickname_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.TrackerIdOrBuilder
        public ByteString getNicknameBytes() {
            Object obj = this.nickname_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.nickname_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<TrackerId> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeStringSize = (this.bitField0_ & 1) != 0 ? GeneratedMessageV3.computeStringSize(1, this.trackerId_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(2, this.unitId_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeStringSize += CodedOutputStream.computeEnumSize(3, this.deviceType_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(4, this.nickname_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeStringSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.TrackerIdOrBuilder
        public String getTrackerId() {
            Object obj = this.trackerId_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.trackerId_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.TrackerIdOrBuilder
        public ByteString getTrackerIdBytes() {
            Object obj = this.trackerId_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.trackerId_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.TrackerIdOrBuilder
        public String getUnitId() {
            Object obj = this.unitId_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.unitId_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.TrackerIdOrBuilder
        public ByteString getUnitIdBytes() {
            Object obj = this.unitId_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.unitId_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.TrackerIdOrBuilder
        public boolean hasDeviceType() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.TrackerIdOrBuilder
        public boolean hasNickname() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.TrackerIdOrBuilder
        public boolean hasTrackerId() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.TrackerIdOrBuilder
        public boolean hasUnitId() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasTrackerId()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getTrackerId().hashCode();
            }
            if (hasUnitId()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getUnitId().hashCode();
            }
            if (hasDeviceType()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + this.deviceType_;
            }
            if (hasNickname()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getNickname().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDILiveTrackProto.internal_static_GDI_Proto_LiveTrack_TrackerId_fieldAccessorTable.ensureFieldAccessorsInitialized(TrackerId.class, Builder.class);
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
            return new TrackerId();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.trackerId_);
            }
            if ((this.bitField0_ & 2) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 2, this.unitId_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeEnum(3, this.deviceType_);
            }
            if ((this.bitField0_ & 8) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 4, this.nickname_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements TrackerIdOrBuilder {
            private int bitField0_;
            private int deviceType_;
            private Object nickname_;
            private Object trackerId_;
            private Object unitId_;

            private Builder() {
                this.trackerId_ = "";
                this.unitId_ = "";
                this.deviceType_ = 0;
                this.nickname_ = "";
            }

            private void buildPartial0(TrackerId trackerId) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    trackerId.trackerId_ = this.trackerId_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    trackerId.unitId_ = this.unitId_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    trackerId.deviceType_ = this.deviceType_;
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    trackerId.nickname_ = this.nickname_;
                    i14 |= 8;
                }
                trackerId.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDILiveTrackProto.internal_static_GDI_Proto_LiveTrack_TrackerId_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public TrackerId build() {
                TrackerId trackerIdBuildPartial = buildPartial();
                if (trackerIdBuildPartial.isInitialized()) {
                    return trackerIdBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) trackerIdBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public TrackerId buildPartial() {
                TrackerId trackerId = new TrackerId(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(trackerId);
                }
                onBuilt();
                return trackerId;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.trackerId_ = "";
                this.unitId_ = "";
                this.deviceType_ = 0;
                this.nickname_ = "";
                return this;
            }

            public Builder clearDeviceType() {
                this.bitField0_ &= -5;
                this.deviceType_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearNickname() {
                this.nickname_ = TrackerId.getDefaultInstance().getNickname();
                this.bitField0_ &= -9;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearTrackerId() {
                this.trackerId_ = TrackerId.getDefaultInstance().getTrackerId();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearUnitId() {
                this.unitId_ = TrackerId.getDefaultInstance().getUnitId();
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
                return GDILiveTrackProto.internal_static_GDI_Proto_LiveTrack_TrackerId_descriptor;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.TrackerIdOrBuilder
            public DeviceType getDeviceType() {
                DeviceType deviceTypeForNumber = DeviceType.forNumber(this.deviceType_);
                return deviceTypeForNumber == null ? DeviceType.PND : deviceTypeForNumber;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.TrackerIdOrBuilder
            public String getNickname() {
                Object obj = this.nickname_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.nickname_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.TrackerIdOrBuilder
            public ByteString getNicknameBytes() {
                Object obj = this.nickname_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.nickname_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.TrackerIdOrBuilder
            public String getTrackerId() {
                Object obj = this.trackerId_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.trackerId_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.TrackerIdOrBuilder
            public ByteString getTrackerIdBytes() {
                Object obj = this.trackerId_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.trackerId_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.TrackerIdOrBuilder
            public String getUnitId() {
                Object obj = this.unitId_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.unitId_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.TrackerIdOrBuilder
            public ByteString getUnitIdBytes() {
                Object obj = this.unitId_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.unitId_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.TrackerIdOrBuilder
            public boolean hasDeviceType() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.TrackerIdOrBuilder
            public boolean hasNickname() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.TrackerIdOrBuilder
            public boolean hasTrackerId() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.TrackerIdOrBuilder
            public boolean hasUnitId() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDILiveTrackProto.internal_static_GDI_Proto_LiveTrack_TrackerId_fieldAccessorTable.ensureFieldAccessorsInitialized(TrackerId.class, Builder.class);
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
                                    this.trackerId_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    this.unitId_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 2;
                                } else if (tag == 24) {
                                    int i14 = codedInputStream.readEnum();
                                    if (DeviceType.forNumber(i14) == null) {
                                        mergeUnknownVarintField(3, i14);
                                    } else {
                                        this.deviceType_ = i14;
                                        this.bitField0_ |= 4;
                                    }
                                } else if (tag == 34) {
                                    this.nickname_ = codedInputStream.readBytes();
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

            public Builder setDeviceType(DeviceType deviceType) {
                deviceType.getClass();
                this.bitField0_ |= 4;
                this.deviceType_ = deviceType.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setNickname(String str) {
                str.getClass();
                this.nickname_ = str;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setNicknameBytes(ByteString byteString) {
                byteString.getClass();
                this.nickname_ = byteString;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setTrackerId(String str) {
                str.getClass();
                this.trackerId_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setTrackerIdBytes(ByteString byteString) {
                byteString.getClass();
                this.trackerId_ = byteString;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setUnitId(String str) {
                str.getClass();
                this.unitId_ = str;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setUnitIdBytes(ByteString byteString) {
                byteString.getClass();
                this.unitId_ = byteString;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public TrackerId getDefaultInstanceForType() {
                return TrackerId.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.trackerId_ = "";
                this.unitId_ = "";
                this.deviceType_ = 0;
                this.nickname_ = "";
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof TrackerId) {
                    return mergeFrom((TrackerId) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(TrackerId trackerId) {
                if (trackerId == TrackerId.getDefaultInstance()) {
                    return this;
                }
                if (trackerId.hasTrackerId()) {
                    this.trackerId_ = trackerId.trackerId_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (trackerId.hasUnitId()) {
                    this.unitId_ = trackerId.unitId_;
                    this.bitField0_ |= 2;
                    onChanged();
                }
                if (trackerId.hasDeviceType()) {
                    setDeviceType(trackerId.getDeviceType());
                }
                if (trackerId.hasNickname()) {
                    this.nickname_ = trackerId.nickname_;
                    this.bitField0_ |= 8;
                    onChanged();
                }
                mergeUnknownFields(trackerId.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public TrackerId getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static TrackerId parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (TrackerId) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static TrackerId parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static TrackerId parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static TrackerId parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static TrackerId parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static TrackerId parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static TrackerId parseFrom(InputStream inputStream) {
            return (TrackerId) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static TrackerId parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (TrackerId) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static TrackerId parseFrom(CodedInputStream codedInputStream) {
            return (TrackerId) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static TrackerId parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (TrackerId) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        private TrackerId(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.trackerId_ = "";
            this.unitId_ = "";
            this.deviceType_ = 0;
            this.nickname_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public /* synthetic */ TrackerId(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }
    }

    public static final class TwitterCredentials extends GeneratedMessageV3 implements TwitterCredentialsOrBuilder {
        public static final int APP_ID_FIELD_NUMBER = 3;
        public static final int APP_SECRET_FIELD_NUMBER = 4;
        private static final TwitterCredentials DEFAULT_INSTANCE = new TwitterCredentials();

        @Deprecated
        public static final Parser<TwitterCredentials> PARSER = new AbstractParser<TwitterCredentials>() { // from class: com.garmin.proto.generated.GDILiveTrackProto.TwitterCredentials.1
            @Override // com.google.protobuf.Parser
            public TwitterCredentials parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = TwitterCredentials.newBuilder();
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
        public static final int USER_SECRET_FIELD_NUMBER = 2;
        public static final int USER_TOKEN_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private volatile Object appId_;
        private volatile Object appSecret_;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private volatile Object userSecret_;
        private volatile Object userToken_;

        private TwitterCredentials() {
            this.userToken_ = "";
            this.userSecret_ = "";
            this.appId_ = "";
            this.appSecret_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.userToken_ = "";
            this.userSecret_ = "";
            this.appId_ = "";
            this.appSecret_ = "";
        }

        public static TwitterCredentials getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDILiveTrackProto.internal_static_GDI_Proto_LiveTrack_TwitterCredentials_descriptor;
        }

        public static Builder newBuilder(TwitterCredentials twitterCredentials) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(twitterCredentials);
        }

        public static TwitterCredentials parseDelimitedFrom(InputStream inputStream) {
            return (TwitterCredentials) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static TwitterCredentials parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<TwitterCredentials> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TwitterCredentials)) {
                return super.equals(obj);
            }
            TwitterCredentials twitterCredentials = (TwitterCredentials) obj;
            if (hasUserToken() != twitterCredentials.hasUserToken()) {
                return false;
            }
            if ((hasUserToken() && !getUserToken().equals(twitterCredentials.getUserToken())) || hasUserSecret() != twitterCredentials.hasUserSecret()) {
                return false;
            }
            if ((hasUserSecret() && !getUserSecret().equals(twitterCredentials.getUserSecret())) || hasAppId() != twitterCredentials.hasAppId()) {
                return false;
            }
            if ((!hasAppId() || getAppId().equals(twitterCredentials.getAppId())) && hasAppSecret() == twitterCredentials.hasAppSecret()) {
                return (!hasAppSecret() || getAppSecret().equals(twitterCredentials.getAppSecret())) && getUnknownFields().equals(twitterCredentials.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.TwitterCredentialsOrBuilder
        public String getAppId() {
            Object obj = this.appId_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.appId_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.TwitterCredentialsOrBuilder
        public ByteString getAppIdBytes() {
            Object obj = this.appId_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.appId_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.TwitterCredentialsOrBuilder
        public String getAppSecret() {
            Object obj = this.appSecret_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.appSecret_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.TwitterCredentialsOrBuilder
        public ByteString getAppSecretBytes() {
            Object obj = this.appSecret_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.appSecret_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<TwitterCredentials> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeStringSize = (this.bitField0_ & 1) != 0 ? GeneratedMessageV3.computeStringSize(1, this.userToken_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(2, this.userSecret_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(3, this.appId_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(4, this.appSecret_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeStringSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.TwitterCredentialsOrBuilder
        public String getUserSecret() {
            Object obj = this.userSecret_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.userSecret_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.TwitterCredentialsOrBuilder
        public ByteString getUserSecretBytes() {
            Object obj = this.userSecret_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.userSecret_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.TwitterCredentialsOrBuilder
        public String getUserToken() {
            Object obj = this.userToken_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.userToken_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.TwitterCredentialsOrBuilder
        public ByteString getUserTokenBytes() {
            Object obj = this.userToken_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.userToken_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.TwitterCredentialsOrBuilder
        public boolean hasAppId() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.TwitterCredentialsOrBuilder
        public boolean hasAppSecret() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.TwitterCredentialsOrBuilder
        public boolean hasUserSecret() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackProto.TwitterCredentialsOrBuilder
        public boolean hasUserToken() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasUserToken()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getUserToken().hashCode();
            }
            if (hasUserSecret()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getUserSecret().hashCode();
            }
            if (hasAppId()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getAppId().hashCode();
            }
            if (hasAppSecret()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getAppSecret().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDILiveTrackProto.internal_static_GDI_Proto_LiveTrack_TwitterCredentials_fieldAccessorTable.ensureFieldAccessorsInitialized(TwitterCredentials.class, Builder.class);
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
            if (!hasUserToken()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasUserSecret()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasAppId()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasAppSecret()) {
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
            return new TwitterCredentials();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.userToken_);
            }
            if ((this.bitField0_ & 2) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 2, this.userSecret_);
            }
            if ((this.bitField0_ & 4) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 3, this.appId_);
            }
            if ((this.bitField0_ & 8) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 4, this.appSecret_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements TwitterCredentialsOrBuilder {
            private Object appId_;
            private Object appSecret_;
            private int bitField0_;
            private Object userSecret_;
            private Object userToken_;

            private Builder() {
                this.userToken_ = "";
                this.userSecret_ = "";
                this.appId_ = "";
                this.appSecret_ = "";
            }

            private void buildPartial0(TwitterCredentials twitterCredentials) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    twitterCredentials.userToken_ = this.userToken_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    twitterCredentials.userSecret_ = this.userSecret_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    twitterCredentials.appId_ = this.appId_;
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    twitterCredentials.appSecret_ = this.appSecret_;
                    i14 |= 8;
                }
                twitterCredentials.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDILiveTrackProto.internal_static_GDI_Proto_LiveTrack_TwitterCredentials_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public TwitterCredentials build() {
                TwitterCredentials twitterCredentialsBuildPartial = buildPartial();
                if (twitterCredentialsBuildPartial.isInitialized()) {
                    return twitterCredentialsBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) twitterCredentialsBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public TwitterCredentials buildPartial() {
                TwitterCredentials twitterCredentials = new TwitterCredentials(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(twitterCredentials);
                }
                onBuilt();
                return twitterCredentials;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.userToken_ = "";
                this.userSecret_ = "";
                this.appId_ = "";
                this.appSecret_ = "";
                return this;
            }

            public Builder clearAppId() {
                this.appId_ = TwitterCredentials.getDefaultInstance().getAppId();
                this.bitField0_ &= -5;
                onChanged();
                return this;
            }

            public Builder clearAppSecret() {
                this.appSecret_ = TwitterCredentials.getDefaultInstance().getAppSecret();
                this.bitField0_ &= -9;
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

            public Builder clearUserSecret() {
                this.userSecret_ = TwitterCredentials.getDefaultInstance().getUserSecret();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            public Builder clearUserToken() {
                this.userToken_ = TwitterCredentials.getDefaultInstance().getUserToken();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.TwitterCredentialsOrBuilder
            public String getAppId() {
                Object obj = this.appId_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.appId_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.TwitterCredentialsOrBuilder
            public ByteString getAppIdBytes() {
                Object obj = this.appId_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.appId_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.TwitterCredentialsOrBuilder
            public String getAppSecret() {
                Object obj = this.appSecret_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.appSecret_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.TwitterCredentialsOrBuilder
            public ByteString getAppSecretBytes() {
                Object obj = this.appSecret_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.appSecret_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDILiveTrackProto.internal_static_GDI_Proto_LiveTrack_TwitterCredentials_descriptor;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.TwitterCredentialsOrBuilder
            public String getUserSecret() {
                Object obj = this.userSecret_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.userSecret_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.TwitterCredentialsOrBuilder
            public ByteString getUserSecretBytes() {
                Object obj = this.userSecret_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.userSecret_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.TwitterCredentialsOrBuilder
            public String getUserToken() {
                Object obj = this.userToken_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.userToken_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.TwitterCredentialsOrBuilder
            public ByteString getUserTokenBytes() {
                Object obj = this.userToken_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.userToken_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.TwitterCredentialsOrBuilder
            public boolean hasAppId() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.TwitterCredentialsOrBuilder
            public boolean hasAppSecret() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.TwitterCredentialsOrBuilder
            public boolean hasUserSecret() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackProto.TwitterCredentialsOrBuilder
            public boolean hasUserToken() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDILiveTrackProto.internal_static_GDI_Proto_LiveTrack_TwitterCredentials_fieldAccessorTable.ensureFieldAccessorsInitialized(TwitterCredentials.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasUserToken() && hasUserSecret() && hasAppId() && hasAppSecret();
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
                                    this.userToken_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    this.userSecret_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 2;
                                } else if (tag == 26) {
                                    this.appId_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 4;
                                } else if (tag == 34) {
                                    this.appSecret_ = codedInputStream.readBytes();
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

            public Builder setAppId(String str) {
                str.getClass();
                this.appId_ = str;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setAppIdBytes(ByteString byteString) {
                byteString.getClass();
                this.appId_ = byteString;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setAppSecret(String str) {
                str.getClass();
                this.appSecret_ = str;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setAppSecretBytes(ByteString byteString) {
                byteString.getClass();
                this.appSecret_ = byteString;
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

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            public Builder setUserSecret(String str) {
                str.getClass();
                this.userSecret_ = str;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setUserSecretBytes(ByteString byteString) {
                byteString.getClass();
                this.userSecret_ = byteString;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setUserToken(String str) {
                str.getClass();
                this.userToken_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setUserTokenBytes(ByteString byteString) {
                byteString.getClass();
                this.userToken_ = byteString;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public TwitterCredentials getDefaultInstanceForType() {
                return TwitterCredentials.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.userToken_ = "";
                this.userSecret_ = "";
                this.appId_ = "";
                this.appSecret_ = "";
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof TwitterCredentials) {
                    return mergeFrom((TwitterCredentials) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(TwitterCredentials twitterCredentials) {
                if (twitterCredentials == TwitterCredentials.getDefaultInstance()) {
                    return this;
                }
                if (twitterCredentials.hasUserToken()) {
                    this.userToken_ = twitterCredentials.userToken_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (twitterCredentials.hasUserSecret()) {
                    this.userSecret_ = twitterCredentials.userSecret_;
                    this.bitField0_ |= 2;
                    onChanged();
                }
                if (twitterCredentials.hasAppId()) {
                    this.appId_ = twitterCredentials.appId_;
                    this.bitField0_ |= 4;
                    onChanged();
                }
                if (twitterCredentials.hasAppSecret()) {
                    this.appSecret_ = twitterCredentials.appSecret_;
                    this.bitField0_ |= 8;
                    onChanged();
                }
                mergeUnknownFields(twitterCredentials.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public TwitterCredentials getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static TwitterCredentials parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (TwitterCredentials) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static TwitterCredentials parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static TwitterCredentials parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static TwitterCredentials parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static TwitterCredentials parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static TwitterCredentials parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static TwitterCredentials parseFrom(InputStream inputStream) {
            return (TwitterCredentials) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static TwitterCredentials parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (TwitterCredentials) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static TwitterCredentials parseFrom(CodedInputStream codedInputStream) {
            return (TwitterCredentials) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static TwitterCredentials parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (TwitterCredentials) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        private TwitterCredentials(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.userToken_ = "";
            this.userSecret_ = "";
            this.appId_ = "";
            this.appSecret_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public /* synthetic */ TwitterCredentials(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }

    public enum DeviceType implements ProtocolMessageEnum {
        PND(0),
        GTU10(1),
        EMAIL(2),
        TWITTER(4),
        MYGARMIN(5),
        MYGARMINUSER(6),
        MYGTUUSER(7),
        FITNESSAPP(8),
        GROUPTRACK(9),
        CONNECTION(10),
        STRAVA(11),
        WEARABLE(12),
        EMERGENCY(13),
        ANONYMOUS(14),
        WALDO(15),
        JRMOBILEAPP(16),
        LIVEEVENT(17),
        SMS_SUBSCRIBER(18),
        SUBSCRIPTION_SUBSCRIBER(19);

        public static final int ANONYMOUS_VALUE = 14;
        public static final int CONNECTION_VALUE = 10;
        public static final int EMAIL_VALUE = 2;
        public static final int EMERGENCY_VALUE = 13;
        public static final int FITNESSAPP_VALUE = 8;
        public static final int GROUPTRACK_VALUE = 9;
        public static final int GTU10_VALUE = 1;
        public static final int JRMOBILEAPP_VALUE = 16;
        public static final int LIVEEVENT_VALUE = 17;
        public static final int MYGARMINUSER_VALUE = 6;
        public static final int MYGARMIN_VALUE = 5;
        public static final int MYGTUUSER_VALUE = 7;
        public static final int PND_VALUE = 0;
        public static final int SMS_SUBSCRIBER_VALUE = 18;
        public static final int STRAVA_VALUE = 11;
        public static final int SUBSCRIPTION_SUBSCRIBER_VALUE = 19;
        public static final int TWITTER_VALUE = 4;
        public static final int WALDO_VALUE = 15;
        public static final int WEARABLE_VALUE = 12;
        private final int value;
        private static final Internal.EnumLiteMap<DeviceType> internalValueMap = new Internal.EnumLiteMap<DeviceType>() { // from class: com.garmin.proto.generated.GDILiveTrackProto.DeviceType.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public DeviceType findValueByNumber(int i14) {
                return DeviceType.forNumber(i14);
            }
        };
        private static final DeviceType[] VALUES = values();

        DeviceType(int i14) {
            this.value = i14;
        }

        public static DeviceType forNumber(int i14) {
            switch (i14) {
                case 0:
                    return PND;
                case 1:
                    return GTU10;
                case 2:
                    return EMAIL;
                case 3:
                default:
                    return null;
                case 4:
                    return TWITTER;
                case 5:
                    return MYGARMIN;
                case 6:
                    return MYGARMINUSER;
                case 7:
                    return MYGTUUSER;
                case 8:
                    return FITNESSAPP;
                case 9:
                    return GROUPTRACK;
                case 10:
                    return CONNECTION;
                case 11:
                    return STRAVA;
                case 12:
                    return WEARABLE;
                case 13:
                    return EMERGENCY;
                case 14:
                    return ANONYMOUS;
                case 15:
                    return WALDO;
                case 16:
                    return JRMOBILEAPP;
                case 17:
                    return LIVEEVENT;
                case 18:
                    return SMS_SUBSCRIBER;
                case 19:
                    return SUBSCRIPTION_SUBSCRIBER;
            }
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return GDILiveTrackProto.getDescriptor().getEnumTypes().get(0);
        }

        public static Internal.EnumLiteMap<DeviceType> internalGetValueMap() {
            return internalValueMap;
        }

        public static DeviceType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
        public static DeviceType valueOf(int i14) {
            return forNumber(i14);
        }
    }

    public enum SessionType implements ProtocolMessageEnum {
        UNKNOWN(-1),
        STANDARD(0),
        SOS(1),
        INCIDENT_DETECT(2),
        FALL_DETECTION(3),
        FAMILY_EMERGENCY(4);

        public static final int FALL_DETECTION_VALUE = 3;
        public static final int FAMILY_EMERGENCY_VALUE = 4;
        public static final int INCIDENT_DETECT_VALUE = 2;
        public static final int SOS_VALUE = 1;
        public static final int STANDARD_VALUE = 0;
        public static final int UNKNOWN_VALUE = -1;
        private final int value;
        private static final Internal.EnumLiteMap<SessionType> internalValueMap = new Internal.EnumLiteMap<SessionType>() { // from class: com.garmin.proto.generated.GDILiveTrackProto.SessionType.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public SessionType findValueByNumber(int i14) {
                return SessionType.forNumber(i14);
            }
        };
        private static final SessionType[] VALUES = values();

        SessionType(int i14) {
            this.value = i14;
        }

        public static SessionType forNumber(int i14) {
            if (i14 == -1) {
                return UNKNOWN;
            }
            if (i14 == 0) {
                return STANDARD;
            }
            if (i14 == 1) {
                return SOS;
            }
            if (i14 == 2) {
                return INCIDENT_DETECT;
            }
            if (i14 == 3) {
                return FALL_DETECTION;
            }
            if (i14 != 4) {
                return null;
            }
            return FAMILY_EMERGENCY;
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return GDILiveTrackProto.getDescriptor().getEnumTypes().get(1);
        }

        public static Internal.EnumLiteMap<SessionType> internalGetValueMap() {
            return internalValueMap;
        }

        public static SessionType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
        public static SessionType valueOf(int i14) {
            return forNumber(i14);
        }
    }
}
