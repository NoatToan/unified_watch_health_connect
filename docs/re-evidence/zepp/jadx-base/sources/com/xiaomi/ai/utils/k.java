package com.xiaomi.ai.utils;

import android.text.TextUtils;
import com.facebook.share.internal.ShareConstants;
import com.xiaomi.ai.HTTPCallback;
import com.xiaomi.ai.TrackInfo;
import java.util.HashMap;
import org.cybergarage.upnp.std.av.renderer.AVTransport;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes18.dex */
public class k {
    public static final String a = "https://api.ai.xiaomi.com/track/v2";
    public static final String b = "https://api-preview.ai.xiaomi.com/track/v2";
    public static final String c = "https://api.ai.xiaomi.com/track/authmiot";
    public String d;
    public String e;
    public HTTPCallback f;
    public int g;

    public k(String str, String str2) {
        this.d = str;
        this.e = str2;
    }

    private String a(int i, int i2) {
        if (i == 0) {
            return a;
        }
        if (i == 1) {
            return b;
        }
        return null;
    }

    public int a(HTTPCallback hTTPCallback, TrackInfo trackInfo, String str, String str2, int i) {
        String strA = a(trackInfo, str);
        if (TextUtils.isEmpty(strA)) {
            Log.w(AVTransport.TRACK, "generate Data failed");
            return -1;
        }
        if (TextUtils.isEmpty(str2)) {
            Log.w(AVTransport.TRACK, "Token is null");
            return -2;
        }
        Log.d("UploadTrack", strA);
        HashMap map = new HashMap();
        map.put("Content-Type", "application/json");
        map.put("Date", f.a());
        map.put("Authorization", str2);
        new Thread(new l(this, hTTPCallback, a(this.g, i), map, strA)).start();
        return 0;
    }

    public HTTPCallback a() {
        return this.f;
    }

    public String a(TrackInfo trackInfo, String str) {
        JSONObject jSONObjectA = a(trackInfo);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("app_id", this.d);
            jSONObject.put("did", this.e);
            jSONObject.put("uid", str);
            if (trackInfo.getData() == null) {
                jSONObject.put("data", jSONObjectA);
            } else {
                jSONObject.put("data", trackInfo.getData());
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject.toString();
    }

    public JSONObject a(TrackInfo trackInfo) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("version", trackInfo.getVersion());
            jSONObject.put("request_id", trackInfo.getRequestID());
            jSONObject.put("resource_id", trackInfo.getResourceID());
            jSONObject.put(com.alipay.sdk.m.k.b.m, trackInfo.getCP());
            jSONObject.put("load_time", trackInfo.getLoadTime());
            jSONObject.put("start_time", trackInfo.getStartTime());
            jSONObject.put("end_time", trackInfo.getEndTime());
            jSONObject.put("position", trackInfo.getPosition());
            jSONObject.put(ShareConstants.WEB_DIALOG_PARAM_ACTION_TYPE, trackInfo.getActionType());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    public void a(int i) {
        this.g = i;
    }

    public void a(HTTPCallback hTTPCallback) {
        this.f = hTTPCallback;
    }
}
