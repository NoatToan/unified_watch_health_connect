package df;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes7.dex */
public class r implements ef.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f59418b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Runnable f59419c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayDeque<a> f59417a = new ArrayDeque<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f59420d = new Object();

    public static class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final r f59421a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Runnable f59422b;

        public a(r rVar, Runnable runnable) {
            this.f59421a = rVar;
            this.f59422b = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                this.f59422b.run();
                synchronized (this.f59421a.f59420d) {
                    this.f59421a.a();
                }
            } catch (Throwable th3) {
                synchronized (this.f59421a.f59420d) {
                    this.f59421a.a();
                    throw th3;
                }
            }
        }
    }

    public r(Executor executor) {
        this.f59418b = executor;
    }

    public final void a() {
        a aVarPoll = this.f59417a.poll();
        this.f59419c = aVarPoll;
        if (aVarPoll != null) {
            this.f59418b.execute(aVarPoll);
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.f59420d) {
            try {
                this.f59417a.add(new a(this, runnable));
                if (this.f59419c == null) {
                    a();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
