package vn1;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.GarminDeviceWakefulService;
import com.garmin.android.gncs.GNCSListenerService;
import com.garmin.android.gncs.SmartNotificationsUtil;
import com.garmin.android.music.MusicManager;
import z6.o;
import z6.q;

/* JADX INFO: loaded from: classes10.dex */
public class e implements MusicManager.OnDeviceSubscribedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f178849a;

    public e(Context context) {
        this.f178849a = context.getApplicationContext();
    }

    @Override // com.garmin.android.music.MusicManager.OnDeviceSubscribedListener
    public final void onDeviceSubscribed() {
        String string;
        if (GarminDeviceWakefulService.f33825e) {
            return;
        }
        Context context = this.f178849a;
        if (!SmartNotificationsUtil.isNotificationAccessEnabled(context)) {
            string = context.getString(R.string.notification_music_service_permission_disabled);
        } else if (GNCSListenerService.isServiceConnected()) {
            return;
        } else {
            string = context.getString(R.string.notification_music_service_terminated);
        }
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        if (notificationManager == null) {
            return;
        }
        q qVar = new q(context, sz0.e.f161367g.b(new l22.a(context)));
        Notification notification = qVar.N;
        notification.icon = 2131232010;
        qVar.f202683e = q.e(context.getString(R.string.notification_access_required));
        qVar.f202684f = q.e(string);
        o oVar = new o();
        oVar.f202664e = q.e(string);
        qVar.l(oVar);
        qVar.i(16, true);
        notification.vibrate = new long[]{500, 1000};
        qVar.f202691m = 2;
        qVar.B = "recommendation";
        qVar.f202686h = PendingIntent.getActivity(context, 0, GNCSListenerService.getIntentNotificationListenerSettings(), 201326592);
        notificationManager.notify(1971, qVar.c());
    }
}
