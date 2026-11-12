package okhttp3.internal.connection;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
import okhttp3.Address;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.HttpUrl;
import okhttp3.Route;
import okhttp3.internal.Util;

/* JADX INFO: loaded from: classes23.dex */
public final class RouteSelector {
    private final Address a;
    private final RouteDatabase b;
    private final Call c;
    private final EventListener d;
    private int f;
    private List<Proxy> e = Collections.emptyList();
    private List<InetSocketAddress> g = Collections.emptyList();
    private final List<Route> h = new ArrayList();

    public static final class Selection {
        private final List<Route> a;
        private int b = 0;

        public Selection(List<Route> list) {
            this.a = list;
        }

        public List<Route> getAll() {
            return new ArrayList(this.a);
        }

        public boolean hasNext() {
            return this.b < this.a.size();
        }

        public Route next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            List<Route> list = this.a;
            int i = this.b;
            this.b = i + 1;
            return list.get(i);
        }
    }

    public RouteSelector(Address address, RouteDatabase routeDatabase, Call call, EventListener eventListener) {
        this.a = address;
        this.b = routeDatabase;
        this.c = call;
        this.d = eventListener;
        e(address.url(), address.proxy());
    }

    public static String a(InetSocketAddress inetSocketAddress) {
        InetAddress address = inetSocketAddress.getAddress();
        return address == null ? inetSocketAddress.getHostName() : address.getHostAddress();
    }

    private boolean b() {
        return this.f < this.e.size();
    }

    private Proxy c() throws IOException {
        if (b()) {
            List<Proxy> list = this.e;
            int i = this.f;
            this.f = i + 1;
            Proxy proxy = list.get(i);
            d(proxy);
            return proxy;
        }
        throw new SocketException("No route to " + this.a.url().host() + "; exhausted proxy configurations: " + this.e);
    }

    private void d(Proxy proxy) throws IOException {
        String strHost;
        int iPort;
        this.g = new ArrayList();
        if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
            strHost = this.a.url().host();
            iPort = this.a.url().port();
        } else {
            SocketAddress socketAddressAddress = proxy.address();
            if (!(socketAddressAddress instanceof InetSocketAddress)) {
                throw new IllegalArgumentException("Proxy.address() is not an InetSocketAddress: " + socketAddressAddress.getClass());
            }
            InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
            strHost = a(inetSocketAddress);
            iPort = inetSocketAddress.getPort();
        }
        if (iPort < 1 || iPort > 65535) {
            throw new SocketException("No route to " + strHost + ":" + iPort + "; port is out of range");
        }
        if (proxy.type() == Proxy.Type.SOCKS) {
            this.g.add(InetSocketAddress.createUnresolved(strHost, iPort));
            return;
        }
        this.d.dnsStart(this.c, strHost);
        List<InetAddress> listLookup = this.a.dns().lookup(strHost);
        if (listLookup.isEmpty()) {
            throw new UnknownHostException(this.a.dns() + " returned no addresses for " + strHost);
        }
        this.d.dnsEnd(this.c, strHost, listLookup);
        int size = listLookup.size();
        for (int i = 0; i < size; i++) {
            this.g.add(new InetSocketAddress(listLookup.get(i), iPort));
        }
    }

    private void e(HttpUrl httpUrl, Proxy proxy) {
        if (proxy != null) {
            this.e = Collections.singletonList(proxy);
        } else {
            List<Proxy> listSelect = this.a.proxySelector().select(httpUrl.uri());
            this.e = (listSelect == null || listSelect.isEmpty()) ? Util.immutableList(Proxy.NO_PROXY) : Util.immutableList(listSelect);
        }
        this.f = 0;
    }

    public void connectFailed(Route route, IOException iOException) {
        if (route.proxy().type() != Proxy.Type.DIRECT && this.a.proxySelector() != null) {
            this.a.proxySelector().connectFailed(this.a.url().uri(), route.proxy().address(), iOException);
        }
        this.b.failed(route);
    }

    public boolean hasNext() {
        return b() || !this.h.isEmpty();
    }

    public Selection next() throws IOException {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        ArrayList arrayList = new ArrayList();
        while (b()) {
            Proxy proxyC = c();
            int size = this.g.size();
            for (int i = 0; i < size; i++) {
                Route route = new Route(this.a, proxyC, this.g.get(i));
                if (this.b.shouldPostpone(route)) {
                    this.h.add(route);
                } else {
                    arrayList.add(route);
                }
            }
            if (!arrayList.isEmpty()) {
                break;
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.addAll(this.h);
            this.h.clear();
        }
        return new Selection(arrayList);
    }
}
