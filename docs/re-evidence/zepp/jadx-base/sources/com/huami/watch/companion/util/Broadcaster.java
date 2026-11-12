package com.huami.watch.companion.util;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.huami.watch.util.Log;

/* JADX INFO: loaded from: classes16.dex */
public class Broadcaster {
    private static final String a = "Broadcaster";

    public static void sendLocalBroadcast(Context context, String str) {
        sendLocalBroadcast(context, str, null);
    }

    public static void sendLocalBroadcast(Context context, String str, Bundle bundle) {
        Intent intent = new Intent(str);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        Log.d(a, "Broadcast <" + str + ">, Scheduled: " + LocalBroadcastManager.getInstance(context).sendBroadcast(intent), new Object[0]);
    }
}
