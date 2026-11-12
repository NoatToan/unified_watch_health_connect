package defpackage;

import java.io.IOException;
import java.net.BindException;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.NetworkInterface;
import java.net.SocketAddress;
import java.net.SocketException;
import java.util.List;
import org.eclipse.californium.elements.UDPConnector;
import org.eclipse.californium.elements.util.NetworkInterfacesUtil;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes20.dex */
public class zyi extends UDPConnector {

    @Deprecated
    public static final Logger i = aaex.a((Class<?>) zyi.class);
    private InetAddress g;
    private List<e> h;
    private boolean j;
    private NetworkInterface n;

    public boolean a() {
        return this.d;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0085 A[Catch: all -> 0x0169, TRY_LEAVE, TryCatch #4 {, blocks: (B:3:0x0001, B:7:0x0007, B:8:0x0018, B:9:0x0037, B:11:0x003b, B:13:0x0041, B:23:0x0078, B:24:0x007e, B:26:0x0085, B:27:0x008b, B:29:0x0091, B:30:0x00b9, B:32:0x00bf, B:35:0x00d8, B:37:0x00e3, B:39:0x00e9, B:43:0x00f3, B:44:0x00fa, B:41:0x00ef, B:55:0x011b, B:45:0x00fb, B:47:0x0103, B:49:0x0109, B:53:0x0113, B:54:0x011a, B:51:0x010f, B:56:0x011c, B:58:0x0123, B:60:0x012c, B:16:0x0054, B:17:0x005c, B:19:0x0060, B:22:0x0071, B:64:0x0146, B:65:0x0156, B:67:0x0158, B:68:0x0168), top: B:77:0x0001, inners: #1, #5, #6, #7 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x00b9 A[Catch: SocketException -> 0x00d7, all -> 0x0169, TRY_ENTER, TryCatch #1 {SocketException -> 0x00d7, blocks: (B:27:0x008b, B:29:0x0091, B:30:0x00b9, B:32:0x00bf), top: B:73:0x008b, outer: #4 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x0123 A[Catch: all -> 0x0169, TryCatch #4 {, blocks: (B:3:0x0001, B:7:0x0007, B:8:0x0018, B:9:0x0037, B:11:0x003b, B:13:0x0041, B:23:0x0078, B:24:0x007e, B:26:0x0085, B:27:0x008b, B:29:0x0091, B:30:0x00b9, B:32:0x00bf, B:35:0x00d8, B:37:0x00e3, B:39:0x00e9, B:43:0x00f3, B:44:0x00fa, B:41:0x00ef, B:55:0x011b, B:45:0x00fb, B:47:0x0103, B:49:0x0109, B:53:0x0113, B:54:0x011a, B:51:0x010f, B:56:0x011c, B:58:0x0123, B:60:0x012c, B:16:0x0054, B:17:0x005c, B:19:0x0060, B:22:0x0071, B:64:0x0146, B:65:0x0156, B:67:0x0158, B:68:0x0168), top: B:77:0x0001, inners: #1, #5, #6, #7 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x0091 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x00bf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x007e A[SYNTHETIC] */
    @Override // org.eclipse.californium.elements.UDPConnector, org.eclipse.californium.elements.Connector
    public void start() throws IOException {
        synchronized (this) {
            if (this.f) {
                return;
            }
            InetAddress address = this.f44460c.getAddress();
            MulticastSocket multicastSocket = new MulticastSocket((SocketAddress) null);
            multicastSocket.setLoopbackMode(this.j);
            try {
                multicastSocket.bind(this.f44460c);
                Logger logger = i;
                logger.info("socket {}, loopback mode {}", zzp.c((InetSocketAddress) multicastSocket.getLocalSocketAddress()), Boolean.valueOf(multicastSocket.getLoopbackMode()));
                InetAddress inetAddress = this.g;
                if (inetAddress != null && !inetAddress.isAnyLocalAddress()) {
                    try {
                        multicastSocket.setInterface(this.g);
                        address = this.g;
                        logger.info("interface {}", zzp.d(address));
                    } catch (SocketException e2) {
                        i.error("error: multicast set interface", (Throwable) e2);
                    }
                    while (r2.hasNext()) {
                        if (eVar.f54772c != null) {
                            multicastSocket.joinGroup(new InetSocketAddress(eVar.d, 0), eVar.f54772c);
                            i.info("joined group {} with {}", zzp.d(eVar.d), eVar.f54772c.getDisplayName());
                            if (eVar.f54772c == null) {
                                multicastSocket.joinGroup(eVar.d);
                                i.info("joined group {}", zzp.d(eVar.d));
                            }
                        } else if (eVar.f54772c == null) {
                            multicastSocket.joinGroup(eVar.d);
                            i.info("joined group {}", zzp.d(eVar.d));
                        }
                    }
                    c(multicastSocket);
                    if (this.d) {
                        this.f44459b = new InetSocketAddress(this.h.get(0).d, multicastSocket.getLocalPort());
                    }
                    return;
                }
                NetworkInterface networkInterface = this.n;
                if (networkInterface != null) {
                    try {
                        multicastSocket.setNetworkInterface(networkInterface);
                        logger.info("interface {}", this.n.getDisplayName());
                    } catch (SocketException e3) {
                        i.error("error: multicast set interface", (Throwable) e3);
                    }
                    for (e eVar : this.h) {
                        try {
                            if (eVar.f54772c != null) {
                                try {
                                    multicastSocket.joinGroup(new InetSocketAddress(eVar.d, 0), eVar.f54772c);
                                    i.info("joined group {} with {}", zzp.d(eVar.d), eVar.f54772c.getDisplayName());
                                    if (eVar.f54772c == null) {
                                        multicastSocket.joinGroup(eVar.d);
                                        i.info("joined group {}", zzp.d(eVar.d));
                                    }
                                } catch (UnsupportedOperationException unused) {
                                }
                            } else if (eVar.f54772c == null) {
                                multicastSocket.joinGroup(eVar.d);
                                i.info("joined group {}", zzp.d(eVar.d));
                            }
                        } catch (SocketException e4) {
                            multicastSocket.close();
                            if (eVar.d instanceof Inet4Address) {
                                if ((address.isAnyLocalAddress() && !NetworkInterfacesUtil.h()) || (address instanceof Inet6Address)) {
                                    throw new SocketException("IPv6 only interface doesn't support IPv4 multicast!");
                                }
                            } else if ((eVar.d instanceof Inet6Address) && ((address.isAnyLocalAddress() && !NetworkInterfacesUtil.f()) || (address instanceof Inet4Address))) {
                                throw new SocketException("IPv4 only interface doesn't support IPv6 multicast!");
                            }
                            throw e4;
                        }
                    }
                    c(multicastSocket);
                    if (this.d && this.h.size() == 1) {
                        this.f44459b = new InetSocketAddress(this.h.get(0).d, multicastSocket.getLocalPort());
                    }
                    return;
                }
                while (r2.hasNext()) {
                    if (eVar.f54772c != null) {
                        multicastSocket.joinGroup(new InetSocketAddress(eVar.d, 0), eVar.f54772c);
                        i.info("joined group {} with {}", zzp.d(eVar.d), eVar.f54772c.getDisplayName());
                        if (eVar.f54772c == null) {
                            multicastSocket.joinGroup(eVar.d);
                            i.info("joined group {}", zzp.d(eVar.d));
                        }
                    } else if (eVar.f54772c == null) {
                        multicastSocket.joinGroup(eVar.d);
                        i.info("joined group {}", zzp.d(eVar.d));
                    }
                }
                c(multicastSocket);
                if (this.d) {
                    this.f44459b = new InetSocketAddress(this.h.get(0).d, multicastSocket.getLocalPort());
                }
                return;
            } catch (BindException e5) {
                multicastSocket.close();
                i.error("can't bind to {}", zzp.c(this.f44460c));
                throw e5;
            } catch (SocketException e6) {
                multicastSocket.close();
                i.error("can't bind to {}", zzp.c(this.f44460c));
                throw e6;
            }
            throw th;
        }
    }

    static class e {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final NetworkInterface f54772c;
        private final InetAddress d;
    }
}
