package org.eclipse.californium.elements.util;

import defpackage.aaex;
import defpackage.zzp;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InterfaceAddress;
import java.net.NetworkInterface;
import java.net.SocketAddress;
import java.net.SocketException;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.regex.Pattern;
import org.eclipse.californium.scandium.dtls.RecordLayer;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes20.dex */
public class NetworkInterfacesUtil {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f44497c;
    private static boolean e;
    private static int f;
    private static int g;
    private static Inet4Address i;
    private static int j;
    private static NetworkInterface l;
    private static Inet6Address n;
    private static Inet4Address o;
    private static final Logger d = aaex.a((Class<?>) NetworkInterfacesUtil.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Pattern f44496b = Pattern.compile("(vxlan\\.calico|cali[0123456789abcdef]{10,}|cilium_\\w+|lxc[0123456789abcdef]{12,}|virbr\\d+|docker\\d+)");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Pattern f44495a = Pattern.compile("^([0-9a-fA-F:]+)(%\\w+)?$");
    private static final Set<InetAddress> h = new HashSet();
    private static final Set<String> m = new HashSet();

    /* JADX INFO: loaded from: classes46.dex */
    public interface InetAddressFilter {
        boolean matches(InetAddress inetAddress);
    }

    static class c implements Enumeration<NetworkInterface> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Pattern f44498a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Pattern f44499b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private NetworkInterface f44500c;
        private final Enumeration<NetworkInterface> e;

        private c(Enumeration<NetworkInterface> enumeration) {
            Pattern patternCompile;
            this.e = enumeration;
            String strB = zzp.b("COAP_NETWORK_INTERFACES");
            String strB2 = zzp.b("COAP_NETWORK_INTERFACES_EXCLUDE");
            Pattern patternCompile2 = null;
            if (strB != null && !strB.isEmpty()) {
                patternCompile = Pattern.compile(strB);
            } else if (strB2 == null || strB2.isEmpty()) {
                patternCompile2 = NetworkInterfacesUtil.f44496b;
                patternCompile = null;
            } else {
                patternCompile = null;
            }
            if (strB2 != null && !strB2.isEmpty()) {
                patternCompile2 = Pattern.compile(strB2);
            }
            this.f44499b = patternCompile;
            this.f44498a = patternCompile2;
            c();
        }

        @Override // java.util.Enumeration
        public boolean hasMoreElements() {
            return this.f44500c != null;
        }

        @Override // java.util.Enumeration
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public NetworkInterface nextElement() {
            NetworkInterface networkInterface = this.f44500c;
            c();
            return networkInterface;
        }

        private void c() {
            Pattern pattern;
            Pattern pattern2;
            this.f44500c = null;
            while (this.e.hasMoreElements()) {
                NetworkInterface networkInterfaceNextElement = this.e.nextElement();
                String name = networkInterfaceNextElement.getName();
                try {
                    if (networkInterfaceNextElement.isUp() && (((pattern = this.f44499b) == null || pattern.matcher(name).matches()) && ((pattern2 = this.f44498a) == null || !pattern2.matcher(name).matches()))) {
                        this.f44500c = networkInterfaceNextElement;
                        return;
                    }
                } catch (SocketException unused) {
                }
                NetworkInterfacesUtil.d.debug("skip {}", name);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void g() {
        int iMin;
        int i2;
        int i3;
        Inet4Address inet4Address;
        Inet4Address inet4Address2;
        Iterator<InterfaceAddress> it;
        InetAddress address;
        synchronized (NetworkInterfacesUtil.class) {
            if (f == 0) {
                a();
                boolean z = true;
                try {
                    Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
                    if (networkInterfaces == null) {
                        throw new SocketException("Network interfaces not available!");
                    }
                    AnonymousClass5 anonymousClass5 = null;
                    c cVar = new c(networkInterfaces);
                    iMin = 65535;
                    i2 = 65535;
                    i3 = 65535;
                    while (cVar.hasMoreElements()) {
                        try {
                            NetworkInterface networkInterfaceNextElement = cVar.nextElement();
                            if (!networkInterfaceNextElement.isLoopback()) {
                                int mtu = networkInterfaceNextElement.getMTU();
                                if (mtu > 0 && mtu < iMin) {
                                    iMin = mtu;
                                }
                                if (networkInterfaceNextElement.supportsMulticast()) {
                                    Enumeration<InetAddress> inetAddresses = networkInterfaceNextElement.getInetAddresses();
                                    while (inetAddresses.hasMoreElements()) {
                                        InetAddress inetAddressNextElement = inetAddresses.nextElement();
                                        if ((inetAddressNextElement instanceof Inet6Address) && ((Inet6Address) inetAddressNextElement).getScopeId() > 0) {
                                            m.add(networkInterfaceNextElement.getName());
                                        }
                                    }
                                }
                                if (networkInterfaceNextElement.supportsMulticast() && ((inet4Address = o) == null || n == null || i == null)) {
                                    int i4 = i != null ? -1 : 0;
                                    if (inet4Address != null) {
                                        i4--;
                                    }
                                    if (n != null) {
                                        i4--;
                                    }
                                    Enumeration<InetAddress> inetAddresses2 = networkInterfaceNextElement.getInetAddresses();
                                    Object obj = anonymousClass5;
                                    Object obj2 = obj;
                                    Object obj3 = obj2;
                                    Object obj4 = obj3;
                                    Object obj5 = obj;
                                    Object obj6 = obj2;
                                    Object obj7 = obj3;
                                    while (inetAddresses2.hasMoreElements()) {
                                        InetAddress inetAddressNextElement2 = inetAddresses2.nextElement();
                                        if (inetAddressNextElement2 instanceof Inet4Address) {
                                            e = z;
                                            if (mtu > 0 && mtu < i2) {
                                                i2 = mtu;
                                            }
                                            if (obj5 == null) {
                                                if (inetAddressNextElement2.isSiteLocalAddress()) {
                                                    obj5 = (Inet4Address) inetAddressNextElement2;
                                                } else if (obj6 == null && inetAddressNextElement2.isLinkLocalAddress()) {
                                                    obj6 = (Inet4Address) inetAddressNextElement2;
                                                }
                                            }
                                        } else if (inetAddressNextElement2 instanceof Inet6Address) {
                                            Inet6Address inet6Address = (Inet6Address) inetAddressNextElement2;
                                            f44497c = z;
                                            if (mtu > 0 && mtu < i3) {
                                                i3 = mtu;
                                            }
                                            if (obj4 == null) {
                                                if (inetAddressNextElement2.isSiteLocalAddress()) {
                                                    obj4 = inet6Address;
                                                } else if (obj6 == null && inetAddressNextElement2.isLinkLocalAddress()) {
                                                    obj7 = inet6Address;
                                                }
                                            }
                                        }
                                        obj5 = obj5;
                                        obj6 = obj6;
                                        obj7 = obj7;
                                        obj4 = obj4;
                                    }
                                    Iterator<InterfaceAddress> it2 = networkInterfaceNextElement.getInterfaceAddresses().iterator();
                                    Inet4Address inet4Address3 = null;
                                    while (it2.hasNext()) {
                                        InterfaceAddress next = it2.next();
                                        InetAddress broadcast = next.getBroadcast();
                                        if (broadcast == null || broadcast.isAnyLocalAddress() || (address = next.getAddress()) == null || address.equals(broadcast)) {
                                            it = it2;
                                        } else {
                                            h.add(broadcast);
                                            it = it2;
                                            d.debug("Found broadcast address {} - {}.", broadcast, networkInterfaceNextElement.getName());
                                            if (inet4Address3 == null) {
                                                inet4Address3 = (Inet4Address) broadcast;
                                                i4++;
                                            }
                                        }
                                        it2 = it;
                                    }
                                    if (obj6 != null || obj5 != null) {
                                        i4++;
                                    }
                                    if (obj7 != null || obj4 != null) {
                                        i4++;
                                    }
                                    if (i4 > 0) {
                                        l = networkInterfaceNextElement;
                                        i = inet4Address3;
                                        if (obj5 == null) {
                                            inet4Address2 = obj5;
                                            inet4Address2 = obj6;
                                        }
                                        inet4Address2 = obj5;
                                        o = inet4Address2;
                                        n = obj4 == null ? obj7 : obj4;
                                    }
                                } else {
                                    Enumeration<InetAddress> inetAddresses3 = networkInterfaceNextElement.getInetAddresses();
                                    while (inetAddresses3.hasMoreElements()) {
                                        InetAddress inetAddressNextElement3 = inetAddresses3.nextElement();
                                        if (inetAddressNextElement3 instanceof Inet4Address) {
                                            e = true;
                                            if (mtu > 0 && mtu < i2) {
                                                i2 = mtu;
                                            }
                                        } else if (inetAddressNextElement3 instanceof Inet6Address) {
                                            f44497c = true;
                                            if (mtu > 0 && mtu < i3) {
                                                i3 = mtu;
                                            }
                                        }
                                    }
                                }
                            }
                            z = true;
                            anonymousClass5 = null;
                        } catch (SocketException e2) {
                            e = e2;
                            d.warn("discover the <any> interface failed!", (Throwable) e);
                            e = true;
                            f44497c = true;
                        }
                    }
                    if (h.isEmpty()) {
                        d.info("no broadcast address found!");
                    }
                    if (i2 == 65535) {
                        i2 = RecordLayer.DEFAULT_IPV4_MTU;
                    }
                    if (i3 == 65535) {
                        i3 = 1280;
                    }
                    if (iMin == 65535) {
                        iMin = Math.min(i2, i3);
                    }
                    j = i2;
                    g = i3;
                    f = iMin;
                } catch (SocketException e3) {
                    e = e3;
                    iMin = 65535;
                    i2 = 65535;
                    i3 = 65535;
                }
            }
        }
    }

    public static void a() {
        synchronized (NetworkInterfacesUtil.class) {
            f = 0;
            j = 0;
            g = 0;
            e = false;
            f44497c = false;
            m.clear();
            h.clear();
            i = null;
            o = null;
            n = null;
            l = null;
        }
    }

    public static int c() {
        g();
        return j;
    }

    public static int b() {
        g();
        return g;
    }

    public static boolean h() {
        g();
        return e;
    }

    public static boolean f() {
        g();
        return f44497c;
    }

    public static boolean c(InetAddress inetAddress) {
        g();
        return h.contains(inetAddress);
    }

    public static boolean a(InetAddress inetAddress) {
        g();
        if (inetAddress != null) {
            return inetAddress.isMulticastAddress() || h.contains(inetAddress);
        }
        return false;
    }

    public static boolean a(SocketAddress socketAddress, SocketAddress socketAddress2) {
        if (socketAddress != socketAddress2) {
            return socketAddress != null && socketAddress.equals(socketAddress2);
        }
        return true;
    }
}
