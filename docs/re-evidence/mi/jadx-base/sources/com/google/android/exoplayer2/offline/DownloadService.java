package com.google.android.exoplayer2.offline;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.exoplayer2.scheduler.Requirements;
import defpackage.b37;
import defpackage.gfl;
import defpackage.rk1;
import defpackage.toe;
import defpackage.wlq;
import defpackage.xxg;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class DownloadService extends Service {
    public static final HashMap<Class<? extends DownloadService>, b> j = new HashMap<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8045b;
    public final int c;
    public com.google.android.exoplayer2.offline.a d;
    public int e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;

    public static final class b implements com.google.android.exoplayer2.offline.a.InterfaceC0188a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f8046a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final com.google.android.exoplayer2.offline.a f8047b;
        public final boolean c;
        public final Class<? extends DownloadService> d;
        public DownloadService e;

        @Override // com.google.android.exoplayer2.offline.a.InterfaceC0188a
        public void b(com.google.android.exoplayer2.offline.a aVar, boolean z) {
            if (!z && !aVar.d() && i()) {
                List<b37> listC = aVar.c();
                for (int i = 0; i < listC.size(); i++) {
                    if (listC.get(i).f3743a == 0) {
                        h();
                        break;
                    }
                }
            }
            j();
        }

        public void e(final DownloadService downloadService) {
            rk1.g(this.e == null);
            this.e = downloadService;
            if (this.f8047b.f()) {
                wlq.z().postAtFrontOfQueue(new Runnable() { // from class: t37
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f34258a.g(downloadService);
                    }
                });
            }
        }

        public void f(DownloadService downloadService) {
            rk1.g(this.e == downloadService);
            this.e = null;
        }

        public final /* synthetic */ void g(DownloadService downloadService) {
            downloadService.h(this.f8047b.c());
        }

        public final void h() {
            if (this.c) {
                wlq.P0(this.f8046a, DownloadService.e(this.f8046a, this.d, "com.google.android.exoplayer.downloadService.action.RESTART"));
            } else {
                try {
                    this.f8046a.startService(DownloadService.e(this.f8046a, this.d, "com.google.android.exoplayer.downloadService.action.INIT"));
                } catch (IllegalStateException unused) {
                    toe.h("DownloadService", "Failed to restart DownloadService (process is idle).");
                }
            }
        }

        public final boolean i() {
            DownloadService downloadService = this.e;
            return downloadService == null || downloadService.g();
        }

        public final void j() {
        }

        public b(Context context, com.google.android.exoplayer2.offline.a aVar, boolean z, gfl gflVar, Class<? extends DownloadService> cls) {
            this.f8046a = context;
            this.f8047b = aVar;
            this.c = z;
            this.d = cls;
            aVar.b(this);
            j();
        }
    }

    public static Intent e(Context context, Class<? extends DownloadService> cls, String str) {
        return new Intent(context, cls).setAction(str);
    }

    public abstract com.google.android.exoplayer2.offline.a d();

    public abstract gfl f();

    public final boolean g() {
        return this.h;
    }

    public final void h(List<b37> list) {
    }

    public final void i() {
        if (wlq.f38110a >= 28 || !this.g) {
            this.h |= stopSelfResult(this.e);
        } else {
            stopSelf();
            this.h = true;
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException();
    }

    @Override // android.app.Service
    public void onCreate() {
        String str = this.f8044a;
        if (str != null) {
            xxg.a(this, str, this.f8045b, this.c, 2);
        }
        Class<?> cls = getClass();
        HashMap<Class<? extends DownloadService>, b> map = j;
        b bVar = map.get(cls);
        if (bVar == null) {
            com.google.android.exoplayer2.offline.a aVarD = d();
            this.d = aVarD;
            aVarD.l();
            bVar = new b(getApplicationContext(), this.d, false, null, cls);
            map.put((Class<? extends DownloadService>) cls, bVar);
        } else {
            this.d = bVar.f8047b;
        }
        bVar.e(this);
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.i = true;
        ((b) rk1.e(j.get(getClass()))).f(this);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        String action;
        String stringExtra;
        this.e = i2;
        this.g = false;
        if (intent != null) {
            action = intent.getAction();
            stringExtra = intent.getStringExtra("content_id");
            this.f |= intent.getBooleanExtra("foreground", false) || "com.google.android.exoplayer.downloadService.action.RESTART".equals(action);
        } else {
            action = null;
            stringExtra = null;
        }
        if (action == null) {
            action = "com.google.android.exoplayer.downloadService.action.INIT";
        }
        com.google.android.exoplayer2.offline.a aVar = (com.google.android.exoplayer2.offline.a) rk1.e(this.d);
        switch (action) {
            case "com.google.android.exoplayer.downloadService.action.ADD_DOWNLOAD":
                DownloadRequest downloadRequest = (DownloadRequest) ((Intent) rk1.e(intent)).getParcelableExtra("download_request");
                if (downloadRequest != null) {
                    aVar.a(downloadRequest, intent.getIntExtra("stop_reason", 0));
                    break;
                } else {
                    toe.c("DownloadService", "Ignored ADD_DOWNLOAD: Missing download_request extra");
                    break;
                }
                break;
            case "com.google.android.exoplayer.downloadService.action.RESUME_DOWNLOADS":
                aVar.l();
                break;
            case "com.google.android.exoplayer.downloadService.action.RESTART":
            case "com.google.android.exoplayer.downloadService.action.INIT":
                break;
            case "com.google.android.exoplayer.downloadService.action.REMOVE_ALL_DOWNLOADS":
                aVar.j();
                break;
            case "com.google.android.exoplayer.downloadService.action.SET_REQUIREMENTS":
                Requirements requirements = (Requirements) ((Intent) rk1.e(intent)).getParcelableExtra("requirements");
                if (requirements != null) {
                    f();
                    aVar.n(requirements);
                    break;
                } else {
                    toe.c("DownloadService", "Ignored SET_REQUIREMENTS: Missing requirements extra");
                    break;
                }
                break;
            case "com.google.android.exoplayer.downloadService.action.PAUSE_DOWNLOADS":
                aVar.i();
                break;
            case "com.google.android.exoplayer.downloadService.action.SET_STOP_REASON":
                if (!((Intent) rk1.e(intent)).hasExtra("stop_reason")) {
                    toe.c("DownloadService", "Ignored SET_STOP_REASON: Missing stop_reason extra");
                    break;
                } else {
                    aVar.o(stringExtra, intent.getIntExtra("stop_reason", 0));
                    break;
                }
                break;
            case "com.google.android.exoplayer.downloadService.action.REMOVE_DOWNLOAD":
                if (stringExtra != null) {
                    aVar.k(stringExtra);
                    break;
                } else {
                    toe.c("DownloadService", "Ignored REMOVE_DOWNLOAD: Missing content_id extra");
                    break;
                }
                break;
            default:
                toe.c("DownloadService", action.length() != 0 ? "Ignored unrecognized action: ".concat(action) : new String("Ignored unrecognized action: "));
                break;
        }
        int i3 = wlq.f38110a;
        this.h = false;
        if (aVar.e()) {
            i();
        }
        return 1;
    }

    @Override // android.app.Service
    public void onTaskRemoved(Intent intent) {
        this.g = true;
    }
}
