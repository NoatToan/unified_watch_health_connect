package com.google.firebase.crashlytics.internal.common;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.StatFs;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.NativeSessionFileProvider;
import com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger;
import com.google.firebase.crashlytics.internal.log.LogFileManager;
import com.google.firebase.crashlytics.internal.model.StaticSessionData;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import com.google.firebase.crashlytics.internal.settings.SettingsDataProvider;
import com.google.firebase.crashlytics.internal.settings.model.AppSettingsData;
import com.xiaomi.market.sdk.Constants;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.SortedSet;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
class g {
    public static final String r = "fatal";
    public static final String s = "timestamp";
    public static final String t = "_ae";
    public static final String u = ".ae";
    public static final FilenameFilter v = new FilenameFilter() { // from class: com.google.firebase.crashlytics.internal.common.f
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            return g.O(file, str);
        }
    };
    public static final String w = "native-sessions";
    public static final int x = 1;
    private static final String y = "Crashlytics Android SDK/%s";
    private final Context a;
    private final DataCollectionArbiter b;
    private final com.google.firebase.crashlytics.internal.common.h c;
    private final UserMetadata d;
    private final com.google.firebase.crashlytics.internal.common.e e;
    private final IdManager f;
    private final FileStore g;
    private final AppData h;
    private final LogFileManager i;
    private final CrashlyticsNativeComponent j;
    private final AnalyticsEventLogger k;
    private final SessionReportingCoordinator l;
    private com.google.firebase.crashlytics.internal.common.j m;
    public final TaskCompletionSource<Boolean> n = new TaskCompletionSource<>();
    public final TaskCompletionSource<Boolean> o = new TaskCompletionSource<>();
    public final TaskCompletionSource<Void> p = new TaskCompletionSource<>();
    public final AtomicBoolean q = new AtomicBoolean(false);

    public class a implements Callable<Void> {
        public final /* synthetic */ long a;

        public a(long j) {
            this.a = j;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() throws Exception {
            Bundle bundle = new Bundle();
            bundle.putInt("fatal", 1);
            bundle.putLong("timestamp", this.a);
            g.this.k.logEvent("_ae", bundle);
            return null;
        }
    }

    public class b implements com.google.firebase.crashlytics.internal.common.j.a {
        public b() {
        }

        @Override // com.google.firebase.crashlytics.internal.common.j.a
        public void a(@NonNull SettingsDataProvider settingsDataProvider, @NonNull Thread thread, @NonNull Throwable th) {
            g.this.M(settingsDataProvider, thread, th);
        }
    }

    public class c implements Callable<Task<Void>> {
        public final /* synthetic */ long a;
        public final /* synthetic */ Throwable b;
        public final /* synthetic */ Thread c;
        public final /* synthetic */ SettingsDataProvider d;

        public class a implements SuccessContinuation<AppSettingsData, Void> {
            public final /* synthetic */ Executor a;

            public a(Executor executor) {
                this.a = executor;
            }

            @Override // com.google.android.gms.tasks.SuccessContinuation
            @NonNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Task<Void> then(@Nullable AppSettingsData appSettingsData) throws Exception {
                if (appSettingsData != null) {
                    return Tasks.whenAll((Task<?>[]) new Task[]{g.this.R(), g.this.l.sendReports(this.a)});
                }
                Logger.getLogger().w("Received null app settings, cannot send reports at crash time.");
                return Tasks.forResult(null);
            }
        }

        public c(long j, Throwable th, Thread thread, SettingsDataProvider settingsDataProvider) {
            this.a = j;
            this.b = th;
            this.c = thread;
            this.d = settingsDataProvider;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Task<Void> call() throws Exception {
            long jK = g.K(this.a);
            String strG = g.this.G();
            if (strG == null) {
                Logger.getLogger().e("Tried to write a fatal exception while no session was open.");
                return Tasks.forResult(null);
            }
            g.this.c.a();
            g.this.l.persistFatalEvent(this.b, this.c, strG, jK);
            g.this.A(this.a);
            g.this.x(this.d);
            g.this.z();
            if (!g.this.b.isAutomaticDataCollectionEnabled()) {
                return Tasks.forResult(null);
            }
            Executor executorC = g.this.e.c();
            return this.d.getAppSettings().onSuccessTask(executorC, new a(executorC));
        }
    }

    public class d implements SuccessContinuation<Void, Boolean> {
        public d() {
        }

        @Override // com.google.android.gms.tasks.SuccessContinuation
        @NonNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Task<Boolean> then(@Nullable Void r1) throws Exception {
            return Tasks.forResult(Boolean.TRUE);
        }
    }

    public class e implements SuccessContinuation<Boolean, Void> {
        public final /* synthetic */ Task a;

        public class a implements Callable<Task<Void>> {
            public final /* synthetic */ Boolean a;

            /* JADX INFO: renamed from: com.google.firebase.crashlytics.internal.common.g$e$a$a, reason: collision with other inner class name */
            public class C0246a implements SuccessContinuation<AppSettingsData, Void> {
                public final /* synthetic */ Executor a;

                public C0246a(Executor executor) {
                    this.a = executor;
                }

                @Override // com.google.android.gms.tasks.SuccessContinuation
                @NonNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public Task<Void> then(@Nullable AppSettingsData appSettingsData) throws Exception {
                    if (appSettingsData == null) {
                        Logger.getLogger().w("Received null app settings at app startup. Cannot send cached reports");
                        return Tasks.forResult(null);
                    }
                    g.this.R();
                    g.this.l.sendReports(this.a);
                    g.this.p.trySetResult(null);
                    return Tasks.forResult(null);
                }
            }

            public a(Boolean bool) {
                this.a = bool;
            }

            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Task<Void> call() throws Exception {
                if (this.a.booleanValue()) {
                    Logger.getLogger().d("Sending cached crash reports...");
                    g.this.b.grantDataCollectionPermission(this.a.booleanValue());
                    Executor executorC = g.this.e.c();
                    return e.this.a.onSuccessTask(executorC, new C0246a(executorC));
                }
                Logger.getLogger().v("Deleting cached crash reports...");
                g.u(g.this.P());
                g.this.l.removeAllReports();
                g.this.p.trySetResult(null);
                return Tasks.forResult(null);
            }
        }

        public e(Task task) {
            this.a = task;
        }

        @Override // com.google.android.gms.tasks.SuccessContinuation
        @NonNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Task<Void> then(@Nullable Boolean bool) throws Exception {
            return g.this.e.i(new a(bool));
        }
    }

    public class f implements Callable<Void> {
        public final /* synthetic */ long a;
        public final /* synthetic */ String b;

        public f(long j, String str) {
            this.a = j;
            this.b = str;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() throws Exception {
            if (g.this.N()) {
                return null;
            }
            g.this.i.writeToLog(this.a, this.b);
            return null;
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.crashlytics.internal.common.g$g, reason: collision with other inner class name */
    public class RunnableC0247g implements Runnable {
        public final /* synthetic */ long a;
        public final /* synthetic */ Throwable b;
        public final /* synthetic */ Thread c;

        public RunnableC0247g(long j, Throwable th, Thread thread) {
            this.a = j;
            this.b = th;
            this.c = thread;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (g.this.N()) {
                return;
            }
            long jK = g.K(this.a);
            String strG = g.this.G();
            if (strG == null) {
                Logger.getLogger().w("Tried to write a non-fatal exception while no session was open.");
            } else {
                g.this.l.persistNonFatalEvent(this.b, this.c, strG, jK);
            }
        }
    }

    public class h implements Callable<Void> {
        public final /* synthetic */ UserMetadata a;

        public h(UserMetadata userMetadata) {
            this.a = userMetadata;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() throws Exception {
            String strG = g.this.G();
            if (strG == null) {
                Logger.getLogger().d("Tried to cache user data while no session was open.");
                return null;
            }
            g.this.l.persistUserId(strG);
            new m(g.this.g).n(strG, this.a);
            return null;
        }
    }

    public class i implements Callable<Void> {
        public final /* synthetic */ Map a;
        public final /* synthetic */ boolean b;

        public i(Map map, boolean z) {
            this.a = map;
            this.b = z;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() throws Exception {
            new m(g.this.g).m(g.this.G(), this.a, this.b);
            return null;
        }
    }

    public class j implements Callable<Void> {
        public j() {
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() throws Exception {
            g.this.z();
            return null;
        }
    }

    public g(Context context, com.google.firebase.crashlytics.internal.common.e eVar, IdManager idManager, DataCollectionArbiter dataCollectionArbiter, FileStore fileStore, com.google.firebase.crashlytics.internal.common.h hVar, AppData appData, UserMetadata userMetadata, LogFileManager logFileManager, SessionReportingCoordinator sessionReportingCoordinator, CrashlyticsNativeComponent crashlyticsNativeComponent, AnalyticsEventLogger analyticsEventLogger) {
        this.a = context;
        this.e = eVar;
        this.f = idManager;
        this.b = dataCollectionArbiter;
        this.g = fileStore;
        this.c = hVar;
        this.h = appData;
        this.d = userMetadata;
        this.i = logFileManager;
        this.j = crashlyticsNativeComponent;
        this.k = analyticsEventLogger;
        this.l = sessionReportingCoordinator;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A(long j2) {
        try {
            if (this.g.getCommonFile(u + j2).createNewFile()) {
            } else {
                throw new IOException("Create new file failed.");
            }
        } catch (IOException e2) {
            Logger.getLogger().w("Could not create app exception marker file.", e2);
        }
    }

    private void C(String str) {
        Logger.getLogger().v("Finalizing native report for session " + str);
        NativeSessionFileProvider sessionFileProvider = this.j.getSessionFileProvider(str);
        File minidumpFile = sessionFileProvider.getMinidumpFile();
        if (minidumpFile == null || !minidumpFile.exists()) {
            Logger.getLogger().w("No minidump data found for session " + str);
            return;
        }
        long jLastModified = minidumpFile.lastModified();
        LogFileManager logFileManager = new LogFileManager(this.g, str);
        File nativeSessionDir = this.g.getNativeSessionDir(str);
        if (!nativeSessionDir.isDirectory()) {
            Logger.getLogger().w("Couldn't create directory to store native session files, aborting.");
            return;
        }
        A(jLastModified);
        List<n> listJ = J(sessionFileProvider, str, this.g, logFileManager.getBytesForLog());
        o.b(nativeSessionDir, listJ);
        Logger.getLogger().d("CrashlyticsController#finalizePreviousNativeSession");
        this.l.finalizeSessionWithNativeEvent(str, listJ);
        logFileManager.clearLog();
    }

    private static boolean E() {
        try {
            Class.forName("com.google.firebase.crash.FirebaseCrash");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    private Context F() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Nullable
    public String G() {
        SortedSet<String> sortedSetListSortedOpenSessionIds = this.l.listSortedOpenSessionIds();
        if (sortedSetListSortedOpenSessionIds.isEmpty()) {
            return null;
        }
        return sortedSetListSortedOpenSessionIds.first();
    }

    private static long H() {
        return K(System.currentTimeMillis());
    }

    @NonNull
    public static List<n> J(NativeSessionFileProvider nativeSessionFileProvider, String str, FileStore fileStore, byte[] bArr) {
        m mVar = new m(fileStore);
        File fileC = mVar.c(str);
        File fileB = mVar.b(str);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new com.google.firebase.crashlytics.internal.common.c("logs_file", "logs", bArr));
        arrayList.add(new k("crash_meta_file", "metadata", nativeSessionFileProvider.getMetadataFile()));
        arrayList.add(new k("session_meta_file", com.google.firebase.crashlytics.internal.settings.b.c, nativeSessionFileProvider.getSessionFile()));
        arrayList.add(new k("app_meta_file", "app", nativeSessionFileProvider.getAppFile()));
        arrayList.add(new k("device_meta_file", "device", nativeSessionFileProvider.getDeviceFile()));
        arrayList.add(new k("os_meta_file", Constants.JSON_VERSION, nativeSessionFileProvider.getOsFile()));
        arrayList.add(new k("minidump_file", "minidump", nativeSessionFileProvider.getMinidumpFile()));
        arrayList.add(new k("user_meta_file", "user", fileC));
        arrayList.add(new k("keys_file", "keys", fileB));
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long K(long j2) {
        return j2 / 1000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean O(File file, String str) {
        return str.startsWith(u);
    }

    private Task<Void> Q(long j2) {
        if (E()) {
            Logger.getLogger().w("Skipping logging Crashlytics event to Firebase, FirebaseCrash exists");
            return Tasks.forResult(null);
        }
        Logger.getLogger().d("Logging app exception event to Firebase Analytics");
        return Tasks.call(new ScheduledThreadPoolExecutor(1), new a(j2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Task<Void> R() {
        ArrayList arrayList = new ArrayList();
        for (File file : P()) {
            try {
                arrayList.add(Q(Long.parseLong(file.getName().substring(3))));
            } catch (NumberFormatException unused) {
                Logger.getLogger().w("Could not parse app exception timestamp from file " + file.getName());
            }
            file.delete();
        }
        return Tasks.whenAll(arrayList);
    }

    private Task<Boolean> Z() {
        if (this.b.isAutomaticDataCollectionEnabled()) {
            Logger.getLogger().d("Automatic data collection is enabled. Allowing upload.");
            this.n.trySetResult(Boolean.FALSE);
            return Tasks.forResult(Boolean.TRUE);
        }
        Logger.getLogger().d("Automatic data collection is disabled.");
        Logger.getLogger().v("Notifying that unsent reports are available.");
        this.n.trySetResult(Boolean.TRUE);
        Task<TContinuationResult> taskOnSuccessTask = this.b.waitForAutomaticDataCollectionEnabled().onSuccessTask(new d());
        Logger.getLogger().d("Waiting for send/deleteUnsentReports to be called.");
        return Utils.race(taskOnSuccessTask, this.o.getTask());
    }

    private void a0(String str) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 30) {
            Logger.getLogger().v("ANR feature enabled, but device is API " + i2);
            return;
        }
        List<ApplicationExitInfo> historicalProcessExitReasons = ((ActivityManager) this.a.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
        if (historicalProcessExitReasons.size() != 0) {
            LogFileManager logFileManager = new LogFileManager(this.g, str);
            UserMetadata userMetadata = new UserMetadata();
            userMetadata.setCustomKeys(new m(this.g).g(str));
            this.l.persistRelevantAppExitInfoEvent(str, historicalProcessExitReasons, logFileManager, userMetadata);
            return;
        }
        Logger.getLogger().v("No ApplicationExitInfo available. Session: " + str);
    }

    private void o(Map<String, String> map, boolean z) {
        this.e.h(new i(map, z));
    }

    private void p(UserMetadata userMetadata) {
        this.e.h(new h(userMetadata));
    }

    private static StaticSessionData.AppData r(IdManager idManager, AppData appData) {
        return StaticSessionData.AppData.create(idManager.getAppIdentifier(), appData.versionCode, appData.versionName, idManager.getCrashlyticsInstallId(), DeliveryMechanism.determineFrom(appData.installerPackageName).getId(), appData.developmentPlatformProvider);
    }

    private static StaticSessionData.DeviceData s(Context context) {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return StaticSessionData.DeviceData.create(CommonUtils.getCpuArchitectureInt(), Build.MODEL, Runtime.getRuntime().availableProcessors(), CommonUtils.getTotalRamInBytes(), ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize()), CommonUtils.isEmulator(context), CommonUtils.getDeviceState(context), Build.MANUFACTURER, Build.PRODUCT);
    }

    private static StaticSessionData.OsData t(Context context) {
        return StaticSessionData.OsData.create(Build.VERSION.RELEASE, Build.VERSION.CODENAME, CommonUtils.isRooted(context));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void u(List<File> list) {
        Iterator<File> it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next().delete();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void y(boolean z, SettingsDataProvider settingsDataProvider) {
        ArrayList arrayList = new ArrayList(this.l.listSortedOpenSessionIds());
        if (arrayList.size() <= z) {
            Logger.getLogger().v("No open sessions to be closed.");
            return;
        }
        String str = (String) arrayList.get(z ? 1 : 0);
        if (settingsDataProvider.getSettings().getFeaturesData().collectAnrs) {
            a0(str);
        } else {
            Logger.getLogger().v("ANR feature disabled.");
        }
        if (this.j.hasCrashDataForSession(str)) {
            C(str);
        }
        this.l.finalizeSessions(H(), z != 0 ? (String) arrayList.get(0) : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z() {
        long jH = H();
        String string = new com.google.firebase.crashlytics.internal.common.d(this.f).toString();
        Logger.getLogger().d("Opening a new session with ID " + string);
        this.j.prepareNativeSession(string, String.format(Locale.US, y, CrashlyticsCore.getVersion()), jH, StaticSessionData.create(r(this.f, this.h), t(F()), s(F())));
        this.i.setCurrentSession(string);
        this.l.onBeginSession(string, jH);
    }

    public void B(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, SettingsDataProvider settingsDataProvider) {
        S();
        com.google.firebase.crashlytics.internal.common.j jVar = new com.google.firebase.crashlytics.internal.common.j(new b(), settingsDataProvider, uncaughtExceptionHandler, this.j);
        this.m = jVar;
        Thread.setDefaultUncaughtExceptionHandler(jVar);
    }

    public boolean D(SettingsDataProvider settingsDataProvider) {
        this.e.b();
        if (N()) {
            Logger.getLogger().w("Skipping session finalization because a crash has already occurred.");
            return false;
        }
        Logger.getLogger().v("Finalizing previously open sessions.");
        try {
            y(true, settingsDataProvider);
            Logger.getLogger().v("Closed all previously open sessions.");
            return true;
        } catch (Exception e2) {
            Logger.getLogger().e("Unable to finalize previously open sessions.", e2);
            return false;
        }
    }

    public FileStore I() {
        return this.g;
    }

    public UserMetadata L() {
        return this.d;
    }

    public synchronized void M(@NonNull SettingsDataProvider settingsDataProvider, @NonNull Thread thread, @NonNull Throwable th) {
        Logger.getLogger().d("Handling uncaught exception \"" + th + "\" from thread " + thread.getName());
        try {
            Utils.awaitEvenIfOnMainThread(this.e.i(new c(System.currentTimeMillis(), th, thread, settingsDataProvider)));
        } catch (Exception e2) {
            Logger.getLogger().e("Error handling uncaught exception", e2);
        }
    }

    public boolean N() {
        com.google.firebase.crashlytics.internal.common.j jVar = this.m;
        return jVar != null && jVar.a();
    }

    public List<File> P() {
        return this.g.getCommonFiles(v);
    }

    public void S() {
        this.e.h(new j());
    }

    public Task<Void> T() {
        this.o.trySetResult(Boolean.TRUE);
        return this.p.getTask();
    }

    public void U(String str, String str2) {
        try {
            this.d.setCustomKey(str, str2);
            o(this.d.getCustomKeys(), false);
        } catch (IllegalArgumentException e2) {
            Context context = this.a;
            if (context != null && CommonUtils.isAppDebuggable(context)) {
                throw e2;
            }
            Logger.getLogger().e("Attempting to set custom attribute with null key, ignoring.");
        }
    }

    public void V(Map<String, String> map) {
        this.d.setCustomKeys(map);
        o(this.d.getCustomKeys(), false);
    }

    public void W(String str, String str2) {
        try {
            this.d.setInternalKey(str, str2);
            o(this.d.getInternalKeys(), true);
        } catch (IllegalArgumentException e2) {
            Context context = this.a;
            if (context != null && CommonUtils.isAppDebuggable(context)) {
                throw e2;
            }
            Logger.getLogger().e("Attempting to set custom attribute with null key, ignoring.");
        }
    }

    public void X(String str) {
        this.d.setUserId(str);
        p(this.d);
    }

    public Task<Void> Y(Task<AppSettingsData> task) {
        if (this.l.hasReportsToSend()) {
            Logger.getLogger().v("Crash reports are available to be sent.");
            return Z().onSuccessTask(new e(task));
        }
        Logger.getLogger().v("No crash reports are available to be sent.");
        this.n.trySetResult(Boolean.FALSE);
        return Tasks.forResult(null);
    }

    public void b0(@NonNull Thread thread, @NonNull Throwable th) {
        this.e.g(new RunnableC0247g(System.currentTimeMillis(), th, thread));
    }

    public void c0(long j2, String str) {
        this.e.h(new f(j2, str));
    }

    @NonNull
    public Task<Boolean> q() {
        if (this.q.compareAndSet(false, true)) {
            return this.n.getTask();
        }
        Logger.getLogger().w("checkForUnsentReports should only be called once per execution.");
        return Tasks.forResult(Boolean.FALSE);
    }

    public Task<Void> v() {
        this.o.trySetResult(Boolean.FALSE);
        return this.p.getTask();
    }

    public boolean w() {
        if (!this.c.c()) {
            String strG = G();
            return strG != null && this.j.hasCrashDataForSession(strG);
        }
        Logger.getLogger().v("Found previous crash marker.");
        this.c.d();
        return true;
    }

    public void x(SettingsDataProvider settingsDataProvider) {
        y(false, settingsDataProvider);
    }
}
