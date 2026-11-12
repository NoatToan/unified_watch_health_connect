package com.huawei.openalliance.ad;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.openalliance.ad.beans.server.PermissionRsp;
import com.huawei.openalliance.ad.inter.data.AppInfo;
import com.huawei.openalliance.ad.inter.data.PermissionEntity;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class pp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f20050a = "pp";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f20051b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private gf f20052c;
    private a d;

    public interface a {
        void a(List<PermissionEntity> list);
    }

    public void a(final AppInfo appInfo) {
        if (appInfo == null || !com.huawei.openalliance.ad.utils.bm.a(appInfo.getPermissions()) || !appInfo.w()) {
            a((List<PermissionEntity>) null);
            return;
        }
        final com.huawei.openalliance.ad.utils.ci ciVarA = com.huawei.openalliance.ad.utils.ci.a();
        final String strC = c(appInfo);
        List<PermissionEntity> listA = TextUtils.isEmpty(strC) ? null : ciVarA.a(strC);
        if (com.huawei.openalliance.ad.utils.bm.a(listA)) {
            com.huawei.openalliance.ad.utils.o.b(new Runnable() { // from class: com.huawei.openalliance.ad.pp.1
                @Override // java.lang.Runnable
                public void run() {
                    List<PermissionEntity> listB = pp.this.b(appInfo);
                    if (!com.huawei.openalliance.ad.utils.bm.a(listB)) {
                        ciVarA.a(strC, listB);
                    }
                    pp.this.a(listB);
                }
            });
        } else {
            appInfo.b(listA);
            a(listA);
        }
    }

    private String c(AppInfo appInfo) {
        if (appInfo == null) {
            return "";
        }
        return appInfo.getPackageName() + "_" + appInfo.x() + "_" + appInfo.y() + "_" + com.huawei.openalliance.ad.utils.d.a() + "_" + com.huawei.openalliance.ad.utils.dk.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<PermissionEntity> b(AppInfo appInfo) {
        if (appInfo == null || TextUtils.isEmpty(appInfo.getPackageName())) {
            hw.c(f20050a, "empty request parameters");
            return null;
        }
        PermissionRsp permissionRspA = this.f20052c.a(appInfo.getPackageName(), appInfo.x(), appInfo.y(), appInfo.B(), com.huawei.openalliance.ad.utils.ab.k(this.f20051b));
        if (permissionRspA != null) {
            hw.b(f20050a, "request permissions, retCode: %s", Integer.valueOf(permissionRspA.a()));
            appInfo.a(permissionRspA.b());
        }
        return appInfo.getPermissions();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(List<PermissionEntity> list) {
        a aVar = this.d;
        if (aVar != null) {
            aVar.a(list);
        }
    }

    public pp(Context context, a aVar) {
        this(context);
        this.d = aVar;
    }

    public pp(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f20051b = applicationContext;
        this.f20052c = fi.a(applicationContext);
    }
}
