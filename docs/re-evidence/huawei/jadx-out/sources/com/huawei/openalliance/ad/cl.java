package com.huawei.openalliance.ad;

import android.content.Context;
import android.text.TextUtils;
import com.hihonor.common.grs.HihonorGrsBaseInfo;
import com.hihonor.common.grs.HihonorGrsClient;
import com.huawei.openalliance.ad.beans.inner.CountryCodeBean;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public class cl implements cs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f18359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HihonorGrsBaseInfo f18360b = new HihonorGrsBaseInfo();

    @Override // com.huawei.openalliance.ad.cs
    public void b() {
    }

    @Override // com.huawei.openalliance.ad.cs
    public Map<String, String> c(String str) {
        return new HihonorGrsClient(this.f18359a, this.f18360b).synGetGrsUrls(str);
    }

    @Override // com.huawei.openalliance.ad.cs
    public void b(String str) {
        this.f18360b.setSerCountry(str);
    }

    @Override // com.huawei.openalliance.ad.cs
    public void a(String str) {
        this.f18360b.setAppName(str);
    }

    @Override // com.huawei.openalliance.ad.cs
    public String a() {
        String strB = com.huawei.openalliance.ad.utils.da.a().b();
        boolean zEqualsIgnoreCase = "CN".equalsIgnoreCase(strB);
        hw.a("HwGrsImpl", "init country code: %s ", strB);
        return ((cc.b(this.f18359a) || !zEqualsIgnoreCase) && (TextUtils.isEmpty(strB) || CountryCodeBean.OVERSEAS.equalsIgnoreCase(strB))) ? new CountryCodeBean(this.f18359a).a() : strB;
    }

    public cl(Context context) {
        this.f18359a = context.getApplicationContext();
    }
}
