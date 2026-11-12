package com.huawei.health.routeradapter;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.huawei.haf.router.Guidepost;
import com.huawei.haf.router.facade.service.PretreatmentService;
import com.huawei.health.h5pro.core.H5ProLaunchOption;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.ddv;

/* JADX INFO: loaded from: classes2.dex */
public class GroupPretreatmentService implements PretreatmentService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Uri f8698a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f8699b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f8700c = null;
    private boolean d;

    @Override // com.huawei.haf.router.facade.template.ServiceProvider
    public void init(Context context) {
    }

    @Override // com.huawei.haf.router.facade.service.PretreatmentService
    public boolean onPretreatment(Context context, Guidepost guidepost) {
        Uri uriO = guidepost.o();
        if (uriO == null) {
            LogUtil.j("GroupPretreatmentService", "onPretreatment uri is null!");
            return false;
        }
        this.f8698a = uriO;
        boolean zD = d();
        boolean zA = a();
        if ((zD || zA) && zA) {
            if (this.d) {
                LogUtil.a("GroupPretreatmentService", "jump to vip interview");
                H5ProLaunchOption.Builder builder = new H5ProLaunchOption.Builder();
                builder.addPath("#/vipinterview?verifyCode=" + this.f8700c);
                ddv.b().loadH5ProApp(context, "com.huawei.health.h5.vip", builder);
                this.d = false;
            } else {
                LogUtil.a("GroupPretreatmentService", "jump to group");
                H5ProLaunchOption.Builder builder2 = new H5ProLaunchOption.Builder();
                builder2.addPath("#/?joinGroupQr=" + this.f8700c);
                ddv.b().loadH5ProApp(context, "com.huawei.health.h5.groups", builder2);
            }
        }
        return false;
    }

    private boolean d() {
        boolean z;
        Uri uri = this.f8698a;
        if (uri == null) {
            LogUtil.d("GroupPretreatmentService", "handleCommand(Intent intent) schemeData == null");
            return false;
        }
        try {
            this.f8699b = uri.getQueryParameter("address");
            z = true;
        } catch (IllegalArgumentException | UnsupportedOperationException unused) {
            LogUtil.e("GroupPretreatmentService", "addressParam: exception");
            z = false;
        }
        LogUtil.d("GroupPretreatmentService", "schemeData queryParameter = ", this.f8699b);
        if (this.f8699b != null) {
            return z;
        }
        LogUtil.j("GroupPretreatmentService", "The schemeData queryParameter is unsafe! ");
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0052, code lost:
    
        r2 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean a() {
        boolean z;
        Uri uri = this.f8698a;
        if (uri == null) {
            LogUtil.j("GroupPretreatmentService", "handleCommand(Intent intent) schemeData == null");
            return false;
        }
        try {
            if (uri.getBooleanQueryParameter("healthgroup", false)) {
                String queryParameter = this.f8698a.getQueryParameter("healthgroup");
                this.f8700c = queryParameter;
                z = true;
                if (queryParameter != null && queryParameter.contains("verifyCode")) {
                    this.d = true;
                    String[] strArrSplit = this.f8700c.split("verifyCode");
                    if (strArrSplit.length == 2) {
                        this.f8700c = strArrSplit[1];
                    } else {
                        LogUtil.e("GroupPretreatmentService", "Error string split");
                    }
                }
            } else {
                z = false;
            }
        } catch (IllegalArgumentException | UnsupportedOperationException unused) {
            LogUtil.e("GroupPretreatmentService", "groupIdParam: exception");
            z = false;
        }
        LogUtil.d("GroupPretreatmentService", "schemeData groupParameter = ", this.f8700c);
        if (!TextUtils.isEmpty(this.f8700c)) {
            return z;
        }
        LogUtil.j("GroupPretreatmentService", "The schemeData groupParameter is unsafe! ");
        return false;
    }
}
