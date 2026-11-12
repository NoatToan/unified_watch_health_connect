package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import com.huawei.devicefeature.FeatureSupportCallback;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.utils.SimpleChain;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.homehealth.R;
import com.huawei.ui.homehealth.device.featureaction.FeatureType;
import com.huawei.ui.homehealth.devicearkui.feature.BaseApplicationsServiceFeatureItem;

/* JADX INFO: loaded from: classes17.dex */
public class ryx extends BaseApplicationsServiceFeatureItem {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private DeviceInfo f47872a;

    public ryx(ComponentActivity componentActivity) {
        super(componentActivity);
    }

    @Override // com.huawei.ui.homehealth.devicearkui.feature.BaseApplicationsServiceFeatureItem, com.huawei.ui.homehealth.devicearkui.feature.BaseFeatureItem
    public void isSupportFeature(DeviceInfo deviceInfo, FeatureSupportCallback featureSupportCallback) {
        featureSupportCallback.success(true);
    }

    @Override // com.huawei.ui.homehealth.devicearkui.feature.BaseApplicationsServiceFeatureItem
    public void setupViews(View view) {
        if (view == null) {
            return;
        }
        qsp.e((TextView) qsp.a(view, R.id.tab_title), R.string.IDS_settings_one_level_menu_settings_item_text_id2);
        qsp.e((ImageView) qsp.a(view, R.id.device_item_inco), R.mipmap.device_active_record);
        view.setOnClickListener(new qte(new View.OnClickListener() { // from class: ryu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f47870c.c(view2);
            }
        }));
    }

    /* synthetic */ void c(View view) {
        rpq.c(FeatureType.REMINDER_SETTING).jumpToFeaturePage(this.f47872a, new SimpleChain.Emitter() { // from class: ryt
            @Override // com.huawei.hwcommonmodel.utils.SimpleChain.Emitter
            public final void onSuccess(Object[] objArr) {
                LogUtil.a("ActiveRecordFeatureItem", "jumpToFeaturePage onSuccess");
            }
        });
    }

    @Override // com.huawei.ui.homehealth.devicearkui.feature.BaseApplicationsServiceFeatureItem, com.huawei.ui.homehealth.devicearkui.feature.BaseFeatureItem
    public void updateDevice(DeviceInfo deviceInfo) {
        this.f47872a = deviceInfo;
    }
}
