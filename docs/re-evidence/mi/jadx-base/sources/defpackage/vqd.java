package defpackage;

import java.nio.Buffer;

/* JADX INFO: loaded from: classes.dex */
public final class vqd {
    public static void a(Buffer buffer, int i) {
        buffer.limit(i);
    }

    public static void b(Buffer buffer) {
        buffer.mark();
    }

    public static void c(Buffer buffer, int i) {
        buffer.position(i);
    }

    public static void d(Buffer buffer) {
        buffer.reset();
    }
}
