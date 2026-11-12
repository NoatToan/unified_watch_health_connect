package com.huawei.openalliance.ad;

import android.content.Context;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.View;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.utils.Cdo;
import com.huawei.wear.oversea.util.SystemPropertyValues;
import java.util.Locale;

/* JADX INFO: loaded from: classes12.dex */
public abstract class cg extends cf {
    protected abstract String s();

    @Override // com.huawei.openalliance.ad.cf, com.huawei.openalliance.ad.cr
    public String i() {
        String strH = this.f18347b.h();
        if (TextUtils.isEmpty(strH)) {
            strH = u();
        } else if (Cdo.a("getMagicuiVersionName")) {
            com.huawei.openalliance.ad.utils.o.f(new Runnable() { // from class: com.huawei.openalliance.ad.cg.2
                @Override // java.lang.Runnable
                public void run() {
                    cg.this.u();
                }
            });
        }
        if (TextUtils.equals(Constants.NOT_FOUND, strH)) {
            return null;
        }
        return strH;
    }

    @Override // com.huawei.openalliance.ad.cf, com.huawei.openalliance.ad.cr
    public boolean g() {
        return !TextUtils.isEmpty(f());
    }

    @Override // com.huawei.openalliance.ad.cf, com.huawei.openalliance.ad.cr
    public String f() {
        String strG = this.f18347b.g();
        if (TextUtils.isEmpty(strG)) {
            strG = v();
        } else if (Cdo.a("getHosVersionName")) {
            com.huawei.openalliance.ad.utils.o.f(new Runnable() { // from class: com.huawei.openalliance.ad.cg.3
                @Override // java.lang.Runnable
                public void run() {
                    cg.this.v();
                }
            });
        }
        if (TextUtils.equals(Constants.NOT_FOUND, strG)) {
            return null;
        }
        return strG;
    }

    @Override // com.huawei.openalliance.ad.cf, com.huawei.openalliance.ad.cr
    public String e() {
        String strF = this.f18347b.f();
        if (TextUtils.isEmpty(strF)) {
            strF = t();
        } else if (Cdo.a("getEmuiVersionName")) {
            com.huawei.openalliance.ad.utils.o.f(new Runnable() { // from class: com.huawei.openalliance.ad.cg.1
                @Override // java.lang.Runnable
                public void run() {
                    cg.this.t();
                }
            });
        }
        if (TextUtils.equals(Constants.NOT_FOUND, strF)) {
            return null;
        }
        return strF;
    }

    @Override // com.huawei.openalliance.ad.cf, com.huawei.openalliance.ad.cr
    public boolean d() {
        String strA = com.huawei.openalliance.ad.utils.dk.a("ro.product.locale.region");
        if (!TextUtils.isEmpty(strA)) {
            return "cn".equalsIgnoreCase(strA);
        }
        String strA2 = com.huawei.openalliance.ad.utils.dk.a(SystemPropertyValues.PROP_LOCALE_KEY);
        if (!TextUtils.isEmpty(strA2)) {
            return strA2.toLowerCase(Locale.ENGLISH).contains("cn");
        }
        String strD = com.huawei.openalliance.ad.utils.dk.d();
        if (TextUtils.isEmpty(strD)) {
            return false;
        }
        return "cn".equalsIgnoreCase(strD);
    }

    @Override // com.huawei.openalliance.ad.cf, com.huawei.openalliance.ad.cr
    public boolean a(Context context) {
        try {
            int i = Settings.Secure.getInt(context.getContentResolver(), "display_notch_status");
            hw.a("BaseHwnDeviceImpl", "isNotchEnable, displayNotch: %s", Integer.valueOf(i));
            return i == 0;
        } catch (Throwable th) {
            hw.b("BaseHwnDeviceImpl", "isNotchEnable err:" + th.getClass().getSimpleName());
            return a((View) null) > 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String v() {
        String strB = b(s());
        this.f18347b.e(strB);
        return strB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String u() {
        String strB = b("ro.build.version.magic");
        this.f18347b.f(strB);
        return strB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String t() {
        String strB = b("ro.build.version.emui");
        this.f18347b.d(strB);
        return strB;
    }

    private String b(String str) {
        String strA = com.huawei.openalliance.ad.utils.dk.a(str);
        return strA == null ? Constants.NOT_FOUND : strA;
    }

    protected cg(Context context) {
        super(context);
    }
}
