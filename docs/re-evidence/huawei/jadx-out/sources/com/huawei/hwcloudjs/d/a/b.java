package com.huawei.hwcloudjs.d.a;

import android.content.Context;
import com.huawei.hwcloudjs.service.auth.bean.AuthBean;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f17067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f17068b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ List f17069c;
    final /* synthetic */ c.a d;
    final /* synthetic */ Context e;
    final /* synthetic */ c f;

    @Override // java.lang.Runnable
    public void run() throws Throwable {
        AuthBean authBeanA = this.f.f.a(this.f17067a);
        com.huawei.hwcloudjs.f.d.c("AuthManager", "getValidCache bean", true);
        com.huawei.hwcloudjs.f.d.c("AuthManager", "getValidCache bean:" + authBeanA, false);
        if (authBeanA == null || !d.a(this.f17068b, this.f17069c, authBeanA)) {
            com.huawei.hwcloudjs.f.d.b("AuthManager", "checkH5App is null", true);
            this.f.b(this.f17067a, this.f17068b, this.f17069c, this.d, this.e);
        } else {
            com.huawei.hwcloudjs.f.d.c("AuthManager", "checkH5App is passed", true);
            this.d.a(0);
            this.f.a(this.f17067a, authBeanA);
        }
    }

    b(c cVar, String str, String str2, List list, c.a aVar, Context context) {
        this.f = cVar;
        this.f17067a = str;
        this.f17068b = str2;
        this.f17069c = list;
        this.d = aVar;
        this.e = context;
    }
}
