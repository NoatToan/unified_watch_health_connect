package com.huawei.openalliance.ad;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import com.huawei.openalliance.ad.constant.ClickDestination;
import com.huawei.openalliance.ad.constant.EventType;
import com.huawei.openalliance.ad.constant.IntentFailError;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public class to extends com.huawei.openalliance.ad.uriaction.interfaces.a {
    private String e;
    private String f;
    private rc g;

    @Override // com.huawei.openalliance.ad.uriaction.interfaces.a
    public boolean a() {
        hw.b("HwMarketAction", "handle hw app market action");
        Intent intent = new Intent("com.huawei.appmarket.appmarket.intent.action.AppDetail.withid");
        intent.setPackage("com.huawei.appmarket");
        intent.putExtra("appId", this.e);
        intent.putExtra("thirdId", this.f);
        intent.addFlags(268435456);
        com.huawei.openalliance.ad.utils.dcservice.c.a aVar = new com.huawei.openalliance.ad.utils.dcservice.c.a();
        aVar.a(this.f20324b, this.f20323a).a(intent);
        com.huawei.openalliance.ad.utils.dcservice.c cVarA = aVar.a();
        try {
            PackageManager packageManager = this.f20323a.getPackageManager();
            if (packageManager == null) {
                com.huawei.openalliance.ad.utils.cs.a(this.f20323a, "2100090", cVarA, IntentFailError.CAN_NOT_GET_PKG_MANAGER, this.f20324b);
                com.huawei.openalliance.ad.utils.cs.a(this.f20323a, cVarA, IntentFailError.CAN_NOT_GET_PKG_MANAGER);
            } else {
                if (!packageManager.queryIntentActivities(intent, 65536).isEmpty()) {
                    com.huawei.openalliance.ad.utils.k.a(this.f20323a, intent, cVarA);
                    c(ClickDestination.APPMARKET);
                    this.g.a(EventType.INTENTSUCCESS, (Integer) 3, (Integer) null);
                    return true;
                }
                com.huawei.openalliance.ad.utils.cs.a(this.f20323a, "2100090", cVarA, IntentFailError.ACTIVITY_NOT_FOUND, this.f20324b);
                com.huawei.openalliance.ad.utils.cs.a(this.f20323a, cVarA, IntentFailError.ACTIVITY_NOT_FOUND);
            }
        } catch (ActivityNotFoundException unused) {
            com.huawei.openalliance.ad.utils.cs.a(this.f20323a, "2100090", cVarA, IntentFailError.ACTIVITY_NOT_FOUND_EXP, this.f20324b);
            com.huawei.openalliance.ad.utils.cs.a(this.f20323a, cVarA, IntentFailError.ACTIVITY_NOT_FOUND_EXP);
            hw.d("HwMarketAction", "fail to open market detail page");
        }
        d();
        return b();
    }

    private void d() {
        this.g.a(EventType.INTENTFAIL, (Integer) 3, Integer.valueOf(com.huawei.openalliance.ad.utils.k.a(this.f20323a, "com.huawei.appmarket") ? 2 : 1));
    }

    public to(Context context, ContentRecord contentRecord, Map<String, String> map) {
        super(context, contentRecord);
        this.e = map.get("appId");
        this.f = map.get("thirdId");
        pc pcVar = new pc(context, sw.a(context, contentRecord.f()));
        this.g = pcVar;
        pcVar.a(contentRecord);
    }
}
