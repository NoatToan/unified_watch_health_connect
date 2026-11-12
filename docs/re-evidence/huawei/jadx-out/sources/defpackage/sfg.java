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
public class sfg extends BaseApplicationsServiceFeatureItem {
    private DeviceInfo d;

    public sfg(ComponentActivity componentActivity) {
        super(componentActivity);
    }

    @Override // com.huawei.ui.homehealth.devicearkui.feature.BaseApplicationsServiceFeatureItem, com.huawei.ui.homehealth.devicearkui.feature.BaseFeatureItem
    public void isSupportFeature(final DeviceInfo deviceInfo, final FeatureSupportCallback featureSupportCallback) {
        lss.a(this.featureSupportApi, new Consumer() { // from class: sfe
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((DeviceFeatureSupportApi) obj).isSupportWeatherItem(deviceInfo, featureSupportCallback);
            }
        });
    }

    @Override // com.huawei.ui.homehealth.devicearkui.feature.BaseApplicationsServiceFeatureItem
    public void setupViews(View view) {
        if (view == null) {
            return;
        }
        qsp.e((TextView) qsp.a(view, R.id.tab_title), R.string.IDS_settings_one_level_menu_settings_item_text_id22);
        qsp.e((ImageView) qsp.a(view, R.id.device_item_inco), R.mipmap.device_weather);
        view.setOnClickListener(new qte(new View.OnClickListener() { // from class: sfd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.d.e(view2);
            }
        }));
    }

    /* synthetic */ void e(View view) {
        rpq.c(FeatureType.WEATHER).jumpToFeaturePage(this.d, new SimpleChain.Emitter() { // from class: sff
            @Override // com.huawei.hwcommonmodel.utils.SimpleChain.Emitter
            public final void onSuccess(Object[] objArr) {
                LogUtil.a("WeatherPushFeatureItem", "jumpToFeaturePage onSuccess");
            }
        });
    }

    @Override // com.huawei.ui.homehealth.devicearkui.feature.BaseApplicationsServiceFeatureItem, com.huawei.ui.homehealth.devicearkui.feature.BaseFeatureItem
    public void updateDevice(DeviceInfo deviceInfo) {
        this.d = deviceInfo;
    }
}
