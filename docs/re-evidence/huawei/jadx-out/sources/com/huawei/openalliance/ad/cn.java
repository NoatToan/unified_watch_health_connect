package com.huawei.openalliance.ad;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.hms.framework.network.grs.GrsClient;
import com.huawei.openalliance.ad.beans.inner.CountryCodeBean;
import com.huawei.openalliance.ad.constant.FlavorConstants;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public class cn implements cs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private GrsBaseInfo f18362a = new GrsBaseInfo();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f18363b;

    @Override // com.huawei.openalliance.ad.cs
    public Map<String, String> c(String str) {
        return new GrsClient(this.f18363b, this.f18362a).synGetGrsUrls(FlavorConstants.HIAD_GRS_SERVICE_NAME);
    }

    @Override // com.huawei.openalliance.ad.cs
    public void b(String str) {
        this.f18362a.setSerCountry(str);
    }

    @Override // com.huawei.openalliance.ad.cs
    public void b() {
        hw.b("HwGrsImpl", "forceExpire");
        try {
            new GrsClient(this.f18363b, this.f18362a).forceExpire();
        } catch (Throwable th) {
            hw.c("HwGrsImpl", "GrsClient.forceExpire, exception: %s", th.getClass().getSimpleName());
        }
    }

    @Override // com.huawei.openalliance.ad.cs
    public void a(String str) {
        this.f18362a.setAppName(str);
    }

    @Override // com.huawei.openalliance.ad.cs
    public String a() {
        String strB = com.huawei.openalliance.ad.utils.da.a().b();
        String strC = com.huawei.openalliance.ad.utils.da.a().c();
        boolean zEqualsIgnoreCase = "CN".equalsIgnoreCase(strB);
        hw.a("HwGrsImpl", "init country code: %s ", strB);
        hw.a("HwGrsImpl", "media country code: %s ", strC);
        if (cc.b(this.f18363b) || !zEqualsIgnoreCase) {
            if (!TextUtils.isEmpty(strC)) {
                return strC;
            }
            if (TextUtils.isEmpty(strB) || CountryCodeBean.OVERSEAS.equalsIgnoreCase(strB)) {
                return new CountryCodeBean(this.f18363b).a();
            }
        }
        return strB;
    }

    public cn(Context context) {
        this.f18363b = context.getApplicationContext();
    }
}
