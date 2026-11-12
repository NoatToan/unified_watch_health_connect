package kb;

import androidx.media3.common.w;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public final w a(a aVar) {
        ByteBuffer byteBuffer = aVar.f8631d;
        byteBuffer.getClass();
        fa.a.a(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        return b(aVar, byteBuffer);
    }

    public abstract w b(a aVar, ByteBuffer byteBuffer);
}
