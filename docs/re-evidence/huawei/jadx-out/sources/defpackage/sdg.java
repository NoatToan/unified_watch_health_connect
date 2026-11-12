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
public class sdg extends BaseApplicationsServiceFeatureItem {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private DeviceInfo f47957a;

    public sdg(ComponentActivity componentActivity) {
        super(componentActivity);
    }

    @Override // com.huawei.ui.homehealth.devicearkui.feature.BaseApplicationsServiceFeatureItem, com.huawei.ui.homehealth.devicearkui.feature.BaseFeatureItem
    public void isSupportFeature(final DeviceInfo deviceInfo, final FeatureSupportCallback featureSupportCallback) {
        lss.a(this.featureSupportApi, new Consumer() { // from class: sdf
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                sdg.e(deviceInfo, featureSupportCallback, (DeviceFeatureSupportApi) obj);
            }
        });
    }

    static /* synthetic */ void e(DeviceInfo deviceInfo, FeatureSupportCallback featureSupportCallback, DeviceFeatureSupportApi deviceFeatureSupportApi) {
        boolean zIsSupportOutdoorAdventure = deviceFeatureSupportApi.isSupportOutdoorAdventure(deviceInfo);
        LogUtil.a("OutdoorAdventureFeatureItem", "isSupport : ", Boolean.valueOf(zIsSupportOutdoorAdventure));
        featureSupportCallback.success(zIsSupportOutdoorAdventure);
    }

    @Override // com.huawei.ui.homehealth.devicearkui.feature.BaseApplicationsServiceFeatureItem
    public void setupViews(View view) {
        if (view == null) {
            return;
        }
        qsp.e((TextView) qsp.a(view, R.id.tab_title), R.string.IDS_hw_sport_oal);
        qsp.e((ImageView) qsp.a(view, R.id.device_item_inco), R.mipmap.ic_outdoor_adventure);
        view.setOnClickListener(new qte(new View.OnClickListener() { // from class: sdk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f47962a.b(view2);
            }
        }));
    }

    /* synthetic */ void b(View view) {
        rpq.c(FeatureType.OUTDOOR_ADVENTURE).jumpToFeaturePage(this.f47957a, new SimpleChain.Emitter() { // from class: sdi
            @Override // com.huawei.hwcommonmodel.utils.SimpleChain.Emitter
            public final void onSuccess(Object[] objArr) {
                LogUtil.a("OutdoorAdventureFeatureItem", "jumpToFeaturePage onSuccess");
            }
        });
    }

    @Override // com.huawei.ui.homehealth.devicearkui.feature.BaseApplicationsServiceFeatureItem, com.huawei.ui.homehealth.devicearkui.feature.BaseFeatureItem
    public void updateDevice(DeviceInfo deviceInfo) {
        this.f47957a = deviceInfo;
    }
}
