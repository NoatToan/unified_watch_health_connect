package com.xiaomi.fit.data.common.data.aireco;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0016\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/fit/data/common/data/aireco/AirEcoIntentionConstants;", "", "<init>", "()V", "INTENTION_AUTHORITY_URI", "", "NOTIFY_CALL_METHOD", "REVERT_CALL_METHOD", "KEY_CODE", "KEY_MESSAGE", "WIDGET_STEP_2_2_ID", "WIDGET_RAINBOW_2_2_ID", "WIDGET_SLEEP_2_2_ID", "INTENTION_NAME_ID_RAINBOW", "INTENTION_NAME_ID_STEPS", "INTENTION_NAME_ID_SLEEP", "INTENTION_NAME_RAINBOW", "INTENTION_NAME_STEPS", "INTENTION_NAME_SLEEP", "INSTANCE_ID_RAINBOW_NOT_COMPLETE", "INSTANCE_ID_RAINBOW_PARTIAL_COMPLETE", "INSTANCE_ID_RAINBOW_ALL_COMPLETE", "INSTANCE_ID_STEP_COMPLETE", "INSTANCE_ID_STEP_NOT_COMPLETE", "WIDGET_PROVIDER_NAME_STEPS_2_2", "WIDGET_PROVIDER_NAME_RAINBOW_2_2", "WIDGET_PROVIDER_NAME_SLEEP_2_2", "fitness-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AirEcoIntentionConstants {

    @NotNull
    public static final AirEcoIntentionConstants INSTANCE = new AirEcoIntentionConstants();

    @NotNull
    public static final String INSTANCE_ID_RAINBOW_ALL_COMPLETE = "view_stats_all_complete";

    @NotNull
    public static final String INSTANCE_ID_RAINBOW_NOT_COMPLETE = "view_stats_not_complete";

    @NotNull
    public static final String INSTANCE_ID_RAINBOW_PARTIAL_COMPLETE = "view_stats_partial_complete";

    @NotNull
    public static final String INSTANCE_ID_STEP_COMPLETE = "view_steps_complete";

    @NotNull
    public static final String INSTANCE_ID_STEP_NOT_COMPLETE = "view_steps_not_complete";

    @NotNull
    public static final String INTENTION_AUTHORITY_URI = "com.xiaomi.aireco.intention.IntentionContentProvider";

    @NotNull
    public static final String INTENTION_NAME_ID_RAINBOW = "504c2327e2c55436d51b0e54ba681ded";

    @NotNull
    public static final String INTENTION_NAME_ID_SLEEP = "9959aecbdda2c355b76e0f292883d890";

    @NotNull
    public static final String INTENTION_NAME_ID_STEPS = "430b3db23fb15cc0de646f1a9d5c94b8";

    @NotNull
    public static final String INTENTION_NAME_RAINBOW = "view_stats";

    @NotNull
    public static final String INTENTION_NAME_SLEEP = "view_sleep";

    @NotNull
    public static final String INTENTION_NAME_STEPS = "view_steps";

    @NotNull
    public static final String KEY_CODE = "code";

    @NotNull
    public static final String KEY_MESSAGE = "message";

    @NotNull
    public static final String NOTIFY_CALL_METHOD = "notifyIntention";

    @NotNull
    public static final String REVERT_CALL_METHOD = "revertIntention";

    @NotNull
    public static final String WIDGET_PROVIDER_NAME_RAINBOW_2_2 = "com.mi.health.rainbow.WidgetRainbowProvider_2_2";

    @NotNull
    public static final String WIDGET_PROVIDER_NAME_SLEEP_2_2 = "com.mi.health.sleep.widget.SleepWidgetProvider";

    @NotNull
    public static final String WIDGET_PROVIDER_NAME_STEPS_2_2 = "com.mi.health.exercise.widget.StepRemoteWidgetProvider";

    @NotNull
    public static final String WIDGET_RAINBOW_2_2_ID = "wd_0216433530418320112352";

    @NotNull
    public static final String WIDGET_SLEEP_2_2_ID = "wd_0216433530418780112595";

    @NotNull
    public static final String WIDGET_STEP_2_2_ID = "wd_0220210816105138013504";

    private AirEcoIntentionConstants() {
    }
}
