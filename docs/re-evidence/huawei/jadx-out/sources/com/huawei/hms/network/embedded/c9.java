package com.huawei.hms.network.embedded;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes34.dex */
public final class c9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p6 f14677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a9 f14678b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t6 f14679c;
    public final g7 d;
    public int f;
    public boolean i;
    public List<InetAddress> j;
    public List<Proxy> e = Collections.EMPTY_LIST;
    public List<InetSocketAddress> g = Collections.EMPTY_LIST;
    public final List<x7> h = new ArrayList();

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CopyOnWriteArrayList<x7> f14680a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f14681b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public x7 f14682c;
        public int d;
        public int e;
        public final a9 f;
        public boolean g;
        public InetSocketAddress h;

        public void h() {
            if (this.g) {
                for (x7 x7Var : this.f14680a) {
                    if (this.f14682c != null && x7Var.d().equals(this.f14682c.d())) {
                        this.f14680a.remove(x7Var);
                        return;
                    }
                }
            }
        }

        public x7 g() {
            if (!f()) {
                throw new NoSuchElementException();
            }
            if (this.g) {
                x7 x7Var = this.f14680a.get(0);
                this.f14682c = x7Var;
                this.d++;
                return x7Var;
            }
            CopyOnWriteArrayList<x7> copyOnWriteArrayList = this.f14680a;
            int i = this.f14681b;
            this.f14681b = i + 1;
            return copyOnWriteArrayList.get(i);
        }

        public boolean f() {
            if (this.g) {
                return this.f14680a.size() > 0 && this.d < this.e;
            }
            return this.f14681b < this.f14680a.size();
        }

        public x7 e() {
            return this.f14682c;
        }

        public List<x7> d() {
            return new ArrayList(this.f14680a);
        }

        public void c() {
            InetSocketAddress inetSocketAddress;
            if (!this.g || (inetSocketAddress = this.h) == null) {
                return;
            }
            x7 x7VarB = b(inetSocketAddress);
            if (x7VarB != null) {
                this.f.b(x7VarB);
            }
            this.h = null;
        }

        public void b(x7 x7Var) {
            this.f14682c = x7Var;
        }

        public CopyOnWriteArrayList<InetSocketAddress> b() {
            CopyOnWriteArrayList<InetSocketAddress> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
            Iterator<x7> it = this.f14680a.iterator();
            while (it.hasNext()) {
                copyOnWriteArrayList.add(it.next().d());
            }
            return copyOnWriteArrayList;
        }

        public boolean a() {
            return this.g;
        }

        public void a(List<InetSocketAddress> list) {
            if (this.g) {
                Iterator<InetSocketAddress> it = list.iterator();
                while (it.hasNext()) {
                    b(it.next());
                }
            }
        }

        public void a(InetSocketAddress inetSocketAddress) {
            if (this.g) {
                this.h = inetSocketAddress;
            }
        }

        public void a(x7 x7Var) {
            if (!this.g) {
                this.f.a(x7Var);
            } else {
                if (this.h == null) {
                    return;
                }
                this.f.a(x7Var);
                this.h = null;
            }
        }

        private x7 b(InetSocketAddress inetSocketAddress) {
            for (x7 x7Var : this.f14680a) {
                if (x7Var.d().equals(inetSocketAddress)) {
                    this.f14680a.remove(x7Var);
                    return x7Var;
                }
            }
            return null;
        }

        public a(CopyOnWriteArrayList<x7> copyOnWriteArrayList, a9 a9Var, boolean z) {
            this.f14681b = 0;
            this.d = 0;
            this.e = 0;
            this.h = null;
            this.f14680a = copyOnWriteArrayList;
            if (copyOnWriteArrayList != null) {
                this.e = copyOnWriteArrayList.size();
            }
            this.f = a9Var;
            this.g = z;
        }

        public a(CopyOnWriteArrayList<x7> copyOnWriteArrayList) {
            this.f14681b = 0;
            this.d = 0;
            this.e = 0;
            this.h = null;
            this.f14680a = copyOnWriteArrayList;
            this.g = false;
            this.f = null;
        }
    }

    public a b() throws IOException {
        if (!a()) {
            throw new NoSuchElementException();
        }
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        while (c()) {
            Proxy proxyD = d();
            int size = this.g.size();
            for (int i = 0; i < size; i++) {
                x7 x7Var = new x7(this.f14677a, proxyD, this.g.get(i));
                if (this.f14678b.c(x7Var)) {
                    this.h.add(x7Var);
                } else {
                    copyOnWriteArrayList.add(x7Var);
                }
            }
            if (!copyOnWriteArrayList.isEmpty()) {
                break;
            }
        }
        if (this.i || copyOnWriteArrayList.isEmpty()) {
            copyOnWriteArrayList.addAll(this.h);
            this.h.clear();
        }
        return new a(copyOnWriteArrayList, this.f14678b, this.i);
    }

    public boolean a() {
        return c() || !this.h.isEmpty();
    }

    public c9 a(t7 t7Var) {
        this.i = t7Var.d();
        this.j = t7Var.a();
        if (this.i && (this.e.size() > 1 || (this.e.size() == 1 && this.e.get(0).type() != Proxy.Type.DIRECT))) {
            this.i = false;
        }
        return this;
    }

    private Proxy d() throws IOException {
        if (!c()) {
            throw new SocketException("No route to " + this.f14677a.l().h() + "; exhausted proxy configurations: " + this.e);
        }
        List<Proxy> list = this.e;
        int i = this.f;
        this.f = i + 1;
        Proxy proxy = list.get(i);
        a(proxy);
        return proxy;
    }

    private boolean c() {
        return this.f < this.e.size();
    }

    private void a(Proxy proxy) throws IOException {
        String strH;
        int iN;
        this.g = new ArrayList();
        if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
            strH = this.f14677a.l().h();
            iN = this.f14677a.l().n();
        } else {
            SocketAddress socketAddressAddress = proxy.address();
            if (!(socketAddressAddress instanceof InetSocketAddress)) {
                throw new IllegalArgumentException("Proxy.address() is not an InetSocketAddress: " + socketAddressAddress.getClass());
            }
            InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
            strH = a(inetSocketAddress);
            iN = inetSocketAddress.getPort();
        }
        if (iN < 1 || iN > 65535) {
            throw new SocketException("No route to " + strH + ":" + iN + "; port is out of range");
        }
        if (proxy.type() == Proxy.Type.SOCKS) {
            this.g.add(InetSocketAddress.createUnresolved(strH, iN));
        } else if (!this.i || this.j.isEmpty()) {
            this.d.dnsStart(this.f14679c, strH);
            List<InetAddress> listLookup = this.f14677a.c().lookup(strH);
            if (listLookup.isEmpty()) {
                throw new UnknownHostException(this.f14677a.c() + " returned no addresses for " + strH);
            }
            this.d.dnsEnd(this.f14679c, strH, listLookup);
            int size = listLookup.size();
            for (int i = 0; i < size; i++) {
                this.g.add(new InetSocketAddress(listLookup.get(i), iN));
            }
        }
        a(iN);
    }

    private void a(m7 m7Var, Proxy proxy) {
        List<Proxy> listA;
        if (proxy != null) {
            listA = Collections.singletonList(proxy);
        } else {
            List<Proxy> listSelect = this.f14677a.i().select(m7Var.u());
            listA = (listSelect == null || listSelect.isEmpty()) ? f8.a(Proxy.NO_PROXY) : f8.a(listSelect);
        }
        this.e = listA;
        this.f = 0;
    }

    private void a(int i) {
        if (this.i) {
            List<InetAddress> list = this.j;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    InetSocketAddress inetSocketAddress = new InetSocketAddress(this.j.get(size), i);
                    if (this.g.contains(inetSocketAddress)) {
                        this.g.remove(inetSocketAddress);
                    }
                    this.g.add(0, inetSocketAddress);
                }
            }
            if (this.g.size() == 1) {
                this.i = false;
            }
        }
    }

    public static String a(InetSocketAddress inetSocketAddress) {
        InetAddress address = inetSocketAddress.getAddress();
        return address == null ? inetSocketAddress.getHostName() : address.getHostAddress();
    }

    public c9(p6 p6Var, a9 a9Var, t6 t6Var, g7 g7Var) {
        this.f14677a = p6Var;
        this.f14678b = a9Var;
        this.f14679c = t6Var;
        this.d = g7Var;
        a(p6Var.l(), p6Var.g());
    }
}
