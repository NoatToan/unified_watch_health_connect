package defpackage;

import android.content.Context;
import com.miui.tsmclient.common.net.ResponseListener;
import com.miui.tsmclient.common.net.request.SecureRequest;
import com.miui.tsmclient.net.TSMAuthContants;
import com.miui.tsmclient.util.Constants;
import com.miui.tsmclient.util.DeviceUtils;

/* JADX INFO: loaded from: classes3.dex */
public class jjs extends SecureRequest<oas> {
    public jjs(Context context, ResponseListener<oas> responseListener) {
        super("POST", TSMAuthContants.URL_QUERY_WHOLE_VEHICLE_PRODUCT_LIST, oas.class, responseListener);
        addParams(TSMAuthContants.PARAM_DKF_VERSION_CODE, String.valueOf(DeviceUtils.getAppVersionCode(context, Constants.PACKAGE_NAME_DIGITAL_KEY)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.miui.tsmclient.common.net.request.SecureRequest, com.miui.tsmclient.common.net.request.BaseSecureRequest, com.miui.tsmclient.common.net.request.BaseRequest
    public boolean isSuccess() {
        return super.isSuccess() && ((oas) getResult()).a() != null;
    }
}
