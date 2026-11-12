package com.huami.watch.transport.httpsupport.global;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import clc.utils.debug.slog.SolidLogger;
import com.huami.watch.transport.httpsupport.AlarmDriver;
import com.huami.watch.transport.httpsupport.GlobalDefine;
import com.huami.watch.transport.httpsupport.transporter.blt.BltTransporter;
import io.flutter.plugins.connectivity.ConnectivityBroadcastReceiver;

/* JADX INFO: loaded from: classes9.dex */
public class ConnectionReceiver extends BroadcastReceiver {
    public static final String ACTION_ASSISTANT_SYNC_DATA = "com.huami.watch.companion.action.HOST_START_SYNC_DATA";
    public static final String ACTION_CALL_OF_DUTY = "com.huami.watch.httpsupport.COLLECT_DATA";
    public static final String ACTION_WATCH_UNBIND = "com.huami.watch.companion.action.UnbindDeviceStart";
    public static final int CALL_OF_DUTY_REQ_CODE_WEAR_COMPANION = 0;
    public static final int CALL_OF_DUTY_REQ_CODE_WEAR_SERVICES = 1;
    public static final String KEY_INTERVAL = "itvl";

    private void a(Context context, Intent intent) {
        String action = intent.getAction();
        if (!TextUtils.equals(action, ConnectivityBroadcastReceiver.CONNECTIVITY_ACTION)) {
            if (TextUtils.equals(BltTransporter.ACTION_WATCH_CONNECT_WITH_COMPANION, action)) {
                GlobalDataSyncKicker.getInstance().kick(context, 16);
                return;
            } else {
                if (!TextUtils.equals("com.huami.watch.companion.action.UnbindDeviceStart", action)) {
                    return;
                }
                if (GlobalDefine.DEBUG_COMPANION) {
                    Log.i(GlobalDefine.TAG_COMPANION, "------> 收到手助解绑消息 即将触发，缓存手助信息的重传");
                }
                SolidLogger.getInstance().with(GlobalDefine.TAG_SRV, "------> 收到手助解绑消息 即将触发，缓存手助信息的重传");
            }
        }
        GlobalDataSyncKicker.getInstance().kick(context, 8);
    }

    private void b(Context context, Intent intent) {
        String action = intent.getAction();
        if ("com.huami.watch.action.DEVICE_CONNECTION_CHANGED".equals(action) || "com.huami.watch.action.DEVICE_CONNECTION_CHANGED_IOS".equals(action)) {
            GlobalDataSyncKicker.getInstance().kick(context, 4);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        SolidLogger.withContext(context);
        if (TextUtils.equals(intent.getAction(), ACTION_CALL_OF_DUTY)) {
            if (GlobalDefine.DEBUG_COMPANION) {
                Log.i(GlobalDefine.TAG_COMPANION, "------> 收到Call of duty ,设置driver...");
            }
            SolidLogger.getInstance().with(GlobalDefine.TAG_SRV, "------> 收到Call of duty ,设置driver...");
            AlarmDriver.startAlarmDriver(context, intent.getLongExtra(KEY_INTERVAL, 3600000L));
            return;
        }
        if (GlobalDefine.IS_WATCH) {
            b(context, intent);
        } else {
            a(context, intent);
        }
    }
}
