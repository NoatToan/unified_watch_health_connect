package defpackage;

import com.miui.tsmclient.common.net.request.SecureRequest;
import com.miui.tsmclient.entity.ReturnCardReasonResponseInfo;
import com.miui.tsmclient.net.TSMAuthContants;

/* JADX INFO: loaded from: classes3.dex */
public class f9s extends SecureRequest<ReturnCardReasonResponseInfo> {
    public f9s() {
        super("GET", TSMAuthContants.URL_RETURN_CARD_REASON, ReturnCardReasonResponseInfo.class);
    }
}
