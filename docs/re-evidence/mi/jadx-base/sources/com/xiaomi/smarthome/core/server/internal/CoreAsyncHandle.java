package com.xiaomi.smarthome.core.server.internal;

import java.lang.ref.WeakReference;
import okhttp3.Call;

/* JADX INFO: loaded from: classes10.dex */
public class CoreAsyncHandle<H> {
    private final WeakReference<H> mHandle;

    public interface Handle {
        void cancel();
    }

    public CoreAsyncHandle(H h) {
        this.mHandle = new WeakReference<>(h);
    }

    public final void cancel() {
        H h;
        WeakReference<H> weakReference = this.mHandle;
        if (weakReference == null || (h = weakReference.get()) == null) {
            return;
        }
        if (h instanceof Handle) {
            ((Handle) h).cancel();
        } else if (h instanceof NetHandle) {
            ((NetHandle) h).cancel();
        } else if (h instanceof Call) {
            ((Call) h).cancel();
        }
    }
}
