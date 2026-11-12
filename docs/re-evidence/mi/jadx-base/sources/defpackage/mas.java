package defpackage;

import android.content.Context;
import com.miui.tsmclient.common.net.ResponseListener;
import com.miui.tsmclient.common.net.request.SecureRequest;
import com.miui.tsmclient.entity.digitalkey.AccessControlResponseInfo;
import com.miui.tsmclient.net.TSMAuthContants;
import com.miui.tsmclient.util.Constants;
import com.miui.tsmclient.util.DeviceUtils;

/* JADX INFO: loaded from: classes3.dex */
public class mas extends SecureRequest<AccessControlResponseInfo> {
    public mas(Context context, String str, String str2, ResponseListener<AccessControlResponseInfo> responseListener) {
        super("POST", TSMAuthContants.URL_QUERY_CCC_CHECK_SERVICE_ACCESS, AccessControlResponseInfo.class, responseListener);
        addParams("target", "CAR_KEY");
        addParams(TSMAuthContants.PARAM_CONTROL_SCOPE, str);
        addParams(TSMAuthContants.PARAM_RESOURCE, str2);
        addParams(TSMAuthContants.PARAM_DKF_VERSION_CODE, String.valueOf(DeviceUtils.getAppVersionCode(context, Constants.PACKAGE_NAME_DIGITAL_KEY)));
    }

    public mas(Context context, String str, String str2, String str3, ResponseListener<AccessControlResponseInfo> responseListener) {
        this(context, str, str2, responseListener);
        addParams("deviceModel", str3);
    }
}
