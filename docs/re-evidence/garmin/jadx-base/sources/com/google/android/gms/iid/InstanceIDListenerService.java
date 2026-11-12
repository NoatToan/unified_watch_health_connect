package com.google.android.gms.iid;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import b71.i;
import com.google.android.exoplayer2.v;

/* JADX INFO: loaded from: classes14.dex */
@Deprecated
public class InstanceIDListenerService extends zze {
    public static void zzd(Context context, zzak zzakVar) {
        zzakVar.zzz();
        Intent intent = new Intent("com.google.android.gms.iid.InstanceID");
        intent.putExtra("CMD", "RST");
        intent.setClassName(context, "com.google.android.gms.gcm.GcmReceiver");
        context.sendBroadcast(intent);
    }

    @Override // com.google.android.gms.iid.zze
    public void handleIntent(Intent intent) {
        if ("com.google.android.gms.iid.InstanceID".equals(intent.getAction())) {
            String stringExtra = intent.getStringExtra("subtype");
            InstanceID instanceID = InstanceID.getInstance(this, stringExtra != null ? i.d("subtype", stringExtra) : null);
            String stringExtra2 = intent.getStringExtra("CMD");
            if (Log.isLoggable("InstanceID", 3)) {
                new StringBuilder(v.a(v.a(34, stringExtra), stringExtra2));
            }
            if ("RST".equals(stringExtra2)) {
                instanceID.zzo();
                onTokenRefresh();
                return;
            }
            if ("RST_FULL".equals(stringExtra2)) {
                if (InstanceID.zzp().isEmpty()) {
                    return;
                }
                InstanceID.zzp().zzz();
                onTokenRefresh();
                return;
            }
            if ("SYNC".equals(stringExtra2)) {
                zzak zzakVarZzp = InstanceID.zzp();
                String strValueOf = String.valueOf(stringExtra);
                zzakVarZzp.zzi("|T|".length() != 0 ? strValueOf.concat("|T|") : new String(strValueOf));
                String strValueOf2 = String.valueOf(stringExtra);
                zzakVarZzp.zzi("|T-timestamp|".length() != 0 ? strValueOf2.concat("|T-timestamp|") : new String(strValueOf2));
                onTokenRefresh();
            }
        }
    }

    public void onTokenRefresh() {
    }
}
