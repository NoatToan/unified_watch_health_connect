package com.xiaomi.eco.connection;

import android.content.ComponentName;
import android.content.Intent;
import com.miui.tsmclient.util.Constants;
import com.xiaomi.fitness.common.utils.AppUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\u001a\u001e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u0011\u001a(\u0010\u0012\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0005\u001a8\u0010\u0014\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0011\u001a0\u0010\u0018\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u0011\u001a\u0006\u0010\u001b\u001a\u00020\r\u001a\u0006\u0010\u001c\u001a\u00020\r\u001a\u0006\u0010\u001d\u001a\u00020\r\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"CONNECT_ACTION", "", "ACCOUNT_ACTION", "DEVICE_CHANGE", "ON_CONNECT_START", "", "ON_CONNECT_SUCCESS", "ON_CONNECT_FAIL", "ON_CONNECT_STOP", "ON_ACCOUNT_LOGOUT", "ON_ACCOUNT_LOGIN", "ON_SWITCH_SERVER", "broadcastConnectStart", "", "did", "mac", "current", "", "broadcastConnectSuccess", "connectType", "broadcastConnectFail", "errorCode", Constants.EXTRA_ERROR_MESSAGE, "times", "broadcastDisconnect", "status", "message", "broadcastLogout", "broadcastLogin", "broadcastSwitchServer", "eco-common-connect_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class BroadcastsKt {

    @NotNull
    public static final String ACCOUNT_ACTION = "com.xiaomi.wearable.ACCOUNT_CHANGE";

    @NotNull
    public static final String CONNECT_ACTION = "com.xiaomi.eco.DEVICE_CONNECT_STATE_CHANGE";

    @NotNull
    public static final String DEVICE_CHANGE = "com.xiaomi.wearable.DEVICE_CHANGE";
    public static final int ON_ACCOUNT_LOGIN = 2;
    public static final int ON_ACCOUNT_LOGOUT = 1;
    public static final int ON_CONNECT_FAIL = 3;
    public static final int ON_CONNECT_START = 1;
    public static final int ON_CONNECT_STOP = 4;
    public static final int ON_CONNECT_SUCCESS = 2;
    public static final int ON_SWITCH_SERVER = 3;

    public static final void broadcastConnectFail(@Nullable String str, @NotNull String mac, int i, @NotNull String errorMsg, int i2, boolean z) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        Intrinsics.checkNotNullParameter(errorMsg, "errorMsg");
        Intent intent = new Intent(CONNECT_ACTION);
        intent.putExtra("state", 3);
        intent.putExtra("code", i);
        if (str == null) {
            str = "";
        }
        intent.putExtra("did", str);
        intent.putExtra("mac", mac);
        intent.putExtra("times", i2);
        intent.putExtra(Constants.EXTRA_ERROR_MESSAGE, errorMsg);
        intent.putExtra("current_device", z);
        intent.setPackage(AppUtil.getApp().getPackageName());
        AppUtil.getApp().sendBroadcast(intent);
    }

    public static final void broadcastConnectStart(@NotNull String did, @NotNull String mac, boolean z) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(mac, "mac");
        Intent intent = new Intent(CONNECT_ACTION);
        intent.putExtra("state", 1);
        intent.putExtra("did", did);
        intent.putExtra("mac", mac);
        intent.putExtra("current_device", z);
        intent.setPackage(AppUtil.getApp().getPackageName());
        AppUtil.getApp().sendBroadcast(intent);
    }

    public static final void broadcastConnectSuccess(@Nullable String str, @NotNull String mac, boolean z, int i) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        Intent intent = new Intent(CONNECT_ACTION);
        intent.putExtra("state", 2);
        if (str == null) {
            str = "";
        }
        intent.putExtra("did", str);
        intent.putExtra("mac", mac);
        intent.putExtra("current_device", z);
        intent.putExtra("connect_type", i);
        intent.setPackage(AppUtil.getApp().getPackageName());
        AppUtil.getApp().sendBroadcast(intent);
    }

    public static final void broadcastDisconnect(@Nullable String str, @NotNull String mac, int i, @NotNull String message, boolean z) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        Intrinsics.checkNotNullParameter(message, "message");
        Intent intent = new Intent(CONNECT_ACTION);
        intent.putExtra("state", 4);
        intent.putExtra("code", i);
        intent.putExtra("message", message);
        if (str == null) {
            str = "";
        }
        intent.putExtra("did", str);
        intent.putExtra("mac", mac);
        intent.putExtra("current_device", z);
        intent.setPackage(AppUtil.getApp().getPackageName());
        AppUtil.getApp().sendBroadcast(intent);
    }

    public static final void broadcastLogin() {
        Intent intent = new Intent("com.xiaomi.wearable.ACCOUNT_CHANGE");
        intent.setComponent(new ComponentName(AppUtil.getApp().getPackageName(), "com.xiaomi.wearable.wear.connection.AccountReceiver"));
        intent.putExtra("account_state", 2);
        intent.setPackage(AppUtil.getApp().getPackageName());
        AppUtil.getApp().sendBroadcast(intent);
    }

    public static final void broadcastLogout() {
        Intent intent = new Intent("com.xiaomi.wearable.ACCOUNT_CHANGE");
        intent.setComponent(new ComponentName(AppUtil.getApp().getPackageName(), "com.xiaomi.wearable.wear.connection.AccountReceiver"));
        intent.putExtra("account_state", 1);
        intent.setPackage(AppUtil.getApp().getPackageName());
        AppUtil.getApp().sendBroadcast(intent);
    }

    public static final void broadcastSwitchServer() {
        Intent intent = new Intent("com.xiaomi.wearable.ACCOUNT_CHANGE");
        intent.setComponent(new ComponentName(AppUtil.getApp().getPackageName(), "com.xiaomi.wearable.wear.connection.AccountReceiver"));
        intent.putExtra("account_state", 3);
        AppUtil.getApp().sendBroadcast(intent);
    }
}
