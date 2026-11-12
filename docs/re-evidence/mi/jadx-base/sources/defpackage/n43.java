package defpackage;

import com.xiaomi.smarthome.plugin.update.PluginPackageConstant;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class n43 {
    public static final n43 d = new n43();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExecutorService f27523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ScheduledExecutorService f27524b;
    public final Executor c;

    public static class b implements Executor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ThreadLocal<Integer> f27525a;

        public b() {
            this.f27525a = new ThreadLocal<>();
        }

        public final int a() {
            Integer num = this.f27525a.get();
            if (num == null) {
                num = 0;
            }
            int iIntValue = num.intValue() - 1;
            if (iIntValue == 0) {
                this.f27525a.remove();
            } else {
                this.f27525a.set(Integer.valueOf(iIntValue));
            }
            return iIntValue;
        }

        public final int b() {
            Integer num = this.f27525a.get();
            if (num == null) {
                num = 0;
            }
            int iIntValue = num.intValue() + 1;
            this.f27525a.set(Integer.valueOf(iIntValue));
            return iIntValue;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            try {
                if (b() <= 15) {
                    runnable.run();
                } else {
                    n43.a().execute(runnable);
                }
                a();
            } catch (Throwable th) {
                a();
                throw th;
            }
        }
    }

    public n43() {
        this.f27523a = !c() ? Executors.newCachedThreadPool() : y91.b();
        this.f27524b = Executors.newSingleThreadScheduledExecutor();
        this.c = new b();
    }

    public static ExecutorService a() {
        return d.f27523a;
    }

    public static Executor b() {
        return d.c;
    }

    public static boolean c() {
        String property = System.getProperty("java.runtime.name");
        if (property == null) {
            return false;
        }
        return property.toLowerCase(Locale.US).contains(PluginPackageConstant.RN_DIR_A);
    }
}
