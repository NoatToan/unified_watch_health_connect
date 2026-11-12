package io.sentry.android.ndk;

import com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeProgressBar;
import io.sentry.android.core.SentryAndroidOptions;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@ApiStatus.Internal
public final class SentryNdk {

    @NotNull
    private static final CountDownLatch loadLibraryLatch = new CountDownLatch(1);

    static {
        new Thread(new Runnable() { // from class: io.sentry.android.ndk.f
            @Override // java.lang.Runnable
            public final void run() {
                SentryNdk.lambda$static$0();
            }
        }, "SentryNdkLoadLibs").start();
    }

    private SentryNdk() {
    }

    public static void close() {
        try {
            if (!loadLibraryLatch.await(VibrateModeProgressBar.sLongToLong, TimeUnit.MILLISECONDS)) {
                throw new IllegalStateException("Timeout waiting for Sentry NDK library to load");
            }
            shutdown();
        } catch (InterruptedException e) {
            throw new IllegalStateException("Thread interrupted while waiting for NDK libs to be loaded", e);
        }
    }

    public static void init(@NotNull SentryAndroidOptions sentryAndroidOptions) {
        g.a(sentryAndroidOptions.getSdkVersion());
        try {
            if (!loadLibraryLatch.await(VibrateModeProgressBar.sLongToLong, TimeUnit.MILLISECONDS)) {
                throw new IllegalStateException("Timeout waiting for Sentry NDK library to load");
            }
            initSentryNative(sentryAndroidOptions);
            if (sentryAndroidOptions.isEnableScopeSync()) {
                sentryAndroidOptions.addScopeObserver(new e(sentryAndroidOptions));
            }
            sentryAndroidOptions.setDebugImagesLoader(new a(sentryAndroidOptions, new NativeModuleListLoader()));
        } catch (InterruptedException e) {
            throw new IllegalStateException("Thread interrupted while waiting for NDK libs to be loaded", e);
        }
    }

    private static native void initSentryNative(@NotNull SentryAndroidOptions sentryAndroidOptions);

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$static$0() {
        try {
            System.loadLibrary("log");
            System.loadLibrary("sentry");
            System.loadLibrary("sentry-android");
        } catch (Throwable unused) {
        }
        loadLibraryLatch.countDown();
    }

    private static native void shutdown();
}
