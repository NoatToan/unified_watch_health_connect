package com.huawei.hms.network.embedded;

import java.io.IOException;
import java.net.Inet6Address;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.SocketFactory;

/* JADX INFO: loaded from: classes34.dex */
public class q8 extends s8 {
    public static ThreadFactory x;
    public static ExecutorService y;
    public final CopyOnWriteArrayList<InetSocketAddress> o;
    public final CopyOnWriteArrayList<InetSocketAddress> p;
    public final CopyOnWriteArrayList<b> q;
    public int r;
    public int s;
    public BlockingQueue<b> t;
    public b u;
    public volatile boolean v;
    public long w;

    @Override // com.huawei.hms.network.embedded.s8
    public List<InetSocketAddress> b() {
        return this.p;
    }

    @Override // com.huawei.hms.network.embedded.s8
    public /* bridge */ /* synthetic */ void a(InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2) {
        super.a(inetSocketAddress, inetSocketAddress2);
    }

    @Override // com.huawei.hms.network.embedded.s8
    public void a() {
        this.v = true;
        this.t.add(b.m);
    }

    @Override // com.huawei.hms.network.embedded.s8
    public Socket a(long j, SocketFactory socketFactory, Proxy proxy, t6 t6Var, g7 g7Var) {
        b bVar;
        boolean z;
        int size = this.o.isEmpty() ? 0 : this.o.size();
        boolean z2 = true;
        while (!this.o.isEmpty() && !f()) {
            if (this.v) {
                c();
                return null;
            }
            this.w = TimeUnit.NANOSECONDS.toMillis(System.nanoTime());
            b bVarA = a(t6Var, j, socketFactory, proxy, g7Var, this.t);
            if (bVarA != null) {
                if (this.s > 0 && z2 && b(bVarA.f15248b)) {
                    this.r = this.s;
                    z = false;
                } else {
                    this.r = this.i ? this.g : this.h;
                    z = z2;
                }
                try {
                    y.submit(bVarA);
                    this.q.add(bVarA);
                } catch (RejectedExecutionException e) {
                    b(e.getMessage(), e);
                }
                try {
                    if (this.v) {
                        c();
                        return null;
                    }
                    if (f()) {
                        c();
                        return e();
                    }
                    b bVarPoll = this.t.poll(((long) this.r) - (TimeUnit.NANOSECONDS.toMillis(System.nanoTime()) - this.w), TimeUnit.MILLISECONDS);
                    if (this.v) {
                        c();
                        return null;
                    }
                    if (bVarPoll != null) {
                        a(bVarPoll);
                    }
                    z2 = z;
                } catch (InterruptedException e2) {
                    b(e2.getMessage(), e2);
                }
            }
        }
        ArrayList<b> arrayList = new ArrayList(this.q);
        if (!this.v && !f() && d() != size && !arrayList.isEmpty()) {
            try {
                bVar = (b) arrayList.get(arrayList.size() - 1);
            } catch (IndexOutOfBoundsException e3) {
                b(e3.getMessage(), e3);
                bVar = null;
            }
            if (bVar != null) {
                try {
                    b bVarPoll2 = this.t.poll(bVar.b(), TimeUnit.MILLISECONDS);
                    if (!this.v) {
                        if (bVarPoll2 == null) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                a(((b) it.next()).f15248b);
                            }
                        } else {
                            a(bVarPoll2);
                            for (b bVar2 : arrayList) {
                                if (bVar2 != this.u && bVar2.c()) {
                                    a(bVar2.f15248b);
                                }
                            }
                        }
                    }
                } catch (InterruptedException e4) {
                    b(e4.getMessage(), e4);
                }
            }
        }
        b bVar3 = this.u;
        if (bVar3 != null) {
            this.m = bVar3.f15248b;
        }
        try {
            c();
        } catch (RuntimeException unused) {
            b("ClearResource with RuntimeException error", null);
        }
        return e();
    }

    public static final class b implements Callable<b> {
        public static b m = new b();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f15247a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public InetSocketAddress f15248b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Proxy f15249c;
        public SocketFactory d;
        public t6 e;
        public g7 f;
        public long g;
        public int h;
        public Socket i;
        public volatile boolean j;
        public Queue k;
        public int l;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        public b call() throws Exception {
            Thread.currentThread().setName(this.f15247a + Thread.currentThread().getName());
            this.f.connectStart(this.e, this.f15248b, this.f15249c);
            Socket socketCreateSocket = (this.f15249c.type() == Proxy.Type.DIRECT || this.f15249c.type() == Proxy.Type.HTTP) ? this.d.createSocket() : new Socket(this.f15249c);
            this.i = socketCreateSocket;
            socketCreateSocket.setTrafficClass(this.l);
            try {
                this.i.connect(this.f15248b, this.h);
                if (this.j) {
                    f8.a(this.i);
                    return null;
                }
                if (this.i.isClosed()) {
                    return null;
                }
                this.k.add(this);
                return this;
            } catch (IOException | RuntimeException e) {
                f8.a(this.i);
                a(e);
                throw new IOException("ConnectTask call error ", e);
            }
        }

        public boolean c() {
            return TimeUnit.NANOSECONDS.toMillis(System.nanoTime()) >= this.g;
        }

        public long b() {
            long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime());
            long j = this.g;
            if (millis >= j) {
                return 0L;
            }
            return j - millis;
        }

        public void a() {
            this.j = true;
            Socket socket = this.i;
            if (socket == null || socket.isClosed()) {
                return;
            }
            f8.a(this.i);
        }

        private void a(Exception exc) {
            q8.b("address " + this.f15248b + " connect failed", exc);
        }

        public b(InetSocketAddress inetSocketAddress, long j, int i, SocketFactory socketFactory, Proxy proxy, t6 t6Var, g7 g7Var, Queue queue) {
            this.j = false;
            this.f15247a = Thread.currentThread().getName();
            this.f15248b = inetSocketAddress;
            this.f15249c = proxy;
            this.d = socketFactory;
            this.e = t6Var;
            this.f = g7Var;
            this.h = (int) j;
            this.k = queue;
            this.l = i;
            this.g = TimeUnit.NANOSECONDS.toMillis(System.nanoTime()) + j;
        }

        public b() {
            this.j = false;
        }
    }

    private boolean f() {
        boolean z;
        synchronized (this) {
            z = this.u != null;
        }
        return z;
    }

    private Socket e() {
        b bVar = this.u;
        if (bVar != null) {
            return bVar.i;
        }
        return null;
    }

    private int d() {
        int size;
        synchronized (this.p) {
            size = this.p.size();
        }
        return size;
    }

    private void c() {
        b bVar;
        if (!this.v && (bVar = this.u) != null) {
            this.q.remove(bVar);
        }
        for (b bVar2 : this.q) {
            try {
                if (bVar2 != this.u && bVar2.c()) {
                    a(bVar2.f15248b);
                }
                bVar2.a();
            } catch (ConcurrentModificationException e) {
                b(e.getMessage(), e);
            }
        }
        this.q.clear();
    }

    private boolean b(InetSocketAddress inetSocketAddress) {
        if (inetSocketAddress == null || inetSocketAddress.getAddress() == null) {
            return false;
        }
        return inetSocketAddress.getAddress() instanceof Inet6Address;
    }

    public static void b(String str, Throwable th) {
        ma.f().a(4, str, th);
    }

    private void a(InetSocketAddress inetSocketAddress) {
        synchronized (this.p) {
            if (!this.p.contains(inetSocketAddress)) {
                this.p.add(inetSocketAddress);
            }
        }
    }

    private void a(b bVar) {
        synchronized (this) {
            if (this.u != null) {
                return;
            }
            this.u = bVar;
        }
    }

    public class a implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AtomicInteger f15246a = new AtomicInteger(0);

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, " OkHttp_" + this.f15246a.getAndIncrement() + " concurrentConnect");
        }
    }

    private b a(t6 t6Var, long j, SocketFactory socketFactory, Proxy proxy, g7 g7Var, Queue queue) {
        if (this.o.isEmpty()) {
            return null;
        }
        InetSocketAddress inetSocketAddressRemove = this.o.remove(0);
        if (this.o.isEmpty()) {
            a(inetSocketAddressRemove, (InetSocketAddress) null);
        } else {
            a(inetSocketAddressRemove, this.o.get(0));
        }
        return new b(inetSocketAddressRemove, j, this.n, socketFactory, proxy, t6Var, g7Var, queue);
    }

    public q8(CopyOnWriteArrayList<InetSocketAddress> copyOnWriteArrayList, int i, int i2, int i3) {
        super(copyOnWriteArrayList, i, i2, i3);
        this.p = new CopyOnWriteArrayList<>();
        this.q = new CopyOnWriteArrayList<>();
        this.t = new LinkedBlockingQueue();
        this.o = copyOnWriteArrayList;
        this.g = i;
        this.h = i / 2;
        this.s = i3;
    }

    static {
        a aVar = new a();
        x = aVar;
        y = Executors.newCachedThreadPool(aVar);
    }
}
