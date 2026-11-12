package mh2;

import ch.qos.logback.core.joran.action.Action;
import com.garmin.android.gncs.NotificationConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lmh2/i;", "", "", Action.KEY_ATTRIBUTE, "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public enum i {
    ALL_DAY_VALUE_ID("allDayValueId"),
    ACTION_BAR_SAVE_TYPE("actionBarSaveType"),
    BUTTON_TITLE("buttonTitle"),
    CHILD("child"),
    COMPONENTS("components"),
    CONTENT(FirebaseAnalytics.Param.CONTENT),
    CONTROLS_MENU_LIST("controlsMenuList"),
    CUSTOM("custom"),
    DATA("data"),
    DEPENDENCIES("dependencies"),
    DISPLAY(Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION),
    DISPLAY_ARGS("displayArgs"),
    ENABLED("enabled"),
    END(TtmlNode.END),
    EXTERNAL("external"),
    HEIGHT("height"),
    ICON("icon"),
    INDEX(FirebaseAnalytics.Param.INDEX),
    INFO("info"),
    ID(TtmlNode.ATTR_ID),
    IS_REMOVABLE("isRemovable"),
    LINKS("links"),
    LOCATION(FirebaseAnalytics.Param.LOCATION),
    MENU_ITEMS("menuItems"),
    NAVIGATION("navigation"),
    NOT_VALUE("notValue"),
    OFF_VALUE("offValue"),
    OFF_VALUE_ID("offValueId"),
    ON_VALUE("onValue"),
    ON_VALUE_ID("onValueId"),
    PERSIST_ON_SELECTION("persistOnSelection"),
    PLATFORM("platform"),
    REQUIRED("required"),
    SECTION("section"),
    SETTINGS("settings"),
    SHOWN_ON_ACTION_BAR("shownOnBar"),
    SHOW_SEARCH("showSearch"),
    SLEEP_VALUE_ID("sleepValueId"),
    START(TtmlNode.START),
    STEP("step"),
    STYLE(TtmlNode.TAG_STYLE),
    TEXT("text"),
    TEXT_ARGS("textArgs"),
    TITLE("title"),
    TRANSFORM("transform"),
    TYPE(NotificationConstants.KEY_DATA_MIME_TYPE),
    URL("url"),
    VALUE("value"),
    VALUES("values"),
    VALUE_ID("valueId"),
    VALUES_BEFORE("valuesBefore"),
    VALUES_AFTER("valuesAfter"),
    VISIBILITY("visibility"),
    WATCH_FACE("watchFace"),
    WATCH_FACE_OVERFLOW("watchFaceOverflow"),
    WATCH_FACE_FALLBACK("watchFaceFallback"),
    WATCH_FACE_OVERFLOW_FALLBACK("watchFaceOverflowFallback"),
    DS_DATA_DISPLAY_VALUE_MAP("DATA_DISPLAY_VALUE_MAP"),
    DS_LABEL_VALUE("LABEL_VALUE"),
    DS_MINIMUM_VALUE("MINIMUM_VALUE"),
    DS_MAXIMUM_VALUE("MAXIMUM_VALUE"),
    DS_MAXIMUM_VALUE_FOR_DEPENDENCY("MAXIMUM_VALUE_FOR_DEPENDENCY"),
    DS_POSSIBLE_VALUES("POSSIBLE_VALUES"),
    DS_SELECTED_VALUE("SELECTED_VALUE"),
    DS_SELECTED_UNIT("SELECTED_UNIT"),
    DS_UNIT("UNIT"),
    DS_VOLUME("VOLUME"),
    DS_POPUP_TITLE_VALUE("POPUP_TITLE_VALUE");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f118617a;

    i(String str) {
        this.f118617a = str;
    }
}
