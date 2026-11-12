package com.huawei.openalliance.ad.beans.inner;

import android.content.Context;
import com.huawei.openalliance.ad.cc;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.utils.ab;
import com.huawei.openalliance.ad.utils.an;
import java.util.Locale;

/* JADX INFO: loaded from: classes41.dex */
public class HonorCountryCodeBean extends CountryCodeBean {
    private static final String TAG = "HonorCountryCodeBean";
    private static boolean isHonorGrsAvailable = an.d();

    @Override // com.huawei.openalliance.ad.beans.inner.CountryCodeBean
    protected void a(Context context, boolean z) {
        if (isHonorGrsAvailable && cc.b(context) && !ab.n(context)) {
            try {
                this.countryCode = new HonorGrsCountryCodeBean().a(context);
            } catch (Throwable th) {
                hw.c(TAG, "getIssueCountryCode via grs sdk: %s", th.getClass().getSimpleName());
                b(context, z);
            }
        } else {
            b(context, z);
        }
        this.countryCode = this.countryCode.toUpperCase(Locale.ENGLISH);
    }
}
