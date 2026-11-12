package org.eclipse.californium.scandium;

import com.huawei.openalliance.ad.constant.Constants;
import defpackage.aaae;
import defpackage.aabr;
import defpackage.aaex;
import defpackage.zzf;
import defpackage.zzk;
import defpackage.zzp;
import defpackage.zzx;
import defpackage.zzy;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.List;
import okio.Utf8;
import org.eclipse.californium.scandium.config.DtlsConfig;
import org.eclipse.californium.scandium.dtls.ContentType;
import org.eclipse.californium.scandium.dtls.NodeConnectionIdGenerator;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes46.dex */
public class DtlsClusterConnector extends DTLSConnector {
    protected volatile DatagramSocket k;
    private final boolean l;
    protected final DtlsClusterHealth m;
    private final zzk n;
    private final List<Thread> p;
    private final NodeConnectionIdGenerator q;
    private final boolean r;
    private final InetSocketAddress s;
    private volatile ClusterNodesProvider t;
    private static final Logger o = aaex.a((Class<?>) DtlsClusterConnector.class);
    public static final Byte j = Byte.valueOf(Utf8.REPLACEMENT_BYTE);
    public static final Byte f = (byte) 62;

    public interface ClusterNodesProvider {
        boolean available(InetSocketAddress inetSocketAddress);

        InetSocketAddress getClusterNode(int i);
    }

    protected int b() {
        return 0;
    }

    protected void e(DatagramPacket datagramPacket) throws IOException {
    }

    @Override // org.eclipse.californium.scandium.DTLSConnector
    protected DtlsHealth d(zzy zzyVar) {
        return new zzx(zzyVar.r());
    }

    @Override // org.eclipse.californium.scandium.DTLSConnector
    protected void d(InetSocketAddress inetSocketAddress, DatagramSocket datagramSocket, Integer num) throws IOException {
        try {
            this.k = new DatagramSocket(this.s);
            super.d(inetSocketAddress, datagramSocket, num);
            if (this.r) {
                h();
            }
        } catch (IOException e) {
            Logger logger = o;
            int iJ = j();
            logger.error("cluster-node {}: management-interface {} failed!", Integer.valueOf(iJ), zzp.e(this.s));
            throw e;
        }
    }

    protected void h() {
        int iIntValue = ((Integer) this.f44514a.c(DtlsConfig.af)).intValue();
        for (int i = 0; i < iIntValue; i++) {
            DTLSConnector.Worker worker = new DTLSConnector.Worker("DTLS-Cluster-" + j() + "-Receiver-" + i + Constants.LINK + this.s) { // from class: org.eclipse.californium.scandium.DtlsClusterConnector.2

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private final DatagramPacket f44540c;
                private final byte[] e;

                {
                    int i2 = DtlsClusterConnector.this.g + 28;
                    byte[] bArr = new byte[i2];
                    this.e = bArr;
                    this.f44540c = new DatagramPacket(bArr, i2);
                }

                @Override // org.eclipse.californium.scandium.DTLSConnector.Worker
                public void doWork() throws Exception {
                    this.f44540c.setData(this.e);
                    DtlsClusterConnector.this.k.receive(this.f44540c);
                    Byte bA = DtlsClusterConnector.this.a(this.f44540c);
                    if (bA != null) {
                        if (DtlsClusterConnector.this.a(bA, this.f44540c)) {
                            DtlsClusterConnector.this.c(bA, this.f44540c);
                            return;
                        } else {
                            if (DtlsClusterConnector.this.m != null) {
                                DtlsClusterConnector.this.m.dropForwardMessage();
                                return;
                            }
                            return;
                        }
                    }
                    DtlsClusterConnector.this.e(this.f44540c);
                }
            };
            worker.setDaemon(true);
            worker.start();
            this.p.add(worker);
        }
        o.info("cluster-node {}: started {}", Integer.valueOf(j()), this.k.getLocalSocketAddress());
    }

    @Override // org.eclipse.californium.scandium.DTLSConnector, org.eclipse.californium.elements.Connector
    public void stop() {
        super.stop();
        synchronized (this) {
            this.k.close();
            for (Thread thread : this.p) {
                thread.interrupt();
                try {
                    thread.join(500L);
                } catch (InterruptedException unused) {
                }
            }
            this.p.clear();
        }
    }

    public int j() {
        return this.q.getNodeId();
    }

    protected Byte a(DatagramPacket datagramPacket) {
        byte b2 = datagramPacket.getData()[datagramPacket.getOffset()];
        Byte b3 = j;
        if (b2 == b3.byteValue()) {
            return b3;
        }
        Byte b4 = f;
        if (b2 == b4.byteValue()) {
            return b4;
        }
        return null;
    }

    protected boolean a(Byte b2, DatagramPacket datagramPacket) {
        int length = datagramPacket.getLength();
        return length >= 33 && length > (((datagramPacket.getData()[datagramPacket.getOffset() + 3] & 255) + 4) + b()) + 25;
    }

    protected void c(Byte b2, DatagramPacket datagramPacket) throws IOException {
        InetSocketAddress inetSocketAddress = (InetSocketAddress) datagramPacket.getSocketAddress();
        DatagramPacket datagramPacketJ = j(datagramPacket);
        if (datagramPacketJ == null) {
            DtlsClusterHealth dtlsClusterHealth = this.m;
            if (dtlsClusterHealth != null) {
                dtlsClusterHealth.dropForwardMessage();
                return;
            }
            return;
        }
        if (j.equals(b2)) {
            o.trace("cluster-node {}: received forwarded message", Integer.valueOf(j()));
            super.d(datagramPacketJ, inetSocketAddress);
            DtlsClusterHealth dtlsClusterHealth2 = this.m;
            if (dtlsClusterHealth2 != null) {
                dtlsClusterHealth2.processForwardedMessage();
                return;
            }
            return;
        }
        if (f.equals(b2)) {
            o.trace("cluster-node {}: received backwarded outgoing message", Integer.valueOf(j()));
            super.c(datagramPacketJ);
            DtlsClusterHealth dtlsClusterHealth3 = this.m;
            if (dtlsClusterHealth3 != null) {
                dtlsClusterHealth3.sendBackwardedMessage();
            }
        }
    }

    protected void d(DatagramPacket datagramPacket) throws IOException {
        this.k.send(datagramPacket);
    }

    @Override // org.eclipse.californium.scandium.DTLSConnector
    protected void d(DatagramPacket datagramPacket, InetSocketAddress inetSocketAddress) {
        int offset = datagramPacket.getOffset();
        int length = datagramPacket.getLength();
        byte[] data = datagramPacket.getData();
        InetSocketAddress inetSocketAddress2 = (InetSocketAddress) datagramPacket.getSocketAddress();
        if (data[offset] != ContentType.TLS12_CID.getCode()) {
            o.trace("cluster-node {}: received no CID message from {}, {} bytes.", Integer.valueOf(j()), zzp.e(inetSocketAddress2), Integer.valueOf(length));
        } else if (length > 13) {
            aaae aaaeVarE = aabr.e(new zzf(data, offset, length), this.d);
            if (aaaeVarE != null) {
                int nodeId = this.q.getNodeId(aaaeVarE);
                if (j() != nodeId) {
                    Logger logger = o;
                    logger.trace("cluster-node {}: received foreign message for {} from {}", Integer.valueOf(j()), Integer.valueOf(nodeId), zzp.e(inetSocketAddress2));
                    InetSocketAddress clusterNode = this.t.getClusterNode(nodeId);
                    if (clusterNode != null) {
                        DatagramPacket datagramPacketA = a(j.byteValue(), datagramPacket, (byte[]) null);
                        datagramPacketA.setSocketAddress(clusterNode);
                        try {
                            logger.trace("cluster-node {}: forwards received message from {} to {}, {} bytes", Integer.valueOf(j()), zzp.e(inetSocketAddress2), zzp.e(clusterNode), Integer.valueOf(length));
                            d(datagramPacketA);
                            DtlsClusterHealth dtlsClusterHealth = this.m;
                            if (dtlsClusterHealth != null) {
                                dtlsClusterHealth.forwardMessage();
                                return;
                            }
                            return;
                        } catch (IOException e) {
                            o.info("cluster-node {}: error forwarding to {}/{}:", Integer.valueOf(j()), Integer.valueOf(nodeId), zzp.e(clusterNode), e);
                            DtlsClusterHealth dtlsClusterHealth2 = this.m;
                            if (dtlsClusterHealth2 != null) {
                                dtlsClusterHealth2.dropForwardMessage();
                            } else {
                                this.f44515b.receivingRecord(true);
                            }
                        }
                    } else {
                        this.n.c("cluster-node {}: received foreign message from {} for unknown node {}, {} bytes, dropping.", Integer.valueOf(j()), zzp.e(inetSocketAddress2), Integer.valueOf(nodeId), Integer.valueOf(length));
                        DtlsClusterHealth dtlsClusterHealth3 = this.m;
                        if (dtlsClusterHealth3 != null) {
                            dtlsClusterHealth3.dropForwardMessage();
                        } else {
                            this.f44515b.receivingRecord(true);
                        }
                    }
                } else {
                    o.trace("cluster-node {}: received own message from {}, {} bytes", Integer.valueOf(j()), zzp.e(inetSocketAddress2), Integer.valueOf(length));
                }
            } else {
                this.n.c("cluster-node {}: received broken CID message from {}", Integer.valueOf(j()), zzp.e(inetSocketAddress2));
            }
        } else {
            this.n.c("cluster-node {}: received too short CID message from {}", Integer.valueOf(j()), zzp.e(inetSocketAddress2));
        }
        super.d(datagramPacket, (InetSocketAddress) null);
    }

    @Override // org.eclipse.californium.scandium.DTLSConnector
    protected void e(aabr aabrVar) throws IOException {
        InetSocketAddress inetSocketAddressJ = aabrVar.j();
        InetSocketAddress inetSocketAddressH = aabrVar.h();
        if (inetSocketAddressH != null && this.l) {
            if (this.t.available(inetSocketAddressH)) {
                byte[] bArrL = aabrVar.l();
                int length = bArrL.length;
                int i = length + 28;
                o.trace("cluster-node {}: backwards send message for {} to {}, {} bytes", Integer.valueOf(j()), zzp.e(inetSocketAddressJ), inetSocketAddressH, Integer.valueOf(length));
                DatagramPacket datagramPacketA = a(f.byteValue(), new DatagramPacket(new byte[i], i, inetSocketAddressJ), bArrL);
                datagramPacketA.setSocketAddress(inetSocketAddressH);
                try {
                    d(datagramPacketA);
                    DtlsClusterHealth dtlsClusterHealth = this.m;
                    if (dtlsClusterHealth != null) {
                        dtlsClusterHealth.backwardMessage();
                        return;
                    }
                    return;
                } catch (IOException e) {
                    o.debug("cluster-node {}: sending internal message failed!", Integer.valueOf(j()), e);
                    DtlsClusterHealth dtlsClusterHealth2 = this.m;
                    if (dtlsClusterHealth2 != null) {
                        dtlsClusterHealth2.dropBackwardMessage();
                    }
                    throw e;
                }
            }
            DtlsClusterHealth dtlsClusterHealth3 = this.m;
            if (dtlsClusterHealth3 != null) {
                dtlsClusterHealth3.dropBackwardMessage();
            }
            throw new IOException("Cluster internal destination " + zzp.c(inetSocketAddressH) + " not longer available!");
        }
        o.trace("cluster-node {}: sends message to {}, {} bytes", Integer.valueOf(j()), zzp.e(inetSocketAddressJ), Integer.valueOf(aabrVar.k()));
        super.e(aabrVar);
    }

    private DatagramPacket a(byte b2, DatagramPacket datagramPacket, byte[] bArr) {
        int length;
        byte[] address = datagramPacket.getAddress().getAddress();
        int length2 = address.length + 4 + b();
        byte[] data = datagramPacket.getData();
        if (bArr == null) {
            int offset = datagramPacket.getOffset();
            length = datagramPacket.getLength();
            if (offset != length2) {
                System.arraycopy(data, offset, data, length2, length);
            }
        } else {
            length = bArr.length;
            System.arraycopy(bArr, 0, data, length2, length);
        }
        data[0] = b2;
        data[1] = (byte) datagramPacket.getPort();
        data[2] = (byte) (datagramPacket.getPort() >> 8);
        data[3] = (byte) address.length;
        System.arraycopy(address, 0, data, 4, address.length);
        datagramPacket.setData(data, 0, length + length2);
        return datagramPacket;
    }

    private DatagramPacket j(DatagramPacket datagramPacket) {
        try {
            byte[] data = datagramPacket.getData();
            int offset = datagramPacket.getOffset();
            int length = datagramPacket.getLength();
            int i = data[offset + 3] & 255;
            byte b2 = data[offset + 1];
            byte b3 = data[offset + 2];
            int i2 = offset + 4;
            byte[] bArrCopyOfRange = Arrays.copyOfRange(data, i2, i2 + i);
            int iB = i + 4 + b();
            datagramPacket.setAddress(InetAddress.getByAddress(bArrCopyOfRange));
            datagramPacket.setPort((b2 & 255) | ((b3 & 255) << 8));
            datagramPacket.setData(data, offset + iB, length - iB);
            return datagramPacket;
        } catch (RuntimeException | UnknownHostException unused) {
            return null;
        }
    }
}
