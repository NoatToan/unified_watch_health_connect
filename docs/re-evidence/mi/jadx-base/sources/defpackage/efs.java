package defpackage;

import android.content.Context;
import com.miui.tsmclient.common.net.ResponseListener;
import com.miui.tsmclient.common.net.request.SecureRequest;
import com.miui.tsmclient.net.TSMAuthContants;
import com.miui.tsmclient.util.Constants;
import com.miui.tsmclient.util.DeviceUtils;

/* JADX INFO: loaded from: classes3.dex */
public class efs extends SecureRequest<a4s> {
    public efs(Context context, String str) {
        super("POST", TSMAuthContants.URL_QUERY_VEHICLE_PRODUCT_LIST_V1, a4s.class, (ResponseListener) null);
        addParams(TSMAuthContants.PARAM_QUERY_TYPE, str);
        addParams(TSMAuthContants.PARAM_DKF_VERSION_CODE, String.valueOf(DeviceUtils.getAppVersionCode(context, Constants.PACKAGE_NAME_DIGITAL_KEY)));
    }
}
