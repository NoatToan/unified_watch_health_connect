package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.huawei.android.appbundle.splitinstall.SplitSessionLoader;
import com.huawei.haf.bundle.InstallSessionState;
import com.huawei.haf.bundle.InstallStateListener;
import com.huawei.haf.common.security.SecurityConstant;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes22.dex */
final class azz {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile azz f861c;
    private static final Object d = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final IntentFilter f862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SplitSessionLoader f863b;
    private final Context e;
    private final Handler f;
    private final c g;
    private final azq h;
    private final Set<InstallStateListener> i;

    private azz(Context context) {
        this(context, bag.d());
    }

    private azz(Context context, SplitSessionLoader splitSessionLoader) {
        this.h = new azq("SplitListenerRegistry");
        this.i = Collections.newSetFromMap(new ConcurrentHashMap());
        this.f862a = new IntentFilter("com.huawei.android.appbundle.splitinstall.receiver.SplitInstallUpdateIntentService");
        this.g = new c();
        this.e = context.getApplicationContext();
        this.f = new Handler(Looper.getMainLooper());
        this.f863b = splitSessionLoader;
    }

    static azz c(Context context) {
        if (f861c == null) {
            synchronized (d) {
                if (f861c == null) {
                    f861c = new azz(context);
                }
            }
        }
        return f861c;
    }

    void c(InstallStateListener installStateListener) {
        synchronized (this) {
            try {
                if (installStateListener == null) {
                    this.h.c("registerListener listener == null", new Object[0]);
                    return;
                }
                if (this.i.add(installStateListener) && this.i.size() == 1) {
                    if (Build.VERSION.SDK_INT >= 33) {
                        this.e.registerReceiver(this.g, this.f862a, SecurityConstant.f5920a, null, 4);
                    } else {
                        this.e.registerReceiver(this.g, this.f862a, SecurityConstant.f5920a, null);
                    }
                }
                this.h.d("registerListener, size=%d", Integer.valueOf(this.i.size()));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void d(InstallStateListener installStateListener) {
        synchronized (this) {
            if (installStateListener == null) {
                this.h.c("unregisterListener listener == null", new Object[0]);
                return;
            }
            if (this.i.remove(installStateListener) && this.i.isEmpty()) {
                try {
                    this.e.unregisterReceiver(this.g);
                } catch (Exception e) {
                    this.h.c(e, "unregisterListener", new Object[0]);
                }
            }
            this.h.d("unregisterListener, size=%d", Integer.valueOf(this.i.size()));
        }
    }

    void b(InstallSessionState installSessionState) {
        Iterator<InstallStateListener> it = this.i.iterator();
        while (it.hasNext()) {
            try {
                it.next().onStateUpdate(installSessionState);
            } catch (Exception e) {
                this.h.c(e, "notifyListeners State %s", String.valueOf(installSessionState));
            }
        }
    }

    void d(Runnable runnable) {
        this.f.post(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(Intent intent) {
        SplitSessionLoader splitSessionLoader;
        Bundle bundleExtra = intent.getBundleExtra("session_state");
        if (bundleExtra == null) {
            this.h.c("onReceived, bundle == null", new Object[0]);
            return;
        }
        baf bafVarA = baf.a(bundleExtra);
        if (bafVarA.status() != 2 || bafVarA.bytesDownloaded() == 0 || bafVarA.bytesDownloaded() >= bafVarA.totalBytesToDownload()) {
            this.h.d("onReceived: %s", bafVarA);
        }
        if (bafVarA.status() == 10 && (splitSessionLoader = this.f863b) != null) {
            splitSessionLoader.load(bafVarA.c(), new bah(this, bafVarA));
        } else {
            b(bafVarA);
        }
    }

    class c extends BroadcastReceiver {
        private c() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            try {
                azz.this.e(intent);
            } catch (Exception e) {
                azz.this.h.c(e, "onReceive Intent %s", String.valueOf(intent));
            }
        }
    }
}
