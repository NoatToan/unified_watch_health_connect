package com.huawei.hms.mlsdk.asr.o;

import android.content.Context;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.hms.mlsdk.asr.engine.utils.SmartLogger;
import com.huawei.openalliance.ad.beans.inner.CountryCodeBean;
import java.util.Locale;

/* JADX INFO: loaded from: classes10.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f14422a;

    public l(Context context) {
        this.f14422a = "UNKNOWN";
        b(context);
        this.f14422a = this.f14422a.toUpperCase(Locale.ENGLISH);
    }

    private void b(Context context) {
        if (context == null) {
            throw new NullPointerException("context must be not null.Please provide app's Context");
        }
        try {
            c();
            if (!"UNKNOWN".equals(this.f14422a)) {
                SmartLogger.d(CmcdData.Factory.STREAM_TYPE_LIVE, "getCountryCode get country code from {%s}", GrsBaseInfo.CountryCodeSource.VENDOR_COUNTRY);
                return;
            }
            a(context);
            if (!"UNKNOWN".equals(this.f14422a)) {
                SmartLogger.d(CmcdData.Factory.STREAM_TYPE_LIVE, "getCountryCode get country code from {%s}", GrsBaseInfo.CountryCodeSource.SIM_COUNTRY);
                return;
            }
            b();
            if ("UNKNOWN".equals(this.f14422a)) {
                return;
            }
            SmartLogger.d(CmcdData.Factory.STREAM_TYPE_LIVE, "getCountryCode get country code from {%s}", GrsBaseInfo.CountryCodeSource.LOCALE_INFO);
        } catch (Exception unused) {
            SmartLogger.w(CmcdData.Factory.STREAM_TYPE_LIVE, "get CountryCode error");
        }
    }

    private void c() {
        if (Build.BRAND.equals("HONOR")) {
            this.f14422a = a(CountryCodeBean.VENDORCOUNTRY_SYSTEMPROP_HN);
        } else {
            this.f14422a = a(CountryCodeBean.VENDORCOUNTRY_SYSTEMPROP);
        }
        SmartLogger.e(CmcdData.Factory.STREAM_TYPE_LIVE, "getVendorCountry=" + this.f14422a);
        if ("eu".equalsIgnoreCase(this.f14422a) || "la".equalsIgnoreCase(this.f14422a)) {
            SmartLogger.e(CmcdData.Factory.STREAM_TYPE_LIVE, "getVendorCountry equals eu or la ,not reliable");
            this.f14422a = "UNKNOWN";
            return;
        }
        String str = this.f14422a;
        if (str == null || str.length() != 2) {
            this.f14422a = "UNKNOWN";
        }
    }

    private void b() {
        this.f14422a = a("ro.product.locale.region");
        SmartLogger.e(CmcdData.Factory.STREAM_TYPE_LIVE, "getLocaleCountryCode=" + this.f14422a);
        if ("cn".equalsIgnoreCase(this.f14422a)) {
            return;
        }
        SmartLogger.e(CmcdData.Factory.STREAM_TYPE_LIVE, "getLocaleCountryCode from system language is not reliable.");
        this.f14422a = "UNKNOWN";
    }

    private static String a(String str) {
        if (!TextUtils.isEmpty("get") && !TextUtils.isEmpty(str) && !TextUtils.isEmpty("android.os.SystemProperties")) {
            try {
                Class<?> cls = Class.forName("android.os.SystemProperties");
                return (String) cls.getMethod("get", String.class, String.class).invoke(cls, str, "UNKNOWN");
            } catch (Exception e) {
                SmartLogger.e(CmcdData.Factory.STREAM_TYPE_LIVE, "getProperty catch exception: ", e);
                return "UNKNOWN";
            }
        }
        SmartLogger.w(CmcdData.Factory.STREAM_TYPE_LIVE, "reflect class for method has exception.");
        return "UNKNOWN";
    }

    public final String a() {
        return this.f14422a;
    }

    private void a(Context context) {
        TelephonyManager telephonyManager = (TelephonyManager) context.getApplicationContext().getSystemService("phone");
        if (telephonyManager != null) {
            this.f14422a = telephonyManager.getSimCountryIso();
            SmartLogger.e(CmcdData.Factory.STREAM_TYPE_LIVE, "getSimCountryCode by not enableNetwork, countryCode=" + this.f14422a);
        }
        String str = this.f14422a;
        if (str == null || str.length() != 2) {
            this.f14422a = "UNKNOWN";
        }
    }
}
