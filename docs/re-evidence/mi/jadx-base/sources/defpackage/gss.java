package defpackage;

import android.text.TextUtils;
import com.miui.tsmclient.common.net.request.SecureRequest;
import com.miui.tsmclient.entity.CardInfo;
import com.miui.tsmclient.entity.digitalkey.NotificationToken;
import com.miui.tsmclient.net.TSMAuthContants;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class gss extends SecureRequest<kjs> {
    public gss(String str, qzs qzsVar, NotificationToken notificationToken, String str2, String str3, String str4, int i, String str5, String str6, String str7) {
        super("POST", TSMAuthContants.URL_CREATE_MAILBOX, kjs.class);
        addParams(TSMAuthContants.PARAM_DEVICE_CLAIM, str);
        addParams(TSMAuthContants.PARAM_PAYLOAD_TYPE, qzsVar.c());
        addParams(TSMAuthContants.PARAM_PAYLOAD_DATA, qzsVar.b());
        addParams(TSMAuthContants.PARAM_NOTIFICATION_TOKEN_TYPE, notificationToken.getType());
        addParams(TSMAuthContants.PARAM_NOTIFICATION_TOKEN_DATA, notificationToken.getTokenData());
        addParams("keyId", str2);
        addParams(TSMAuthContants.PARAM_KEY_VALID_FROM, str3);
        addParams(TSMAuthContants.PARAM_KEY_VALID_TO, str4);
        addParams(TSMAuthContants.PARAM_KEY_RIGHT, String.valueOf(i));
        if (!TextUtils.isEmpty(str5)) {
            addParams("friendlyName", str5);
        }
        if (!TextUtils.isEmpty(str6)) {
            addParams(TSMAuthContants.PARAM_RECEIVER_TYPE, str6);
        }
        if (TextUtils.isEmpty(str7)) {
            return;
        }
        addParams(TSMAuthContants.PARAM_RECEIVER_DEVICE_TYPE, str7);
    }

    @Override // com.miui.tsmclient.common.net.request.SecureRequest, com.miui.tsmclient.common.net.request.BaseRequest
    public void addExtraParams() throws IOException {
        super.addExtraParams();
        try {
            addParams("cplc", new CardInfo(CardInfo.CARD_TYPE_DUMMY).getTerminal().getCPLC());
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new IOException("CreateMailboxRequest getExtraParams failed", e);
        }
    }
}
