package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes4.dex */
public final class a24 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Logger f541a = Logger.getLogger(a24.class.getName());

    public static void a(Closeable closeable, boolean z) throws IOException {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException e) {
            if (!z) {
                throw e;
            }
            f541a.log(Level.WARNING, "IOException thrown while closing Closeable.", (Throwable) e);
        }
    }

    public static void b(InputStream inputStream) {
        try {
            a(inputStream, true);
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
