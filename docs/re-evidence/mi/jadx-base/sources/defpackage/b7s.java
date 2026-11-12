package defpackage;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.assetpacks.AssetPackException;

/* JADX INFO: loaded from: classes5.dex */
public final class b7s extends g6s {
    public final /* synthetic */ j8s c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b7s(j8s j8sVar, TaskCompletionSource taskCompletionSource) {
        super(j8sVar, taskCompletionSource);
        this.c = j8sVar;
    }

    @Override // defpackage.g6s, defpackage.cxs
    public final void Y1(Bundle bundle) {
        this.c.e.u(this.f18659a);
        int i = bundle.getInt("error_code");
        j8s.g.b("onError(%d)", Integer.valueOf(i));
        this.f18659a.trySetException(new AssetPackException(i));
    }

    @Override // defpackage.g6s, defpackage.cxs
    public final void g1(Bundle bundle, Bundle bundle2) {
        super.g1(bundle, bundle2);
        if (!this.c.f.compareAndSet(true, false)) {
            j8s.g.e("Expected keepingAlive to be true, but was false.", new Object[0]);
        }
        if (bundle.getBoolean("keep_alive")) {
            this.c.f();
        }
    }
}
