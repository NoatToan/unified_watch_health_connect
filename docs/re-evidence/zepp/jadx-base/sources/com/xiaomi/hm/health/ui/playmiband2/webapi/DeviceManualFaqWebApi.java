package com.xiaomi.hm.health.ui.playmiband2.webapi;

import com.huami.network.base.handler.IHMBasicHttpResponseHandler;
import com.huami.network.base.model.HMHttpResponseData;
import com.huami.network.base.model.Support;
import com.huami.network.hmnetwork.webapi.HMWebUtil;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.about.AboutUrlManager;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import com.xiaomi.hm.health.device.callback.DeviceManualFaqCallback;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes22.dex */
public class DeviceManualFaqWebApi {
    private static final String a = "DeviceManualFaqWebApi";
    private static final int b = 200;
    private static final String c = "target";

    public interface Callback extends DeviceManualFaqCallback {
        @Override // com.xiaomi.hm.health.device.callback.DeviceManualFaqCallback
        void hide();

        @Override // com.xiaomi.hm.health.device.callback.DeviceManualFaqCallback
        void show(String url);
    }

    public class a implements IHMBasicHttpResponseHandler {
        public final /* synthetic */ DeviceManualFaqCallback a;

        public a(final DeviceManualFaqCallback val$callback) {
            this.a = val$callback;
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCancel(int type) {
            this.a.hide();
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCompleted() {
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onError(Throwable throwable) {
            this.a.hide();
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onFailure(HMHttpResponseData item) {
            this.a.hide();
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onSuccess(HMHttpResponseData item) {
            if (item.getStatusCode() != 200) {
                this.a.hide();
                return;
            }
            try {
                this.a.show(new JSONObject(item.getResponseString()).optString("target"));
            } catch (Exception e) {
                HMLog.i(DeviceManualFaqWebApi.a, e.getMessage(), new Object[0]);
                this.a.hide();
            }
        }
    }

    public static void isDeviceManualFaqShow(DeviceInfo deviceInfo, DeviceManualFaqCallback callback) {
        HMWebUtil.doRequest(AboutUrlManager.assembleDeviceFaqUrl(deviceInfo), null, Support.RequestSupport.GET, new a(callback));
    }
}
