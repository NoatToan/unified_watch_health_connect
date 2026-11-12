package androidx.camera.video.internal.audio;

import com.google.auto.value.AutoValue;
import java.nio.ByteBuffer;
import k0.h;

/* JADX INFO: loaded from: classes.dex */
public interface AudioStream {

    public interface a {
    }

    @AutoValue
    public static abstract class b {
        public abstract int a();

        public abstract long b();
    }

    void a(androidx.camera.video.internal.audio.b.C0078b c0078b, h hVar);

    e read(ByteBuffer byteBuffer);

    void release();

    void start();

    void stop();

    public static class AudioStreamException extends Exception {
        public AudioStreamException() {
        }

        public AudioStreamException(String str) {
            super(str);
        }

        public AudioStreamException(String str, Throwable th3) {
            super(str, th3);
        }

        public AudioStreamException(Throwable th3) {
            super(th3);
        }
    }
}
