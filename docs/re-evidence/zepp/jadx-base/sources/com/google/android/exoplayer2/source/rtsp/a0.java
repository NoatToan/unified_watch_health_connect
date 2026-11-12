package com.google.android.exoplayer2.source.rtsp;

import com.google.android.exoplayer2.util.Util;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
final class a0 implements RtpDataChannel.Factory {
    private final long a;

    public a0(long socketTimeoutMs) {
        this.a = socketTimeoutMs;
    }

    @Override // com.google.android.exoplayer2.source.rtsp.RtpDataChannel.Factory
    public RtpDataChannel createAndOpenDataChannel(int trackId) throws IOException {
        z zVar = new z(this.a);
        z zVar2 = new z(this.a);
        try {
            zVar.open(RtpUtils.getIncomingRtpDataSpec(0));
            int localPort = zVar.getLocalPort();
            boolean z = localPort % 2 == 0;
            zVar2.open(RtpUtils.getIncomingRtpDataSpec(z ? localPort + 1 : localPort - 1));
            if (z) {
                zVar.c(zVar2);
                return zVar;
            }
            zVar2.c(zVar);
            return zVar2;
        } catch (IOException e) {
            Util.closeQuietly(zVar);
            Util.closeQuietly(zVar2);
            throw e;
        }
    }

    @Override // com.google.android.exoplayer2.source.rtsp.RtpDataChannel.Factory
    public RtpDataChannel.Factory createFallbackDataChannelFactory() {
        return new y(this.a);
    }
}
