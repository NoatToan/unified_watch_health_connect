package defpackage;

import com.miui.tsmclient.entity.digitalkey.NotificationToken;
import com.miui.tsmclient.net.TSMAuthContants;

/* JADX INFO: loaded from: classes3.dex */
public class jft extends x8t<e5t> {
    public jft(String str, String str2, qzs qzsVar, String str3, NotificationToken notificationToken) {
        super("PUT", str2, e5t.class);
        addHeader(TSMAuthContants.PARAM_MAILBOX_REQUEST_ID, str3);
        addHeader(TSMAuthContants.PARAM_HEADER_DEVICE_CLAIM, str);
        a(TSMAuthContants.PARAM_NOTIFICATION_TOKEN, notificationToken);
        a(TSMAuthContants.PARAM_PAYLOAD, qzsVar);
    }

    @Override // com.miui.tsmclient.common.net.request.BaseSecureRequest, com.miui.tsmclient.common.net.request.BaseRequest
    public String getUrl() {
        return this.mPath;
    }
}
