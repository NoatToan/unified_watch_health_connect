package defpackage;

import android.content.Context;
import com.huawei.hms.framework.network.restclient.RestClient;
import com.huawei.hms.framework.network.restclient.RestClientGlobalInstance;

/* JADX INFO: loaded from: classes3.dex */
public class noy {
    public static RestClient e(Context context, String str) {
        RestClientGlobalInstance.getInstance().init(context);
        return new RestClient.Builder(context).baseUrl(str).build();
    }
}
