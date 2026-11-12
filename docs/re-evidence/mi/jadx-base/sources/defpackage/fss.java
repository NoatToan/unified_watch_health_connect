package defpackage;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.miui.tsmclient.common.net.ResponseListener;
import com.miui.tsmclient.common.net.request.SecureRequestV2;
import com.miui.tsmclient.entity.CardInfo;
import com.miui.tsmclient.entity.DoorCardProduct;
import com.miui.tsmclient.net.TSMAuthContants;
import com.miui.tsmclient.util.LogUtils;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class fss extends SecureRequestV2<a> {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @SerializedName("cloudCards")
        public List<DoorCardProduct> f18168a;

        public List<DoorCardProduct> a() {
            return this.f18168a;
        }
    }

    public fss(ResponseListener responseListener) {
        super("GET", TSMAuthContants.URL_QUERY_MIFARE_CLOUD_CARD_LIST, a.class, responseListener);
    }

    @Override // com.miui.tsmclient.common.net.request.SecureRequestV2, com.miui.tsmclient.common.net.request.BaseRequest
    public void addExtraParams() throws IOException {
        super.addExtraParams();
        try {
            String cplc = new CardInfo(CardInfo.CARD_TYPE_DUMMY).getTerminal().getCPLC();
            if (TextUtils.isEmpty(cplc)) {
                return;
            }
            addParams("cplc", cplc);
        } catch (InterruptedException e) {
            LogUtils.e("CloudMifareCardListRequest get cplc failed.", e);
        }
    }
}
