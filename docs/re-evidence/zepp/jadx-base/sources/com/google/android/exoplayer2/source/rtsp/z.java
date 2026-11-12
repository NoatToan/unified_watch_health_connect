package com.google.android.exoplayer2.source.rtsp;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.upstream.UdpDataSource;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import com.google.common.primitives.Ints;
import defpackage.x21;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class z implements RtpDataChannel {
    private static final String c = "RTP/AVP;unicast;client_port=%d-%d";
    private final UdpDataSource a;

    @Nullable
    private z b;

    public z(long socketTimeoutMs) {
        this.a = new UdpDataSource(2000, Ints.checkedCast(socketTimeoutMs));
    }

    @Override // com.google.android.exoplayer2.source.rtsp.RtpDataChannel
    public String a() {
        int localPort = getLocalPort();
        Assertions.checkState(localPort != -1);
        return Util.formatInvariant(c, Integer.valueOf(localPort), Integer.valueOf(localPort + 1));
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void addTransferListener(TransferListener transferListener) {
        this.a.addTransferListener(transferListener);
    }

    @Override // com.google.android.exoplayer2.source.rtsp.RtpDataChannel
    @Nullable
    public RtspMessageChannel.InterleavedBinaryDataListener b() {
        return null;
    }

    public void c(z rtcpChannel) {
        Assertions.checkArgument(this != rtcpChannel);
        this.b = rtcpChannel;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void close() {
        this.a.close();
        z zVar = this.b;
        if (zVar != null) {
            zVar.close();
        }
    }

    @Override // com.google.android.exoplayer2.source.rtsp.RtpDataChannel
    public int getLocalPort() {
        int localPort = this.a.getLocalPort();
        if (localPort == -1) {
            return -1;
        }
        return localPort;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public /* synthetic */ Map getResponseHeaders() {
        return x21.a(this);
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    @Nullable
    public Uri getUri() {
        return this.a.getUri();
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public long open(DataSpec dataSpec) throws IOException {
        return this.a.open(dataSpec);
    }

    @Override // com.google.android.exoplayer2.upstream.DataReader
    public int read(byte[] buffer, int offset, int length) throws IOException {
        try {
            return this.a.read(buffer, offset, length);
        } catch (UdpDataSource.UdpDataSourceException e) {
            if (e.reason == 2002) {
                return -1;
            }
            throw e;
        }
    }
}
