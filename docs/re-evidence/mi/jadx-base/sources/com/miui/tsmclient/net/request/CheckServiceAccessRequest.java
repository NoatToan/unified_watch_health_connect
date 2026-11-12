package com.miui.tsmclient.net.request;

import com.miui.tsmclient.common.data.CommonResponseInfo;
import com.miui.tsmclient.common.net.ResponseListener;
import com.miui.tsmclient.common.net.request.SecureRequest;
import com.miui.tsmclient.entity.CardInfo;
import com.miui.tsmclient.net.TSMAuthContants;
import com.miui.tsmclient.util.EnvironmentConfig;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public class CheckServiceAccessRequest extends SecureRequest<CommonResponseInfo> {
    public CheckServiceAccessRequest(String str, ResponseListener<CommonResponseInfo> responseListener) {
        this("ALL_CONFIG", str, responseListener);
    }

    @Override // com.miui.tsmclient.common.net.request.SecureRequest, com.miui.tsmclient.common.net.request.BaseRequest
    public void addExtraParams() throws IOException {
        super.addExtraParams();
        try {
            if (EnvironmentConfig.isSupportNfc()) {
                addParams("cplc", new CardInfo(CardInfo.CARD_TYPE_DUMMY).getTerminal().getCPLC());
            }
        } catch (IOException | InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new IOException("CheckServiceAccessRequest getExtraParams failed", e);
        }
    }

    public CheckServiceAccessRequest(String str, String str2, ResponseListener<CommonResponseInfo> responseListener) {
        super("POST", TSMAuthContants.URL_QUERY_CHECK_SERVICE_ACCESS, CommonResponseInfo.class, responseListener);
        addParams("target", str);
        addParams(TSMAuthContants.PARAM_CONTROL_SCOPE, str2);
    }

    public CheckServiceAccessRequest(String str, String str2, String str3, ResponseListener<CommonResponseInfo> responseListener) {
        super("POST", TSMAuthContants.URL_QUERY_CHECK_SERVICE_ACCESS, CommonResponseInfo.class, responseListener);
        addParams("target", str);
        addParams(TSMAuthContants.PARAM_CONTROL_SCOPE, str2);
        addParams(TSMAuthContants.PARAM_RESOURCE, str3);
    }
}
