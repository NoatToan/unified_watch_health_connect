package defpackage;

import android.R;
import android.annotation.TargetApi;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.RemoteException;
import androidx.annotation.VisibleForTesting;
import com.google.android.play.core.assetpacks.ExtractionForegroundService;

/* JADX INFO: loaded from: classes5.dex */
public final class m9s extends hzs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pbt f25928a = new pbt("AssetPackExtractionService");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f25929b;
    public final tbs c;
    public final x4t d;
    public final ngs e;

    @VisibleForTesting
    public final NotificationManager f;

    public m9s(Context context, tbs tbsVar, x4t x4tVar, ngs ngsVar) {
        this.f25929b = context;
        this.c = tbsVar;
        this.d = x4tVar;
        this.e = ngsVar;
        this.f = (NotificationManager) context.getSystemService("notification");
    }

    @Override // defpackage.v0t
    public final void F4(Bundle bundle, x2t x2tVar) throws RemoteException {
        this.f25928a.a("clearAssetPackStorage AIDL call", new Object[0]);
        if (!t5s.b(this.f25929b) || !t5s.a(this.f25929b)) {
            x2tVar.Y1(new Bundle());
        } else {
            this.c.H();
            x2tVar.I(new Bundle());
        }
    }

    @Override // defpackage.v0t
    public final void O4(Bundle bundle, x2t x2tVar) throws RemoteException {
        p5(bundle, x2tVar);
    }

    @TargetApi(26)
    public final synchronized void h4(String str) {
        if (str == null) {
            str = "File downloads by Play";
        }
        try {
            this.f.createNotificationChannel(new NotificationChannel("playcore-assetpacks-service-notification-channel", str, 2));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void p5(Bundle bundle, x2t x2tVar) throws RemoteException {
        try {
            this.f25928a.a("updateServiceState AIDL call", new Object[0]);
            if (t5s.b(this.f25929b) && t5s.a(this.f25929b)) {
                int i = bundle.getInt("action_type");
                this.e.c(x2tVar);
                if (i != 1) {
                    if (i == 2) {
                        this.d.d(false);
                        this.e.b();
                        return;
                    } else {
                        this.f25928a.b("Unknown action type received: %d", Integer.valueOf(i));
                        x2tVar.Y1(new Bundle());
                        return;
                    }
                }
                h4(bundle.getString("notification_channel_name"));
                this.d.d(true);
                ngs ngsVar = this.e;
                String string = bundle.getString("notification_title");
                String string2 = bundle.getString("notification_subtext");
                long j = bundle.getLong("notification_timeout", 600000L);
                Parcelable parcelable = bundle.getParcelable("notification_on_click_intent");
                Notification.Builder timeoutAfter = new Notification.Builder(this.f25929b, "playcore-assetpacks-service-notification-channel").setTimeoutAfter(j);
                if (parcelable instanceof PendingIntent) {
                    timeoutAfter.setContentIntent((PendingIntent) parcelable);
                }
                Notification.Builder ongoing = timeoutAfter.setSmallIcon(R.drawable.stat_sys_download).setOngoing(false);
                if (string == null) {
                    string = "Downloading additional file";
                }
                Notification.Builder contentTitle = ongoing.setContentTitle(string);
                if (string2 == null) {
                    string2 = "Transferring";
                }
                contentTitle.setSubText(string2);
                int i2 = bundle.getInt("notification_color");
                if (i2 != 0) {
                    timeoutAfter.setColor(i2).setVisibility(-1);
                }
                ngsVar.a(timeoutAfter.build());
                this.f25929b.bindService(new Intent(this.f25929b, (Class<?>) ExtractionForegroundService.class), this.e, 1);
                return;
            }
            x2tVar.Y1(new Bundle());
        } catch (Throwable th) {
            throw th;
        }
    }
}
