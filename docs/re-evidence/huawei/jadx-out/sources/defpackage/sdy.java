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
public class sdy extends BaseApplicationsServiceFeatureItem {
    private DeviceInfo e;

    public sdy(ComponentActivity componentActivity) {
        super(componentActivity);
    }

    @Override // com.huawei.ui.homehealth.devicearkui.feature.BaseApplicationsServiceFeatureItem, com.huawei.ui.homehealth.devicearkui.feature.BaseFeatureItem
    public void isSupportFeature(final DeviceInfo deviceInfo, final FeatureSupportCallback featureSupportCallback) {
        lss.a(this.featureSupportApi, new Consumer() { // from class: seb
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                featureSupportCallback.success(((DeviceFeatureSupportApi) obj).isSupportQuickReplySms(deviceInfo));
            }
        });
    }

    @Override // com.huawei.ui.homehealth.devicearkui.feature.BaseApplicationsServiceFeatureItem
    public void setupViews(View view) {
        if (view == null) {
            return;
        }
        qsp.e((TextView) qsp.a(view, R.id.tab_title), R.string.IDS_hw_msg_mgr_msg_name);
        qsp.e((ImageView) qsp.a(view, R.id.device_item_inco), R.mipmap.device_msg);
        view.setOnClickListener(new qte(new View.OnClickListener() { // from class: seg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.e.e(view2);
            }
        }));
    }

    /* synthetic */ void e(View view) {
        rpq.c(FeatureType.QUICK_REPLY).jumpToFeaturePage(this.e, new SimpleChain.Emitter() { // from class: sef
            @Override // com.huawei.hwcommonmodel.utils.SimpleChain.Emitter
            public final void onSuccess(Object[] objArr) {
                LogUtil.a("QuickReplySmsFeatureIte", "jumpToFeaturePage onSuccess");
            }
        });
    }

    @Override // com.huawei.ui.homehealth.devicearkui.feature.BaseApplicationsServiceFeatureItem, com.huawei.ui.homehealth.devicearkui.feature.BaseFeatureItem
    public void updateDevice(DeviceInfo deviceInfo) {
        this.e = deviceInfo;
    }
}
