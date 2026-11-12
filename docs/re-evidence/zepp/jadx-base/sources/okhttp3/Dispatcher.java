package okhttp3;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import okhttp3.internal.Util;

/* JADX INFO: loaded from: classes23.dex */
public final class Dispatcher {
    public static final /* synthetic */ boolean h = false;

    @Nullable
    private Runnable c;

    @Nullable
    private ExecutorService d;
    private int a = 64;
    private int b = 5;
    private final Deque<a.b> e = new ArrayDeque();
    private final Deque<a.b> f = new ArrayDeque();
    private final Deque<a> g = new ArrayDeque();

    public Dispatcher(ExecutorService executorService) {
        this.d = executorService;
    }

    private <T> void c(Deque<T> deque, T t) {
        Runnable runnable;
        synchronized (this) {
            if (!deque.remove(t)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
            runnable = this.c;
        }
        if (f() || runnable == null) {
            return;
        }
        runnable.run();
    }

    private boolean f() {
        int i;
        boolean z;
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator<a.b> it2 = this.e.iterator();
            while (it2.hasNext()) {
                a.b next = it2.next();
                if (this.f.size() >= this.a) {
                    break;
                }
                if (g(next) < this.b) {
                    it2.remove();
                    arrayList.add(next);
                    this.f.add(next);
                }
            }
            z = runningCallsCount() > 0;
        }
        int size = arrayList.size();
        for (i = 0; i < size; i++) {
            ((a.b) arrayList.get(i)).e(executorService());
        }
        return z;
    }

    private int g(a.b bVar) {
        int i = 0;
        for (a.b bVar2 : this.f) {
            if (!bVar2.f().f && bVar2.g().equals(bVar.g())) {
                i++;
            }
        }
        return i;
    }

    public void a(a.b bVar) {
        synchronized (this) {
            this.e.add(bVar);
        }
        f();
    }

    public synchronized void b(a aVar) {
        this.g.add(aVar);
    }

    public synchronized void cancelAll() {
        Iterator<a.b> it2 = this.e.iterator();
        while (it2.hasNext()) {
            it2.next().f().cancel();
        }
        Iterator<a.b> it3 = this.f.iterator();
        while (it3.hasNext()) {
            it3.next().f().cancel();
        }
        Iterator<a> it4 = this.g.iterator();
        while (it4.hasNext()) {
            it4.next().cancel();
        }
    }

    public void d(a.b bVar) {
        c(this.f, bVar);
    }

    public void e(a aVar) {
        c(this.g, aVar);
    }

    public synchronized ExecutorService executorService() {
        if (this.d == null) {
            this.d = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), Util.threadFactory("OkHttp Dispatcher", false));
        }
        return this.d;
    }

    public synchronized int getMaxRequests() {
        return this.a;
    }

    public synchronized int getMaxRequestsPerHost() {
        return this.b;
    }

    public synchronized List<Call> queuedCalls() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator<a.b> it2 = this.e.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().f());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public synchronized int queuedCallsCount() {
        return this.e.size();
    }

    public synchronized List<Call> runningCalls() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        arrayList.addAll(this.g);
        Iterator<a.b> it2 = this.f.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().f());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public synchronized int runningCallsCount() {
        return this.f.size() + this.g.size();
    }

    public synchronized void setIdleCallback(@Nullable Runnable runnable) {
        this.c = runnable;
    }

    public void setMaxRequests(int i) {
        if (i >= 1) {
            synchronized (this) {
                this.a = i;
            }
            f();
        } else {
            throw new IllegalArgumentException("max < 1: " + i);
        }
    }

    public void setMaxRequestsPerHost(int i) {
        if (i >= 1) {
            synchronized (this) {
                this.b = i;
            }
            f();
        } else {
            throw new IllegalArgumentException("max < 1: " + i);
        }
    }

    public Dispatcher() {
    }
}
