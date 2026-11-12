package com.xiaomi.hm.health.discovery.jsbridge.function;

import com.huami.discovery.bridge.jsbridge.JsCallBackFunction;
import com.huami.discovery.bridge.jsbridge.api.ApiHandler;
import com.huami.discovery.bridge.jsbridge.common.ErrorMessage;
import com.huami.discovery.bridge.jsbridge.common.JsMessageCenter;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.reminder.AdRemindParserKt;
import com.xiaomi.hm.health.reminder.NotifyMessagePushCallback;

/* JADX INFO: loaded from: classes21.dex */
public class DeviceCustomNoticeHandler implements ApiHandler {
    private static final String b = "DeviceCustomNoticeHandler";
    private String a;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(JsCallBackFunction jsCallBackFunction, int i) {
        HMLog.i(b, "error: " + i, new Object[0]);
        switch (i) {
            case -1:
                jsCallBackFunction.onCallBack(JsMessageCenter.get().getSuccess());
                return;
            case 0:
                this.a = "4021206";
                break;
            case 1:
                this.a = "4021201";
                break;
            case 2:
                this.a = "4021203";
                break;
            case 3:
                this.a = "4021204";
                break;
            case 4:
                this.a = TreadmillNoticeHandler.ERROR_CODE_WRITE_FAILED;
                break;
            case 5:
                this.a = "4021205";
                break;
            case 6:
                this.a = TreadmillNoticeHandler.ERROR_CODE_MSG_FORMAT_WRONG;
                break;
        }
        jsCallBackFunction.onCallBack(getFailedResult().toString());
    }

    @Override // com.huami.discovery.bridge.jsbridge.api.ApiHandler
    public ErrorMessage getFailedResult() {
        return JsMessageCenter.get().getMessage(this.a);
    }

    @Override // com.huami.discovery.bridge.jsbridge.api.ApiHandler
    public void handleData(String data, final JsCallBackFunction function) {
        HMLog.i(b, "data: " + data, new Object[0]);
        AdRemindParserKt.work(data, new NotifyMessagePushCallback() { // from class: p71
            @Override // com.xiaomi.hm.health.reminder.NotifyMessagePushCallback
            public final void onResult(int i) {
                this.a.b(function, i);
            }
        });
    }

    @Override // com.huami.discovery.bridge.jsbridge.api.ApiHandler
    public boolean handleData(String data) {
        return false;
    }
}
