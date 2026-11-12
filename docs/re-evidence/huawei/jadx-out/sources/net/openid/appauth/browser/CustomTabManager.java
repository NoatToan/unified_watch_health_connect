package net.openid.appauth.browser;

import android.content.Context;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsServiceConnection;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import net.openid.appauth.internal.Logger;

/* JADX INFO: loaded from: classes20.dex */
public class CustomTabManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicReference<CustomTabsClient> f43046a = new AtomicReference<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CountDownLatch f43047b = new CountDownLatch(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final WeakReference<Context> f43048c;
    private CustomTabsServiceConnection e;

    public CustomTabManager(Context context) {
        this.f43048c = new WeakReference<>(context);
    }

    public void c() {
        synchronized (this) {
            if (this.e == null) {
                return;
            }
            Context context = this.f43048c.get();
            if (context != null) {
                context.unbindService(this.e);
            }
            this.f43046a.set(null);
            Logger.d("CustomTabsService is disconnected", new Object[0]);
        }
    }
}
