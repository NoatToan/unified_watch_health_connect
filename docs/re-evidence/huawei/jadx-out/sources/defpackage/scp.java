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
public class scp extends BaseFeatureItem {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private DeviceInfo f47943b;
    private View d;
    private HealthTextView e;

    public scp(ComponentActivity componentActivity) {
        super(componentActivity);
    }

    @Override // com.huawei.ui.homehealth.devicearkui.feature.BaseFeatureItem
    public void isSupportFeature(final DeviceInfo deviceInfo, final FeatureSupportCallback featureSupportCallback) {
        lss.a(this.featureSupportApi, new Consumer() { // from class: scs
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                featureSupportCallback.success(((DeviceFeatureSupportApi) obj).isSupportKeepAlive(deviceInfo));
            }
        });
    }

    @Override // com.huawei.ui.homehealth.devicearkui.feature.BaseFeatureItem
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View view = this.d;
        if (view != null) {
            return view;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_device_feature, viewGroup, false);
        this.d = viewInflate;
        b(viewInflate);
        return this.d;
    }

    private void b(View view) {
        if (view == null) {
            return;
        }
        this.e = (HealthTextView) qsp.a(view, R.id.tab_title);
        qsp.e((ImageView) qsp.a(view, R.id.device_item_inco), R.mipmap.device_keep_alive);
        view.setOnClickListener(new qte(new View.OnClickListener() { // from class: scq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f47944b.e(view2);
            }
        }));
    }

    /* synthetic */ void e(View view) {
        rpq.c(FeatureType.KEEP_ALIVE).jumpToFeaturePage(this.f47943b, new SimpleChain.Emitter() { // from class: scr
            @Override // com.huawei.hwcommonmodel.utils.SimpleChain.Emitter
            public final void onSuccess(Object[] objArr) {
                LogUtil.a("KeepAliveFeatureItem", "jumpToFeaturePage onSuccess");
            }
        });
    }

    @Override // com.huawei.ui.homehealth.devicearkui.feature.BaseFeatureItem
    public void updateDevice(DeviceInfo deviceInfo) {
        this.f47943b = deviceInfo;
        qsp.e((TextView) this.e, lvi.f(deviceInfo != null ? deviceInfo.getProductType() : -1) ? R.string.IDS_hw_disconnected_band : R.string.IDS_hw_disconnected_watch);
    }
}
