package com.service.mi.visa;

import android.os.Build;
import android.text.TextUtils;
import com.miui.tsmclient.net.TSMAuthContants;
import com.xiaomi.accountsdk.account.data.DevInfoKeys;
import com.xiaomi.fitness.yrn_config.YRNConstants;
import defpackage.fpe;
import defpackage.fuh;
import defpackage.j2m;
import defpackage.li1;
import defpackage.qvf;
import defpackage.w12;
import defpackage.z5i;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes6.dex */
public class VisaRequest {
    private static final String TAG = "VisaRequest";
    private String host;
    private Map<String, String> mHeaders;
    private Map<String, Object> mParams;
    private String path;

    public static final class WalletBuilder {
        private String host;
        private String path;
        private Map<String, Object> mParams = new HashMap();
        private Map<String, String> mHeaders = new HashMap();

        public WalletBuilder addParams(String str, Object obj) {
            this.mParams.put(str, obj);
            return this;
        }

        public VisaRequest create() {
            z5i.c(!TextUtils.isEmpty(this.host), "host cannot be null");
            z5i.c(!TextUtils.isEmpty(this.path), "path cannot be null");
            VisaRequest visaRequest = new VisaRequest();
            visaRequest.host = this.host;
            visaRequest.path = this.path;
            visaRequest.mParams = this.mParams;
            visaRequest.mHeaders = this.mHeaders;
            return visaRequest;
        }

        public WalletBuilder host(String str) {
            this.host = str;
            return this;
        }

        public WalletBuilder initBaseInfo(String str, String str2) throws ExecutionException, InterruptedException {
            z5i.b(str, "cplc cannot be null");
            z5i.b(str2, "seid cannot be null");
            qvf.b();
            this.mHeaders.put("authenticationType", String.valueOf(qvf.z ? 2 : 1));
            this.mHeaders.put("token", qvf.x);
            this.mHeaders.put("id", qvf.z ? qvf.f31886r : qvf.q);
            this.mParams.put("cplc", str);
            fpe.f("cplc:" + str);
            this.mParams.put(TSMAuthContants.PARAM_SEID, str2);
            String str3 = qvf.v;
            fpe.f("deviceAppId:" + str3);
            String strA = j2m.a(str2);
            fpe.f("paymentAppData:" + strA);
            String strA2 = w12.a(strA);
            fpe.f("paymentAppInstanceId:" + qvf.B + strA2);
            this.mParams.put("paymentAppInstanceId", qvf.B + strA2);
            this.mParams.put("deviceModel", qvf.u);
            this.mParams.put("deviceId", qvf.t);
            this.mParams.put(DevInfoKeys.OS_VERSION, Build.VERSION.RELEASE);
            this.mParams.put("appVersion", li1.a());
            this.mParams.put("packageName", str3);
            this.mParams.put("sdkVersion", 43);
            this.mParams.put("osType", YRNConstants.PLATFORM);
            this.mParams.put("userId", qvf.y);
            this.mParams.put(TSMAuthContants.PARAM_LANGUAGE, Locale.getDefault().getLanguage());
            this.mParams.put("requestId", fuh.a());
            this.mParams.put("country", qvf.A);
            this.mParams.put("deviceType", Integer.valueOf(qvf.w));
            return this;
        }

        public WalletBuilder path(String str) {
            this.path = str;
            return this;
        }
    }

    public void addParams(String str, String str2) {
        this.mParams.put(str, str2);
    }

    public Map<String, String> getHeaders() {
        return this.mHeaders;
    }

    public Map<String, Object> getParams() {
        return this.mParams;
    }

    public String getRequestFullUrl() {
        return this.host + this.path;
    }

    private VisaRequest() {
    }
}
