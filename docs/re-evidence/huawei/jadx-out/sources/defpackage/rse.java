package defpackage;

import android.app.Activity;
import android.view.View;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.SimpleChain;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.homehealth.device.featureaction.featurestrategy.FeatureBaseStrategy;
import com.huawei.ui.homewear21.R;
import health.compact.a.CommonUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.HashMap;

/* JADX INFO: loaded from: classes17.dex */
public class rse extends FeatureBaseStrategy {
    @Override // com.huawei.ui.homehealth.device.featureaction.featurestrategy.FeatureBaseStrategy
    public boolean canJumpWithConnect() {
        return false;
    }

    @Override // com.huawei.ui.homehealth.device.featureaction.featurestrategy.FeatureBaseStrategy, com.huawei.ui.homehealth.device.featureaction.featurestrategy.FeatureStrategy
    public boolean jumpToFeaturePage(DeviceInfo deviceInfo, SimpleChain.Emitter emitter) {
        if (super.jumpToFeaturePage(deviceInfo, emitter)) {
            return true;
        }
        if (this.mDeviceInfo == null) {
            LogUtil.j("NotificationSettingStrategy", "jumpPageToFace deviceInfo == null");
            return false;
        }
        boolean zD = tqp.d(BaseApplication.getContext(), this.mDeviceInfo.getProductType(), true);
        LogUtil.e("NotificationSettingStrategy", "isShowMessageNotificationDialog:", Boolean.valueOf(zD));
        if (zD) {
            HandlerExecutor.a().post(new Runnable() { // from class: rsc
                @Override // java.lang.Runnable
                public final void run() {
                    this.f47627c.c();
                }
            });
        } else {
            b();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void c() {
        final Activity activity = BaseApplication.getActivity();
        if (activity == null) {
            LogUtil.j("NotificationSettingStrategy", "showMissSensitiveNotificationDialog activity is null");
            return;
        }
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = new NoTitleCustomAlertDialog.Builder(activity).a(BaseApplication.getContext().getResources().getString(R.string.IDS_miss_sensitive_notification_message_new)).c(R.string.IDS_hw_health_user_profile_go_setting, new View.OnClickListener() { // from class: rsb
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f47626c.d(activity, view);
            }
        }).a(R.string.IDS_main_btn_state_ignore, new View.OnClickListener() { // from class: rsf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.e.d(view);
            }
        }).c();
        noTitleCustomAlertDialogC.setCancelable(false);
        noTitleCustomAlertDialogC.show();
    }

    /* synthetic */ void d(Activity activity, View view) {
        ReleaseLogUtil.d("R_NotificationSettingStrategy", "showMissSensitiveNotificationDialog mDeviceMac is ", CommonUtil.n(this.mDeviceInfo.getDeviceIdentify()));
        lvb.e().setSharedPreference("KEY_APPLY_PARTNER_PERMISSIONS_FROM", "NOTIFICATION", null);
        rdp.a(this.mDeviceInfo.getDeviceIdentify(), activity, this.mDeviceInfo.getDeviceBluetoothType());
    }

    /* synthetic */ void d(View view) {
        b();
    }

    private void b() {
        if (this.mDeviceInfo == null) {
            LogUtil.j("NotificationSettingStrategy", "jumpToNotification deviceInfo == null");
            return;
        }
        HashMap<String, String> map = new HashMap<>();
        map.put("device_id", this.mDeviceInfo.getDeviceIdentify());
        startActivity("com.huawei.ui.device.activity.notification.NotificationSettingActivity", map);
    }

    @Override // com.huawei.ui.homehealth.device.featureaction.featurestrategy.FeatureBaseStrategy
    public void reportBiEvent() {
        rdt.a(this.mDeviceInfo);
    }
}
