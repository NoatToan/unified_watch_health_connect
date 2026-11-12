package z6;

import android.app.Notification;

/* JADX INFO: loaded from: classes.dex */
public class s extends w {

    public static class a {
        private a() {
        }

        public static Notification.Style a() {
            return new Notification.DecoratedCustomViewStyle();
        }
    }

    @Override // z6.w
    public final void b(y yVar) {
        yVar.f202748b.setStyle(a.a());
    }

    @Override // z6.w
    public final String d() {
        return "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle";
    }
}
