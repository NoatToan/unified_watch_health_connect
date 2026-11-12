package com.google.android.exoplayer2.source.rtsp;

import defpackage.uf6;

/* JADX INFO: loaded from: classes3.dex */
final class y implements RtpDataChannel.Factory {
    private static final int b = 2;
    private final long a;

    public y(long timeoutMs) {
        this.a = timeoutMs;
    }

    @Override // com.google.android.exoplayer2.source.rtsp.RtpDataChannel.Factory
    public RtpDataChannel createAndOpenDataChannel(int trackId) {
        x xVar = new x(this.a);
        xVar.open(RtpUtils.getIncomingRtpDataSpec(trackId * 2));
        return xVar;
    }

    @Override // com.google.android.exoplayer2.source.rtsp.RtpDataChannel.Factory
    public /* synthetic */ RtpDataChannel.Factory createFallbackDataChannelFactory() {
        return uf6.a(this);
    }
}
