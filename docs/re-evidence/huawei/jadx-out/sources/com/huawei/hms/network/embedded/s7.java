package com.huawei.hms.network.embedded;

import androidx.core.app.NotificationCompat;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes34.dex */
public final class s7 implements t6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q7 f15341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d9 f15342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t7 f15343c;
    public final boolean d;
    public boolean e;

    @Override // com.huawei.hms.network.embedded.t6
    public ac timeout() {
        return this.f15342b.timeout();
    }

    @Override // com.huawei.hms.network.embedded.t6
    public t7 request() {
        return this.f15343c;
    }

    @Override // com.huawei.hms.network.embedded.t6
    public boolean isExecuted() {
        boolean z;
        synchronized (this) {
            z = this.e;
        }
        return z;
    }

    @Override // com.huawei.hms.network.embedded.t6
    public boolean isCanceled() {
        return this.f15342b.isCanceled();
    }

    public final class a extends d8 {
        public static final /* synthetic */ boolean f = true;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final u6 f15344b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f15345c;
        public volatile AtomicInteger d;

        public void i() {
            this.f15345c = true;
        }

        public t7 h() {
            return s7.this.f15343c;
        }

        public String g() {
            return s7.this.f15343c.k().h();
        }

        public s7 f() {
            return s7.this;
        }

        public boolean e() {
            return this.f15345c;
        }

        public q7 d() {
            return s7.this.f15341a;
        }

        public AtomicInteger c() {
            return this.d;
        }

        @Override // com.huawei.hms.network.embedded.d8
        public void b() {
            s7.this.f15342b.timeoutEnter();
            boolean z = false;
            try {
                try {
                    try {
                        this.f15344b.onResponse(s7.this, this.f15345c ? s7.this.a() : s7.this.b());
                    } catch (IOException e) {
                        e = e;
                        z = true;
                        if (z) {
                            ma.f().a(4, "Callback failure for " + s7.this.d(), e);
                        } else {
                            this.f15344b.onFailure(s7.this, e);
                        }
                    } catch (Throwable th) {
                        th = th;
                        z = true;
                        s7.this.cancel();
                        if (!z) {
                            IOException iOException = new IOException("canceled due to " + th);
                            iOException.addSuppressed(th);
                            this.f15344b.onFailure(s7.this, iOException);
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    s7.this.f15341a.j().b(this);
                    throw th2;
                }
            } catch (IOException e2) {
                e = e2;
            } catch (Throwable th3) {
                th = th3;
            }
            s7.this.f15341a.j().b(this);
        }

        public void a(ExecutorService executorService) {
            if (!f && Thread.holdsLock(s7.this.f15341a.j())) {
                throw new AssertionError();
            }
            try {
                try {
                    executorService.execute(this);
                } catch (RejectedExecutionException e) {
                    InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                    interruptedIOException.initCause(e);
                    s7.this.f15342b.noMoreExchanges(interruptedIOException);
                    this.f15344b.onFailure(s7.this, interruptedIOException);
                    s7.this.f15341a.j().b(this);
                }
            } catch (Throwable th) {
                s7.this.f15341a.j().b(this);
                throw th;
            }
        }

        public void a(a aVar) {
            this.d = aVar.d;
        }

        public a(u6 u6Var) {
            super("OkHttp %s", s7.this.c());
            this.f15345c = false;
            this.d = new AtomicInteger(0);
            this.f15344b = u6Var;
        }
    }

    @Override // com.huawei.hms.network.embedded.t6
    public v7 execute() throws IOException {
        synchronized (this) {
            if (this.e) {
                throw new IllegalStateException("Already Executed");
            }
            this.e = true;
        }
        this.f15342b.timeoutEnter();
        this.f15342b.callStart();
        try {
            this.f15341a.j().a(this);
            return b();
        } finally {
            this.f15341a.j().b(this);
        }
    }

    @Override // com.huawei.hms.network.embedded.t6
    public void enqueue(u6 u6Var) {
        synchronized (this) {
            if (this.e) {
                throw new IllegalStateException("Already Executed");
            }
            this.e = true;
        }
        this.f15342b.callStart();
        this.f15341a.j().a(new a(u6Var));
    }

    public String d() {
        StringBuilder sb = new StringBuilder();
        sb.append(isCanceled() ? "canceled " : "");
        sb.append(this.d ? "web socket" : NotificationCompat.CATEGORY_CALL);
        sb.append(" to ");
        sb.append(c());
        return sb.toString();
    }

    @Override // com.huawei.hms.network.embedded.t6
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public s7 m1389clone() {
        return a(this.f15341a, this.f15343c, this.d);
    }

    @Override // com.huawei.hms.network.embedded.t6
    public void cancel() {
        this.f15342b.cancel();
    }

    public String c() {
        return this.f15343c.k().r();
    }

    /* JADX WARN: Code duplicated, block: B:20:0x00a3  */
    public v7 b() throws Throwable {
        boolean z;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f15341a.r());
        arrayList.add(new n9(this.f15341a));
        arrayList.add(new e9(this.f15341a.i()));
        arrayList.add(new i8(this.f15341a.s()));
        arrayList.add(new t8(this.f15341a));
        if (!this.d) {
            arrayList.addAll(this.f15341a.t());
        }
        arrayList.add(new f9(this.d));
        try {
            v7 v7VarA = new k9(arrayList, this.f15342b, null, 0, this.f15343c, this, this.f15341a.e(), this.f15341a.A(), this.f15341a.E()).a(this.f15343c);
            if (this.f15342b.isCanceled()) {
                f8.a(v7VarA);
                throw new IOException("Canceled");
            }
            this.f15342b.noMoreExchanges(null);
            return v7VarA;
        } catch (IOException e) {
            try {
                throw this.f15342b.noMoreExchanges(e);
            } catch (Throwable th) {
                th = th;
                z = true;
                if (!z) {
                    this.f15342b.noMoreExchanges(null);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            z = false;
            if (!z) {
                this.f15342b.noMoreExchanges(null);
            }
            throw th;
        }
    }

    public v7 a() throws IOException {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new n9(this.f15341a));
        arrayList.add(new x8(this.f15341a));
        return new k9(arrayList, this.f15342b, null, 0, this.f15343c, this, this.f15341a.e(), this.f15341a.A(), this.f15341a.E()).a(this.f15343c);
    }

    public static s7 a(q7 q7Var, t7 t7Var, boolean z) {
        s7 s7Var = new s7(q7Var, t7Var, z);
        s7Var.f15342b = new d9(q7Var, s7Var);
        return s7Var;
    }

    public s7(q7 q7Var, t7 t7Var, boolean z) {
        this.f15341a = q7Var;
        this.f15343c = t7Var;
        this.d = z;
    }
}
