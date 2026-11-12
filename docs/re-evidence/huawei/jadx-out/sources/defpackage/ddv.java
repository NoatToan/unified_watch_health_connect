package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.huawei.haf.bundle.AppBundlePluginProxy;
import com.huawei.health.baseapi.pluginoperation.PluginOperationApi;
import com.huawei.health.h5pro.core.H5ProLaunchOption;
import com.huawei.health.h5pro.core.H5ProWebView;
import com.huawei.health.h5pro.jsbridge.base.JsModuleBase;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginbase.PluginBaseAdapter;
import health.compact.a.ReleaseLogUtil;

/* JADX INFO: loaded from: classes.dex */
public class ddv extends AppBundlePluginProxy<PluginOperationApi> implements PluginOperationApi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile ddv f31686a;
    private PluginOperationApi e;

    private ddv() {
        super("PluginOperation_PluginOperationProxy", "PluginOperation", "com.huawei.operation.PluginOperationImpl");
        this.e = createPluginApi();
    }

    public static ddv b() {
        ddv ddvVar;
        if (f31686a == null) {
            synchronized (ddv.class) {
                if (f31686a == null) {
                    f31686a = new ddv();
                }
                ddvVar = f31686a;
            }
            return ddvVar;
        }
        return f31686a;
    }

    @Override // com.huawei.haf.bundle.AppBundlePluginProxy
    public boolean isPluginAvaiable() {
        return this.e != null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.haf.bundle.AppBundlePluginProxy
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void initialize(PluginOperationApi pluginOperationApi) {
        this.e = pluginOperationApi;
    }

    @Override // com.huawei.health.baseapi.pluginoperation.PluginOperationApi
    public void initAdapter(Context context, PluginBaseAdapter pluginBaseAdapter) {
        PluginOperationApi pluginOperationApi = this.e;
        if (pluginOperationApi != null) {
            pluginOperationApi.initAdapter(context, pluginBaseAdapter);
        }
    }

    @Override // com.huawei.health.baseapi.pluginoperation.PluginOperationApi
    public PluginBaseAdapter getAdapter(Context context) {
        PluginOperationApi pluginOperationApi = this.e;
        if (pluginOperationApi != null) {
            return pluginOperationApi.getAdapter(context);
        }
        return null;
    }

    @Override // com.huawei.health.baseapi.pluginoperation.PluginOperationApi
    public void loadH5LightApp(Context context, String str, H5ProLaunchOption.Builder builder) {
        PluginOperationApi pluginOperationApi = this.e;
        if (pluginOperationApi == null) {
            LogUtil.e("PluginOperation_PluginOperationProxy", "launchH5Compact mPluginOperationApi is null");
        } else {
            pluginOperationApi.loadH5LightApp(context, str, builder);
        }
    }

    @Override // com.huawei.health.baseapi.pluginoperation.PluginOperationApi
    public void initH5Pro() {
        PluginOperationApi pluginOperationApi = this.e;
        if (pluginOperationApi != null) {
            pluginOperationApi.initH5Pro();
        }
    }

    @Override // com.huawei.health.baseapi.pluginoperation.PluginOperationApi
    public void initThirdDeviceH5Pro(String str, ContentValues contentValues, String str2) {
        PluginOperationApi pluginOperationApi = this.e;
        if (pluginOperationApi != null) {
            pluginOperationApi.initThirdDeviceH5Pro(str, contentValues, str2);
        }
    }

    @Override // com.huawei.health.baseapi.pluginoperation.PluginOperationApi
    public Class<? extends JsModuleBase> getJsInteraction() {
        PluginOperationApi pluginOperationApi = this.e;
        if (pluginOperationApi != null) {
            return pluginOperationApi.getJsInteraction();
        }
        LogUtil.j("PluginOperation_PluginOperationProxy", "getJsInteractionCompact mPluginOperationApi is null");
        return JsModuleBase.class;
    }

    @Override // com.huawei.health.baseapi.pluginoperation.PluginOperationApi
    public Class<? extends JsModuleBase> getCommonJsModule(String str) {
        PluginOperationApi pluginOperationApi = this.e;
        if (pluginOperationApi != null) {
            return pluginOperationApi.getCommonJsModule(str);
        }
        LogUtil.j("PluginOperation_PluginOperationProxy", "getCommonJsModule mPluginOperationApi is null");
        return JsModuleBase.class;
    }

    @Override // com.huawei.health.baseapi.pluginoperation.PluginOperationApi
    public void loadH5ProApp(Context context, String str, H5ProLaunchOption.Builder builder) {
        PluginOperationApi pluginOperationApi = this.e;
        if (pluginOperationApi == null) {
            LogUtil.j("PluginOperation_PluginOperationProxy", "loadH5ProApp mPluginOperationApi is null");
        } else {
            pluginOperationApi.loadH5ProApp(context, str, builder);
        }
    }

    @Override // com.huawei.health.baseapi.pluginoperation.PluginOperationApi
    public Intent createWebViewIntent(Context context, Bundle bundle, Integer num) {
        PluginOperationApi pluginOperationApi = this.e;
        if (pluginOperationApi != null) {
            return pluginOperationApi.createWebViewIntent(context, bundle, num);
        }
        LogUtil.j("PluginOperation_PluginOperationProxy", "createWebViewIntent mPluginOperationApi is null");
        return null;
    }

    @Override // com.huawei.health.baseapi.pluginoperation.PluginOperationApi
    public boolean isSuperTrustedMiniProgram(String str, String str2) {
        PluginOperationApi pluginOperationApi = this.e;
        if (pluginOperationApi == null) {
            LogUtil.j("PluginOperation_PluginOperationProxy", "isSuperTrustedMiniProgram mPluginOperationApi is null");
            return false;
        }
        return pluginOperationApi.isSuperTrustedMiniProgram(str, str2);
    }

    @Override // com.huawei.health.baseapi.pluginoperation.PluginOperationApi
    public boolean switchToMarketingTwo() {
        return this.e.switchToMarketingTwo();
    }

    @Override // com.huawei.health.baseapi.pluginoperation.PluginOperationApi
    public void startOperationWebPage(Context context, String str) {
        PluginOperationApi pluginOperationApi = this.e;
        if (pluginOperationApi == null) {
            LogUtil.j("PluginOperation_PluginOperationProxy", "startOperationWebPage mPluginOperationApi is null");
        } else {
            pluginOperationApi.startOperationWebPage(context, str);
        }
    }

    @Override // com.huawei.health.baseapi.pluginoperation.PluginOperationApi
    public void loadEmbeddedH5(H5ProWebView h5ProWebView, String str, H5ProLaunchOption.Builder builder) {
        PluginOperationApi pluginOperationApi = this.e;
        if (pluginOperationApi == null) {
            LogUtil.j("PluginOperation_PluginOperationProxy", "loadEmbeddedH5 mPluginOperationApi is null");
        } else {
            pluginOperationApi.loadEmbeddedH5(h5ProWebView, str, builder);
        }
    }

    @Override // com.huawei.health.baseapi.pluginoperation.PluginOperationApi
    public void putBiEventFromH5Deeplink(String str, String str2) {
        PluginOperationApi pluginOperationApi = this.e;
        if (pluginOperationApi == null) {
            LogUtil.j("PluginOperation_PluginOperationProxy", "putBiEventFromH5Deeplink mPluginOperationApi is null");
        } else {
            pluginOperationApi.putBiEventFromH5Deeplink(str, str2);
        }
    }

    @Override // com.huawei.health.baseapi.pluginoperation.PluginOperationApi
    public void functionEntrance(String str, boolean z) {
        PluginOperationApi pluginOperationApi = this.e;
        if (pluginOperationApi == null) {
            ReleaseLogUtil.d("PluginOperation_PluginOperationProxy", "functionEntrance mPluginOperationApi is null tag ", str, " isLogin ", Boolean.valueOf(z));
        } else {
            pluginOperationApi.functionEntrance(str, z);
        }
    }
}
