package com.xiaomi.hm.health.push;

import android.net.Uri;
import android.text.TextUtils;
import com.amazon.identity.auth.device.endpoint.AbstractJSONTokenResponse;
import com.huami.tools.log.HMLog;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public class HMPushItem {
    public static final String TAG = "HMPushItem";
    private static final String l = "jumpdirect";
    private static final String m = "dynamic";
    private String a = "";
    private String b = "";
    private String c = "";
    private String d = "";
    private String e = "";
    public int f = 1;
    private String g = "";
    private int h = 0;
    private String i = "";
    private String j = "";
    private String k = "";

    private static void a(HMPushItem hMPushItem, JSONObject jSONObject) {
        hMPushItem.setMsgUrl(jSONObject.optString("uri"));
        hMPushItem.setMsgTitle(jSONObject.optString("title"));
        hMPushItem.setShare(jSONObject.optInt("share"));
        hMPushItem.setShareTitle(jSONObject.optString("shareTitle"));
        hMPushItem.setShareSubTitle(jSONObject.optString("shareSubTitle"));
        hMPushItem.setShareUrl(jSONObject.optString("shareUrl"));
    }

    private static void b(HMPushItem hMPushItem, JSONObject jSONObject) throws Exception {
        hMPushItem.setMsgType(jSONObject.getString("msgType"));
        hMPushItem.setMsgUrl(jSONObject.getString("msgURL"));
        hMPushItem.setMsgId(jSONObject.optString("msgId"));
        hMPushItem.setMsgTitle(jSONObject.optString("msgTitle"));
        hMPushItem.setCookie(jSONObject.optInt(AbstractJSONTokenResponse.COOKIE));
        hMPushItem.setShare(jSONObject.optInt("share"));
        hMPushItem.setShareTitle(jSONObject.optString("share_title"));
        hMPushItem.setShareSubTitle(jSONObject.optString("share_subTitle"));
        hMPushItem.setShareUrl(jSONObject.optString("share_url"));
        hMPushItem.setExpriation(jSONObject.optString("expriation"));
    }

    public static HMPushItem formExtra(Map<String, String> map) {
        HMPushItem hMPushItem = new HMPushItem();
        String str = map.get("jobkey");
        if (!TextUtils.isEmpty(str)) {
            hMPushItem.setJobKey(str);
        }
        String str2 = map.get("data");
        if (TextUtils.isEmpty(str2)) {
            return hMPushItem;
        }
        try {
            JSONObject jSONObject = new JSONObject(str2);
            if (jSONObject.has("mobileNotificationClickEffect")) {
                a(hMPushItem, jSONObject.getJSONObject("mobileNotificationClickEffect"));
            } else {
                b(hMPushItem, jSONObject);
            }
            return hMPushItem;
        } catch (Exception e) {
            HMLog.i(TAG, "formJson exception:" + e.getMessage(), new Object[0]);
            return hMPushItem;
        }
    }

    public int getCookie() {
        return this.f;
    }

    public String getExpriation() {
        return this.g;
    }

    public String getJobKey() {
        return this.a;
    }

    public Uri getMifitUri() {
        try {
            return Uri.parse(this.d);
        } catch (Exception unused) {
            return null;
        }
    }

    public String getMsgId() {
        return this.b;
    }

    public String getMsgTitle() {
        return this.e;
    }

    public String getMsgType() {
        return this.c;
    }

    public String getMsgUrl() {
        return this.d;
    }

    public int getShare() {
        return this.h;
    }

    public String getShareSubTitle() {
        return this.j;
    }

    public String getShareTitle() {
        return this.i;
    }

    public String getShareUrl() {
        return this.k;
    }

    public boolean isAppScheme() {
        if (!TextUtils.isEmpty(this.d)) {
            if (this.d.startsWith(PushConfig.getAccounts().getScheme() + "://")) {
                return true;
            }
        }
        return false;
    }

    public boolean isJumpDirect() {
        return l.equals(this.c);
    }

    public boolean isJumpDynamic() {
        return m.equals(this.c);
    }

    public boolean isUserHttp() {
        return !TextUtils.isEmpty(this.d) && (this.d.startsWith("http://") || this.d.startsWith("https://"));
    }

    public void setCookie(int i) {
        this.f = i;
    }

    public void setExpriation(String str) {
        this.g = str;
    }

    public void setJobKey(String str) {
        this.a = str;
    }

    public void setMsgId(String str) {
        this.b = str;
    }

    public void setMsgTitle(String str) {
        this.e = str;
    }

    public void setMsgType(String str) {
        this.c = str;
    }

    public void setMsgUrl(String str) {
        this.d = str;
    }

    public void setShare(int i) {
        this.h = i;
    }

    public void setShareSubTitle(String str) {
        this.j = str;
    }

    public void setShareTitle(String str) {
        this.i = str;
    }

    public void setShareUrl(String str) {
        this.k = str;
    }

    public String toString() {
        return "HMPushItem{jobKey='" + this.a + "', msgId='" + this.b + "', msgType='" + this.c + "', msgUrl='" + this.d + "', msgTitle='" + this.e + "', cookie=" + this.f + ", expriation='" + this.g + "', share=" + this.h + ", shareTitle='" + this.i + "', shareSubTitle='" + this.j + "', shareUrl='" + this.k + "'}";
    }
}
