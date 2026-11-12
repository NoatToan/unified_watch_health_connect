package com.garmin.android.apps.connectmobile.smartrequest;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes10.dex */
public class SmartRequestReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            return;
        }
        action.getClass();
        if (action.equals("com.garmin.android.gdi.ACTION_ON_CANCEL_FIND_MY_PHONE_MESSAGE_RECEIVED")) {
            Intent intent2 = new Intent(context, (Class<?>) FindMyPhoneActivity.class);
            intent2.setAction("com.garmin.android.gdi.ACTION_ON_CANCEL_FIND_MY_PHONE_MESSAGE_RECEIVED");
            intent2.addFlags(268435456);
            context.startActivity(intent2);
            return;
        }
        if (action.equals("com.garmin.android.gdi.ACTION_ON_FIND_MY_PHONE_MESSAGE_RECEIVED")) {
            Intent intent3 = new Intent(context, (Class<?>) FindMyPhoneActivity.class);
            intent3.setAction("com.garmin.android.gdi.ACTION_ON_FIND_MY_PHONE_MESSAGE_RECEIVED");
            intent3.putExtra("com.garmin.android.gdi.EXTRA_FIND_MY_PHONE_AUDIBLE_DURATION", intent.getIntExtra("com.garmin.android.gdi.EXTRA_FIND_MY_PHONE_AUDIBLE_DURATION", 0));
            intent3.putExtra("com.garmin.android.gdi.EXTRA_REMOTE_DEVICE_UNIT_ID", intent.getLongExtra("com.garmin.android.gdi.EXTRA_REMOTE_DEVICE_UNIT_ID", -1L));
            intent3.addFlags(268435456);
            context.startActivity(intent3);
        }
    }
}
