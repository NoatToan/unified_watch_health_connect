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
public class scj extends BaseApplicationsServiceFeatureItem {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private DeviceInfo f47939b;

    public scj(ComponentActivity componentActivity) {
        super(componentActivity);
    }

    @Override // com.huawei.ui.homehealth.devicearkui.feature.BaseApplicationsServiceFeatureItem, com.huawei.ui.homehealth.devicearkui.feature.BaseFeatureItem
    public void isSupportFeature(final DeviceInfo deviceInfo, final FeatureSupportCallback featureSupportCallback) {
        lss.a(this.featureSupportApi, new Consumer() { // from class: scg
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                featureSupportCallback.success(((DeviceFeatureSupportApi) obj).isSupportHighMonitoring(deviceInfo));
            }
        });
    }

    @Override // com.huawei.ui.homehealth.devicearkui.feature.BaseApplicationsServiceFeatureItem
    public void setupViews(View view) {
        if (view == null) {
            return;
        }
        qsp.e((TextView) qsp.a(view, R.id.tab_title), R.string.IDS_highland_health);
        qsp.e((ImageView) qsp.a(view, R.id.device_item_inco), R.mipmap.high_moitoring_item);
        view.setOnClickListener(new qte(new View.OnClickListener() { // from class: scl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f47940c.d(view2);
            }
        }));
    }

    /* synthetic */ void d(View view) {
        rpq.c(FeatureType.HIGHLAND_BLOOD_OXYGEN).jumpToFeaturePage(this.f47939b, new SimpleChain.Emitter() { // from class: scm
            @Override // com.huawei.hwcommonmodel.utils.SimpleChain.Emitter
            public final void onSuccess(Object[] objArr) {
                LogUtil.a("HeartFeatureItem", "jumpToFeaturePage onSuccess");
            }
        });
    }

    @Override // com.huawei.ui.homehealth.devicearkui.feature.BaseApplicationsServiceFeatureItem, com.huawei.ui.homehealth.devicearkui.feature.BaseFeatureItem
    public void updateDevice(DeviceInfo deviceInfo) {
        this.f47939b = deviceInfo;
    }
}
