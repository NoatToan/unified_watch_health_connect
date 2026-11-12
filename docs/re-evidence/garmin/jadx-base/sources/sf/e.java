package sf;

import android.annotation.SuppressLint;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lsf/e;", "Lsf/d;", "Landroid/net/ConnectivityManager;", "connectivityManager", "<init>", "(Landroid/net/ConnectivityManager;)V", "coil-network-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SuppressLint({"MissingPermission"})
public final class e implements d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConnectivityManager f158763b;

    public e(ConnectivityManager connectivityManager) {
        this.f158763b = connectivityManager;
    }

    @Override // sf.d
    public final boolean a() {
        ConnectivityManager connectivityManager = this.f158763b;
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        return networkCapabilities != null && networkCapabilities.hasCapability(12);
    }
}
