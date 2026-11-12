package defpackage;

import android.content.Context;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.bundle.AppBundleLauncher;
import com.huawei.haf.bundle.AppBundlePluginProxy;
import com.huawei.health.trackprocess.api.PluginLocationApi;
import com.huawei.health.trackprocess.callback.PluginCloudTrackCallback;
import com.huawei.health.trackprocess.callback.PluginTrackMapCallback;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class ilf extends AppBundlePluginProxy<PluginLocationApi> implements PluginLocationApi {
    private static volatile ilf e;
    private PluginLocationApi d;

    private ilf() {
        super("PluginLocation_mPluginLocationProxy", "PluginWearAbility", "com.huawei.pluginlocation.PluginLocationApiImpl");
        this.d = createPluginApi();
    }

    public static ilf b() {
        ilf ilfVar;
        if (e == null) {
            synchronized (ilf.class) {
                if (e == null) {
                    e = new ilf();
                }
                ilfVar = e;
            }
            return ilfVar;
        }
        return e;
    }

    @Override // com.huawei.haf.bundle.AppBundlePluginProxy
    public boolean isPluginAvaiable() {
        return this.d != null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.haf.bundle.AppBundlePluginProxy
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void initialize(PluginLocationApi pluginLocationApi) {
        LogUtil.a("PluginLocation_mPluginLocationProxy", "initialize");
        this.d = pluginLocationApi;
    }

    @Override // com.huawei.health.trackprocess.api.PluginLocationApi
    public void pluginRxnNativeInit() {
        LogUtil.a("PluginLocation_mPluginLocationProxy", "pluginRxnNativeInit");
        PluginLocationApi pluginLocationApi = this.d;
        if (pluginLocationApi != null) {
            pluginLocationApi.pluginRxnNativeInit();
        } else {
            LogUtil.j("PluginLocation_mPluginLocationProxy", "pluginRxnNativeInit loadPlugin()");
            loadPlugin();
        }
    }

    @Override // com.huawei.health.trackprocess.api.PluginLocationApi
    public void pluginRxnGenerateEphemeris() {
        LogUtil.a("PluginLocation_mPluginLocationProxy", "pluginRxnGenerateEphemeris");
        PluginLocationApi pluginLocationApi = this.d;
        if (pluginLocationApi != null) {
            pluginLocationApi.pluginRxnGenerateEphemeris();
        } else {
            LogUtil.j("PluginLocation_mPluginLocationProxy", "pluginRxnGenerateEphemeris loadPlugin()");
            loadPlugin();
        }
    }

    @Override // com.huawei.health.trackprocess.api.PluginLocationApi
    public int getOptimizedTrack(String str, String str2, boolean z, PluginTrackMapCallback pluginTrackMapCallback, boolean z2, String str3, String str4) {
        LogUtil.a("PluginLocation_mPluginLocationProxy", "getOptimizedTrack");
        PluginLocationApi pluginLocationApi = this.d;
        if (pluginLocationApi != null) {
            return pluginLocationApi.getOptimizedTrack(str, str2, z, pluginTrackMapCallback, z2, str3, str4);
        }
        LogUtil.j("PluginLocation_mPluginLocationProxy", "getOptimizedTrack loadPlugin()");
        loadPlugin();
        LogUtil.a("PluginLocation_mPluginLocationProxy", "getOptimizedTrack return -1");
        return -1;
    }

    @Override // com.huawei.health.trackprocess.api.PluginLocationApi
    public void setExtraData(boolean z, boolean z2, Context context, String str) {
        LogUtil.a("PluginLocation_mPluginLocationProxy", "setExtraData");
        PluginLocationApi pluginLocationApi = this.d;
        if (pluginLocationApi != null) {
            pluginLocationApi.setExtraData(z, z2, context, str);
        } else {
            LogUtil.j("PluginLocation_mPluginLocationProxy", "setExtraData loadPlugin()");
            loadPlugin();
        }
    }

    @Override // com.huawei.health.trackprocess.api.PluginLocationApi
    public void postMotionPath(List<ilg> list) {
        LogUtil.a("PluginLocation_mPluginLocationProxy", "postMotionPath");
        PluginLocationApi pluginLocationApi = this.d;
        if (pluginLocationApi != null) {
            pluginLocationApi.postMotionPath(list);
        } else {
            LogUtil.j("PluginLocation_mPluginLocationProxy", "postMotionPath loadPlugin()");
            loadPlugin();
        }
    }

    @Override // com.huawei.health.trackprocess.api.PluginLocationApi
    public void getCloudTrack(PluginCloudTrackCallback pluginCloudTrackCallback) {
        LogUtil.a("PluginLocation_mPluginLocationProxy", "getCloudTrack");
        PluginLocationApi pluginLocationApi = this.d;
        if (pluginLocationApi != null) {
            pluginLocationApi.getCloudTrack(pluginCloudTrackCallback);
        } else {
            LogUtil.j("PluginLocation_mPluginLocationProxy", "getCloudTrack loadPlugin()");
            loadPlugin();
        }
    }

    @Override // com.huawei.health.trackprocess.api.PluginLocationApi
    public ile getEphRequest(List<String> list) {
        LogUtil.a("PluginLocation_mPluginLocationProxy", "getEphRequest");
        ile ileVar = new ile();
        PluginLocationApi pluginLocationApi = this.d;
        if (pluginLocationApi != null) {
            return pluginLocationApi.getEphRequest(list);
        }
        LogUtil.j("PluginLocation_mPluginLocationProxy", "getEphRequest loadPlugin()");
        loadPlugin();
        return ileVar;
    }

    @Override // com.huawei.health.trackprocess.api.PluginLocationApi
    public Map<String, String> getEphResponse(ilh ilhVar) {
        LogUtil.a("PluginLocation_mPluginLocationProxy", "getEphResponse");
        HashMap map = new HashMap();
        PluginLocationApi pluginLocationApi = this.d;
        if (pluginLocationApi != null) {
            return pluginLocationApi.getEphResponse(ilhVar);
        }
        LogUtil.j("PluginLocation_mPluginLocationProxy", "getEphResponse loadPlugin()");
        loadPlugin();
        return map;
    }

    @Override // com.huawei.health.trackprocess.api.PluginLocationApi
    public void setContext(Context context) {
        LogUtil.a("PluginLocation_mPluginLocationProxy", "setContext");
        if (this.d != null) {
            if (context == null) {
                context = BaseApplication.b();
            }
            this.d.setContext(context);
        } else {
            LogUtil.j("PluginLocation_mPluginLocationProxy", "setContext loadPlugin()");
            loadPlugin();
        }
    }

    @Override // com.huawei.health.trackprocess.api.PluginLocationApi
    public void setSerCountry(String str) {
        PluginLocationApi pluginLocationApi = this.d;
        if (pluginLocationApi != null) {
            pluginLocationApi.setSerCountry(str);
        } else {
            LogUtil.j("PluginLocation_mPluginLocationProxy", "setContext loadPlugin()");
            loadPlugin();
        }
    }

    public void d(AppBundleLauncher.InstallCallback installCallback) {
        LogUtil.a("PluginLocation_mPluginLocationProxy", "loadPluginWearAbility");
        loadPlugin(installCallback);
    }
}
