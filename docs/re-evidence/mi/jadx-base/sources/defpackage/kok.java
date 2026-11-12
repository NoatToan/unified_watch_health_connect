package defpackage;

import android.os.Handler;
import android.os.Process;
import androidx.annotation.IntRange;
import androidx.core.util.Consumer;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public class kok {

    public static class a implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f24052a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f24053b;

        /* JADX INFO: renamed from: kok$a$a, reason: collision with other inner class name */
        public static class C0994a extends Thread {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f24054a;

            public C0994a(Runnable runnable, String str, int i) {
                super(runnable, str);
                this.f24054a = i;
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(this.f24054a);
                super.run();
            }
        }

        public a(String str, int i) {
            this.f24052a = str;
            this.f24053b = i;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new C0994a(runnable, this.f24052a, this.f24053b);
        }
    }

    public static class b<T> implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Callable<T> f24055a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Consumer<T> f24056b;
        public Handler c;

        public class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Consumer f24057a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Object f24058b;

            public a(Consumer consumer, Object obj) {
                this.f24057a = consumer;
                this.f24058b = obj;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public void run() {
                this.f24057a.accept(this.f24058b);
            }
        }

        public b(Handler handler, Callable<T> callable, Consumer<T> consumer) {
            this.f24055a = callable;
            this.f24056b = consumer;
            this.c = handler;
        }

        @Override // java.lang.Runnable
        public void run() {
            T tCall;
            try {
                tCall = this.f24055a.call();
            } catch (Exception unused) {
                tCall = null;
            }
            this.c.post(new a(this.f24056b, tCall));
        }
    }

    public static ThreadPoolExecutor a(String str, int i, @IntRange(from = 0) int i2) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, i2, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new a(str, i));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    public static <T> void b(Executor executor, Callable<T> callable, Consumer<T> consumer) {
        executor.execute(new b(eb3.a(), callable, consumer));
    }

    public static <T> T c(ExecutorService executorService, Callable<T> callable, @IntRange(from = 0) int i) throws InterruptedException {
        try {
            return executorService.submit(callable).get(i, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            throw e;
        } catch (ExecutionException e2) {
            throw new RuntimeException(e2);
        } catch (TimeoutException unused) {
            throw new InterruptedException("timeout");
        }
    }
}
