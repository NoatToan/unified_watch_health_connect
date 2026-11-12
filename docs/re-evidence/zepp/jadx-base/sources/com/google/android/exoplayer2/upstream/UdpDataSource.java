package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.PlaybackException;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* JADX INFO: loaded from: classes3.dex */
public final class UdpDataSource extends BaseDataSource {
    public static final int DEFAULT_MAX_PACKET_SIZE = 2000;
    public static final int DEFAULT_SOCKET_TIMEOUT_MILLIS = 8000;
    public static final int UDP_PORT_UNSET = -1;
    private final int e;
    private final byte[] f;
    private final DatagramPacket g;

    @Nullable
    private Uri h;

    @Nullable
    private DatagramSocket i;

    @Nullable
    private MulticastSocket j;

    @Nullable
    private InetAddress k;

    @Nullable
    private InetSocketAddress l;
    private boolean m;
    private int n;

    public static final class UdpDataSourceException extends DataSourceException {
        public UdpDataSourceException(Throwable cause, int errorCode) {
            super(cause, errorCode);
        }
    }

    public UdpDataSource() {
        this(2000);
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void close() {
        this.h = null;
        MulticastSocket multicastSocket = this.j;
        if (multicastSocket != null) {
            try {
                multicastSocket.leaveGroup(this.k);
            } catch (IOException unused) {
            }
            this.j = null;
        }
        DatagramSocket datagramSocket = this.i;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.i = null;
        }
        this.k = null;
        this.l = null;
        this.n = 0;
        if (this.m) {
            this.m = false;
            transferEnded();
        }
    }

    public int getLocalPort() {
        DatagramSocket datagramSocket = this.i;
        if (datagramSocket == null) {
            return -1;
        }
        return datagramSocket.getLocalPort();
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    @Nullable
    public Uri getUri() {
        return this.h;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public long open(DataSpec dataSpec) throws UdpDataSourceException {
        Uri uri = dataSpec.uri;
        this.h = uri;
        String host = uri.getHost();
        int port = this.h.getPort();
        transferInitializing(dataSpec);
        try {
            this.k = InetAddress.getByName(host);
            this.l = new InetSocketAddress(this.k, port);
            if (this.k.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(this.l);
                this.j = multicastSocket;
                multicastSocket.joinGroup(this.k);
                this.i = this.j;
            } else {
                this.i = new DatagramSocket(this.l);
            }
            this.i.setSoTimeout(this.e);
            this.m = true;
            transferStarted(dataSpec);
            return -1L;
        } catch (IOException e) {
            throw new UdpDataSourceException(e, 2001);
        } catch (SecurityException e2) {
            throw new UdpDataSourceException(e2, PlaybackException.ERROR_CODE_IO_NO_PERMISSION);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataReader
    public int read(byte[] buffer, int offset, int length) throws UdpDataSourceException {
        if (length == 0) {
            return 0;
        }
        if (this.n == 0) {
            try {
                this.i.receive(this.g);
                int length2 = this.g.getLength();
                this.n = length2;
                bytesTransferred(length2);
            } catch (SocketTimeoutException e) {
                throw new UdpDataSourceException(e, 2002);
            } catch (IOException e2) {
                throw new UdpDataSourceException(e2, 2001);
            }
        }
        int length3 = this.g.getLength();
        int i = this.n;
        int iMin = Math.min(i, length);
        System.arraycopy(this.f, length3 - i, buffer, offset, iMin);
        this.n -= iMin;
        return iMin;
    }

    public UdpDataSource(int maxPacketSize) {
        this(maxPacketSize, 8000);
    }

    public UdpDataSource(int maxPacketSize, int socketTimeoutMillis) {
        super(true);
        this.e = socketTimeoutMillis;
        byte[] bArr = new byte[maxPacketSize];
        this.f = bArr;
        this.g = new DatagramPacket(bArr, 0, maxPacketSize);
    }
}
