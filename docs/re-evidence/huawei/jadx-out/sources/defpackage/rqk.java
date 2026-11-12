package defpackage;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import com.huawei.health.device.ui.DeviceMainActivity;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.ecologydevice.ui.util.PermissionDialogHelper;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.SimpleChain;
import com.huawei.hwdevice.outofprocess.mgr.device.CloudDeviceInfo;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.ble.BleConstants;
import com.huawei.ui.homehealth.device.featureaction.featurestrategy.FeatureBaseStrategy;

/* JADX INFO: loaded from: classes17.dex */
public class rqk extends FeatureBaseStrategy {
    @Override // com.huawei.ui.homehealth.device.featureaction.featurestrategy.FeatureBaseStrategy
    public boolean canJumpWithConnect() {
        return true;
    }

    @Override // com.huawei.ui.homehealth.device.featureaction.featurestrategy.FeatureBaseStrategy
    public boolean canJumpWithOtaTransfering() {
        return true;
    }

    @Override // com.huawei.ui.homehealth.device.featureaction.featurestrategy.FeatureBaseStrategy
    public void reportBiEvent() {
    }

    @Override // com.huawei.ui.homehealth.device.featureaction.featurestrategy.FeatureBaseStrategy, com.huawei.ui.homehealth.device.featureaction.featurestrategy.FeatureStrategy
    public boolean jumpToFeaturePage(DeviceInfo deviceInfo, SimpleChain.Emitter emitter) {
        super.jumpToFeaturePage(deviceInfo, emitter);
        return true;
    }

    public void a(Activity activity, DeviceInfo deviceInfo) {
        if (deviceInfo instanceof CloudDeviceInfo) {
            rtk.c((Context) activity, lvl.e((CloudDeviceInfo) deviceInfo), true);
            return;
        }
        dxy dxyVar = new dxy();
        dxyVar.d(deviceInfo.getDeviceIdentify());
        dxyVar.e(deviceInfo.getProductType());
        dxyVar.a(deviceInfo.getDeviceName());
        rtk.d(BaseApplication.getActivity(), dxyVar);
    }

    public void e(Activity activity, ContentValues contentValues, elh elhVar) {
        LogUtil.a("DeviceDetailStrategy", "startThirdPartAction");
        String asString = contentValues.getAsString("productId");
        if (BleConstants.BLE_THIRD_DEVICE_H5.equals(elhVar.n().b())) {
            PermissionDialogHelper.d(activity, new e(activity, elhVar, contentValues.getAsString("uniqueId")));
        } else if ("4bfc5a27-f2b9-4c41-bd9b-a4a2a18f752c".equals(asString)) {
            LogUtil.a("DeviceDetailStrategy", "enter enmo");
            e(activity, contentValues);
        } else {
            rtk.e(activity, contentValues, elhVar);
        }
    }

    private void e(Activity activity, ContentValues contentValues) {
        LogUtil.a("DeviceDetailStrategy", "enter dealJumpNemoActivity...");
        if (activity == null || contentValues == null) {
            LogUtil.j("DeviceDetailStrategy", "activity or deviceInfo is null");
            return;
        }
        String asString = contentValues.getAsString("uniqueId");
        if (era.a(contentValues)) {
            Intent intent = new Intent(activity, (Class<?>) DeviceMainActivity.class);
            intent.putExtra("PID_FROM_QRCODE", "ZAA6");
            intent.putExtra("productId", contentValues.getAsString("productId"));
            intent.putExtra("Device_Type", "082");
            intent.putExtra("macAddress", asString);
            iov.d(BaseApplication.getContext(), intent);
            return;
        }
        LogUtil.a("DeviceDetailStrategy", "enter enmo");
        new elc().a(activity, asString);
    }

    class e implements PermissionDialogHelper.OpenBlueToothAction {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Context f47578b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f47579c;
        private elh d;
        private String e;

        private e(Context context, elh elhVar, String str) {
            this.d = elhVar;
            this.f47578b = context;
            this.f47579c = str;
            this.e = elhVar.t();
        }

        @Override // com.huawei.health.ecologydevice.ui.util.PermissionDialogHelper.OpenBlueToothAction
        public void onPermissionGranted() {
            if (this.f47578b == null) {
                LogUtil.j("DeviceDetailStrategy", "startThirdPartAction onPermissionGranted activity is null");
            } else if ("1".equals(this.d.g())) {
                LogUtil.a("DeviceDetailStrategy", "startThirdPartAction onPermissionGranted switchToH5ProIntro");
                etn.c(this.f47578b, this.d, this.e, this.f47579c);
            } else {
                LogUtil.a("DeviceDetailStrategy", "startThirdPartAction onPermissionGranted startWebViewActivity");
                rtk.b(this.f47578b, this.e, this.f47579c, this.d.n().b());
            }
        }

        @Override // com.huawei.health.ecologydevice.ui.util.PermissionDialogHelper.OpenBlueToothAction
        public void onPermissionDenied() {
            LogUtil.a("DeviceDetailStrategy", "Permission onPermissionDenied");
        }
    }
}
