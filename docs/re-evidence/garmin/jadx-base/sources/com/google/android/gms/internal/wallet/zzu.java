package com.google.android.gms.internal.wallet;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.wallet.FullWallet;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.WalletConstants;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes14.dex */
final class zzu extends zzx {
    private final int zzag;
    private final WeakReference<Activity> zzeq;

    public zzu(Activity activity, int i14) {
        this.zzeq = new WeakReference<>(activity);
        this.zzag = i14;
    }

    @Override // com.google.android.gms.internal.wallet.zzx, com.google.android.gms.internal.wallet.zzq
    public final void zza(int i14, MaskedWallet maskedWallet, Bundle bundle) {
        int i15;
        Activity activity = this.zzeq.get();
        if (activity == null) {
            return;
        }
        ConnectionResult connectionResult = new ConnectionResult(i14, bundle != null ? (PendingIntent) bundle.getParcelable("com.google.android.gms.wallet.EXTRA_PENDING_INTENT") : null);
        if (connectionResult.hasResolution()) {
            try {
                connectionResult.startResolutionForResult(activity, this.zzag);
                return;
            } catch (IntentSender.SendIntentException unused) {
                return;
            }
        }
        Intent intent = new Intent();
        if (connectionResult.isSuccess()) {
            intent.putExtra("com.google.android.gms.wallet.EXTRA_MASKED_WALLET", maskedWallet);
            i15 = -1;
        } else {
            int i16 = i14 == 408 ? 0 : 1;
            intent.putExtra(WalletConstants.EXTRA_ERROR_CODE, i14);
            i15 = i16;
        }
        PendingIntent pendingIntentCreatePendingResult = activity.createPendingResult(this.zzag, intent, 1073741824);
        if (pendingIntentCreatePendingResult == null) {
            return;
        }
        try {
            pendingIntentCreatePendingResult.send(i15);
        } catch (PendingIntent.CanceledException unused2) {
        }
    }

    @Override // com.google.android.gms.internal.wallet.zzx, com.google.android.gms.internal.wallet.zzq
    public final void zza(int i14, FullWallet fullWallet, Bundle bundle) {
        int i15;
        Activity activity = this.zzeq.get();
        if (activity == null) {
            return;
        }
        ConnectionResult connectionResult = new ConnectionResult(i14, bundle != null ? (PendingIntent) bundle.getParcelable("com.google.android.gms.wallet.EXTRA_PENDING_INTENT") : null);
        if (connectionResult.hasResolution()) {
            try {
                connectionResult.startResolutionForResult(activity, this.zzag);
                return;
            } catch (IntentSender.SendIntentException unused) {
                return;
            }
        }
        Intent intent = new Intent();
        if (connectionResult.isSuccess()) {
            intent.putExtra("com.google.android.gms.wallet.EXTRA_FULL_WALLET", fullWallet);
            i15 = -1;
        } else {
            int i16 = i14 == 408 ? 0 : 1;
            intent.putExtra(WalletConstants.EXTRA_ERROR_CODE, i14);
            i15 = i16;
        }
        PendingIntent pendingIntentCreatePendingResult = activity.createPendingResult(this.zzag, intent, 1073741824);
        if (pendingIntentCreatePendingResult == null) {
            return;
        }
        try {
            pendingIntentCreatePendingResult.send(i15);
        } catch (PendingIntent.CanceledException unused2) {
        }
    }

    @Override // com.google.android.gms.internal.wallet.zzx, com.google.android.gms.internal.wallet.zzq
    public final void zza(int i14, boolean z14, Bundle bundle) {
        Activity activity = this.zzeq.get();
        if (activity == null) {
            return;
        }
        Intent intent = new Intent();
        intent.putExtra(WalletConstants.EXTRA_IS_USER_PREAUTHORIZED, z14);
        PendingIntent pendingIntentCreatePendingResult = activity.createPendingResult(this.zzag, intent, 1073741824);
        if (pendingIntentCreatePendingResult == null) {
            return;
        }
        try {
            pendingIntentCreatePendingResult.send(-1);
        } catch (PendingIntent.CanceledException unused) {
        }
    }

    @Override // com.google.android.gms.internal.wallet.zzx, com.google.android.gms.internal.wallet.zzq
    public final void zza(int i14, Bundle bundle) {
        Preconditions.checkNotNull(bundle, "Bundle should not be null");
        Activity activity = this.zzeq.get();
        if (activity == null) {
            return;
        }
        ConnectionResult connectionResult = new ConnectionResult(i14, (PendingIntent) bundle.getParcelable("com.google.android.gms.wallet.EXTRA_PENDING_INTENT"));
        if (connectionResult.hasResolution()) {
            try {
                connectionResult.startResolutionForResult(activity, this.zzag);
                return;
            } catch (IntentSender.SendIntentException unused) {
                return;
            }
        }
        new StringBuilder(String.valueOf(connectionResult).length() + 75);
        Intent intent = new Intent();
        intent.putExtra(WalletConstants.EXTRA_ERROR_CODE, WalletConstants.ERROR_CODE_UNKNOWN);
        PendingIntent pendingIntentCreatePendingResult = activity.createPendingResult(this.zzag, intent, 1073741824);
        if (pendingIntentCreatePendingResult == null) {
            return;
        }
        try {
            pendingIntentCreatePendingResult.send(1);
        } catch (PendingIntent.CanceledException unused2) {
        }
    }
}
