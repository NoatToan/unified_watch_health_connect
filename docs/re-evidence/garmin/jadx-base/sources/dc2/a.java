package dc2;

import android.content.Context;
import android.content.Intent;
import da2.g;
import org.slf4j.LoggerFactory;

/* JADX INFO: loaded from: classes11.dex */
public interface a {

    /* JADX INFO: renamed from: dc2.a$a, reason: collision with other inner class name */
    public static final class C1258a {
        public static void a(a aVar, Context context) {
            context.getClass();
            try {
                int i14 = g.f58897c;
                aVar.f(context, new Intent(context, (Class<?>) g.class));
            } catch (ClassNotFoundException e4) {
                LoggerFactory.getLogger("SYNC#SyncServiceConfigCallback").error("Failed to start GdiService", (Throwable) e4);
            }
        }
    }

    void c(Context context);

    void f(Context context, Intent intent);

    boolean h(int i14);
}
