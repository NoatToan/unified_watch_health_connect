package defpackage;

import android.util.Pair;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public abstract class j00<T> implements cp5<T> {
    public T c = null;
    public Throwable d = null;
    public float e = 0.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f22266b = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f22265a = c.IN_PROGRESS;
    public final ConcurrentLinkedQueue<Pair<mp5<T>, Executor>> f = new ConcurrentLinkedQueue<>();

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f22267a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ mp5 f22268b;
        public final /* synthetic */ boolean c;

        public a(boolean z, mp5 mp5Var, boolean z2) {
            this.f22267a = z;
            this.f22268b = mp5Var;
            this.c = z2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f22267a) {
                this.f22268b.onFailure(j00.this);
            } else if (this.c) {
                this.f22268b.onCancellation(j00.this);
            } else {
                this.f22268b.onNewResult(j00.this);
            }
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ mp5 f22269a;

        public b(mp5 mp5Var) {
            this.f22269a = mp5Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f22269a.onProgressUpdate(j00.this);
        }
    }

    public enum c {
        IN_PROGRESS,
        SUCCESS,
        FAILURE
    }

    @Override // defpackage.cp5
    public synchronized boolean a() {
        return this.f22265a != c.IN_PROGRESS;
    }

    @Override // defpackage.cp5
    public synchronized Throwable b() {
        return this.d;
    }

    @Override // defpackage.cp5
    public void c(mp5<T> mp5Var, Executor executor) {
        b6i.g(mp5Var);
        b6i.g(executor);
        synchronized (this) {
            try {
                if (this.f22266b) {
                    return;
                }
                if (this.f22265a == c.IN_PROGRESS) {
                    this.f.add(Pair.create(mp5Var, executor));
                }
                boolean z = hasResult() || a() || q();
                if (z) {
                    h(mp5Var, executor, f(), q());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.cp5
    public boolean close() {
        synchronized (this) {
            try {
                if (this.f22266b) {
                    return false;
                }
                this.f22266b = true;
                T t = this.c;
                this.c = null;
                if (t != null) {
                    e(t);
                }
                if (!a()) {
                    i();
                }
                synchronized (this) {
                    this.f.clear();
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.cp5
    public boolean d() {
        return false;
    }

    public void e(T t) {
    }

    public synchronized boolean f() {
        return this.f22265a == c.FAILURE;
    }

    public synchronized boolean g() {
        return this.f22266b;
    }

    @Override // defpackage.cp5
    public synchronized float getProgress() {
        return this.e;
    }

    @Override // defpackage.cp5
    public synchronized T getResult() {
        return this.c;
    }

    public final void h(mp5<T> mp5Var, Executor executor, boolean z, boolean z2) {
        executor.execute(new a(z, mp5Var, z2));
    }

    @Override // defpackage.cp5
    public synchronized boolean hasResult() {
        return this.c != null;
    }

    public final void i() {
        boolean zF = f();
        boolean zQ = q();
        for (Pair<mp5<T>, Executor> pair : this.f) {
            h((mp5) pair.first, (Executor) pair.second, zF, zQ);
        }
    }

    public void j() {
        for (Pair<mp5<T>, Executor> pair : this.f) {
            ((Executor) pair.second).execute(new b((mp5) pair.first));
        }
    }

    public boolean k(Throwable th) {
        boolean zL = l(th);
        if (zL) {
            i();
        }
        return zL;
    }

    public final synchronized boolean l(Throwable th) {
        if (!this.f22266b && this.f22265a == c.IN_PROGRESS) {
            this.f22265a = c.FAILURE;
            this.d = th;
            return true;
        }
        return false;
    }

    public boolean m(float f) {
        boolean zN = n(f);
        if (zN) {
            j();
        }
        return zN;
    }

    public final synchronized boolean n(float f) {
        if (!this.f22266b && this.f22265a == c.IN_PROGRESS) {
            if (f < this.e) {
                return false;
            }
            this.e = f;
            return true;
        }
        return false;
    }

    public boolean o(T t, boolean z) {
        boolean zP = p(t, z);
        if (zP) {
            i();
        }
        return zP;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0027, code lost:
    
        if (r4 == null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0029, code lost:
    
        e(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x002c, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0033, code lost:
    
        if (r4 == null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0035, code lost:
    
        e(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0038, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:?, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:?, code lost:
    
        return false;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0019 -> B:32:0x003a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean p(T r4, boolean r5) {
        /*
            r3 = this;
            r0 = 0
            monitor-enter(r3)     // Catch: java.lang.Throwable -> L3c
            boolean r1 = r3.f22266b     // Catch: java.lang.Throwable -> L18
            if (r1 != 0) goto L32
            j00$c r1 = r3.f22265a     // Catch: java.lang.Throwable -> L18
            j00$c r2 = j00.c.IN_PROGRESS     // Catch: java.lang.Throwable -> L18
            if (r1 == r2) goto Ld
            goto L32
        Ld:
            if (r5 == 0) goto L1a
            j00$c r5 = j00.c.SUCCESS     // Catch: java.lang.Throwable -> L18
            r3.f22265a = r5     // Catch: java.lang.Throwable -> L18
            r5 = 1065353216(0x3f800000, float:1.0)
            r3.e = r5     // Catch: java.lang.Throwable -> L18
            goto L1a
        L18:
            r4 = move-exception
            goto L3a
        L1a:
            T r5 = r3.c     // Catch: java.lang.Throwable -> L18
            if (r5 == r4) goto L25
            r3.c = r4     // Catch: java.lang.Throwable -> L22
            r4 = r5
            goto L26
        L22:
            r4 = move-exception
            r0 = r5
            goto L3a
        L25:
            r4 = r0
        L26:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L2e
            if (r4 == 0) goto L2c
            r3.e(r4)
        L2c:
            r4 = 1
            return r4
        L2e:
            r5 = move-exception
            r0 = r4
            r4 = r5
            goto L3a
        L32:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L2e
            if (r4 == 0) goto L38
            r3.e(r4)
        L38:
            r4 = 0
            return r4
        L3a:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L18
            throw r4     // Catch: java.lang.Throwable -> L3c
        L3c:
            r4 = move-exception
            if (r0 == 0) goto L42
            r3.e(r0)
        L42:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j00.p(java.lang.Object, boolean):boolean");
    }

    public final synchronized boolean q() {
        return g() && !a();
    }
}
