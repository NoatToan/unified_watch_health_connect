package defpackage;

import androidx.annotation.GuardedBy;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class nwl implements mwl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f28513b;

    @GuardedBy("mLock")
    public Runnable c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayDeque<a> f28512a = new ArrayDeque<>();
    public final Object d = new Object();

    public static class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final nwl f28514a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Runnable f28515b;

        public a(nwl nwlVar, Runnable runnable) {
            this.f28514a = nwlVar;
            this.f28515b = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f28515b.run();
                synchronized (this.f28514a.d) {
                    this.f28514a.a();
                }
            } catch (Throwable th) {
                synchronized (this.f28514a.d) {
                    this.f28514a.a();
                    throw th;
                }
            }
        }
    }

    public nwl(Executor executor) {
        this.f28513b = executor;
    }

    @GuardedBy("mLock")
    public void a() {
        a aVarPoll = this.f28512a.poll();
        this.c = aVarPoll;
        if (aVarPoll != null) {
            this.f28513b.execute(aVarPoll);
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        synchronized (this.d) {
            try {
                this.f28512a.add(new a(this, runnable));
                if (this.c == null) {
                    a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.mwl
    public boolean m() {
        boolean z;
        synchronized (this.d) {
            z = !this.f28512a.isEmpty();
        }
        return z;
    }
}
