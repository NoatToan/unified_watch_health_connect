package com.google.android.exoplayer2.source.rtsp;

/* JADX INFO: loaded from: classes3.dex */
final class s {
    public final int a;
    public final RtspHeaders b;
    public final String c;

    public s(int status, RtspHeaders headers, String messageBody) {
        this.a = status;
        this.b = headers;
        this.c = messageBody;
    }

    public s(int status, RtspHeaders headers) {
        this(status, headers, "");
    }
}
