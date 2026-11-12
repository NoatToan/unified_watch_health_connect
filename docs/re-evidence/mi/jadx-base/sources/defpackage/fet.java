package defpackage;

import com.miui.tsmclient.common.data.CommonResponseInfo;
import com.miui.tsmclient.common.net.request.SecureRequest;
import com.miui.tsmclient.entity.CardInfo;
import com.miui.tsmclient.net.TSMAuthContants;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class fet extends SecureRequest<CommonResponseInfo> {
    public fet(String str, int i, String str2) {
        super("POST", TSMAuthContants.URL_REPORT_TRACK_RESULT, CommonResponseInfo.class);
        addParams("keyId", str);
        addParams("errorCode", String.valueOf(i));
        addParams("errorDesc", str2);
    }

    @Override // com.miui.tsmclient.common.net.request.SecureRequest, com.miui.tsmclient.common.net.request.BaseRequest
    public void addExtraParams() throws IOException {
        super.addExtraParams();
        try {
            addParams("cplc", new CardInfo(CardInfo.CARD_TYPE_DUMMY).getTerminal().getCPLC());
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new IOException("ReportTrackResultRequest getExtraParams failed", e);
        }
    }
}
