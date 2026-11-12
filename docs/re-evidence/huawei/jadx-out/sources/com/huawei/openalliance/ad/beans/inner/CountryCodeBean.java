package com.huawei.openalliance.ad.beans.inner;

import android.content.Context;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.huawei.openalliance.ad.cc;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.constant.CountryConfig;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.utils.ab;
import com.huawei.openalliance.ad.utils.an;
import com.huawei.openalliance.ad.utils.dk;
import java.util.Locale;

/* JADX INFO: loaded from: classes12.dex */
public class CountryCodeBean {
    public static final String COUNTRYCODE_CN = "CN";
    private static final int COUNTRYCODE_SIZE = 2;
    private static final String LOCALE_COUNTRYSYSTEMPROP = "ro.product.locale";
    private static final String LOCALE_INFO = "LOCALE_INFO";
    public static final String LOCALE_REGION_COUNTRYSYSTEMPROP = "ro.product.locale.region";
    public static final String OVERSEAS = "OVERSEAS";
    private static final String SIM_COUNTRY = "SIM_COUNTRY";
    private static final String SPECIAL_COUNTRYCODE_CN = "cn";
    private static final String SPECIAL_COUNTRYCODE_EU = "eu";
    private static final String SPECIAL_COUNTRYCODE_LA = "la";
    private static final String TAG = "CountryCodeBean";
    public static final String UNKNOWN = "UNKNOWN";
    public static final String VENDORCOUNTRY_SYSTEMPROP = "ro.hw.country";
    public static final String VENDORCOUNTRY_SYSTEMPROP_HN = "msc.sys.country";
    private static final String VENDOR_COUNTRY = "VENDOR_COUNTRY";
    public static final String VENDOR_SYSTEMPROP = "ro.hw.vendor";
    public static final String VENDOR_SYSTEMPROP_HN = "msc.sys.vendor";
    private static boolean isGrsAvailable = an.c();
    protected String countryCode;

    /* JADX WARN: Code duplicated, block: B:15:0x002d A[Catch: Exception -> 0x0057, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x0057, blocks: (B:4:0x0004, B:6:0x000a, B:8:0x0014, B:24:0x004d, B:10:0x001b, B:12:0x0021, B:15:0x002d, B:18:0x0039, B:21:0x0042, B:26:0x0051), top: B:32:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:17:0x0036  */
    /* JADX WARN: Code duplicated, block: B:18:0x0039 A[Catch: Exception -> 0x0057, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x0057, blocks: (B:4:0x0004, B:6:0x000a, B:8:0x0014, B:24:0x004d, B:10:0x001b, B:12:0x0021, B:15:0x002d, B:18:0x0039, B:21:0x0042, B:26:0x0051), top: B:32:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:20:0x003f  */
    /* JADX WARN: Code duplicated, block: B:21:0x0042 A[Catch: Exception -> 0x0057, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x0057, blocks: (B:4:0x0004, B:6:0x000a, B:8:0x0014, B:24:0x004d, B:10:0x001b, B:12:0x0021, B:15:0x002d, B:18:0x0039, B:21:0x0042, B:26:0x0051), top: B:32:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:23:0x004b  */
    /* JADX WARN: Code duplicated, block: B:26:0x0051 A[Catch: Exception -> 0x0057, TRY_LEAVE, TryCatch #0 {Exception -> 0x0057, blocks: (B:4:0x0004, B:6:0x000a, B:8:0x0014, B:24:0x004d, B:10:0x001b, B:12:0x0021, B:15:0x002d, B:18:0x0039, B:21:0x0042, B:26:0x0051), top: B:32:0x0004 }] */
    protected void b(Context context, boolean z) {
        String str;
        if (context == null) {
            throw new NullPointerException("context must be not null.Please provide app's Context");
        }
        try {
            if (cc.c(context) && cc.a(context).d()) {
                this.countryCode = "CN";
                str = "getCountryCode get country code from chinaROM";
            } else if (cc.b(context)) {
                c(context);
                if (b()) {
                    str = "get issue_country code from VENDOR_COUNTRY";
                } else {
                    a(context);
                    if (b()) {
                        str = "get issue_country code from SIM_COUNTRY";
                    } else if (ab.n(context)) {
                        str = "pad skip locale get issue_country code from grs ip";
                    } else {
                        b(context);
                        if (b()) {
                            hw.c(TAG, "fail to get grs countryCode");
                            return;
                        }
                        str = "get issue_country code from LOCALE_INFO";
                    }
                }
            } else {
                a(context);
                if (b()) {
                    str = "get issue_country code from SIM_COUNTRY";
                } else if (ab.n(context)) {
                    str = "pad skip locale get issue_country code from grs ip";
                } else {
                    b(context);
                    if (b()) {
                        hw.c(TAG, "fail to get grs countryCode");
                        return;
                    }
                    str = "get issue_country code from LOCALE_INFO";
                }
            }
            hw.b(TAG, str);
        } catch (Exception unused) {
            hw.c(TAG, "get CountryCode error");
        }
    }

    public String b(Context context) {
        try {
            if (Build.VERSION.SDK_INT >= 28) {
                d();
            } else {
                d(context);
            }
        } catch (Exception unused) {
            hw.c(TAG, "get getLocaleCountryCode error");
        }
        return this.countryCode;
    }

    protected void a(Context context, boolean z) {
        if (isGrsAvailable && cc.b(context) && !ab.n(context)) {
            try {
                this.countryCode = new GrsCountryCodeBean().a(context);
            } catch (Throwable th) {
                hw.c(TAG, "getIssueCountryCode via grs sdk: %s", th.getClass().getSimpleName());
                b(context, z);
            }
        } else {
            b(context, z);
        }
        this.countryCode = this.countryCode.toUpperCase(Locale.ENGLISH);
    }

    public String a(Context context) {
        c(context, false);
        return this.countryCode;
    }

    public String a() {
        return this.countryCode;
    }

    private void d(Context context) {
        int iLastIndexOf;
        try {
            this.countryCode = dk.a("ro.product.locale.region");
            hw.b(TAG, "countryCode by ro.product.locale.region is:" + this.countryCode);
            if (TextUtils.isEmpty(this.countryCode) || "UNKNOWN".equals(this.countryCode)) {
                String strA = dk.a("ro.product.locale");
                if (!TextUtils.isEmpty(strA) && (iLastIndexOf = strA.lastIndexOf(Constants.LINK)) != -1) {
                    this.countryCode = strA.substring(iLastIndexOf + 1);
                    hw.b(TAG, "countryCode by ro.product.locale is:" + this.countryCode);
                }
            }
            if (SPECIAL_COUNTRYCODE_CN.equalsIgnoreCase(this.countryCode)) {
                return;
            }
            this.countryCode = "UNKNOWN";
        } catch (Exception unused) {
            hw.c(TAG, "get getProductCountryCode error");
        }
    }

    private void d() {
        String strD = dk.d();
        this.countryCode = strD;
        if (TextUtils.isEmpty(strD)) {
            this.countryCode = "UNKNOWN";
        }
    }

    private void c(Context context, boolean z) {
        StringBuilder sb;
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getApplicationContext().getSystemService("phone");
            if (telephonyManager != null) {
                if (!z || telephonyManager.getPhoneType() == 2) {
                    this.countryCode = telephonyManager.getSimCountryIso();
                    sb = new StringBuilder("countryCode by SimCountryIso is: ");
                } else {
                    this.countryCode = telephonyManager.getNetworkCountryIso();
                    sb = new StringBuilder("countryCode by NetworkCountryIso is: ");
                }
                sb.append(this.countryCode);
                hw.b(TAG, sb.toString());
            }
            c();
        } catch (Exception unused) {
            hw.c(TAG, "get getSimCountryCode error");
        }
    }

    private void c(Context context) {
        try {
            String strA = dk.a(cc.e(context) ? VENDORCOUNTRY_SYSTEMPROP_HN : VENDORCOUNTRY_SYSTEMPROP);
            this.countryCode = strA;
            if (strA == null) {
                this.countryCode = "UNKNOWN";
            }
            if (!SPECIAL_COUNTRYCODE_EU.equalsIgnoreCase(this.countryCode) && !SPECIAL_COUNTRYCODE_LA.equalsIgnoreCase(this.countryCode) && CountryConfig.isValidCountryCode(this.countryCode)) {
                c();
                return;
            }
            this.countryCode = "UNKNOWN";
        } catch (Exception unused) {
            hw.c(TAG, "get getVendorCountryCode error");
        }
    }

    private void c() {
        String str = this.countryCode;
        if (str == null || str.length() != 2) {
            this.countryCode = "UNKNOWN";
        }
    }

    private boolean b() {
        return !"UNKNOWN".equals(this.countryCode);
    }

    public CountryCodeBean(Context context, boolean z) {
        this.countryCode = "UNKNOWN";
        if (context == null) {
            return;
        }
        a(context.getApplicationContext(), z);
    }

    public CountryCodeBean(Context context) {
        this(context, false);
    }
}
