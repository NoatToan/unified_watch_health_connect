package g1;

import android.media.MediaCodec;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public interface g extends AutoCloseable {
    MediaCodec.BufferInfo M();

    long a0();

    boolean h2();

    ByteBuffer i();

    long size();
}
