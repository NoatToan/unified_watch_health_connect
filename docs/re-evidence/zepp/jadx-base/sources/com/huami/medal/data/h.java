package com.huami.medal.data;

import android.text.TextUtils;
import com.huami.medal.proxy.MedalProxy;
import com.huami.network.base.handler.ResponseHandler;
import com.huami.network.base.model.HMHttpResponseData;
import com.huami.network.base.model.Support;
import com.huami.network.hmnetwork.webapi.HMWebUtil;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.databases.model.Medal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import rx.Observable;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

/* JADX INFO: loaded from: classes10.dex */
class h {
    private static final String a = "MedalWebAPI";
    private static final String b = "https://aos.huami.com/";
    private static final String c = "incentive/{social}/users/{huami_id}/medals";
    private static final String d = "incentive/{social}/medals/{medal_id}/take";
    private static final String e = "{social}";
    private static final String f = "{huami_id}";
    private static final String g = "{medal_id}";
    private static final String h = "type";
    private static final String i = "filter";
    private static final String j = "user_id";
    private static final String k = "mi";
    public static final String l = "not_received";
    public static final String m = "walk";
    public static final String n = "run";
    public static final String o = "qixing";
    public static final String p = "jianzou";
    public static final String q = "activity";

    public class a extends ResponseHandler {
        public final /* synthetic */ String[] a;

        public a(String[] strArr) {
            this.a = strArr;
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onFailure(HMHttpResponseData hMHttpResponseData) {
            HMLog.w(h.a, "获取勋章请求错误，" + new String(hMHttpResponseData.getResponseBody()), new Object[0]);
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onSuccess(HMHttpResponseData hMHttpResponseData) {
            this.a[0] = new String(hMHttpResponseData.getResponseBody());
        }
    }

    public class b extends ResponseHandler {
        public final /* synthetic */ boolean[] a;

        public b(boolean[] zArr) {
            this.a = zArr;
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onFailure(HMHttpResponseData hMHttpResponseData) {
            HMLog.w(h.a, "领取勋章请求错误，" + new String(hMHttpResponseData.getResponseBody()), new Object[0]);
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onSuccess(HMHttpResponseData hMHttpResponseData) {
            this.a[0] = hMHttpResponseData.isSuccess();
        }
    }

    private static String c(String str) {
        String webApiHost = MedalProxy.getWebApiHost();
        if (TextUtils.isEmpty(webApiHost)) {
            webApiHost = b;
        }
        return webApiHost + str;
    }

    private static String d() {
        return String.valueOf(MedalProxy.getUserId());
    }

    public static String f(String str, String str2) {
        String strC = c(c.replace(e, "mi").replace(f, d()));
        Map<String, Object> systemParams = HMWebUtil.getSystemParams();
        if (str != null) {
            systemParams.put("type", str);
        }
        if (str2 != null) {
            systemParams.put("filter", str2);
        }
        String[] strArr = {""};
        HMWebUtil.doRequest(strC, systemParams, Support.RequestSupport.GET, true, new a(strArr));
        return strArr[0];
    }

    public static Observable<List<Medal>> g(final String str, final String str2) {
        return Observable.fromCallable(new Callable() { // from class: com.huami.medal.data.f
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return h.f(str, str2);
            }
        }).subscribeOn(Schedulers.io()).map(new Func1() { // from class: com.huami.medal.data.g
            @Override // rx.functions.Func1
            public final Object call(Object obj) {
                return h.h((String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static List<Medal> h(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                Medal medal = new Medal();
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i2);
                medal.setId(jSONObjectOptJSONObject.optInt("id"));
                medal.setTitle(jSONObjectOptJSONObject.optString("title"));
                medal.setSubTitle(jSONObjectOptJSONObject.optString("sub_title"));
                medal.setCategory(jSONObjectOptJSONObject.optString("category"));
                JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("assets");
                if (jSONObjectOptJSONObject2 != null) {
                    medal.setObtainIcon(jSONObjectOptJSONObject2.optString("obtain_icon"));
                    medal.setObtainText(jSONObjectOptJSONObject2.optString("obtain_text"));
                    medal.setNotObtainIcon(jSONObjectOptJSONObject2.optString("not_obtain_icon"));
                    medal.setNotObtainText(jSONObjectOptJSONObject2.optString("not_obtain_text"));
                    medal.setTitleImg(jSONObjectOptJSONObject2.optString("title_img"));
                    JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject2.optJSONArray("tags");
                    if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                        ArrayList arrayList2 = new ArrayList();
                        for (int i3 = 0; i3 < jSONArrayOptJSONArray.length(); i3++) {
                            arrayList2.add(jSONArrayOptJSONArray.optString(i3));
                        }
                        medal.setTags(arrayList2);
                    }
                }
                arrayList.add(medal);
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return arrayList;
    }

    public static boolean i(long j2) {
        String strC = c(d.replace(e, "mi").replace(g, String.valueOf(j2)));
        Map<String, Object> systemParams = HMWebUtil.getSystemParams();
        systemParams.put("user_id", d());
        boolean[] zArr = {false};
        HMWebUtil.doRequest(strC, systemParams, Support.RequestSupport.POST, true, new b(zArr));
        return zArr[0];
    }
}
