package he;

import android.os.Handler;
import androidx.lifecycle.b0;
import androidx.lifecycle.k0;
import androidx.lifecycle.n0;

/* JADX INFO: loaded from: classes7.dex */
public class d implements k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Handler f83471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Runnable f83472b;

    public d(a aVar, Handler handler, Runnable runnable) {
        this.f83471a = handler;
        this.f83472b = runnable;
    }

    @Override // androidx.lifecycle.k0
    public final void onStateChanged(n0 n0Var, b0.a aVar) {
        if (aVar == b0.a.ON_DESTROY) {
            this.f83471a.removeCallbacks(this.f83472b);
            n0Var.getF158016a().d(this);
        }
    }
}
