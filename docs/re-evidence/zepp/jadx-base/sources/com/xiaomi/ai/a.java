package com.xiaomi.ai;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.xiaomi.ai.utils.Log;

/* JADX INFO: loaded from: classes18.dex */
class a extends BroadcastReceiver {
    public final /* synthetic */ BluetoothManager a;

    public a(BluetoothManager bluetoothManager) {
        this.a = bluetoothManager;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        StringBuilder sb;
        String str;
        String string;
        String action = intent.getAction();
        Log.d("MiSpeechSDK:BluetoothManager", ">>> BT SCO state changed !!! action = " + action);
        if ("android.media.ACTION_SCO_AUDIO_STATE_UPDATED".equals(action)) {
            string = "status = " + intent.getIntExtra("android.media.extra.SCO_AUDIO_STATE", -1);
        } else {
            if (!"android.bluetooth.headset.profile.action.AUDIO_STATE_CHANGED".equals(action)) {
                return;
            }
            int intExtra = intent.getIntExtra("android.bluetooth.profile.extra.STATE", -1);
            Log.d("MiSpeechSDK:BluetoothManager", "status = " + intExtra);
            if (intExtra == 10) {
                sb = new StringBuilder();
                str = "STATE_AUDIO_DISCONNECTED ";
            } else {
                if (intExtra != 12) {
                    return;
                }
                sb = new StringBuilder();
                str = "STATE_AUDIO_CONNECTED ";
            }
            sb.append(str);
            sb.append(this.a.isScoOn());
            string = sb.toString();
        }
        Log.d("MiSpeechSDK:BluetoothManager", string);
    }
}
