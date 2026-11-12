package org.eclipse.californium.elements;

import com.huawei.openalliance.ad.constant.Constants;
import defpackage.aaex;
import defpackage.zxx;
import defpackage.zye;
import defpackage.zyi;
import defpackage.zyv;
import defpackage.zyx;
import defpackage.zzg;
import defpackage.zzp;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingQueue;
import org.eclipse.californium.elements.config.Configuration;
import org.eclipse.californium.elements.util.ClockUtil;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes20.dex */
public class UDPConnector implements Connector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final Logger f44458a = aaex.a((Class<?>) UDPConnector.class);
    static final ThreadGroup e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected volatile InetSocketAddress f44459b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final InetSocketAddress f44460c;
    protected boolean d;
    protected volatile boolean f;
    private final Integer g;
    private volatile EndpointContextMatcher h;
    private final Integer i;
    private final BlockingQueue<zxx> k;
    private Integer l;
    private volatile RawDataChannel m;
    private final int n;
    private final int o;
    private boolean p;
    private Integer q;
    private final int t;
    private volatile DatagramSocket y;
    private final List<Thread> s = new LinkedList();
    private final List<Thread> r = new LinkedList();
    private final List<zyi> j = new CopyOnWriteArrayList();

    static {
        ThreadGroup threadGroup = new ThreadGroup("Californium/Elements");
        e = threadGroup;
        threadGroup.setDaemon(false);
    }

    public UDPConnector(InetSocketAddress inetSocketAddress, Configuration configuration) {
        if (inetSocketAddress == null) {
            this.f44460c = new InetSocketAddress(0);
        } else {
            this.f44460c = inetSocketAddress;
        }
        this.f = false;
        this.f44459b = this.f44460c;
        this.k = new LinkedBlockingQueue(((Integer) configuration.c(zyv.f54793c)).intValue());
        this.o = ((Integer) configuration.c(zyv.d)).intValue();
        this.t = ((Integer) configuration.c(zyv.g)).intValue();
        this.n = ((Integer) configuration.c(zyv.f54791a)).intValue();
        Integer num = (Integer) configuration.c(zyv.e);
        this.i = num;
        Integer num2 = (Integer) configuration.c(zyv.f);
        this.g = num2;
        this.l = num;
        this.q = num2;
    }

    @Override // org.eclipse.californium.elements.Connector
    public boolean isRunning() {
        return this.f;
    }

    @Override // org.eclipse.californium.elements.Connector
    public void start() throws IOException {
        synchronized (this) {
            if (this.f) {
                return;
            }
            Iterator<zyi> it = this.j.iterator();
            while (it.hasNext()) {
                it.next().start();
            }
            DatagramSocket datagramSocket = new DatagramSocket((SocketAddress) null);
            datagramSocket.setReuseAddress(this.p);
            datagramSocket.bind(this.f44460c);
            c(datagramSocket);
        }
    }

    protected void c(DatagramSocket datagramSocket) throws IOException {
        this.y = datagramSocket;
        this.f44459b = (InetSocketAddress) datagramSocket.getLocalSocketAddress();
        Integer num = this.i;
        if (num != null) {
            datagramSocket.setReceiveBufferSize(num.intValue());
        }
        this.l = Integer.valueOf(datagramSocket.getReceiveBufferSize());
        Integer num2 = this.g;
        if (num2 != null) {
            datagramSocket.setSendBufferSize(num2.intValue());
        }
        this.q = Integer.valueOf(datagramSocket.getSendBufferSize());
        this.f = true;
        f44458a.info("UDPConnector starts up {} sender threads and {} receiver threads", Integer.valueOf(this.t), Integer.valueOf(this.o));
        int i = 0;
        while (true) {
            if (i >= this.o) {
                break;
            }
            this.s.add(new a("UDP-Receiver-" + this.f44460c + "[" + i + "]"));
            i++;
        }
        if (!this.d) {
            for (int i2 = 0; i2 < this.t; i2++) {
                this.r.add(new b("UDP-Sender-" + this.f44460c + "[" + i2 + "]"));
            }
        }
        Iterator<Thread> it = this.s.iterator();
        while (it.hasNext()) {
            it.next().start();
        }
        Iterator<Thread> it2 = this.r.iterator();
        while (it2.hasNext()) {
            it2.next().start();
        }
        f44458a.info("UDPConnector listening on {}, recv buf = {}, send buf = {}, recv packet size = {}", this.f44459b, this.l, this.q, Integer.valueOf(this.n));
    }

    @Override // org.eclipse.californium.elements.Connector
    public void stop() {
        ArrayList arrayList = new ArrayList(this.k.size());
        synchronized (this) {
            if (this.f) {
                this.f = false;
                f44458a.debug("UDPConnector on [{}] stopping ...", this.f44459b);
                Iterator<zyi> it = this.j.iterator();
                while (it.hasNext()) {
                    it.next().stop();
                }
                Iterator<Thread> it2 = this.r.iterator();
                while (it2.hasNext()) {
                    it2.next().interrupt();
                }
                Iterator<Thread> it3 = this.s.iterator();
                while (it3.hasNext()) {
                    it3.next().interrupt();
                }
                this.k.drainTo(arrayList);
                if (this.y != null) {
                    this.y.close();
                    this.y = null;
                }
                for (Thread thread : this.r) {
                    thread.interrupt();
                    try {
                        thread.join(1000L);
                    } catch (InterruptedException unused) {
                    }
                }
                this.r.clear();
                for (Thread thread2 : this.s) {
                    thread2.interrupt();
                    try {
                        thread2.join(1000L);
                    } catch (InterruptedException unused2) {
                    }
                }
                this.s.clear();
                f44458a.debug("UDPConnector on [{}] has stopped.", this.f44459b);
                Iterator it4 = arrayList.iterator();
                while (it4.hasNext()) {
                    d((zxx) it4.next());
                }
            }
        }
    }

    @Override // org.eclipse.californium.elements.Connector
    public void destroy() {
        stop();
        Iterator<zyi> it = this.j.iterator();
        while (it.hasNext()) {
            it.next().destroy();
        }
        this.m = null;
    }

    @Override // org.eclipse.californium.elements.Connector
    public void send(zxx zxxVar) {
        boolean z;
        boolean zOffer;
        if (zxxVar == null) {
            throw new NullPointerException("Message must not be null");
        }
        if (this.d) {
            throw new IllegalStateException("Connector is a multicast receiver!");
        }
        if (zxxVar.d().getPort() == 0) {
            String strC = zzp.c(zxxVar.d());
            f44458a.trace("Discarding message with {} bytes to [{}] without destination-port", Integer.valueOf(zxxVar.g()), strC);
            zxxVar.c(new IOException("CoAP message to " + strC + " dropped, destination port 0!"));
            return;
        }
        synchronized (this) {
            z = this.f;
            zOffer = z ? this.k.offer(zxxVar) : false;
        }
        if (!z) {
            d(zxxVar);
        } else {
            if (zOffer) {
                return;
            }
            zxxVar.c(new InterruptedIOException("Connector overloaded."));
        }
    }

    @Override // org.eclipse.californium.elements.Connector
    public void setRawDataReceiver(RawDataChannel rawDataChannel) {
        this.m = rawDataChannel;
        Iterator<zyi> it = this.j.iterator();
        while (it.hasNext()) {
            it.next().setRawDataReceiver(rawDataChannel);
        }
    }

    @Override // org.eclipse.californium.elements.Connector
    public void setEndpointContextMatcher(EndpointContextMatcher endpointContextMatcher) {
        this.h = endpointContextMatcher;
        Iterator<zyi> it = this.j.iterator();
        while (it.hasNext()) {
            it.next().setEndpointContextMatcher(endpointContextMatcher);
        }
    }

    @Override // org.eclipse.californium.elements.Connector
    public InetSocketAddress getAddress() {
        return this.f44459b;
    }

    private void d(zxx zxxVar) {
        zxxVar.c(new InterruptedIOException("Connector is not running."));
    }

    abstract class NetworkStageThread extends Thread {
        protected abstract void work() throws Exception;

        protected NetworkStageThread(String str) {
            super(UDPConnector.e, str);
            setDaemon(true);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            UDPConnector.f44458a.debug("Starting network stage thread [{}]", getName());
            while (UDPConnector.this.f) {
                try {
                    work();
                    if (!UDPConnector.this.f) {
                        UDPConnector.f44458a.debug("Network stage thread [{}] was stopped successfully", getName());
                        return;
                    }
                    continue;
                } catch (InterruptedIOException e) {
                    UDPConnector.f44458a.trace("Network stage thread [{}] was stopped successfully at:", getName(), e);
                } catch (IOException e2) {
                    if (UDPConnector.this.f) {
                        UDPConnector.f44458a.error("Exception in network stage thread [{}]:", getName(), e2);
                    } else {
                        UDPConnector.f44458a.trace("Network stage thread [{}] was stopped successfully at:", getName(), e2);
                    }
                } catch (InterruptedException e3) {
                    UDPConnector.f44458a.trace("Network stage thread [{}] was stopped successfully at:", getName(), e3);
                } catch (Throwable th) {
                    UDPConnector.f44458a.error("Exception in network stage thread [{}]:", getName(), th);
                }
            }
        }
    }

    class a extends NetworkStageThread {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f44462c;
        private final DatagramPacket e;

        private a(String str) {
            super(str);
            int i = UDPConnector.this.n + 1;
            this.f44462c = i;
            this.e = new DatagramPacket(new byte[i], i);
        }

        @Override // org.eclipse.californium.elements.UDPConnector.NetworkStageThread
        protected void work() throws IOException {
            this.e.setLength(this.f44462c);
            DatagramSocket datagramSocket = UDPConnector.this.y;
            if (datagramSocket != null) {
                datagramSocket.receive(this.e);
                UDPConnector.this.processDatagram(this.e);
            }
        }
    }

    class b extends NetworkStageThread {
        private final DatagramPacket d;

        private b(String str) {
            super(str);
            this.d = new DatagramPacket(zzg.f54809a, 0);
        }

        @Override // org.eclipse.californium.elements.UDPConnector.NetworkStageThread
        protected void work() throws InterruptedException {
            zxx zxxVar = (zxx) UDPConnector.this.k.take();
            EndpointContext endpointContextC = zxxVar.c();
            InetSocketAddress peerAddress = endpointContextC.getPeerAddress();
            zye zyeVar = new zye(peerAddress);
            EndpointContextMatcher endpointContextMatcher = UDPConnector.this.h;
            if (endpointContextMatcher != null && !endpointContextMatcher.isToBeSent(endpointContextC, zyeVar)) {
                Logger logger = UDPConnector.f44458a;
                InetSocketAddress inetSocketAddress = UDPConnector.this.f44459b;
                int length = this.d.getLength();
                logger.warn("UDPConnector ({}) drops {} bytes to {}", inetSocketAddress, Integer.valueOf(length), zzp.e(peerAddress));
                zxxVar.c(new zyx("UDP sending"));
                return;
            }
            this.d.setData(zxxVar.b());
            this.d.setSocketAddress(peerAddress);
            DatagramSocket datagramSocket = UDPConnector.this.y;
            if (datagramSocket != null) {
                try {
                    zxxVar.d(zyeVar);
                    datagramSocket.send(this.d);
                    zxxVar.h();
                } catch (IOException e) {
                    zxxVar.c(e);
                }
                Logger logger2 = UDPConnector.f44458a;
                int length2 = this.d.getLength();
                logger2.debug("UDPConnector ({}) sent {} bytes to {}", this, Integer.valueOf(length2), zzp.e(peerAddress));
                return;
            }
            zxxVar.c(new IOException("socket already closed!"));
        }
    }

    @Override // org.eclipse.californium.elements.Connector
    public void processDatagram(DatagramPacket datagramPacket) {
        InetSocketAddress inetSocketAddress = this.f44459b;
        RawDataChannel rawDataChannel = this.m;
        if (datagramPacket.getPort() == 0) {
            f44458a.trace("Discarding message with {} bytes from [{}] without source-port", Integer.valueOf(datagramPacket.getLength()), zzp.e(datagramPacket.getSocketAddress()));
            return;
        }
        if (datagramPacket.getLength() > this.n) {
            f44458a.debug("UDPConnector ({}) received truncated UDP datagram from {}. Maximum size allowed {}. Discarding ...", inetSocketAddress, zzp.e(datagramPacket.getSocketAddress()), Integer.valueOf(this.n));
            return;
        }
        if (rawDataChannel == null) {
            f44458a.debug("UDPConnector ({}) received UDP datagram from {} without receiver. Discarding ...", inetSocketAddress, zzp.e(datagramPacket.getSocketAddress()));
            return;
        }
        long jC = ClockUtil.c();
        String strC = zzp.c(inetSocketAddress);
        if (this.d) {
            strC = "mc/" + strC;
        }
        f44458a.debug("UDPConnector ({}) received {} bytes from {}", strC, Integer.valueOf(datagramPacket.getLength()), zzp.e(datagramPacket.getSocketAddress()));
        rawDataChannel.receiveData(zxx.c(Arrays.copyOfRange(datagramPacket.getData(), datagramPacket.getOffset(), datagramPacket.getLength()), new zye(new InetSocketAddress(datagramPacket.getAddress(), datagramPacket.getPort())), this.d, jC, inetSocketAddress));
    }

    @Override // org.eclipse.californium.elements.Connector
    public String getProtocol() {
        return "UDP";
    }

    public String toString() {
        return getProtocol() + Constants.LINK + zzp.c(getAddress());
    }
}
