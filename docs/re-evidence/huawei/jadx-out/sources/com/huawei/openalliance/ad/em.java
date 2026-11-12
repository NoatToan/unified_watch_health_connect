package com.huawei.openalliance.ad;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.constant.UrlConstant;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public class em {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static em f18698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final byte[] f18699b = new byte[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<String, String> f18700c = new HashMap();
    private Map<String, String> d = new HashMap();
    private Context e;

    public String b(String str) {
        return TextUtils.isEmpty(this.d.get(str)) ? "" : this.d.get(str);
    }

    public String a(String str) {
        return this.f18700c.get(str) + com.huawei.openalliance.ad.utils.dg.a(this.e);
    }

    private void b() {
        this.d.put("adxServer", Constants.ACD_REQ_URI);
        this.d.put("analyticsServer", Constants.ANALYSIS_CONTENT_SERVER_REQ_URI);
        this.d.put("eventServer", Constants.CONTENT_SERVER_REQ_URI);
        this.d.put("configServer", Constants.SDK_SERVER_REQ_URI);
        this.d.put("permissionServer", Constants.PERMISSION_SERVER_REQ_URI);
        this.d.put("appDataServer", Constants.SDK_APP_DATA_REPORT_SERVER_URI);
        this.d.put("consentConfigServer", Constants.KIT_CONSENT_CONFIG_URI);
        this.d.put("appInsListConfigServer", Constants.APP_INS_LIST_CONFIG_SERVER_URI);
        this.d.put(UrlConstant.BASE_COMPLAIN_H5_URL, "?lang=");
    }

    private void a() {
        this.f18700c.put("adxServer", UrlConstant.BASE_ADX_SERVER);
        this.f18700c.put("analyticsServer", UrlConstant.BASE_EVENT_SERVER);
        this.f18700c.put("eventServer", UrlConstant.BASE_EVENT_SERVER);
        this.f18700c.put("configServer", UrlConstant.BASE_SDK_SERVER);
        this.f18700c.put("permissionServer", UrlConstant.BASE_ADX_SERVER);
        this.f18700c.put("appDataServer", UrlConstant.BASE_EVENT_SERVER);
        this.f18700c.put("consentConfigServer", UrlConstant.BASE_SDK_SERVER);
        this.f18700c.put("appInsListConfigServer", UrlConstant.BASE_SDK_SERVER);
        this.f18700c.put(UrlConstant.BASE_COMPLAIN_H5_URL, "complainH5ServerBaseUrl");
    }

    public static em a(Context context) {
        em emVar;
        synchronized (f18699b) {
            if (f18698a == null) {
                f18698a = new em(context);
            }
            emVar = f18698a;
        }
        return emVar;
    }

    private em(Context context) {
        this.e = context.getApplicationContext();
        a();
        b();
    }
}
