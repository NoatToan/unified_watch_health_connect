package defpackage;

import com.huawei.hwdevice.phoneprocess.mgr.httpproxy.HttpRequestInfo;
import com.huawei.hwdevice.phoneprocess.mgr.httpproxy.factory.HttpProxyParamsFactory;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class mpa {
    private static final Map<HttpRequestInfo.CloudType, HttpProxyParamsFactory> e;

    static {
        HashMap map = new HashMap();
        e = map;
        map.put(HttpRequestInfo.CloudType.COMMON_CLOUD, new mot());
        map.put(HttpRequestInfo.CloudType.HEALTH_CLOUD, new mov());
        map.put(HttpRequestInfo.CloudType.THEME_CLOUD, new mow());
    }

    public static HttpProxyParamsFactory b(HttpRequestInfo.CloudType cloudType) {
        if (cloudType == null) {
            LogUtil.j("RequestParamFactoryConfig", "cloudType is null");
            return null;
        }
        return e.get(cloudType);
    }
}
