package defpackage;

import com.huawei.haf.application.BaseApplication;
import com.huawei.networkclient.IRequest;
import health.compact.a.GRSManager;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes31.dex */
public class ijr implements IRequest {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<String, String> f37723c = new HashMap();

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return GRSManager.c(BaseApplication.b()).getUrl("domainThemeCloud") + "/servicesupport/theme/ttdservice/service/v1/product/querybytype?";
    }

    public Map<String, String> d() {
        return this.f37723c;
    }

    public void d(Map<String, String> map) {
        this.f37723c = map;
    }
}
