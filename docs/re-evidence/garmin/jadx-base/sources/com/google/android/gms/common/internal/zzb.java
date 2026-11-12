package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: loaded from: classes14.dex */
final class zzb extends com.google.android.gms.internal.common.zzg {
    final /* synthetic */ BaseGmsClient zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzb(BaseGmsClient baseGmsClient, Looper looper) {
        super(looper);
        java.util.Objects.requireNonNull(baseGmsClient);
        this.zza = baseGmsClient;
    }

    private static final void zza(Message message) {
        zzc zzcVar = (zzc) message.obj;
        if (zzcVar != null) {
            zzcVar.zze();
        }
    }

    private static final boolean zzb(Message message) {
        int i14 = message.what;
        return i14 == 2 || i14 == 1 || i14 == 7;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        BaseGmsClient baseGmsClient = this.zza;
        if (baseGmsClient.zzd.get() != message.arg1) {
            if (zzb(message)) {
                zza(message);
                return;
            }
            return;
        }
        int i14 = message.what;
        if ((i14 == 1 || i14 == 7 || ((i14 == 4 && !baseGmsClient.enableLocalFallback()) || message.what == 5)) && !baseGmsClient.isConnecting()) {
            zza(message);
            return;
        }
        int i15 = message.what;
        if (i15 == 4) {
            baseGmsClient.zzn(new ConnectionResult(message.arg2));
            if (baseGmsClient.zzg() && !baseGmsClient.zzo()) {
                baseGmsClient.zzd(3, null);
                return;
            }
            ConnectionResult connectionResultZzm = baseGmsClient.zzm() != null ? baseGmsClient.zzm() : new ConnectionResult(8);
            baseGmsClient.zzc.onReportServiceBinding(connectionResultZzm);
            baseGmsClient.onConnectionFailed(connectionResultZzm);
            return;
        }
        if (i15 == 5) {
            ConnectionResult connectionResultZzm2 = baseGmsClient.zzm() != null ? baseGmsClient.zzm() : new ConnectionResult(8);
            baseGmsClient.zzc.onReportServiceBinding(connectionResultZzm2);
            baseGmsClient.onConnectionFailed(connectionResultZzm2);
            return;
        }
        if (i15 == 3) {
            Object obj = message.obj;
            ConnectionResult connectionResult = new ConnectionResult(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null);
            baseGmsClient.zzc.onReportServiceBinding(connectionResult);
            baseGmsClient.onConnectionFailed(connectionResult);
            return;
        }
        if (i15 == 6) {
            baseGmsClient.zzd(5, null);
            if (baseGmsClient.zzk() != null) {
                baseGmsClient.zzk().onConnectionSuspended(message.arg2);
            }
            baseGmsClient.onConnectionSuspended(message.arg2);
            baseGmsClient.zze(5, 1, null);
            return;
        }
        if (i15 == 2 && !baseGmsClient.isConnected()) {
            zza(message);
        } else if (zzb(message)) {
            ((zzc) message.obj).zzd();
        } else {
            new StringBuilder(String.valueOf(message.what).length() + 34);
            new Exception();
        }
    }
}
