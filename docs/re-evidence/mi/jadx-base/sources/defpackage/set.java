package defpackage;

import com.miui.tsmclient.common.data.CommonResponseInfo;
import com.miui.tsmclient.common.net.request.SecureRequest;
import com.miui.tsmclient.entity.CardInfo;
import com.miui.tsmclient.net.TSMAuthContants;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class set extends SecureRequest<CommonResponseInfo> {
    public set(String str, String str2, String str3, String str4, String str5, String str6) {
        super("POST", TSMAuthContants.URL_TERMINATE_REMOTE_KEY, CommonResponseInfo.class);
        addParams("keyId", str);
        addParams(TSMAuthContants.PARAM_SHARED_ID, str2);
        addParams(TSMAuthContants.PARAM_REMOTE_TERMINATION_REQUEST_VERSION, str3);
        addParams(TSMAuthContants.PARAM_REMOTE_EPHEMERAL_PUBLIC_KEY, str4);
        addParams(TSMAuthContants.PARAM_REMOTE_TERMINATION_PUBLIC_KEY_HASH, str5);
        addParams(TSMAuthContants.PARAM_REMOTE_TERMINATION_REQUEST, str6);
    }

    @Override // com.miui.tsmclient.common.net.request.SecureRequest, com.miui.tsmclient.common.net.request.BaseRequest
    public void addExtraParams() throws IOException {
        super.addExtraParams();
        try {
            addParams("cplc", new CardInfo(CardInfo.CARD_TYPE_DUMMY).getTerminal().getCPLC());
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new IOException("TerminateRemoteDigitalKeyRequest getExtraParams failed", e);
        }
    }
}
