package defpackage;

import android.content.Context;
import com.google.gson.annotations.SerializedName;
import com.miui.tsmclient.common.data.CommonResponseInfo;
import com.miui.tsmclient.common.net.request.SecureRequest;
import com.miui.tsmclient.entity.CardInfo;
import com.miui.tsmclient.net.TSMAuthContants;
import com.miui.tsmclient.util.DeviceUtils;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class c1t extends SecureRequest<a> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f4842b;

    public static class a extends CommonResponseInfo {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @SerializedName("data")
        public String f4843a;

        public String a() {
            return this.f4843a;
        }
    }

    public c1t(Context context, String str, String str2) {
        super("GET", TSMAuthContants.URL_QUERY_COMMON_DATA, a.class);
        this.f4842b = context;
        addParams(TSMAuthContants.PARAM_PDL, str2);
        addParams("key", str);
    }

    @Override // com.miui.tsmclient.common.net.request.SecureRequest, com.miui.tsmclient.common.net.request.BaseRequest
    public void addExtraParams() throws IOException {
        super.addExtraParams();
        addParams("deviceId", DeviceUtils.getDeviceId(this.f4842b, new CardInfo(CardInfo.CARD_TYPE_DUMMY)));
    }
}
