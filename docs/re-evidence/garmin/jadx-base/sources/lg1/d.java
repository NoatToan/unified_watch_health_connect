package lg1;

import ch.qos.logback.core.joran.action.Action;
import com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.AnnualReportAllowScreenshot;
import com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.AutoSyncInterval;
import com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.BaiduCloudPush;
import com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.BikeAlarmNotification;
import com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.BluetoothHFPStateChange;
import com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.CIQPushNotification;
import com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.DbTableBrowser;
import com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.DeleteAllOnboardingItems;
import com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.DeviceSoftwareUpdateMode;
import com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.DisablePairingConstraints;
import com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.DisablePrompts;
import com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.DisableReportImageRestriction;
import com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.EcgVisibility;
import com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.EnableAutoSync;
import com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.EnableLTEActivation;
import com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.EnableMovementHrChart;
import com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.EnableNoviceCyclingItem;
import com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.EnableOMT;
import com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.EnableProtobufLogger;
import com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.EnableRefactoredMct;
import com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.EnableRemoteConfigDevMode;
import com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.EnableStrictMemoryMode;
import com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.EnableSync;
import com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.EnableWorkoutBenefit;
import com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.ExportableReports;
import com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.FeedbackLoopInfo;
import com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.FontScale;
import com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.GCM5DashboardClearCache;
import com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.GNCSTailMusicLogs;
import com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.GarminAuthBonding;
import com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.GarminPay;
import com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.GarminPayConsole;
import com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.GloggerAdministration;
import com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.GoogleAgeSignalsTest;
import com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.HandAlignmentCamera;
import com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.HelpRegistry;
import com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.HttpLogger;
import com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.InReachSubscriptionReminder;
import com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.IncidentDetection;
import com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.LifestyleLoggingOnboardingReset;
import com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.LiveActivity;
import com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.LogSmartNotification;
import com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.MLREventsLogger;
import com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.ManifestInfo;
import com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.MapProviderSetting;
import com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.MimicDeviceSoftwareVersion;
import com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.MimicUserHasSeenMyScreenInfo;
import com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.MinSupportedVersion;
import com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.MobileAuthRefreshUserProfile;
import com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.MoreMenuSearchMagicItem;
import com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.MultiImagesSharingSample;
import com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.NetworkDebugScreen;
import com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.NewHRZonesTesting;
import com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.Oauth2ForSync;
import com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.OnDemandResourcesInstall;
import com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.OnboardingCardsPreview;
import com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.OnboardingEnableDateOverride;
import com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.PendingActivitiesEntry;
import com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.PermissionNotifications;
import com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.Promotions;
import com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.PushNotificationActivityUpload;
import com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.PushNotificationPurchaseConfirmation;
import com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.PushNotificationPurchaseConfirmed;
import com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.PushNotificationToast;
import com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.RemoteConfigEnv;
import com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.ResetAllDeviceLinks;
import com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.ResetLivetrackShareMethods;
import com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.SafetyFeatureResetMyDay;
import com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.SafetyFeatureWizardFlow;
import com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.ScreenlessDeviceFeatures;
import com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.SendGroupRideCodeNotification;
import com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.SendGroupRideFeatureEnableNotification;
import com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.SendIncidentDetectionNotification;
import com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.ServerEnvironment;
import com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.SetAsNewLivetrackUser;
import com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.ShowCampaigns;
import com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.ShowRemoteConfig;
import com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.ShowTestDevices;
import com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.SmartNotifications;
import com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.Subscriptions;
import com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.TagDemo;
import com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.TargetedDataDeviceSelection;
import com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.TestAnnualReportLottieAnimation;
import com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.TestAudioPrompts;
import com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.TestDSTSwitch;
import com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.TestDeviceDeepLinkingProtobufHandler;
import com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.TestDeviceTutorials;
import com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.TestFeedbackScreen;
import com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.TestRealTimeData;
import com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.TestShareableEvent;
import com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.TestShareableEventOwnerCourse;
import com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.TestShareableEventParticipant;
import com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.TestShareableEventParticipantCourse;
import com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.TestShareableEventPastOwner;
import com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.TestShareableEventPastParticipant;
import com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.TestStravaSufferMode;
import com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.TestTrainingReadinessPhrasesLong;
import com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.TestTrainingReadinessPhrasesShort;
import com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.TruSwingRawData;
import com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.UICatalog;
import com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.WeatherLocation;
import com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.WorkoutAudioPrompt;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 lg1.d[], still in use, count: 1, list:
  (r0v1 lg1.d[]) from 0x0b05: CONSTRUCTOR (r0v1 lg1.d[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B-\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Llg1/d;", "", "", Action.KEY_ATTRIBUTE, "title", "summary", "strategyName", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d {
    MANIFEST_INFO("keyBuildConfig", "Build Config", null, ManifestInfo.class.getName(), 4, null),
    SERVER_ENVIRONMENT("keyServerEnvironment", "Server Environment", null, ServerEnvironment.class.getName(), 4, null),
    REMOTE_CONFIG_ENV("keySetRemoteConfigProvider", "Set Remote Config Provider", null, RemoteConfigEnv.class.getName(), 4, null),
    SHOW_REMOTE_CONFIG("keyShowRemoteConfig", "View Remote Config", null, ShowRemoteConfig.class.getName(), 4, null),
    ENABLE_REMOTE_CONFIG_DEV_MODE("keyEnableRemoteConfigDevMode", "Enable Remote Config Dev Mode", "If enabled, cached remote config is always considered expired.", EnableRemoteConfigDevMode.class.getName()),
    MIN_SUPPORTED_VERSION("keyMinSupportedVersionServer", "Min Supported Version URL", null, MinSupportedVersion.class.getName(), 4, null),
    ON_DEMAND_RESOURCES("key_install_on_demand_resources", "On Demand Resources", null, OnDemandResourcesInstall.class.getName(), 4, null),
    GCM5_DASHBOARD_APOLLO_CACHE("key_gcm5_dashboard_apollo_cache", "Clear GCM5 Dashboard Apollo Cache", "Button. If pressed Dashboard Apollo cache is cleared.", GCM5DashboardClearCache.class.getName()),
    SUBSCRIPTIONS("key_subscriptions", "Subscriptions", null, Subscriptions.class.getName(), 4, null),
    PROMOTIONS("key_promotions", "Promotions", null, Promotions.class.getName(), 4, null),
    LIVE_ACTIVITY("key_live_activity", "Live Activity", null, LiveActivity.class.getName(), 4, null),
    DB_TABLE_BROWSER("keyDatabaseTableBrowser", "Database Table Browser", null, DbTableBrowser.class.getName(), 4, null),
    GLOGGER_ADMINISTRATION("glogger_administration", "Glogger Administration", null, GloggerAdministration.class.getName(), 4, null),
    HTTP_LOGGER("key_log_http_events", "Log HTTP Events", "Enable the logging of HTTP events to monitor the network traffic.", HttpLogger.class.getName()),
    MLR_EVENTS_LOGGING("key_mlr_events_logging", "Log MLR Events", "Enable the MLR events logging.", MLREventsLogger.class.getName()),
    ENABLE_PROTOBUF_LOGGER("key_protobuf_logger", "Log Protobuf Messages", "Enable the protobuf logger for detailed protobuf messages.", EnableProtobufLogger.class.getName()),
    GARMIN_AUTH_BONDING("keyGarminAuthBonding", "Garmin Auth Bonding", null, GarminAuthBonding.class.getName(), 4, null),
    GOOGLE_AGE_SIGNALS("keyGoogleAgeSignals", "Test Google Age Signals", null, GoogleAgeSignalsTest.class.getName(), 4, null),
    SMART_NOTIFICATIONS("key_gncs_config", "GNCS Smart Notifs Config", null, SmartNotifications.class.getName(), 4, null),
    KEY_TAG_DEMO("keyTagDemo", "Tag Demo", null, TagDemo.class.getName(), 4, null),
    UI_CATALOG("key_ui_catalog", "UI Catalog", "Garmin Design System (GDS)", UICatalog.class.getName()),
    LIFESTYLE_LOGGING_ONBOARDING_RESET("key_reset_lifestyle_logging_onboarding", "Lifestyle Logging onboarding reset", null, LifestyleLoggingOnboardingReset.class.getName(), 4, null),
    HELP_REGISTRY("key_help_registry", "Help Screens Registry", null, HelpRegistry.class.getName(), 4, null),
    GNCS_TAIL_MUSIC_LOGS("gncs_tail_music_logs", "GNCS Tail Music Logs", null, GNCSTailMusicLogs.class.getName(), 4, null),
    TARGETED_DATA_DEVICE_SELECTION("test_targeted_device_selection", "Test Targeted Device Selection (TDS)", null, TargetedDataDeviceSelection.class.getName(), 4, null),
    TRU_SWING_RAW_DATA("test_truswing_data", "View Raw TruSwing Data", null, TruSwingRawData.class.getName(), 4, null),
    TEST_AUDIO_PROMPTS("test_audio_prompts_data", "Test Audio Prompts", null, TestAudioPrompts.class.getName(), 4, null),
    LOG_SMART_NOTIFICATION("log_smart_notification", "Log Smart Notification", null, LogSmartNotification.class.getName(), 4, null),
    TEST_REAL_TIME_DATA("test_realtime_data", "Test Real Time Data", null, TestRealTimeData.class.getName(), 4, null),
    ENABLE_SYNC("keyEnableSyncButton", "Enable Sync Button", null, EnableSync.class.getName(), 4, null),
    ENABLE_AUTO_SYNC("keyEnableAutoSync", "Enable Auto Sync", null, EnableAutoSync.class.getName(), 4, null),
    AUTO_SYNC_INTERVAL("keyAutoSyncInterval", "Auto Sync Interval", null, AutoSyncInterval.class.getName(), 4, null),
    DEVICE_SOFTWARE_UPDATE_MODE("keySoftwareUpdateMode", "Software Update Mode", null, DeviceSoftwareUpdateMode.class.getName(), 4, null),
    NEW_HR_ZONES_TESTING("new_hr_zones_testing", "New HR Zones Testing", null, NewHRZonesTesting.class.getName(), 4, null),
    TEST_FEEDBACK_SCREEN("feedback_screen_testing", "Feedback Screen Testing", null, TestFeedbackScreen.class.getName(), 4, null),
    FEEDBACK_SCREEN_INFO("feedback_screen_info", "Feedback Screen Info", null, FeedbackLoopInfo.class.getName(), 4, null),
    TEST_STRAVA_SUFFER_MODE("test_strava_live_suffer_score", "Strava Suffer Score", null, TestStravaSufferMode.class.getName(), 4, null),
    RESET_LIVETRACK_SHARE_METHODS("test_live_track_share_methods", "LiveTrack: Reset Share Methods", null, ResetLivetrackShareMethods.class.getName(), 4, null),
    SET_AS_NEW_LIVETRACK_USER("test_live_track_new_user", "LiveTrack: Set as New LiveTrack User", null, SetAsNewLivetrackUser.class.getName(), 4, null),
    INCIDENT_DETECTION("test_incident_detection", "Incident Detection: Test case", null, IncidentDetection.class.getName(), 4, null),
    SEND_INCIDENT_DETECTION_NOTIFICATION("incident_detection_video_notification", "Send Incident Detection Video Notification", null, SendIncidentDetectionNotification.class.getName(), 4, null),
    PUSH_NOTIFICATION_TOAST("key_push_notification_toast", "Show Push Notification Toast", null, PushNotificationToast.class.getName(), 4, null),
    PUSH_NOTIFICATION_PURCHASE_CONFIRMATION("key_purchase_confirmation", "Purchase Confirmation Push Notification", null, PushNotificationPurchaseConfirmation.class.getName(), 4, null),
    PUSH_NOTIFICATION_PURCHASE_CONFIRMED("key_purchase_confirmed", "Purchase Confirmed Push Notification", null, PushNotificationPurchaseConfirmed.class.getName(), 4, null),
    PUSH_NOTIFICATION_ACTIVITY_UPLOAD("key_activity_upload_notification", "Activity Upload Push Notification", null, PushNotificationActivityUpload.class.getName(), 4, null),
    BLUETOOTH_HFP_STATE_CHANGE("key_bluetooth_hfp_state_change", "Voice Assistant Recognition Failed to start", "Start protobuf handler simulating an event share where HFP/CTKD voice recognition agent on the phone failed to start", BluetoothHFPStateChange.class.getName()),
    TEST_DEVICE_DEEP_LINKING_PROTOBUF("test_device_deep_linking_protobuf", "Test device deep linking protobuf", "Start deep linking protobuf handler simulating receiving event when app is in foreground and background", TestDeviceDeepLinkingProtobufHandler.class.getName()),
    TEST_DST_SWITCH("test_dst_switch", "Test Daylight Savings Auto Switch", null, TestDSTSwitch.class.getName(), 4, null),
    DISABLE_PAIRING_CONSTRAINTS("key_disable_pairing_constraints", "Disable Pairing Constraints", "Disable country exclusion & product display name check when scanning device.", DisablePairingConstraints.class.getName()),
    SHOW_TEST_DEVICES("show_test_devices", "Show Test Devices", null, ShowTestDevices.class.getName(), 4, null),
    ENABLE_STRICT_MODE_MEMORY("enable_strict_mode_memory", "Strict Memory Mode", null, EnableStrictMemoryMode.class.getName(), 4, null),
    GARMIN_PAY("keyGarminPayFeature", "GarminPay Feature", null, GarminPay.class.getName(), 4, null),
    GARMIN_PAY_CONSOLE("keyGarminPayWalletMessageConsole", "GarminPay Wallet Message Console", "A console to send GarminPay wallet message to the managed device.", GarminPayConsole.class.getName()),
    BAIDU_CLOUD_PUSH("key_baidu_cloud_push_enabled", "Baidu Cloud Push (Restart Required)", "Unavailable for vanilla build.", BaiduCloudPush.class.getName()),
    ENABLE_OMT("keyEnableOMTDemoForUploadConfig", "Enable OMT Demo Server for Upload Config", null, EnableOMT.class.getName(), 4, null),
    MIMIC_DEVICE_SOFTWARE_VERSION("key_mimic_device_software_version", "Mimic to Old Device OS", null, MimicDeviceSoftwareVersion.class.getName(), 4, null),
    CIQ_PUSH_NOTIFICATION("keyCIQPushNotifications", "Test CIQ Push Notification Manager", null, CIQPushNotification.class.getName(), 4, null),
    RESET_ALL_DEVICE_LINKS("keyResetAllDeviceLinks", "Reset All Device Links", null, ResetAllDeviceLinks.class.getName(), 4, null),
    BIKE_ALARM_NOTIFICATION("keyBikeAlarmNotificationTest", "Test Bike Alarm Notifications", null, BikeAlarmNotification.class.getName(), 4, null),
    SHOW_CAMPAIGNS("keyShowCampaigns", "Manage Campaigns", null, ShowCampaigns.class.getName(), 4, null),
    NETWORK_DEBUG_SCREEN("network_debug_screen", "Load Network Debug Screen", null, NetworkDebugScreen.class.getName(), 4, null),
    TEST_DEVICE_TUTORIALS("keyTestDeviceTutorials", "Test Device Tutorials", null, TestDeviceTutorials.class.getName(), 4, null),
    DELETE_ALL_ONBOARDING_ITEMS("keyDeleteAllOnboardingItems", "Delete all onboarding items (intranet only)", null, DeleteAllOnboardingItems.class.getName(), 4, null),
    ONBOARDING_DATE_OVERRIDE("keyOnboardingDateOverride", "Enable device onboarding date override", null, OnboardingEnableDateOverride.class.getName(), 4, null),
    ONBOARDING_ALL_ITEMS_PREVIEW("keyOnboardingCardsPreview", "Onboarding Cards preview", null, OnboardingCardsPreview.class.getName(), 4, null),
    WEATHER_LOCATION("keyWeatherLocation", "Weather Location", null, WeatherLocation.class.getName(), 4, null),
    PERMISSION_NOTIFICATIONS("keyPermissionNotifications", "Permission Notifications", null, PermissionNotifications.class.getName(), 4, null),
    MIMIC_USER_HAS_SEEN_MY_INFO_SCREEN("keyMimicUserHasSeenMyInformationScreen", "Mimic User Has Seen LTE MyInformation", null, MimicUserHasSeenMyScreenInfo.class.getName(), 4, null),
    TEST_SHAREABLE_EVENT("SE Owner", "SE Owner", null, TestShareableEvent.class.getName(), 4, null),
    TEST_SHAREABLE_EVENT_OWNER_COURSE("SE Owner Course", "SE Owner Course", null, TestShareableEventOwnerCourse.class.getName(), 4, null),
    TEST_SHAREABLE_EVENT_PARTICIPANT("SE Participant", "SE Participant", null, TestShareableEventParticipant.class.getName(), 4, null),
    TEST_SHAREABLE_EVENT_PARTICIPANT_COURSE("SE Participant Course", "SE Participant Course", null, TestShareableEventParticipantCourse.class.getName(), 4, null),
    TEST_SHAREABLE_EVENT_PAST_OWNER("SEvent Past Owner", "SEvent Past Owner", null, TestShareableEventPastOwner.class.getName(), 4, null),
    TEST_SHAREABLE_EVENT_PAST_PARTICIPANT("SEvent Past Participant", "SEvent Past Participant", null, TestShareableEventPastParticipant.class.getName(), 4, null),
    TEST_TRAINING_READINESS_PHRASES_LONG("Training Readiness Feedback Phrases Long", "Training Readiness Feedback Phrases Long", null, TestTrainingReadinessPhrasesLong.class.getName(), 4, null),
    TEST_TRAINING_READINESS_PHRASES_SHORT("Training Readiness Feedback Phrases Short", "Training Readiness Feedback Phrases Short", null, TestTrainingReadinessPhrasesShort.class.getName(), 4, null),
    WORKOUT_AUDIO_PROMPT("Workout Audio Prompt", "Workout Audio Prompt", null, WorkoutAudioPrompt.class.getName(), 4, null),
    SAFETY_FEATURE_RESET_MY_DAY("key_safety_feature_reset_my_day", "Reset Safety Feature My Day Alerts", "Reset the cache controlling the display of the Day One dialog and Red Banner My Day Card.", SafetyFeatureResetMyDay.class.getName()),
    SAFETY_FEATURE_WIZARD_FLOW("key_safety_feature_wizard_flow", "Restart Safety Feature Wizard", "Force yourself back into the safety features setup wizard. Has to make some async calls, so may take a while to activate.", SafetyFeatureWizardFlow.class.getName()),
    HAND_ALIGNMENT_CAMERA("key_hand_alignment_camera_dev", "Hand Alignment Camera Test", null, HandAlignmentCamera.class.getName(), 4, null),
    EXPORTABLE_REPORTS("keyExportableReports", "Download Report", null, ExportableReports.class.getName(), 4, null),
    FONT_SCALE("keyFontScale", "Font scale", null, FontScale.class.getName(), 4, null),
    SAMD_VISIBILITY("samdVisibility", "SAMD Visibility", null, EcgVisibility.class.getName(), 4, null),
    ENABLE_LTE_ACTIVATION("key_lte_webview_finished", "Enable LTE Activation & In Process", "If enabled, user is in process activation for LTE and will get a in process screen (if API doesn't return a valid subscription)", EnableLTEActivation.class.getName()),
    DISABLE_REPORT_IMAGE_RESTRICTION("key_disable_report_image_restriction", "Disable Report Image Remote Config Restriction", "If toggled, we will disable the remote config restriction of report image features across the app.", DisableReportImageRestriction.class.getName()),
    DISABLE_PROMPTS("key_disable_prompts", "Disable Prompts For Automated Testing", "If toggled, we will disable both the prompts that brings the user to the Finish Setup page after initially pairing and the daily prompts asking the user if they want to set up a feature.", DisablePrompts.class.getName()),
    MAP_PROVIDER("key_map_provider", "Map Provider", null, MapProviderSetting.class.getName(), 4, null),
    SEND_GROUP_RIDE_CODE_NOTIFICATION("send_group_ride_code_notification", "Send Group Ride code notification", null, SendGroupRideCodeNotification.class.getName(), 4, null),
    SEND_GROUP_RIDE_FEATURE_ENABLE_NOTIFICATION("send_group_ride_feature_enable_notification", "Send Group Ride feature enable notification", null, SendGroupRideFeatureEnableNotification.class.getName(), 4, null),
    ENABLE_WORKOUT_BENEFIT("key_enable_workout_benefit", "Workout Benefit", "If enabled, Workout Benefit will be displayed for supported activity types.", EnableWorkoutBenefit.class.getName()),
    ANNUAL_REPORT_LOTTIE_ANIMATION("key_annual_report_lottie", "Test Annual Report Lottie Animations", "Test the lottie animation for poc", TestAnnualReportLottieAnimation.class.getName()),
    ANNUAL_REPORT_ALLOW_SCREENSHOT("key_annual_report_allow_screenshot", "Enable screenshots on annual report", "Switch to ON to enable screenshots on annual report.", AnnualReportAllowScreenshot.class.getName()),
    MULTIPLE_IMAGES_SHARING_SAMPLE("key_multiple_images_sharing_sample", "Multiple Images Sharing Sample", "Sample page for sharing multiple images to other apps", MultiImagesSharingSample.class.getName()),
    ENABLE_OAUTH2_FOR_SYNC("key_enable_oauth2_for_sync", "Oauth2 for sync", "If enabled, sync will use oauth2 for authentication.", Oauth2ForSync.class.getName()),
    SCREENLESS_DEVICE_FEATURES("key_screenless_device_features", "Yogi Features", "Test Yogi features", ScreenlessDeviceFeatures.class.getName()),
    PENDING_ACTIVITIES("key_pending_activities", "Pending Activities", "Entry point for pending activitiesto be able to test pending activities list/screen.", PendingActivitiesEntry.class.getName()),
    ENABLE_MOVEMENT_HR_CHART("key_enable_preview_map", "Show movement HR chart", "If enabled, show movement HR char (dev only)", EnableMovementHrChart.class.getName()),
    ENABLE_REFACTORED_MCT("key_enable_refactored_mct", "Enable Refactored MCT", "If enabled, the refactored MCT experience will be displayed.", EnableRefactoredMct.class.getName()),
    MOBILE_AUTH_REFRESH_USER_PROFILE("key_mobile_auth_refresh_user_profile", "Mobile Auth: Refresh User Profile", "", MobileAuthRefreshUserProfile.class.getName()),
    INREACH_SUBSCRIPTION_REMINDER_OVERRIDE("key_inreach_subscription_override", "inReach subscription reminder override", "", InReachSubscriptionReminder.class.getName()),
    ENABLE_NOVICE_CYCLING_ENABLE("key_novice_cycling_enabled", "Enable Novice Cycle", "If enabled, the novice cycling supported training level will be displayed", EnableNoviceCyclingItem.class.getName()),
    MORE_MENU_SEARCH_MAGIC_WORD("keyMoreMenuSearchMagicWord", "More menu search", null, MoreMenuSearchMagicItem.class.getName(), 4, null);

    public static final /* synthetic */ w13.c Z1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f112244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f112245b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f112246c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f112247d;

    static {
        Z1 = new w13.c(dVarArr);
    }

    public /* synthetic */ d(String str, String str2, String str3, String str4, int i14, j jVar) {
        this(str, str2, (i14 & 4) != 0 ? null : str3, str4);
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) Y1.clone();
    }

    private d(String str, String str2, String str3, String str4) {
        super(str, i);
        this.f112244a = str;
        this.f112245b = str2;
        this.f112246c = str3;
        this.f112247d = str4;
    }
}
