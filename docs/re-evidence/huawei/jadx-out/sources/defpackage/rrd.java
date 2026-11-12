package defpackage;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.SimpleChain;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.dialog.CustomAlertDialog;
import com.huawei.ui.device.utlis.FindNetworkUtils;
import com.huawei.ui.homehealth.device.featureaction.featurestrategy.FeatureBaseStrategy;
import com.huawei.ui.homewear21.R;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes17.dex */
public class rrd extends FeatureBaseStrategy {
    private CustomAlertDialog e;

    @Override // com.huawei.ui.homehealth.device.featureaction.featurestrategy.FeatureBaseStrategy, com.huawei.ui.homehealth.device.featureaction.featurestrategy.FeatureStrategy
    public boolean jumpToFeaturePage(final DeviceInfo deviceInfo, final SimpleChain.Emitter emitter) {
        if (super.jumpToFeaturePage(deviceInfo, emitter)) {
            return true;
        }
        if (this.mDeviceInfo == null) {
            return false;
        }
        if (eey.d(this.mDeviceInfo, 112)) {
            a(this.mDeviceInfo, new View.OnClickListener() { // from class: rre
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f47602b.e(deviceInfo, emitter, view);
                }
            });
        } else {
            a(this.mDeviceInfo);
        }
        return true;
    }

    /* synthetic */ void e(DeviceInfo deviceInfo, SimpleChain.Emitter emitter, View view) {
        CustomAlertDialog customAlertDialog = this.e;
        if (customAlertDialog != null) {
            customAlertDialog.dismiss();
        }
        new rrb().jumpToFeaturePage(deviceInfo, emitter);
    }

    @Override // com.huawei.ui.homehealth.device.featureaction.featurestrategy.FeatureBaseStrategy
    public void reportBiEvent() {
        rdt.d("find_device");
    }

    public void a(final DeviceInfo deviceInfo, View.OnClickListener onClickListener) {
        CustomAlertDialog customAlertDialog = this.e;
        if (customAlertDialog != null && customAlertDialog.isShowing()) {
            this.e.dismiss();
        }
        Activity activity = BaseApplication.getActivity();
        if (activity == null) {
            return;
        }
        View viewInflate = View.inflate(activity, R.layout.find_device_dialog_layout, null);
        LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(R.id.find_watch_layout);
        LinearLayout linearLayout2 = (LinearLayout) viewInflate.findViewById(R.id.find_earphone_layout);
        linearLayout.setOnClickListener(new View.OnClickListener() { // from class: rrf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f47603a.a(deviceInfo, view);
            }
        });
        linearLayout2.setOnClickListener(onClickListener);
        CustomAlertDialog.Builder builder = new CustomAlertDialog.Builder(activity);
        builder.d(com.huawei.ui.homehealth.R.string.IDS_bolt_find_device);
        builder.e(17);
        builder.a(viewInflate);
        builder.a(R.string.IDS_settings_button_cancal, new DialogInterface.OnClickListener() { // from class: rrc
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.f47600a.c(dialogInterface, i);
            }
        });
        CustomAlertDialog customAlertDialogB = builder.b();
        this.e = customAlertDialogB;
        customAlertDialogB.setCancelable(false);
        this.e.setWindowGravityParams(17);
        this.e.show();
    }

    /* synthetic */ void a(DeviceInfo deviceInfo, View view) {
        a(deviceInfo);
        this.e.dismiss();
    }

    /* synthetic */ void c(DialogInterface dialogInterface, int i) {
        this.e.dismiss();
    }

    public void a(DeviceInfo deviceInfo) {
        LogUtil.a("FindDeviceStrategy", "Entering startFindDeviceActivity");
        Intent intent = new Intent();
        Bundle bundle = new Bundle();
        bundle.putParcelable("device", deviceInfo);
        intent.putExtras(bundle);
        intent.setClassName(dmz.y, "com.huawei.ui.device.activity.finddevice.FindDeviceActivity");
        iov.d(BaseApplication.getContext(), intent);
    }

    @Override // com.huawei.ui.homehealth.device.featureaction.featurestrategy.FeatureBaseStrategy
    public boolean canJumpWithConnect() {
        boolean zC = FindNetworkUtils.c(this.mDeviceInfo, BaseApplication.getContext());
        ReleaseLogUtil.d("R_FindDeviceStrategy", "isSupportOfflineFindNetwork:", Boolean.valueOf(zC));
        return zC;
    }
}
