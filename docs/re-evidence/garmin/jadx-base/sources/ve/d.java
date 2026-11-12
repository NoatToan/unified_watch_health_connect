package ve;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes7.dex */
public class d implements ue.e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f177562a = Handler.createAsync(Looper.getMainLooper());

    @Override // ue.e0
    public final void a(long j8, Runnable runnable) {
        this.f177562a.postDelayed(runnable, j8);
    }

    @Override // ue.e0
    public final void b(Runnable runnable) {
        this.f177562a.removeCallbacks(runnable);
    }
}
