package com.airoha.android.lib.transport.Commander;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes2.dex */
public class QueuedCmdsCommander {
    public boolean isResponded = true;
    private final BlockingQueue<byte[]> a = new LinkedBlockingQueue();

    public void clearQueue() {
        this.a.clear();
    }

    public void enqueneCmd(byte[] bArr) {
        try {
            this.a.put(bArr);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public byte[] getNextCmd() {
        if (this.a.isEmpty()) {
            return null;
        }
        return this.a.remove();
    }

    public boolean isQueueEmpty() {
        return this.a.isEmpty();
    }
}
