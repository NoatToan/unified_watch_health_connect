package com.huawei.agconnect.common.server;

import com.huawei.agconnect.datastore.annotation.DefaultCrypto;
import com.huawei.agconnect.datastore.core.CryptoUtil;
import com.huawei.agconnect.datastore.core.SharedPrefUtil;

/* JADX INFO: loaded from: classes3.dex */
public class SiteUrlPreference {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static SiteUrlPreference f4914c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SharedPrefUtil f4915a = SharedPrefUtil.getInstance();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private CryptoUtil f4916b;

    public void a() {
    }

    public void a(SiteUrl siteUrl) {
    }

    public void b(SiteUrl siteUrl) {
    }

    public void f(SiteUrl siteUrl, String str) {
        if (siteUrl == null || str == null) {
            return;
        }
        this.f4915a.put("agc_site", "validTime_" + str, Long.class, Long.valueOf(siteUrl.validTime), DefaultCrypto.class);
    }

    public void e(SiteUrl siteUrl, String str) {
        if (siteUrl == null || str == null) {
            return;
        }
        this.f4915a.put("agc_site", "main_" + str, String.class, siteUrl.mainUrl, DefaultCrypto.class);
    }

    public void d(SiteUrl siteUrl, String str) {
        if (siteUrl == null || str == null) {
            return;
        }
        this.f4915a.put("agc_site", "backup_" + str, String.class, siteUrl.backUrl, DefaultCrypto.class);
    }

    public void c(String str) {
        this.f4915a.remove("agc_site", "validTime_" + str);
    }

    public void c(SiteUrl siteUrl, String str) {
        if (siteUrl == null || str == null) {
            return;
        }
        siteUrl.validTime = ((Long) this.f4915a.get("agc_site", "validTime_" + str, Long.class, null, DefaultCrypto.class)).longValue();
    }

    public void b(String str) {
        this.f4915a.remove("agc_site", "main_" + str);
    }

    public void b(SiteUrl siteUrl, String str) {
        if (siteUrl == null || str == null) {
            return;
        }
        siteUrl.mainUrl = (String) this.f4915a.get("agc_site", "main_" + str, String.class, null, DefaultCrypto.class);
    }

    public void a(String str) {
        this.f4915a.remove("agc_site", "backup_" + str);
    }

    public void a(SiteUrl siteUrl, String str) {
        if (siteUrl == null || str == null) {
            return;
        }
        siteUrl.backUrl = (String) this.f4915a.get("agc_site", "backup_" + str, String.class, null, DefaultCrypto.class);
    }

    public static SiteUrlPreference b() {
        SiteUrlPreference siteUrlPreference;
        synchronized (SiteUrlPreference.class) {
            if (f4914c == null) {
                f4914c = new SiteUrlPreference();
            }
            siteUrlPreference = f4914c;
        }
        return siteUrlPreference;
    }

    private SiteUrlPreference() {
    }
}
