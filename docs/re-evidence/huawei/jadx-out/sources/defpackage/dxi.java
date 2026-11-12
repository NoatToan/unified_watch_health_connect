package defpackage;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.huawei.haf.common.utils.HexUtils;
import com.huawei.health.device.callback.ScaleDialogCallback;
import com.huawei.health.device.connectivity.comm.MeasurableDevice;
import com.huawei.health.device.manager.DeviceCloudSharePreferencesManager;
import com.huawei.health.device.model.HealthDevice;
import com.huawei.health.device.open.MeasureController;
import com.huawei.health.device.wifi.control.claim.ClaimWeightDataManager;
import com.huawei.health.ecologydevice.manager.ResourceManager;
import com.huawei.health.versionmgr.api.VersionMgrApi;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcloudmodel.callback.ICloudOperationResult;
import com.huawei.hwcloudmodel.model.CloudCommonReponse;
import com.huawei.hwcloudmodel.model.unite.WifiDeviceUnbindReq;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.plugindevice.R;
import com.huawei.ui.commonui.dialog.CustomButtonMenuDialog;
import defpackage.dxi;
import health.compact.a.CommonUtil;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.Utils;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;

/* JADX INFO: loaded from: classes7.dex */
public class dxi {
    public void c(String str, ICloudOperationResult<CloudCommonReponse> iCloudOperationResult) {
        if (str == null) {
            LogUtil.j("HagrideDeviceFragmentHelper", " proccessUnbind deviceId is null");
            return;
        }
        WifiDeviceUnbindReq wifiDeviceUnbindReq = new WifiDeviceUnbindReq();
        wifiDeviceUnbindReq.setDevId(str);
        LogUtil.a("HagrideDeviceFragmentHelper", "onClickUnBind :", dyg.d(str));
        lqo.b(dxw.d()).e(wifiDeviceUnbindReq, iCloudOperationResult);
    }

    public void a(ContentValues contentValues, eby ebyVar, elh elhVar) {
        if (contentValues == null || TextUtils.isEmpty(contentValues.getAsString("uniqueId")) || TextUtils.isEmpty(contentValues.getAsString("productId"))) {
            LogUtil.j("HagrideDeviceFragmentHelper", "unBindLocalWiFiDevice illegal device info !");
            return;
        }
        String asString = contentValues.getAsString("productId");
        String asString2 = contentValues.getAsString("uniqueId");
        LogUtil.a("HagrideDeviceFragmentHelper", " unBindLocalWiFiDevice currentDevice mBindProductId:", dyg.b(asString));
        LogUtil.a("HagrideDeviceFragmentHelper", " unBindLocalWiFiDevice currentDevice mBindCode:", dyg.b(asString2));
        d(asString, asString2);
        LogUtil.a("HagrideDeviceFragmentHelper", " unBindLocalWiFiDevice removeDeviceFromProfile is pass");
        MeasurableDevice measurableDeviceB = dmp.d().b(asString2, true);
        if (TextUtils.isEmpty(asString) || ResourceManager.c().d(asString) == null) {
            LogUtil.j("HagrideDeviceFragmentHelper", "get productInfo error by productId");
            return;
        }
        MeasureController measureController = drw.e().i(ResourceManager.c().d(asString).q()).getMeasureController();
        Bundle bundle = new Bundle();
        bundle.putInt("type", -5);
        bundle.putString("productId", asString);
        if (measureController == null) {
            LogUtil.j("HagrideDeviceFragmentHelper", "the measurement can be performed only on the device");
        } else {
            measureController.prepare(measurableDeviceB, null, bundle);
        }
        d(ebyVar, asString, elhVar);
        drw.e().d(asString, asString2, -6);
        drw.e().b(asString, asString2);
        drw.e().l(asString2);
        dxm.g(asString2, "");
        ((VersionMgrApi) Services.b("HWVersionMgr", VersionMgrApi.class)).resetBandUpdate(asString, asString2);
        e(elhVar.l().d());
        if (ebyVar != null) {
            ClaimWeightDataManager.INSTANCE.unRegisterCallBack(getClass().getSimpleName());
        }
        StringBuffer stringBuffer = new StringBuffer(16);
        stringBuffer.append("weightUnit");
        if (!TextUtils.isEmpty(asString2)) {
            stringBuffer.append(asString2);
        }
        SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10000), stringBuffer.toString(), "", null);
    }

    private void e(String str) {
        HashMap map = new HashMap(16);
        map.put("click", "1");
        map.put("device_name", str);
        lmf.d().c(dxw.d(), AnalyticsValue.HEALTH_PLUGIN_DEVICE_UNBIND_SUCCEED_2060014.value(), map, 0);
    }

    private void d(eby ebyVar, String str, elh elhVar) {
        LogUtil.j("HagrideDeviceFragmentHelper", "configurationUnbindInformation");
        Context context = BaseApplication.getContext();
        if (ebyVar != null) {
            SharedPreferenceManager.e(context, "wifi_weight_device", "support_multi_account_" + ebyVar.e(), "", null);
            SharedPreferenceManager.e(context, "wifi_weight_device", "health_is_wifi_add_member_first_" + ebyVar.e(), "false", null);
        } else {
            LogUtil.j("HagrideDeviceFragmentHelper", "configurationUnbindInformation, device of wifi is null");
        }
        doq.e().a();
        SharedPreferenceManager.e(context, String.valueOf(10000), "pressure_calibrate_hrv_userinfo_" + str, "", null);
        SharedPreferenceManager.e(context, String.valueOf(10000), "wife_device_send_event_to_kaka_" + elhVar.h(), "", null);
        SharedPreferenceManager.e(context, String.valueOf(10000), "8358eb90-b40d-11e9-a2a3-2a2ae2dbcce4", "", null);
    }

    public void e(final Context context, final IBaseResponseCallback iBaseResponseCallback) {
        if (context == null) {
            LogUtil.j("HagrideDeviceFragmentHelper", "chooseShowOpenNoticeBarMsgSwitchDialog, context is null");
            iBaseResponseCallback.a(-1, "context is null");
            return;
        }
        String strE = SharedPreferenceManager.e(context, Integer.toString(10000), "health_msg_switch_noticebar");
        LogUtil.a("HagrideDeviceFragmentHelper", "chooseShowOpenNoticeBarMsgSwitchDialog, switchStatus = ", strE);
        if (TextUtils.isEmpty(strE)) {
            SharedPreferenceManager.e(context, Integer.toString(10000), "health_msg_switch_noticebar", "1", new StorageParams());
        }
        if ("0".equals(strE)) {
            dys.a().a(context, new ScaleDialogCallback() { // from class: dxg
                @Override // com.huawei.health.device.callback.ScaleDialogCallback
                public final void operationResult(int i) {
                    dxi.d(context, iBaseResponseCallback, i);
                }
            });
        } else {
            iBaseResponseCallback.a(-1, "switch isn't close");
        }
    }

    static /* synthetic */ void d(Context context, IBaseResponseCallback iBaseResponseCallback, int i) {
        if (i == 0) {
            SharedPreferenceManager.e(context, Integer.toString(10000), "health_msg_switch_noticebar", "1", new StorageParams());
            iBaseResponseCallback.a(0, "click positive button");
        } else {
            SharedPreferenceManager.e(context, Integer.toString(10000), "health_msg_switch_noticebar", "0", new StorageParams());
            iBaseResponseCallback.a(0, "click negative button");
        }
    }

    public static void e(String str, String str2) {
        LogUtil.a("HagrideDeviceFragmentHelper", "uploadDeviceToCloud, uniqueId ", dyg.b(str2));
        MeasurableDevice measurableDeviceB = dmp.d().b(str2, false);
        if (measurableDeviceB == null) {
            LogUtil.j("HagrideDeviceFragmentHelper", " uploadDeviceToCloud device not exist");
            return;
        }
        String strC = c(measurableDeviceB, str);
        if (TextUtils.isEmpty(strC)) {
            LogUtil.j("HagrideDeviceFragmentHelper", "can not upload device, device id is null");
            return;
        }
        elh elhVarD = ResourceManager.c().d(str);
        if (elhVarD == null) {
            LogUtil.j("HagrideDeviceFragmentHelper", " uploadDeviceToCloud productInfo is null");
            return;
        }
        String str3 = elo.a(str, elhVarD.l().d()) + era.e(strC);
        LogUtil.a("HagrideDeviceFragmentHelper", "uploadDeviceToCloud device unique id is", dyg.d(strC), "name", str3);
        eai.c(strC, str3, measurableDeviceB);
    }

    public static void d(String str, String str2) {
        MeasurableDevice measurableDeviceB = dmp.d().b(str2, false);
        eai.e(c(measurableDeviceB, str), measurableDeviceB instanceof eby ? "cloud" : "local");
    }

    private static String c(HealthDevice healthDevice, String str) {
        if (healthDevice == null) {
            LogUtil.j("HagrideDeviceFragmentHelper", "getSmartLifeProfileDeviceId device is null");
            return "";
        }
        String uniqueId = healthDevice.getUniqueId();
        if (TextUtils.isEmpty(uniqueId)) {
            LogUtil.j("HagrideDeviceFragmentHelper", "getSmartLifeProfileDeviceId uniqueId is empty");
            return "";
        }
        if (dxm.ai(str)) {
            if (healthDevice instanceof MeasurableDevice) {
                MeasurableDevice measurableDevice = (MeasurableDevice) healthDevice;
                if (!TextUtils.isEmpty(measurableDevice.getSerialNumber())) {
                    return measurableDevice.getSerialNumber();
                }
            }
            return uniqueId;
        }
        String strL = dxm.l(uniqueId);
        if (TextUtils.isEmpty(strL)) {
            if (healthDevice instanceof eby) {
                return ((eby) healthDevice).a().l();
            }
            LogUtil.j("HagrideDeviceFragmentHelper", "getSmartLifeProfileDeviceId fail to get device id");
        }
        return strL;
    }

    public static boolean b(String str) {
        LogUtil.a("HagrideDeviceFragmentHelper", "getDeviceManagerStatus code: ", CommonUtil.n(str));
        DeviceCloudSharePreferencesManager deviceCloudSharePreferencesManager = new DeviceCloudSharePreferencesManager(dxw.d());
        StringBuffer stringBuffer = new StringBuffer(16);
        stringBuffer.append("device_has_manager");
        stringBuffer.append(str);
        return deviceCloudSharePreferencesManager.d(stringBuffer.toString());
    }

    public static boolean c(byte[] bArr, Activity activity, String str) {
        if (bArr != null) {
            String strB = elx.a().b(bArr);
            LogUtil.a("HagrideDeviceFragmentHelper", "main huid = ", dyg.b(strB));
            String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011);
            if (!TextUtils.isEmpty(strB) && !TextUtils.isEmpty(accountInfo)) {
                try {
                    return strB.startsWith(HexUtils.c(accountInfo.getBytes("UTF-8")));
                } catch (UnsupportedEncodingException e) {
                    LogUtil.e(str, "getCurrentUserIsMainUser error :", e.getMessage());
                    return false;
                }
            }
            LogUtil.j(str, "mIsMainUser isEmpty");
            return false;
        }
        LogUtil.j(str, "getCurrentUserIsMainUser huid is null");
        return false;
    }

    public static void a(Context context) {
        if (context == null) {
            LogUtil.j("R_Weight_HagrideDeviceFragmentHelper", "showWiFiEnableDialog context is null");
            return;
        }
        String string = context.getString(R.string.IDS_settings_button_cancal);
        String string2 = context.getString(R.string.IDS_common_enable_button);
        if (string.length() > 10 || string2.length() > 10) {
            e(context);
        } else {
            d(context);
        }
    }

    private static void e(final Context context) {
        int i;
        int i2;
        if (Utils.o()) {
            i = R.string.enable_the_network_over_sea;
            i2 = R.string.IDS_device_wifi_tip_over_sea;
        } else {
            i = R.string.enable_the_network;
            i2 = R.string.IDS_device_request_auto_sync_data_open_wifi_tip_msg;
        }
        CustomButtonMenuDialog customButtonMenuDialogD = new CustomButtonMenuDialog.Builder(context).c(i).a(i2).a(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: dxj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LogUtil.a("HagrideDeviceFragmentHelper", "showWiFiEnableDialog() do nothing");
            }
        }).a(R.string.IDS_common_enable_button, new View.OnClickListener() { // from class: com.huawei.health.device.ui.util.HagrideDeviceFragmentHelper$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dxi.c(context);
            }
        }).d();
        customButtonMenuDialogD.setCancelable(false);
        if (customButtonMenuDialogD.isShowing()) {
            return;
        }
        customButtonMenuDialogD.show();
    }

    private static void d(final Context context) {
        dys.a().b(context, new ScaleDialogCallback() { // from class: com.huawei.health.device.ui.util.HagrideDeviceFragmentHelper$$ExternalSyntheticLambda0
            @Override // com.huawei.health.device.callback.ScaleDialogCallback
            public final void operationResult(int i) {
                dxi.c(context, i);
            }
        });
    }

    public static /* synthetic */ void c(Context context, int i) {
        if (i == 0) {
            c(context);
        } else {
            LogUtil.a("HagrideDeviceFragmentHelper", "showCustomOpenWifiTextAlertDialog() do nothing");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(Context context) {
        if (context.getSystemService("wifi") instanceof WifiManager) {
            if (((WifiManager) context.getSystemService("wifi")).setWifiEnabled(true)) {
                LogUtil.a("HagrideDeviceFragmentHelper", "showWiFiEnableDialog() request share device");
            } else {
                ecs.l(context);
            }
        }
    }
}
