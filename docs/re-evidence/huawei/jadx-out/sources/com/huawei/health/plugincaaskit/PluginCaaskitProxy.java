package com.huawei.health.plugincaaskit;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import com.huawei.haf.bundle.AppBundle;
import com.huawei.haf.bundle.AppBundleLauncher;
import com.huawei.haf.bundle.AppBundlePluginProxy;
import com.huawei.haf.bundle.InstallSessionState;
import com.huawei.haf.bundle.InstallStateListener;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes30.dex */
public class PluginCaaskitProxy extends AppBundlePluginProxy<PluginCaaskitApi> implements PluginCaaskitApi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile PluginCaaskitProxy f8595a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Handler f8596c;
    private PluginCaaskitApi e;

    public interface LoadListener {
        void onFail(int i);

        void onSuccess(int i);
    }

    private PluginCaaskitProxy() {
        super("PluginCaaskitProxy", "PluginCaaskit", "com.huawei.health.plugincaaskit.PluginCaaskitApiImpl");
        this.f8596c = new Handler() { // from class: com.huawei.health.plugincaaskit.PluginCaaskitProxy.1
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                super.handleMessage(message);
                if (message == null) {
                    LogUtil.j("PluginCaaskitProxy", "handleMessage msg is null");
                } else if (message.what != 0) {
                    LogUtil.j("PluginCaaskitProxy", "handleMessage default what:", Integer.valueOf(message.what));
                } else if (message.obj instanceof LoadListener) {
                    ((LoadListener) message.obj).onFail(-1);
                }
            }
        };
        this.e = createPluginApi();
    }

    public static PluginCaaskitProxy a() {
        PluginCaaskitProxy pluginCaaskitProxy;
        if (f8595a == null) {
            synchronized (PluginCaaskitProxy.class) {
                if (f8595a == null) {
                    f8595a = new PluginCaaskitProxy();
                }
                pluginCaaskitProxy = f8595a;
            }
            return pluginCaaskitProxy;
        }
        return f8595a;
    }

    @Override // com.huawei.haf.bundle.AppBundlePluginProxy
    public boolean isPluginAvaiable() {
        return this.e != null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.haf.bundle.AppBundlePluginProxy
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void initialize(PluginCaaskitApi pluginCaaskitApi) {
        this.e = pluginCaaskitApi;
    }

    public void a(Context context, final LoadListener loadListener) {
        if (e()) {
            Intent intent = new Intent();
            AppBundle.d().getInstallManager().registerListener(new InstallStateListener() { // from class: com.huawei.health.plugincaaskit.PluginCaaskitProxy.5
                @Override // com.huawei.haf.bundle.InstallStateListener
                public void onStateUpdate(InstallSessionState installSessionState) {
                    if (installSessionState.moduleNames().contains("PluginCaaskit") && installSessionState.status() == 6) {
                        loadListener.onFail(-1);
                        AppBundle.d().getInstallManager().unregisterListener(this);
                    } else if (installSessionState.moduleNames().contains("PluginCaaskit")) {
                        if (installSessionState.status() == 7 || installSessionState.status() == 9) {
                            loadListener.onFail(-1);
                            AppBundle.d().getInstallManager().unregisterListener(this);
                        }
                    }
                }
            });
            launchActivity(context, intent, new AppBundleLauncher.InstallCallback() { // from class: com.huawei.health.plugincaaskit.PluginCaaskitProxy.3
                @Override // com.huawei.haf.bundle.AppBundleLauncher.InstallCallback
                public boolean call(Context context2, Intent intent2) {
                    LogUtil.a("PluginCaaskitProxy", "downloadCaaskit launchActivity call");
                    LoadListener loadListener2 = loadListener;
                    if (loadListener2 != null) {
                        loadListener2.onSuccess(0);
                    }
                    return false;
                }
            });
        } else {
            if (isPluginAvaiable()) {
                loadListener.onSuccess(0);
                return;
            }
            Message messageObtainMessage = this.f8596c.obtainMessage();
            messageObtainMessage.obj = loadListener;
            messageObtainMessage.what = 0;
            this.f8596c.sendMessageDelayed(messageObtainMessage, 30000L);
            loadPlugin(new AppBundleLauncher.InstallCallback() { // from class: com.huawei.health.plugincaaskit.PluginCaaskitProxy.4
                @Override // com.huawei.haf.bundle.AppBundleLauncher.InstallCallback
                public boolean call(Context context2, Intent intent2) {
                    LogUtil.a("PluginCaaskitProxy", "loadModule call");
                    PluginCaaskitProxy.this.f8596c.removeMessages(0);
                    loadListener.onSuccess(0);
                    return false;
                }
            });
        }
    }

    private boolean e() {
        return AppBundle.c().isBundleModule("PluginCaaskit") && !AppBundle.d().getInstalledModules().contains("PluginCaaskit");
    }
}
