package androidx.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/q0;", "Landroid/app/Service;", "Landroidx/lifecycle/n0;", "<init>", "()V", "lifecycle-service"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class q0 extends Service implements n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r1 f7996a = new r1(this);

    @Override // androidx.lifecycle.n0
    /* JADX INFO: renamed from: getLifecycle */
    public final b0 getF158016a() {
        return this.f7996a.f8003a;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        intent.getClass();
        r1 r1Var = this.f7996a;
        r1Var.getClass();
        r1Var.a(b0.a.ON_START);
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        r1 r1Var = this.f7996a;
        r1Var.getClass();
        r1Var.a(b0.a.ON_CREATE);
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        r1 r1Var = this.f7996a;
        r1Var.getClass();
        r1Var.a(b0.a.ON_STOP);
        r1Var.a(b0.a.ON_DESTROY);
        super.onDestroy();
    }

    @Override // android.app.Service
    @o13.e
    public final void onStart(Intent intent, int i14) {
        r1 r1Var = this.f7996a;
        r1Var.getClass();
        r1Var.a(b0.a.ON_START);
        super.onStart(intent, i14);
    }
}
