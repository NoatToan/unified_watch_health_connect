package com.huawei.openalliance.ad.download.app;

import android.content.Context;
import com.huawei.openalliance.ad.constant.EventType;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.inter.data.AppInfo;
import com.huawei.openalliance.ad.inter.data.MaterialClickInfo;
import com.huawei.openalliance.ad.rc;

/* JADX INFO: loaded from: classes12.dex */
public class f {
    public boolean a(Context context, AppInfo appInfo, rc rcVar, Integer num, boolean z) {
        String str;
        if (context == null || appInfo == null || rcVar == null) {
            str = "parameters occur error";
        } else {
            String packageName = appInfo.getPackageName();
            com.huawei.openalliance.ad.utils.dcservice.c.a aVar = new com.huawei.openalliance.ad.utils.dcservice.c.a();
            aVar.a(rcVar.a(), context).a(appInfo);
            boolean zA = com.huawei.openalliance.ad.utils.k.a(context, packageName, appInfo.getIntentUri(), aVar.a());
            MaterialClickInfo materialClickInfo = new MaterialClickInfo();
            materialClickInfo.h(1);
            com.huawei.openalliance.ad.processor.eventbeans.b.a aVar2 = new com.huawei.openalliance.ad.processor.eventbeans.b.a();
            aVar2.b("app").a(materialClickInfo).a(num);
            if (zA) {
                l.a(context, appInfo);
                rcVar.a(EventType.INTENTSUCCESS, (Integer) 1, (Integer) null);
                if (z) {
                    rcVar.a(aVar2.a());
                }
                return true;
            }
            hw.b("AppLauncher", "handClick, openAppIntent fail");
            rcVar.a(EventType.INTENTFAIL, (Integer) 1, Integer.valueOf(com.huawei.openalliance.ad.utils.k.a(context, packageName) ? 2 : 1));
            if (com.huawei.openalliance.ad.utils.k.a(context, packageName, aVar.a())) {
                rcVar.a(num);
                l.a(context, appInfo);
                if (z) {
                    rcVar.a(aVar2.a());
                }
                return true;
            }
            str = "handClick, openAppMainPage fail";
        }
        hw.b("AppLauncher", str);
        return false;
    }
}
