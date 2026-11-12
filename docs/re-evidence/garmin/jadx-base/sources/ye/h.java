package ye;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import ue.u;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lye/h;", "Landroid/net/ConnectivityManager$NetworkCallback;", "<init>", "()V", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h extends ConnectivityManager.NetworkCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f196795a = new h();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f196796b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final LinkedHashMap f196797c = new LinkedHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static NetworkCapabilities f196798d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static boolean f196799e;

    private h() {
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        network.getClass();
        networkCapabilities.getClass();
        u uVarA = u.a();
        int i14 = l.f196812a;
        uVarA.getClass();
        synchronized (f196796b) {
            try {
                f196798d = networkCapabilities;
                for (Map.Entry entry : f196797c.entrySet()) {
                    ((e23.l) entry.getKey()).invoke(((NetworkRequest) entry.getValue()).canBeSatisfiedBy(networkCapabilities) ? b.a.f196778a : new b.C3684b(7));
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        network.getClass();
        u uVarA = u.a();
        int i14 = l.f196812a;
        uVarA.getClass();
        synchronized (f196796b) {
            try {
                f196798d = null;
                Iterator it = f196797c.keySet().iterator();
                while (it.hasNext()) {
                    ((e23.l) it.next()).invoke(new b.C3684b(7));
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
