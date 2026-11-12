package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.Messenger;
import com.autonavi.aps.amapapi.utils.c;
import com.autonavi.aps.amapapi.utils.k;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;

/* JADX INFO: loaded from: classes4.dex */
public final class vrs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ins f37171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f37172b;
    public Messenger c = null;

    public vrs(Context context) {
        this.f37171a = null;
        this.f37172b = null;
        this.f37172b = context.getApplicationContext();
        this.f37171a = new ins(this.f37172b);
    }

    public final IBinder a(Intent intent) {
        this.f37171a.w(intent);
        this.f37171a.d(intent);
        Messenger messenger = new Messenger(this.f37171a.s());
        this.c = messenger;
        return messenger.getBinder();
    }

    public final void b() {
        try {
            ins.F();
            this.f37171a.q = k.b();
            this.f37171a.f21331r = k.a();
            this.f37171a.c();
        } catch (Throwable th) {
            c.a(th, "ApsServiceCore", "onCreate");
        }
    }

    public final int c() {
        ins insVar = this.f37171a;
        return (insVar == null || insVar.z.isSelfStartServiceEnable()) ? 3 : 2;
    }

    public final void d() {
        try {
            ins insVar = this.f37171a;
            if (insVar != null) {
                insVar.s().sendEmptyMessage(11);
            }
        } catch (Throwable th) {
            c.a(th, "ApsServiceCore", LifecycleConstantKt.ON_DESTROY);
        }
    }
}
