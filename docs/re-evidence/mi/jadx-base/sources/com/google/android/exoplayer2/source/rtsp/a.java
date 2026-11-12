package com.google.android.exoplayer2.source.rtsp;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public interface a extends com.google.android.exoplayer2.upstream.a {

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.rtsp.a$a, reason: collision with other inner class name */
    public interface InterfaceC0196a {
        a a(int i) throws IOException;
    }

    int c();

    String j();

    boolean m();

    void write(byte[] bArr);
}
