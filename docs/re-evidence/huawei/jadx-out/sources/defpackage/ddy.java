package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.huawei.haf.bundle.AppBundleLauncher;
import com.huawei.haf.bundle.AppBundlePluginProxy;
import com.huawei.health.baseapi.wallet.HealthInitWalletApi;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes.dex */
public class ddy extends AppBundlePluginProxy<HealthInitWalletApi> implements HealthInitWalletApi {
    private static volatile ddy e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthInitWalletApi f31688a;

    private ddy() {
        super("HealthInitWalletProxy", "PluginPay", "com.huawei.nfc.carrera.wear.HealthInitWalletApiImpl");
        this.f31688a = createPluginApi();
    }

    public static ddy e() {
        ddy ddyVar;
        if (e == null) {
            synchronized (ddy.class) {
                if (e == null) {
                    e = new ddy();
                }
                ddyVar = e;
            }
            return ddyVar;
        }
        return e;
    }

    @Override // com.huawei.health.baseapi.wallet.HealthInitWalletApi
    public void initBaseConfig(Context context) {
        HealthInitWalletApi healthInitWalletApi = this.f31688a;
        if (healthInitWalletApi != null) {
            healthInitWalletApi.initBaseConfig(context);
        } else {
            loadPlugin();
        }
    }

    @Override // com.huawei.health.baseapi.wallet.HealthInitWalletApi
    public void initHealthPayAdapter(Context context) {
        HealthInitWalletApi healthInitWalletApi = this.f31688a;
        if (healthInitWalletApi != null) {
            healthInitWalletApi.initHealthPayAdapter(context);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.haf.bundle.AppBundlePluginProxy
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void initialize(HealthInitWalletApi healthInitWalletApi) {
        healthInitWalletApi.initBaseConfig(BaseApplication.getContext());
        this.f31688a = healthInitWalletApi;
        LogUtil.a("HealthInitWalletProxy", "initialize initHealthPayAdapter");
        initHealthPayAdapter(BaseApplication.getContext());
    }

    @Override // com.huawei.health.baseapi.wallet.HealthInitWalletApi
    public void walletAccountRemove(Context context, Intent intent) {
        HealthInitWalletApi healthInitWalletApi = this.f31688a;
        if (healthInitWalletApi != null) {
            healthInitWalletApi.walletAccountRemove(context, intent);
        } else {
            LogUtil.a("HealthInitWalletProxy", "walletAccountRemove mHealthInitWalletApi is null");
        }
    }

    @Override // com.huawei.health.baseapi.wallet.HealthInitWalletApi
    public IBinder getServiceBinder(Context context, String str, Intent intent) {
        HealthInitWalletApi healthInitWalletApi = this.f31688a;
        if (healthInitWalletApi != null) {
            return healthInitWalletApi.getServiceBinder(context, str, intent);
        }
        LogUtil.a("HealthInitWalletProxy", "getServiceBinder mHealthInitWalletApi is null");
        return null;
    }

    @Override // com.huawei.health.baseapi.wallet.HealthInitWalletApi
    public void serviceOnCreate(Context context, String str) {
        HealthInitWalletApi healthInitWalletApi = this.f31688a;
        if (healthInitWalletApi != null) {
            healthInitWalletApi.serviceOnCreate(context, str);
        } else {
            LogUtil.a("HealthInitWalletProxy", "serviceOnCreate mHealthInitWalletApi is null");
        }
    }

    @Override // com.huawei.health.baseapi.wallet.HealthInitWalletApi
    public void serviceOnDestroy(Context context, String str) {
        HealthInitWalletApi healthInitWalletApi = this.f31688a;
        if (healthInitWalletApi != null) {
            healthInitWalletApi.serviceOnDestroy(context, str);
        } else {
            LogUtil.a("HealthInitWalletProxy", "serviceOnDestory mHealthInitWalletApi is null");
        }
    }

    @Override // com.huawei.health.baseapi.wallet.HealthInitWalletApi
    public void pushWearWalletMessage(final Context context, final String str) {
        HealthInitWalletApi healthInitWalletApi = this.f31688a;
        if (healthInitWalletApi != null) {
            healthInitWalletApi.pushWearWalletMessage(context, str);
        } else {
            loadPlugin(new AppBundleLauncher.InstallCallback() { // from class: ddy.3
                @Override // com.huawei.haf.bundle.AppBundleLauncher.InstallCallback
                public boolean call(Context context2, Intent intent) {
                    LogUtil.a("HealthInitWalletProxy", "pushWearWallMessage loadPlugin call");
                    ddy.this.pushWearWalletMessage(context, str);
                    return false;
                }
            });
        }
    }

    @Override // com.huawei.haf.bundle.AppBundlePluginProxy
    public boolean isPluginAvaiable() {
        return this.f31688a != null;
    }
}
