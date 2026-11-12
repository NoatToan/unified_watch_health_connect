package defpackage;

import com.facebook.common.memory.PooledByteBuffer;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public interface n3i {
    PooledByteBuffer a(InputStream inputStream) throws IOException;

    p3i b();

    PooledByteBuffer c(byte[] bArr);

    p3i d(int i);

    PooledByteBuffer e(InputStream inputStream, int i) throws IOException;
}
