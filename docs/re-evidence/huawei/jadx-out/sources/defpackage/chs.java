package defpackage;

import com.google.gson.Gson;
import com.huawei.codevalueplatform.coderule.api.CodeValuePlatformApi;
import com.huawei.codevalueplatform.coderule.bean.request.DeviceInfo;
import com.huawei.codevalueplatform.coderule.bean.request.QueryCacheReq;
import com.huawei.codevalueplatform.coderule.bean.response.CodeRulesResponse;
import com.huawei.hms.network.base.common.MediaType;
import com.huawei.hms.network.base.common.RequestBodyProviders;
import com.huawei.hms.network.httpclient.RequestBody;
import com.huawei.hms.network.httpclient.Submit;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class chs {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static CodeValuePlatformApi f1614b;
    private String e = "";

    public void d(String str) {
        this.e = str;
    }

    public Submit<CodeRulesResponse> b(int i) {
        cib.b("CodeRulesApiWrapper", "queryCloudCodeRulesApi start request hwServer");
        RequestBody requestBodyD = d(i);
        CodeValuePlatformApi codeValuePlatformApi = f1614b;
        if (codeValuePlatformApi != null) {
            return codeValuePlatformApi.queryCodeRulesApi(c(), requestBodyD);
        }
        CodeValuePlatformApi codeValuePlatformApi2 = (CodeValuePlatformApi) chv.a(CodeValuePlatformApi.class, cih.e(this.e));
        f1614b = codeValuePlatformApi2;
        return codeValuePlatformApi2.queryCodeRulesApi(c(), requestBodyD);
    }

    private Map<String, String> c() {
        HashMap map = new HashMap();
        map.put("grayMark", cid.h());
        map.put("appName", cid.a());
        map.put("appVersion", cid.d());
        map.put("deviceModel", cid.c());
        return map;
    }

    private RequestBody d(int i) {
        QueryCacheReq queryCacheReq = new QueryCacheReq();
        queryCacheReq.setTransactionID(cid.h());
        queryCacheReq.setStartIdx(i);
        queryCacheReq.setPageSize(chm.e());
        queryCacheReq.setDeviceInfo(a());
        queryCacheReq.setAppPkgName(cid.a());
        queryCacheReq.setAppVersion(cid.d());
        return RequestBodyProviders.create(MediaType.parse("application/json; charset=utf-8"), new Gson().toJson(queryCacheReq));
    }

    private DeviceInfo a() {
        DeviceInfo deviceInfo = new DeviceInfo();
        deviceInfo.setTerminalType(cid.c());
        deviceInfo.setAndroidVersion(cid.e());
        deviceInfo.setEmuiVersion(cid.b());
        return deviceInfo;
    }
}
