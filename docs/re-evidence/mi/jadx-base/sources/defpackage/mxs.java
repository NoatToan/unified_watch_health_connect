package defpackage;

import com.miui.tsmclient.common.data.CommonResponseInfo;
import com.miui.tsmclient.common.net.request.SecureRequest;
import com.miui.tsmclient.net.TSMAuthContants;

/* JADX INFO: loaded from: classes3.dex */
public class mxs extends SecureRequest<CommonResponseInfo> {
    public mxs(String str, String str2) {
        super("POST", TSMAuthContants.URL_DELETE_SHARE_INVITATION, CommonResponseInfo.class);
        addParams("keyId", str);
        addParams("mailboxId", str2);
    }
}
