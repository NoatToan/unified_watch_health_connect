package defpackage;

import com.miui.tsmclient.common.data.CommonResponseInfo;
import com.miui.tsmclient.common.net.ResponseListener;
import com.miui.tsmclient.common.net.request.SecureRequest;
import com.miui.tsmclient.entity.CardInfo;
import com.miui.tsmclient.net.TSMAuthContants;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class ddt extends SecureRequest<CommonResponseInfo> {
    public ddt(String str, String str2, String str3) {
        super("POST", TSMAuthContants.URL_REDEEM_SESSION, CommonResponseInfo.class, (ResponseListener) null);
        addParams("vehicleOEMId", str).addParams("sessionId", str2).addParams(TSMAuthContants.PARAM_VEHICLE_OEM_URL, str3);
    }

    @Override // com.miui.tsmclient.common.net.request.SecureRequest, com.miui.tsmclient.common.net.request.BaseRequest
    public void addExtraParams() throws IOException {
        super.addExtraParams();
        try {
            addParams("cplc", new CardInfo(CardInfo.CARD_TYPE_DUMMY).getTerminal().getCPLC());
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new IOException("RedeemSessionRequest getExtraParams failed", e);
        }
    }
}
