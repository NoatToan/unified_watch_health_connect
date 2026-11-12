package defpackage;

import com.miui.tsmclient.common.net.request.SecureRequest;
import com.miui.tsmclient.entity.CardInfo;
import com.miui.tsmclient.entity.SeInfoResponse;
import com.miui.tsmclient.net.TSMAuthContants;

/* JADX INFO: loaded from: classes3.dex */
public class s0t extends SecureRequest<SeInfoResponse> {
    public s0t(String str, String str2, String str3) {
        super("POST", CardInfo.CARD_TYPE_MIFARE.equals(str2) ? TSMAuthContants.URL_WRAP_SE_INFO : TSMAuthContants.URL_OUT_WRAP_SE_INFO, SeInfoResponse.class);
        addParams("spId", str).addParams("cardName", str2).addParams("cplc", str3);
    }
}
