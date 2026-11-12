package defpackage;

import com.miui.tsmclient.common.net.ResponseListener;
import com.miui.tsmclient.common.net.request.SecureRequest;
import com.miui.tsmclient.net.TSMAuthContants;

/* JADX INFO: loaded from: classes3.dex */
public class tbt extends SecureRequest<d1t> {
    public tbt() {
        super("GET", TSMAuthContants.URL_QUERY_POLICY, d1t.class, (ResponseListener) null);
    }
}
