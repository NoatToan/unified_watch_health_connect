package rx.android.schedulers;

import android.os.Looper;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import rx.Scheduler;
import rx.android.plugins.RxAndroidPlugins;
import rx.annotations.Experimental;

/* JADX INFO: loaded from: classes23.dex */
public final class AndroidSchedulers {
    private static final AtomicReference<AndroidSchedulers> b = new AtomicReference<>();
    private final Scheduler a;

    private AndroidSchedulers() {
        Scheduler mainThreadScheduler = RxAndroidPlugins.getInstance().getSchedulersHook().getMainThreadScheduler();
        if (mainThreadScheduler != null) {
            this.a = mainThreadScheduler;
        } else {
            this.a = new a(Looper.getMainLooper());
        }
    }

    private static AndroidSchedulers a() {
        AtomicReference<AndroidSchedulers> atomicReference;
        AndroidSchedulers androidSchedulers;
        do {
            atomicReference = b;
            AndroidSchedulers androidSchedulers2 = atomicReference.get();
            if (androidSchedulers2 != null) {
                return androidSchedulers2;
            }
            androidSchedulers = new AndroidSchedulers();
        } while (!atomicReference.compareAndSet(null, androidSchedulers));
        return androidSchedulers;
    }

    public static Scheduler from(Looper looper) {
        Objects.requireNonNull(looper, "looper == null");
        return new a(looper);
    }

    public static Scheduler mainThread() {
        return a().a;
    }

    @Experimental
    public static void reset() {
        b.set(null);
    }
}
