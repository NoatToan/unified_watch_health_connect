package androidx.core.app;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import androidx.annotation.DeprecatedSinceApi;

/* JADX INFO: loaded from: classes.dex */
public abstract class NotificationCompatSideChannelService extends Service {
    @Override // android.app.Service
    @DeprecatedSinceApi(api = 19, message = "SDKs past 19 have no need for side channeling.")
    public IBinder onBind(Intent intent) {
        intent.getAction().equals("android.support.BIND_NOTIFICATION_SIDE_CHANNEL");
        return null;
    }
}
