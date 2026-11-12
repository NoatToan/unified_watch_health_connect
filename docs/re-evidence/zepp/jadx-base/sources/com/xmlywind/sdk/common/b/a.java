package com.xmlywind.sdk.common.b;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes22.dex */
class a implements ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        return new Thread(runnable) { // from class: com.xmlywind.sdk.common.b.a.1
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                super.run();
            }
        };
    }
}
