package com.huawei.hms.network.embedded;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.NetworkUtil;
import com.huawei.hms.network.inner.api.NetworkKitInnerImpl;
import com.huawei.hms.network.inner.api.NetworkReceiver;
import com.huawei.secure.android.common.intent.SafeBroadcastReceiver;
import java.util.Iterator;

/* JADX INFO: loaded from: classes34.dex */
public class y0 extends SafeBroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f15623a = "NetworkStateReceiver";

    @Override // com.huawei.secure.android.common.intent.SafeBroadcastReceiver
    public void onReceiveMsg(Context context, Intent intent) {
        Logger.v(f15623a, "Capture network state change");
        NetworkUtil.updateCurrentNetworkType();
        Iterator<NetworkReceiver> it = NetworkKitInnerImpl.getInstance().getNetworkBroadcastManager().a().iterator();
        while (it.hasNext()) {
            it.next().onReceiveMsg(context, intent);
        }
    }

    public static void registerNetworkState(Context context) {
        if (context == null) {
            Logger.w(f15623a, "invalid parameter");
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        try {
            context.registerReceiver(new y0(), intentFilter);
        } catch (RuntimeException unused) {
            Logger.w(f15623a, "the broadcast register failed!");
        }
        Logger.v(f15623a, "Register Network State Listen Success!");
    }
}
