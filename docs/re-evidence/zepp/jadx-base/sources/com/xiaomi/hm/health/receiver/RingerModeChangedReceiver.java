package com.xiaomi.hm.health.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.xiaomi.hm.health.utils.AudioUtils;

/* JADX INFO: loaded from: classes21.dex */
public class RingerModeChangedReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (TextUtils.isEmpty(action) || !"android.media.RINGER_MODE_CHANGED".equals(action)) {
            return;
        }
        AudioUtils.getInstance().updateCurrentState();
    }
}
