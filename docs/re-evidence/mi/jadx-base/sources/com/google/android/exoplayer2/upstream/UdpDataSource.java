package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import defpackage.m62;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketException;

/* JADX INFO: loaded from: classes4.dex */
public final class UdpDataSource extends m62 {
    public final int e;
    public final byte[] f;
    public final DatagramPacket g;
    public Uri h;
    public DatagramSocket i;
    public MulticastSocket j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public InetAddress f8403k;
    public InetSocketAddress l;
    public boolean m;
    public int n;

    public static final class UdpDataSourceException extends IOException {
        public UdpDataSourceException(IOException iOException) {
            super(iOException);
        }
    }

    public UdpDataSource() {
        this(2000);
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public long b(b bVar) throws UdpDataSourceException {
        Uri uri = bVar.f8404a;
        this.h = uri;
        String host = uri.getHost();
        int port = this.h.getPort();
        t(bVar);
        try {
            this.f8403k = InetAddress.getByName(host);
            this.l = new InetSocketAddress(this.f8403k, port);
            if (this.f8403k.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(this.l);
                this.j = multicastSocket;
                multicastSocket.joinGroup(this.f8403k);
                this.i = this.j;
            } else {
                this.i = new DatagramSocket(this.l);
            }
            try {
                this.i.setSoTimeout(this.e);
                this.m = true;
                u(bVar);
                return -1L;
            } catch (SocketException e) {
                throw new UdpDataSourceException(e);
            }
        } catch (IOException e2) {
            throw new UdpDataSourceException(e2);
        }
    }

    public int c() {
        DatagramSocket datagramSocket = this.i;
        if (datagramSocket == null) {
            return -1;
        }
        return datagramSocket.getLocalPort();
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public void close() {
        this.h = null;
        MulticastSocket multicastSocket = this.j;
        if (multicastSocket != null) {
            try {
                multicastSocket.leaveGroup(this.f8403k);
            } catch (IOException unused) {
            }
            this.j = null;
        }
        DatagramSocket datagramSocket = this.i;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.i = null;
        }
        this.f8403k = null;
        this.l = null;
        this.n = 0;
        if (this.m) {
            this.m = false;
            s();
        }
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public Uri h() {
        return this.h;
    }

    @Override // defpackage.zm5
    public int read(byte[] bArr, int i, int i2) throws UdpDataSourceException {
        if (i2 == 0) {
            return 0;
        }
        if (this.n == 0) {
            try {
                this.i.receive(this.g);
                int length = this.g.getLength();
                this.n = length;
                r(length);
            } catch (IOException e) {
                throw new UdpDataSourceException(e);
            }
        }
        int length2 = this.g.getLength();
        int i3 = this.n;
        int iMin = Math.min(i3, i2);
        System.arraycopy(this.f, length2 - i3, bArr, i, iMin);
        this.n -= iMin;
        return iMin;
    }

    public UdpDataSource(int i) {
        this(i, 8000);
    }

    public UdpDataSource(int i, int i2) {
        super(true);
        this.e = i2;
        byte[] bArr = new byte[i];
        this.f = bArr;
        this.g = new DatagramPacket(bArr, 0, i);
    }
}
