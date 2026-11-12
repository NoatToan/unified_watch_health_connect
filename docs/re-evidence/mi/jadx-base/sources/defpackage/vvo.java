package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes4.dex */
public class vvo implements f14 {
    @Override // defpackage.f14
    public long a() {
        return SystemClock.uptimeMillis();
    }

    @Override // defpackage.f14
    public void b() {
    }

    @Override // defpackage.f14
    public skb c(Looper looper, Handler.Callback callback) {
        return new yvo(new Handler(looper, callback));
    }

    @Override // defpackage.f14
    public long elapsedRealtime() {
        return SystemClock.elapsedRealtime();
    }
}
