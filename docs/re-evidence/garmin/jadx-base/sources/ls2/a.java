package ls2;

import java.io.Closeable;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes11.dex */
public interface a extends Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    default void close() {
    }

    HashSet m4();

    void w0(HashMap map);
}
