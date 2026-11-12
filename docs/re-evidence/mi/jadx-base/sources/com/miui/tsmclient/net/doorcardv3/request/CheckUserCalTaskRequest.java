package com.miui.tsmclient.net.doorcardv3.request;

import com.miui.tsmclient.common.net.request.SecureRequest;
import com.miui.tsmclient.entity.CardInfo;
import com.miui.tsmclient.net.TSMAuthContants;
import com.miui.tsmclient.net.doorcardv3.response.CheckUserCalTaskResponse;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public class CheckUserCalTaskRequest extends SecureRequest<CheckUserCalTaskResponse> {
    public CheckUserCalTaskRequest() {
        super("GET", TSMAuthContants.URL_CHECK_USER_CAL_TASK_ACCESS, CheckUserCalTaskResponse.class);
    }

    @Override // com.miui.tsmclient.common.net.request.SecureRequest, com.miui.tsmclient.common.net.request.BaseRequest
    public void addExtraParams() throws IOException {
        try {
            addParams("cplc", new CardInfo(CardInfo.CARD_TYPE_DUMMY).getTerminal().getCPLC());
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
