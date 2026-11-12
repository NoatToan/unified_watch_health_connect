package defpackage;

import android.os.Handler;
import androidx.annotation.RequiresApi;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class li3 {
    public static Executor a() {
        return wx6.a();
    }

    public static Executor b() {
        return q7c.a();
    }

    public static Executor c() {
        return aid.a();
    }

    public static ScheduledExecutorService d() {
        return a2f.a();
    }

    public static ScheduledExecutorService e(Handler handler) {
        return new qkb(handler);
    }

    public static Executor f(Executor executor) {
        return new fwl(executor);
    }
}
