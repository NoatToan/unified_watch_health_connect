package defpackage;

import android.app.Activity;
import android.text.TextUtils;
import android.view.WindowManager;
import android.widget.ListView;
import com.huawei.health.device.connectivity.comm.MeasurableDevice;
import com.huawei.hwcloudmodel.callback.ICloudOperationResult;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.ui.commonui.checkbox.HealthCheckBox;
import health.compact.a.CommonUtil;
import health.compact.a.SharedPreferenceManager;

/* JADX INFO: loaded from: classes7.dex */
public class dyk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f32526a = new Object();
    private static dyk e;

    public static dyk a() {
        dyk dykVar;
        synchronized (f32526a) {
            if (e == null) {
                e = new dyk();
            }
            dykVar = e;
        }
        return dykVar;
    }

    public int e(String str, int i, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            LogUtil.j("PluginDevice_ScaleBusinessHelper", "differentDaysByMillisecond key is null or uniqueId is null");
        }
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10000), str + str2);
        if (TextUtils.isEmpty(strE)) {
            LogUtil.j("PluginDevice_ScaleBusinessHelper", "differentDaysByMillisecond is first");
            return i;
        }
        int iCurrentTimeMillis = (int) ((System.currentTimeMillis() - CommonUtil.i(strE)) / 86400000);
        LogUtil.a("PluginDevice_ScaleBusinessHelper", "differentDaysByMillisecond get config days is: ", Integer.valueOf(iCurrentTimeMillis));
        return iCurrentTimeMillis;
    }

    public void d(final HealthCheckBox healthCheckBox, final eby ebyVar) {
        if (healthCheckBox == null || ebyVar == null) {
            LogUtil.j("PluginDevice_ScaleBusinessHelper", "synAutoUpgradeStatus autoUpgradeSwitch is null or wiFiDevice is null");
        } else {
            ean.c(ebyVar.e(), healthCheckBox.isChecked() ? "1" : "0", new ICloudOperationResult() { // from class: dyl
                @Override // com.huawei.hwcloudmodel.callback.ICloudOperationResult
                public final void operationResult(Object obj, String str, boolean z) {
                    dyk.e(healthCheckBox, ebyVar, obj, str, z);
                }
            });
        }
    }

    static /* synthetic */ void e(HealthCheckBox healthCheckBox, eby ebyVar, Object obj, String str, boolean z) {
        LogUtil.a("PluginDevice_ScaleBusinessHelper", "showConfigureAutoUpgradeDialog AutoUpgradeStatus isSuccess:", Boolean.valueOf(z));
        if (z) {
            eas.b(ebyVar.e(), healthCheckBox.isChecked() ? "1" : "0");
        }
    }

    public int c(ListView listView, Activity activity) {
        if (listView == null || activity == null) {
            LogUtil.j("PluginDevice_ScaleBusinessHelper", "getDialogHeight listView is null or activity is null");
            return 0;
        }
        int iE = era.e(listView);
        Object systemService = activity.getSystemService(Constants.NATIVE_WINDOW_SUB_DIR);
        if (!(systemService instanceof WindowManager)) {
            return 0;
        }
        int height = (((WindowManager) systemService).getDefaultDisplay().getHeight() / 2) - era.c(BaseApplication.getContext(), 84.0f);
        return iE < height ? iE : height;
    }

    public boolean b(eby ebyVar, String str) {
        if (ebyVar == null || ebyVar.a().m() != 2) {
            return false;
        }
        MeasurableDevice measurableDeviceB = dmp.d().b(str, true);
        return measurableDeviceB == null || (measurableDeviceB instanceof eby);
    }

    public boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("PluginDevice_ScaleBusinessHelper", "isBluetoothDevice uniqueId is null");
            return false;
        }
        return dmp.d().b(str, true) instanceof efx;
    }

    public void d() {
        e();
    }

    private static void e() {
        synchronized (f32526a) {
            e = null;
        }
    }
}
