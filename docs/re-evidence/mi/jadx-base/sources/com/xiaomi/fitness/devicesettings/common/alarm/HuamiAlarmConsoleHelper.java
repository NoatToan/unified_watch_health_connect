package com.xiaomi.fitness.devicesettings.common.alarm;

import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007J\u0006\u0010\u000b\u001a\u00020\tJ\u0006\u0010\f\u001a\u00020\tJ\b\u0010\r\u001a\u00020\tH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/common/alarm/HuamiAlarmConsoleHelper;", "", "<init>", "()V", "TAG", "", "alarmId", "", "handleHMAlert", "", "id", "onHMAlarmCancel", "onMHAlarmDelay", "afterDismiss", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HuamiAlarmConsoleHelper {

    @NotNull
    private static final String TAG = "AlarmConsole";

    @NotNull
    public static final HuamiAlarmConsoleHelper INSTANCE = new HuamiAlarmConsoleHelper();
    private static int alarmId = -1;

    private HuamiAlarmConsoleHelper() {
    }

    private final void afterDismiss() {
        alarmId = -1;
    }

    public final void handleHMAlert(int id) {
        alarmId = id;
    }

    public final void onHMAlarmCancel() {
        Logger.i(TAG, "onHMAlarmCancel: " + alarmId);
        AlarmConsoleService.INSTANCE.dismissAlarm(ApplicationExtKt.getApplication(), alarmId, false);
        afterDismiss();
    }

    public final void onMHAlarmDelay() {
        Logger.i(TAG, "onMHAlarmDelay: " + alarmId);
        AlarmConsoleService.INSTANCE.dismissAlarm(ApplicationExtKt.getApplication(), alarmId, true);
        afterDismiss();
    }
}
