package defpackage;

import com.xiaomi.mipush.sdk.NotificationClickedActivity;

/* JADX INFO: loaded from: classes11.dex */
public class xgt implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NotificationClickedActivity f39111a;

    public xgt(NotificationClickedActivity notificationClickedActivity) {
        this.f39111a = notificationClickedActivity;
    }

    @Override // java.lang.Runnable
    public void run() {
        x9s.E("clicked activity finish by timeout.");
        this.f39111a.finish();
    }
}
