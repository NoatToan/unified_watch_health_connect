package defpackage;

import android.text.TextUtils;
import com.miui.tsmclient.common.net.request.SecureRequestV2;
import com.miui.tsmclient.entity.CardInfo;
import com.miui.tsmclient.net.TSMAuthContants;
import com.miui.tsmclient.util.LogUtils;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class d7t extends SecureRequestV2<d3t.b> {
    public d7t(String str, String str2, String str3) {
        super("POST", TSMAuthContants.URL_MIFARE_CLOUD_CARDS_RESTORE, d3t.b.class);
        addParams("cid", str2);
        addParams("sessionId", str);
        addParams("applyChannel", TextUtils.isEmpty(str3) ? "tsmclient" : str3);
    }

    @Override // com.miui.tsmclient.common.net.request.SecureRequestV2, com.miui.tsmclient.common.net.request.BaseRequest
    public void addExtraParams() throws IOException {
        super.addExtraParams();
        try {
            String cplc = new CardInfo(CardInfo.CARD_TYPE_DUMMY).getTerminal().getCPLC();
            if (TextUtils.isEmpty(cplc)) {
                return;
            }
            addParams("cplc", cplc);
        } catch (InterruptedException e) {
            LogUtils.e("MifareCardDownloadRequest get cplc failed.", e);
        }
    }
}
