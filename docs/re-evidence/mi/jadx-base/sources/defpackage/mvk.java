package defpackage;

import android.app.Application;
import android.app.NotificationManager;
import android.content.Context;
import com.tencent.mmkv.MMKVLogLevel;
import com.xiaomi.smarthome.cache.MMKVInitHelper;
import com.xiaomi.smarthome.core.entity.externalload.LoadInfo;
import com.xiaomi.smarthome.core.entity.plugin.PluginPackageInfo;
import com.xiaomi.smarthome.core.server.internal.plugin.util.Callback;
import com.xiaomi.smarthome.frame.server_compact.ServerBean;
import com.xiaomi.smarthome.framework.plugin.rn.RnModuleProvider;
import com.xiaomi.smarthome.framework.plugin.rn.common.api.IRnCommonProvider;
import com.xiaomi.smarthome.framework.plugin.rn.common.api.IRnReportProvider;
import com.xiaomi.smarthome.framework.plugin.rn.core.api.IMRnAppProxyProvider;
import com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnBluetoothProvider;
import com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnEventProvider;
import com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnPluginHostApiProvider;
import com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnRuntimeProvider;
import com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnScreenProvider;
import com.xiaomi.smarthome.framework.plugin.rn.core.api.IStandPluginProvider;
import com.xiaomi.smarthome.framework.plugin.rn.core.api.IUIProvider;
import com.xiaomi.smarthome.library.MiJiaEnvironment;
import com.xiaomi.smarthome.server.PluginUpdateManager;
import com.xiaomi.smarthome.server.PluginUpdateProviderManager;
import com.xiaomi.smarthome.setting.PluginSetting;
import com.xiaomi.smarthome.update.IPluginUpdateProvider;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class mvk {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile mvk f27260b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public wuk f27261a;

    public class a implements IPluginUpdateProvider {
        public a() {
        }

        @Override // com.xiaomi.smarthome.update.IPluginUpdateProvider
        public void addInnerPackage() {
        }

        @Override // com.xiaomi.smarthome.update.IPluginUpdateProvider
        public void addStatRecord(String str, String str2) {
        }

        @Override // com.xiaomi.smarthome.update.IPluginUpdateProvider
        public void downExternal(String str, Callback<LoadInfo, Integer> callback) {
        }

        @Override // com.xiaomi.smarthome.update.IPluginUpdateProvider
        public void downloadRnExtModules(Callback<Integer, Integer> callback) {
            callback.call(4);
        }

        @Override // com.xiaomi.smarthome.update.IPluginUpdateProvider
        public String getDeveloperInfo(long j) {
            return null;
        }

        @Override // com.xiaomi.smarthome.update.IPluginUpdateProvider
        public ServerBean getGlobalSettingServer() {
            return null;
        }

        @Override // com.xiaomi.smarthome.update.IPluginUpdateProvider
        public int getLoadInfoStatus(String str) {
            return 0;
        }

        @Override // com.xiaomi.smarthome.update.IPluginUpdateProvider
        public String getMid() {
            return null;
        }

        @Override // com.xiaomi.smarthome.update.IPluginUpdateProvider
        public String getPluginChannelId(NotificationManager notificationManager, Context context) {
            return null;
        }

        @Override // com.xiaomi.smarthome.update.IPluginUpdateProvider
        public void getXmPluginPackage(PluginPackageInfo pluginPackageInfo) {
        }

        @Override // com.xiaomi.smarthome.update.IPluginUpdateProvider
        public boolean isWhiteListContained(String str) {
            return false;
        }

        @Override // com.xiaomi.smarthome.update.IPluginUpdateProvider
        public void loadExternal(String str, Callback<LoadInfo, Integer> callback) {
        }

        @Override // com.xiaomi.smarthome.update.IPluginUpdateProvider
        public void reportDownloadRes(String str, String str2, String str3, int i, long j) {
        }

        @Override // com.xiaomi.smarthome.update.IPluginUpdateProvider
        public void reportRNDownloadErr(String str, String str2, Map<String, Object> map) {
        }

        @Override // com.xiaomi.smarthome.update.IPluginUpdateProvider
        public void reportRealDownloadRes(String str, String str2, String str3, String str4, String str5, int i) {
        }

        @Override // com.xiaomi.smarthome.update.IPluginUpdateProvider
        public void reportRnData(String str, Map<Object, Object> map) {
        }

        @Override // com.xiaomi.smarthome.update.IPluginUpdateProvider
        public void reportRnInstallDetailRes(String str, String str2, int i) {
        }

        @Override // com.xiaomi.smarthome.update.IPluginUpdateProvider
        public void reportRnPluginInstallRes(String str, String str2, int i) {
        }

        @Override // com.xiaomi.smarthome.update.IPluginUpdateProvider
        public void startCopySoTask(String str, String str2) {
        }
    }

    public static mvk e() {
        if (f27260b == null) {
            synchronized (mvk.class) {
                try {
                    if (f27260b == null) {
                        f27260b = new mvk();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f27260b;
    }

    public qtc a() {
        return this.f27261a.d();
    }

    public hqc b() {
        return this.f27261a.a();
    }

    public lrc c() {
        return this.f27261a.b();
    }

    public atc d() {
        return this.f27261a.c();
    }

    public zvc f() {
        return this.f27261a.e();
    }

    public qxc g() {
        return this.f27261a.f();
    }

    public d0d h() {
        return this.f27261a.g();
    }

    public void i(Application application, wuk wukVar) {
        if (application == null) {
            throw new RuntimeException("init application is null");
        }
        if (wukVar == null) {
            throw new RuntimeException("init RnProviderImplDependency is null");
        }
        this.f27261a = wukVar;
        j();
        l(application);
        k();
    }

    public final void j() {
        int apiLevel = d().getApiLevel();
        int sdkApiLevel = d().getSdkApiLevel();
        if (apiLevel < 111 || sdkApiLevel < 20001) {
            throw new RuntimeException("invalid API_LEVEL or RN_NATIVE_API_LEVEL");
        }
        PluginSetting.API_LEVEL = apiLevel;
        PluginSetting.RN_NATIVE_API_LEVEL = sdkApiLevel;
    }

    public final void k() {
        RnModuleProvider.getInstance().bindImpl(IRnPluginHostApiProvider.class.getName(), yuk.class.getName()).bindImpl(IRnRuntimeProvider.class.getName(), kvk.class.getName()).bindImpl(IRnBluetoothProvider.class.getName(), cuk.class.getName()).bindImpl(IStandPluginProvider.class.getName(), hao.class.getName()).bindImpl(IRnCommonProvider.class.getName(), duk.class.getName()).bindImpl(IRnReportProvider.class.getName(), jvk.class.getName()).bindImpl(IUIProvider.class.getName(), kwk.class.getName()).bindImpl(IMRnAppProxyProvider.class.getName(), xye.class.getName()).bindImpl(IRnEventProvider.class.getName(), vuk.class.getName()).bindImpl(IRnScreenProvider.class.getName(), lvk.class.getName());
    }

    public final void l(Application application) {
        MMKVInitHelper.initialize(application, MMKVLogLevel.LevelError);
        m(application);
        PluginUpdateManager.getInstance();
        PluginUpdateProviderManager.getInstance().setPluginUpdateProvider(new a());
    }

    public final void m(Context context) {
        if (MiJiaEnvironment.getAppContext() == null) {
            MiJiaEnvironment.setEnvironment(new MiJiaEnvironment.Builder().setContext(context));
        }
    }
}
