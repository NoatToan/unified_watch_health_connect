package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import com.huawei.devicefeature.DeviceFeatureSupportApi;
import com.huawei.devicefeature.FeatureSupportCallback;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.utils.SimpleChain;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.homehealth.R;
import com.huawei.ui.homehealth.device.featureaction.FeatureType;
import com.huawei.ui.homehealth.devicearkui.feature.BaseApplicationsServiceFeatureItem;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes17.dex */
public class sdl extends BaseApplicationsServiceFeatureItem {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private View f47963c;
    private DeviceInfo e;

    @Override // com.huawei.ui.homehealth.devicearkui.feature.BaseFeatureItem
    public boolean isNeedUpdate() {
        return true;
    }

    public sdl(ComponentActivity componentActivity) {
        super(componentActivity);
    }

    @Override // com.huawei.ui.homehealth.devicearkui.feature.BaseApplicationsServiceFeatureItem, com.huawei.ui.homehealth.devicearkui.feature.BaseFeatureItem
    public void isSupportFeature(DeviceInfo deviceInfo, FeatureSupportCallback featureSupportCallback) {
        boolean zD = eey.d(deviceInfo, 114);
        LogUtil.a("PhysiologicalFeatureIte", "addMenstrualPredictItem isSupportMenstrualPredict: ", Boolean.valueOf(zD));
        featureSupportCallback.success(zD);
    }

    @Override // com.huawei.ui.homehealth.devicearkui.feature.BaseApplicationsServiceFeatureItem
    public void setupViews(View view) {
        if (view == null) {
            return;
        }
        this.f47963c = view;
        a((this.featureSupportApi == null || this.e == null || !this.featureSupportApi.isSupportPhysiological(this.e)) ? 8 : 0);
        qsp.e((TextView) qsp.a(view, R.id.tab_title), R.string.IDS_hw_physiological_cycle);
        qsp.e((ImageView) qsp.a(view, R.id.device_item_inco), R.mipmap.device_physiological_cycle);
        view.setOnClickListener(new qte(new View.OnClickListener() { // from class: sdm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.d.a(view2);
            }
        }));
    }

    /* synthetic */ void a(View view) {
        rpq.c(FeatureType.CYCLE_CALENDAR).jumpToFeaturePage(this.e, new SimpleChain.Emitter() { // from class: sdp
            @Override // com.huawei.hwcommonmodel.utils.SimpleChain.Emitter
            public final void onSuccess(Object[] objArr) {
                LogUtil.a("PhysiologicalFeatureIte", "jumpToFeaturePage onSuccess");
            }
        });
    }

    @Override // com.huawei.ui.homehealth.devicearkui.feature.BaseApplicationsServiceFeatureItem, com.huawei.ui.homehealth.devicearkui.feature.BaseFeatureItem
    public void updateDevice(final DeviceInfo deviceInfo) {
        this.e = deviceInfo;
        LogUtil.a("PhysiologicalFeatureIte", "updateDevice name:", deviceInfo == null ? "nullDevice" : deviceInfo.getDeviceName());
        if (deviceInfo == null) {
            LogUtil.a("PhysiologicalFeatureIte", "updateDevice deviceInfo is null");
        } else {
            lss.a(this.featureSupportApi, new Consumer() { // from class: sdn
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    this.f47964c.c(deviceInfo, (DeviceFeatureSupportApi) obj);
                }
            });
        }
    }

    /* synthetic */ void c(DeviceInfo deviceInfo, DeviceFeatureSupportApi deviceFeatureSupportApi) {
        b(deviceInfo, deviceFeatureSupportApi.isSupportPhysiological(deviceInfo));
    }

    private void b(final DeviceInfo deviceInfo, final boolean z) {
        if (this.activity == null || this.activity.isDestroyed() || this.activity.isFinishing()) {
            LogUtil.a("PhysiologicalFeatureIte", "activity is null or finish");
        } else {
            this.activity.runOnUiThread(new Runnable() { // from class: sdj
                @Override // java.lang.Runnable
                public final void run() {
                    this.f47961c.c(deviceInfo, z);
                }
            });
        }
    }

    /* synthetic */ void c(DeviceInfo deviceInfo, boolean z) {
        if (!mig.d(this.e, deviceInfo)) {
            LogUtil.a("PhysiologicalFeatureIte", "updateItemView different device");
        } else {
            a(z ? 0 : 8);
        }
    }

    private void a(int i) {
        View view = this.f47963c;
        if (view != null) {
            view.setVisibility(i);
        } else {
            LogUtil.a("PhysiologicalFeatureIte", "updateItemView itemView is null");
        }
    }
}
