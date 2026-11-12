package com.garmin.android.apps.connectmobile.audioprompts;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import c22.o;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.proto.generated.GDIAudioPromptsProto;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import go1.j;
import java.util.Iterator;
import java.util.LinkedList;
import o13.m;
import o13.q;
import o13.t;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import rs2.c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/audioprompts/b;", "", "<init>", "()V", "a", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f30221d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final t f30222e = m.b(new j(4));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedList f30223a = new LinkedList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AudioPromptsService.e f30224b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f30225c;

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.audioprompts.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/audioprompts/b$b", "Landroid/content/ServiceConnection;", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ServiceConnectionC0472b implements ServiceConnection {
        public ServiceConnectionC0472b() {
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            componentName.getClass();
            iBinder.getClass();
            if (iBinder instanceof AudioPromptsService.e) {
                b bVar = b.this;
                bVar.f30224b = (AudioPromptsService.e) iBinder;
                LinkedList linkedList = bVar.f30223a;
                bVar.f30225c = 2;
                Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                linkedList.clear();
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
            componentName.getClass();
            if (AudioPromptsService.class.getName().equals(componentName.getClassName())) {
                b bVar = b.this;
                bVar.f30225c = 0;
                bVar.f30224b = null;
            }
        }
    }

    private b() {
    }

    public static b a() {
        return new b();
    }

    public static /* synthetic */ boolean d(b bVar, String str, GDIAudioPromptsProto.AudioPromptsService audioPromptsService, long j8, int i14) {
        if ((i14 & 1) != 0) {
            str = null;
        }
        if ((i14 & 2) != 0) {
            audioPromptsService = null;
        }
        if ((i14 & 4) != 0) {
            j8 = -1;
        }
        return bVar.c(str, audioPromptsService, j8, null);
    }

    public final void b(Runnable runnable) {
        b bVar;
        int i14 = this.f30225c;
        if (i14 == 2 && this.f30224b != null) {
            a2 a2Var = a2.DEVICE_SERVICES;
            i2.f36769a.getClass();
            i2.a.b(a2Var, "AudioPromptsManager", "CONNECTED");
            runnable.run();
            return;
        }
        if (i14 == 0) {
            a2 a2Var2 = a2.DEVICE_SERVICES;
            i2.f36769a.getClass();
            i2.a.b(a2Var2, "AudioPromptsManager", "DISCONNECTED");
            bVar = this;
            d(bVar, null, null, 0L, 15);
        } else {
            bVar = this;
        }
        a2 a2Var3 = a2.DEVICE_SERVICES;
        i2.f36769a.getClass();
        i2.a.b(a2Var3, "AudioPromptsManager", "add");
        bVar.f30223a.add(runnable);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00b4 A[Catch: all -> 0x00bd, TryCatch #0 {all -> 0x00bd, blocks: (B:18:0x0072, B:21:0x0078, B:23:0x0082, B:34:0x00b4, B:38:0x00c4, B:37:0x00bf, B:26:0x0088, B:27:0x0093, B:29:0x0099, B:39:0x00c7), top: B:51:0x0072 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00bf A[Catch: all -> 0x00bd, TryCatch #0 {all -> 0x00bd, blocks: (B:18:0x0072, B:21:0x0078, B:23:0x0082, B:34:0x00b4, B:38:0x00c4, B:37:0x00bf, B:26:0x0088, B:27:0x0093, B:29:0x0099, B:39:0x00c7), top: B:51:0x0072 }] */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean c(String str, GDIAudioPromptsProto.AudioPromptsService audioPromptsService, long j8, c cVar) {
        Object[] objArr;
        if (!km2.a.h(km2.a.b())) {
            return false;
        }
        Object bVar = null;
        Context applicationContext = ((o) KoinJavaComponent.get$default(o.class, null, null, 6, null)).c().getApplicationContext();
        Intent intent = new Intent(applicationContext, (Class<?>) AudioPromptsService.class);
        intent.setAction("AudioPromptsService.ACTION_START");
        if (str != null) {
            intent.putExtra("AudioPromptsService.EXTRA_IDENTIFIER", str);
        }
        if (j8 != -1) {
            intent.putExtra("AudioPromptsService.EXTRA_DEVICE_ID", j8);
        }
        if (cVar != null) {
            intent.putExtra("AudioPromptsService.EXTRA_PRODUCT_NUMBER", cVar.getF92744h());
            intent.putExtra("AudioPromptsService.EXTRA_SOFTWARE_VERSION", cVar.getF92745i());
        }
        boolean z14 = (j8 == -1 || audioPromptsService == null) ? false : true;
        intent.putExtra("AudioPromptsService.EXTRA_NOTIFICATION_FG", z14);
        a2 a2Var = a2.DEVICE_SERVICES;
        i2.f36769a.getClass();
        i2.a.b(a2Var, "AudioPromptsManager", TtmlNode.START);
        gu.c cVar2 = (gu.c) KoinJavaComponent.get$default(gu.c.class, null, null, 6, null);
        try {
            int i14 = q.f128596b;
            if (!z14) {
                i2.a.b(a2Var, "AudioPromptsManager", "start:Starting background service");
                applicationContext.getClass();
                cVar2.a(applicationContext, intent);
                bVar = Unit.INSTANCE;
            } else if (applicationContext != null) {
                Object systemService = applicationContext.getSystemService("activity");
                ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
                if (activityManager != null) {
                    Iterator<ActivityManager.RunningServiceInfo> it = activityManager.getRunningServices(Integer.MAX_VALUE).iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (AudioPromptsService.class.getName().equals(it.next().service.getClassName())) {
                                objArr = true;
                                break;
                            }
                        }
                    }
                    if (objArr == true) {
                        i2.a.b(a2Var, "AudioPromptsManager", "start: Service already running");
                    } else {
                        i2.a.b(a2Var, "AudioPromptsManager", "start: Starting foreground service");
                        a7.b.startForegroundService(applicationContext, intent);
                    }
                    bVar = Unit.INSTANCE;
                }
                objArr = false;
                if (objArr == true) {
                    i2.a.b(a2Var, "AudioPromptsManager", "start: Starting foreground service");
                    a7.b.startForegroundService(applicationContext, intent);
                } else {
                    i2.a.b(a2Var, "AudioPromptsManager", "start: Service already running");
                }
                bVar = Unit.INSTANCE;
            }
        } catch (Throwable th3) {
            int i15 = q.f128596b;
            bVar = new q.b(th3);
        }
        Throwable thB = q.b(bVar);
        if (thB != null) {
            a2 a2Var2 = a2.DEVICE_SERVICES;
            String strP = am.j.p("start: Failed to start service ", thB);
            i2.f36769a.getClass();
            i2.a.f(a2Var2, "AudioPromptsManager", strP);
        }
        if (this.f30225c == 0) {
            applicationContext.bindService(intent, new ServiceConnectionC0472b(), 0);
        }
        this.f30225c = 1;
        return true;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\t¨\u0006\f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/audioprompts/b$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "DISCONNECTED", "I", "CONNECTING", "CONNECTED", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static b a() {
            return (b) b.f30222e.getValue();
        }

        private a() {
        }
    }
}
