package defpackage;

import com.google.common.hash.ElementTypesAreNonnullByDefault;
import java.nio.Buffer;

/* JADX INFO: loaded from: classes21.dex */
@ElementTypesAreNonnullByDefault
public final class aow {
    public static void c(Buffer buffer) {
        buffer.clear();
    }

    public static void d(Buffer buffer) {
        buffer.flip();
    }

    public static void c(Buffer buffer, int i) {
        buffer.limit(i);
    }

    public static void b(Buffer buffer, int i) {
        buffer.position(i);
    }
}
