package defpackage;

import com.miui.tsmclient.common.data.CommonResponseInfo;
import com.miui.tsmclient.common.net.request.BaseRequest;
import com.miui.tsmclient.net.TSMAuthContants;

/* JADX INFO: loaded from: classes3.dex */
public class pdt extends x8t<CommonResponseInfo> {
    public pdt(String str, String str2, String str3) {
        super(BaseRequest.Method.PATCH, str2, CommonResponseInfo.class);
        addHeader(TSMAuthContants.PARAM_MAILBOX_REQUEST_ID, str3);
        addHeader(TSMAuthContants.PARAM_HEADER_DEVICE_CLAIM, str);
    }

    @Override // com.miui.tsmclient.common.net.request.BaseSecureRequest, com.miui.tsmclient.common.net.request.BaseRequest
    public String getUrl() {
        return this.mPath;
    }
}
