package w10;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.connectiq.requests.DismissNotificationReceiver;
import com.garmin.android.apps.connectmobile.connectiq.requests.openwebpage.OpenWebpageNotificationReceiver;
import z6.q;

/* JADX INFO: loaded from: classes7.dex */
public class f implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f181191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f181192b;

    public f(Context context, c cVar) {
        this.f181191a = context;
        this.f181192b = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context = this.f181191a;
        Intent intent = new Intent(context, (Class<?>) OpenWebpageNotificationReceiver.class);
        c cVar = this.f181192b;
        intent.putExtra("open_webpage_request", cVar);
        intent.setAction("actionstring" + cVar.getDateReceived());
        PendingIntent broadcast = PendingIntent.getBroadcast(context.getApplicationContext(), 0, intent, 67108864);
        Intent intent2 = new Intent(context, (Class<?>) DismissNotificationReceiver.class);
        intent2.putExtra("open_webpage_request", cVar);
        intent2.setAction("actionstring" + cVar.getDateReceived());
        PendingIntent broadcast2 = PendingIntent.getBroadcast(context.getApplicationContext(), 0, intent2, 67108864);
        int dateReceived = (int) (cVar.getDateReceived() / 100);
        sz0.e eVar = sz0.e.f161374m;
        q qVar = new q(context, eVar.f161386a);
        qVar.B = "recommendation";
        qVar.f202691m = 1;
        qVar.N.icon = 2131232009;
        qVar.f202683e = q.e(context.getString(R.string.connect_iq_name));
        qVar.f202684f = q.e(String.format(context.getString(R.string.connect_iq_open_webpage_request), cVar.getAppName(), cVar.getUrl()));
        qVar.N.deleteIntent = broadcast2;
        qVar.f202686h = broadcast;
        qVar.i(16, true);
        Notification notificationC = qVar.c();
        notificationC.flags = 16 | notificationC.flags;
        sz0.f.a(context, notificationC, dateReceived, eVar);
    }
}
