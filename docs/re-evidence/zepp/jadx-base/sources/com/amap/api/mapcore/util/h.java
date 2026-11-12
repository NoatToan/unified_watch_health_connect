package com.amap.api.mapcore.util;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.autonavi.base.amap.api.mapcore.IAMapDelegate;
import com.autonavi.base.amap.mapcore.MapConfig;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public final class h extends Thread {
    private static int c = 0;
    private static int d = 3;
    private static long e = 30000;
    private static boolean g = false;
    private WeakReference<Context> a;
    private IAMapDelegate b;
    private a f = null;
    private Handler h = new Handler(Looper.getMainLooper()) { // from class: com.amap.api.mapcore.util.h.1
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            super.handleMessage(message);
            if (h.g) {
                return;
            }
            if (h.this.f == null) {
                h hVar = h.this;
                hVar.f = new a(hVar.b, h.this.a == null ? null : (Context) h.this.a.get());
            }
            eq.a().a(h.this.f);
        }
    };

    public static class a implements Runnable {
        private WeakReference<IAMapDelegate> a;
        private WeakReference<Context> b;
        private i c;

        public a(IAMapDelegate iAMapDelegate, Context context) {
            this.a = null;
            this.b = null;
            this.a = new WeakReference<>(iAMapDelegate);
            if (context != null) {
                this.b = new WeakReference<>(context);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            i.a aVarE;
            WeakReference<Context> weakReference;
            try {
                if (h.g) {
                    return;
                }
                if (this.c == null && (weakReference = this.b) != null && weakReference.get() != null) {
                    this.c = new i(this.b.get(), "");
                }
                h.b();
                if (h.c > h.d) {
                    h.e();
                    a();
                    return;
                }
                i iVar = this.c;
                if (iVar == null || (aVarE = iVar.e()) == null) {
                    return;
                }
                if (!aVarE.d) {
                    a();
                }
                h.e();
            } catch (Throwable th) {
                hn.c(th, "authForPro", "loadConfigData_uploadException");
                ex.b(ew.e, "auth exception get data " + th.getMessage());
            }
        }

        private void a() {
            final IAMapDelegate iAMapDelegate;
            WeakReference<IAMapDelegate> weakReference = this.a;
            if (weakReference == null || weakReference.get() == null || (iAMapDelegate = this.a.get()) == null || iAMapDelegate.getMapConfig() == null) {
                return;
            }
            iAMapDelegate.queueEvent(new Runnable() { // from class: com.amap.api.mapcore.util.h.a.1
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
                        dt.a(a.this.b == null ? null : (Context) a.this.b.get(), "鉴权失败，当前key没有自定义纹理的使用权限，自定义纹理相关内容，将不会呈现！");
                    }
                }
            });
        }
    }

    public h(Context context, IAMapDelegate iAMapDelegate) {
        this.a = null;
        if (context != null) {
            this.a = new WeakReference<>(context);
        }
        this.b = iAMapDelegate;
        f();
    }

    public static /* synthetic */ int b() {
        int i = c;
        c = i + 1;
        return i;
    }

    public static /* synthetic */ boolean e() {
        g = true;
        return true;
    }

    private static void f() {
        c = 0;
        g = false;
    }

    @Override // java.lang.Thread
    public final void interrupt() {
        this.b = null;
        this.a = null;
        Handler handler = this.h;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        this.h = null;
        this.f = null;
        f();
        super.interrupt();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            if (g) {
                return;
            }
            int i = 0;
            while (i <= d) {
                i++;
                this.h.sendEmptyMessageDelayed(0, ((long) i) * e);
            }
        } catch (Throwable th) {
            hn.c(th, "AMapDelegateImpGLSurfaceView", "mVerfy");
            th.printStackTrace();
            ex.b(ew.e, "auth pro exception " + th.getMessage());
        }
    }
}
