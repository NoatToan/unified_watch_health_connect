package defpackage;

import android.content.Context;
import com.miui.tsmclient.common.data.CommonResponseInfo;
import com.miui.tsmclient.common.net.ResponseListener;
import com.miui.tsmclient.common.net.request.SecureRequest;
import com.miui.tsmclient.entity.ServiceAvailableInfo;
import com.miui.tsmclient.net.TSMAuthContants;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class ijs extends SecureRequest<CommonResponseInfo> {
    public ijs(Context context, ServiceAvailableInfo serviceAvailableInfo, ResponseListener responseListener) {
        super("POST", TSMAuthContants.URL_CHECK_SERVICE_AVAILABLE, CommonResponseInfo.class, responseListener);
        if (serviceAvailableInfo != null) {
            for (Map.Entry<String, String> entry : serviceAvailableInfo.getParams(context).entrySet()) {
                addParams(entry.getKey(), entry.getValue());
            }
        }
    }
}
