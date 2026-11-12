package com.huawei.health.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import androidx.media3.common.PlaybackException;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.haf.localbroadcastmanager.LocalBroadcastManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes8.dex */
public class TriggerLoginReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Handler f8664a;
    private TriggerLoginReceiver e;

    public TriggerLoginReceiver(Handler handler) {
        this.f8664a = handler;
    }

    public void c(Handler handler) {
        this.e = new TriggerLoginReceiver(handler);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.huawei.plugin.trigger.checklogin");
        LocalBroadcastManager.getInstance().registerReceiver(this.e, intentFilter);
        ObserverManagerUtil.e("com.huawei.plugin.trigger.checklogin", new Object[0]);
    }

    public void a() {
        ReleaseLogUtil.d("PLGLOGIN_TriggerLoginReceiver", "TriggerLoginReceiver unregister! INSTANCE is null?", Boolean.valueOf(this.e == null));
        if (this.e != null) {
            LocalBroadcastManager.getInstance().unregisterReceiver(this.e);
            this.e = null;
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null) {
            ReleaseLogUtil.d("PLGLOGIN_TriggerLoginReceiver", "Broadcast triggered, but intent is null...");
        } else {
            ReleaseLogUtil.d("PLGLOGIN_TriggerLoginReceiver", "TriggerLoginReceiver sendEmptyMessage: REQ_TRIGGER_ACCOUNT_LOGIN");
            this.f8664a.sendEmptyMessage(PlaybackException.ERROR_CODE_DRM_DEVICE_REVOKED);
        }
    }
}
