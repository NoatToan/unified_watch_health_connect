package z6;

import android.app.Notification;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public class o extends w {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CharSequence f202664e;

    public o(q qVar) {
        f(qVar);
    }

    @Override // z6.w
    public final void b(y yVar) {
        Notification.BigTextStyle bigTextStyleBigText = new Notification.BigTextStyle(yVar.f202748b).setBigContentTitle(this.f202742b).bigText(this.f202664e);
        if (this.f202744d) {
            bigTextStyleBigText.setSummaryText(this.f202743c);
        }
    }

    @Override // z6.w
    public final void c(Bundle bundle) {
        super.c(bundle);
        bundle.remove("android.bigText");
    }

    @Override // z6.w
    public final String d() {
        return "androidx.core.app.NotificationCompat$BigTextStyle";
    }

    @Override // z6.w
    public final void e(Bundle bundle) {
        super.e(bundle);
        this.f202664e = bundle.getCharSequence("android.bigText");
    }

    public o() {
    }
}
