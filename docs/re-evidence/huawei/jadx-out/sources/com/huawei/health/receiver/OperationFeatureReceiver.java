package com.huawei.health.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import com.huawei.haf.localbroadcastmanager.LocalBroadcastManager;
import com.huawei.health.MainActivityHandlerMsg;
import health.compact.a.LogUtil;

/* JADX INFO: loaded from: classes8.dex */
public class OperationFeatureReceiver extends BroadcastReceiver {
    private static OperationFeatureReceiver d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Handler f8655a;

    public OperationFeatureReceiver(Handler handler) {
        this.f8655a = handler;
    }

    public static void b(Handler handler) {
        if (d == null) {
            d = new OperationFeatureReceiver(handler);
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.huawei.plugin.operation.action_jumt_to_fearture_page");
            LocalBroadcastManager.getInstance().registerReceiver(d, intentFilter);
        }
    }

    public static void a() {
        if (d != null) {
            LocalBroadcastManager.getInstance().unregisterReceiver(d);
            d.f8655a = null;
            d = null;
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Handler handler;
        if (intent == null || (handler = this.f8655a) == null) {
            LogUtil.b("OperationFeatureReceiver", "Broadcast triggered, but intent or handler is null...");
        } else {
            handler.sendEmptyMessage(MainActivityHandlerMsg.ON_OPERATION_FEATURE_BROADCAST);
        }
    }
}
