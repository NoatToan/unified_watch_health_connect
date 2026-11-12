package com.xiaomi.hm.health.watermarkcamera.web;

import androidx.annotation.NonNull;
import com.huami.network.base.handler.IHMHttpResponseHandler;
import com.huami.network.base.model.HMHttpResponseData;
import com.huami.network.base.model.Support;
import com.huami.network.hmnetwork.server.HMServerDef;
import com.huami.network.hmnetwork.webapi.HMWebUtil;
import com.huami.tools.log.HMLog;
import de.greenrobot.event.EventBus;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes22.dex */
public class GetWatermarkAPI {
    public static final String KEY_NAME_ALTITUDE = "altitude";
    public static final String KEY_NAME_CADENCE = "cadence";
    public static final String KEY_NAME_HRATE = "heart_rate";
    public static final String KEY_NAME_PACE = "pace";
    public static final String KEY_NAME_SPEED = "speed";
    public static final String KEY_NAME_STRIDE = "stride";
    public static final String KEY_NAME_TIME = "time";
    private static final String a = "GetWatermarkAPI";
    private static String b = "v1/apps/watermarks.json";
    private static final String c = "category";
    private static final String d = "run";
    private static final String e = "stickers";
    private static final String f = "code";
    private static final String g = "message";
    private static final String h = "data";
    private static final String i = "watermarkPicX";
    private static final String j = "watermarkPicY";
    private static final String k = "sort";
    private static final String l = "createTime";
    private static final String m = "watermarkPicWidth";
    private static final String n = "watermarkPicHeight";
    private static final String o = "watermarkWhitePicUrl";
    private static final String p = "watermarkBlackPicUrl";
    private static final String q = "watermarkThumbUrl";
    private static final String r = "angleType";
    private static final String s = "subCategory";
    private static List<WebWatermark> u;
    private static List<WebWatermark> v;
    public static final String KEY_NAME_MILEAGE = "mileage";
    public static final String KEY_NAME_CONSUME = "consume";
    public static final String KEY_NAME_STEPS = "steps";
    public static final String KEY_NAME_FOREFOOT = "forefoot";
    private static String[] t = {KEY_NAME_MILEAGE, "time", "pace", KEY_NAME_CONSUME, "heart_rate", KEY_NAME_STEPS, "speed", "cadence", "stride", "altitude", KEY_NAME_FOREFOOT};

    public static class WebMarkDrawData {
        public String fontAntiColor;
        public String fontColor;
        public int fontSize;
        public String fontWeight;
        public String key;
        public int left;
        public int textAlign;
        public int top;

        public String toString() {
            return "WebMarkDrawData{key='" + this.key + "', fontSize=" + this.fontSize + ", fontWeight='" + this.fontWeight + "', left=" + this.left + ", top=" + this.top + ", textAlign=" + this.textAlign + ", fontColor=" + this.fontColor + ", fontAntiColor=" + this.fontAntiColor + '}';
        }
    }

    public static class WebWatermark implements Comparable<WebWatermark> {
        public String mAngleType;
        public String mCreateTime;
        public boolean mIsSticker;
        public List<WebMarkDrawData> mMarkDrawDatas;
        public String mMarkTitle;
        public int mSort;
        public int mStatus;
        public String mSubCategory;
        public String mWatermarkBlackPicUrl;
        public int mWatermarkPicHeight;
        public int mWatermarkPicWidth;
        public int mWatermarkPicX;
        public int mWatermarkPicY;
        public String mWatermarkThumbUrl;
        public String mWatermarkWhitePicUrl;

        @Override // java.lang.Comparable
        public int compareTo(@NonNull WebWatermark webWatermark) {
            return this.mSort - webWatermark.mSort;
        }
    }

    public class a extends IHMHttpResponseHandler {
        public final /* synthetic */ boolean a;

        public a(boolean z) {
            this.a = z;
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCancel(int i) {
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCompleted() {
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onError(Throwable th) {
            if (this.a) {
                EventBus.getDefault().post(new EventWatermarkDataUpdate(false));
            }
        }

        @Override // com.huami.network.base.handler.IHMHttpResponseHandler
        public void onItem(HMHttpResponseData hMHttpResponseData) {
            if (hMHttpResponseData.isSuccess()) {
                GetWatermarkAPI.v = GetWatermarkAPI.f(new String(hMHttpResponseData.getResponseBody(), StandardCharsets.UTF_8));
                Iterator it2 = GetWatermarkAPI.v.iterator();
                while (it2.hasNext()) {
                    ((WebWatermark) it2.next()).mIsSticker = true;
                }
                if (this.a) {
                    EventBus.getDefault().post(new EventWatermarkDataUpdate(true, true));
                }
            }
        }
    }

    public class b extends IHMHttpResponseHandler {
        public final /* synthetic */ boolean a;

        public b(boolean z) {
            this.a = z;
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCancel(int i) {
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCompleted() {
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onError(Throwable th) {
            if (this.a) {
                EventBus.getDefault().post(new EventWatermarkDataUpdate(false));
            }
        }

        @Override // com.huami.network.base.handler.IHMHttpResponseHandler
        public void onItem(HMHttpResponseData hMHttpResponseData) {
            if (hMHttpResponseData.isSuccess()) {
                GetWatermarkAPI.u = GetWatermarkAPI.f(new String(hMHttpResponseData.getResponseBody(), StandardCharsets.UTF_8));
                if (this.a) {
                    EventBus.getDefault().post(new EventWatermarkDataUpdate(true, false));
                }
            }
        }
    }

    private static List<WebMarkDrawData> e(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        try {
            for (String str : t) {
                if (jSONObject.has(str)) {
                    WebMarkDrawData webMarkDrawData = new WebMarkDrawData();
                    webMarkDrawData.key = str;
                    JSONObject jSONObject2 = jSONObject.getJSONObject(str);
                    webMarkDrawData.fontSize = (int) Double.parseDouble(jSONObject2.optString("font-size"));
                    webMarkDrawData.fontWeight = jSONObject2.optString("font-weight");
                    webMarkDrawData.top = (int) Double.parseDouble(jSONObject2.optString("top"));
                    JSONObject jSONObject3 = jSONObject2.getJSONObject("left");
                    webMarkDrawData.textAlign = Integer.parseInt(jSONObject3.optString("type"));
                    webMarkDrawData.left = (int) Double.parseDouble(jSONObject3.optString("text-align"));
                    webMarkDrawData.fontColor = jSONObject2.optString("color");
                    webMarkDrawData.fontAntiColor = jSONObject2.optString("anticolor");
                    HMLog.d(a, "drawData-> " + webMarkDrawData.toString(), new Object[0]);
                    arrayList.add(webMarkDrawData);
                }
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static List<WebWatermark> f(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.getInt("code") == 1) {
                JSONArray jSONArray = jSONObject.getJSONArray("data");
                if (jSONArray.length() == 0) {
                    HMLog.d(a, "no watermark datas", new Object[0]);
                } else {
                    for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                        WebWatermark webWatermark = new WebWatermark();
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                        webWatermark.mCreateTime = jSONObject2.optString("createTime");
                        webWatermark.mSort = jSONObject2.optInt("sort");
                        webWatermark.mWatermarkPicWidth = (int) jSONObject2.optDouble(m);
                        webWatermark.mWatermarkPicHeight = (int) jSONObject2.optDouble(n);
                        webWatermark.mWatermarkPicX = (int) jSONObject2.optDouble(i);
                        webWatermark.mWatermarkPicY = (int) jSONObject2.optDouble(j);
                        webWatermark.mWatermarkBlackPicUrl = jSONObject2.optString(p);
                        webWatermark.mWatermarkWhitePicUrl = jSONObject2.optString(o);
                        webWatermark.mWatermarkThumbUrl = jSONObject2.optString(q);
                        webWatermark.mAngleType = jSONObject2.optString(r);
                        webWatermark.mSubCategory = jSONObject2.optString(s);
                        webWatermark.mMarkTitle = jSONObject2.optString("title");
                        webWatermark.mMarkDrawDatas = new ArrayList();
                        if (jSONObject2.has("dataType")) {
                            try {
                                webWatermark.mMarkDrawDatas = e(new JSONObject(jSONObject2.optString("dataType")));
                            } catch (JSONException e2) {
                                e2.printStackTrace();
                            }
                        }
                        arrayList.add(webWatermark);
                    }
                    Collections.sort(arrayList);
                }
            }
        } catch (JSONException e3) {
            e3.printStackTrace();
        }
        return arrayList;
    }

    public static WebWatermark getCurrentWebWatermark(String str) {
        List<WebWatermark> list = u;
        if (list != null) {
            for (WebWatermark webWatermark : list) {
                if (webWatermark.mCreateTime.equals(str)) {
                    return webWatermark;
                }
            }
        }
        List<WebWatermark> list2 = v;
        if (list2 == null) {
            return null;
        }
        for (WebWatermark webWatermark2 : list2) {
            if (webWatermark2.mCreateTime.equals(str)) {
                return webWatermark2;
            }
        }
        return null;
    }

    public static List<WebMarkDrawData> getDrawDataByMark(String str) {
        for (WebWatermark webWatermark : u) {
            if (webWatermark.mCreateTime.equals(str)) {
                return webWatermark.mMarkDrawDatas;
            }
        }
        for (WebWatermark webWatermark2 : v) {
            if (webWatermark2.mCreateTime.equals(str)) {
                return webWatermark2.mMarkDrawDatas;
            }
        }
        return null;
    }

    public static void getWebStickerWatermark(boolean z) {
        List<WebWatermark> list;
        if (z || (list = v) == null || list.isEmpty()) {
            String url = HMServerDef.getUrl(b);
            Map<String, Object> systemParams = HMWebUtil.getSystemParams();
            systemParams.put("category", e);
            HMWebUtil.doRequest(url, systemParams, Support.RequestSupport.GET, new a(z));
        }
    }

    public static List<WebWatermark> getWebStickerWatermarkList() {
        return v;
    }

    public static void getWebWatermark(boolean z) {
        List<WebWatermark> list;
        if (z || (list = u) == null || list.isEmpty()) {
            String url = HMServerDef.getUrl(b);
            Map<String, Object> systemParams = HMWebUtil.getSystemParams();
            systemParams.put("category", "run");
            HMWebUtil.doRequest(url, systemParams, Support.RequestSupport.GET, new b(z));
        }
    }

    public static List<WebWatermark> getWebWatermarkList() {
        return u;
    }

    public static class EventWatermarkDataUpdate {
        public boolean isDataSticker;
        public boolean isDataSucc;

        public EventWatermarkDataUpdate(boolean z) {
            this.isDataSucc = z;
        }

        public EventWatermarkDataUpdate(boolean z, boolean z2) {
            this.isDataSticker = z2;
            this.isDataSucc = z;
        }
    }
}
