package io.sentry.android.core.internal.util;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import com.example.statistics.export.OneTrackConstant;
import io.sentry.IConnectionStatusProvider;
import io.sentry.ILogger;
import io.sentry.SentryLevel;
import io.sentry.android.core.r0;
import io.sentry.android.core.u0;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@ApiStatus.Internal
public final class a implements IConnectionStatusProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f21501a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ILogger f21502b;

    @NotNull
    public final r0 c;

    @NotNull
    public final Map<IConnectionStatusProvider.a, ConnectivityManager.NetworkCallback> d = new HashMap();

    /* JADX INFO: renamed from: io.sentry.android.core.internal.util.a$a, reason: collision with other inner class name */
    public class C0968a extends ConnectivityManager.NetworkCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ IConnectionStatusProvider.a f21503a;

        public C0968a(IConnectionStatusProvider.a aVar) {
            this.f21503a = aVar;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            this.f21503a.onConnectionStatusChanged(a.this.b());
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLosing(Network network, int i) {
            this.f21503a.onConnectionStatusChanged(a.this.b());
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            this.f21503a.onConnectionStatusChanged(a.this.b());
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onUnavailable() {
            this.f21503a.onConnectionStatusChanged(a.this.b());
        }
    }

    public a(@NotNull Context context, @NotNull ILogger iLogger, @NotNull r0 r0Var) {
        this.f21501a = u0.a(context);
        this.f21502b = iLogger;
        this.c = r0Var;
    }

    @NotNull
    public static IConnectionStatusProvider.ConnectionStatus e(@NotNull Context context, @NotNull ConnectivityManager connectivityManager, @NotNull ILogger iLogger) {
        if (!l.a(context, "android.permission.ACCESS_NETWORK_STATE")) {
            iLogger.c(SentryLevel.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
            return IConnectionStatusProvider.ConnectionStatus.NO_PERMISSION;
        }
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                return activeNetworkInfo.isConnected() ? IConnectionStatusProvider.ConnectionStatus.CONNECTED : IConnectionStatusProvider.ConnectionStatus.DISCONNECTED;
            }
            iLogger.c(SentryLevel.INFO, "NetworkInfo is null, there's no active network.", new Object[0]);
            return IConnectionStatusProvider.ConnectionStatus.DISCONNECTED;
        } catch (Throwable th) {
            iLogger.a(SentryLevel.WARNING, "Could not retrieve Connection Status", th);
            return IConnectionStatusProvider.ConnectionStatus.UNKNOWN;
        }
    }

    @SuppressLint({"ObsoleteSdkInt", "MissingPermission", "NewApi"})
    @Nullable
    public static String f(@NotNull Context context, @NotNull ILogger iLogger, @NotNull r0 r0Var) {
        ConnectivityManager connectivityManagerH = h(context, iLogger);
        if (connectivityManagerH == null) {
            return null;
        }
        boolean zHasTransport = false;
        if (!l.a(context, "android.permission.ACCESS_NETWORK_STATE")) {
            iLogger.c(SentryLevel.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
            return null;
        }
        try {
            boolean zHasTransport2 = true;
            if (r0Var.d() >= 23) {
                Network activeNetwork = connectivityManagerH.getActiveNetwork();
                if (activeNetwork == null) {
                    iLogger.c(SentryLevel.INFO, "Network is null and cannot check network status", new Object[0]);
                    return null;
                }
                NetworkCapabilities networkCapabilities = connectivityManagerH.getNetworkCapabilities(activeNetwork);
                if (networkCapabilities == null) {
                    iLogger.c(SentryLevel.INFO, "NetworkCapabilities is null and cannot check network type", new Object[0]);
                    return null;
                }
                boolean zHasTransport3 = networkCapabilities.hasTransport(3);
                zHasTransport = networkCapabilities.hasTransport(1);
                zHasTransport2 = networkCapabilities.hasTransport(0);
                zHasTransport = zHasTransport3;
            } else {
                NetworkInfo activeNetworkInfo = connectivityManagerH.getActiveNetworkInfo();
                if (activeNetworkInfo == null) {
                    iLogger.c(SentryLevel.INFO, "NetworkInfo is null, there's no active network.", new Object[0]);
                    return null;
                }
                int type = activeNetworkInfo.getType();
                if (type == 0) {
                    zHasTransport = false;
                } else if (type != 1) {
                    if (type == 9) {
                        zHasTransport = true;
                    }
                    zHasTransport2 = zHasTransport;
                } else {
                    zHasTransport = true;
                    zHasTransport2 = false;
                }
            }
            if (zHasTransport) {
                return "ethernet";
            }
            if (zHasTransport) {
                return "wifi";
            }
            if (zHasTransport2) {
                return "cellular";
            }
            return null;
        } catch (Throwable th) {
            iLogger.a(SentryLevel.ERROR, "Failed to retrieve network info", th);
        }
    }

    @SuppressLint({"NewApi"})
    @Nullable
    public static String g(@NotNull NetworkCapabilities networkCapabilities, @NotNull r0 r0Var) {
        if (r0Var.d() < 21) {
            return null;
        }
        if (networkCapabilities.hasTransport(3)) {
            return "ethernet";
        }
        if (networkCapabilities.hasTransport(1)) {
            return "wifi";
        }
        if (networkCapabilities.hasTransport(0)) {
            return "cellular";
        }
        return null;
    }

    @Nullable
    public static ConnectivityManager h(@NotNull Context context, @NotNull ILogger iLogger) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(OneTrackConstant.EVENT_NAME_CONNECTIVITY);
        if (connectivityManager == null) {
            iLogger.c(SentryLevel.INFO, "ConnectivityManager is null and cannot check network status", new Object[0]);
        }
        return connectivityManager;
    }

    @SuppressLint({"MissingPermission", "NewApi"})
    public static boolean i(@NotNull Context context, @NotNull ILogger iLogger, @NotNull r0 r0Var, @NotNull ConnectivityManager.NetworkCallback networkCallback) {
        if (r0Var.d() < 24) {
            iLogger.c(SentryLevel.DEBUG, "NetworkCallbacks need Android N+.", new Object[0]);
            return false;
        }
        ConnectivityManager connectivityManagerH = h(context, iLogger);
        if (connectivityManagerH == null) {
            return false;
        }
        if (!l.a(context, "android.permission.ACCESS_NETWORK_STATE")) {
            iLogger.c(SentryLevel.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
            return false;
        }
        try {
            connectivityManagerH.registerDefaultNetworkCallback(networkCallback);
            return true;
        } catch (Throwable th) {
            iLogger.a(SentryLevel.WARNING, "registerDefaultNetworkCallback failed", th);
            return false;
        }
    }

    @SuppressLint({"NewApi"})
    public static void j(@NotNull Context context, @NotNull ILogger iLogger, @NotNull r0 r0Var, @NotNull ConnectivityManager.NetworkCallback networkCallback) {
        ConnectivityManager connectivityManagerH;
        if (r0Var.d() >= 21 && (connectivityManagerH = h(context, iLogger)) != null) {
            try {
                connectivityManagerH.unregisterNetworkCallback(networkCallback);
            } catch (Throwable th) {
                iLogger.a(SentryLevel.WARNING, "unregisterNetworkCallback failed", th);
            }
        }
    }

    @Override // io.sentry.IConnectionStatusProvider
    @Nullable
    public String a() {
        return f(this.f21501a, this.f21502b, this.c);
    }

    @Override // io.sentry.IConnectionStatusProvider
    @NotNull
    public IConnectionStatusProvider.ConnectionStatus b() {
        ConnectivityManager connectivityManagerH = h(this.f21501a, this.f21502b);
        return connectivityManagerH == null ? IConnectionStatusProvider.ConnectionStatus.UNKNOWN : e(this.f21501a, connectivityManagerH, this.f21502b);
    }

    @Override // io.sentry.IConnectionStatusProvider
    public void c(@NotNull IConnectionStatusProvider.a aVar) {
        ConnectivityManager.NetworkCallback networkCallbackRemove = this.d.remove(aVar);
        if (networkCallbackRemove != null) {
            j(this.f21501a, this.f21502b, this.c, networkCallbackRemove);
        }
    }

    @Override // io.sentry.IConnectionStatusProvider
    @SuppressLint({"NewApi"})
    public boolean d(@NotNull IConnectionStatusProvider.a aVar) {
        if (this.c.d() < 21) {
            this.f21502b.c(SentryLevel.DEBUG, "addConnectionStatusObserver requires Android 5+.", new Object[0]);
            return false;
        }
        C0968a c0968a = new C0968a(aVar);
        this.d.put(aVar, c0968a);
        return i(this.f21501a, this.f21502b, this.c, c0968a);
    }
}
