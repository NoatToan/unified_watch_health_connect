package com.huawei.ui.commonui.utils;

import android.content.BroadcastReceiver;
import com.huawei.haf.application.BroadcastManager;

/* JADX INFO: loaded from: classes16.dex */
public abstract class StatusBarClickedListener extends BroadcastReceiver {
    public StatusBarClickedListener() {
        BroadcastManager.b(this);
    }

    public void unregister() {
        BroadcastManager.k(this);
    }
}
