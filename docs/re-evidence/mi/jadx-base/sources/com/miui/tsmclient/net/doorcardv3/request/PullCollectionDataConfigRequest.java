package com.miui.tsmclient.net.doorcardv3.request;

import com.miui.tsmclient.common.net.ResponseListener;
import com.miui.tsmclient.common.net.request.SecureRequest;
import com.miui.tsmclient.entity.CardInfo;
import com.miui.tsmclient.net.TSMAuthContants;
import com.miui.tsmclient.net.doorcardv3.response.PullCollectionDataConfigResponse;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public class PullCollectionDataConfigRequest extends SecureRequest<PullCollectionDataConfigResponse> {
    public PullCollectionDataConfigRequest() {
        super("GET", TSMAuthContants.URL_PULL_COLLECTION_DATA_CONFIG, PullCollectionDataConfigResponse.class, (ResponseListener) null);
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
