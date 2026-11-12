package com.android.billingclient.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.play_billing.zza;

/* JADX INFO: loaded from: classes2.dex */
public class ProxyBillingActivity extends Activity {

    @Nullable
    private ResultReceiver a;
    private boolean b;

    private final Intent a() {
        Intent intent = new Intent("com.android.vending.billing.PURCHASES_UPDATED");
        intent.setPackage(getApplicationContext().getPackageName());
        return intent;
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, @Nullable Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 100) {
            int responseCode = zza.zzg(intent, "ProxyBillingActivity").getResponseCode();
            if (i2 != -1) {
                StringBuilder sb = new StringBuilder(85);
                sb.append("Activity finished with resultCode ");
                sb.append(i2);
                sb.append(" and billing's responseCode: ");
                sb.append(responseCode);
                zza.zzk("ProxyBillingActivity", sb.toString());
            } else if (responseCode != 0) {
                i2 = -1;
                StringBuilder sb2 = new StringBuilder(85);
                sb2.append("Activity finished with resultCode ");
                sb2.append(i2);
                sb2.append(" and billing's responseCode: ");
                sb2.append(responseCode);
                zza.zzk("ProxyBillingActivity", sb2.toString());
            } else {
                responseCode = 0;
            }
            ResultReceiver resultReceiver = this.a;
            if (resultReceiver != null) {
                resultReceiver.send(responseCode, intent == null ? null : intent.getExtras());
            } else {
                Intent intentA = a();
                if (intent != null) {
                    if (intent.getExtras() != null) {
                        intentA.putExtras(intent.getExtras());
                    } else {
                        zza.zzk("ProxyBillingActivity", "Got null bundle!");
                        intentA.putExtra("RESPONSE_CODE", 6);
                        intentA.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
                    }
                }
                sendBroadcast(intentA);
            }
        } else {
            StringBuilder sb3 = new StringBuilder(69);
            sb3.append("Got onActivityResult with wrong requestCode: ");
            sb3.append(i);
            sb3.append("; skipping...");
            zza.zzk("ProxyBillingActivity", sb3.toString());
        }
        this.b = false;
        finish();
    }

    @Override // android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        PendingIntent pendingIntent;
        super.onCreate(bundle);
        if (bundle != null) {
            zza.zzj("ProxyBillingActivity", "Launching Play Store billing flow from savedInstanceState");
            this.b = bundle.getBoolean("send_cancelled_broadcast_if_finished", false);
            if (bundle.containsKey("result_receiver")) {
                this.a = (ResultReceiver) bundle.getParcelable("result_receiver");
                return;
            }
            return;
        }
        zza.zzj("ProxyBillingActivity", "Launching Play Store billing flow");
        if (getIntent().hasExtra("BUY_INTENT")) {
            pendingIntent = (PendingIntent) getIntent().getParcelableExtra("BUY_INTENT");
        } else if (getIntent().hasExtra("SUBS_MANAGEMENT_INTENT")) {
            pendingIntent = (PendingIntent) getIntent().getParcelableExtra("SUBS_MANAGEMENT_INTENT");
            this.a = (ResultReceiver) getIntent().getParcelableExtra("result_receiver");
        } else {
            pendingIntent = null;
        }
        try {
            this.b = true;
            startIntentSenderForResult(pendingIntent.getIntentSender(), 100, new Intent(), 0, 0, 0);
        } catch (IntentSender.SendIntentException e) {
            String strValueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 53);
            sb.append("Got exception while trying to start a purchase flow: ");
            sb.append(strValueOf);
            zza.zzk("ProxyBillingActivity", sb.toString());
            ResultReceiver resultReceiver = this.a;
            if (resultReceiver != null) {
                resultReceiver.send(6, null);
            } else {
                Intent intentA = a();
                intentA.putExtra("RESPONSE_CODE", 6);
                intentA.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
                sendBroadcast(intentA);
            }
            this.b = false;
            finish();
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (isFinishing() && this.b) {
            Intent intentA = a();
            intentA.putExtra("RESPONSE_CODE", 1);
            intentA.putExtra("DEBUG_MESSAGE", "Billing dialog closed.");
            sendBroadcast(intentA);
        }
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        ResultReceiver resultReceiver = this.a;
        if (resultReceiver != null) {
            bundle.putParcelable("result_receiver", resultReceiver);
        }
        bundle.putBoolean("send_cancelled_broadcast_if_finished", this.b);
    }
}
