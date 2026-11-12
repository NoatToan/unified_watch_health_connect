package defpackage;

import com.miui.tsmclient.common.net.ResponseListener;
import com.miui.tsmclient.common.net.request.SecureRequest;
import com.miui.tsmclient.entity.DoorCardArtsListInfo;
import com.miui.tsmclient.net.TSMAuthContants;

/* JADX INFO: loaded from: classes3.dex */
public class kxs extends SecureRequest<DoorCardArtsListInfo> {
    public kxs(String str, ResponseListener<DoorCardArtsListInfo> responseListener) {
        super("GET", TSMAuthContants.URL_MIFARE_LIST_ARTS, DoorCardArtsListInfo.class, responseListener);
        addParams("productId", str);
    }
}
