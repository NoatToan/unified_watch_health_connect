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
public class rzi extends BaseApplicationsServiceFeatureItem {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private DeviceInfo f47880c;

    public rzi(ComponentActivity componentActivity) {
        super(componentActivity);
    }

    @Override // com.huawei.ui.homehealth.devicearkui.feature.BaseApplicationsServiceFeatureItem, com.huawei.ui.homehealth.devicearkui.feature.BaseFeatureItem
    public void isSupportFeature(final DeviceInfo deviceInfo, final FeatureSupportCallback featureSupportCallback) {
        lss.a(this.featureSupportApi, new Consumer() { // from class: rzl
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((DeviceFeatureSupportApi) obj).isSupportBaidouSatellite(deviceInfo, featureSupportCallback);
            }
        });
    }

    @Override // com.huawei.ui.homehealth.devicearkui.feature.BaseApplicationsServiceFeatureItem
    public void setupViews(View view) {
        if (view == null) {
            return;
        }
        qsp.e((TextView) qsp.a(view, R.id.tab_title), R.string.beidou_crowd_test_title);
        qsp.e((ImageView) qsp.a(view, R.id.device_item_inco), R.mipmap.device_baidu_satellite);
        view.setOnClickListener(new qte(new View.OnClickListener() { // from class: rzk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f47881b.a(view2);
            }
        }));
    }

    /* synthetic */ void a(View view) {
        rpq.c(FeatureType.SATCOM_CARD).jumpToFeaturePage(this.f47880c, new SimpleChain.Emitter() { // from class: rzm
            @Override // com.huawei.hwcommonmodel.utils.SimpleChain.Emitter
            public final void onSuccess(Object[] objArr) {
                LogUtil.a("BeidouSatelliteFeatureItem", "jumpToFeaturePage onSuccess");
            }
        });
    }

    @Override // com.huawei.ui.homehealth.devicearkui.feature.BaseApplicationsServiceFeatureItem, com.huawei.ui.homehealth.devicearkui.feature.BaseFeatureItem
    public void updateDevice(DeviceInfo deviceInfo) {
        this.f47880c = deviceInfo;
    }
}
