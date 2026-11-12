package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public abstract class edo<T> implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicInteger f16538a = new AtomicInteger(0);

    public void a() {
        if (this.f16538a.compareAndSet(0, 2)) {
            d();
        }
    }

    public abstract void b(T t);

    public abstract T c() throws Exception;

    public abstract void d();

    public abstract void e(Exception exc);

    public abstract void f(T t);

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f16538a.compareAndSet(0, 1)) {
            try {
                T tC = c();
                this.f16538a.set(3);
                try {
                    f(tC);
                } finally {
                    b(tC);
                }
            } catch (Exception e) {
                this.f16538a.set(4);
                e(e);
            }
        }
    }
}
