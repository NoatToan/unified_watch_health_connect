package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import com.huawei.devicefeature.DeviceFeatureSupportApi;
import com.huawei.devicefeature.FeatureSupportCallback;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.utils.SimpleChain;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.homehealth.R;
import com.huawei.ui.homehealth.device.featureaction.FeatureType;
import com.huawei.ui.homehealth.devicearkui.feature.BaseApplicationsServiceFeatureItem;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes17.dex */
public class ryw extends BaseApplicationsServiceFeatureItem {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private DeviceInfo f47871a;

    public ryw(ComponentActivity componentActivity) {
        super(componentActivity);
    }

    @Override // com.huawei.ui.homehealth.devicearkui.feature.BaseApplicationsServiceFeatureItem, com.huawei.ui.homehealth.devicearkui.feature.BaseFeatureItem
    public void isSupportFeature(final DeviceInfo deviceInfo, final FeatureSupportCallback featureSupportCallback) {
        lss.a(this.featureSupportApi, new Consumer() { // from class: rzc
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                featureSupportCallback.success(((DeviceFeatureSupportApi) obj).isSupportAlarm(deviceInfo));
            }
        });
    }

    @Override // com.huawei.ui.homehealth.devicearkui.feature.BaseApplicationsServiceFeatureItem
    public void setupViews(View view) {
        if (view == null) {
            return;
        }
        qsp.e((TextView) qsp.a(view, R.id.tab_title), R.string.IDS_settings_prompt);
        qsp.e((ImageView) qsp.a(view, R.id.device_item_inco), R.mipmap.device_alarm_clock);
        view.setOnClickListener(new qte(new View.OnClickListener() { // from class: ryz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.d.d(view2);
            }
        }));
    }

    /* synthetic */ void d(View view) {
        rpq.c(FeatureType.ALARM).jumpToFeaturePage(this.f47871a, new SimpleChain.Emitter() { // from class: ryy
            @Override // com.huawei.hwcommonmodel.utils.SimpleChain.Emitter
            public final void onSuccess(Object[] objArr) {
                LogUtil.a("AlarmFeatureItem", "jumpToFeaturePage onSuccess");
            }
        });
    }

    @Override // com.huawei.ui.homehealth.devicearkui.feature.BaseApplicationsServiceFeatureItem, com.huawei.ui.homehealth.devicearkui.feature.BaseFeatureItem
    public void updateDevice(DeviceInfo deviceInfo) {
        this.f47871a = deviceInfo;
        b();
    }

    private void b() {
        DeviceInfo deviceInfo = this.f47871a;
        if (deviceInfo == null) {
            LogUtil.a("AlarmFeatureItem", "refreshAlarmNumber device is null");
            return;
        }
        if (deviceInfo.getDeviceConnectState() != 2) {
            LogUtil.a("AlarmFeatureItem", "refreshAlarmNumber device is not DEVICE_CONNECTED");
            return;
        }
        DeviceCapability deviceCapabilityA = eej.a(this.f47871a.getDeviceIdentify());
        if (deviceCapabilityA == null) {
            LogUtil.j("AlarmFeatureItem", "getAlarmNumber capability is null");
            return;
        }
        if (!deviceCapabilityA.isEventAlarm()) {
            LogUtil.j("AlarmFeatureItem", "Device is not support event alarm");
        } else if (cqd.c(this.f47871a, 123)) {
            LogUtil.a("AlarmFeatureItem", "Device is support obtain alarm number.");
            lvv.c(BaseApplication.b()).b(this.f47871a);
        } else {
            lvv.c(BaseApplication.b()).a(5);
        }
    }
}
