package com.huawei.featureuserprofile;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.huawei.haf.application.BaseApplication;
import com.huawei.login.ui.login.LoginInit;
import defpackage.cuq;
import defpackage.daa;
import health.compact.a.util.LogUtil;

/* JADX INFO: loaded from: classes23.dex */
public class UserInfoBroadcastReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if ("com.huawei.plugin.account.login".equals(action)) {
            LogUtil.a("UserInfoBroadcastReceiver", "receive account login broadcast");
            LoginInit.getInstance(context);
            if (LoginInit.shouldLogin()) {
                LogUtil.a("UserInfoBroadcastReceiver", "allow login area");
                cuq.a(context).g();
                cuq.a(context).a();
                return;
            } else {
                LogUtil.a("UserInfoBroadcastReceiver", "not allow login area");
                cuq.a(context).d(context);
                return;
            }
        }
        if ("com.huawei.plugin.account.logout".equals(action)) {
            LogUtil.a("UserInfoBroadcastReceiver", "receive account logout broadcast");
            cuq.a(context).h();
            cuq.a(context).j();
            daa.a().a(BaseApplication.b());
            return;
        }
        LogUtil.a("UserInfoBroadcastReceiver", "not expect action");
    }
}
