package com.huami.watch.companion.usersettings;

import android.content.Context;
import com.huami.watch.companion.ble.lostwarning.BleLostWarningManager;
import com.huami.watch.companion.dataflow.HealthData;
import com.huami.watch.companion.notification.NotificationManager;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
class a {
    public static void a(Context context, Map<String, String> map) {
        if (map.containsKey(UserSettingsKeys.KEY_WATCH_SETTINGS)) {
            NotificationManager.getManager(context).preloadIsWatchNoDisturbON(map.get(UserSettingsKeys.KEY_WATCH_SETTINGS));
        }
        if (map.containsKey("huami.watch.health.config")) {
            String str = map.get("huami.watch.health.config");
            HealthData.updateUserGoalSteps(str);
            HealthData.updateUserGoalCalorie(str);
            HealthData.updateUserIsAllDayHR(str);
            HealthData.updateIsAtrialFibrillation(str);
            HealthData.updateAfDisturbTime(str);
        }
        if (map.containsKey(UserSettingsKeys.KEY_WATCH_LOST_WARNING_ANTI_LOST) || map.containsKey(UserSettingsKeys.KEY_WATCH_LOST_WARNING_FAR_AWAY)) {
            BleLostWarningManager.get().onSettingsChanged(map.get(UserSettingsKeys.KEY_WATCH_LOST_WARNING_ANTI_LOST), map.get(UserSettingsKeys.KEY_WATCH_LOST_WARNING_FAR_AWAY));
        }
    }

    public static void b(Context context, Map<String, String> map) {
    }
}
