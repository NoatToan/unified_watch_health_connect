package com.huami.watch.companion.bind;

import android.content.Context;
import android.content.Intent;
import com.huami.watch.companion.agps.AGpsSyncHelper;
import com.huami.watch.companion.agps.AGpsSyncService;
import com.huami.watch.companion.common.Actions;
import com.huami.watch.companion.device.DeviceManager;
import com.huami.watch.companion.initial.InitialState;
import com.huami.watch.companion.sync.throttle.SyncThrottler;
import com.huami.watch.companion.unlock.UnlockUtil;
import com.huami.watch.companion.update.RomUpgradeHelper;
import com.huami.watch.companion.util.AnalyticsEvents;
import com.huami.watch.companion.util.AvatarTools;
import com.huami.watch.companion.util.Broadcaster;
import com.huami.watch.companion.weather.WeatherManager;
import com.huami.watch.companion.weather.WeatherService;
import com.huami.watch.companion.weather.WeatherWatchExtender;
import com.huami.watch.util.Box;
import com.huami.watch.util.Log;

/* JADX INFO: loaded from: classes16.dex */
public class BindCallback {
    private static final String a = "Bind-Callback";

    public static void a(Context context) {
        Log.d(a, "OnBindFinish!!", new Object[0]);
        WeatherWatchExtender.cleanLastSyncTime(context);
        WeatherManager.getManager(context).cleanSavedWeatherInfo();
        Box.clearLastSyncCenterTime();
        Box.clearLastTokenSyncTime();
        UnlockUtil.clearUnlockCache(context);
        SyncThrottler.clearSavedStates();
        AGpsSyncService.scheduleSync(context, AnalyticsEvents.EVENT_BIND_SUCCESSFUL);
        WeatherService.start(context);
    }

    public static void b(Context context) {
        Log.d(a, "OnBindStart!!", new Object[0]);
        if (context == null) {
            return;
        }
        AGpsSyncService.cancelSync(context);
        context.stopService(new Intent(context, (Class<?>) WeatherService.class));
        AGpsSyncHelper.clearLastAGpsSyncTime();
    }

    public static void c(Context context) {
        Log.d(a, "OnUnbindFinish!!", new Object[0]);
        if (context == null) {
            return;
        }
        if (!DeviceManager.getManager(context).hasBoundDevice()) {
            AGpsSyncService.cancelSync(context);
            context.stopService(new Intent(context, (Class<?>) WeatherService.class));
        }
        Broadcaster.sendLocalBroadcast(context, Actions.ACTION_UNBIND_DEVICE_FINISH);
        InitialState.setUserSavedWatchFaceSyncedToWatch(false);
        RomUpgradeHelper.getHelper(context).setLastRomUpdateVersionEmpty();
        UnlockUtil.unBindDevice(context);
        AvatarTools.clearCropFiles(context);
    }
}
