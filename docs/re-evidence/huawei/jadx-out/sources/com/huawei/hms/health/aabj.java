package com.huawei.hms.health;

import android.app.Activity;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import com.huawei.hmf.tasks.Task;
import com.huawei.hms.api.Api;
import com.huawei.hms.common.HuaweiApi;
import com.huawei.hms.common.internal.AbstractClientBuilder;
import com.huawei.hms.utils.Checker;

/* JADX INFO: loaded from: classes10.dex */
public class aabj extends HuaweiApi<aabl> implements aabn {
    private static final aabi aaba = new aabi();
    private static final Api<aabl> aabb = new Api<>("HuaweiHealth.API");
    private Context aab;

    @Override // com.huawei.hms.common.HuaweiApi
    public int getApiLevel() {
        String string;
        Context context = this.aab;
        if (context == null) {
            return 1;
        }
        try {
            if (context.getPackageManager() == null) {
                return 1;
            }
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            if (applicationInfo.metaData != null) {
                return applicationInfo.metaData.getInt("com.huawei.hms.min_api_level:hihealth-base:hihealth");
            }
            return 1;
        } catch (PackageManager.NameNotFoundException unused) {
            StringBuilder sbAab = aab.aab("can not find the app, package name:");
            sbAab.append(context.getPackageName());
            string = sbAab.toString();
            aabz.aab("PackageManagerUtil", string);
            return 1;
        } catch (RuntimeException unused2) {
            string = "getApplicationInfo exists exception!";
            aabz.aab("PackageManagerUtil", string);
            return 1;
        }
    }

    public Task<aabp> aab(aabo aaboVar) {
        Checker.checkNonNull(aaboVar);
        aaboVar.aab();
        return doWrite(new aabm("hihealth.getHmsHealthService", "HealthHmsInputBean"));
    }

    aabj(Context context, aabl aablVar) {
        super(context, aabb, aablVar, aaba);
        this.aab = context.getApplicationContext();
    }

    aabj(Activity activity, aabl aablVar) {
        super(activity, aabb, aablVar, (AbstractClientBuilder) aaba);
        this.aab = activity.getApplicationContext();
    }
}
