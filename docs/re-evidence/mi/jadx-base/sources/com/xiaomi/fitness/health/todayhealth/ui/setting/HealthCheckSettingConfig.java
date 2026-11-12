package com.xiaomi.fitness.health.todayhealth.ui.setting;

import androidx.health.connect.client.records.metadata.DeviceTypes;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/health/todayhealth/ui/setting/HealthCheckSettingConfig;", "", "<init>", "()V", "PREFERENCE_NAME", "", "KEY_REMINDER", "KEY_MEASURE_REMIND_ENABLE", "REMINDER_TIME_STR", "REMINDER_ENABLE_STR", "REMINDER_ENABLE_GROUP_STR", "REMINDER_REPEAT_MODE_STR", "REMINDER_DAILY_COUNT_STR", DeviceTypes.UNKNOWN, "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HealthCheckSettingConfig {

    @NotNull
    public static final HealthCheckSettingConfig INSTANCE = new HealthCheckSettingConfig();

    @NotNull
    public static final String KEY_MEASURE_REMIND_ENABLE = "reminder_enable";

    @NotNull
    public static final String KEY_REMINDER = "reminder";

    @NotNull
    public static final String PREFERENCE_NAME = "pref:health_check";

    @NotNull
    public static final String REMINDER_DAILY_COUNT_STR = "reminder_daily_count";

    @NotNull
    public static final String REMINDER_ENABLE_GROUP_STR = "reminder_enable_group";

    @NotNull
    public static final String REMINDER_ENABLE_STR = "reminder_enable";

    @NotNull
    public static final String REMINDER_REPEAT_MODE_STR = "reminder_repeat_mode";

    @NotNull
    public static final String REMINDER_TIME_STR = "custom_reminder_time";

    @NotNull
    public static final String UNKNOWN = "unknown";

    private HealthCheckSettingConfig() {
    }
}
