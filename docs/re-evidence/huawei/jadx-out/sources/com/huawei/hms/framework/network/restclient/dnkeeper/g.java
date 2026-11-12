package com.huawei.hms.framework.network.restclient.dnkeeper;

import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.PLSharedPreferences;
import com.huawei.hms.framework.network.restclient.hwhttp.dns.DnsResult;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public abstract class g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f13381c = "DefaultDNKeeperCallable";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected List<String> f13382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected String f13383b;

    protected void a(DnsResult dnsResult, String str, PLSharedPreferences pLSharedPreferences) {
        List<DnsResult.Address> addressList = dnsResult.getAddressList();
        if (addressList == null || addressList.size() == 0) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", dnsResult.getType());
            JSONArray jSONArray = new JSONArray();
            for (int i = 0; i < addressList.size(); i++) {
                f.a(jSONArray, i, addressList.get(i).getType(), addressList.get(i).getValue(), addressList.get(i).getTtl());
            }
            jSONObject.put(DnsResult.KEY_ADDRESSLIST, jSONArray);
            jSONObject.put("createTime", dnsResult.getCreateTime());
            if (pLSharedPreferences != null) {
                pLSharedPreferences.putString(str, jSONObject.toString());
            }
        } catch (JSONException e) {
            Logger.w(f13381c, "fail to JSONException:", e);
        }
    }

    protected void a(PLSharedPreferences pLSharedPreferences) {
        try {
            List<String> list = this.f13382a;
            if (list != null && !list.isEmpty()) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("type", "A");
                JSONArray jSONArray = new JSONArray();
                for (int i = 0; i < this.f13382a.size(); i++) {
                    f.a(jSONArray, i, "A", this.f13382a.get(i), 0L);
                }
                jSONObject.put(DnsResult.KEY_ADDRESSLIST, jSONArray);
                jSONObject.put("createTime", System.currentTimeMillis());
                if (pLSharedPreferences != null) {
                    pLSharedPreferences.putString(this.f13383b, jSONObject.toString());
                }
                Logger.i(f13381c, "dnkeeper ip result");
            }
        } catch (JSONException e) {
            Logger.w(f13381c, "fail to JSONException:", e);
        }
    }
}
