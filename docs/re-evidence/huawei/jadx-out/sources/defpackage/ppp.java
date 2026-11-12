package defpackage;

import com.huawei.haf.bundle.AppBundlePluginProxy;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginsport.airopeskipping.RopeSkippingResourcesApi;

/* JADX INFO: loaded from: classes15.dex */
public class ppp extends AppBundlePluginProxy<RopeSkippingResourcesApi> implements RopeSkippingResourcesApi {
    private RopeSkippingResourcesApi d;

    static class d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final ppp f45777c = new ppp();
    }

    public static ppp b() {
        return d.f45777c;
    }

    private ppp() {
        super("Track_RopeSkippingResourcesProxy", "RopeSkippingResources", "com.huawei.ropeskippingresources.RopeSkippingResourcesImpl");
        LogUtil.a("Track_RopeSkippingResourcesProxy", "RopeSkippingResourcesProxy()");
        this.d = createPluginApi();
    }

    @Override // com.huawei.haf.bundle.AppBundlePluginProxy
    public boolean isPluginAvaiable() {
        LogUtil.a("Track_RopeSkippingResourcesProxy", "isPluginAvaiable() mRopeSkippingResourcesApi: ", this.d);
        return this.d != null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.haf.bundle.AppBundlePluginProxy
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void initialize(RopeSkippingResourcesApi ropeSkippingResourcesApi) {
        LogUtil.a("Track_RopeSkippingResourcesProxy", "initialize() pluginApi: ", ropeSkippingResourcesApi);
        this.d = ropeSkippingResourcesApi;
    }
}
