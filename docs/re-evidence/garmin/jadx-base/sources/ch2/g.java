package ch2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes11.dex */
public class g extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        String stringExtra = intent.getStringExtra("com.garmin.android.gdi.EXTRA_REMOTE_DEVICE_MAC_ADDRESS");
        long longExtra = intent.getLongExtra("com.garmin.android.gdi.EXTRA_REMOTE_DEVICE_UNIT_ID", -1L);
        if (!h.f27577k.contains(stringExtra) || h.f27575i == null) {
            return;
        }
        try {
            if ("com.garmin.android.gdi.ACTION_DEVICE_DISCONNECTED".equals(action)) {
                h.f27575i.b(h.b.NOT_CONNECTED.ordinal(), longExtra);
            } else if ("com.garmin.android.gdi.ACTION_DEVICE_HANDSHAKE_COMPLETED".equals(action)) {
                h.f27575i.b(h.b.CONNECTED.ordinal(), longExtra);
            }
        } catch (Exception unused) {
        }
    }
}
