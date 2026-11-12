package com.xiaomi.mipush.sdk;

/* JADX INFO: loaded from: classes22.dex */
class g0 implements Runnable {
    public final /* synthetic */ NotificationClickedActivity a;

    public g0(NotificationClickedActivity notificationClickedActivity) {
        this.a = notificationClickedActivity;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.xiaomi.channel.commonutils.logger.b.e("clicked activity finish by timeout.");
        this.a.finish();
    }
}
