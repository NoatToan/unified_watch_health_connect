package com.amap.api.col.p0003sl;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.Messenger;
import com.autonavi.aps.amapapi.utils.c;
import com.autonavi.aps.amapapi.utils.k;

/* JADX INFO: loaded from: classes4.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    e f2505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Context f2506b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Messenger f2507c = null;

    public f(Context context) {
        this.f2505a = null;
        this.f2506b = null;
        this.f2506b = context.getApplicationContext();
        this.f2505a = new e(this.f2506b);
    }

    public final IBinder a(Intent intent) {
        this.f2505a.b(intent);
        this.f2505a.a(intent);
        Messenger messenger = new Messenger(this.f2505a.b());
        this.f2507c = messenger;
        return messenger.getBinder();
    }

    public final void a() {
        try {
            e.e();
            this.f2505a.j = k.b();
            this.f2505a.k = k.a();
            this.f2505a.a();
        } catch (Throwable th) {
            c.a(th, "ApsServiceCore", "onCreate");
        }
    }

    public final int b() {
        e eVar = this.f2505a;
        return (eVar == null || eVar.n.isSelfStartServiceEnable()) ? 3 : 2;
    }

    public final void c() {
        try {
            e eVar = this.f2505a;
            if (eVar != null) {
                eVar.b().sendEmptyMessage(11);
            }
        } catch (Throwable th) {
            c.a(th, "ApsServiceCore", "onDestroy");
        }
    }
}
