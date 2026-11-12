package com.huawei.hms.network.embedded;

import android.content.Context;
import android.content.Intent;
import android.os.Message;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.network.inner.api.NetworkReceiver;
import com.huawei.secure.android.common.intent.SafeIntent;

/* JADX INFO: loaded from: classes34.dex */
public class m5 implements NetworkReceiver {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f15084b = "NetDiagBroadcaseReceive";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public l5 f15085a;

    @Override // com.huawei.hms.network.inner.api.NetworkReceiver
    public void onReceiveMsg(Context context, Intent intent) {
        Logger.v(f15084b, "the broadcast has received the event!");
        String actionReturnNotNull = new SafeIntent(intent).getActionReturnNotNull();
        Message messageObtain = Message.obtain();
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(actionReturnNotNull)) {
            Logger.v(f15084b, "the action is error,please check your action!");
            return;
        }
        messageObtain.what = 1002;
        messageObtain.obj = b6.m.f14635a;
        this.f15085a.b(messageObtain);
    }

    public m5(l5 l5Var) {
        this.f15085a = l5Var;
    }
}
