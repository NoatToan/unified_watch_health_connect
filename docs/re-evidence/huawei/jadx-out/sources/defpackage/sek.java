package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import com.huawei.devicefeature.FeatureSupportCallback;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.utils.SimpleChain;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.homehealth.R;
import com.huawei.ui.homehealth.device.featureaction.FeatureType;
import com.huawei.ui.homehealth.devicearkui.feature.BaseFeatureItem;

/* JADX INFO: loaded from: classes17.dex */
public class sek extends BaseFeatureItem {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private DeviceInfo f47983a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private View f47984c;

    public sek(ComponentActivity componentActivity) {
        super(componentActivity);
    }

    @Override // com.huawei.ui.homehealth.devicearkui.feature.BaseFeatureItem
    public void isSupportFeature(DeviceInfo deviceInfo, FeatureSupportCallback featureSupportCallback) {
        featureSupportCallback.success(true);
    }

    @Override // com.huawei.ui.homehealth.devicearkui.feature.BaseFeatureItem
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View view = this.f47984c;
        if (view != null) {
            return view;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_device_feature, viewGroup, false);
        this.f47984c = viewInflate;
        b(viewInflate);
        return this.f47984c;
    }

    private void b(View view) {
        if (view == null) {
            return;
        }
        qsp.e((TextView) qsp.a(view, R.id.tab_title), R.string.IDS_device_maca_setup_and_data);
        qsp.e((ImageView) qsp.a(view, R.id.device_item_inco), R.mipmap.device_maca_setup_and_data);
        view.setOnClickListener(new qte(new View.OnClickListener() { // from class: sei
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.e.e(view2);
            }
        }));
    }

    /* synthetic */ void e(View view) {
        rpq.c(FeatureType.MACA_DETAIL).jumpToFeaturePage(this.f47983a, new SimpleChain.Emitter() { // from class: sel
            @Override // com.huawei.hwcommonmodel.utils.SimpleChain.Emitter
            public final void onSuccess(Object[] objArr) {
                LogUtil.a("SetupAndDataManageItem", "jumpToFeaturePage onSuccess");
            }
        });
    }

    @Override // com.huawei.ui.homehealth.devicearkui.feature.BaseFeatureItem
    public void updateDevice(DeviceInfo deviceInfo) {
        this.f47983a = deviceInfo;
    }
}
