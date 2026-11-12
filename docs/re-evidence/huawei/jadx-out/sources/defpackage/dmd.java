package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.huawei.health.device.PluginDeviceAdapter;
import com.huawei.health.device.model.HealthDevice;
import com.huawei.health.device.model.MeasureResult;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.pluginbase.PluginBaseAdapter;
import health.compact.a.CommonUtil;

/* JADX INFO: loaded from: classes7.dex */
public class dmd extends pbx {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static dmd f31996b;
    private static final Object e = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private eny f31997a = eny.a();
    private PluginDeviceAdapter d;

    @Override // defpackage.pbx
    public void finish() {
    }

    private dmd() {
    }

    @Override // defpackage.pbx
    public void init(Context context) {
        d();
    }

    private void d() {
        String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011);
        LogUtil.a("PluginDevice_PluginDevice", "PluginDevice initDatabase ", accountInfo);
        if (!TextUtils.isEmpty(accountInfo)) {
            SharedPreferences sharedPreferences = BaseApplication.getContext().getSharedPreferences("login_data", 0);
            String string = sharedPreferences.getString("old_user_id", null);
            if (TextUtils.isEmpty(string)) {
                LogUtil.a("PluginDevice_PluginDevice", "PluginDevice initDatabase oldHuid null");
                sharedPreferences.edit().putString("old_user_id", accountInfo).commit();
                return;
            } else {
                if (accountInfo.equals(string)) {
                    return;
                }
                LogUtil.a("PluginDevice_PluginDevice", "PluginDevice initDatabase huid != oldHuid");
                sharedPreferences.edit().putString("old_user_id", accountInfo).commit();
                dmp.d().c();
                if (CommonUtil.ck()) {
                    eem.a(dxx.d().g(), "PluginDevice_PluginDevice");
                }
                LogUtil.a("PluginDevice_PluginDevice", "PluginDevice initDatabase sendBroadcast");
                return;
            }
        }
        LogUtil.a("PluginDevice_PluginDevice", "PluginDevice initDatabase huid null");
    }

    public static dmd b() {
        dmd dmdVar;
        synchronized (e) {
            if (f31996b == null) {
                f31996b = new dmd();
            }
            dmdVar = f31996b;
        }
        return dmdVar;
    }

    public String e(HealthDevice.HealthDeviceKind healthDeviceKind, MeasureResult.MeasureResultListener measureResultListener) {
        LogUtil.a("PluginDevice_PluginDevice", "PluginDevice startMeasureBackground");
        return this.f31997a.a(healthDeviceKind, measureResultListener);
    }

    public void e(String str, String str2) {
        LogUtil.a("PluginDevice_PluginDevice", "PluginDevice stopMeasureBackground");
        this.f31997a.e(str, str2);
    }

    public PluginDeviceAdapter e() {
        if (getAdapter() instanceof PluginDeviceAdapter) {
            PluginDeviceAdapter pluginDeviceAdapter = (PluginDeviceAdapter) getAdapter();
            this.d = pluginDeviceAdapter;
            return pluginDeviceAdapter;
        }
        return this.d;
    }

    @Override // defpackage.pbx
    public void setAdapter(PluginBaseAdapter pluginBaseAdapter) {
        if (pluginBaseAdapter == null) {
            return;
        }
        super.setAdapter(pluginBaseAdapter);
        if (pluginBaseAdapter instanceof PluginDeviceAdapter) {
            LogUtil.a("PluginDevice_PluginDevice", "adapter is not null");
            this.d = (PluginDeviceAdapter) pluginBaseAdapter;
        }
    }
}
