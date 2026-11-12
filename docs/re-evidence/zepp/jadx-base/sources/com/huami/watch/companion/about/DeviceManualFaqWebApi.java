package com.huami.watch.companion.about;

import android.content.Context;
import com.huami.network.base.handler.IHMBasicHttpResponseHandler;
import com.huami.network.base.model.HMHttpResponseData;
import com.huami.network.base.model.Support;
import com.huami.network.hmnetwork.webapi.HMWebUtil;
import com.huami.tools.log.HMLog;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes16.dex */
public class DeviceManualFaqWebApi {
    private static final String a = "DeviceManualFaqWebApi";
    private static final int b = 200;
    private static final String c = "target";

    public interface Callback {
        void hide();

        void show(String str);
    }

    public class a implements IHMBasicHttpResponseHandler {
        public final /* synthetic */ Callback a;

        public a(Callback callback) {
            this.a = callback;
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCancel(int i) {
            this.a.hide();
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCompleted() {
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onError(Throwable th) {
            this.a.hide();
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onFailure(HMHttpResponseData hMHttpResponseData) {
            this.a.hide();
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onSuccess(HMHttpResponseData hMHttpResponseData) {
            if (hMHttpResponseData.getStatusCode() != 200) {
                this.a.hide();
                return;
            }
            try {
                this.a.show(new JSONObject(hMHttpResponseData.getResponseString()).optString("target"));
            } catch (Exception e) {
                HMLog.i(DeviceManualFaqWebApi.a, e.getMessage(), new Object[0]);
                this.a.hide();
            }
        }
    }

    public static void isDeviceManualFaqShow(Context context, String str, Callback callback) {
        HMWebUtil.doRequest(AboutUrlManager.assembleDeviceFaqUrl(context, str), null, Support.RequestSupport.GET, new a(callback));
    }
}
