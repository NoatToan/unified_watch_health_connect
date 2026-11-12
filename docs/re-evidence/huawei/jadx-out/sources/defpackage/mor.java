package defpackage;

import com.google.json.JsonSanitizer;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwdevice.phoneprocess.mgr.httpproxy.factory.HttpProxyParamsFactory;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.utils.StringUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class mor implements HttpProxyParamsFactory {
    @Override // com.huawei.hwdevice.phoneprocess.mgr.httpproxy.factory.HttpProxyParamsFactory
    public Map<String, String> getCommonHeaders() {
        return new HashMap();
    }

    @Override // com.huawei.hwdevice.phoneprocess.mgr.httpproxy.factory.HttpProxyParamsFactory
    public Map<String, String> getHeaders(String str) {
        HashMap map = new HashMap();
        if (getCommonHeaders() != null && !getCommonHeaders().isEmpty()) {
            map.putAll(getCommonHeaders());
        }
        if (StringUtils.g(str)) {
            LogUtil.j("BaseHttpProxyParamsFactory", "headers is empty in getHeaders");
            return map;
        }
        try {
            JSONObject jSONObject = new JSONObject(JsonSanitizer.sanitize(str));
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject.getString(next));
            }
            return map;
        } catch (JSONException unused) {
            LogUtil.e("BaseHttpProxyParamsFactory", "JSONException in getHeaders");
            return map;
        }
    }

    @Override // com.huawei.hwdevice.phoneprocess.mgr.httpproxy.factory.HttpProxyParamsFactory
    public Map<String, String> getCommonBody(DeviceInfo deviceInfo) {
        return new HashMap();
    }

    @Override // com.huawei.hwdevice.phoneprocess.mgr.httpproxy.factory.HttpProxyParamsFactory
    public Map<String, Object> getBody(String str, DeviceInfo deviceInfo) {
        HashMap map = new HashMap();
        if (getCommonBody(deviceInfo) != null && !getCommonBody(deviceInfo).isEmpty()) {
            map.putAll(getCommonBody(deviceInfo));
        }
        if (StringUtils.g(str)) {
            LogUtil.j("BaseHttpProxyParamsFactory", "body is empty in getBody");
            return map;
        }
        try {
            JSONObject jSONObject = new JSONObject(JsonSanitizer.sanitize(str));
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject.get(next));
            }
            return map;
        } catch (JSONException unused) {
            LogUtil.e("BaseHttpProxyParamsFactory", "JSONException in getBody");
            return map;
        }
    }

    @Override // com.huawei.hwdevice.phoneprocess.mgr.httpproxy.factory.HttpProxyParamsFactory
    public Map<String, String> getParams(String str) {
        HashMap map = new HashMap();
        if (StringUtils.g(str)) {
            LogUtil.j("BaseHttpProxyParamsFactory", "params is empty in getParams");
            return map;
        }
        try {
            JSONObject jSONObject = new JSONObject(JsonSanitizer.sanitize(str));
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject.getString(next));
            }
            return map;
        } catch (JSONException unused) {
            LogUtil.e("BaseHttpProxyParamsFactory", "JSONException in getParams");
            return map;
        }
    }
}
