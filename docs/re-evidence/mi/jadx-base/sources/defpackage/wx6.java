package defpackage;

import androidx.annotation.RequiresApi;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class wx6 implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile wx6 f38453a;

    public static Executor a() {
        if (f38453a != null) {
            return f38453a;
        }
        synchronized (wx6.class) {
            try {
                if (f38453a == null) {
                    f38453a = new wx6();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f38453a;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }
}
