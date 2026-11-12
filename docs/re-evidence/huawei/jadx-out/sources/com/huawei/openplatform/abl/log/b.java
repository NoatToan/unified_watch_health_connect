package com.huawei.openplatform.abl.log;

import android.content.Context;
import android.os.Build;
import com.huawei.openplatform.abl.log.util.d;
import com.huawei.openplatform.abl.log.util.f;
import defpackage.ohi;
import defpackage.ohm;
import defpackage.ohr;
import defpackage.ohu;

/* JADX INFO: loaded from: classes12.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Context f21531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    ohr f21532b = new ohr();

    abstract void a(String str, String str2);

    abstract void a(String str, String str2, Object... objArr);

    abstract boolean a();

    abstract void b(String str, String str2);

    abstract void b(String str, String str2, Object... objArr);

    abstract boolean b();

    abstract void c(String str, String str2);

    abstract void c(String str, String str2, Object... objArr);

    abstract boolean c();

    abstract void d(String str, String str2);

    abstract void d(String str, String str2, Object... objArr);

    abstract boolean d();

    protected void b(ohi ohiVar) {
        if (ohiVar == null) {
            return;
        }
        if ((ohiVar.j() || ohiVar.f()) && d.a("com.huawei.hms.support.log.KitLog")) {
            ohm.d().c(this.f21531a, ohiVar.c(), ohiVar.d());
        }
    }

    public void a(ohi ohiVar) {
        if (ohiVar == null) {
            return;
        }
        b(ohiVar);
        f.a(this.f21531a);
        this.f21532b.b(ohiVar);
        this.f21532b.a(ohiVar.d(), "\n============================================================================\n====== " + ohiVar.b() + "\n====== Brand: " + Build.BRAND + " Model: " + ohu.b() + " Release: " + Build.VERSION.RELEASE + " API: " + Build.VERSION.SDK_INT + "\n============================================================================");
    }

    public void a(int i, Throwable th) {
        this.f21532b.c(i, "", th);
    }

    public void a(int i, String str, Throwable th) {
        this.f21532b.c(i, str, th);
    }

    public void a(int i, String str, String str2, Throwable th) {
        this.f21532b.a(i, str, str2, th);
    }
}
