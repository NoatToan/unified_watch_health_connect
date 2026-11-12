package com.xiaomi.hm.health.bt.profile.piece;

import com.xiaomi.hm.health.bt.profile.slre.AsyncPieceEvent;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes18.dex */
public class AsyncPieceResult {
    private CountDownLatch a = new CountDownLatch(1);
    private AsyncPieceEvent b = null;

    public AsyncPieceEvent getEvent() {
        return this.b;
    }

    public void lock(int timeout) {
        try {
            this.a.await(timeout, TimeUnit.MILLISECONDS);
        } catch (Exception unused) {
        }
    }

    public void setEvent(AsyncPieceEvent event) {
        this.b = event;
    }

    public void unlock(AsyncPieceEvent event) {
        this.b = event;
        this.a.countDown();
    }
}
