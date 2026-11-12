package com.loc;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.Messenger;
import android.text.TextUtils;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.xiaomi.hm.health.Constant;

/* JADX INFO: loaded from: classes18.dex */
public final class f {
    public e a;
    public Context b;
    public Messenger c = null;

    public f(Context context) {
        this.a = null;
        this.b = null;
        this.b = context.getApplicationContext();
        this.a = new e(this.b);
    }

    public final IBinder a(Intent intent) {
        e.a aVar;
        e eVar = this.a;
        String stringExtra = intent.getStringExtra("a");
        if (!TextUtils.isEmpty(stringExtra)) {
            l.a(eVar.e, stringExtra);
        }
        String stringExtra2 = intent.getStringExtra("b");
        eVar.a = stringExtra2;
        k.a(stringExtra2);
        String stringExtra3 = intent.getStringExtra(GoogleApiAvailabilityLight.a);
        if (!TextUtils.isEmpty(stringExtra3)) {
            n.a(stringExtra3);
        }
        e eVar2 = this.a;
        if ("true".equals(intent.getStringExtra(Constant.PAI_KEY_ACTIVITY_SCORES)) && (aVar = eVar2.d) != null) {
            aVar.sendEmptyMessageDelayed(9, 100L);
        }
        Messenger messenger = new Messenger(this.a.d);
        this.c = messenger;
        return messenger.getBinder();
    }

    public final void a() {
        try {
            e.d();
            this.a.j = eo.b();
            this.a.k = eo.a();
            this.a.a();
        } catch (Throwable th) {
            ei.a(th, "ApsServiceCore", "onCreate");
        }
    }

    public final void b() {
        try {
            e eVar = this.a;
            if (eVar != null) {
                eVar.d.sendEmptyMessage(11);
            }
        } catch (Throwable th) {
            ei.a(th, "ApsServiceCore", "onDestroy");
        }
    }
}
