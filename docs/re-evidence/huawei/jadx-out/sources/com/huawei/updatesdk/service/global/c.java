package com.huawei.updatesdk.service.global;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.huawei.appgallery.serviceverifykit.api.ServiceVerifyKit;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public class c extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f29962c = null;
    private String d = "";

    @Override // com.huawei.updatesdk.service.global.a
    public boolean e(Context context) {
        return com.huawei.updatesdk.service.util.b.f(context, b()) > 100200000;
    }

    @Override // com.huawei.updatesdk.service.global.a
    public void b(String str) {
        com.huawei.updatesdk.sdk.foundation.a.b("DefaultTaskInit", "resetMarketPkgName: " + str);
        this.f29962c = str;
    }

    @Override // com.huawei.updatesdk.service.global.a
    public String b() {
        if (TextUtils.isEmpty(this.f29962c)) {
            com.huawei.updatesdk.sdk.foundation.a.b("DefaultTaskInit", "appgallery packagename is null and query again!");
            this.f29962c = b(new ArrayList());
        }
        return this.f29962c;
    }

    @Override // com.huawei.updatesdk.service.global.a
    public void a(List<String> list) {
        Context contextA = com.huawei.updatesdk.sdk.service.app.a.c().a();
        if (!TextUtils.isEmpty(this.f29962c) && com.huawei.updatesdk.service.util.b.g(contextA, this.f29962c)) {
            com.huawei.updatesdk.sdk.foundation.a.b("DefaultTaskInit", "AppMarket packageName has been obtained and is: " + this.f29962c);
            com.huawei.updatesdk.service.bean.a.c().d(this.f29962c);
            return;
        }
        String strB = b(list);
        this.f29962c = strB;
        if (TextUtils.isEmpty(strB)) {
            d();
        }
        com.huawei.updatesdk.service.bean.a.c().d(this.f29962c);
        com.huawei.updatesdk.sdk.foundation.a.b("DefaultTaskInit", "initAppGalleryPkg and get AppMarket packageName is: " + this.f29962c);
    }

    @Override // com.huawei.updatesdk.service.global.a
    String a(Context context) {
        if (!TextUtils.isEmpty(this.d)) {
            return this.d;
        }
        if (TextUtils.equals("SECURITY", com.huawei.updatesdk.sdk.foundation.log.ecs.mtk.b.a())) {
            this.d = d.a(context, "grs_sdk_global_route_config_updatesdk.json", "SECURITY");
            com.huawei.updatesdk.sdk.foundation.a.b("DefaultTaskInit", "UpdateSDK Get url is security url");
        } else {
            this.d = d.a(context, "grs_sdk_global_route_config_updatesdk.json", "DR3");
        }
        return this.d;
    }

    @Override // com.huawei.updatesdk.service.global.a
    String a() {
        return "com.huawei.updatesdk";
    }

    @Override // com.huawei.updatesdk.service.global.a
    public int a(Context context, String str) {
        return com.huawei.updatesdk.service.util.b.c(context, str);
    }

    private void d() {
        com.huawei.updatesdk.sdk.service.storekit.bean.c.b(d(com.huawei.updatesdk.sdk.service.app.a.c().a()));
        com.huawei.updatesdk.sdk.service.storekit.bean.d dVarA = com.huawei.updatesdk.service.store.b.a(new com.huawei.updatesdk.service.appmgr.bean.a(null));
        if (dVarA.e()) {
            com.huawei.updatesdk.service.appmgr.bean.b bVar = (com.huawei.updatesdk.service.appmgr.bean.b) dVarA;
            if (bVar.f() != null) {
                this.f29962c = bVar.f().d();
            } else {
                com.huawei.updatesdk.sdk.foundation.a.b("DefaultTaskInit", "can not getPackageName from store, HiApp info is null.");
            }
        }
    }

    private String b(List<String> list) {
        String strE = null;
        try {
            Context contextA = com.huawei.updatesdk.sdk.service.app.a.c().a();
            ServiceVerifyKit.Builder builder = new ServiceVerifyKit.Builder();
            builder.a(contextA).c(new Intent("com.huawei.appmarket.appmarket.intent.action.AppDetail.withdetailId"), ServiceVerifyKit.Builder.ComponentType.ACTIVITY);
            a(list, contextA, builder);
            com.huawei.updatesdk.service.device.c cVarA = com.huawei.updatesdk.service.device.b.a();
            Iterator<String> it = cVarA.f().iterator();
            while (it.hasNext()) {
                builder.d(cVarA.b(), it.next());
            }
            strE = builder.e();
            com.huawei.updatesdk.sdk.foundation.a.b("DefaultTaskInit", "get market packagename from verify kit is: " + strE);
            return strE;
        } catch (Throwable th) {
            com.huawei.updatesdk.sdk.foundation.a.c("DefaultTaskInit", "genVerifiedPackageName error: " + th.getMessage());
            return strE;
        }
    }

    private void a(List<String> list, Context context, ServiceVerifyKit.Builder builder) {
        if (com.huawei.updatesdk.service.util.d.a(list) || list.size() >= 2) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String strA = com.huawei.updatesdk.service.util.b.a(context, it.next());
            if (!TextUtils.isEmpty(strA)) {
                arrayList.add(strA);
            }
        }
        if (com.huawei.updatesdk.service.util.d.a(arrayList)) {
            return;
        }
        builder.c(arrayList);
    }
}
