package com.huawei.health.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Message;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.MainActivityHandlerMsg;
import com.huawei.openalliance.ad.constant.Action;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.LogUtil;
import health.compact.a.ReleaseLogUtil;

/* JADX INFO: loaded from: classes8.dex */
public class AccountChangeReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static AccountChangeReceiver f8648a;
    private Handler d;

    public AccountChangeReceiver(Handler handler) {
        this.d = handler;
    }

    public static void c(Handler handler) {
        f8648a = new AccountChangeReceiver(handler);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(Action.ACTION_HW_ACCOUNT_LOGOUT);
        intentFilter.addAction("com.huawei.plugin.account.login");
        BroadcastManagerUtil.a(BaseApplication.b(), f8648a, intentFilter);
    }

    public static void e() {
        if (f8648a != null) {
            try {
                BaseApplication.b().unregisterReceiver(f8648a);
            } catch (IllegalArgumentException e) {
                ReleaseLogUtil.b("R_AccountChangeReceiver", "unregisterAccountLogoutBroadcast，IllegalArgumentException e = ", e.getMessage());
            } catch (RuntimeException e2) {
                ReleaseLogUtil.b("R_AccountChangeReceiver", "unregisterAccountLogoutBroadcast，RuntimeException e = ", e2.getMessage());
            }
            f8648a = null;
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null) {
            LogUtil.b("AccountChangeReceiver", "Broadcast triggered, but intent is null...");
            return;
        }
        Message messageObtain = Message.obtain(this.d);
        messageObtain.what = MainActivityHandlerMsg.ON_ACCOUNT_CHANGE_BROADCAST;
        messageObtain.obj = intent;
        messageObtain.sendToTarget();
    }
}
