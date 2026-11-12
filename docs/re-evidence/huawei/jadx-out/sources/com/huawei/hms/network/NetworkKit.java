package com.huawei.hms.network;

import android.content.Context;
import com.huawei.hms.framework.common.ActivityUtil;
import com.huawei.hms.framework.common.ContextHolder;
import com.huawei.hms.framework.common.ExecutorsUtils;
import com.huawei.hms.framework.common.Logger;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes3.dex */
public abstract class NetworkKit {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f14446a = "NetworkKit";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f14447b = 1000;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static String f14448c;
    private static volatile NetworkKit d;
    private static RemoteInitializer e;
    private static Context f;
    private static volatile Future g;
    private static final Lock h = new ReentrantLock();
    private static ExecutorService i = ExecutorsUtils.newSingleThreadExecutor("NK");

    public static abstract class Callback {
        public abstract void onResult(boolean z);
    }

    public abstract void addQuicHint(boolean z, String... strArr);

    public abstract void evictAllConnections();

    public abstract String getOption(String str);

    public abstract void initConnectionPool(int i2, long j, TimeUnit timeUnit);

    protected abstract void initKit(Context context, String str);

    public abstract void setOptions(String str);

    public static Future init(Context context, Callback callback, String str) {
        if (context == null) {
            throw new IllegalArgumentException("context is null");
        }
        Logger.i(f14446a, "init  Version:" + Version.getVersion() + "  BuildTime:" + Version.getBuildTime() + " cp:" + context.getPackageName());
        h.lock();
        try {
            ContextHolder.setAppContext(context.getApplicationContext());
            f = ContextHolder.getAppContext();
            ActivityUtil.getInstance().register();
            return a(callback, str);
        } finally {
            h.unlock();
        }
    }

    public static Future init(Context context, Callback callback) {
        return init(context, callback, "");
    }

    static RemoteInitializer getRemoteInitializer() {
        return e;
    }

    public static NetworkKit getInstance() {
        NetworkKitProvider enableProvider;
        synchronized (NetworkKit.class) {
            if (d != null) {
                return d;
            }
            if (a()) {
                Logger.i(f14446a, "dynamic load");
                if (e == null) {
                    e = new RemoteInitializer();
                }
                Future futureInit = getRemoteInitializer().init(getContext());
                if (futureInit != null) {
                    try {
                        futureInit.get(1000L, TimeUnit.MILLISECONDS);
                    } catch (InterruptedException | ExecutionException | TimeoutException e2) {
                        Logger.e(f14446a, "create exception = " + e2.getClass().getSimpleName());
                    }
                }
                enableProvider = NetworkKitProvider.getEnableProvider(true);
            } else {
                Logger.i(f14446a, "not dynamic load");
                enableProvider = NetworkKitProvider.loadLocalProvider();
            }
            d = enableProvider.createNetworkKit();
            d.initKit(f, f14448c);
            return d;
        }
    }

    static Context getContext() {
        Context context = f;
        if (context != null) {
            return context;
        }
        throw new IllegalStateException("you must call init(final Context context, final Callback callback) or init(final Context context, final Callback callback, final String options) before all Method");
    }

    private static boolean a() {
        return com.huawei.hms.network.api.a.a(f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(Callback callback) {
        boolean z = d != null;
        if (z) {
            Logger.i(f14446a, "init success");
        } else {
            Logger.e(f14446a, "you must implementation network-embedded sdk, and ensure the context is kitself or appself");
        }
        if (callback != null) {
            callback.onResult(z);
        }
    }

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Callback f14449a;

        @Override // java.lang.Runnable
        public void run() {
            NetworkKit.getInstance();
            NetworkKit.a(this.f14449a);
        }

        a(Callback callback) {
            this.f14449a = callback;
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Callback f14450a;

        @Override // java.lang.Runnable
        public void run() {
            NetworkKit.a(this.f14450a);
        }

        b(Callback callback) {
            this.f14450a = callback;
        }
    }

    private static Future a(Callback callback, String str) {
        try {
            if (g == null) {
                f14448c = str;
                g = i.submit(new a(callback));
            } else {
                i.execute(new b(callback));
            }
        } catch (RejectedExecutionException unused) {
            Logger.e(f14446a, "init networkkit error, please try later");
        }
        return g;
    }
}
