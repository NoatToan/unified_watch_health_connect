package com.amap.api.mapcore.util;

/* JADX INFO: loaded from: classes2.dex */
public abstract class jr implements Runnable {
    public a e;

    public interface a {
        void a(jr jrVar);

        void b(jr jrVar);
    }

    public final void cancelTask() {
        try {
            a aVar = this.e;
            if (aVar != null) {
                aVar.b(this);
            }
        } catch (Throwable th) {
            hn.c(th, "ThreadTask", "cancelTask");
            th.printStackTrace();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        a aVar;
        try {
            if (Thread.interrupted()) {
                return;
            }
            runTask();
            if (Thread.interrupted() || (aVar = this.e) == null) {
                return;
            }
            aVar.a(this);
        } catch (Throwable th) {
            hn.c(th, "ThreadTask", "run");
            th.printStackTrace();
        }
    }

    public abstract void runTask();
}
