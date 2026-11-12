package defpackage;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.huawei.haf.bundle.AppBundlePluginProxy;
import com.huawei.haf.bundle.extension.ComponentInfo;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.health.arkuix.utils.ArkUIXConstants;
import com.huawei.health.h5pro.jsbridge.base.JsModuleBase;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginsleepdetection.PluginSleepDetectionApi;

/* JADX INFO: loaded from: classes.dex */
public class pjo extends AppBundlePluginProxy<PluginSleepDetectionApi> implements PluginSleepDetectionApi {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile pjo f45516b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private PluginSleepDetectionApi f45517c;

    private pjo() {
        super("PluginSleepDetectionProxy", "PluginSleepDetection", "com.huawei.sleepdetection.PluginSleepDetectionImpl");
        this.f45517c = createPluginApi();
    }

    public static pjo b() {
        pjo pjoVar;
        if (f45516b == null) {
            synchronized (pjo.class) {
                if (f45516b == null) {
                    f45516b = new pjo();
                }
                pjoVar = f45516b;
            }
            return pjoVar;
        }
        return f45516b;
    }

    @Override // com.huawei.haf.bundle.AppBundlePluginProxy
    public boolean isPluginAvaiable() {
        return this.f45517c != null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.haf.bundle.AppBundlePluginProxy
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void initialize(PluginSleepDetectionApi pluginSleepDetectionApi) {
        this.f45517c = pluginSleepDetectionApi;
    }

    public void c(Context context, String str) {
        c(context, false, str);
    }

    public void c(Context context, boolean z, String str) {
        if (context == null) {
            LogUtil.j("PluginSleepDetectionProxy", "gotoFamilyHealth context is null");
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("isStart", z);
        intent.putExtra(ArkUIXConstants.FROM_TYPE, str);
        intent.setClassName(context, ComponentInfo.PluginSleepDetection_A_0);
        launchActivity(context, intent);
    }

    public void a(Context context, String str) {
        if (context == null) {
            LogUtil.j("PluginSleepDetectionProxy", "gotoFamilyHealth context is null");
            return;
        }
        if (!HandlerExecutor.c()) {
            LogUtil.j("PluginSleepDetectionProxy", "gotoH5 is not MainTread");
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("h5Path", str);
        intent.setClassName(context, ComponentInfo.PluginSleepDetection_A_0);
        launchActivity(context, intent);
    }

    public boolean d(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.contains("#/DreamTalkSetting") || str.contains("#/Favorites") || str.contains("#/SleepSetting");
    }

    @Override // com.huawei.pluginsleepdetection.PluginSleepDetectionApi
    public void sleepRecordStatus(IBaseResponseCallback iBaseResponseCallback) {
        PluginSleepDetectionApi pluginSleepDetectionApi = this.f45517c;
        if (pluginSleepDetectionApi != null) {
            pluginSleepDetectionApi.sleepRecordStatus(iBaseResponseCallback);
        }
    }

    @Override // com.huawei.pluginsleepdetection.PluginSleepDetectionApi
    public void stopSleepRecord(Context context) {
        PluginSleepDetectionApi pluginSleepDetectionApi = this.f45517c;
        if (pluginSleepDetectionApi != null) {
            pluginSleepDetectionApi.stopSleepRecord(context);
        }
    }

    @Override // com.huawei.pluginsleepdetection.PluginSleepDetectionApi
    public void disconnect() {
        PluginSleepDetectionApi pluginSleepDetectionApi = this.f45517c;
        if (pluginSleepDetectionApi != null) {
            pluginSleepDetectionApi.disconnect();
        }
    }

    @Override // com.huawei.pluginsleepdetection.PluginSleepDetectionApi
    public int getSleepTime() {
        PluginSleepDetectionApi pluginSleepDetectionApi = this.f45517c;
        if (pluginSleepDetectionApi != null) {
            return pluginSleepDetectionApi.getSleepTime();
        }
        return 1380;
    }

    @Override // com.huawei.pluginsleepdetection.PluginSleepDetectionApi
    public boolean isOpenNotification() {
        PluginSleepDetectionApi pluginSleepDetectionApi = this.f45517c;
        if (pluginSleepDetectionApi != null) {
            return pluginSleepDetectionApi.isOpenNotification();
        }
        return false;
    }

    @Override // com.huawei.pluginsleepdetection.PluginSleepDetectionApi
    public Class<? extends JsModuleBase> getJsModule() {
        PluginSleepDetectionApi pluginSleepDetectionApi = this.f45517c;
        if (pluginSleepDetectionApi != null) {
            return pluginSleepDetectionApi.getJsModule();
        }
        return JsModuleBase.class;
    }

    @Override // com.huawei.pluginsleepdetection.PluginSleepDetectionApi
    public boolean isEnableRecord() {
        PluginSleepDetectionApi pluginSleepDetectionApi = this.f45517c;
        if (pluginSleepDetectionApi != null) {
            return pluginSleepDetectionApi.isEnableRecord();
        }
        return false;
    }

    @Override // com.huawei.pluginsleepdetection.PluginSleepDetectionApi
    public void syncSleepAlarmInfo() {
        PluginSleepDetectionApi pluginSleepDetectionApi = this.f45517c;
        if (pluginSleepDetectionApi != null) {
            pluginSleepDetectionApi.syncSleepAlarmInfo();
        }
    }
}
