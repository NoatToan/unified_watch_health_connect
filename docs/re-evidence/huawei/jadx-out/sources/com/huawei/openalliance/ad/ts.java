package com.huawei.openalliance.ad;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.openalliance.ad.constant.ClickDestination;
import com.huawei.openalliance.ad.constant.IntentFailError;
import com.huawei.openalliance.ad.db.bean.ContentRecord;

/* JADX INFO: loaded from: classes12.dex */
public class ts extends com.huawei.openalliance.ad.uriaction.interfaces.a {
    @Override // com.huawei.openalliance.ad.uriaction.interfaces.a
    public boolean a() {
        if (this.f20324b == null || !(pa.b(this.f20324b.X()) || com.huawei.openalliance.ad.utils.cb.e(this.f20323a))) {
            com.huawei.openalliance.ad.utils.cs.a(this.f20323a, "2100091", null, "network error", this.f20324b);
            return b();
        }
        hw.b("OuterWebAction", "handle outer browser action");
        Intent intent = new Intent();
        intent.setAction(CommonConstant.ACTION.HWID_SCHEME_URL);
        String strC = this.f20324b.C();
        if (!com.huawei.openalliance.ad.utils.dg.b(strC)) {
            intent.setData(Uri.parse(strC));
            if (!(this.f20323a instanceof Activity)) {
                intent.addFlags(268435456);
            }
            com.huawei.openalliance.ad.utils.dcservice.c.a aVar = new com.huawei.openalliance.ad.utils.dcservice.c.a();
            aVar.a(this.f20324b, this.f20323a).a(intent);
            com.huawei.openalliance.ad.utils.dcservice.c cVarA = aVar.a();
            try {
                if (pa.c(this.f20324b.X())) {
                    hw.a("OuterWebAction", "handleUri, use default browser");
                    String strD = d();
                    if (TextUtils.isEmpty(strD)) {
                        hw.c("OuterWebAction", "can not find default browser");
                    } else {
                        intent.setPackage(strD);
                    }
                }
                PackageManager packageManager = this.f20323a.getPackageManager();
                if (packageManager == null) {
                    com.huawei.openalliance.ad.utils.cs.a(this.f20323a, "2100091", cVarA, IntentFailError.CAN_NOT_GET_PKG_MANAGER, this.f20324b);
                    com.huawei.openalliance.ad.utils.cs.a(this.f20323a, cVarA, IntentFailError.CAN_NOT_GET_PKG_MANAGER);
                } else {
                    if (!packageManager.queryIntentActivities(intent, 65536).isEmpty()) {
                        c(ClickDestination.WEB);
                        com.huawei.openalliance.ad.utils.k.b(this.f20323a, intent, cVarA);
                        return true;
                    }
                    com.huawei.openalliance.ad.utils.cs.a(this.f20323a, "2100091", cVarA, IntentFailError.ACTIVITY_NOT_FOUND, this.f20324b);
                    com.huawei.openalliance.ad.utils.cs.a(this.f20323a, cVarA, IntentFailError.ACTIVITY_NOT_FOUND);
                }
            } catch (ActivityNotFoundException unused) {
                com.huawei.openalliance.ad.utils.cs.a(this.f20323a, "2100091", cVarA, IntentFailError.ACTIVITY_NOT_FOUND_EXP, this.f20324b);
                com.huawei.openalliance.ad.utils.cs.a(this.f20323a, cVarA, IntentFailError.ACTIVITY_NOT_FOUND_EXP);
                hw.d("OuterWebAction", "fail to open uri");
            } catch (Throwable th) {
                com.huawei.openalliance.ad.utils.cs.a(this.f20323a, "2100091", cVarA, th.getClass().getSimpleName(), this.f20324b);
                com.huawei.openalliance.ad.utils.cs.a(this.f20323a, cVarA, "unknown exception : " + th.getClass().getSimpleName());
                hw.d("OuterWebAction", "handle uri exception: %s", th.getClass().getSimpleName());
            }
        }
        return b();
    }

    private String d() {
        for (String str : fp.b(this.f20323a).bE()) {
            if (com.huawei.openalliance.ad.utils.k.a(this.f20323a, str)) {
                return str;
            }
        }
        return "";
    }

    public ts(Context context, ContentRecord contentRecord) {
        super(context, contentRecord);
    }
}
