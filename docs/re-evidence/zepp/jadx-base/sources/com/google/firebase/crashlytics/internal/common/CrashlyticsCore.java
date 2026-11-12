package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger;
import com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbHandler;
import com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbSource;
import com.google.firebase.crashlytics.internal.log.LogFileManager;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import com.google.firebase.crashlytics.internal.settings.SettingsDataProvider;
import com.google.firebase.crashlytics.internal.stacktrace.MiddleOutFallbackStrategy;
import com.google.firebase.crashlytics.internal.stacktrace.RemoveRepeatsStrategy;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes3.dex */
public class CrashlyticsCore {
    private static final String o = "The Crashlytics build ID is missing. This occurs when Crashlytics tooling is absent from your app's build configuration. Please review Crashlytics onboarding instructions and ensure you have a valid Crashlytics account.";
    public static final int p = 1024;
    public static final int q = 10;
    public static final String r = "com.crashlytics.RequireBuildId";
    public static final boolean s = true;
    public static final int t = 4;
    private static final String u = "initialization_marker";
    public static final String v = "crash_marker";
    private final Context a;
    private final FirebaseApp b;

    @VisibleForTesting
    public final BreadcrumbSource breadcrumbSource;
    private final DataCollectionArbiter c;
    private final long d = System.currentTimeMillis();
    private h e;
    private h f;
    private boolean g;
    private g h;
    private final IdManager i;
    private final FileStore j;
    private final AnalyticsEventLogger k;
    private final ExecutorService l;
    private final e m;
    private final CrashlyticsNativeComponent n;

    public class a implements Callable<Task<Void>> {
        public final /* synthetic */ SettingsDataProvider a;

        public a(SettingsDataProvider settingsDataProvider) {
            this.a = settingsDataProvider;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Task<Void> call() throws Exception {
            return CrashlyticsCore.this.f(this.a);
        }
    }

    public class b implements Runnable {
        public final /* synthetic */ SettingsDataProvider a;

        public b(SettingsDataProvider settingsDataProvider) {
            this.a = settingsDataProvider;
        }

        @Override // java.lang.Runnable
        public void run() {
            CrashlyticsCore.this.f(this.a);
        }
    }

    public class c implements Callable<Boolean> {
        public c() {
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call() throws Exception {
            try {
                boolean zD = CrashlyticsCore.this.e.d();
                if (!zD) {
                    Logger.getLogger().w("Initialization marker file was not properly removed.");
                }
                return Boolean.valueOf(zD);
            } catch (Exception e) {
                Logger.getLogger().e("Problem encountered deleting Crashlytics initialization marker.", e);
                return Boolean.FALSE;
            }
        }
    }

    public class d implements Callable<Boolean> {
        public d() {
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call() throws Exception {
            return Boolean.valueOf(CrashlyticsCore.this.h.w());
        }
    }

    public CrashlyticsCore(FirebaseApp firebaseApp, IdManager idManager, CrashlyticsNativeComponent crashlyticsNativeComponent, DataCollectionArbiter dataCollectionArbiter, BreadcrumbSource breadcrumbSource, AnalyticsEventLogger analyticsEventLogger, FileStore fileStore, ExecutorService executorService) {
        this.b = firebaseApp;
        this.c = dataCollectionArbiter;
        this.a = firebaseApp.getApplicationContext();
        this.i = idManager;
        this.n = crashlyticsNativeComponent;
        this.breadcrumbSource = breadcrumbSource;
        this.k = analyticsEventLogger;
        this.l = executorService;
        this.j = fileStore;
        this.m = new e(executorService);
    }

    private void d() {
        try {
            this.g = Boolean.TRUE.equals((Boolean) Utils.awaitEvenIfOnMainThread(this.m.h(new d())));
        } catch (Exception unused) {
            this.g = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Task<Void> f(SettingsDataProvider settingsDataProvider) {
        k();
        try {
            this.breadcrumbSource.registerBreadcrumbHandler(new BreadcrumbHandler() { // from class: l11
                @Override // com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbHandler
                public final void handleBreadcrumb(String str) {
                    this.a.log(str);
                }
            });
            if (!settingsDataProvider.getSettings().getFeaturesData().collectReports) {
                Logger.getLogger().d("Collection of crash reports disabled in Crashlytics settings.");
                return Tasks.forException(new RuntimeException("Collection of crash reports disabled in Crashlytics settings."));
            }
            if (!this.h.D(settingsDataProvider)) {
                Logger.getLogger().w("Previous sessions could not be finalized.");
            }
            return this.h.Y(settingsDataProvider.getAppSettings());
        } catch (Exception e) {
            Logger.getLogger().e("Crashlytics encountered a problem during asynchronous initialization.", e);
            return Tasks.forException(e);
        } finally {
            j();
        }
    }

    private void g(SettingsDataProvider settingsDataProvider) {
        Future<?> futureSubmit = this.l.submit(new b(settingsDataProvider));
        Logger.getLogger().d("Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.");
        try {
            futureSubmit.get(4L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Logger.getLogger().e("Crashlytics was interrupted during initialization.", e);
        } catch (ExecutionException e2) {
            Logger.getLogger().e("Crashlytics encountered a problem during initialization.", e2);
        } catch (TimeoutException e3) {
            Logger.getLogger().e("Crashlytics timed out during initialization.", e3);
        }
    }

    public static String getVersion() {
        return "18.2.6";
    }

    public static boolean i(String str, boolean z) {
        if (!z) {
            Logger.getLogger().v("Configured not to require a build ID.");
            return true;
        }
        if (!TextUtils.isEmpty(str)) {
            return true;
        }
        Log.e(Logger.TAG, ".");
        Log.e(Logger.TAG, ".     |  | ");
        Log.e(Logger.TAG, ".     |  |");
        Log.e(Logger.TAG, ".     |  |");
        Log.e(Logger.TAG, ".   \\ |  | /");
        Log.e(Logger.TAG, ".    \\    /");
        Log.e(Logger.TAG, ".     \\  /");
        Log.e(Logger.TAG, ".      \\/");
        Log.e(Logger.TAG, ".");
        Log.e(Logger.TAG, o);
        Log.e(Logger.TAG, ".");
        Log.e(Logger.TAG, ".      /\\");
        Log.e(Logger.TAG, ".     /  \\");
        Log.e(Logger.TAG, ".    /    \\");
        Log.e(Logger.TAG, ".   / |  | \\");
        Log.e(Logger.TAG, ".     |  |");
        Log.e(Logger.TAG, ".     |  |");
        Log.e(Logger.TAG, ".     |  |");
        Log.e(Logger.TAG, ".");
        return false;
    }

    @NonNull
    public Task<Boolean> checkForUnsentReports() {
        return this.h.q();
    }

    public Task<Void> deleteUnsentReports() {
        return this.h.v();
    }

    public boolean didCrashOnPreviousExecution() {
        return this.g;
    }

    public Task<Void> doBackgroundInitializationAsync(SettingsDataProvider settingsDataProvider) {
        return Utils.callTask(this.l, new a(settingsDataProvider));
    }

    public boolean e() {
        return this.e.c();
    }

    public g h() {
        return this.h;
    }

    public void j() {
        this.m.h(new c());
    }

    public void k() {
        this.m.b();
        this.e.a();
        Logger.getLogger().v("Initialization marker file was created.");
    }

    public void log(String str) {
        this.h.c0(System.currentTimeMillis() - this.d, str);
    }

    public void logException(@NonNull Throwable th) {
        this.h.b0(Thread.currentThread(), th);
    }

    public boolean onPreExecute(AppData appData, SettingsDataProvider settingsDataProvider) {
        if (!i(appData.buildId, CommonUtils.getBooleanResourceValue(this.a, r, true))) {
            throw new IllegalStateException(o);
        }
        try {
            this.f = new h(v, this.j);
            this.e = new h(u, this.j);
            UserMetadata userMetadata = new UserMetadata();
            LogFileManager logFileManager = new LogFileManager(this.j);
            this.h = new g(this.a, this.m, this.i, this.c, this.j, this.f, appData, userMetadata, logFileManager, SessionReportingCoordinator.create(this.a, this.i, this.j, appData, logFileManager, userMetadata, new MiddleOutFallbackStrategy(1024, new RemoveRepeatsStrategy(10)), settingsDataProvider), this.n, this.k);
            boolean zE = e();
            d();
            this.h.B(Thread.getDefaultUncaughtExceptionHandler(), settingsDataProvider);
            if (!zE || !CommonUtils.canTryConnection(this.a)) {
                Logger.getLogger().d("Successfully configured exception handler.");
                return true;
            }
            Logger.getLogger().d("Crashlytics did not finish previous background initialization. Initializing synchronously.");
            g(settingsDataProvider);
            return false;
        } catch (Exception e) {
            Logger.getLogger().e("Crashlytics was not started due to an exception during initialization", e);
            this.h = null;
            return false;
        }
    }

    public Task<Void> sendUnsentReports() {
        return this.h.T();
    }

    public void setCrashlyticsCollectionEnabled(@Nullable Boolean bool) {
        this.c.setCrashlyticsDataCollectionEnabled(bool);
    }

    public void setCustomKey(String str, String str2) {
        this.h.U(str, str2);
    }

    public void setCustomKeys(Map<String, String> map) {
        this.h.V(map);
    }

    public void setInternalKey(String str, String str2) {
        this.h.W(str, str2);
    }

    public void setUserId(String str) {
        this.h.X(str);
    }
}
