package z6;

import android.app.Notification;

/* JADX INFO: loaded from: classes.dex */
public class m {
    private m() {
    }

    public static boolean a(Notification.Action action) {
        return action.isAuthenticationRequired();
    }
}
