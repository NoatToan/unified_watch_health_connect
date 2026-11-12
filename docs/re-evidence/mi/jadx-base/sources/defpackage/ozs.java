package defpackage;

import com.google.gson.annotations.SerializedName;
import com.miui.tsmclient.common.data.CommonResponseInfo;
import com.miui.tsmclient.common.net.request.SecureRequest;
import com.miui.tsmclient.entity.CardInfo;
import com.miui.tsmclient.net.TSMAuthContants;
import com.miui.tsmclient.util.LogUtils;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class ozs extends SecureRequest<b> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f29854b;

    public static class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f29855b = 2;
        public static int c = 4;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @SerializedName(CardInfo.KEY_TRANSFER_CARD_STATUS)
        public int f29856a;

        public boolean a() {
            int i = this.f29856a;
            int i2 = f29855b;
            if ((i & i2) != i2) {
                int i3 = c;
                if ((i & i3) != i3) {
                    return false;
                }
            }
            return true;
        }
    }

    public static class b extends CommonResponseInfo {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @SerializedName("data")
        public a f29857a;

        public a a() {
            return this.f29857a;
        }
    }

    public ozs() {
        super("GET", TSMAuthContants.QUERY_HAS_ISSUED_CARD, b.class);
        this.f29854b = 3000;
        setConnectTimeout(3000);
        setReadTimeout(3000);
        setWriteTimeout(3000);
    }

    @Override // com.miui.tsmclient.common.net.request.SecureRequest, com.miui.tsmclient.common.net.request.BaseRequest
    public void addExtraParams() throws IOException {
        super.addExtraParams();
        try {
            addParams("cplc", new CardInfo(CardInfo.CARD_TYPE_DUMMY).getTerminal().getCPLC());
        } catch (IOException e) {
            LogUtils.e("HasIssuedCardsRequest getExtraParams failed", e);
            throw e;
        } catch (InterruptedException e2) {
            Thread.currentThread().interrupt();
            LogUtils.e("HasIssuedCardsRequest getExtraParams failed", e2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.miui.tsmclient.common.net.request.SecureRequest, com.miui.tsmclient.common.net.request.BaseSecureRequest, com.miui.tsmclient.common.net.request.BaseRequest
    public boolean isSuccess() {
        return super.isSuccess() && ((b) getResult()).a() != null;
    }
}
