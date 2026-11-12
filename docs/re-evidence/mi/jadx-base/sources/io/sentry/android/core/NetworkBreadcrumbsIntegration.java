package io.sentry.android.core;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import androidx.annotation.RequiresApi;
import defpackage.c8c;
import defpackage.ftc;
import defpackage.iul;
import defpackage.ucd;
import defpackage.yq5;
import io.sentry.ILogger;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import java.io.Closeable;
import java.io.IOException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.TestOnly;

/* JADX INFO: loaded from: classes2.dex */
public final class NetworkBreadcrumbsIntegration implements ucd, Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f21395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final r0 f21396b;

    @NotNull
    public final ILogger c;

    @NotNull
    public final Object d = new Object();
    public volatile boolean e;

    @Nullable
    public SentryOptions f;

    @TestOnly
    @Nullable
    public volatile c g;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ftc f21397a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ SentryOptions f21398b;

        public a(ftc ftcVar, SentryOptions sentryOptions) {
            this.f21397a = ftcVar;
            this.f21398b = sentryOptions;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (NetworkBreadcrumbsIntegration.this.e) {
                return;
            }
            synchronized (NetworkBreadcrumbsIntegration.this.d) {
                try {
                    NetworkBreadcrumbsIntegration.this.g = new c(this.f21397a, NetworkBreadcrumbsIntegration.this.f21396b, this.f21398b.getDateProvider());
                    if (io.sentry.android.core.internal.util.a.i(NetworkBreadcrumbsIntegration.this.f21395a, NetworkBreadcrumbsIntegration.this.c, NetworkBreadcrumbsIntegration.this.f21396b, NetworkBreadcrumbsIntegration.this.g)) {
                        NetworkBreadcrumbsIntegration.this.c.c(SentryLevel.DEBUG, "NetworkBreadcrumbsIntegration installed.", new Object[0]);
                        io.sentry.util.k.a("NetworkBreadcrumbs");
                    } else {
                        NetworkBreadcrumbsIntegration.this.c.c(SentryLevel.DEBUG, "NetworkBreadcrumbsIntegration not installed.", new Object[0]);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f21399a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f21400b;
        public final int c;
        public long d;
        public final boolean e;

        @NotNull
        public final String f;

        @RequiresApi(api = 21)
        @SuppressLint({"NewApi", "ObsoleteSdkInt"})
        public b(@NotNull NetworkCapabilities networkCapabilities, @NotNull r0 r0Var, long j) {
            io.sentry.util.p.c(networkCapabilities, "NetworkCapabilities is required");
            io.sentry.util.p.c(r0Var, "BuildInfoProvider is required");
            this.f21399a = networkCapabilities.getLinkDownstreamBandwidthKbps();
            this.f21400b = networkCapabilities.getLinkUpstreamBandwidthKbps();
            int signalStrength = r0Var.d() >= 29 ? networkCapabilities.getSignalStrength() : 0;
            this.c = signalStrength > -100 ? signalStrength : 0;
            this.e = networkCapabilities.hasTransport(4);
            String strG = io.sentry.android.core.internal.util.a.g(networkCapabilities, r0Var);
            this.f = strG == null ? "" : strG;
            this.d = j;
        }

        public boolean a(@NotNull b bVar) {
            int iAbs = Math.abs(this.c - bVar.c);
            int iAbs2 = Math.abs(this.f21399a - bVar.f21399a);
            int iAbs3 = Math.abs(this.f21400b - bVar.f21400b);
            boolean z = yq5.k((double) Math.abs(this.d - bVar.d)) < 5000.0d;
            return this.e == bVar.e && this.f.equals(bVar.f) && (z || iAbs <= 5) && (z || (((double) iAbs2) > Math.max(1000.0d, ((double) Math.abs(this.f21399a)) * 0.1d) ? 1 : (((double) iAbs2) == Math.max(1000.0d, ((double) Math.abs(this.f21399a)) * 0.1d) ? 0 : -1)) <= 0) && (z || (((double) iAbs3) > Math.max(1000.0d, ((double) Math.abs(this.f21400b)) * 0.1d) ? 1 : (((double) iAbs3) == Math.max(1000.0d, ((double) Math.abs(this.f21400b)) * 0.1d) ? 0 : -1)) <= 0);
        }
    }

    @RequiresApi(api = 21)
    @SuppressLint({"ObsoleteSdkInt"})
    public static final class c extends ConnectivityManager.NetworkCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final ftc f21401a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final r0 f21402b;

        @Nullable
        public Network c = null;

        @Nullable
        public NetworkCapabilities d = null;
        public long e = 0;

        @NotNull
        public final iul f;

        public c(@NotNull ftc ftcVar, @NotNull r0 r0Var, @NotNull iul iulVar) {
            this.f21401a = (ftc) io.sentry.util.p.c(ftcVar, "Hub is required");
            this.f21402b = (r0) io.sentry.util.p.c(r0Var, "BuildInfoProvider is required");
            this.f = (iul) io.sentry.util.p.c(iulVar, "SentryDateProvider is required");
        }

        public final io.sentry.a a(String str) {
            io.sentry.a aVar = new io.sentry.a();
            aVar.q("system");
            aVar.m("network.event");
            aVar.n("action", str);
            aVar.o(SentryLevel.INFO);
            return aVar;
        }

        @Nullable
        public final b b(@Nullable NetworkCapabilities networkCapabilities, @NotNull NetworkCapabilities networkCapabilities2, long j, long j2) {
            if (networkCapabilities == null) {
                return new b(networkCapabilities2, this.f21402b, j2);
            }
            b bVar = new b(networkCapabilities, this.f21402b, j);
            b bVar2 = new b(networkCapabilities2, this.f21402b, j2);
            if (bVar.a(bVar2)) {
                return null;
            }
            return bVar2;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            if (network.equals(this.c)) {
                return;
            }
            this.f21401a.m(a("NETWORK_AVAILABLE"));
            this.c = network;
            this.d = null;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            if (network.equals(this.c)) {
                long jH = this.f.now().h();
                b bVarB = b(this.d, networkCapabilities, this.e, jH);
                if (bVarB == null) {
                    return;
                }
                this.d = networkCapabilities;
                this.e = jH;
                io.sentry.a aVarA = a("NETWORK_CAPABILITIES_CHANGED");
                aVarA.n("download_bandwidth", Integer.valueOf(bVarB.f21399a));
                aVarA.n("upload_bandwidth", Integer.valueOf(bVarB.f21400b));
                aVarA.n("vpn_active", Boolean.valueOf(bVarB.e));
                aVarA.n("network_type", bVarB.f);
                int i = bVarB.c;
                if (i != 0) {
                    aVarA.n("signal_strength", Integer.valueOf(i));
                }
                c8c c8cVar = new c8c();
                c8cVar.l("android:networkCapabilities", bVarB);
                this.f21401a.o(aVarA, c8cVar);
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            if (network.equals(this.c)) {
                this.f21401a.m(a("NETWORK_LOST"));
                this.c = null;
                this.d = null;
            }
        }
    }

    public NetworkBreadcrumbsIntegration(@NotNull Context context, @NotNull r0 r0Var, @NotNull ILogger iLogger) {
        this.f21395a = (Context) io.sentry.util.p.c(u0.a(context), "Context is required");
        this.f21396b = (r0) io.sentry.util.p.c(r0Var, "BuildInfoProvider is required");
        this.c = (ILogger) io.sentry.util.p.c(iLogger, "ILogger is required");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.e = true;
        try {
            ((SentryOptions) io.sentry.util.p.c(this.f, "Options is required")).getExecutorService().submit(new Runnable() { // from class: io.sentry.android.core.i1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f21475a.n();
                }
            });
        } catch (Throwable th) {
            this.c.a(SentryLevel.ERROR, "Error submitting NetworkBreadcrumbsIntegration task.", th);
        }
    }

    public final /* synthetic */ void n() {
        synchronized (this.d) {
            try {
                if (this.g != null) {
                    io.sentry.android.core.internal.util.a.j(this.f21395a, this.c, this.f21396b, this.g);
                    this.c.c(SentryLevel.DEBUG, "NetworkBreadcrumbsIntegration removed.", new Object[0]);
                }
                this.g = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.ucd
    @SuppressLint({"NewApi"})
    public void register(@NotNull ftc ftcVar, @NotNull SentryOptions sentryOptions) {
        io.sentry.util.p.c(ftcVar, "Hub is required");
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) io.sentry.util.p.c(sentryOptions instanceof SentryAndroidOptions ? (SentryAndroidOptions) sentryOptions : null, "SentryAndroidOptions is required");
        ILogger iLogger = this.c;
        SentryLevel sentryLevel = SentryLevel.DEBUG;
        iLogger.c(sentryLevel, "NetworkBreadcrumbsIntegration enabled: %s", Boolean.valueOf(sentryAndroidOptions.isEnableNetworkEventBreadcrumbs()));
        this.f = sentryOptions;
        if (sentryAndroidOptions.isEnableNetworkEventBreadcrumbs()) {
            if (this.f21396b.d() < 24) {
                this.c.c(sentryLevel, "NetworkCallbacks need Android N+.", new Object[0]);
                return;
            }
            try {
                sentryOptions.getExecutorService().submit(new a(ftcVar, sentryOptions));
            } catch (Throwable th) {
                this.c.a(SentryLevel.ERROR, "Error submitting NetworkBreadcrumbsIntegration task.", th);
            }
        }
    }
}
