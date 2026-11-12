package defpackage;

import com.facebook.common.memory.PooledByteBuffer;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
public class z53 {
    public static final Class<?> h = z53.class;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kl9 f40882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n3i f40883b;
    public final q3i c;
    public final Executor d;
    public final Executor e;
    public final s8o f = s8o.d();
    public final u2d g;

    public class a implements Callable<o98> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AtomicBoolean f40884a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ c93 f40885b;

        public a(AtomicBoolean atomicBoolean, c93 c93Var) {
            this.f40884a = atomicBoolean;
            this.f40885b = c93Var;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public o98 call() throws Exception {
            try {
                if (epa.d()) {
                    epa.a("BufferedDiskCache#getAsync");
                }
                if (this.f40884a.get()) {
                    throw new CancellationException();
                }
                o98 o98VarC = z53.this.f.c(this.f40885b);
                if (o98VarC != null) {
                    cm8.r(z53.h, "Found image for %s in staging area", this.f40885b.a());
                    z53.this.g.a(this.f40885b);
                } else {
                    cm8.r(z53.h, "Did not find image for %s in staging area", this.f40885b.a());
                    z53.this.g.m();
                    try {
                        PooledByteBuffer pooledByteBufferP = z53.this.p(this.f40885b);
                        if (pooledByteBufferP == null) {
                            if (epa.d()) {
                                epa.b();
                            }
                            return null;
                        }
                        w14 w14VarD = w14.D(pooledByteBufferP);
                        try {
                            o98 o98Var = new o98((w14<PooledByteBuffer>) w14VarD);
                            w14.l(w14VarD);
                            o98VarC = o98Var;
                        } catch (Throwable th) {
                            w14.l(w14VarD);
                            throw th;
                        }
                    } catch (Exception unused) {
                        if (epa.d()) {
                            epa.b();
                        }
                        return null;
                    }
                }
                if (Thread.interrupted()) {
                    cm8.q(z53.h, "Host thread was interrupted, decreasing reference count");
                    o98VarC.close();
                    throw new InterruptedException();
                }
                if (epa.d()) {
                    epa.b();
                }
                return o98VarC;
            } catch (Throwable th2) {
                if (epa.d()) {
                    epa.b();
                }
                throw th2;
            }
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c93 f40886a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ o98 f40887b;

        public b(c93 c93Var, o98 o98Var) {
            this.f40886a = c93Var;
            this.f40887b = o98Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (epa.d()) {
                    epa.a("BufferedDiskCache#putAsync");
                }
                z53.this.r(this.f40886a, this.f40887b);
            } finally {
                z53.this.f.h(this.f40886a, this.f40887b);
                o98.c(this.f40887b);
                if (epa.d()) {
                    epa.b();
                }
            }
        }
    }

    public class c implements Callable<Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c93 f40888a;

        public c(c93 c93Var) {
            this.f40888a = c93Var;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() throws Exception {
            try {
                if (epa.d()) {
                    epa.a("BufferedDiskCache#remove");
                }
                z53.this.f.g(this.f40888a);
                z53.this.f40882a.a(this.f40888a);
            } finally {
                if (epa.d()) {
                    epa.b();
                }
            }
        }
    }

    public class d implements Callable<Void> {
        public d() {
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() throws Exception {
            z53.this.f.a();
            z53.this.f40882a.clearAll();
            return null;
        }
    }

    public class e implements gpr {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ o98 f40891a;

        public e(o98 o98Var) {
            this.f40891a = o98Var;
        }

        @Override // defpackage.gpr
        public void a(OutputStream outputStream) throws IOException {
            z53.this.c.a(this.f40891a.y(), outputStream);
        }
    }

    public z53(kl9 kl9Var, n3i n3iVar, q3i q3iVar, Executor executor, Executor executor2, u2d u2dVar) {
        this.f40882a = kl9Var;
        this.f40883b = n3iVar;
        this.c = q3iVar;
        this.d = executor;
        this.e = executor2;
        this.g = u2dVar;
    }

    public final boolean h(c93 c93Var) {
        o98 o98VarC = this.f.c(c93Var);
        if (o98VarC != null) {
            o98VarC.close();
            cm8.r(h, "Found image for %s in staging area", c93Var.a());
            this.g.a(c93Var);
            return true;
        }
        cm8.r(h, "Did not find image for %s in staging area", c93Var.a());
        this.g.m();
        try {
            return this.f40882a.c(c93Var);
        } catch (Exception unused) {
            return false;
        }
    }

    public k1p<Void> i() {
        this.f.a();
        try {
            return k1p.b(new d(), this.e);
        } catch (Exception e2) {
            cm8.B(h, e2, "Failed to schedule disk-cache clear", new Object[0]);
            return k1p.g(e2);
        }
    }

    public boolean j(c93 c93Var) {
        return this.f.b(c93Var) || this.f40882a.d(c93Var);
    }

    public boolean k(c93 c93Var) {
        if (j(c93Var)) {
            return true;
        }
        return h(c93Var);
    }

    public final k1p<o98> l(c93 c93Var, o98 o98Var) {
        cm8.r(h, "Found image for %s in staging area", c93Var.a());
        this.g.a(c93Var);
        return k1p.h(o98Var);
    }

    public k1p<o98> m(c93 c93Var, AtomicBoolean atomicBoolean) {
        try {
            if (epa.d()) {
                epa.a("BufferedDiskCache#get");
            }
            o98 o98VarC = this.f.c(c93Var);
            return o98VarC != null ? l(c93Var, o98VarC) : n(c93Var, atomicBoolean);
        } finally {
            if (epa.d()) {
                epa.b();
            }
        }
    }

    public final k1p<o98> n(c93 c93Var, AtomicBoolean atomicBoolean) {
        try {
            return k1p.b(new a(atomicBoolean, c93Var), this.d);
        } catch (Exception e2) {
            cm8.B(h, e2, "Failed to schedule disk-cache read for %s", c93Var.a());
            return k1p.g(e2);
        }
    }

    public void o(c93 c93Var, o98 o98Var) {
        try {
            if (epa.d()) {
                epa.a("BufferedDiskCache#put");
            }
            b6i.g(c93Var);
            b6i.b(o98.O(o98Var));
            this.f.f(c93Var, o98Var);
            o98 o98VarB = o98.b(o98Var);
            try {
                this.e.execute(new b(c93Var, o98VarB));
            } catch (Exception e2) {
                cm8.B(h, e2, "Failed to schedule disk-cache write for %s", c93Var.a());
                this.f.h(c93Var, o98Var);
                o98.c(o98VarB);
            }
            if (epa.d()) {
                epa.b();
            }
        } catch (Throwable th) {
            if (epa.d()) {
                epa.b();
            }
            throw th;
        }
    }

    public final PooledByteBuffer p(c93 c93Var) throws IOException {
        try {
            Class<?> cls = h;
            cm8.r(cls, "Disk cache read for %s", c93Var.a());
            ej2 ej2VarE = this.f40882a.e(c93Var);
            if (ej2VarE == null) {
                cm8.r(cls, "Disk cache miss for %s", c93Var.a());
                this.g.l();
                return null;
            }
            cm8.r(cls, "Found entry in disk cache for %s", c93Var.a());
            this.g.e(c93Var);
            InputStream inputStreamA = ej2VarE.a();
            try {
                PooledByteBuffer pooledByteBufferE = this.f40883b.e(inputStreamA, (int) ej2VarE.size());
                inputStreamA.close();
                cm8.r(cls, "Successful read from disk cache for %s", c93Var.a());
                return pooledByteBufferE;
            } catch (Throwable th) {
                inputStreamA.close();
                throw th;
            }
        } catch (IOException e2) {
            cm8.B(h, e2, "Exception reading from cache for %s", c93Var.a());
            this.g.b();
            throw e2;
        }
    }

    public k1p<Void> q(c93 c93Var) {
        b6i.g(c93Var);
        this.f.g(c93Var);
        try {
            return k1p.b(new c(c93Var), this.e);
        } catch (Exception e2) {
            cm8.B(h, e2, "Failed to schedule disk-cache remove for %s", c93Var.a());
            return k1p.g(e2);
        }
    }

    public final void r(c93 c93Var, o98 o98Var) {
        Class<?> cls = h;
        cm8.r(cls, "About to write to disk-cache for key %s", c93Var.a());
        try {
            this.f40882a.b(c93Var, new e(o98Var));
            cm8.r(cls, "Successful disk-cache write for key %s", c93Var.a());
        } catch (IOException e2) {
            cm8.B(h, e2, "Failed to write to disk-cache for key %s", c93Var.a());
        }
    }
}
