package com.xiaomi.hm.health.discovery.jsbridge.function;

import com.huami.account.HMLoginManager;
import com.huami.discovery.bridge.jsbridge.JsCallBackFunction;
import com.huami.discovery.bridge.jsbridge.api.ApiHandler;
import com.huami.discovery.bridge.jsbridge.common.ErrorMessage;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import com.xiaomi.hm.health.model.account.HMUserInfo;
import com.xiaomi.hm.health.relation.cloud.WebAPI;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public class GetUserInfoHandler implements ApiHandler {
    public static final String a = "mi";
    public static final String b = "huami";
    public static final String c = "wechat";

    @Override // com.huami.discovery.bridge.jsbridge.api.ApiHandler
    public ErrorMessage getFailedResult() {
        return null;
    }

    @Override // com.huami.discovery.bridge.jsbridge.api.ApiHandler
    public void handleData(String data, JsCallBackFunction function) {
        HMUserInfo userInfo = HMPersonInfo.getInstance().getUserInfo();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("uid", userInfo.getUserid());
            if (HMLoginManager.isHuamiSDKLogin()) {
                jSONObject.put("openType", "huami");
            } else if (HMLoginManager.isOldAccount()) {
                jSONObject.put("openType", "mi");
            }
            jSONObject.put(WebAPI.PARAM_SHARE_INVITE_AVATAR, userInfo.getAvatar());
            jSONObject.put("nickname", userInfo.getNickname());
            jSONObject.put("gender", userInfo.getGender());
            jSONObject.put("birthday", userInfo.getBirthday());
            jSONObject.put("height", userInfo.getHeight());
            jSONObject.put("weight", userInfo.getWeight());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        function.onCallBack(jSONObject.toString());
    }

    @Override // com.huami.discovery.bridge.jsbridge.api.ApiHandler
    public boolean handleData(String data) {
        return false;
    }
}
