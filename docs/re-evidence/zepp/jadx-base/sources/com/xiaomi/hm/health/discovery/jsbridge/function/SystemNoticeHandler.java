package com.xiaomi.hm.health.discovery.jsbridge.function;

import com.huami.discovery.bridge.jsbridge.JsCallBackFunction;
import com.huami.discovery.bridge.jsbridge.api.ApiHandler;
import com.huami.discovery.bridge.jsbridge.common.ErrorMessage;
import com.huami.discovery.bridge.jsbridge.common.JsMessageCenter;
import com.xiaomi.hm.health.discovery.jsbridge.entity.SystemNotice;
import com.xiaomi.hm.health.notification.AppNotification;
import org.json.JSONException;

/* JADX INFO: loaded from: classes21.dex */
public class SystemNoticeHandler implements ApiHandler {
    private String a;

    @Override // com.huami.discovery.bridge.jsbridge.api.ApiHandler
    public ErrorMessage getFailedResult() {
        return JsMessageCenter.get().getMessage(this.a);
    }

    @Override // com.huami.discovery.bridge.jsbridge.api.ApiHandler
    public void handleData(String data, JsCallBackFunction function) {
    }

    @Override // com.huami.discovery.bridge.jsbridge.api.ApiHandler
    public boolean handleData(String data) {
        try {
            AppNotification.showJsBridgeNotification(SystemNotice.getFromJson(data));
            return true;
        } catch (JSONException e) {
            e.printStackTrace();
            this.a = TreadmillNoticeHandler.ERROR_CODE_MSG_FORMAT_WRONG;
            return false;
        }
    }
}
