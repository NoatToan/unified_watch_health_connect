package com.huawei.openalliance.ad;

import android.content.Context;
import android.view.View;
import com.hihonor.android.util.HwNotchSizeUtil;
import com.huawei.openalliance.ad.beans.inner.CountryCodeBean;

/* JADX INFO: loaded from: classes12.dex */
public class cj extends cg {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static cr f18356c;
    private static final byte[] d = new byte[0];

    @Override // com.huawei.openalliance.ad.cg
    protected String s() {
        return "msc.build.platform.version";
    }

    @Override // com.huawei.openalliance.ad.cf, com.huawei.openalliance.ad.cr
    public boolean r() {
        return "true".equalsIgnoreCase(com.huawei.openalliance.ad.utils.dk.a("msc.pure_mode.enable"));
    }

    @Override // com.huawei.openalliance.ad.cf, com.huawei.openalliance.ad.cr
    public String q() {
        return com.huawei.openalliance.ad.utils.dk.a(CountryCodeBean.VENDORCOUNTRY_SYSTEMPROP_HN);
    }

    @Override // com.huawei.openalliance.ad.cf, com.huawei.openalliance.ad.cr
    public String p() {
        return com.huawei.openalliance.ad.utils.dk.a(CountryCodeBean.VENDOR_SYSTEMPROP_HN);
    }

    @Override // com.huawei.openalliance.ad.cf, com.huawei.openalliance.ad.cr
    public Integer h() {
        return Integer.valueOf(com.huawei.openalliance.ad.utils.aw.a.f20437b);
    }

    @Override // com.huawei.openalliance.ad.cf, com.huawei.openalliance.ad.cr
    public boolean a() {
        return "156".equals(com.huawei.openalliance.ad.utils.dk.a("msc.config.optb"));
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
            hw.c("HnDeviceImpl", sb.toString());
            return 0;
        } catch (Throwable th) {
            e = th;
            sb = new StringBuilder("getNotchHeight error:");
            sb.append(e.getClass().getSimpleName());
            hw.c("HnDeviceImpl", sb.toString());
            return 0;
        }
    }

    private static cr c(Context context) {
        cr crVar;
        synchronized (d) {
            if (f18356c == null) {
                f18356c = new cj(context);
            }
            crVar = f18356c;
        }
        return crVar;
    }

    public static cr b(Context context) {
        return c(context);
    }

    private cj(Context context) {
        super(context);
    }
}
