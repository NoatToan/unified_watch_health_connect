package com.xiaomi.push.service;

import com.xiaomi.push.Cif;
import defpackage.rzs;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class l0 implements rzs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final XMPushService f14238a;

    public l0(XMPushService xMPushService) {
        this.f14238a = xMPushService;
    }

    @Override // defpackage.rzs
    public void a(List<Cif> list, String str, String str2) {
        this.f14238a.a(new m0(this, 4, str, list, str2));
    }

    public final String d(String str) {
        return "com.xiaomi.xmsf".equals(str) ? "1000271" : this.f14238a.getSharedPreferences("pref_registered_pkg_names", 0).getString(str, null);
    }
}
