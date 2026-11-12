package defpackage;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.huawei.haf.bundle.AppBundleLauncher;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwcommonmodel.utils.SimpleChain;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.dialog.CustomTextAlertDialog;
import com.huawei.ui.device.activity.appmarket.HwSmartAppMarketLoadingActivity;
import com.huawei.ui.homehealth.device.featureaction.featurestrategy.FeatureBaseStrategy;
import com.huawei.ui.homewear21.R;
import java.util.HashMap;

/* JADX INFO: loaded from: classes17.dex */
public class rpw extends FeatureBaseStrategy {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private CustomTextAlertDialog f47571c;

    @Override // com.huawei.ui.homehealth.device.featureaction.featurestrategy.FeatureBaseStrategy
    public boolean canJumpWithConnect() {
        return false;
    }

    @Override // com.huawei.ui.homehealth.device.featureaction.featurestrategy.FeatureBaseStrategy, com.huawei.ui.homehealth.device.featureaction.featurestrategy.FeatureStrategy
    public boolean jumpToFeaturePage(DeviceInfo deviceInfo, SimpleChain.Emitter emitter) {
        if (super.jumpToFeaturePage(deviceInfo, emitter)) {
            return true;
        }
        d(this.mDeviceInfo);
        return true;
    }

    @Override // com.huawei.ui.homehealth.device.featureaction.featurestrategy.FeatureBaseStrategy
    public void reportBiEvent() {
        rdt.a();
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.HOME_101002042.value(), new HashMap(16), 0);
    }

    public void d(final DeviceInfo deviceInfo) {
        if (lyy.b().j()) {
            LogUtil.a("AppMarketStrategy", "openAppMarketView isDeviceVersionNotSupport");
            xjt.j("openAppMarketView isDeviceVersionNotSupport");
            b(deviceInfo);
        } else {
            final Activity activity = BaseApplication.getActivity();
            if (activity == null) {
                LogUtil.a("AppMarketStrategy", "openAppMarketView activity is null");
            } else {
                lze.c().a(new IBaseResponseCallback() { // from class: rpu
                    @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                    /* JADX INFO: renamed from: onResponse */
                    public final void a(int i, Object obj) {
                        Activity activity2 = activity;
                        activity2.runOnUiThread(new Runnable() { // from class: rpt
                            @Override // java.lang.Runnable
                            public final void run() {
                                Activity activity3 = activity2;
                                lyy.b().d(activity3, new AppBundleLauncher.InstallCallback() { // from class: rqa
                                    @Override // com.huawei.haf.bundle.AppBundleLauncher.InstallCallback
                                    public final boolean call(Context context, Intent intent) {
                                        return rpw.b(deviceInfo, activity3, context, intent);
                                    }
                                });
                            }
                        });
                    }
                });
            }
        }
    }

    static /* synthetic */ boolean b(DeviceInfo deviceInfo, Activity activity, Context context, Intent intent) {
        lyy.b().f();
        if (lyy.b().b(deviceInfo)) {
            try {
                Intent intent2 = new Intent();
                intent2.setClass(activity, HwSmartAppMarketLoadingActivity.class);
                activity.startActivity(intent2);
                LogUtil.a("AppMarketStrategy", "openAppMarketView HwSmartAppMarketLoadingActivity");
            } catch (ActivityNotFoundException unused) {
                LogUtil.e("AppMarketStrategy", "openAppMarketView NotFoundException");
            }
        } else {
            LogUtil.a("AppMarketStrategy", "openAppMarketView showAppMarketView");
            lyy.b().g();
        }
        return false;
    }

    private void b(final DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            LogUtil.j("AppMarketStrategy", "jumpPageToFace deviceInfo == null");
            return;
        }
        Activity activity = BaseApplication.getActivity();
        if (activity == null) {
            return;
        }
        CustomTextAlertDialog customTextAlertDialogB = new CustomTextAlertDialog.Builder(activity).a(R.string.IDS_hw_health_show_common_dialog_title).b(com.huawei.ui.commonui.R.string.IDS_app_market_device_update).e(R.string.IDS_app_update_later, new View.OnClickListener() { // from class: rpv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f47570a.c(view);
            }
        }).a(R.string.IDS_app_update_now, new View.OnClickListener() { // from class: rps
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f47566a.b(deviceInfo, view);
            }
        }).b();
        this.f47571c = customTextAlertDialogB;
        customTextAlertDialogB.setCancelable(false);
        if (this.f47571c.isShowing() || activity.isFinishing()) {
            return;
        }
        this.f47571c.show();
    }

    /* synthetic */ void c(View view) {
        CustomTextAlertDialog customTextAlertDialog = this.f47571c;
        if (customTextAlertDialog != null) {
            customTextAlertDialog.dismiss();
            this.f47571c = null;
        }
    }

    /* synthetic */ void b(DeviceInfo deviceInfo, View view) {
        HashMap<String, String> map = new HashMap<>();
        map.put("device_id", deviceInfo.getDeviceIdentify());
        startActivity("com.huawei.ui.device.activity.update.UpdateVersionActivity", map);
    }
}
