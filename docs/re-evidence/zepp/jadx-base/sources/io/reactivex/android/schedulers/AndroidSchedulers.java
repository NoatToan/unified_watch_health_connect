package io.reactivex.android.schedulers;

import android.os.Handler;
import android.os.Looper;
import io.reactivex.Scheduler;
import io.reactivex.android.plugins.RxAndroidPlugins;
import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes22.dex */
public final class AndroidSchedulers {
    private static final Scheduler a = RxAndroidPlugins.initMainThreadScheduler(new a());

    public static class a implements Callable<Scheduler> {
        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Scheduler call() throws Exception {
            return b.a;
        }
    }

    public static final class b {
        public static final Scheduler a = new io.reactivex.android.schedulers.a(new Handler(Looper.getMainLooper()));

        private b() {
        }
    }

    private AndroidSchedulers() {
        throw new AssertionError("No instances.");
    }

    public static Scheduler from(Looper looper) {
        Objects.requireNonNull(looper, "looper == null");
        return new io.reactivex.android.schedulers.a(new Handler(looper));
    }

    public static Scheduler mainThread() {
        return RxAndroidPlugins.onMainThreadScheduler(a);
    }
}
