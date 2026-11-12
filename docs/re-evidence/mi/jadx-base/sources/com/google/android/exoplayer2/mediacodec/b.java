package com.google.android.exoplayer2.mediacodec;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.Format;
import defpackage.s45;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public interface b {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.google.android.exoplayer2.mediacodec.c f7976a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final MediaFormat f7977b;
        public final Format c;
        public final Surface d;
        public final MediaCrypto e;
        public final int f;

        public a(com.google.android.exoplayer2.mediacodec.c cVar, MediaFormat mediaFormat, Format format, Surface surface, MediaCrypto mediaCrypto, int i) {
            this.f7976a = cVar;
            this.f7977b = mediaFormat;
            this.c = format;
            this.d = surface;
            this.e = mediaCrypto;
            this.f = i;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.mediacodec.b$b, reason: collision with other inner class name */
    public interface InterfaceC0187b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final InterfaceC0187b f7978a = new e.b();

        b a(a aVar) throws IOException;
    }

    public interface c {
        void a(b bVar, long j, long j2);
    }

    void a(int i, int i2, s45 s45Var, long j, int i3);

    void b(int i);

    @RequiresApi(19)
    void c(Bundle bundle);

    @RequiresApi(21)
    void d(int i, long j);

    int e(MediaCodec.BufferInfo bufferInfo);

    void f(int i, boolean z);

    void flush();

    MediaFormat g();

    @RequiresApi(23)
    void h(c cVar, Handler handler);

    ByteBuffer i(int i);

    @RequiresApi(23)
    void j(Surface surface);

    void k(int i, int i2, int i3, long j, int i4);

    int l();

    ByteBuffer m(int i);

    void release();
}
