package com.ximalaya.ting.android.player;

import android.os.HandlerThread;
import android.os.Process;

/* JADX INFO: loaded from: classes22.dex */
public class PriorityHandlerThread extends HandlerThread {
    private final int priority;

    public PriorityHandlerThread(String str, int i) {
        super(str);
        setPriority(10);
        this.priority = i;
    }

    @Override // android.os.HandlerThread, java.lang.Thread, java.lang.Runnable
    public void run() {
        Process.setThreadPriority(this.priority);
        super.run();
    }
}
