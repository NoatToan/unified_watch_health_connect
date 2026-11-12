package org.chromium.net;

import java.util.concurrent.Executor;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
public abstract class NetworkQualityRttListener {
    private final Executor mExecutor;

    public NetworkQualityRttListener(Executor executor) {
        if (executor != null) {
            this.mExecutor = executor;
        } else {
            h.z("Executor must not be null");
            throw null;
        }
    }

    public Executor getExecutor() {
        return this.mExecutor;
    }

    public abstract void onRttObservation(int i14, long j8, int i15);
}
