package com.huawei.health.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.iqd;

/* JADX INFO: loaded from: classes30.dex */
public class LoginStatusReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        LogUtil.a("Login_LoginStatusReceiver", "receive the static BroadcastReceiver , logout");
        iqd.b().e(context, intent);
    }
}
