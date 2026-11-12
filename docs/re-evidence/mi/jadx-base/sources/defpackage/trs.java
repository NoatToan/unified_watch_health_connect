package defpackage;

import com.miui.tsmclient.common.data.CommonResponseInfo;
import com.miui.tsmclient.common.net.request.SecureRequest;
import com.miui.tsmclient.net.TSMAuthContants;

/* JADX INFO: loaded from: classes3.dex */
public class trs extends SecureRequest<CommonResponseInfo> {
    public trs(String str, String str2, String str3, String str4) {
        super("GET", TSMAuthContants.URL_OUT_TRANSIT_SERVICE_STATUS, CommonResponseInfo.class);
        addParams("spId", str).addParams("cardName", str2).addParams("cplc", str3).addParams("actionType", str4);
    }
}
