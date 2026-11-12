package go2;

import android.app.Notification;
import android.app.NotificationManager;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f78327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NotificationManager f78328b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Notification f78329c;

    public /* synthetic */ a(NotificationManager notificationManager, Notification notification, int i14) {
        this.f78327a = i14;
        this.f78328b = notificationManager;
        this.f78329c = notification;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i14 = this.f78327a;
        Notification notification = this.f78329c;
        NotificationManager notificationManager = this.f78328b;
        switch (i14) {
            case 0:
                Logger logger = b.f78330c;
                notificationManager.notify(20, notification);
                break;
            default:
                Logger logger2 = xq2.a.f191939c;
                notificationManager.notify(20, notification);
                break;
        }
    }
}
