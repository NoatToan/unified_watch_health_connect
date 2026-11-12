package wc0;

import ch.qos.logback.core.joran.action.Action;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lwc0/c;", "", "", Action.KEY_ATTRIBUTE, "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum c {
    ACTIVITY_AND_APPLICATIONS("activitiesAndApplications"),
    ALARMS("alarms"),
    DATA_FIELD("dataFields"),
    GARMIN_PAY("garminPay"),
    HEART_RATE_ZONES("heartRateZones"),
    HEART_RATE_ZONES_MAX_ONLY("heartRateZonesMaxOnly"),
    HELP_AND_INFO("helpAndInfo"),
    FEATURE_SETUP("featureSetup"),
    LTE("lte"),
    MUSIC("music"),
    POWER_ZONES("powerZones"),
    TEXT_RESPONSE("textResponses"),
    WATCH_FACES("watchFaces"),
    LEGACY_WATCH_FACES("legacyWatchFaces"),
    WIDGETS("widgets"),
    REORDERABLE_WIDGETS("reorderableWidgets"),
    WIFI("wifi"),
    MANAGE_CONNECT_IQ_STORAGE("manageConnectIQStorage"),
    SOLAR_INTENSITY("solarIntensity"),
    DISPLAYED_ACTIVITIES("displayedActivities"),
    DEVICE_NAME("deviceName"),
    BIRTHDAY("birthdateCustomerSupport");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f184293a;

    c(String str) {
        this.f184293a = str;
    }
}
