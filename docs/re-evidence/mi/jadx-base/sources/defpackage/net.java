package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.autonavi.base.amap.api.mapcore.IAMapDelegate;
import com.autonavi.base.amap.mapcore.MapConfig;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes4.dex */
public final class net extends Thread {
    public static int e = 0;
    public static int f = 3;
    public static long g = 30000;
    public static boolean h = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WeakReference<Context> f27868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public IAMapDelegate f27869b;
    public a c = null;
    public Handler d = new b(Looper.getMainLooper());

    public static class a extends f7t {
        public WeakReference<IAMapDelegate> d;
        public WeakReference<Context> e;
        public dft g;

        /* JADX INFO: renamed from: net$a$a, reason: collision with other inner class name */
        public class RunnableC1046a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ IAMapDelegate f27870a;

            public RunnableC1046a(IAMapDelegate iAMapDelegate) {
                this.f27870a = iAMapDelegate;
            }

            @Override // java.lang.Runnable
            public final void run() {
                IAMapDelegate iAMapDelegate = this.f27870a;
                if (iAMapDelegate == null || iAMapDelegate.getMapConfig() == null) {
                    return;
                }
                MapConfig mapConfig = this.f27870a.getMapConfig();
                mapConfig.setProFunctionAuthEnable(false);
                if (mapConfig.isUseProFunction()) {
                    this.f27870a.setMapCustomEnable(mapConfig.isCustomStyleEnable(), true);
                    this.f27870a.reloadMapCustomStyle();
                    oks.b(a.this.e == null ? null : (Context) a.this.e.get(), "鉴权失败，当前key没有自定义纹理的使用权限，自定义纹理相关内容，将不会呈现！");
                }
            }
        }

        public a(IAMapDelegate iAMapDelegate, Context context) {
            this.d = null;
            this.e = null;
            this.d = new WeakReference<>(iAMapDelegate);
            if (context != null) {
                this.e = new WeakReference<>(context);
            }
        }

        @Override // defpackage.f7t
        public final void runTask() {
            dft.a aVarM;
            WeakReference<Context> weakReference;
            try {
                if (net.h) {
                    return;
                }
                if (this.g == null && (weakReference = this.e) != null && weakReference.get() != null) {
                    this.g = new dft(this.e.get(), "");
                }
                net.d();
                if (net.e > net.f) {
                    net.i();
                    a();
                    return;
                }
                dft dftVar = this.g;
                if (dftVar == null || (aVarM = dftVar.m()) == null) {
                    return;
                }
                if (!aVarM.d) {
                    a();
                }
                net.i();
            } catch (Throwable th) {
                m2t.r(th, "authForPro", "loadConfigData_uploadException");
                jos.l(gos.e, "auth exception get data " + th.getMessage());
            }
        }

        private void a() {
            IAMapDelegate iAMapDelegate;
            WeakReference<IAMapDelegate> weakReference = this.d;
            if (weakReference == null || weakReference.get() == null || (iAMapDelegate = this.d.get()) == null || iAMapDelegate.getMapConfig() == null) {
                return;
            }
            iAMapDelegate.queueEvent(new RunnableC1046a(iAMapDelegate));
        }
    }

    public class b extends Handler {
        public b(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            super.handleMessage(message);
            if (net.h) {
                return;
            }
            if (net.this.c == null) {
                net netVar = net.this;
                netVar.c = new a(netVar.f27869b, net.this.f27868a == null ? null : (Context) net.this.f27868a.get());
            }
            pms.a().b(net.this.c);
        }
    }

    public net(Context context, IAMapDelegate iAMapDelegate) {
        this.f27868a = null;
        if (context != null) {
            this.f27868a = new WeakReference<>(context);
        }
        this.f27869b = iAMapDelegate;
        j();
    }

    public static /* synthetic */ int d() {
        int i = e;
        e = i + 1;
        return i;
    }

    public static /* synthetic */ boolean i() {
        h = true;
        return true;
    }

    public static void j() {
        e = 0;
        h = false;
    }

    @Override // java.lang.Thread
    public final void interrupt() {
        this.f27869b = null;
        this.f27868a = null;
        Handler handler = this.d;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        this.d = null;
        this.c = null;
        j();
        super.interrupt();
    }

    public final void k() {
        if (h) {
            return;
        }
        int i = 0;
        while (i <= f) {
            i++;
            this.d.sendEmptyMessageDelayed(0, ((long) i) * g);
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            k();
        } catch (Throwable th) {
            m2t.r(th, "AMapDelegateImpGLSurfaceView", "mVerfy");
            th.printStackTrace();
            jos.l(gos.e, "auth pro exception " + th.getMessage());
        }
    }
}
