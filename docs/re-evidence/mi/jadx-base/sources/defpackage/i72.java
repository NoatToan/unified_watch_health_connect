package defpackage;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Looper;
import android.view.Surface;
import androidx.annotation.RequiresApi;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
@RequiresApi(api = 21)
public abstract class i72 implements u98 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f20848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public MediaCodec f20849b;
    public b c;
    public MediaCodec.Callback d = new a();

    public class a extends MediaCodec.Callback {
        public a() {
        }

        @Override // android.media.MediaCodec.Callback
        public void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
            i72.this.c.a(i72.this, codecException);
        }

        @Override // android.media.MediaCodec.Callback
        public void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
            i72.this.c.b(i72.this, i);
        }

        @Override // android.media.MediaCodec.Callback
        public void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
            i72.this.c.c(i72.this, i, bufferInfo);
        }

        @Override // android.media.MediaCodec.Callback
        public void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
            i72.this.c.d(i72.this, mediaFormat);
        }
    }

    public static abstract class b implements u98.a {
        public void b(i72 i72Var, int i) {
        }

        public abstract void c(i72 i72Var, int i, MediaCodec.BufferInfo bufferInfo);

        public abstract void d(i72 i72Var, MediaFormat mediaFormat);
    }

    public i72(String str) {
        this.f20848a = str;
    }

    public final MediaCodec b(String str) throws IOException {
        try {
            String str2 = this.f20848a;
            if (str2 != null) {
                return MediaCodec.createByCodecName(str2);
            }
        } catch (IOException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("Create MediaCodec by name '");
            sb.append(this.f20848a);
            sb.append("' failure!");
        }
        return MediaCodec.createEncoderByType(str);
    }

    public abstract MediaFormat c();

    public final MediaCodec d() {
        MediaCodec mediaCodec = this.f20849b;
        Objects.requireNonNull(mediaCodec, "doesn't prepare()");
        return mediaCodec;
    }

    @RequiresApi(api = 21)
    public final ByteBuffer e(int i) {
        return d().getOutputBuffer(i);
    }

    public abstract void f(MediaCodec mediaCodec);

    @RequiresApi(api = 21)
    public void g() throws IOException {
        if (Looper.myLooper() == null || Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("should run in a HandlerThread");
        }
        if (this.f20849b != null) {
            throw new IllegalStateException("prepared!");
        }
        MediaFormat mediaFormatC = c();
        StringBuilder sb = new StringBuilder();
        sb.append("Create media format: ");
        sb.append(mediaFormatC);
        MediaCodec mediaCodecB = b(mediaFormatC.getString("mime"));
        try {
            if (this.c != null) {
                mediaCodecB.setCallback(this.d);
            }
            mediaCodecB.configure(mediaFormatC, (Surface) null, (MediaCrypto) null, 1);
            f(mediaCodecB);
            mediaCodecB.start();
            this.f20849b = mediaCodecB;
        } catch (MediaCodec.CodecException e) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Configure codec failure!\n  with format");
            sb2.append(mediaFormatC);
            throw e;
        }
    }

    public void h() {
        MediaCodec mediaCodec = this.f20849b;
        if (mediaCodec != null) {
            mediaCodec.release();
            this.f20849b = null;
        }
    }

    public final void i(int i) {
        d().releaseOutputBuffer(i, false);
    }

    public void j(b bVar) {
        if (this.f20849b != null) {
            throw new IllegalStateException("mEncoder is not null");
        }
        this.c = bVar;
    }

    public void k() {
        MediaCodec mediaCodec = this.f20849b;
        if (mediaCodec != null) {
            mediaCodec.stop();
        }
    }
}
