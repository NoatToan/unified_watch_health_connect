package com.amap.api.col.p0003sl;

/* JADX INFO: loaded from: classes4.dex */
public abstract class mb implements Runnable {
    a f;

    interface a {
        void a(mb mbVar);

        void b(mb mbVar);
    }

    public abstract void runTask();

    @Override // java.lang.Runnable
    public final void run() {
        a aVar;
        try {
            if (Thread.interrupted()) {
                return;
            }
            runTask();
            if (Thread.interrupted() || (aVar = this.f) == null) {
                return;
            }
            aVar.a(this);
        } catch (Throwable th) {
            jv.c(th, "ThreadTask", "run");
            th.printStackTrace();
        }
    }

    public final void cancelTask() {
        try {
            a aVar = this.f;
            if (aVar != null) {
                aVar.b(this);
            }
        } catch (Throwable th) {
            jv.c(th, "ThreadTask", "cancelTask");
            th.printStackTrace();
        }
    }
}
