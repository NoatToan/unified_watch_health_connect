package com.huawei.openplatform.abl.log;

import android.content.Context;
import android.util.Log;
import com.huawei.openplatform.abl.log.util.g;
import defpackage.ohi;
import defpackage.ohm;

/* JADX INFO: loaded from: classes12.dex */
public class l extends b {
    private boolean d;

    @Override // com.huawei.openplatform.abl.log.b
    public boolean d() {
        return (this.d && ohm.d().a(5)) || this.f21532b.e(5);
    }

    @Override // com.huawei.openplatform.abl.log.b
    public void d(String str, String str2, Object... objArr) {
        if (!d() || str2 == null) {
            return;
        }
        ohm.d().d(str, str2, objArr);
        if (this.d) {
            return;
        }
        this.f21532b.c(5, str, g.a(str2, objArr));
    }

    @Override // com.huawei.openplatform.abl.log.b
    public void d(String str, String str2) {
        StringBuilder sb;
        try {
            ohm.d().c(str, str2);
            if (this.d) {
                return;
            }
            this.f21532b.c(5, str, str2);
        } catch (RuntimeException e) {
            e = e;
            sb = new StringBuilder("log w ");
            sb.append(e.getClass().getSimpleName());
            Log.w("TVLogger", sb.toString());
        } catch (Throwable th) {
            e = th;
            sb = new StringBuilder("log w ex: ");
            sb.append(e.getClass().getSimpleName());
            Log.w("TVLogger", sb.toString());
        }
    }

    @Override // com.huawei.openplatform.abl.log.b
    public boolean c() {
        return (this.d && ohm.d().a(4)) || this.f21532b.e(4);
    }

    @Override // com.huawei.openplatform.abl.log.b
    public void c(String str, String str2, Object... objArr) {
        if (!c() || str2 == null) {
            return;
        }
        ohm.d().c(str, str2, objArr);
        if (this.d) {
            return;
        }
        this.f21532b.c(4, str, g.a(str2, objArr));
    }

    @Override // com.huawei.openplatform.abl.log.b
    public void c(String str, String str2) {
        ohm.d().b(str, str2);
        if (this.d) {
            return;
        }
        this.f21532b.c(4, str, str2);
    }

    @Override // com.huawei.openplatform.abl.log.b
    public boolean b() {
        return (this.d && ohm.d().a(6)) || this.f21532b.e(6);
    }

    @Override // com.huawei.openplatform.abl.log.b
    public void b(String str, String str2, Object... objArr) {
        if (!b() || str2 == null) {
            return;
        }
        ohm.d().a(str, str2, objArr);
        if (this.d) {
            return;
        }
        this.f21532b.c(6, str, g.a(str2, objArr));
    }

    @Override // com.huawei.openplatform.abl.log.b
    public void b(String str, String str2) {
        ohm.d().a(str, str2);
        if (this.d) {
            return;
        }
        this.f21532b.c(6, str, str2);
    }

    @Override // com.huawei.openplatform.abl.log.b
    public boolean a() {
        return (this.d && ohm.d().a(3)) || this.f21532b.e(3);
    }

    @Override // com.huawei.openplatform.abl.log.b
    public void a(String str, String str2, Object... objArr) {
        if (!a() || str2 == null) {
            return;
        }
        ohm.d().b(str, str2, objArr);
        if (this.d) {
            return;
        }
        this.f21532b.c(3, str, g.a(str2, objArr));
    }

    @Override // com.huawei.openplatform.abl.log.b
    public void a(String str, String str2) {
        ohm.d().e(str, str2);
        if (this.d) {
            return;
        }
        this.f21532b.c(3, str, str2);
    }

    @Override // com.huawei.openplatform.abl.log.b
    public void a(ohi ohiVar) {
        if (this.d) {
            b(ohiVar);
        } else {
            super.a(ohiVar);
        }
    }

    public l c(boolean z) {
        this.d = z;
        return this;
    }

    public l(Context context) {
        this.f21531a = context;
    }
}
