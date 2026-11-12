package com.huawei.openalliance.ad;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.huawei.android.util.HwNotchSizeUtil;
import com.huawei.openalliance.ad.beans.inner.CountryCodeBean;

/* JADX INFO: loaded from: classes12.dex */
public class cm extends cg {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static cr f18361c;
    private static final byte[] d = new byte[0];

    @Override // com.huawei.openalliance.ad.cg
    protected String s() {
        return "hw_sc.build.platform.version";
    }

    @Override // com.huawei.openalliance.ad.cf, com.huawei.openalliance.ad.cr
    public boolean r() {
        return "true".equalsIgnoreCase(com.huawei.openalliance.ad.utils.dk.a("hw_mc.pure_mode.enable"));
    }

    @Override // com.huawei.openalliance.ad.cf, com.huawei.openalliance.ad.cr
    public String q() {
        return com.huawei.openalliance.ad.utils.dk.a(CountryCodeBean.VENDORCOUNTRY_SYSTEMPROP);
    }

    @Override // com.huawei.openalliance.ad.cf, com.huawei.openalliance.ad.cr
    public String p() {
        return com.huawei.openalliance.ad.utils.dk.a(CountryCodeBean.VENDOR_SYSTEMPROP);
    }

    @Override // com.huawei.openalliance.ad.cf, com.huawei.openalliance.ad.cr
    public boolean m() {
        String strCc = fp.b(this.f18346a).cc();
        if (TextUtils.isEmpty(strCc)) {
            return false;
        }
        hw.a("HwDeviceImpl", "device in test mode, countryCode:%s", strCc);
        return true;
    }

    @Override // com.huawei.openalliance.ad.cf, com.huawei.openalliance.ad.cr
    public boolean l() {
        return com.huawei.openalliance.ad.utils.ab.e(this.f18346a);
    }

    @Override // com.huawei.openalliance.ad.cf, com.huawei.openalliance.ad.cr
    public Integer h() {
        return Integer.valueOf(com.huawei.openalliance.ad.utils.aw.a.f20436a);
    }

    @Override // com.huawei.openalliance.ad.cf, com.huawei.openalliance.ad.cr
    public boolean a() {
        return "156".equals(com.huawei.openalliance.ad.utils.dk.a("ro.config.hw_optb"));
    }

    @Override // com.huawei.openalliance.ad.cf, com.huawei.openalliance.ad.cr
    public int a(View view) {
        StringBuilder sb;
        try {
            if (!HwNotchSizeUtil.hasNotchInScreen()) {
                return 0;
            }
            int[] notchSize = HwNotchSizeUtil.getNotchSize();
            if (notchSize.length >= 2) {
                return notchSize[1];
            }
            return 0;
        } catch (Exception e) {
            e = e;
            sb = new StringBuilder("getNotchHeight error:");
            sb.append(e.getClass().getSimpleName());
            hw.c("HwDeviceImpl", sb.toString());
            return 0;
        } catch (Throwable th) {
            e = th;
            sb = new StringBuilder("getNotchHeight error:");
            sb.append(e.getClass().getSimpleName());
            hw.c("HwDeviceImpl", sb.toString());
            return 0;
        }
    }

    private static cr c(Context context) {
        cr crVar;
        synchronized (d) {
            if (f18361c == null) {
                f18361c = new cm(context);
            }
            crVar = f18361c;
        }
        return crVar;
    }

    public static cr b(Context context) {
        return c(context);
    }

    private cm(Context context) {
        super(context);
    }
}
