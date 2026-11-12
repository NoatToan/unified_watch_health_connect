package com.huami.watch.companion.initial;

import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import com.huami.lib.qrcode.QRCodeActivity;
import com.huami.watch.companion.notification.NotificationPermissionTipActivity;
import com.huami.watch.companion.ui.activity.DeviceBindingTipActivity;
import com.huami.watch.companion.util.AnalyticsEvents;
import com.huami.watch.util.Analytics;
import com.huami.watch.util.Box;
import com.huami.watch.util.NetworkUtil;
import com.xiaomi.hm.health.device.event.StatEvent;

/* JADX INFO: loaded from: classes16.dex */
public final class InitialState {
    public static final int BIND_FIRST_TIME = 10;
    public static final int REQUEST_ENABLE_BT = 4096;
    public static final int REQUEST_ENABLE_NETWORK = 8192;
    public static int sBindState = 10;

    private InitialState() {
    }

    public static boolean environmentVerifyForBinding(Activity activity) {
        if (!isBluetoothOn()) {
            toBluetoothOnTip(activity);
            return false;
        }
        if (NetworkUtil.isOnline(activity)) {
            return true;
        }
        toNetworkUnavailable(activity);
        return false;
    }

    public static boolean isBluetoothOn() {
        return BluetoothAdapter.getDefaultAdapter().isEnabled();
    }

    public static boolean isContactTipDisplayed() {
        return Box.getContactTipDisplayed();
    }

    public static boolean isFirstBind() {
        return sBindState == 10;
    }

    public static boolean isNeedLogin() {
        return !Box.getLogined();
    }

    public static boolean isNeedShowNLSTip() {
        return Box.getNeedShowNLSTip();
    }

    public static boolean isNewUser() {
        return Box.getNewUserTag();
    }

    public static boolean isUserSavedWatchFaceSyncedToWatch() {
        return Box.getUserSavedWatchFaceSynced();
    }

    public static boolean isWhiteListTipDisplayed() {
        return Box.getWhiteListTipDisplayed();
    }

    public static void setContactTipDisplayed(boolean z) {
        Box.putContactTipDisplayed(z);
    }

    public static void setInitialled(boolean z) {
        Box.putInitialled(z);
    }

    public static void setNeedShowNLSTip(boolean z) {
        Box.putNeedShowNLSTip(z);
    }

    public static void setNewUserTag(boolean z) {
        Box.putNewUserTag(z);
    }

    public static void setUserSavedWatchFaceSyncedToWatch(boolean z) {
        Box.putUserSavedWatchFaceSynced(z);
    }

    public static void setWhiteListTipDisplayed(boolean z) {
        Box.putWhiteListTipDisplayed(z);
    }

    public static void toBindingTip(Context context, boolean z) {
        Intent intent = new Intent(context, (Class<?>) DeviceBindingTipActivity.class);
        intent.setFlags(268435456);
        intent.putExtra(StatEvent.BIND_SCREEN_LOCK_RESTORE_OUT_RESTORE, z);
        context.startActivity(intent);
    }

    public static void toBluetoothOnTip(Activity activity) {
        Intent intent = new Intent(activity, (Class<?>) InitialBluetoothNetworkTipActivity.class);
        intent.putExtra(InitialBluetoothNetworkTipActivity.MSG, InitialBluetoothNetworkTipActivity.MSG_BLUETOOTH_UNAVAILABLE);
        activity.startActivityForResult(intent, 4096);
    }

    public static void toEnableSystemNLSPermission(Context context) {
        try {
            Intent intent = new Intent("android.settings.ACTION_NOTIFICATION_LISTENER_SETTINGS");
            intent.setFlags(268435456);
            context.startActivity(intent);
            Analytics.event(context, AnalyticsEvents.EVENT_ASK_NOTI_PERMISSION, 1);
        } catch (ActivityNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void toEnableSystemNLSPermissionTip(Context context) {
        Intent intent = new Intent(context, (Class<?>) NotificationPermissionTipActivity.class);
        intent.setFlags(268435456);
        context.startActivity(intent);
    }

    public static void toNetworkUnavailable(Activity activity) {
        Intent intent = new Intent(activity, (Class<?>) InitialBluetoothNetworkTipActivity.class);
        intent.putExtra(InitialBluetoothNetworkTipActivity.MSG, InitialBluetoothNetworkTipActivity.MSG_NETWORK_UNAVAILABLE);
        activity.startActivityForResult(intent, 8192);
    }

    public static void toScan(Activity activity) {
        activity.startActivityForResult(new Intent(activity, (Class<?>) QRCodeActivity.class), 49374);
    }
}
