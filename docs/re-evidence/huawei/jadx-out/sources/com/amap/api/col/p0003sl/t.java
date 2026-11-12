package com.amap.api.col.p0003sl;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.autonavi.base.amap.api.mapcore.IAMapDelegate;
import com.autonavi.base.amap.mapcore.MapConfig;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes4.dex */
public final class t extends Thread {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f3281c = 0;
    private static int d = 3;
    private static long e = 30000;
    private static boolean g = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WeakReference<Context> f3282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private IAMapDelegate f3283b;
    private a f = null;
    private Handler h = new Handler(Looper.getMainLooper()) { // from class: com.amap.api.col.3sl.t.1
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            super.handleMessage(message);
            if (t.g) {
                return;
            }
            if (t.this.f == null) {
                t tVar = t.this;
                tVar.f = new a(tVar.f3283b, t.this.f3282a == null ? null : (Context) t.this.f3282a.get());
            }
            dz.a().a(t.this.f);
        }
    };

    static /* synthetic */ int b() {
        int i = f3281c;
        f3281c = i + 1;
        return i;
    }

    static /* synthetic */ boolean e() {
        g = true;
        return true;
    }

    public t(Context context, IAMapDelegate iAMapDelegate) {
        this.f3282a = null;
        if (context != null) {
            this.f3282a = new WeakReference<>(context);
        }
        this.f3283b = iAMapDelegate;
        f();
    }

    private static void f() {
        f3281c = 0;
        g = false;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            g();
        } catch (Throwable th) {
            jv.c(th, "AMapDelegateImpGLSurfaceView", "mVerfy");
            th.printStackTrace();
            ee.b(ed.e, "auth pro exception " + th.getMessage());
        }
    }

    private void g() {
        if (g) {
            return;
        }
        int i = 0;
        while (i <= d) {
            i++;
            this.h.sendEmptyMessageDelayed(0, ((long) i) * e);
        }
    }

    @Override // java.lang.Thread
    public final void interrupt() {
        this.f3283b = null;
        this.f3282a = null;
        Handler handler = this.h;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        this.h = null;
        this.f = null;
        f();
        super.interrupt();
    }

    static final class a extends mb {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference<IAMapDelegate> f3285a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private WeakReference<Context> f3286b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private u f3287c;

        public a(IAMapDelegate iAMapDelegate, Context context) {
            this.f3285a = null;
            this.f3286b = null;
            this.f3285a = new WeakReference<>(iAMapDelegate);
            if (context != null) {
                this.f3286b = new WeakReference<>(context);
            }
        }

        @Override // com.amap.api.col.p0003sl.mb
        public final void runTask() {
            u.a aVarD;
            WeakReference<Context> weakReference;
            try {
                if (t.g) {
                    return;
                }
                if (this.f3287c == null && (weakReference = this.f3286b) != null && weakReference.get() != null) {
                    this.f3287c = new u(this.f3286b.get(), "");
                }
                t.b();
                if (t.f3281c > t.d) {
                    t.e();
                    a();
                    return;
                }
                u uVar = this.f3287c;
                if (uVar == null || (aVarD = uVar.d()) == null) {
                    return;
                }
                if (!aVarD.d) {
                    a();
                }
                t.e();
            } catch (Throwable th) {
                jv.c(th, "authForPro", "loadConfigData_uploadException");
                ee.b(ed.e, "auth exception get data " + th.getMessage());
            }
        }

        private void a() {
            final IAMapDelegate iAMapDelegate;
            WeakReference<IAMapDelegate> weakReference = this.f3285a;
            if (weakReference == null || weakReference.get() == null || (iAMapDelegate = this.f3285a.get()) == null || iAMapDelegate.getMapConfig() == null) {
                return;
            }
            iAMapDelegate.queueEvent(new Runnable() { // from class: com.amap.api.col.3sl.t.a.1
                @Override // java.lang.Runnable
                public final void run() {
                    IAMapDelegate iAMapDelegate2 = iAMapDelegate;
                    if (iAMapDelegate2 == null || iAMapDelegate2.getMapConfig() == null) {
                        return;
                    }
                    MapConfig mapConfig = iAMapDelegate.getMapConfig();
                    mapConfig.setProFunctionAuthEnable(false);
                    if (mapConfig.isUseProFunction()) {
                        iAMapDelegate.setMapCustomEnable(mapConfig.isCustomStyleEnable(), true);
                        iAMapDelegate.reloadMapCustomStyle();
                        dh.a(a.this.f3286b == null ? null : (Context) a.this.f3286b.get(), "鉴权失败，当前key没有自定义纹理的使用权限，自定义纹理相关内容，将不会呈现！");
                    }
                }
            });
        }
    }
}
