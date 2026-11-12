package com.google.android.gms.internal.identity;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: loaded from: classes14.dex */
public final class zzf extends zzh {
    private Activity mActivity;
    private final int zzj;

    public zzf(int i14, Activity activity) {
        this.zzj = i14;
        this.mActivity = activity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setActivity(Activity activity) {
        this.mActivity = null;
    }

    @Override // com.google.android.gms.internal.identity.zzg
    public final void zza(int i14, Bundle bundle) {
        if (i14 == 1) {
            Intent intent = new Intent();
            intent.putExtras(bundle);
            PendingIntent pendingIntentCreatePendingResult = this.mActivity.createPendingResult(this.zzj, intent, 1073741824);
            if (pendingIntentCreatePendingResult == null) {
                return;
            }
            try {
                pendingIntentCreatePendingResult.send(1);
                return;
            } catch (PendingIntent.CanceledException unused) {
                return;
            }
        }
        ConnectionResult connectionResult = new ConnectionResult(i14, bundle != null ? (PendingIntent) bundle.getParcelable("com.google.android.gms.identity.intents.EXTRA_PENDING_INTENT") : null);
        boolean zHasResolution = connectionResult.hasResolution();
        Activity activity = this.mActivity;
        if (zHasResolution) {
            try {
                connectionResult.startResolutionForResult(activity, this.zzj);
                return;
            } catch (IntentSender.SendIntentException unused2) {
                return;
            }
        }
        try {
            PendingIntent pendingIntentCreatePendingResult2 = activity.createPendingResult(this.zzj, new Intent(), 1073741824);
            if (pendingIntentCreatePendingResult2 != null) {
                pendingIntentCreatePendingResult2.send(1);
            }
        } catch (PendingIntent.CanceledException unused3) {
        }
    }
}
