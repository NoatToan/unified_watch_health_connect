package kotlin.io;

import java.io.ByteArrayOutputStream;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
final class ExposingBufferByteArrayOutputStream extends ByteArrayOutputStream {
    public ExposingBufferByteArrayOutputStream(int i) {
        super(i);
    }

    @NotNull
    public final byte[] getBuffer() {
        byte[] buf = ((ByteArrayOutputStream) this).buf;
        Intrinsics.checkNotNullExpressionValue(buf, "buf");
        return buf;
    }
}
