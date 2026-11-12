package com.xiaomi.hm.health.discovery.jsbridge.entity;

import com.alipay.sdk.m.u.i;
import com.huami.message.api.WebConst;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public class SystemNotice {
    public String callback;
    public String description;
    public int intentType = -1;
    public String intentUrl;
    public String messageId;
    public NoticeTimer noticeTimer;
    public String notifyId;
    public String title;

    public static SystemNotice getFromJson(String json) throws JSONException {
        SystemNotice systemNotice = new SystemNotice();
        JSONObject jSONObject = new JSONObject(json);
        systemNotice.title = jSONObject.optString("title");
        systemNotice.description = jSONObject.optString("description");
        systemNotice.messageId = jSONObject.optString(WebConst.QueryParam.MESSAGE_ID);
        systemNotice.notifyId = jSONObject.optString("notifyId");
        if (jSONObject.has("extra")) {
            systemNotice.intentType = jSONObject.optJSONObject("extra").optInt("notify_effect");
            systemNotice.intentUrl = jSONObject.optJSONObject("extra").optString("intent_uri");
            systemNotice.callback = jSONObject.optJSONObject("extra").optString("callback");
        }
        if (jSONObject.has("timer")) {
            NoticeTimer noticeTimer = new NoticeTimer();
            noticeTimer.startAt = jSONObject.optJSONObject("timer").optString("startAt");
            noticeTimer.enable = jSONObject.optJSONObject("timer").optInt("disabled") == 0;
            noticeTimer.expireInSeconds = jSONObject.optJSONObject("timer").optInt("expireInSeconds");
            systemNotice.noticeTimer = noticeTimer;
        }
        return systemNotice;
    }

    public String toString() {
        return "SystemNotice{title : " + this.title + "description : " + this.description + "messageId : " + this.messageId + "notifyId : " + this.notifyId + "intentType : " + this.intentType + "callback : " + this.callback + i.d;
    }
}
