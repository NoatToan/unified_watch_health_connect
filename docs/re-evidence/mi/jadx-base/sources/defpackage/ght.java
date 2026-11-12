package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.xiaomi.mipush.sdk.NotificationClickedActivity;

/* JADX INFO: loaded from: classes11.dex */
public class ght extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NotificationClickedActivity f19014a;

    public ght(NotificationClickedActivity notificationClickedActivity) {
        this.f19014a = notificationClickedActivity;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        x9s.y("clicked activity finish by normal.");
        this.f19014a.finish();
    }
}
