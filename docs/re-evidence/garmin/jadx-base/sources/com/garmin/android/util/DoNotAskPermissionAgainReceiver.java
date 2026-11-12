package com.garmin.android.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.garmin.android.gncs.GNCSListenerService;
import com.garmin.android.gncs.GNCSListenerServiceConfig;
import com.garmin.android.gncs.IGNCSAppCallback;
import ih2.d;
import p005kotlin.Metadata;
import z6.a0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/util/DoNotAskPermissionAgainReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "gncs-all-modules_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class DoNotAskPermissionAgainReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        IGNCSAppCallback appCallback;
        context.getClass();
        intent.getClass();
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        int i14 = d.f93519a;
        a0.a(applicationContext).f202582b.cancel(null, 98);
        GNCSListenerServiceConfig config = GNCSListenerService.getConfig();
        if (config == null || (appCallback = config.getAppCallback()) == null) {
            return;
        }
        appCallback.userBlocksNotificationAccessRequests();
    }
}
