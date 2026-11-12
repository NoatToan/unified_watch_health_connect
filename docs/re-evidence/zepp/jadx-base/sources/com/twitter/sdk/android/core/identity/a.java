package com.twitter.sdk.android.core.identity;

import android.app.Activity;
import com.twitter.sdk.android.core.Twitter;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes18.dex */
class a {
    public final AtomicReference<AuthHandler> a = new AtomicReference<>(null);

    public boolean a(Activity activity, AuthHandler authHandler) {
        if (d()) {
            Twitter.getLogger().w("Twitter", "Authorize already in progress");
        } else if (authHandler.authorize(activity)) {
            boolean zCompareAndSet = this.a.compareAndSet(null, authHandler);
            if (zCompareAndSet) {
                return zCompareAndSet;
            }
            Twitter.getLogger().w("Twitter", "Failed to update authHandler, authorize already in progress.");
            return zCompareAndSet;
        }
        return false;
    }

    public void b() {
        this.a.set(null);
    }

    public AuthHandler c() {
        return this.a.get();
    }

    public boolean d() {
        return this.a.get() != null;
    }
}
