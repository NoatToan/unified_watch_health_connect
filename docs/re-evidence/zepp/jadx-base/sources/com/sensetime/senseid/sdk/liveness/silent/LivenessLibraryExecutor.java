package com.sensetime.senseid.sdk.liveness.silent;

import com.sensetime.senseid.sdk.liveness.silent.AbstractLivenessLibrary;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes18.dex */
final class LivenessLibraryExecutor<T extends AbstractLivenessLibrary> extends ThreadPoolExecutor {
    private T mLibrary;

    public LivenessLibraryExecutor(ThreadFactory threadFactory, Class<T> cls) {
        super(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), threadFactory);
        this.mLibrary = cls.newInstance();
    }

    public final void cancelLibrary() {
        execute(new Runnable() { // from class: com.sensetime.senseid.sdk.liveness.silent.LivenessLibraryExecutor.1
            @Override // java.lang.Runnable
            public void run() {
                LivenessLibraryExecutor.this.mLibrary.cancel();
                LivenessLibraryExecutor.this.mLibrary = null;
            }
        });
    }

    public final T getLibrary() {
        return this.mLibrary;
    }
}
