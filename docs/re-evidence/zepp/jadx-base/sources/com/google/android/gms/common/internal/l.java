package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: loaded from: classes3.dex */
final class l extends com.google.android.gms.internal.common.zzi {
    public final /* synthetic */ BaseGmsClient a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(BaseGmsClient baseGmsClient, Looper looper) {
        super(looper);
        this.a = baseGmsClient;
    }

    private static final void a(Message message) {
        zzc zzcVar = (zzc) message.obj;
        zzcVar.zzc();
        zzcVar.zzg();
    }

    private static final boolean b(Message message) {
        int i = message.what;
        return i == 2 || i == 1 || i == 7;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.a.zzd.get() != message.arg1) {
            if (b(message)) {
                a(message);
                return;
            }
            return;
        }
        int i = message.what;
        if ((i == 1 || i == 7 || ((i == 4 && !this.a.enableLocalFallback()) || message.what == 5)) && !this.a.isConnecting()) {
            a(message);
            return;
        }
        int i2 = message.what;
        if (i2 == 4) {
            this.a.y = new ConnectionResult(message.arg2);
            if (BaseGmsClient.m(this.a)) {
                BaseGmsClient baseGmsClient = this.a;
                if (!baseGmsClient.z) {
                    baseGmsClient.n(3, null);
                    return;
                }
            }
            BaseGmsClient baseGmsClient2 = this.a;
            ConnectionResult connectionResult = baseGmsClient2.y != null ? baseGmsClient2.y : new ConnectionResult(8);
            this.a.zzc.onReportServiceBinding(connectionResult);
            this.a.onConnectionFailed(connectionResult);
            return;
        }
        if (i2 == 5) {
            BaseGmsClient baseGmsClient3 = this.a;
            ConnectionResult connectionResult2 = baseGmsClient3.y != null ? baseGmsClient3.y : new ConnectionResult(8);
            this.a.zzc.onReportServiceBinding(connectionResult2);
            this.a.onConnectionFailed(connectionResult2);
            return;
        }
        if (i2 == 3) {
            Object obj = message.obj;
            ConnectionResult connectionResult3 = new ConnectionResult(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null);
            this.a.zzc.onReportServiceBinding(connectionResult3);
            this.a.onConnectionFailed(connectionResult3);
            return;
        }
        if (i2 == 6) {
            this.a.n(5, null);
            BaseGmsClient baseGmsClient4 = this.a;
            if (baseGmsClient4.t != null) {
                baseGmsClient4.t.onConnectionSuspended(message.arg2);
            }
            this.a.onConnectionSuspended(message.arg2);
            BaseGmsClient.l(this.a, 5, 1, null);
            return;
        }
        if (i2 == 2 && !this.a.isConnected()) {
            a(message);
            return;
        }
        if (b(message)) {
            ((zzc) message.obj).zze();
            return;
        }
        int i3 = message.what;
        StringBuilder sb = new StringBuilder(45);
        sb.append("Don't know how to handle message: ");
        sb.append(i3);
        Log.wtf("GmsClient", sb.toString(), new Exception());
    }
}
