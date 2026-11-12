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
public class sar extends BaseApplicationsServiceFeatureItem {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private DeviceInfo f47902c;

    public sar(ComponentActivity componentActivity) {
        super(componentActivity);
    }

    @Override // com.huawei.ui.homehealth.devicearkui.feature.BaseApplicationsServiceFeatureItem, com.huawei.ui.homehealth.devicearkui.feature.BaseFeatureItem
    public void isSupportFeature(final DeviceInfo deviceInfo, final FeatureSupportCallback featureSupportCallback) {
        lss.a(this.featureSupportApi, new Consumer() { // from class: saz
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                FeatureSupportCallback featureSupportCallback2 = featureSupportCallback;
                DeviceInfo deviceInfo2 = deviceInfo;
                DeviceFeatureSupportApi deviceFeatureSupportApi = (DeviceFeatureSupportApi) obj;
                featureSupportCallback2.success(deviceFeatureSupportApi.isSupportContacts(deviceInfo2) || deviceFeatureSupportApi.isSupportContactDataSync(deviceInfo2));
            }
        });
    }

    @Override // com.huawei.ui.homehealth.devicearkui.feature.BaseApplicationsServiceFeatureItem
    public void setupViews(View view) {
        if (view == null) {
            return;
        }
        qsp.e((TextView) qsp.a(view, R.id.tab_title), R.string.IDS_settings_one_level_menu_settings_item_text_id16);
        qsp.e((ImageView) qsp.a(view, R.id.device_item_inco), R.mipmap.device_contact_person);
        view.setOnClickListener(new qte(new View.OnClickListener() { // from class: say
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f47907b.c(view2);
            }
        }));
    }

    /* synthetic */ void c(View view) {
        if (this.featureSupportApi != null && this.featureSupportApi.isSupportContacts(this.f47902c)) {
            rpq.c(FeatureType.CONTACT).jumpToFeaturePage(this.f47902c, new SimpleChain.Emitter() { // from class: sba
                @Override // com.huawei.hwcommonmodel.utils.SimpleChain.Emitter
                public final void onSuccess(Object[] objArr) {
                    LogUtil.a("ContactsFeatureItem", "jumpToFeaturePage CONTACT onSuccess");
                }
            });
        }
        if (this.featureSupportApi == null || !this.featureSupportApi.isSupportContactDataSync(this.f47902c)) {
            return;
        }
        rpq.c(FeatureType.CONTACT_MANAGE).jumpToFeaturePage(this.f47902c, new SimpleChain.Emitter() { // from class: saw
            @Override // com.huawei.hwcommonmodel.utils.SimpleChain.Emitter
            public final void onSuccess(Object[] objArr) {
                LogUtil.a("ContactsFeatureItem", "jumpToFeaturePage CONTACT_MANAGE onSuccess");
            }
        });
    }

    @Override // com.huawei.ui.homehealth.devicearkui.feature.BaseApplicationsServiceFeatureItem, com.huawei.ui.homehealth.devicearkui.feature.BaseFeatureItem
    public void updateDevice(DeviceInfo deviceInfo) {
        this.f47902c = deviceInfo;
    }
}
