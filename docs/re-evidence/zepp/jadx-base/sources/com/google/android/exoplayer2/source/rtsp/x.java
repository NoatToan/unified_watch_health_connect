package com.google.android.exoplayer2.source.rtsp;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.upstream.BaseDataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.util.Arrays;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
final class x extends BaseDataSource implements RtpDataChannel, RtspMessageChannel.InterleavedBinaryDataListener {
    private static final String i = "RTP/AVP/TCP;unicast;interleaved=%d-%d";
    private final LinkedBlockingQueue<byte[]> e;
    private final long f;
    private byte[] g;
    private int h;

    public x(long pollTimeoutMs) {
        super(true);
        this.f = pollTimeoutMs;
        this.e = new LinkedBlockingQueue<>();
        this.g = new byte[0];
        this.h = -1;
    }

    @Override // com.google.android.exoplayer2.source.rtsp.RtpDataChannel
    public String a() {
        Assertions.checkState(this.h != -1);
        return Util.formatInvariant(i, Integer.valueOf(this.h), Integer.valueOf(this.h + 1));
    }

    @Override // com.google.android.exoplayer2.source.rtsp.RtpDataChannel
    public RtspMessageChannel.InterleavedBinaryDataListener b() {
        return this;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void close() {
    }

    @Override // com.google.android.exoplayer2.source.rtsp.RtpDataChannel
    public int getLocalPort() {
        return this.h;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    @Nullable
    public Uri getUri() {
        return null;
    }

    @Override // com.google.android.exoplayer2.source.rtsp.RtspMessageChannel.InterleavedBinaryDataListener
    public void onInterleavedBinaryDataReceived(byte[] data) {
        this.e.add(data);
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public long open(DataSpec dataSpec) {
        this.h = dataSpec.uri.getPort();
        return -1L;
    }

    @Override // com.google.android.exoplayer2.upstream.DataReader
    public int read(byte[] buffer, int offset, int length) {
        if (length == 0) {
            return 0;
        }
        int iMin = Math.min(length, this.g.length);
        System.arraycopy(this.g, 0, buffer, offset, iMin);
        int i2 = iMin + 0;
        byte[] bArr = this.g;
        this.g = Arrays.copyOfRange(bArr, iMin, bArr.length);
        if (i2 == length) {
            return i2;
        }
        try {
            byte[] bArrPoll = this.e.poll(this.f, TimeUnit.MILLISECONDS);
            if (bArrPoll == null) {
                return -1;
            }
            int iMin2 = Math.min(length - i2, bArrPoll.length);
            System.arraycopy(bArrPoll, 0, buffer, offset + i2, iMin2);
            if (iMin2 < bArrPoll.length) {
                this.g = Arrays.copyOfRange(bArrPoll, iMin2, bArrPoll.length);
            }
            return i2 + iMin2;
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return -1;
        }
    }
}
