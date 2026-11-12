package androidx.media3.common.audio;

import androidx.media3.common.q;
import com.google.common.base.Objects;
import ds.e0;
import fa.z;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.apache.commons.lang3.StringUtils;

/* JADX INFO: loaded from: classes.dex */
public interface AudioProcessor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ByteBuffer f8121a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    a a(a aVar);

    void flush();

    ByteBuffer getOutput();

    boolean isActive();

    boolean isEnded();

    void queueEndOfStream();

    void queueInput(ByteBuffer byteBuffer);

    void reset();

    public static final class a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final a f8122e = new a(-1, -1, -1);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f8123a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f8124b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f8125c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f8126d;

        public a(int i14, int i15, int i16) {
            this.f8123a = i14;
            this.f8124b = i15;
            this.f8125c = i16;
            this.f8126d = z.I(i16) ? z.y(i16, i15) : -1;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f8123a == aVar.f8123a && this.f8124b == aVar.f8124b && this.f8125c == aVar.f8125c;
        }

        public final int hashCode() {
            return Objects.hashCode(Integer.valueOf(this.f8123a), Integer.valueOf(this.f8124b), Integer.valueOf(this.f8125c));
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("AudioFormat[sampleRate=");
            sb3.append(this.f8123a);
            sb3.append(", channelCount=");
            sb3.append(this.f8124b);
            sb3.append(", encoding=");
            return e0.j(sb3, this.f8125c, ']');
        }

        public a(q qVar) {
            this(qVar.D, qVar.C, qVar.E);
        }
    }

    public static final class UnhandledAudioFormatException extends Exception {
        public final a inputAudioFormat;

        public UnhandledAudioFormatException(String str, a aVar) {
            super(str + StringUtils.SPACE + aVar);
            this.inputAudioFormat = aVar;
        }

        public UnhandledAudioFormatException(a aVar) {
            this("Unhandled input format:", aVar);
        }
    }
}
