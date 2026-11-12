package defpackage;

import com.miui.tsmclient.common.net.ResponseListener;
import com.miui.tsmclient.common.net.request.SecureRequest;
import com.miui.tsmclient.entity.DoorCardProducts;
import com.miui.tsmclient.net.TSMAuthContants;

/* JADX INFO: loaded from: classes3.dex */
public class fgt extends SecureRequest<DoorCardProducts> {
    public fgt(ResponseListener<DoorCardProducts> responseListener) {
        super("GET", TSMAuthContants.URL_QUERY_DOOR_CARD_PRODUCT_LIST, DoorCardProducts.class, responseListener);
    }
}
