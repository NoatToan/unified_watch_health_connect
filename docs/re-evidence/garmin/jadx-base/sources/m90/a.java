package m90;

import android.app.PendingIntent;
import android.content.Context;
import com.garmin.android.apps.connectmobile.device.setup.presentation.inreach.InReachSubscriptionPollingWorker;
import java.io.Serializable;
import v13.c;
import wa0.e;

/* JADX INFO: loaded from: classes8.dex */
public interface a {
    Serializable a(long j8, InReachSubscriptionPollingWorker.b bVar);

    Enum b(String str, InReachSubscriptionPollingWorker.b bVar);

    Object c(long j8, c cVar);

    Object d(long j8, InReachSubscriptionPollingWorker.b bVar);

    Object e(long j8, e eVar);

    Serializable f(long j8, InReachSubscriptionPollingWorker.b bVar);

    Object g(long j8, e eVar);

    PendingIntent h(Context context, long j8);
}
