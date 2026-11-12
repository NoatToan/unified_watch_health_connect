package ba;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.PendingIntent;

/* JADX INFO: loaded from: classes.dex */
public class b {
    private b() {
    }

    @SuppressLint({"MissingPermission"})
    public static Notification.MediaStyle a(Notification.MediaStyle mediaStyle, CharSequence charSequence, int i14, PendingIntent pendingIntent, Boolean bool) {
        if (bool.booleanValue()) {
            mediaStyle.setRemotePlaybackInfo(charSequence, i14, pendingIntent);
        }
        return mediaStyle;
    }
}
