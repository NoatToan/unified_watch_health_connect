package defpackage;

import com.huawei.hms.framework.network.restclient.RestClientGlobalInstance;
import com.huawei.hms.framework.network.restclient.hwhttp.HttpClient;
import com.huawei.hms.network.embedded.y;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.phoneprocess.mgr.httpproxy.HttpProxyInterface;
import com.huawei.networkclient.ResultCallback;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class moj implements HttpProxyInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private oet f42079a = oet.c(b());

    private static HttpClient b() {
        RestClientGlobalInstance.getInstance().init(BaseApplication.getContext());
        return new HttpClient.Builder().connectTimeout(y.f15619c).writeTimeout(5000).readTimeout(5000).build();
    }

    @Override // com.huawei.hwdevice.phoneprocess.mgr.httpproxy.HttpProxyInterface
    public void post(String str, Map<String, String> map, String str2, ResultCallback<oeq> resultCallback) {
        this.f42079a.c(str, map, str2, oeq.class, resultCallback);
    }

    @Override // com.huawei.hwdevice.phoneprocess.mgr.httpproxy.HttpProxyInterface
    public void get(String str, Map<String, String> map, Map<String, String> map2, ResultCallback<oeq> resultCallback) {
        this.f42079a.e(str, map, map2, oeq.class, resultCallback);
    }

    @Override // com.huawei.hwdevice.phoneprocess.mgr.httpproxy.HttpProxyInterface
    public void put(String str, Map<String, String> map, String str2, ResultCallback<oeq> resultCallback) {
        this.f42079a.d(str, map, str2, oeq.class, resultCallback);
    }

    @Override // com.huawei.hwdevice.phoneprocess.mgr.httpproxy.HttpProxyInterface
    public void delete(String str, Map<String, String> map, ResultCallback<oeq> resultCallback) {
        this.f42079a.c(str, map, oeq.class, resultCallback);
    }
}
