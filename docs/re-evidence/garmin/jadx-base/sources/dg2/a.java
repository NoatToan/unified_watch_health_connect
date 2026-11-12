package dg2;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import r53.p2;
import r53.q2;
import zg2.c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Ldg2/a;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "b", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f59522b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p2 f59523a;

    /* JADX INFO: renamed from: dg2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"dg2/a$a", "Landroid/net/ConnectivityManager$NetworkCallback;", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C1271a extends ConnectivityManager.NetworkCallback {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ConnectivityManager f59525b;

        public C1271a(ConnectivityManager connectivityManager) {
            this.f59525b = connectivityManager;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onAvailable(Network network) {
            network.getClass();
            super.onAvailable(network);
            int i14 = a.f59522b;
            a aVar = a.this;
            aVar.getClass();
            boolean zA = a.a(network, this.f59525b);
            c.f204692a.getClass();
            c.d("LiveActivityNetworkConnectivityManager", "onAvailable isNetworkConnectivityAvailable = " + zA);
            aVar.f59523a.k(null, Boolean.valueOf(zA));
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onLost(Network network) {
            network.getClass();
            super.onLost(network);
            c.f204692a.getClass();
            c.d("LiveActivityNetworkConnectivityManager", "Network lost.");
            a.this.f59523a.k(null, Boolean.FALSE);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onUnavailable() {
            super.onUnavailable();
            c.f204692a.getClass();
            c.d("LiveActivityNetworkConnectivityManager", "No network available.");
            a.this.f59523a.k(null, Boolean.FALSE);
        }
    }

    static {
        new b(null);
    }

    public a(Context context) {
        context.getClass();
        Object systemService = context.getSystemService("connectivity");
        systemService.getClass();
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        Network activeNetwork = connectivityManager.getActiveNetwork();
        this.f59523a = q2.a(Boolean.valueOf(activeNetwork != null ? a(activeNetwork, connectivityManager) : false));
        connectivityManager.registerDefaultNetworkCallback(new C1271a(connectivityManager));
    }

    public static boolean a(Network network, ConnectivityManager connectivityManager) {
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
        if (networkCapabilities != null) {
            return networkCapabilities.hasTransport(4) || networkCapabilities.hasTransport(1) || networkCapabilities.hasTransport(0);
        }
        c.f204692a.getClass();
        c.b("LiveActivityNetworkConnectivityManager", "Failed to get network capabilities for network " + network + ". Returning false as isConnectedToInternet.");
        return false;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ldg2/a$b;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(j jVar) {
            this();
        }

        private b() {
        }
    }
}
