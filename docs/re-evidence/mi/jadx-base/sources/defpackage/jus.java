package defpackage;

import android.content.Context;
import android.location.Location;
import com.google.gson.annotations.SerializedName;
import com.miui.tsmclient.common.data.CommonResponseInfo;
import com.miui.tsmclient.common.net.ResponseListener;
import com.miui.tsmclient.common.net.request.SecureRequest;
import com.miui.tsmclient.entity.CardInfo;
import com.miui.tsmclient.entity.TravelInfo;
import com.miui.tsmclient.net.TSMAuthContants;
import com.miui.tsmclient.util.DeviceUtils;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class jus extends SecureRequest<a> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public CardInfo f23159b;

    public static final class a extends CommonResponseInfo {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @SerializedName("data")
        public TravelInfo f23160a;

        public TravelInfo a() {
            return this.f23160a;
        }
    }

    public jus(Context context, String str, String str2, CardInfo cardInfo, Location location, ResponseListener<a> responseListener) {
        super("POST", TSMAuthContants.URL_QUERY_SITE_INFO, a.class, responseListener);
        this.f23159b = cardInfo;
        addParams("aid", str);
        addParams(TSMAuthContants.PARAM_HCI_CONTENT, str2);
        addParams("deviceId", DeviceUtils.getDeviceId(context, cardInfo));
        if (location != null) {
            addParams("la", String.valueOf(location.getLatitude()));
            addParams(TSMAuthContants.PARAM_LONGITUDE, String.valueOf(location.getLongitude()));
        }
    }

    @Override // com.miui.tsmclient.common.net.request.SecureRequest, com.miui.tsmclient.common.net.request.BaseRequest
    public void addExtraParams() throws IOException {
        try {
            addParams("cplc", this.f23159b.getTerminal().getCPLC());
        } catch (IOException | InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new IOException("QueryCouponsRequest getExtraParams failed", e);
        }
    }
}
