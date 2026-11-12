package com.miui.tsmclient.net.doorcardv3.request;

import com.miui.tsmclient.common.net.ResponseListener;
import com.miui.tsmclient.common.net.request.SecureRequest;
import com.miui.tsmclient.entity.CardInfo;
import com.miui.tsmclient.entity.MifareCardInfo;
import com.miui.tsmclient.net.TSMAuthContants;
import com.miui.tsmclient.net.doorcardv3.response.PullSectorKeyResponse;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public class PullSectorKeyRequest extends SecureRequest<PullSectorKeyResponse> {
    private CardInfo mCardInfo;

    public PullSectorKeyRequest(String str, MifareCardInfo mifareCardInfo, ResponseListener<PullSectorKeyResponse> responseListener) {
        super("GET", TSMAuthContants.URL_GET_SECTOR_KEY, PullSectorKeyResponse.class, responseListener);
        this.mCardInfo = mifareCardInfo;
        addParams(TSMAuthContants.PARAM_REFID, str);
    }

    @Override // com.miui.tsmclient.common.net.request.SecureRequest, com.miui.tsmclient.common.net.request.BaseRequest
    public void addExtraParams() throws IOException {
        try {
            addParams("cplc", this.mCardInfo.getTerminal().getCPLC());
        } catch (IOException | InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new IOException("PullSectorKeyRequest getExtraParams failed", e);
        }
    }
}
