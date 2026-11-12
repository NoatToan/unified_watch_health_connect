package defpackage;

import com.miui.tsmclient.common.data.CommonResponseInfo;
import com.miui.tsmclient.common.net.request.SecureRequest;
import com.miui.tsmclient.net.TSMAuthContants;

/* JADX INFO: loaded from: classes3.dex */
public class yft extends SecureRequest<CommonResponseInfo> {
    public yft(String str, String str2, String str3, int i) {
        super("POST", TSMAuthContants.URL_UPDATE_SHARE_INVITATION, CommonResponseInfo.class);
        addParams("keyId", str);
        addParams(TSMAuthContants.PARAM_SHARED_ID, str2);
        addParams("mailboxId", str3);
        addParams(TSMAuthContants.PARAM_SHARE_DATA_TYPE, String.valueOf(i));
    }
}
