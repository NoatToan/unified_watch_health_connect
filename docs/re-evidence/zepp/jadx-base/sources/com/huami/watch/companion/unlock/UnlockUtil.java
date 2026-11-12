package com.huami.watch.companion.unlock;

import android.content.Context;
import android.text.TextUtils;
import com.huami.device.feature.unlock.MiuiUnlockAPI;
import com.huami.watch.companion.usersettings.UserSettings;
import com.huami.watch.companion.usersettings.UserSettingsKeys;
import com.huami.watch.companion.usersettings.UserSettingsManager;
import com.huami.watch.util.Box;
import com.huami.watch.util.DeviceCompatibility;
import com.huami.watch.util.Log;

/* JADX INFO: loaded from: classes16.dex */
public class UnlockUtil {
    public static final int ROM_SUPPORT_UNLOCK_VERSION_CODE = 112;
    private static final String a = "UnlockUtil";

    public static void clearUnlockCache(Context context) {
        Log.d(a, "Clear Unlock Cache.", new Object[0]);
        Box.clearUnlockOpenDialogDisplayed();
        Box.putWatchRandomAddress("");
        saveIsUnlockUserOn(context, true);
        saveScreenUnlockEnable(context, 0);
    }

    public static boolean hasUnlockByWatch(Context context, String str) {
        try {
            if (readScreenUnlockEnable(context) == 0) {
                String watchRandomAddress = Box.getWatchRandomAddress();
                if (TextUtils.isEmpty(watchRandomAddress)) {
                    return false;
                }
                return MiuiUnlockAPI.hasSetUnlockByDevice(context, watchRandomAddress);
            }
            String unlockWatchAddress = MiuiUnlockAPI.getUnlockWatchAddress(context, str);
            if (unlockWatchAddress == null) {
                Box.putWatchRandomAddress("");
                Log.d(a, "User Watch Has Not Use To Unlcok.", new Object[0]);
                return false;
            }
            Box.putWatchRandomAddress(unlockWatchAddress);
            Log.d(a, "Unlock Watch Address : " + unlockWatchAddress, new Object[0]);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static boolean readIsUnlockUserOn(Context context) {
        boolean z = UserSettings.getBoolean(context.getContentResolver(), UserSettingsKeys.KEY_UNLOCK_SCREEN_USER_ON, true);
        Log.d(a, "Read IsUserON : " + z, new Object[0]);
        return z;
    }

    public static int readScreenUnlockEnable(Context context) {
        int i = UserSettings.getInt(context.getContentResolver(), UserSettingsKeys.KEY_UNLOCK_SCREEN_ENABLE, 0);
        Log.d(a, "Read ScreenUnlockEnable : " + i, new Object[0]);
        return i;
    }

    public static void saveIsUnlockUserOn(Context context, boolean z) {
        Log.d(a, "Save Unlock UserOn : " + z, new Object[0]);
        if (context == null) {
            Log.w(a, "Context is Null!", new Object[0]);
        } else {
            UserSettings.putBoolean(context.getContentResolver(), UserSettingsKeys.KEY_UNLOCK_SCREEN_USER_ON, z);
            UserSettingsManager.getManager(context).syncAllToCloudAsync();
        }
    }

    public static void saveScreenUnlockEnable(Context context, int i) {
        Log.d(a, "Save Screen Unlock : " + i, new Object[0]);
        UserSettings.putInt(context.getContentResolver(), UserSettingsKeys.KEY_UNLOCK_SCREEN_ENABLE, i);
        UserSettingsManager.getManager(context).syncAllToCloudAsync();
    }

    public static void unBindDevice(Context context) {
        if (DeviceCompatibility.isSupportUnlockScreen(context)) {
            String watchRandomAddress = Box.getWatchRandomAddress();
            if (!TextUtils.isEmpty(watchRandomAddress)) {
                Log.d(a, "UnbindDevice Success:" + MiuiUnlockAPI.getInstance(context).unbindDevice(watchRandomAddress), new Object[0]);
            }
            clearUnlockCache(context);
        }
    }
}
