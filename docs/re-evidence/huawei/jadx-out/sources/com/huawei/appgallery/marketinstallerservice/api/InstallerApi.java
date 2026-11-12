package com.huawei.appgallery.marketinstallerservice.api;

import android.app.Activity;
import android.content.Context;
import com.huawei.appgallery.marketinstallerservice.a.c;
import defpackage.bih;
import defpackage.bir;

/* JADX INFO: loaded from: classes23.dex */
public class InstallerApi {
    public static void installMarket(Activity activity, InstallParamSpec installParamSpec, InstallCallback installCallback) {
        c cVar = (c) bih.c(c.class);
        if (cVar != null) {
            cVar.a(activity, installParamSpec, installCallback);
        } else {
            bir.d("InstallerApi", "installMarket impl error!");
        }
    }

    public static void getMarketInfo(Context context, BaseParamSpec baseParamSpec, InstallCallback installCallback) {
        c cVar = (c) bih.c(c.class);
        if (cVar != null) {
            cVar.a(context, baseParamSpec, installCallback);
        } else {
            bir.d("InstallerApi", "getMarketInfo impl error!");
        }
    }
}
