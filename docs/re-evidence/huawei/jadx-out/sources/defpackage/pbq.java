package defpackage;

import com.huawei.haf.bundle.AppBundlePluginProxy;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.pluginappgallery.AppGalleryApi;
import health.compact.a.util.LogUtil;

/* JADX INFO: loaded from: classes13.dex */
public class pbq extends AppBundlePluginProxy<AppGalleryApi> implements AppGalleryApi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f45130a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile pbq f45131b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AppGalleryApi f45132c;

    private pbq() {
        super("AppGalleryProxy", "PluginWearAbility", "com.huawei.pluginappgallery.PluginAppGalleryImpl");
        LogUtil.a("AppGalleryProxy", "AppGalleryProxy");
        this.f45132c = createPluginApi();
    }

    public static pbq c() {
        pbq pbqVar;
        LogUtil.a("AppGalleryProxy", "AppGalleryProxy");
        synchronized (f45130a) {
            if (f45131b == null) {
                f45131b = new pbq();
            }
            pbqVar = f45131b;
        }
        return pbqVar;
    }

    @Override // com.huawei.haf.bundle.AppBundlePluginProxy
    public boolean isPluginAvaiable() {
        LogUtil.a("AppGalleryProxy", "isPluginAvaiable : ", Boolean.valueOf(this.f45132c != null));
        return this.f45132c != null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.haf.bundle.AppBundlePluginProxy
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void initialize(AppGalleryApi appGalleryApi) {
        LogUtil.a("AppGalleryProxy", "initialize");
        this.f45132c = appGalleryApi;
    }

    @Override // com.huawei.pluginappgallery.AppGalleryApi
    public void launchAppGallery(int i) {
        LogUtil.a("AppGalleryProxy", "launchAppGallery type : ", Integer.valueOf(i));
        if (isPluginAvaiable()) {
            this.f45132c.launchAppGallery(i);
        } else {
            loadPlugin();
        }
    }

    @Override // com.huawei.pluginappgallery.AppGalleryApi
    public void initAppMarketAdapter() {
        LogUtil.a("AppGalleryProxy", "initAppMarketAdapter");
        if (isPluginAvaiable()) {
            this.f45132c.initAppMarketAdapter();
        } else {
            loadPlugin();
        }
    }

    @Override // com.huawei.pluginappgallery.AppGalleryApi
    public void destroyAppMarketAdapter() {
        LogUtil.a("AppGalleryProxy", "destroyAppMarketAdapter");
        if (isPluginAvaiable()) {
            this.f45132c.destroyAppMarketAdapter();
        } else {
            LogUtil.d("AppGalleryProxy", "destroyApi mAppGalleryApi is null");
        }
    }

    @Override // com.huawei.pluginappgallery.AppGalleryApi
    public void hasNewVersion() {
        LogUtil.a("AppGalleryProxy", "hasNewVersion");
        if (isPluginAvaiable()) {
            this.f45132c.hasNewVersion();
        } else {
            loadPlugin();
        }
    }

    @Override // com.huawei.pluginappgallery.AppGalleryApi
    public void sendCommand(int i, IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a("AppGalleryProxy", "sendCommand type : ", Integer.valueOf(i));
        if (isPluginAvaiable()) {
            this.f45132c.sendCommand(i, iBaseResponseCallback);
        } else {
            loadPlugin();
        }
    }
}
