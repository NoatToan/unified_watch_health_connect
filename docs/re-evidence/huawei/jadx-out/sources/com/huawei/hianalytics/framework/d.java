package com.huawei.hianalytics.framework;

import android.text.TextUtils;
import com.huawei.hianalytics.core.log.HiLog;
import com.huawei.hianalytics.core.storage.IStorageHandler;
import com.huawei.hianalytics.core.transport.TransportHandlerFactory;
import com.huawei.hianalytics.framework.config.ICallback;
import com.huawei.hianalytics.framework.config.ICollectorConfig;
import com.huawei.hianalytics.framework.config.IMandatoryParameters;
import com.huawei.secure.android.common.encrypt.utils.EncryptUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f11505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11506b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f11507c;
    public final String d;
    public final ArrayList e;
    public ICallback f;
    public boolean g;

    public d(byte[] bArr, String str, String str2, String str3, ArrayList arrayList) {
        this.f11506b = str;
        this.d = str2;
        this.f11505a = bArr;
        this.f11507c = str3;
        this.e = arrayList;
    }

    public final String a(IMandatoryParameters iMandatoryParameters) {
        String debugModeUrl = iMandatoryParameters.getDebugModeUrl();
        if (TextUtils.isEmpty(debugModeUrl) || ".none.".equals(debugModeUrl)) {
            HiLog.si("DebugReportTask", "debug mode url is empty");
            return debugModeUrl;
        }
        String str = this.d;
        str.getClass();
        if (str.equals("oper")) {
            return "{url}/common/hmshioperqrt".replace("{url}", debugModeUrl);
        }
        return !str.equals("maint") ? "{url}/common/hmshioperqrt".replace("{url}", debugModeUrl) : "{url}/common/hmshimaintqrt".replace("{url}", debugModeUrl);
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte[] bArr = this.f11505a;
        if (bArr.length == 0) {
            HiLog.sw("DebugReportTask", "body is empty, tag: " + this.f11506b + ", type: " + this.d);
            return;
        }
        String str = this.f11507c;
        b bVar = b.e;
        IMandatoryParameters iMandatoryParameters = bVar.f11498a;
        if (TextUtils.isEmpty(a(iMandatoryParameters)) || ".none.".equals(a(iMandatoryParameters))) {
            HiLog.sw("DebugReportTask", "no address, tag: " + this.f11506b + ", type: " + this.d);
            return;
        }
        String strA = a(iMandatoryParameters);
        ICollectorConfig iCollectorConfig = (ICollectorConfig) bVar.f11499b.get(this.f11506b);
        ICollectorConfig iCollectorConfig2 = (ICollectorConfig) bVar.f11499b.get(this.f11506b);
        String appVer = bVar.f11498a.getAppVer();
        String model = bVar.f11498a.getModel();
        HashMap map = new HashMap();
        map.put("x-hasdk-debug", "true");
        map.put("App-Id", iCollectorConfig2.getAppId());
        map.put("App-Ver", appVer);
        map.put("Sdk-Name", "hianalytics");
        map.put("Sdk-Ver", "3.2.14.504");
        map.put("Device-Type", model);
        map.put("servicetag", this.f11506b);
        HiLog.i("DebugReportTask", "debug send event, reqId : " + str + ", tag: " + this.f11506b + ", type: " + this.d);
        map.put("Request-Id", str);
        Map<String, String> httpHeader = iCollectorConfig.getHttpHeader(this.d);
        if (httpHeader != null) {
            map.putAll(httpHeader);
        }
        ICollectorConfig iCollectorConfig3 = (ICollectorConfig) bVar.f11499b.get(this.f11506b);
        int httpCode = TransportHandlerFactory.create(strA, map, bArr, iCollectorConfig3 == null ? 1 : iCollectorConfig3.getMetricPolicy(this.d)).execute().getHttpCode();
        try {
            if (httpCode == 200) {
                if (!this.g) {
                    IStorageHandler iStorageHandlerC = j.c(this.f11506b);
                    if (iStorageHandlerC != null && this.e.size() > 0) {
                        iStorageHandlerC.deleteEvents(this.e);
                        IMandatoryParameters iMandatoryParameters2 = bVar.f11498a;
                        if (iMandatoryParameters2.isFlashKey() && iStorageHandlerC.readEventsAllSize() == 0) {
                            iMandatoryParameters2.refreshKey(EncryptUtil.generateSecureRandomStr(16), 1);
                            iStorageHandlerC.deleteCommonHeaderExAll();
                        }
                    }
                    g gVarA = j.a(this.f11506b);
                    String str2 = this.d;
                    Integer num = (Integer) gVarA.d.get(str2);
                    if (num != null && num.intValue() != 0) {
                        gVarA.f11520c.put(str2, 30000L);
                        gVarA.d.put(str2, 0);
                    }
                }
            } else if (!this.g) {
                j.a(this.f11506b).a(this.d);
            }
            HiLog.si("DebugReportTask", "send debug event tag: " + this.d + ", tag: " + this.f11506b + ", resultCode: " + httpCode + ", reqID: " + str);
        } catch (Throwable th) {
            HiLog.si("DebugReportTask", "send debug event tag: " + this.d + ", tag: " + this.f11506b + ", resultCode: " + httpCode + ", reqID: " + str);
            throw th;
        }
    }
}
