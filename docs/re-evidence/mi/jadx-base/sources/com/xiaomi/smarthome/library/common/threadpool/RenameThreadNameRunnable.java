package com.xiaomi.smarthome.library.common.threadpool;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes2.dex */
public class RenameThreadNameRunnable implements Runnable {
    private Runnable runnable;
    private String threadName;

    public RenameThreadNameRunnable(Runnable runnable, String str) {
        this.runnable = runnable;
        this.threadName = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (!TextUtils.isEmpty(this.threadName)) {
            Thread.currentThread().setName(this.threadName);
        }
        this.runnable.run();
    }
}
