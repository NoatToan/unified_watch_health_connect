package com.huawei.openalliance.ad.inter;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import com.huawei.openalliance.ad.cc;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.utils.as;
import java.lang.ref.WeakReference;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes12.dex */
public class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static c f19149b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final byte[] f19150c = new byte[0];
    private Context d;
    private a f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f19151a = false;
    private CopyOnWriteArrayList<WeakReference<b>> e = new CopyOnWriteArrayList<>();

    public interface b {
        void a();
    }

    public void c() {
        String str;
        try {
            hw.b("ExSplashStartReceiver", "unregister receiver");
            a aVar = this.f;
            if (aVar != null) {
                this.d.unregisterReceiver(aVar);
                this.f = null;
            }
        } catch (IllegalStateException unused) {
            str = "unregisterReceiver IllegalStateException";
            hw.c("ExSplashStartReceiver", str);
        } catch (Throwable unused2) {
            str = "unregisterReceiver exception";
            hw.c("ExSplashStartReceiver", str);
        }
    }

    public void b(b bVar) {
        try {
            CopyOnWriteArrayList<WeakReference<b>> copyOnWriteArrayList = this.e;
            if (copyOnWriteArrayList != null && copyOnWriteArrayList.size() > 0) {
                for (WeakReference<b> weakReference : this.e) {
                    b bVar2 = weakReference.get();
                    if (bVar2 == null || bVar2 == bVar) {
                        this.e.remove(weakReference);
                    }
                }
            }
        } catch (Throwable th) {
            hw.b("ExSplashStartReceiver", "removeStartListener err: %s", th.getClass().getSimpleName());
        }
    }

    public void b() {
        String str;
        try {
            c();
            if (!cc.b(this.d)) {
                hw.c("ExSplashStartReceiver", "not inner device, no need to register");
                return;
            }
            IntentFilter intentFilter = new IntentFilter(Constants.ACTION_EXSPLASH_BEGIN);
            Intent intentA = as.a(this.d, (BroadcastReceiver) null, intentFilter, Constants.PERMISSION_PPS_DOWNLOAD, (Handler) null);
            if (intentA != null && intentA.getAction() != null && intentA.getAction().equals(Constants.ACTION_EXSPLASH_BEGIN)) {
                hw.b("ExSplashStartReceiver", "isExSplashStart");
                this.f19151a = true;
                this.d.removeStickyBroadcast(intentA);
            }
            if (this.f == null) {
                this.f = new a();
            }
            hw.b("ExSplashStartReceiver", "register receiver");
            as.a(this.d, this.f, intentFilter, Constants.PERMISSION_PPS_DOWNLOAD, (Handler) null);
        } catch (IllegalStateException unused) {
            str = "registerReceiver IllegalStateException";
            hw.c("ExSplashStartReceiver", str);
        } catch (Throwable unused2) {
            str = "registerReceiver Exception";
            hw.c("ExSplashStartReceiver", str);
        }
    }

    public boolean a() {
        return this.f19151a;
    }

    public void a(boolean z) {
        this.f19151a = z;
    }

    public void a(b bVar) {
        if (bVar != null) {
            this.e.add(new WeakReference<>(bVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        if (this.e.isEmpty()) {
            return;
        }
        for (WeakReference<b> weakReference : this.e) {
            if (weakReference.get() != null) {
                weakReference.get().a();
            }
        }
    }

    class a extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            hw.b("ExSplashStartReceiver", "onReceive");
            if (intent == null) {
                return;
            }
            try {
                if (Constants.ACTION_EXSPLASH_BEGIN.equals(intent.getAction())) {
                    c.this.f19151a = true;
                    c.this.d();
                    context.removeStickyBroadcast(intent);
                }
            } catch (Throwable th) {
                hw.c("ExSplashStartReceiver", "ExSplashBeginReceiver err: %s", th.getClass().getSimpleName());
            }
        }

        private a() {
        }
    }

    public static c a(Context context) {
        c cVar;
        synchronized (f19150c) {
            if (f19149b == null) {
                f19149b = new c(context);
            }
            cVar = f19149b;
        }
        return cVar;
    }

    private c(Context context) {
        this.d = context.getApplicationContext();
    }
}
