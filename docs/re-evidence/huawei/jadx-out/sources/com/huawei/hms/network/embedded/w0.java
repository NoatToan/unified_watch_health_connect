package com.huawei.hms.network.embedded;

import com.huawei.hms.framework.common.ContextHolder;
import com.huawei.hms.framework.common.NetworkUtil;
import com.huawei.hms.framework.common.StringUtils;
import com.huawei.hms.framework.common.hianalytics.InitReport;
import com.huawei.hms.network.httpclient.Interceptor;
import com.huawei.hms.network.httpclient.Response;
import com.huawei.hms.network.httpclient.ResponseBody;
import com.huawei.hms.network.httpclient.websocket.WebSocket;
import com.huawei.phoneservice.feedbackcommon.network.FeedbackWebConstants;
import java.io.IOException;

/* JADX INFO: loaded from: classes34.dex */
public class w0 extends Interceptor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f15552b = "CallServerInterceptor";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WebSocket f15553a;

    @Override // com.huawei.hms.network.httpclient.Interceptor
    public Response<ResponseBody> intercept(Interceptor.Chain chain) throws IOException {
        if (!(chain instanceof h1.b)) {
            throw new ClassCastException("the classType has error!,please use SafeApi.SafeChain");
        }
        h1.b bVar = (h1.b) chain;
        z2 rCEventListener = bVar.getRCEventListener();
        h1.d dVarA = a(bVar.request());
        h1.d dVarTraceRequestNetworkKitOutEvent = g4.getInstance().traceRequestNetworkKitOutEvent(dVarA);
        rCEventListener.rcNetworkInterceptorReqEnd(dVarA);
        if (!InitReport.isHasConnectNet()) {
            InitReport.enableConnectNet();
            NetworkUtil.updateCurrentNetworkType();
        }
        h1.f<ResponseBody> fVarExecute = bVar.getRequestTask().execute(dVarTraceRequestNetworkKitOutEvent, this.f15553a);
        rCEventListener.rcNetworkInterceptorResStart();
        g4.getInstance().traceResponseNetworkKitInEvent(rCEventListener);
        return fVarExecute;
    }

    private h1.d a(h1.d dVar) {
        for (String str : dVar.getHeaders().keySet()) {
            if (str != null && StringUtils.toLowerCase(str).equals(FeedbackWebConstants.USER_AGENT)) {
                return dVar;
            }
        }
        return new h1.d(dVar.newBuilder().addHeader("User-Agent", j1.getUserAgent(ContextHolder.getAppContext())).build());
    }

    public w0(WebSocket webSocket) {
        this.f15553a = webSocket;
    }
}
