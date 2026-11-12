package androidx.media3.datasource;

import android.net.Uri;
import ha.a;
import ha.g;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* JADX INFO: loaded from: classes.dex */
public final class UdpDataSource extends a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f8620e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[] f8621f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final DatagramPacket f8622g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Uri f8623h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public DatagramSocket f8624i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public MulticastSocket f8625j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public InetAddress f8626k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f8627l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f8628m;

    public static final class UdpDataSourceException extends DataSourceException {
        public UdpDataSourceException(Throwable th3, int i14) {
            super(th3, i14);
        }
    }

    public UdpDataSource(int i14, int i15) {
        super(true);
        this.f8620e = i15;
        byte[] bArr = new byte[i14];
        this.f8621f = bArr;
        this.f8622g = new DatagramPacket(bArr, 0, i14);
    }

    @Override // ha.d
    public final long b(g gVar) throws UdpDataSourceException {
        Uri uri = gVar.f82555a;
        this.f8623h = uri;
        String host = uri.getHost();
        host.getClass();
        int port = this.f8623h.getPort();
        e(gVar);
        try {
            this.f8626k = InetAddress.getByName(host);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.f8626k, port);
            if (this.f8626k.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.f8625j = multicastSocket;
                multicastSocket.joinGroup(this.f8626k);
                this.f8624i = this.f8625j;
            } else {
                this.f8624i = new DatagramSocket(inetSocketAddress);
            }
            this.f8624i.setSoTimeout(this.f8620e);
            this.f8627l = true;
            f(gVar);
            return -1L;
        } catch (IOException e4) {
            throw new UdpDataSourceException(e4, 2001);
        } catch (SecurityException e14) {
            throw new UdpDataSourceException(e14, 2006);
        }
    }

    @Override // ha.d
    public final void close() {
        this.f8623h = null;
        MulticastSocket multicastSocket = this.f8625j;
        if (multicastSocket != null) {
            try {
                InetAddress inetAddress = this.f8626k;
                inetAddress.getClass();
                multicastSocket.leaveGroup(inetAddress);
            } catch (IOException unused) {
            }
            this.f8625j = null;
        }
        DatagramSocket datagramSocket = this.f8624i;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f8624i = null;
        }
        this.f8626k = null;
        this.f8628m = 0;
        if (this.f8627l) {
            this.f8627l = false;
            d();
        }
    }

    @Override // ha.d
    public final Uri getUri() {
        return this.f8623h;
    }

    @Override // androidx.media3.common.j
    public final int read(byte[] bArr, int i14, int i15) throws UdpDataSourceException {
        if (i15 == 0) {
            return 0;
        }
        int i16 = this.f8628m;
        DatagramPacket datagramPacket = this.f8622g;
        if (i16 == 0) {
            try {
                DatagramSocket datagramSocket = this.f8624i;
                datagramSocket.getClass();
                datagramSocket.receive(datagramPacket);
                int length = datagramPacket.getLength();
                this.f8628m = length;
                c(length);
            } catch (SocketTimeoutException e4) {
                throw new UdpDataSourceException(e4, 2002);
            } catch (IOException e14) {
                throw new UdpDataSourceException(e14, 2001);
            }
        }
        int length2 = datagramPacket.getLength();
        int i17 = this.f8628m;
        int iMin = Math.min(i17, i15);
        System.arraycopy(this.f8621f, length2 - i17, bArr, i14, iMin);
        this.f8628m -= iMin;
        return iMin;
    }

    public UdpDataSource(int i14) {
        this(i14, 8000);
    }

    public UdpDataSource() {
        this(2000);
    }
}
