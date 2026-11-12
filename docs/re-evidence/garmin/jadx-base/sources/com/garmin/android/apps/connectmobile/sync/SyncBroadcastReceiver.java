package com.garmin.android.apps.connectmobile.sync;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import az0.b;
import qd2.a;
import vc2.c;

/* JADX INFO: loaded from: classes10.dex */
public class SyncBroadcastReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (!action.equals("com.garmin.android.lib.connectdevicesync.ACTION_SYNC_TASK_FINISH")) {
            if (action.equals("com.garmin.android.lib.connectdevicesync.ACTION_GOLF_SWING_UPLOAD_STRATEGY_SUCCESS")) {
                a.b().i(a.b.GOLF_SWING_LIST);
            }
        } else {
            int intExtra = intent.getIntExtra("responseCode", -1);
            c cVar = b.f13673d;
            if (cVar != null) {
                cVar.a(intExtra);
            }
        }
    }
}
