package defpackage;

import com.google.common.io.ElementTypesAreNonnullByDefault;
import java.nio.Buffer;

/* JADX INFO: loaded from: classes21.dex */
@ElementTypesAreNonnullByDefault
final class apd {
    static void d(Buffer buffer) {
        buffer.clear();
    }

    static void b(Buffer buffer) {
        buffer.flip();
    }

    static void a(Buffer buffer, int i) {
        buffer.limit(i);
    }

    static void d(Buffer buffer, int i) {
        buffer.position(i);
    }
}
