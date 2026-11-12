package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.miui.tsmclient.common.net.ResponseListener;
import com.miui.tsmclient.common.net.request.SecureRequest;
import com.miui.tsmclient.entity.CardInfo;
import com.miui.tsmclient.entity.CouponResponseInfo;
import com.miui.tsmclient.entity.FeeInfo;
import com.miui.tsmclient.net.TSMAuthContants;
import com.miui.tsmclient.util.DeviceUtils;
import com.miui.tsmclient.util.LogUtils;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class ift extends SecureRequest<CouponResponseInfo> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public CardInfo f21103b;

    public ift(Context context, CardInfo cardInfo, FeeInfo feeInfo, Bundle bundle, ResponseListener<CouponResponseInfo> responseListener) {
        super("GET", TSMAuthContants.URL_QUERY_AVAILABLE_COUPONS, CouponResponseInfo.class, responseListener);
        this.f21103b = cardInfo;
        if (feeInfo != null) {
            addParams(TSMAuthContants.PARAM_FEEID, String.valueOf(feeInfo.mId));
        }
        addParams("deviceModel", DeviceUtils.getDeviceModel(this.f21103b));
        if (bundle.containsKey(TSMAuthContants.EXTRA_CUSTOM_FEE)) {
            addParams(TSMAuthContants.EXTRA_CUSTOM_FEE, bundle.getString(TSMAuthContants.EXTRA_CUSTOM_FEE));
            LogUtils.d("QueryCouponsRequest extraCustomFee:" + bundle.getString(TSMAuthContants.EXTRA_CUSTOM_FEE));
        }
    }

    @Override // com.miui.tsmclient.common.net.request.SecureRequest, com.miui.tsmclient.common.net.request.BaseRequest
    public void addExtraParams() throws IOException {
        try {
            addParams("cplc", this.f21103b.getTerminal().getCPLC());
        } catch (IOException | InterruptedException e) {
            throw new IOException("QueryCouponsRequest getExtraParams failed", e);
        }
    }
}
