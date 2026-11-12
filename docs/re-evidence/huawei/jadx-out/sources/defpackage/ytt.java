package defpackage;

import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: loaded from: classes20.dex */
public class ytt {
    public static void d(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
