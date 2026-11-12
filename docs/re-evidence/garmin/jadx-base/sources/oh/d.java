package oh;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes7.dex */
public final class d implements Callable<NetworkInfo> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f132152a;

    public d(Context context) {
        this.f132152a = context;
    }

    @Override // java.util.concurrent.Callable
    public final NetworkInfo call() {
        return ((ConnectivityManager) this.f132152a.getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
    }
}
