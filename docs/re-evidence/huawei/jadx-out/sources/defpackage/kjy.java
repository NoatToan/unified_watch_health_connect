package defpackage;

import android.content.Context;
import com.huawei.haf.bundle.AppBundlePluginProxy;
import com.huawei.health.h5pro.jsbridge.base.JsBaseModule;
import com.huawei.healthosa.HealthOsaApi;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes.dex */
public class kjy extends AppBundlePluginProxy<HealthOsaApi> implements HealthOsaApi {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile kjy f39310c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f39311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f39312b;
    private HealthOsaApi d;

    private kjy() {
        super("HealthOsa_HealthOsaProxy", "HealthOsa", "com.huawei.healthosa.location.OsaServiceForLocationInteraction");
        this.f39311a = "";
        this.d = createPluginApi();
    }

    public static kjy b() {
        kjy kjyVar;
        if (f39310c == null) {
            synchronized (kjy.class) {
                if (f39310c == null) {
                    f39310c = new kjy();
                }
                kjyVar = f39310c;
            }
            return kjyVar;
        }
        return f39310c;
    }

    @Override // com.huawei.healthosa.HealthOsaApi
    public void startOsaH5(Context context, String str) {
        if (context == null) {
            LogUtil.j("HealthOsa_HealthOsaProxy", "startOsaH5 context is null");
            return;
        }
        this.f39312b = context;
        if (this.d != null) {
            LogUtil.a("HealthOsa_HealthOsaProxy", "startOsaH5");
            this.d.startOsaH5(context, str);
        } else {
            this.f39311a = str;
            loadPlugin();
        }
    }

    @Override // com.huawei.haf.bundle.AppBundlePluginProxy
    public boolean isPluginAvaiable() {
        return this.d != null;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.huawei.haf.bundle.AppBundlePluginProxy
    public void initialize(HealthOsaApi healthOsaApi) {
        this.d = healthOsaApi;
        LogUtil.a("HealthOsa_HealthOsaProxy", "initialize startOsaH5, mBiFrom is ", this.f39311a);
        startOsaH5(this.f39312b, this.f39311a);
        this.f39311a = "";
    }

    @Override // com.huawei.healthosa.HealthOsaApi
    public Class<? extends JsBaseModule> getOsaJsModule(String str) {
        HealthOsaApi healthOsaApi = this.d;
        if (healthOsaApi == null) {
            LogUtil.j("HealthOsa_HealthOsaProxy", "getOsaJsModule: mHealthOsaApi is null");
            return JsBaseModule.class;
        }
        return healthOsaApi.getOsaJsModule(str);
    }
}
