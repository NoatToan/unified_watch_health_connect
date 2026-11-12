package defpackage;

import android.content.Context;
import android.util.Log;

/* JADX INFO: loaded from: classes4.dex */
public class du5 implements bf4 {
    @Override // defpackage.bf4
    public af4 a(Context context, af4.a aVar) {
        boolean z = ni4.a(context, "android.permission.ACCESS_NETWORK_STATE") == 0;
        Log.isLoggable("ConnectivityMonitor", 3);
        return z ? new cu5(context, aVar) : new v1h();
    }
}
