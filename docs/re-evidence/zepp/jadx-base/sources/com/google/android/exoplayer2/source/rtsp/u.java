package com.google.android.exoplayer2.source.rtsp;

/* JADX INFO: loaded from: classes3.dex */
final class u {
    public final int a;
    public final RtspMessageUtil.RtspSessionHeader b;
    public final String c;

    public u(int status, RtspMessageUtil.RtspSessionHeader sessionHeader, String transport) {
        this.a = status;
        this.b = sessionHeader;
        this.c = transport;
    }
}
