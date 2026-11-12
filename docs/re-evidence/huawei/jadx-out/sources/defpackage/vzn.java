package defpackage;

import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.ecologydevice.networkclient.HealthEngineRequestManager;
import com.huawei.hihealthservice.util.HttpRequestApi;
import com.huawei.hms.framework.network.restclient.Response;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.VastAttribute;
import com.huawei.profile.coordinator.ProfileRequestConstants;
import java.io.IOException;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes19.dex */
public class vzn {
    public static String c(String str, String str2, String str3) {
        Response<String> responseExecute;
        HttpRequestApi httpRequestApi = (HttpRequestApi) oet.d().e(HttpRequestApi.class);
        Response<String> response = null;
        if (httpRequestApi == null) {
            return null;
        }
        HashMap map = new HashMap();
        map.put("Content-type", "application/json");
        map.put("Authorization", HealthEngineRequestManager.PREFIX_ACCESS_TOKEN + str2);
        try {
            if (str3.equals("GET")) {
                responseExecute = httpRequestApi.getReq(str, map).execute();
            } else {
                if (!str3.equals(ProfileRequestConstants.DELETE_TYPE)) {
                    LogUtil.a("HMSAuthHttps", "getReq with unknown method");
                } else {
                    responseExecute = httpRequestApi.deleteReq(str, map).execute();
                }
                return b(response);
            }
            response = responseExecute;
        } catch (IOException e) {
            LogUtil.e("HMSAuthHttps", "getReq fail : ", ExceptionUtils.c(e));
        }
        return b(response);
    }

    private static String b(Response<String> response) {
        if (response == null) {
            return null;
        }
        if (response.isOK()) {
            String body = response.getRawResponse().getBody();
            LogUtil.a("HMSAuthHttps", "getReq statusCode: Success");
            return body;
        }
        if (response.getCode() == 401) {
            String strC = c(response.getCode());
            LogUtil.e("HMSAuthHttps", "http request statusCode is ", Integer.valueOf(response.getCode()));
            return strC;
        }
        LogUtil.e("HMSAuthHttps", "Wrong statusCode = ", Integer.valueOf(response.getCode()));
        return null;
    }

    public static String c(int i) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(VastAttribute.ERROR, i);
            return jSONObject.toString();
        } catch (JSONException unused) {
            LogUtil.e("HMSAuthHttps", "JSONException occurs");
            return null;
        }
    }
}
