package defpackage;

import com.miui.tsmclient.common.data.CommonResponseInfo;
import com.miui.tsmclient.common.net.request.SecureRequest;
import com.miui.tsmclient.net.TSMAuthContants;

/* JADX INFO: loaded from: classes3.dex */
public class ezs extends SecureRequest<CommonResponseInfo> {
    public ezs(String str, String str2, String str3) {
        super("POST", TSMAuthContants.URL_OUT_VERIFY_SP_INFO, CommonResponseInfo.class);
        addParams("spId", str).addParams("cardName", str2).addParams(TSMAuthContants.PARAM_APP_SIGN, str3);
    }
}
