package defpackage;

import com.miui.tsmclient.common.net.ResponseListener;
import com.miui.tsmclient.common.net.request.SecureRequest;
import com.miui.tsmclient.entity.CardInfo;
import com.miui.tsmclient.net.TSMAuthContants;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class d5t extends SecureRequest<bvs> {
    public d5t(String str) {
        super("GET", TSMAuthContants.URL_GET_NOTIFICATION_TOKEN, bvs.class, (ResponseListener) null);
        addParams("deviceType", str);
    }

    @Override // com.miui.tsmclient.common.net.request.SecureRequest, com.miui.tsmclient.common.net.request.BaseRequest
    public void addExtraParams() throws IOException {
        super.addExtraParams();
        try {
            addParams("cplc", new CardInfo(CardInfo.CARD_TYPE_DUMMY).getTerminal().getCPLC());
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new IOException("GetNotificationTokenRequest getExtraParams failed", e);
        }
    }
}
