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
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.homehealth.R;
import com.huawei.ui.homehealth.device.featureaction.FeatureType;
import com.huawei.ui.homehealth.devicearkui.feature.BaseApplicationsServiceFeatureItem;
import health.compact.a.Utils;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes17.dex */
public class sae extends BaseApplicationsServiceFeatureItem {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private DeviceInfo f47895a;

    public sae(ComponentActivity componentActivity) {
        super(componentActivity);
    }

    @Override // com.huawei.ui.homehealth.devicearkui.feature.BaseApplicationsServiceFeatureItem, com.huawei.ui.homehealth.devicearkui.feature.BaseFeatureItem
    public void isSupportFeature(final DeviceInfo deviceInfo, final FeatureSupportCallback featureSupportCallback) {
        lss.a(this.featureSupportApi, new Consumer() { // from class: sag
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                featureSupportCallback.success(((DeviceFeatureSupportApi) obj).isSupportTemperature(deviceInfo));
            }
        });
    }

    @Override // com.huawei.ui.homehealth.devicearkui.feature.BaseApplicationsServiceFeatureItem
    public void setupViews(View view) {
        if (view == null) {
            return;
        }
        HealthTextView healthTextView = (HealthTextView) qsp.a(view, R.id.tab_title);
        if (Utils.o()) {
            qsp.e((TextView) healthTextView, R.string.IDS_health_skin_temperature);
        } else {
            qsp.e((TextView) healthTextView, R.string.IDS_settings_health_temperature);
        }
        qsp.e((ImageView) qsp.a(view, R.id.device_item_inco), R.mipmap.device_blood_temperature);
        view.setOnClickListener(new qte(new View.OnClickListener() { // from class: saj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f47899a.c(view2);
            }
        }));
    }

    /* synthetic */ void c(View view) {
        rpq.c(FeatureType.TEMPERATURE_MONITOR).jumpToFeaturePage(this.f47895a, new SimpleChain.Emitter() { // from class: sah
            @Override // com.huawei.hwcommonmodel.utils.SimpleChain.Emitter
            public final void onSuccess(Object[] objArr) {
                LogUtil.a("BodyTemperatureFeatureItem", "jumpToFeaturePage onSuccess");
            }
        });
    }

    @Override // com.huawei.ui.homehealth.devicearkui.feature.BaseApplicationsServiceFeatureItem, com.huawei.ui.homehealth.devicearkui.feature.BaseFeatureItem
    public void updateDevice(DeviceInfo deviceInfo) {
        this.f47895a = deviceInfo;
    }
}
