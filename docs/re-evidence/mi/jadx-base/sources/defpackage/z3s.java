package defpackage;

import com.miui.tsmclient.common.data.CommonResponseInfo;
import com.miui.tsmclient.common.net.request.SecureRequest;
import com.miui.tsmclient.net.TSMAuthContants;

/* JADX INFO: loaded from: classes3.dex */
public class z3s extends SecureRequest<CommonResponseInfo> {
    public z3s(String str, String str2) {
        super("POST", TSMAuthContants.URL_ICCOA2_REPORT_KEY_STATUS_ACTIVE, CommonResponseInfo.class);
        addParams("keyId", str);
        addParams(TSMAuthContants.PARAM_DK_ATTESTATION, str2);
    }
}
