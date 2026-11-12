package com.huami.watch.companion.account;

import android.content.Context;
import android.content.Intent;
import com.huami.watch.companion.CompanionApplication;
import com.huami.watch.companion.PlayFlavor;
import com.huami.watch.companion.bind.BindUtil;
import com.huami.watch.companion.common.Actions;
import com.huami.watch.companion.manager.UnitManager;
import com.huami.watch.companion.notification.NotificationManager;
import com.huami.watch.companion.sync.SyncCenter;
import com.huami.watch.companion.util.Broadcaster;
import com.huami.watch.companion.weather.WeatherService;
import com.huami.watch.transport.httpsupport.cacher.DataCacher;
import com.huami.watch.util.Log;

/* JADX INFO: loaded from: classes16.dex */
public class AccountCallback {
    private static final String a = "Account-Callback";

    public static void onLoginSuccess(Context context) {
        Log.d(a, "OnLoginSuccess!!", new Object[0]);
        NotificationManager.init(context);
        UnitManager.getInstance(context).init();
    }

    public static void onLogoutSuccess(Context context, boolean z) {
        BindUtil.disconnectAllDevices(context);
        SyncCenter.getCenter(context).release();
        context.stopService(new Intent(context, (Class<?>) WeatherService.class));
        if (z) {
            Account.clearAccountData(context);
        }
        if (!CompanionApplication.isOverSea) {
            PlayFlavor.unregisterMiPush(context);
        }
        DataCacher.getInstance(context).deleteAll();
        Broadcaster.sendLocalBroadcast(context, Actions.ACTION_LOGOUT_SUCCESS);
    }
}
