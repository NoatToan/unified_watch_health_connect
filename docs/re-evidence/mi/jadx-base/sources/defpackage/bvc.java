package defpackage;

import com.xiaomi.fitness.common.log.Logger;
import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class bvc {
    public static void a(Closeable... closeableArr) {
        if (closeableArr == null || closeableArr.length <= 0) {
            return;
        }
        for (Closeable closeable : closeableArr) {
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (IOException e) {
                    Logger logger = Logger.INSTANCE;
                    Logger.w("%s close failed %s", closeable, e);
                }
            }
        }
    }
}
