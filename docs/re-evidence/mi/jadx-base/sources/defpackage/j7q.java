package defpackage;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.NetworkInterface;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes11.dex */
public class j7q implements Runnable {
    public static final String f = "j7q";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile AtomicBoolean f22509a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ServerSocketChannel f22510b = null;
    public l7q c;
    public int d;
    public Selector e;

    public j7q(l7q l7qVar, int i) {
        this.c = l7qVar;
        this.d = i;
    }

    public void a() {
        StringBuilder sb = new StringBuilder();
        sb.append("Try to close UDTTCPServer on port ");
        sb.append(this.d);
        if (!this.f22509a.compareAndSet(true, false)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Close UDTTCPServer failed, UDTTCPServer on port ");
            sb2.append(this.d);
            sb2.append(" not running");
            return;
        }
        try {
            this.e.close();
        } catch (Exception e) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Exception: ");
            sb3.append(e.toString());
        }
        try {
            this.f22510b.close();
        } catch (Exception e2) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append("Exception: ");
            sb4.append(e2.toString());
        }
        this.e = null;
        this.f22510b = null;
    }

    public String b() {
        String hostAddress = null;
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            boolean z = false;
            while (networkInterfaces.hasMoreElements()) {
                Enumeration<InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
                while (inetAddresses.hasMoreElements()) {
                    InetAddress inetAddressNextElement = inetAddresses.nextElement();
                    if (!inetAddressNextElement.isLoopbackAddress() && (inetAddressNextElement instanceof Inet4Address)) {
                        hostAddress = inetAddressNextElement.getHostAddress();
                        z = true;
                        break;
                    }
                }
                if (z) {
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        voe.c(f, "===> getRealIPv4Address, ip = " + hostAddress);
        return hostAddress;
    }

    public final void c() throws Exception {
        StringBuilder sb = new StringBuilder();
        sb.append("===> IPV6, initServerSocketChannel, SERVER_PORT = ");
        sb.append(this.d);
        this.e = Selector.open();
        ServerSocketChannel serverSocketChannelOpen = ServerSocketChannel.open();
        this.f22510b = serverSocketChannelOpen;
        serverSocketChannelOpen.configureBlocking(false);
        this.f22510b.socket().setReuseAddress(true);
        String strB = b();
        if (strB == null) {
            this.f22510b.socket().bind(new InetSocketAddress(this.d));
        } else {
            InetSocketAddress inetSocketAddress = new InetSocketAddress(strB, this.d);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("===> initServerSocketChannel, IPV6, inetSocketAddress = ");
            sb2.append(inetSocketAddress);
            this.f22510b.socket().bind(inetSocketAddress, this.d);
        }
        this.f22510b.register(this.e, 16);
    }

    @Override // java.lang.Runnable
    public void run() {
        StringBuilder sb = new StringBuilder();
        sb.append("UDTTCPServer on port ");
        sb.append(this.d);
        sb.append(" started");
        this.f22509a.set(true);
        try {
            c();
        } catch (Exception e) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Exception: ");
            sb2.append(e.toString());
            e.printStackTrace();
        }
        while (this.f22509a.get()) {
            try {
                this.e.select(500L);
                Iterator<SelectionKey> it = this.e.selectedKeys().iterator();
                while (this.f22509a.get() && it.hasNext()) {
                    SelectionKey next = it.next();
                    try {
                        if (next.isAcceptable()) {
                            SocketChannel socketChannelAccept = ((ServerSocketChannel) next.channel()).accept();
                            socketChannelAccept.configureBlocking(true);
                            new Thread(new h7q(socketChannelAccept, this.c)).start();
                        }
                    } catch (Exception e2) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("Exception: ");
                        sb3.append(e2.toString());
                        e2.printStackTrace();
                    }
                    it.remove();
                }
            } catch (Exception e3) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append("Exception: ");
                sb4.append(e3.toString());
                e3.printStackTrace();
                try {
                    Thread.sleep(500L);
                } catch (Exception e4) {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("Exception: ");
                    sb5.append(e4.toString());
                }
            }
        }
        StringBuilder sb6 = new StringBuilder();
        sb6.append("UDTTCPServer on port ");
        sb6.append(this.d);
        sb6.append(" stopped");
        a();
    }
}
