package com.xiaomi.hm.health.discovery.jsbridge.function;

import com.huami.discovery.bridge.jsbridge.JsCallBackFunction;
import com.huami.discovery.bridge.jsbridge.api.ApiHandler;
import com.huami.discovery.bridge.jsbridge.common.ErrorMessage;
import com.huami.discovery.bridge.jsbridge.common.JsMessageCenter;
import com.xiaomi.hm.health.reminder.NotifyMessage;
import com.xiaomi.hm.health.reminder.NotifyMessagePushCallback;

/* JADX INFO: loaded from: classes21.dex */
public class DeviceNoticeHandler implements ApiHandler {
    private String a;

    public class a implements NotifyMessagePushCallback {
        public final /* synthetic */ JsCallBackFunction a;

        public a(final JsCallBackFunction val$function) {
            this.a = val$function;
        }

        @Override // com.xiaomi.hm.health.reminder.NotifyMessagePushCallback
        public void onResult(int error) {
            switch (error) {
                case -1:
                    this.a.onCallBack(JsMessageCenter.get().getSuccess());
                    return;
                case 0:
                    DeviceNoticeHandler.this.a = "4021206";
                    break;
                case 1:
                    DeviceNoticeHandler.this.a = "4021201";
                    break;
                case 2:
                    DeviceNoticeHandler.this.a = "4021203";
                    break;
                case 3:
                    DeviceNoticeHandler.this.a = "4021204";
                    break;
                case 4:
                    DeviceNoticeHandler.this.a = TreadmillNoticeHandler.ERROR_CODE_WRITE_FAILED;
                    break;
                case 5:
                    DeviceNoticeHandler.this.a = "4021205";
                    break;
            }
            this.a.onCallBack(DeviceNoticeHandler.this.getFailedResult().toString());
        }
    }

    @Override // com.huami.discovery.bridge.jsbridge.api.ApiHandler
    public ErrorMessage getFailedResult() {
        return JsMessageCenter.get().getMessage(this.a);
    }

    @Override // com.huami.discovery.bridge.jsbridge.api.ApiHandler
    public void handleData(String data, JsCallBackFunction function) {
        NotifyMessage notifyMessage = NotifyMessage.parse(data, false);
        if (notifyMessage != null) {
            notifyMessage.work(new a(function), false);
        } else {
            this.a = TreadmillNoticeHandler.ERROR_CODE_MSG_FORMAT_WRONG;
            function.onCallBack(getFailedResult().toString());
        }
    }

    @Override // com.huami.discovery.bridge.jsbridge.api.ApiHandler
    public boolean handleData(String data) {
        return false;
    }
}
