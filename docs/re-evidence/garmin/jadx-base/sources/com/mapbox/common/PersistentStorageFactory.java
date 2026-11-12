package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;

/* JADX INFO: loaded from: classes2.dex */
public class PersistentStorageFactory {
    protected long peer;

    public static class PersistentStorageFactoryPeerCleaner implements Runnable {
        private long peer;

        public PersistentStorageFactoryPeerCleaner(long j8) {
            this.peer = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            PersistentStorageFactory.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public PersistentStorageFactory(long j8) {
        setPeer(j8);
    }

    public static native void cleanNativePeer(long j8);

    public static native Expected<PersistentStorageError, PersistentStorageInterface> getOrCreateByFile(String str);

    public static native Expected<PersistentStorageError, PersistentStorageInterface> getOrCreateByKey(String str);

    private void setPeer(long j8) {
        this.peer = j8;
        if (j8 == 0) {
            return;
        }
        CleanerService.register(this, new PersistentStorageFactoryPeerCleaner(j8));
    }
}
