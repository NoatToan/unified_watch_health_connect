package com.huawei.openalliance.ad;

import android.content.Context;
import com.huawei.openalliance.ad.beans.inner.CountryCodeBean;

/* JADX INFO: loaded from: classes12.dex */
public class ci extends cf {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static cr f18355c;
    private static final byte[] d = new byte[0];
    private CountryCodeBean e;

    @Override // com.huawei.openalliance.ad.cf, com.huawei.openalliance.ad.cr
    public boolean l() {
        return false;
    }

    @Override // com.huawei.openalliance.ad.cf, com.huawei.openalliance.ad.cr
    public boolean d() {
        return a();
    }

    @Override // com.huawei.openalliance.ad.cf, com.huawei.openalliance.ad.cr
    public boolean a() {
        return "CN".equalsIgnoreCase(this.e.a());
    }

    private static cr c(Context context) {
        cr crVar;
        synchronized (d) {
            if (f18355c == null) {
                f18355c = new ci(context);
            }
            crVar = f18355c;
        }
        return crVar;
    }

    public static cr b(Context context) {
        return c(context);
    }

    protected ci(Context context) {
        super(context);
        this.e = new CountryCodeBean(context);
    }
}
