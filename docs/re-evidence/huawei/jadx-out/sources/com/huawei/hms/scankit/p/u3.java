package com.huawei.hms.scankit.p;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.util.SparseArray;
import com.huawei.hms.framework.common.SystemPropUtils;
import com.huawei.hms.framework.common.hianalytics.WiseOpenHianalyticsData;
import com.huawei.hms.ml.scan.HmsScan;
import com.huawei.hms.ml.scan.HmsScanBase;
import com.huawei.openalliance.ad.beans.inner.CountryCodeBean;
import com.huawei.phoneservice.faq.base.constants.FaqConstants;
import com.huawei.watchface.videoedit.param.CanvasConfig;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes10.dex */
abstract class u3 {
    static String d = "FORMAT_UNKNOWN";
    static String e = "OTHER";
    static SparseArray f = new a();
    static SparseArray g = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Context f16350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    LinkedHashMap f16351b = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    volatile long f16352c;

    private void b(Bundle bundle) {
        try {
            String packageName = this.f16350a.getPackageName();
            this.f16351b.put("package", packageName);
            if (bundle == null || !bundle.containsKey("appid")) {
                this.f16351b.put("appid", packageName);
            } else {
                this.f16351b.put("appid", bundle.getString("appid"));
            }
            PackageManager packageManager = this.f16350a.getPackageManager();
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(packageName, 128);
            this.f16351b.put("appName", applicationInfo.loadLabel(packageManager).toString());
            this.f16351b.put("version", a(applicationInfo.metaData));
            String strD = d();
            this.f16351b.put("hmscoreVersion", strD);
            this.f16351b.put("isHMSCore", "unknown".equals(strD) ? "0" : "1");
        } catch (PackageManager.NameNotFoundException unused) {
            o4.b("HaLog", "PackageManager.NameNotFoundException");
        } catch (Exception unused2) {
            o4.b("HaLog", "initValue Exception");
        }
        try {
            this.f16351b.put("sdkName", "scankit");
            this.f16351b.put("algopt", b());
            this.f16351b.put("isFullSdk", "FULLSDK");
            this.f16351b.put(WiseOpenHianalyticsData.UNION_APP_VERSION, c());
            if (b4.f15996a) {
                this.f16351b.put("apkVersion", b4.f15997b);
            } else {
                this.f16351b.put("apkVersion", "unknown");
            }
            this.f16351b.put("service", "com.huawei.hms.scankit");
            this.f16351b.put("operator", b4.b(this.f16350a));
            this.f16351b.put(com.huawei.hms.network.embedded.r3.y, b4.a(this.f16350a));
            this.f16351b.put("countryCode", b4.a(this.f16350a, false));
            this.f16351b.put("deviceType", b4.c());
            this.f16351b.put(FaqConstants.FAQ_EMUIVERSION, b4.d());
            this.f16351b.put("androidVersion", b4.a());
            this.f16351b.put("deviceCategory", b4.b());
        } catch (RuntimeException unused3) {
            o4.b("HaLog", "initValue RuntimeException");
        } catch (Exception unused4) {
            o4.b("HaLog", "initValue Exception");
        }
    }

    private boolean e() {
        try {
            String property = SystemPropUtils.getProperty("get", CountryCodeBean.VENDORCOUNTRY_SYSTEMPROP, "android.os.SystemProperties", "UNKNOWN");
            TelephonyManager telephonyManager = (TelephonyManager) this.f16350a.getApplicationContext().getSystemService("phone");
            return "CN".equalsIgnoreCase(property) && "CN".equalsIgnoreCase(telephonyManager.getNetworkCountryIso()) && "CN".equalsIgnoreCase(telephonyManager.getSimCountryIso());
        } catch (RuntimeException | Exception unused) {
            return false;
        }
    }

    private boolean f() {
        return true;
    }

    void g() {
        String str;
        o4.d("HaLog", "update HiAnalyticsLogUtils.apk_mode " + b4.f15996a + " HiAnalyticsLogUtils.apkVersion " + b4.f15997b);
        if (!b4.f15996a || (str = b4.f15997b) == null) {
            return;
        }
        this.f16351b.put("apkVersion", str);
    }

    class a extends SparseArray {
        a() {
            put(HmsScanBase.AZTEC_SCAN_TYPE, "AZTEC");
            put(HmsScanBase.CODABAR_SCAN_TYPE, "CODABAR");
            put(HmsScanBase.CODE39_SCAN_TYPE, "CODE39");
            put(HmsScanBase.CODE93_SCAN_TYPE, "CODE93");
            put(HmsScanBase.CODE128_SCAN_TYPE, "CODE128");
            put(HmsScanBase.DATAMATRIX_SCAN_TYPE, "DATAMATRIX");
            put(HmsScanBase.EAN8_SCAN_TYPE, "EAN8");
            put(HmsScanBase.EAN13_SCAN_TYPE, "EAN13");
            put(HmsScanBase.ITF14_SCAN_TYPE, "ITF14");
            put(HmsScanBase.PDF417_SCAN_TYPE, "PDF417");
            put(HmsScanBase.QRCODE_SCAN_TYPE, "QRCODE");
            put(HmsScanBase.UPCCODE_A_SCAN_TYPE, "UPCCODE_A");
            put(HmsScanBase.UPCCODE_E_SCAN_TYPE, "UPCCODE_E");
            put(HmsScanBase.FORMAT_UNKNOWN, u3.d);
        }
    }

    class b extends SparseArray {
        b() {
            put(HmsScan.ARTICLE_NUMBER_FORM, "ARTICLE_NUMBER");
            put(HmsScan.EMAIL_CONTENT_FORM, "EMAIL_CONTENT");
            put(HmsScan.TEL_PHONE_NUMBER_FORM, "TEL_PHONE_NUMBER");
            put(HmsScan.PURE_TEXT_FORM, "PURE_TEXT");
            put(HmsScan.SMS_FORM, "SMS");
            put(HmsScan.URL_FORM, "URL");
            put(HmsScan.WIFI_CONNECT_INFO_FORM, "WIFI_CONNECT_INFO");
            put(HmsScan.EVENT_INFO_FORM, "EVENT_INFO");
            put(HmsScan.CONTACT_DETAIL_FORM, "CONTACT_DETAIL");
            put(HmsScan.DRIVER_INFO_FORM, "DRIVER_INFO");
            put(HmsScan.LOCATION_COORDINATE_FORM, "LOCATION_COORDINATE");
            put(HmsScan.ISBN_NUMBER_FORM, "ISBN_NUMBER");
            put(-1, u3.e);
        }
    }

    u3(Bundle bundle, Context context) {
        this.f16350a = context;
        b(bundle);
    }

    boolean a() {
        if (w7.c(this.f16350a)) {
            Log.i("HaLog", "allowLog: forbidLog ");
            return false;
        }
        Log.i("HaLog", "allowLog: allowLog ");
        try {
            return f() || e() || Settings.Secure.getInt(this.f16350a.getContentResolver(), "hw_app_analytics_state", 0) == 1;
        } catch (RuntimeException | Exception unused) {
            return false;
        }
    }

    private String b() {
        return CanvasConfig.FULL_CONFIG;
    }

    static String b(int i) {
        return (String) g.get(i, e);
    }

    private String d() {
        try {
            return this.f16350a.getPackageManager().getPackageInfo("com.huawei.hwid", 0).versionName;
        } catch (PackageManager.NameNotFoundException | Exception unused) {
            return "unknown";
        }
    }

    private String c() {
        try {
            return this.f16350a.getPackageManager().getPackageInfo(this.f16350a.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException | Exception unused) {
            return "unknown";
        }
    }

    private String a(Bundle bundle) {
        String[] strArr = {"huawei_module_scankit_sdk_version", "com.huawei.hms.client.service.name:scan", "com.huawei.hms.client.service.name:scanplus", "com.huawei.hms.client.service.name:scankit"};
        if (bundle != null) {
            for (int i = 0; i < 4; i++) {
                String str = strArr[i];
                if (bundle.getString(str) != null) {
                    return bundle.getString(str);
                }
            }
            return "scankit:1.0.2.300";
        }
        return "scankit:1.0.2.300";
    }

    static String a(int i) {
        return (String) f.get(i, d);
    }
}
