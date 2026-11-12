package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
import com.huawei.ui.homehealth.devicearkui.feature.BaseFeatureItem;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes17.dex */
public class scw extends BaseFeatureItem {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private View f47950a;
    private DeviceInfo d;
    private HealthTextView e;

    @Override // com.huawei.ui.homehealth.devicearkui.feature.BaseFeatureItem
    public boolean isNeedUpdate() {
        return true;
    }

    public scw(ComponentActivity componentActivity) {
        super(componentActivity);
    }

    @Override // com.huawei.ui.homehealth.devicearkui.feature.BaseFeatureItem
    public void isSupportFeature(final DeviceInfo deviceInfo, final FeatureSupportCallback featureSupportCallback) {
        lss.a(this.featureSupportApi, new Consumer() { // from class: sdd
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                featureSupportCallback.success(((DeviceFeatureSupportApi) obj).isSupportMessageAlert(deviceInfo));
            }
        });
    }

    @Override // com.huawei.ui.homehealth.devicearkui.feature.BaseFeatureItem
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View view = this.f47950a;
        if (view != null) {
            return view;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_device_feature, viewGroup, false);
        this.f47950a = viewInflate;
        a(viewInflate);
        return this.f47950a;
    }

    private void a(View view) {
        if (view == null) {
            return;
        }
        HealthTextView healthTextView = (HealthTextView) qsp.a(view, R.id.txt_setting_statue);
        this.e = healthTextView;
        healthTextView.setVisibility(0);
        qsp.e((TextView) qsp.a(view, R.id.tab_title), R.string.IDS_nottification_settings_b2_ex);
        qsp.e((ImageView) qsp.a(view, R.id.device_item_inco), R.mipmap.device_notification);
        view.setOnClickListener(new qte(new View.OnClickListener() { // from class: sda
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.e.d(view2);
            }
        }));
    }

    /* synthetic */ void d(View view) {
        rpq.c(FeatureType.NOTIFICATION_SETTING).jumpToFeaturePage(this.d, new SimpleChain.Emitter() { // from class: scz
            @Override // com.huawei.hwcommonmodel.utils.SimpleChain.Emitter
            public final void onSuccess(Object[] objArr) {
                LogUtil.a("NotificationFeatureItem", "jumpToFeaturePage onSuccess");
            }
        });
    }

    @Override // com.huawei.ui.homehealth.devicearkui.feature.BaseFeatureItem
    public void updateDevice(DeviceInfo deviceInfo) {
        this.d = deviceInfo;
        if (deviceInfo != null) {
            this.e.setText(tqp.b(deviceInfo.getProductType()) ? R.string.IDS_status_enabled : R.string.IDS_status_disabled);
        }
    }
}
