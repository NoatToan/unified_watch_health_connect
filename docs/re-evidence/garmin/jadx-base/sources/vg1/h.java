package vg1;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Message;
import com.garmin.android.apps.connectmobile.GarminConnectMobileApp;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u000b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lvg1/h;", "Landroid/os/Handler;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SuppressLint({"HandlerLeak"})
public final class h extends Handler {
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        message.getClass();
        if (message.getData() != null) {
            long j8 = message.getData().getLong("GCM_deviceUnitID", 0L);
            l80.b bVar = (l80.b) KoinJavaComponent.get$default(l80.b.class, null, null, 6, null);
            if (j8 <= 0 || bVar.a(j8)) {
                return;
            }
            GarminConnectMobileApp.f28685g.getClass();
            new zb0.r0(GarminConnectMobileApp.a.a(), j8).a(false);
        }
    }
}
