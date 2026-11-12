package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public abstract class f7t implements Runnable {
    a f;

    public interface a {
        void a(f7t f7tVar);

        void b(f7t f7tVar);
    }

    public final void cancelTask() {
        try {
            a aVar = this.f;
            if (aVar != null) {
                aVar.a(this);
            }
        } catch (Throwable th) {
            m2t.r(th, "ThreadTask", "cancelTask");
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
            if (Thread.interrupted() || (aVar = this.f) == null) {
                return;
            }
            aVar.b(this);
        } catch (Throwable th) {
            m2t.r(th, "ThreadTask", "run");
            th.printStackTrace();
        }
    }

    public abstract void runTask();
}
