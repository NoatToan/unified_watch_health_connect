package com.huami.moving.webapi;

import com.huami.feature.config.FeatureSwitch;
import com.huami.mifit.sportlib.webkit.ISportHttpRequester;
import com.huami.mifit.sportlib.webkit.ISportHttpResponseHandler;
import com.huami.moving.hkwebapi.HttpKitCommonAPI;
import com.huami.network.base.model.HMHttpResponseData;
import com.huami.network.base.model.Support;
import com.huami.network.hmnetwork.handler.IHMSimpleHttpResponseHandler;
import com.huami.network.hmnetwork.server.HMServerDef;
import com.huami.network.hmnetwork.webapi.HMWebUtil;
import com.huami.network.hmnetwork.webapi.WebResponse;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import kotlin.Lazy;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes5.dex */
public class SportHttpAPIImpl implements ISportHttpRequester {
    private static volatile SportHttpAPIImpl a;
    private static Lazy<FeatureSwitch> b = KoinJavaComponent.inject(FeatureSwitch.class);

    public class a implements HttpKitCommonAPI.PutRequestListener {
        public final /* synthetic */ WebResponse a;

        public a(WebResponse webResponse) {
            this.a = webResponse;
        }

        @Override // com.huami.moving.hkwebapi.HttpKitCommonAPI.PutRequestListener
        public void requestErrorListener() {
        }

        @Override // com.huami.moving.hkwebapi.HttpKitCommonAPI.PutRequestListener
        public void requestSuccessListener() {
            this.a.copy(WebResponse.createNoBodySuccessResponse());
        }
    }

    public class b extends IHMSimpleHttpResponseHandler {
        public final /* synthetic */ ISportHttpResponseHandler a;
        public final /* synthetic */ WebResponse b;

        public b(ISportHttpResponseHandler iSportHttpResponseHandler, WebResponse webResponse) {
            this.a = iSportHttpResponseHandler;
            this.b = webResponse;
        }

        @Override // com.huami.network.hmnetwork.handler.IHMSimpleHttpResponseHandler, com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCancel(int i) {
            super.onCancel(i);
            ISportHttpResponseHandler iSportHttpResponseHandler = this.a;
            if (iSportHttpResponseHandler != null) {
                iSportHttpResponseHandler.onCanceled(i);
            }
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onFailure(HMHttpResponseData hMHttpResponseData) {
            String str = hMHttpResponseData.getResponseBody() != null ? new String(hMHttpResponseData.getResponseBody(), StandardCharsets.UTF_8) : "";
            ISportHttpResponseHandler iSportHttpResponseHandler = this.a;
            if (iSportHttpResponseHandler != null) {
                iSportHttpResponseHandler.onFailed(str);
            }
        }

        @Override // com.huami.network.hmnetwork.handler.IHMSimpleHttpResponseHandler
        public void onSuccess(WebResponse webResponse, HMHttpResponseData hMHttpResponseData) {
            if (hMHttpResponseData.isSuccess() && webResponse.success()) {
                ISportHttpResponseHandler iSportHttpResponseHandler = this.a;
                if (iSportHttpResponseHandler != null) {
                    iSportHttpResponseHandler.onSuccessed(webResponse.data);
                }
                this.b.copy(webResponse);
            }
        }
    }

    public class c implements HttpKitCommonAPI.PutRequestListener {
        public c() {
        }

        @Override // com.huami.moving.hkwebapi.HttpKitCommonAPI.PutRequestListener
        public void requestErrorListener() {
        }

        @Override // com.huami.moving.hkwebapi.HttpKitCommonAPI.PutRequestListener
        public void requestSuccessListener() {
        }
    }

    public class d extends IHMSimpleHttpResponseHandler {
        public final /* synthetic */ ISportHttpResponseHandler a;

        public d(ISportHttpResponseHandler iSportHttpResponseHandler) {
            this.a = iSportHttpResponseHandler;
        }

        @Override // com.huami.network.hmnetwork.handler.IHMSimpleHttpResponseHandler, com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCancel(int i) {
            super.onCancel(i);
            ISportHttpResponseHandler iSportHttpResponseHandler = this.a;
            if (iSportHttpResponseHandler != null) {
                iSportHttpResponseHandler.onCanceled(i);
            }
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onFailure(HMHttpResponseData hMHttpResponseData) {
            String str = hMHttpResponseData.getResponseBody() != null ? new String(hMHttpResponseData.getResponseBody(), StandardCharsets.UTF_8) : "";
            ISportHttpResponseHandler iSportHttpResponseHandler = this.a;
            if (iSportHttpResponseHandler != null) {
                iSportHttpResponseHandler.onFailed(str);
            }
        }

        @Override // com.huami.network.hmnetwork.handler.IHMSimpleHttpResponseHandler
        public void onSuccess(WebResponse webResponse, HMHttpResponseData hMHttpResponseData) {
            ISportHttpResponseHandler iSportHttpResponseHandler;
            if (hMHttpResponseData.isSuccess() && webResponse.success() && (iSportHttpResponseHandler = this.a) != null) {
                iSportHttpResponseHandler.onSuccessed(webResponse.data);
            }
        }
    }

    private SportHttpAPIImpl() {
    }

    public static SportHttpAPIImpl getInstance() {
        if (a == null) {
            synchronized (SportHttpAPIImpl.class) {
                if (a == null) {
                    a = new SportHttpAPIImpl();
                }
            }
        }
        return a;
    }

    @Override // com.huami.mifit.sportlib.webkit.ISportHttpRequester
    public void doHttpRequest(String str, Map<String, Object> map, int i, ISportHttpResponseHandler iSportHttpResponseHandler) {
        String runningUrl = HMServerDef.getRunningUrl(str);
        Map<String, Object> systemParams = HMWebUtil.getSystemParams();
        systemParams.putAll(map);
        Support.RequestSupport requestSupport = Support.RequestSupport.GET;
        if (i == 26) {
            requestSupport = Support.RequestSupport.POST;
        } else if (i == 28) {
            requestSupport = Support.RequestSupport.PUT;
        }
        if (requestSupport == Support.RequestSupport.PUT) {
            HttpKitCommonAPI.putRequestAPI(runningUrl, systemParams, new c());
        } else {
            HMWebUtil.doRequest(runningUrl, systemParams, requestSupport, new d(iSportHttpResponseHandler));
        }
    }

    @Override // com.huami.mifit.sportlib.webkit.ISportHttpRequester
    public boolean doHttpRequestSync(String str, Map<String, Object> map, int i, ISportHttpResponseHandler iSportHttpResponseHandler) {
        String runningUrl = HMServerDef.getRunningUrl(str);
        WebResponse webResponse = new WebResponse();
        Map<String, Object> systemParams = HMWebUtil.getSystemParams();
        systemParams.putAll(map);
        Support.RequestSupport requestSupport = Support.RequestSupport.GET;
        if (i == 26) {
            requestSupport = Support.RequestSupport.POST;
        } else if (i == 28) {
            requestSupport = Support.RequestSupport.PUT;
        }
        if (requestSupport == Support.RequestSupport.PUT) {
            HttpKitCommonAPI.putRequestAPI(runningUrl, systemParams, new a(webResponse));
        } else {
            HMWebUtil.doRequest(runningUrl, systemParams, requestSupport, true, new b(iSportHttpResponseHandler, webResponse));
        }
        return webResponse.success();
    }

    @Override // com.huami.mifit.sportlib.webkit.ISportHttpRequester
    public boolean isSportDataUploadEnable() {
        return b.getValue().isSyncDataEnable();
    }
}
