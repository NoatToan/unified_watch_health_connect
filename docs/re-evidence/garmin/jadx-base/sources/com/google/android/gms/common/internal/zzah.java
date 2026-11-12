package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import b71.i;
import com.google.android.gms.common.ConnectionResult;
import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: loaded from: classes14.dex */
public final class zzah {
    private static final Uri zza = new Uri.Builder().scheme(FirebaseAnalytics.Param.CONTENT).authority("com.google.android.gms.chimera").build();

    public static Intent zza(Context context, zzn zznVar) {
        Bundle bundleCall;
        String strZza = zznVar.zza();
        if (strZza == null) {
            return new Intent().setComponent(zznVar.zzc());
        }
        Intent intent = null;
        if (zznVar.zzd()) {
            Bundle bundleD = i.d("serviceActionBundleKey", strZza);
            try {
                ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(zza);
                if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                    throw new RemoteException("Failed to acquire ContentProviderClient");
                }
                try {
                    bundleCall = contentProviderClientAcquireUnstableContentProviderClient.call("serviceIntentCall", null, bundleD);
                    contentProviderClientAcquireUnstableContentProviderClient.release();
                    if (bundleCall != null) {
                        Intent intent2 = (Intent) bundleCall.getParcelable("serviceResponseIntentKey");
                        if (intent2 != null) {
                            intent = intent2;
                        } else {
                            PendingIntent pendingIntent = (PendingIntent) bundleCall.getParcelable("serviceMissingResolutionIntentKey");
                            if (pendingIntent != null) {
                                new StringBuilder(strZza.length() + 72);
                                throw new zzaf(new ConnectionResult(25, pendingIntent));
                            }
                        }
                    }
                    if (intent == null) {
                        "Dynamic lookup for intent failed for action: ".concat(strZza);
                    }
                } catch (Throwable th3) {
                    contentProviderClientAcquireUnstableContentProviderClient.release();
                    throw th3;
                }
            } catch (RemoteException e4) {
                e = e4;
                "Dynamic intent resolution failed: ".concat(e.toString());
                bundleCall = null;
            } catch (IllegalArgumentException e14) {
                e = e14;
                "Dynamic intent resolution failed: ".concat(e.toString());
                bundleCall = null;
            }
        }
        return intent == null ? new Intent(strZza).setPackage(zznVar.zzb()) : intent;
    }
}
