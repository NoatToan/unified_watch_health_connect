package defpackage;

import android.text.TextUtils;
import com.miui.tsmclient.common.net.ResponseListener;
import com.miui.tsmclient.common.net.request.SecureRequestV2;
import com.miui.tsmclient.entity.CardInfo;
import com.miui.tsmclient.util.LogUtils;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class tns extends SecureRequestV2<String> {
    public tns(String str, ResponseListener<String> responseListener) {
        super("DELETE", "api/%s/v2/doorcards/" + str, String.class, responseListener);
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
            LogUtils.e("CloudMifareCardDeleteRequest get cplc failed.", e);
        }
    }
}
