package com.xiaomi.hm.health.discovery.jsbridge.function;

import com.huami.discovery.bridge.jsbridge.JsCallBackFunction;
import com.huami.discovery.bridge.jsbridge.api.VerifySignApiHandler;
import com.huami.discovery.bridge.jsbridge.api.callback.VerifiedCallback;
import com.huami.network.base.handler.IHMHttpResponseHandler;
import com.huami.network.base.model.HMHttpResponseData;
import com.huami.network.base.model.Support;
import com.huami.network.hmnetwork.server.HMServerDef;
import com.huami.network.hmnetwork.webapi.HMWebUtil;
import com.huami.tools.log.HMLog;
import java.util.Map;

/* JADX INFO: loaded from: classes21.dex */
public class VerifySignHandler implements VerifySignApiHandler {
    private static final String a = "VerifySignHandler";
    private static final String b = "jsbridge/verify";

    public class a extends IHMHttpResponseHandler {
        public final /* synthetic */ VerifiedCallback a;
        public final /* synthetic */ JsCallBackFunction b;

        public a(final VerifiedCallback val$callback, final JsCallBackFunction val$function) {
            this.a = val$callback;
            this.b = val$function;
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCancel(int type) {
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCompleted() {
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onError(Throwable throwable) {
        }

        @Override // com.huami.network.base.handler.IHMHttpResponseHandler
        public void onItem(HMHttpResponseData item) {
            HMLog.d(VerifySignHandler.a, "statuscode==" + item.getStatusCode(), new Object[0]);
            this.a.signed(item.isSuccess(), new String(item.getResponseBody()), this.b);
        }
    }

    @Override // com.huami.discovery.bridge.jsbridge.api.VerifySignApiHandler
    public void requestToVerify(Map<String, String> params, JsCallBackFunction function, VerifiedCallback callback) {
        String url = HMServerDef.getUrl(b);
        Map<String, Object> systemParams = HMWebUtil.getSystemParams();
        systemParams.putAll(params);
        HMWebUtil.doRequest(url, systemParams, Support.RequestSupport.GET, new a(callback, function));
    }
}
