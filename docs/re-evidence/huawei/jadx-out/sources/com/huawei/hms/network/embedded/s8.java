package com.huawei.hms.network.embedded;

import java.io.IOException;
import java.net.Inet6Address;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.nio.channels.ClosedSelectorException;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;

/* JADX INFO: loaded from: classes34.dex */
public class s8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArrayList<InetSocketAddress> f15346a;
    public final int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public boolean i;
    public Selector j;
    public InetSocketAddress m;
    public int n;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList<InetSocketAddress> f15347b = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArrayList<b> f15348c = new CopyOnWriteArrayList<>();
    public Object k = new Object();
    public volatile boolean l = false;

    public List<InetSocketAddress> b() {
        return this.f15347b;
    }

    public void a(InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2) {
        this.i = inetSocketAddress2 == null || inetSocketAddress.getAddress().getAddress().length == inetSocketAddress2.getAddress().getAddress().length;
    }

    public void a() {
        String str;
        if (this.j != null) {
            synchronized (this.k) {
                try {
                    try {
                        this.l = true;
                        Selector selector = this.j;
                        if (selector != null) {
                            selector.close();
                        }
                    } catch (Throwable th) {
                        this.j = null;
                        throw th;
                    }
                } catch (IOException unused) {
                    str = "Selector close error";
                    a(str, (Throwable) null);
                } catch (Exception unused2) {
                    str = "Selector close exception";
                    a(str, (Throwable) null);
                }
                this.j = null;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0034  */
    /* JADX WARN: Code duplicated, block: B:34:? A[RETURN, SYNTHETIC] */
    public Socket a(long j, SocketFactory socketFactory, Proxy proxy, t6 t6Var, g7 g7Var) {
        ClosedSelectorException e;
        SocketChannel socketChannelA;
        try {
            this.j = Selector.open();
            try {
                socketChannelA = a(j, proxy, t6Var, g7Var);
                if (socketChannelA != null) {
                    try {
                        try {
                            socketChannelA.configureBlocking(true);
                        } catch (IOException unused) {
                            a("Socket channel close error", (Throwable) null);
                            socketChannelA = null;
                            c();
                            if (socketChannelA != null) {
                                return socketChannelA.socket();
                            }
                            return null;
                        }
                    } catch (IOException unused2) {
                        socketChannelA.close();
                        socketChannelA = null;
                        c();
                        if (socketChannelA != null) {
                            return socketChannelA.socket();
                        }
                        return null;
                    } catch (ClosedSelectorException e2) {
                        e = e2;
                        a("Selector is already closed", e);
                    }
                }
            } catch (ClosedSelectorException e3) {
                e = e3;
                socketChannelA = null;
            }
            c();
            if (socketChannelA != null) {
                return socketChannelA.socket();
            }
            return null;
        } catch (IOException unused3) {
            return null;
        }
    }

    private SocketChannel d() {
        Iterator<SelectionKey> it = this.j.selectedKeys().iterator();
        SocketChannel socketChannel = null;
        while (it.hasNext()) {
            SelectionKey next = it.next();
            it.remove();
            if (next.isConnectable() && next.attachment() != null) {
                b bVar = (b) next.attachment();
                try {
                    SocketChannel socketChannel2 = bVar.f15349a;
                    if (socketChannel2.finishConnect()) {
                        next.cancel();
                        try {
                            this.f15348c.remove(bVar);
                            this.m = bVar.f15350b;
                            return socketChannel2;
                        } catch (IOException unused) {
                            socketChannel = socketChannel2;
                            next.cancel();
                            a(bVar);
                        }
                    } else {
                        next.cancel();
                        a(bVar);
                    }
                } catch (IOException unused2) {
                }
            }
        }
        return socketChannel;
    }

    private void c() {
        Iterator<b> it = this.f15348c.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        this.f15348c.clear();
        Selector selector = this.j;
        if (selector != null) {
            try {
                try {
                    try {
                        selector.close();
                    } catch (Exception e) {
                        a("Selector close error", e);
                    }
                } catch (IOException unused) {
                    a("Selector close error", (Throwable) null);
                }
            } finally {
                this.j = null;
            }
        }
    }

    public final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public SocketChannel f15349a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public InetSocketAddress f15350b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f15351c;

        public boolean c() {
            return TimeUnit.NANOSECONDS.toMillis(System.nanoTime()) >= this.f15351c;
        }

        public long b() {
            long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime());
            long j = this.f15351c;
            if (millis >= j) {
                return 0L;
            }
            return j - millis;
        }

        public void a(InetSocketAddress inetSocketAddress, long j, int i, Proxy proxy, t6 t6Var, g7 g7Var) throws IOException {
            this.f15350b = inetSocketAddress;
            this.f15351c = TimeUnit.NANOSECONDS.toMillis(System.nanoTime()) + j;
            g7Var.connectStart(t6Var, inetSocketAddress, proxy);
            SocketChannel socketChannelOpen = SocketChannel.open();
            this.f15349a = socketChannelOpen;
            socketChannelOpen.configureBlocking(false);
            this.f15349a.socket().setTrafficClass(i);
            this.f15349a.connect(inetSocketAddress);
        }

        public void a() {
            SocketChannel socketChannel = this.f15349a;
            if (socketChannel == null) {
                return;
            }
            try {
                try {
                    socketChannel.close();
                } catch (IOException unused) {
                    s8.this.a("Socket channel close error", (Throwable) null);
                }
            } finally {
                this.f15349a = null;
            }
        }

        public b() {
            this.f15349a = null;
            this.f15350b = null;
            this.f15351c = 0L;
        }
    }

    private boolean a(InetSocketAddress inetSocketAddress, long j, Proxy proxy, t6 t6Var, g7 g7Var) {
        b bVar = new b();
        try {
            bVar.a(inetSocketAddress, j, this.n, proxy, t6Var, g7Var);
            synchronized (this.k) {
                if (this.j == null) {
                    return false;
                }
                bVar.f15349a.register(this.j, 8).attach(bVar);
                this.f15348c.add(bVar);
                return true;
            }
        } catch (IOException unused) {
            a("Failed to parepare socket channel for " + inetSocketAddress.toString(), (Throwable) null);
            this.f15347b.add(inetSocketAddress);
            bVar.a();
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, Throwable th) {
        ma.f().a(4, str, th);
    }

    private void a(b bVar) {
        this.f15347b.add(bVar.f15350b);
        this.f15348c.remove(bVar);
        bVar.a();
    }

    private void a(long j) {
        while (this.f15348c.size() > 0) {
            b bVar = this.f15348c.get(0);
            if (!bVar.c()) {
                return;
            } else {
                a(bVar);
            }
        }
    }

    private SocketChannel a(long j, Proxy proxy, t6 t6Var, g7 g7Var) {
        boolean z;
        long j2 = this.e;
        long j3 = j - j2;
        SocketChannel socketChannelD = null;
        boolean z2 = true;
        boolean z3 = false;
        while (!this.l) {
            if (this.f15346a.size() > 0 && z2) {
                InetSocketAddress inetSocketAddressRemove = this.f15346a.remove(0);
                if (this.f <= 0 || z3 || !(inetSocketAddressRemove.getAddress() instanceof Inet6Address)) {
                    if (this.f15346a.isEmpty()) {
                        a(inetSocketAddressRemove, (InetSocketAddress) null);
                    } else {
                        a(inetSocketAddressRemove, this.f15346a.get(0));
                    }
                    this.e = this.i ? this.g : this.h;
                    z = z3;
                } else {
                    this.e = this.f;
                    z = true;
                }
                long j4 = this.e;
                long j5 = j - j4;
                if (a(inetSocketAddressRemove, j, proxy, t6Var, g7Var)) {
                    j3 = j5 + ((long) this.e);
                    z2 = false;
                    z3 = z;
                    j2 = j4;
                } else {
                    z3 = z;
                    j2 = j4;
                    j3 = j5;
                }
            }
            if (this.f15348c.isEmpty() && this.f15346a.isEmpty()) {
                return null;
            }
            long jB = this.f15348c.size() > 0 ? this.f15348c.get(0).b() : j3;
            if (this.f15346a.size() > 0 && jB > j2) {
                jB = j2;
            }
            long jNanoTime = System.nanoTime();
            try {
                this.j.select(jB);
                if (this.l) {
                    return null;
                }
                long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - jNanoTime);
                socketChannelD = d();
                if (socketChannelD == null) {
                    a(millis);
                    if (this.f15347b.size() != this.d && millis < j3) {
                        j3 -= millis;
                        if (this.f15346a.size() > 0) {
                            if (millis >= j2) {
                                long j6 = this.e;
                                j2 = j6 - ((millis - j2) % j6);
                                z2 = true;
                            } else {
                                j2 -= millis;
                            }
                        }
                    }
                }
                return socketChannelD;
            } catch (IOException unused) {
                return null;
            }
        }
        return socketChannelD;
    }

    public s8(CopyOnWriteArrayList<InetSocketAddress> copyOnWriteArrayList, int i, int i2, int i3) {
        this.f15346a = new CopyOnWriteArrayList<>(copyOnWriteArrayList);
        this.e = i;
        this.f = i3;
        this.g = i;
        this.h = i / 2;
        this.n = i2;
        this.d = copyOnWriteArrayList.size();
    }
}
