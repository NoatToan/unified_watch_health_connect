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
public class sew extends BaseApplicationsServiceFeatureItem {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private DeviceInfo f47993b;

    public sew(ComponentActivity componentActivity) {
        super(componentActivity);
    }

    @Override // com.huawei.ui.homehealth.devicearkui.feature.BaseApplicationsServiceFeatureItem, com.huawei.ui.homehealth.devicearkui.feature.BaseFeatureItem
    public void isSupportFeature(final DeviceInfo deviceInfo, final FeatureSupportCallback featureSupportCallback) {
        lss.a(this.featureSupportApi, new Consumer() { // from class: sey
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                featureSupportCallback.success(((DeviceFeatureSupportApi) obj).isSupportVascularElasticity(deviceInfo));
            }
        });
    }

    @Override // com.huawei.ui.homehealth.devicearkui.feature.BaseApplicationsServiceFeatureItem
    public void setupViews(View view) {
        if (view == null) {
            return;
        }
        qsp.e((TextView) qsp.a(view, R.id.tab_title), R.string.IDS_vascular_health_collection_title);
        qsp.e((ImageView) qsp.a(view, R.id.device_item_inco), R.mipmap.vascular_elasticity_item);
        view.setOnClickListener(new qte(new View.OnClickListener() { // from class: sev
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f47992c.b(view2);
            }
        }));
    }

    /* synthetic */ void b(View view) {
        rpq.c(FeatureType.VASCULAR_ELASTICITY).jumpToFeaturePage(this.f47993b, new SimpleChain.Emitter() { // from class: sfa
            @Override // com.huawei.hwcommonmodel.utils.SimpleChain.Emitter
            public final void onSuccess(Object[] objArr) {
                LogUtil.a("VascularElasticityFeatu", "jumpToFeaturePage onSuccess");
            }
        });
    }

    @Override // com.huawei.ui.homehealth.devicearkui.feature.BaseApplicationsServiceFeatureItem, com.huawei.ui.homehealth.devicearkui.feature.BaseFeatureItem
    public void updateDevice(DeviceInfo deviceInfo) {
        this.f47993b = deviceInfo;
    }
}
