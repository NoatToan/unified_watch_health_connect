package defpackage;

import com.miui.tsmclient.common.net.ResponseListener;
import com.miui.tsmclient.common.net.request.SecureRequest;
import com.miui.tsmclient.entity.CardInfo;
import com.miui.tsmclient.net.TSMAuthContants;
import com.miui.tsmclient.util.ObjectUtils;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class uns extends SecureRequest<ffs> {
    public uns(String str, String str2) {
        super("GET", TSMAuthContants.URL_GET_CERTIFICATE, ffs.class, (ResponseListener) null);
        addParams("vehicleOEMId", str);
        addParams(TSMAuthContants.PARAM_CERTIFICATE_TYPE, str2);
    }

    @Override // com.miui.tsmclient.common.net.request.SecureRequest, com.miui.tsmclient.common.net.request.BaseRequest
    public void addExtraParams() throws IOException {
        super.addExtraParams();
        try {
            addParams("cplc", new CardInfo(CardInfo.CARD_TYPE_DUMMY).getTerminal().getCPLC());
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new IOException("CertificateRequest getExtraParams failed", e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.miui.tsmclient.common.net.request.SecureRequest, com.miui.tsmclient.common.net.request.BaseSecureRequest, com.miui.tsmclient.common.net.request.BaseRequest
    public boolean isSuccess() {
        return super.isSuccess() && !ObjectUtils.isCollectionEmpty(((ffs) getResult()).a());
    }
}
