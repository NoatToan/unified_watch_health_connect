package com.google.android.exoplayer2.offline;

import android.app.Notification;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import com.google.android.exoplayer2.scheduler.Requirements;
import com.google.android.exoplayer2.scheduler.Scheduler;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.NotificationUtil;
import com.google.android.exoplayer2.util.Util;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class DownloadService extends Service {
    public static final String ACTION_ADD_DOWNLOAD = "com.google.android.exoplayer.downloadService.action.ADD_DOWNLOAD";
    public static final String ACTION_INIT = "com.google.android.exoplayer.downloadService.action.INIT";
    public static final String ACTION_PAUSE_DOWNLOADS = "com.google.android.exoplayer.downloadService.action.PAUSE_DOWNLOADS";
    public static final String ACTION_REMOVE_ALL_DOWNLOADS = "com.google.android.exoplayer.downloadService.action.REMOVE_ALL_DOWNLOADS";
    public static final String ACTION_REMOVE_DOWNLOAD = "com.google.android.exoplayer.downloadService.action.REMOVE_DOWNLOAD";
    public static final String ACTION_RESUME_DOWNLOADS = "com.google.android.exoplayer.downloadService.action.RESUME_DOWNLOADS";
    public static final String ACTION_SET_REQUIREMENTS = "com.google.android.exoplayer.downloadService.action.SET_REQUIREMENTS";
    public static final String ACTION_SET_STOP_REASON = "com.google.android.exoplayer.downloadService.action.SET_STOP_REASON";
    public static final long DEFAULT_FOREGROUND_NOTIFICATION_UPDATE_INTERVAL = 1000;
    public static final int FOREGROUND_NOTIFICATION_ID_NONE = 0;
    public static final String KEY_CONTENT_ID = "content_id";
    public static final String KEY_DOWNLOAD_REQUEST = "download_request";
    public static final String KEY_FOREGROUND = "foreground";
    public static final String KEY_REQUIREMENTS = "requirements";
    public static final String KEY_STOP_REASON = "stop_reason";
    private static final String k = "com.google.android.exoplayer.downloadService.action.RESTART";
    private static final String l = "DownloadService";
    private static final HashMap<Class<? extends DownloadService>, b> m = new HashMap<>();

    @Nullable
    private final c a;

    @Nullable
    private final String b;

    @StringRes
    private final int c;

    @StringRes
    private final int d;
    private DownloadManager e;
    private int f;
    private boolean g;
    private boolean h;
    private boolean i;
    private boolean j;

    public static final class b implements DownloadManager.Listener {
        private final Context a;
        private final DownloadManager b;
        private final boolean c;

        @Nullable
        private final Scheduler d;
        private final Class<? extends DownloadService> e;

        @Nullable
        private DownloadService f;

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void e(DownloadService downloadService) {
            downloadService.o(this.b.getCurrentDownloads());
        }

        private void f() {
            if (this.c) {
                Util.startForegroundService(this.a, DownloadService.i(this.a, this.e, DownloadService.k));
            } else {
                try {
                    this.a.startService(DownloadService.i(this.a, this.e, DownloadService.ACTION_INIT));
                } catch (IllegalStateException unused) {
                    Log.w(DownloadService.l, "Failed to restart DownloadService (process is idle).");
                }
            }
        }

        private boolean g() {
            DownloadService downloadService = this.f;
            return downloadService == null || downloadService.k();
        }

        private void h() {
            if (this.d == null) {
                return;
            }
            if (!this.b.isWaitingForRequirements()) {
                this.d.cancel();
                return;
            }
            String packageName = this.a.getPackageName();
            if (this.d.schedule(this.b.getRequirements(), packageName, DownloadService.k)) {
                return;
            }
            Log.e(DownloadService.l, "Scheduling downloads failed.");
        }

        public void c(final DownloadService downloadService) {
            Assertions.checkState(this.f == null);
            this.f = downloadService;
            if (this.b.isInitialized()) {
                Util.createHandlerForCurrentOrMainLooper().postAtFrontOfQueue(new Runnable() { // from class: com.google.android.exoplayer2.offline.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.e(downloadService);
                    }
                });
            }
        }

        public void d(DownloadService downloadService) {
            Assertions.checkState(this.f == downloadService);
            this.f = null;
            if (this.d == null || this.b.isWaitingForRequirements()) {
                return;
            }
            this.d.cancel();
        }

        @Override // com.google.android.exoplayer2.offline.DownloadManager.Listener
        public void onDownloadChanged(DownloadManager downloadManager, Download download, @Nullable Exception finalException) {
            DownloadService downloadService = this.f;
            if (downloadService != null) {
                downloadService.m(download);
            }
            if (g() && DownloadService.l(download.state)) {
                Log.w(DownloadService.l, "DownloadService wasn't running. Restarting.");
                f();
            }
        }

        @Override // com.google.android.exoplayer2.offline.DownloadManager.Listener
        public void onDownloadRemoved(DownloadManager downloadManager, Download download) {
            DownloadService downloadService = this.f;
            if (downloadService != null) {
                downloadService.n(download);
            }
        }

        @Override // com.google.android.exoplayer2.offline.DownloadManager.Listener
        public /* synthetic */ void onDownloadsPausedChanged(DownloadManager downloadManager, boolean z) {
            d.c(this, downloadManager, z);
        }

        @Override // com.google.android.exoplayer2.offline.DownloadManager.Listener
        public final void onIdle(DownloadManager downloadManager) {
            DownloadService downloadService = this.f;
            if (downloadService != null) {
                downloadService.q();
            }
        }

        @Override // com.google.android.exoplayer2.offline.DownloadManager.Listener
        public void onInitialized(DownloadManager downloadManager) {
            DownloadService downloadService = this.f;
            if (downloadService != null) {
                downloadService.o(downloadManager.getCurrentDownloads());
            }
        }

        @Override // com.google.android.exoplayer2.offline.DownloadManager.Listener
        public /* synthetic */ void onRequirementsStateChanged(DownloadManager downloadManager, Requirements requirements, int i) {
            d.f(this, downloadManager, requirements, i);
        }

        @Override // com.google.android.exoplayer2.offline.DownloadManager.Listener
        public void onWaitingForRequirementsChanged(DownloadManager downloadManager, boolean waitingForRequirements) {
            if (!waitingForRequirements && !downloadManager.getDownloadsPaused() && g()) {
                List<Download> currentDownloads = downloadManager.getCurrentDownloads();
                for (int i = 0; i < currentDownloads.size(); i++) {
                    if (currentDownloads.get(i).state == 0) {
                        f();
                        break;
                    }
                }
            }
            h();
        }

        private b(Context context, DownloadManager downloadManager, boolean foregroundAllowed, @Nullable Scheduler scheduler, Class<? extends DownloadService> serviceClass) {
            this.a = context;
            this.b = downloadManager;
            this.c = foregroundAllowed;
            this.d = scheduler;
            this.e = serviceClass;
            downloadManager.addListener(this);
            h();
        }
    }

    public final class c {
        private final int a;
        private final long b;
        private final Handler c = new Handler(Looper.getMainLooper());
        private boolean d;
        private boolean e;

        public c(int notificationId, long updateInterval) {
            this.a = notificationId;
            this.b = updateInterval;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void f() {
            List<Download> currentDownloads = ((DownloadManager) Assertions.checkNotNull(DownloadService.this.e)).getCurrentDownloads();
            DownloadService downloadService = DownloadService.this;
            downloadService.startForeground(this.a, downloadService.getForegroundNotification(currentDownloads));
            this.e = true;
            if (this.d) {
                this.c.removeCallbacksAndMessages(null);
                this.c.postDelayed(new Runnable() { // from class: com.google.android.exoplayer2.offline.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.f();
                    }
                }, this.b);
            }
        }

        public void b() {
            if (this.e) {
                f();
            }
        }

        public void c() {
            if (this.e) {
                return;
            }
            f();
        }

        public void d() {
            this.d = true;
            f();
        }

        public void e() {
            this.d = false;
            this.c.removeCallbacksAndMessages(null);
        }
    }

    public DownloadService(int foregroundNotificationId) {
        this(foregroundNotificationId, 1000L);
    }

    public static Intent buildAddDownloadIntent(Context context, Class<? extends DownloadService> clazz, DownloadRequest downloadRequest, boolean foreground) {
        return buildAddDownloadIntent(context, clazz, downloadRequest, 0, foreground);
    }

    public static Intent buildPauseDownloadsIntent(Context context, Class<? extends DownloadService> clazz, boolean foreground) {
        return j(context, clazz, ACTION_PAUSE_DOWNLOADS, foreground);
    }

    public static Intent buildRemoveAllDownloadsIntent(Context context, Class<? extends DownloadService> clazz, boolean foreground) {
        return j(context, clazz, ACTION_REMOVE_ALL_DOWNLOADS, foreground);
    }

    public static Intent buildRemoveDownloadIntent(Context context, Class<? extends DownloadService> clazz, String id, boolean foreground) {
        return j(context, clazz, ACTION_REMOVE_DOWNLOAD, foreground).putExtra(KEY_CONTENT_ID, id);
    }

    public static Intent buildResumeDownloadsIntent(Context context, Class<? extends DownloadService> clazz, boolean foreground) {
        return j(context, clazz, ACTION_RESUME_DOWNLOADS, foreground);
    }

    public static Intent buildSetRequirementsIntent(Context context, Class<? extends DownloadService> clazz, Requirements requirements, boolean foreground) {
        return j(context, clazz, ACTION_SET_REQUIREMENTS, foreground).putExtra(KEY_REQUIREMENTS, requirements);
    }

    public static Intent buildSetStopReasonIntent(Context context, Class<? extends DownloadService> clazz, @Nullable String id, int stopReason, boolean foreground) {
        return j(context, clazz, ACTION_SET_STOP_REASON, foreground).putExtra(KEY_CONTENT_ID, id).putExtra(KEY_STOP_REASON, stopReason);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Intent i(Context context, Class<? extends DownloadService> clazz, String action) {
        return new Intent(context, clazz).setAction(action);
    }

    private static Intent j(Context context, Class<? extends DownloadService> clazz, String action, boolean foreground) {
        return i(context, clazz, action).putExtra(KEY_FOREGROUND, foreground);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean k() {
        return this.i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean l(int state) {
        return state == 2 || state == 5 || state == 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m(Download download) {
        onDownloadChanged(download);
        if (this.a != null) {
            if (l(download.state)) {
                this.a.d();
            } else {
                this.a.b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n(Download download) {
        onDownloadRemoved(download);
        c cVar = this.a;
        if (cVar != null) {
            cVar.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o(List<Download> downloads) {
        if (this.a != null) {
            for (int i = 0; i < downloads.size(); i++) {
                if (l(downloads.get(i).state)) {
                    this.a.d();
                    return;
                }
            }
        }
    }

    private static void p(Context context, Intent intent, boolean foreground) {
        if (foreground) {
            Util.startForegroundService(context, intent);
        } else {
            context.startService(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q() {
        c cVar = this.a;
        if (cVar != null) {
            cVar.e();
        }
        if (Util.SDK_INT >= 28 || !this.h) {
            this.i |= stopSelfResult(this.f);
        } else {
            stopSelf();
            this.i = true;
        }
    }

    public static void sendAddDownload(Context context, Class<? extends DownloadService> clazz, DownloadRequest downloadRequest, boolean foreground) {
        p(context, buildAddDownloadIntent(context, clazz, downloadRequest, foreground), foreground);
    }

    public static void sendPauseDownloads(Context context, Class<? extends DownloadService> clazz, boolean foreground) {
        p(context, buildPauseDownloadsIntent(context, clazz, foreground), foreground);
    }

    public static void sendRemoveAllDownloads(Context context, Class<? extends DownloadService> clazz, boolean foreground) {
        p(context, buildRemoveAllDownloadsIntent(context, clazz, foreground), foreground);
    }

    public static void sendRemoveDownload(Context context, Class<? extends DownloadService> clazz, String id, boolean foreground) {
        p(context, buildRemoveDownloadIntent(context, clazz, id, foreground), foreground);
    }

    public static void sendResumeDownloads(Context context, Class<? extends DownloadService> clazz, boolean foreground) {
        p(context, buildResumeDownloadsIntent(context, clazz, foreground), foreground);
    }

    public static void sendSetRequirements(Context context, Class<? extends DownloadService> clazz, Requirements requirements, boolean foreground) {
        p(context, buildSetRequirementsIntent(context, clazz, requirements, foreground), foreground);
    }

    public static void sendSetStopReason(Context context, Class<? extends DownloadService> clazz, @Nullable String id, int stopReason, boolean foreground) {
        p(context, buildSetStopReasonIntent(context, clazz, id, stopReason, foreground), foreground);
    }

    public static void start(Context context, Class<? extends DownloadService> clazz) {
        context.startService(i(context, clazz, ACTION_INIT));
    }

    public static void startForeground(Context context, Class<? extends DownloadService> clazz) {
        Util.startForegroundService(context, j(context, clazz, ACTION_INIT, true));
    }

    public abstract DownloadManager getDownloadManager();

    public abstract Notification getForegroundNotification(List<Download> downloads);

    @Nullable
    public abstract Scheduler getScheduler();

    public final void invalidateForegroundNotification() {
        c cVar = this.a;
        if (cVar == null || this.j) {
            return;
        }
        cVar.b();
    }

    @Override // android.app.Service
    @Nullable
    public final IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException();
    }

    @Override // android.app.Service
    public void onCreate() {
        String str = this.b;
        if (str != null) {
            NotificationUtil.createNotificationChannel(this, str, this.c, this.d, 2);
        }
        Class<?> cls = getClass();
        HashMap<Class<? extends DownloadService>, b> map = m;
        b bVar = map.get(cls);
        if (bVar == null) {
            boolean z = this.a != null;
            Scheduler scheduler = z ? getScheduler() : null;
            DownloadManager downloadManager = getDownloadManager();
            this.e = downloadManager;
            downloadManager.resumeDownloads();
            bVar = new b(getApplicationContext(), this.e, z, scheduler, cls);
            map.put((Class<? extends DownloadService>) cls, bVar);
        } else {
            this.e = bVar.b;
        }
        bVar.c(this);
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.j = true;
        ((b) Assertions.checkNotNull(m.get(getClass()))).d(this);
        c cVar = this.a;
        if (cVar != null) {
            cVar.e();
        }
    }

    @Deprecated
    public void onDownloadChanged(Download download) {
    }

    @Deprecated
    public void onDownloadRemoved(Download download) {
    }

    @Override // android.app.Service
    public int onStartCommand(@Nullable Intent intent, int flags, int startId) {
        String stringExtra;
        c cVar;
        this.f = startId;
        this.h = false;
        String action = null;
        if (intent != null) {
            action = intent.getAction();
            stringExtra = intent.getStringExtra(KEY_CONTENT_ID);
            this.g |= intent.getBooleanExtra(KEY_FOREGROUND, false) || k.equals(action);
        } else {
            stringExtra = null;
        }
        if (action == null) {
            action = ACTION_INIT;
        }
        DownloadManager downloadManager = (DownloadManager) Assertions.checkNotNull(this.e);
        switch (action) {
            case "com.google.android.exoplayer.downloadService.action.ADD_DOWNLOAD":
                DownloadRequest downloadRequest = (DownloadRequest) ((Intent) Assertions.checkNotNull(intent)).getParcelableExtra(KEY_DOWNLOAD_REQUEST);
                if (downloadRequest != null) {
                    downloadManager.addDownload(downloadRequest, intent.getIntExtra(KEY_STOP_REASON, 0));
                    break;
                } else {
                    Log.e(l, "Ignored ADD_DOWNLOAD: Missing download_request extra");
                    break;
                }
                break;
            case "com.google.android.exoplayer.downloadService.action.RESUME_DOWNLOADS":
                downloadManager.resumeDownloads();
                break;
            case "com.google.android.exoplayer.downloadService.action.RESTART":
            case "com.google.android.exoplayer.downloadService.action.INIT":
                break;
            case "com.google.android.exoplayer.downloadService.action.REMOVE_ALL_DOWNLOADS":
                downloadManager.removeAllDownloads();
                break;
            case "com.google.android.exoplayer.downloadService.action.SET_REQUIREMENTS":
                Requirements requirements = (Requirements) ((Intent) Assertions.checkNotNull(intent)).getParcelableExtra(KEY_REQUIREMENTS);
                if (requirements != null) {
                    Scheduler scheduler = getScheduler();
                    if (scheduler != null) {
                        Requirements supportedRequirements = scheduler.getSupportedRequirements(requirements);
                        if (!supportedRequirements.equals(requirements)) {
                            int requirements2 = requirements.getRequirements() ^ supportedRequirements.getRequirements();
                            StringBuilder sb = new StringBuilder(65);
                            sb.append("Ignoring requirements not supported by the Scheduler: ");
                            sb.append(requirements2);
                            Log.w(l, sb.toString());
                            requirements = supportedRequirements;
                        }
                    }
                    downloadManager.setRequirements(requirements);
                    break;
                } else {
                    Log.e(l, "Ignored SET_REQUIREMENTS: Missing requirements extra");
                    break;
                }
                break;
            case "com.google.android.exoplayer.downloadService.action.PAUSE_DOWNLOADS":
                downloadManager.pauseDownloads();
                break;
            case "com.google.android.exoplayer.downloadService.action.SET_STOP_REASON":
                if (!((Intent) Assertions.checkNotNull(intent)).hasExtra(KEY_STOP_REASON)) {
                    Log.e(l, "Ignored SET_STOP_REASON: Missing stop_reason extra");
                    break;
                } else {
                    downloadManager.setStopReason(stringExtra, intent.getIntExtra(KEY_STOP_REASON, 0));
                    break;
                }
                break;
            case "com.google.android.exoplayer.downloadService.action.REMOVE_DOWNLOAD":
                if (stringExtra != null) {
                    downloadManager.removeDownload(stringExtra);
                    break;
                } else {
                    Log.e(l, "Ignored REMOVE_DOWNLOAD: Missing content_id extra");
                    break;
                }
                break;
            default:
                Log.e(l, action.length() != 0 ? "Ignored unrecognized action: ".concat(action) : new String("Ignored unrecognized action: "));
                break;
        }
        if (Util.SDK_INT >= 26 && this.g && (cVar = this.a) != null) {
            cVar.c();
        }
        this.i = false;
        if (downloadManager.isIdle()) {
            q();
        }
        return 1;
    }

    @Override // android.app.Service
    public void onTaskRemoved(Intent rootIntent) {
        this.h = true;
    }

    public DownloadService(int foregroundNotificationId, long foregroundNotificationUpdateInterval) {
        this(foregroundNotificationId, foregroundNotificationUpdateInterval, null, 0, 0);
    }

    public static Intent buildAddDownloadIntent(Context context, Class<? extends DownloadService> clazz, DownloadRequest downloadRequest, int stopReason, boolean foreground) {
        return j(context, clazz, ACTION_ADD_DOWNLOAD, foreground).putExtra(KEY_DOWNLOAD_REQUEST, downloadRequest).putExtra(KEY_STOP_REASON, stopReason);
    }

    @Deprecated
    public DownloadService(int foregroundNotificationId, long foregroundNotificationUpdateInterval, @Nullable String channelId, @StringRes int channelNameResourceId) {
        this(foregroundNotificationId, foregroundNotificationUpdateInterval, channelId, channelNameResourceId, 0);
    }

    public static void sendAddDownload(Context context, Class<? extends DownloadService> clazz, DownloadRequest downloadRequest, int stopReason, boolean foreground) {
        p(context, buildAddDownloadIntent(context, clazz, downloadRequest, stopReason, foreground), foreground);
    }

    public DownloadService(int foregroundNotificationId, long foregroundNotificationUpdateInterval, @Nullable String channelId, @StringRes int channelNameResourceId, @StringRes int channelDescriptionResourceId) {
        if (foregroundNotificationId == 0) {
            this.a = null;
            this.b = null;
            this.c = 0;
            this.d = 0;
            return;
        }
        this.a = new c(foregroundNotificationId, foregroundNotificationUpdateInterval);
        this.b = channelId;
        this.c = channelNameResourceId;
        this.d = channelDescriptionResourceId;
    }
}
