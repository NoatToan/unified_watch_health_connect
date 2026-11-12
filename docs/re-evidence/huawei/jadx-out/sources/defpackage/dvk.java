package defpackage;

import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.health.device.connectivity.comm.MeasurableDevice;
import com.huawei.health.device.model.HealthDevice;
import com.huawei.health.device.ui.measure.fragment.HagridDeviceManagerFragment;
import com.huawei.health.device.util.EventBus;
import com.huawei.hwcloudmodel.callback.ICloudOperationResult;
import com.huawei.hwcloudmodel.model.CloudCommonReponse;
import com.huawei.hwcloudmodel.model.unite.DeviceServiceInfo;
import com.huawei.hwcloudmodel.model.unite.WifiDeviceControlDataModelReq;
import com.huawei.hwcloudmodel.model.unite.WifiDeviceExitAuthorizeSubUserReq;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.utils.Constants;
import com.huawei.plugindevice.R;
import com.huawei.ui.commonui.dialog.CommonDialog21;
import com.huawei.ui.commonui.dialog.CustomTextAlertDialog;
import defpackage.dvk;
import health.compact.a.SharedPreferenceManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes7.dex */
public class dvk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WeakReference<Activity> f32413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private WeakReference<CommonDialog21> f32414b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private dxi f32415c;
    private dvi d;
    private WeakReference<HagridDeviceManagerFragment> e;
    private String i;
    private String j;

    private dvk() {
        this.f32415c = new dxi();
        this.f32414b = new WeakReference<>(null);
    }

    public void c(String str, String str2, Activity activity, dvi dviVar, HagridDeviceManagerFragment hagridDeviceManagerFragment) {
        this.i = str;
        this.j = str2;
        this.f32413a = new WeakReference<>(activity);
        this.d = dviVar;
        this.e = new WeakReference<>(hagridDeviceManagerFragment);
    }

    public static dvk b() {
        return a.f32416c;
    }

    public void d(String str, dti dtiVar, HagridDeviceManagerFragment hagridDeviceManagerFragment) {
        if (qrs.r()) {
            LogUtil.j("RestoreFactoryManager", "clickRequestDeviceShareItem click too fast.");
            return;
        }
        this.i = str;
        if (!(dmp.d().b(str, true) instanceof efx)) {
            hagridDeviceManagerFragment.showSelectBindDeviceDialog();
            return;
        }
        if (!d(dtiVar)) {
            LogUtil.j("RestoreFactoryManager", "bluetooth is not connect");
            return;
        }
        Context context = BaseApplication.getContext();
        if (!ecj.b(context) && dxm.p(this.j)) {
            qpx.e(context, R.string.IDS_device_wifi_not_network);
        } else {
            d(this.f32413a.get());
        }
    }

    private void d(final Activity activity) {
        if (activity == null) {
            LogUtil.j("RestoreFactoryManager", "showDataDialog activity is null");
            return;
        }
        CustomTextAlertDialog.Builder builder = new CustomTextAlertDialog.Builder(activity);
        builder.a(R.string.IDS_device_bluetooth_open).b(R.string.IDS_device_wifi_factory_data_reset_msg).a(R.string.IDS_settings_button_ok, new View.OnClickListener() { // from class: dvs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f32427b.b(activity, view);
            }
        }).e(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: dvv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LogUtil.a("RestoreFactoryManager", "restoreFactory on click negative");
            }
        });
        CustomTextAlertDialog customTextAlertDialogB = builder.b();
        customTextAlertDialogB.setCancelable(false);
        customTextAlertDialogB.show();
    }

    /* synthetic */ void b(Activity activity, View view) {
        LogUtil.a("RestoreFactoryManager", "factory data reset");
        MeasurableDevice measurableDeviceB = dmp.d().b(this.i, false);
        boolean z = measurableDeviceB instanceof efx;
        if (!z && !(measurableDeviceB instanceof eby)) {
            LogUtil.j("RestoreFactoryManager", "device type is not ble or wifi");
            return;
        }
        a(activity, activity.getString(R.string.IDS_hw_dialog_unbinding_message));
        if (z) {
            LogUtil.j("RestoreFactoryManager", "RESTORE_FACTORY_EVENT_SEND_RESET_COMMAND");
            b("send_reset_cmd", new Bundle());
        } else {
            if (measurableDeviceB instanceof eby) {
                Bundle bundle = new Bundle();
                bundle.putString("deviceId", ((eby) measurableDeviceB).e());
                LogUtil.j("RestoreFactoryManager", "RESTORE_FACTORY_EVENT_UNBIND_CLOUD_DEVICE");
                b("unbind_cloud_device", bundle);
                e(measurableDeviceB);
                return;
            }
            LogUtil.j("RestoreFactoryManager", "unknow device type");
        }
    }

    private boolean d(dti dtiVar) {
        Context context = BaseApplication.getContext();
        if (BluetoothAdapter.getDefaultAdapter().isEnabled()) {
            if (e(dtiVar)) {
                return true;
            }
            qpx.e(context, R.string.IDS_plugin_device_weight_device_not_connect);
            return false;
        }
        if (dtiVar != null) {
            dtiVar.b(1);
        } else {
            LogUtil.j("RestoreFactoryManager", "bluetooth is off, but mWeightInteractor is null");
            qpx.e(context, R.string.IDS_hw_health_music_check_bluetooth_connection);
        }
        return false;
    }

    private boolean e(dti dtiVar) {
        if (dtiVar != null) {
            return dtiVar.c();
        }
        return false;
    }

    private void a(Activity activity, String str) {
        if (this.f32414b.get() == null) {
            new CommonDialog21(activity, R.style.app_update_dialogActivity);
            CommonDialog21 commonDialog21B = CommonDialog21.b(activity);
            commonDialog21B.b(str);
            commonDialog21B.c();
            commonDialog21B.setCancelable(false);
            this.f32414b = new WeakReference<>(commonDialog21B);
            return;
        }
        LogUtil.a("R_Weight_RestoreFactoryManager", "showLoadingDialog: mLoadingDialog is not null");
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005b  */
    public void b(String str, Bundle bundle) {
        dvi dviVar;
        byte b2;
        if (TextUtils.isEmpty(str) || (dviVar = this.d) == null) {
            LogUtil.j("RestoreFactoryManager", "processRestoreFactory illegal argments, eventType ", str);
            return;
        }
        dviVar.removeMessages(13);
        Message messageObtain = Message.obtain();
        messageObtain.what = 13;
        messageObtain.arg1 = 1;
        this.d.sendMessageDelayed(messageObtain, 6000L);
        str.hashCode();
        int iHashCode = str.hashCode();
        if (iHashCode != -1810862359) {
            if (iHashCode != -834878221) {
                if (iHashCode == 669290067 && str.equals("send_reset_cmd")) {
                    b2 = 2;
                } else {
                    b2 = -1;
                }
            } else if (str.equals("unbind_local_device")) {
                b2 = 1;
            } else {
                b2 = -1;
            }
        } else if (str.equals("unbind_cloud_device")) {
            b2 = 0;
        } else {
            b2 = -1;
        }
        if (b2 == 0) {
            if (bundle == null || TextUtils.isEmpty(bundle.getString("deviceId"))) {
                LogUtil.j("RestoreFactoryManager", "illegal argument, deviceId must provided");
                return;
            } else {
                a(bundle.getString("deviceId"), true);
                return;
            }
        }
        if (b2 == 1) {
            this.d.removeMessages(13);
            e();
            LogUtil.a("RestoreFactoryManager", "restory factory succeed");
        } else if (b2 == 2) {
            EventBus.a(new EventBus.d("device_reset"));
        } else {
            LogUtil.j("RestoreFactoryManager", "processRestoreFactory unknow event_type");
        }
    }

    private void a(String str, final boolean z) {
        this.f32415c.c(str, new ICloudOperationResult() { // from class: dvm
            @Override // com.huawei.hwcloudmodel.callback.ICloudOperationResult
            public final void operationResult(Object obj, String str2, boolean z2) {
                this.d.e(z, (CloudCommonReponse) obj, str2, z2);
            }
        });
    }

    /* synthetic */ void e(boolean z, CloudCommonReponse cloudCommonReponse, String str, boolean z2) {
        int iIntValue;
        String resultDesc;
        LogUtil.a("RestoreFactoryManager", "onClickUnBind :", Boolean.valueOf(z2));
        HagridDeviceManagerFragment hagridDeviceManagerFragment = this.e.get();
        if (hagridDeviceManagerFragment == null) {
            LogUtil.j("RestoreFactoryManager", "unBindCloudDevice, fragment is null");
            return;
        }
        if (hagridDeviceManagerFragment.isDestory()) {
            LogUtil.j("RestoreFactoryManager", "unBindCloudDevice HagridDeviceManagerFragment is Destory");
            Activity activity = this.f32413a.get();
            if (activity == null) {
                activity = BaseApplication.getActivity();
                LogUtil.a("RestoreFactoryManager", "unBindCloudDevice, ", activity);
            }
            if (activity != null) {
                activity.finish();
                return;
            } else {
                LogUtil.j("RestoreFactoryManager", "unBindCloudDevice HagridDeviceManagerFragment mainActivity is null");
                return;
            }
        }
        c();
        if (cloudCommonReponse == null) {
            iIntValue = -1;
            resultDesc = "unknown error";
        } else {
            iIntValue = cloudCommonReponse.getResultCode().intValue();
            resultDesc = cloudCommonReponse.getResultDesc();
        }
        if (!z2 && iIntValue != 112000000) {
            d();
            h();
        } else if (z) {
            b("send_reset_cmd", new Bundle());
        } else {
            e();
        }
        LogUtil.j("RestoreFactoryManager", " unBindCloudDevice error:", Integer.valueOf(iIntValue), ",resultDesc:", resultDesc);
    }

    private void c() {
        dvi dviVar = this.d;
        if (dviVar != null) {
            dviVar.removeMessages(9);
        }
    }

    private void d() {
        CommonDialog21 commonDialog21 = this.f32414b.get();
        if (commonDialog21 != null) {
            commonDialog21.cancel();
        }
    }

    public void e() {
        LogUtil.a("RestoreFactoryManager", "unBindLocalDevice starting:");
        d();
        HagridDeviceManagerFragment hagridDeviceManagerFragment = this.e.get();
        if (hagridDeviceManagerFragment == null || hagridDeviceManagerFragment.isDestory()) {
            LogUtil.j("RestoreFactoryManager", "unBindLocalDevice, fragment is destroyed");
            return;
        }
        MeasurableDevice measurableDeviceB = dmp.d().b(this.i, false);
        LogUtil.a("RestoreFactoryManager", "unBindLocalDevice starting device：", measurableDeviceB);
        this.f32415c.a(hagridDeviceManagerFragment.getContentValues(), hagridDeviceManagerFragment.getWiFiDevice(), hagridDeviceManagerFragment.getProductInfo());
        eam.d().a(this.j);
        if (measurableDeviceB != null && !(measurableDeviceB instanceof eby)) {
            if (hagridDeviceManagerFragment.getWeightInteractor() != null) {
                hagridDeviceManagerFragment.getWeightInteractor().d(false);
                hagridDeviceManagerFragment.getWeightInteractor().onDestroy();
            }
            measurableDeviceB.disconnect();
        }
        Context context = BaseApplication.getContext();
        dxn.e("RestoreFactoryManager", "", context, this.i);
        dxn.b("RestoreFactoryManager", "", context, this.i);
        SharedPreferenceManager.e(context, String.valueOf(10000), "isNfcConnect" + this.i, null, null);
        SharedPreferenceManager.e(context, String.valueOf(10000), "hagridConfigureTheNetwork" + this.i, null, null);
        SharedPreferenceManager.e(context, String.valueOf(10000), "hagridConfigureAutoUpgrade" + this.i, null, null);
        LogUtil.a("RestoreFactoryManager", "unBindLocalDevice isSuccess:");
        Activity activity = this.f32413a.get();
        if (activity == null) {
            activity = BaseApplication.getActivity();
            LogUtil.a("RestoreFactoryManager", "unBindLocalDevice, ", activity);
        }
        if (activity != null) {
            activity.finish();
        }
    }

    private void h() {
        HandlerExecutor.c(new Runnable() { // from class: dvu
            @Override // java.lang.Runnable
            public final void run() {
                this.f32429c.a();
            }
        });
    }

    public void a() {
        qpx.a(BaseApplication.getContext(), R.string.IDS_update_server_bussy);
    }

    public void e(HealthDevice healthDevice) {
        LogUtil.j("R_Weight_RestoreFactoryManager", "unbindConfirmed device");
        if (healthDevice == null) {
            LogUtil.j("RestoreFactoryManager", "device has unbind unBindLocalDevice");
            e();
            return;
        }
        if (healthDevice instanceof eby) {
            eby ebyVar = (eby) healthDevice;
            if (!TextUtils.isEmpty(ebyVar.e())) {
                LogUtil.j("RestoreFactoryManager", "unbindConfirmed WiFiDevice and onClickUnBind");
                e(ebyVar);
                return;
            }
        }
        if (healthDevice instanceof efx) {
            LogUtil.j("RestoreFactoryManager", "unbindConfirmed WiFiDevice and unBindLocalDevice");
            e();
        } else {
            LogUtil.j("RestoreFactoryManager", "device instanceof unknown unBindLocalDevice");
            e();
        }
    }

    private void e(eby ebyVar) {
        final Context context = BaseApplication.getContext();
        if (!ecj.b(context)) {
            HandlerExecutor.b(new Runnable() { // from class: com.huawei.health.device.ui.measure.mgr.RestoreFactoryManager$$ExternalSyntheticLambda8
                @Override // java.lang.Runnable
                public final void run() {
                    dvk.d(context);
                }
            });
            return;
        }
        HagridDeviceManagerFragment hagridDeviceManagerFragment = this.e.get();
        if (hagridDeviceManagerFragment == null || hagridDeviceManagerFragment.isDestory()) {
            LogUtil.j("RestoreFactoryManager", "onclick unbind, fragment is destroyed");
            return;
        }
        hagridDeviceManagerFragment.setWiFiDevice(ebyVar);
        if (ebyVar != null) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 9;
            messageObtain.arg1 = 2;
            if (this.d == null) {
                this.d = new dvi(hagridDeviceManagerFragment);
            }
            this.d.sendMessageDelayed(messageObtain, 8000L);
            if (ebyVar.a().m() == 2) {
                a(context, ebyVar.e());
                return;
            } else {
                a(ebyVar.e(), false);
                return;
            }
        }
        LogUtil.j("R_Weight_RestoreFactoryManager", " onClickUnBind WiFiDevice is null");
    }

    public static /* synthetic */ void d(Context context) {
        LogUtil.a("RestoreFactoryManager", "onClickUnBind start runOnUiThread");
        qpx.a(context, R.string.IDS_device_wifi_not_network);
    }

    private void a(Context context, final String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("R_Weight_RestoreFactoryManager", "sendExitAuthorization deviceid is null");
            return;
        }
        ArrayList arrayList = new ArrayList(16);
        DeviceServiceInfo deviceServiceInfo = new DeviceServiceInfo();
        HashMap map = new HashMap(16);
        map.put("dltId", LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011));
        deviceServiceInfo.setData(map);
        deviceServiceInfo.setSid("setDevParam");
        arrayList.add(deviceServiceInfo);
        WifiDeviceControlDataModelReq wifiDeviceControlDataModelReq = new WifiDeviceControlDataModelReq();
        wifiDeviceControlDataModelReq.setDeviceServiceInfo(arrayList);
        wifiDeviceControlDataModelReq.setDevId(str);
        lqo.b(context).e(wifiDeviceControlDataModelReq, new ICloudOperationResult() { // from class: dvq
            @Override // com.huawei.hwcloudmodel.callback.ICloudOperationResult
            public final void operationResult(Object obj, String str2, boolean z) {
                this.f32423b.c(str, (CloudCommonReponse) obj, str2, z);
            }
        });
    }

    /* synthetic */ void c(String str, CloudCommonReponse cloudCommonReponse, String str2, boolean z) {
        if (z) {
            d(str);
            LogUtil.a("RestoreFactoryManager", "sendExitAuthorization success ");
        } else if (cloudCommonReponse != null) {
            Integer resultCode = cloudCommonReponse.getResultCode();
            int iIntValue = resultCode.intValue();
            LogUtil.j("RestoreFactoryManager", "errorCode = ", resultCode, " | errorDes = ", cloudCommonReponse.getResultDesc());
            if (iIntValue == 112000030) {
                c();
                e();
            } else {
                d(str);
            }
        }
    }

    private void d(String str) {
        WifiDeviceExitAuthorizeSubUserReq wifiDeviceExitAuthorizeSubUserReq = new WifiDeviceExitAuthorizeSubUserReq();
        wifiDeviceExitAuthorizeSubUserReq.setDevId(str);
        lqo.b(dxw.d()).b(wifiDeviceExitAuthorizeSubUserReq, new ICloudOperationResult() { // from class: dvo
            @Override // com.huawei.hwcloudmodel.callback.ICloudOperationResult
            public final void operationResult(Object obj, String str2, boolean z) {
                this.f32419a.a((CloudCommonReponse) obj, str2, z);
            }
        });
    }

    /* synthetic */ void a(CloudCommonReponse cloudCommonReponse, String str, boolean z) {
        int iIntValue;
        String resultDesc;
        LogUtil.a("RestoreFactoryManager", "subUserUnBind :", Boolean.valueOf(z));
        c();
        if (z) {
            e();
            return;
        }
        if (cloudCommonReponse == null) {
            iIntValue = Constants.CODE_UNKNOWN_ERROR;
            resultDesc = "unknown error";
        } else {
            iIntValue = cloudCommonReponse.getResultCode().intValue();
            resultDesc = cloudCommonReponse.getResultDesc();
        }
        if (iIntValue == 112000030 || iIntValue == 112000000) {
            e();
        } else {
            h();
        }
        LogUtil.j("RestoreFactoryManager", " subUserUnBind error:", Integer.valueOf(iIntValue), ",resultDesc:", resultDesc);
    }

    public void a(final Activity activity) {
        LogUtil.a("RestoreFactoryManager", "unBindDevice start");
        if (activity == null) {
            LogUtil.j("RestoreFactoryManager", "unBindDevice activity is null");
            return;
        }
        CustomTextAlertDialog.Builder builder = new CustomTextAlertDialog.Builder(activity);
        builder.a(R.string.IDS_device_bluetooth_open);
        final MeasurableDevice measurableDeviceB = dmp.d().b(this.i, false);
        if ((measurableDeviceB instanceof eby) && ((eby) measurableDeviceB).a().m() == 1) {
            builder.b(R.string.IDS_unbind_device_wear_home);
        } else {
            builder.b(R.string.IDS_device_selection_cancel_unbind_device);
        }
        builder.a(com.huawei.ui.commonui.R.string.IDS_hw_health_wear_connect_device_unpair_button, new View.OnClickListener() { // from class: dvp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.e.e(measurableDeviceB, activity, view);
            }
        }).e(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: dvt
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f32428b.c(view);
            }
        });
        CustomTextAlertDialog customTextAlertDialogB = builder.b();
        customTextAlertDialogB.setCancelable(false);
        customTextAlertDialogB.show();
    }

    /* synthetic */ void e(HealthDevice healthDevice, Activity activity, View view) {
        if ((healthDevice instanceof eby) && ((eby) healthDevice).a().m() == 1) {
            c(activity, healthDevice);
        } else {
            e(healthDevice);
        }
    }

    /* synthetic */ void c(View view) {
        HagridDeviceManagerFragment hagridDeviceManagerFragment = this.e.get();
        if (hagridDeviceManagerFragment == null || hagridDeviceManagerFragment.getWeightInteractor() == null) {
            return;
        }
        LogUtil.a("RestoreFactoryManager", "start reconnect and start timer");
        hagridDeviceManagerFragment.getWeightInteractor().f();
    }

    private void c(Activity activity, final HealthDevice healthDevice) {
        if (activity == null) {
            LogUtil.j("RestoreFactoryManager", "showStepOnScaleDialog activity is null");
            return;
        }
        CustomTextAlertDialog.Builder builder = new CustomTextAlertDialog.Builder(activity);
        builder.a(R.string.IDS_device_bluetooth_open);
        builder.b(R.string.IDS_device_bluetooth_rebind_msg_tip_1).a(R.string.IDS_device_permisson, new View.OnClickListener() { // from class: dvn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f32418a.b(healthDevice, view);
            }
        });
        CustomTextAlertDialog customTextAlertDialogB = builder.b();
        customTextAlertDialogB.setCancelable(false);
        customTextAlertDialogB.show();
    }

    /* synthetic */ void b(HealthDevice healthDevice, View view) {
        dxm.b(this.i);
        b().e(healthDevice);
    }

    static class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final dvk f32416c = new dvk();
    }
}
