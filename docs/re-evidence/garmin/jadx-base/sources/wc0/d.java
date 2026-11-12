package wc0;

import ch.qos.logback.core.joran.action.Action;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lwc0/d;", "", "", Action.KEY_ATTRIBUTE, "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum d {
    AUDIO_PROMPT_DIALECT("audioPromptDialect"),
    ALERT_VOLUME("alertVolume"),
    CONTROLS_MENU_WATCH_FACE("controlsMenuWatchFace"),
    DEVICE("device"),
    FEATURE_SETUP("featureSetup"),
    FIND_MY_DEVICE("findMyDevice"),
    HYDRATION_GOAL_RANGES("hydrationGoalRanges"),
    PREFERRED_ACTIVITY_TRACKER_TEXT("preferredActivityTrackerText"),
    PREFERRED_ACTIVITY_TRACKER("preferredActivityTracker"),
    PULSE_OX_SLEEP("pulseOxSleep"),
    REMOVE_DEVICE("removeDevice"),
    SYNC("sync"),
    HAND_ALIGNMENT("handAlignment"),
    MENU_MANAGE_DEVICE_PRIORITY("manageDevicePriority");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f184309a;

    d(String str) {
        this.f184309a = str;
    }
}
