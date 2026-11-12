package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Handler;
import android.os.Looper;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.common.utils.NetworkUtil;
import com.huawei.haf.handler.HandlerCenter;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwlogsmodel.common.LogConfig;
import health.compact.a.AuthorizationUtils;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.Utils;

/* JADX INFO: loaded from: classes8.dex */
public class gtg {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile gtg f36019b;
    private static final Object e = new Object();
    private ConnectivityManager.NetworkCallback d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f36021c = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f36020a = false;

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context) {
    }

    private gtg() {
    }

    public static gtg d() {
        if (f36019b == null) {
            synchronized (e) {
                if (f36019b == null) {
                    f36019b = new gtg();
                }
            }
        }
        return f36019b;
    }

    public void a() {
        this.f36020a = NetworkUtil.k();
        ConnectivityManager.NetworkCallback networkCallback = new ConnectivityManager.NetworkCallback() { // from class: gtg.4
            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onAvailable(Network network) {
                super.onAvailable(network);
                LogUtil.a("WifiChangeReceiverHelper", "enter onAvailable");
                gtg.this.b();
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onLost(Network network) {
                super.onLost(network);
                LogUtil.a("WifiChangeReceiverHelper", "enter onLost");
                gtg.this.b();
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
                super.onCapabilitiesChanged(network, networkCapabilities);
                LogUtil.a("WifiChangeReceiverHelper", "enter onCapabilitiesChanged");
                gtg.this.b();
            }
        };
        this.d = networkCallback;
        try {
            NetworkUtil.d(networkCallback);
        } catch (RuntimeException e2) {
            ReleaseLogUtil.b("R_WifiChangeReceiverHelper", "registerWifiConnectReceiver registerNetworkCallback exception", ExceptionUtils.c(e2));
        }
    }

    public void h() {
        ConnectivityManager.NetworkCallback networkCallback = this.d;
        if (networkCallback != null) {
            NetworkUtil.e(networkCallback);
            this.d = null;
        }
        f36019b = null;
    }

    public boolean e() {
        LogUtil.a("WifiChangeReceiverHelper", "isWifiConnected = ", Boolean.valueOf(this.f36020a));
        return this.f36020a;
    }

    public void b() {
        boolean zK = NetworkUtil.k();
        LogUtil.a("WifiChangeReceiverHelper", "isWifiConnected = ", Boolean.valueOf(zK));
        b(zK);
    }

    public void b(boolean z) {
        LogUtil.a("WifiChangeReceiverHelper", "enter updateNetWorkState currentWifiConnectState = ", Boolean.valueOf(z), ", mIsOldConnected = ", Boolean.valueOf(this.f36021c));
        this.f36020a = z;
        if (z == this.f36021c) {
            return;
        }
        this.f36021c = z;
        d(Boolean.valueOf(z), BaseApplication.getContext());
    }

    private void d(Boolean bool, Context context) {
        if (bool.booleanValue()) {
            if (!AuthorizationUtils.c(context)) {
                LogUtil.j("WifiChangeReceiverHelper", "mWifiBroadcastReceiver onReceive not authorized privacy");
            } else {
                e(context);
            }
        }
    }

    public void e(final Context context) {
        LogUtil.a("WifiChangeReceiverHelper", "isConnected, uploadLog.");
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: gtg.1
            @Override // java.lang.Runnable
            public void run() {
                ThreadPoolManager.c().execute(new Runnable() { // from class: gtg.1.3
                    @Override // java.lang.Runnable
                    public void run() {
                        gtg.this.a(context);
                    }
                });
            }
        }, 2000L);
        if (!LogConfig.b() || Utils.o()) {
            return;
        }
        HandlerCenter.a().d(new Runnable() { // from class: gtd
            @Override // java.lang.Runnable
            public final void run() {
                lfm.b().e("");
            }
        }, 10000L);
    }
}
