package com.huawei.openalliance.ad.utils;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes12.dex */
public class ao {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Handler f20413a;

    public void a(String str) {
        Handler handler = this.f20413a;
        if (handler == null || str == null) {
            return;
        }
        handler.removeCallbacksAndMessages(str);
    }

    public void a(Runnable runnable, String str, long j) {
        if (this.f20413a == null || runnable == null) {
            return;
        }
        if (j < 0) {
            j = 0;
        }
        dm dmVar = new dm(runnable);
        if (j == 0 && a()) {
            dmVar.run();
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis() + j;
        try {
            Message messageObtain = Message.obtain(this.f20413a, dmVar);
            messageObtain.setAsynchronous(true);
            messageObtain.obj = str;
            this.f20413a.sendMessageAtTime(messageObtain, jUptimeMillis);
        } catch (Throwable unused) {
            this.f20413a.postAtTime(dmVar, str, jUptimeMillis);
        }
    }

    public void a(Runnable runnable, String str) {
        if (this.f20413a == null || runnable == null) {
            return;
        }
        dm dmVar = new dm(runnable);
        if (a()) {
            dmVar.run();
            return;
        }
        try {
            Message messageObtain = Message.obtain(this.f20413a, dmVar);
            messageObtain.setAsynchronous(true);
            messageObtain.obj = str;
            this.f20413a.sendMessageAtFrontOfQueue(messageObtain);
        } catch (Throwable unused) {
            this.f20413a.postAtFrontOfQueue(dmVar);
        }
    }

    public void a(Runnable runnable) {
        a(runnable, null, 0L);
    }

    private boolean a() {
        Looper looper;
        Handler handler = this.f20413a;
        if (handler == null || (looper = handler.getLooper()) == null) {
            return false;
        }
        return Thread.currentThread() == looper.getThread();
    }

    public ao(Handler handler) {
        this.f20413a = handler;
    }
}
