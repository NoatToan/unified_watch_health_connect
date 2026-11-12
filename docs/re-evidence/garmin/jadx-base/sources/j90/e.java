package j90;

import ch.qos.logback.core.joran.action.Action;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lj90/e;", "", "", Action.KEY_ATTRIBUTE, "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum e {
    DEVICE_SCREEN_ORIENTATION("device_screen_orientation"),
    LANGUAGE_SELECTION("language_selection"),
    WRIST_SELECTION("wrist_selection"),
    WEAR_LOCATION("wear_location"),
    BUTTON_DIRECTION("button_direction"),
    BIKE_WHEEL_CIRCUMFERENCE("bike_wheel_circumference"),
    ACTIVITY_OPTIONS("activity_options"),
    LTE_SUBSCRIPTION_TRANSFER("lte_subscription_transfer"),
    ACTIVITY_PROFILES_AND_SENSORS("activity_profiles_and_sensors");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f97808a;

    e(String str) {
        this.f97808a = str;
    }
}
