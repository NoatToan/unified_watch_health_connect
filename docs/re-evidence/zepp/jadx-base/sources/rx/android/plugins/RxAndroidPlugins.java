package rx.android.plugins;

import java.util.concurrent.atomic.AtomicReference;
import rx.annotations.Experimental;

/* JADX INFO: loaded from: classes23.dex */
public final class RxAndroidPlugins {
    private static final RxAndroidPlugins b = new RxAndroidPlugins();
    private final AtomicReference<RxAndroidSchedulersHook> a = new AtomicReference<>();

    public static RxAndroidPlugins getInstance() {
        return b;
    }

    public RxAndroidSchedulersHook getSchedulersHook() {
        if (this.a.get() == null) {
            this.a.compareAndSet(null, RxAndroidSchedulersHook.getDefaultInstance());
        }
        return this.a.get();
    }

    public void registerSchedulersHook(RxAndroidSchedulersHook rxAndroidSchedulersHook) {
        if (this.a.compareAndSet(null, rxAndroidSchedulersHook)) {
            return;
        }
        throw new IllegalStateException("Another strategy was already registered: " + this.a.get());
    }

    @Experimental
    public void reset() {
        this.a.set(null);
    }
}
