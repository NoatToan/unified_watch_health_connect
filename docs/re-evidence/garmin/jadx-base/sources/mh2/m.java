package mh2;

import ch.qos.logback.core.joran.action.Action;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.messaging.Constants;
import org.apache.commons.codec.language.bm.Languages;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lmh2/m;", "", "", Action.KEY_ATTRIBUTE, "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public enum m {
    ACCLIMATION_ENABLED("acclimationEnabled"),
    ALARMS("alarms"),
    ALERT_TONES_ENABLED("alertTonesEnabled"),
    ALL(TtmlNode.COMBINE_ALL),
    ANY(Languages.ANY),
    AUDIO_PROMPT_DURATION("audioPromptDuration"),
    AUDIO_PROMPT_FREQUENCY("audioPromptFrequency"),
    BED_TIME("bedTime"),
    CONTROLS_MENU_LIST("controlsMenuList"),
    DEVICE_GOAL("deviceGoal"),
    DISTANCE("distance"),
    IOS("ios"),
    LABEL(Constants.ScionAnalytics.PARAM_LABEL),
    LIST("list"),
    LAP("LAP"),
    METRIC("metric"),
    PRIVACY("privacy"),
    RANGE("range"),
    SLEEP_TRACKING_ENABLED("sleepTrackingEnabled"),
    SOUNDS_IN_APP_ONLY_ENABLED("soundInAppOnlyEnabled"),
    STATUTE_UK("statute_uk"),
    STATUTE_US("statute_us"),
    STEPS("steps"),
    STATUS("status"),
    TIME("TIME"),
    UNIT("unit"),
    USER_GOAL("userGoal"),
    VOLUME("volume"),
    WAKE_TIME("wakeTime");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f118678a;

    m(String str) {
        this.f118678a = str;
    }
}
