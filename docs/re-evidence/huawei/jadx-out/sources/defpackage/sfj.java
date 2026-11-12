package defpackage;

import android.view.View;
import android.widget.ImageView;
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
import java.util.AbstractMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes17.dex */
public class sfj extends BaseApplicationsServiceFeatureItem {
    private Map.Entry<String, Boolean> d;
    private DeviceInfo e;

    public sfj(ComponentActivity componentActivity) {
        super(componentActivity);
    }

    /* JADX INFO: renamed from: sfj$5, reason: invalid class name */
    class AnonymousClass5 implements Consumer<DeviceFeatureSupportApi> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ DeviceInfo f47999a;
        final /* synthetic */ FeatureSupportCallback e;

        AnonymousClass5(DeviceInfo deviceInfo, FeatureSupportCallback featureSupportCallback) {
            this.f47999a = deviceInfo;
            this.e = featureSupportCallback;
        }

        @Override // java.util.function.Consumer
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void accept(DeviceFeatureSupportApi deviceFeatureSupportApi) {
            if (sfj.this.d != null && Objects.equals(sfj.this.d.getKey(), this.f47999a.getDeviceIdentify())) {
                this.e.success(((Boolean) sfj.this.d.getValue()).booleanValue());
            }
            final DeviceInfo deviceInfo = this.f47999a;
            final FeatureSupportCallback featureSupportCallback = this.e;
            deviceFeatureSupportApi.isSupportWechatBind(deviceInfo, new FeatureSupportCallback() { // from class: sfl
                @Override // com.huawei.devicefeature.FeatureSupportCallback
                public final void success(boolean z) {
                    this.e.c(deviceInfo, featureSupportCallback, z);
                }
            });
        }

        /* synthetic */ void c(DeviceInfo deviceInfo, FeatureSupportCallback featureSupportCallback, boolean z) {
            sfj.this.d = new AbstractMap.SimpleEntry(deviceInfo.getDeviceIdentify(), Boolean.valueOf(z));
            featureSupportCallback.success(z);
        }
    }

    @Override // com.huawei.ui.homehealth.devicearkui.feature.BaseApplicationsServiceFeatureItem, com.huawei.ui.homehealth.devicearkui.feature.BaseFeatureItem
    public void isSupportFeature(DeviceInfo deviceInfo, FeatureSupportCallback featureSupportCallback) {
        lss.a(this.featureSupportApi, new AnonymousClass5(deviceInfo, featureSupportCallback));
    }

    @Override // com.huawei.ui.homehealth.devicearkui.feature.BaseApplicationsServiceFeatureItem
    public void setupViews(View view) {
        if (view == null) {
            return;
        }
        qsp.b((HealthTextView) qsp.a(view, R.id.tab_title), qre.f(R.string.IDS_device_wechat_bind_card).replace("\n", ""));
        qsp.e((ImageView) qsp.a(view, R.id.device_item_inco), R.mipmap.wechat_item);
        view.setOnClickListener(new qte(new View.OnClickListener() { // from class: sfk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f48001c.a(view2);
            }
        }));
    }

    /* synthetic */ void a(View view) {
        rpq.c(FeatureType.WECHAT_DEVICE).jumpToFeaturePage(this.e, new SimpleChain.Emitter() { // from class: sfh
            @Override // com.huawei.hwcommonmodel.utils.SimpleChain.Emitter
            public final void onSuccess(Object[] objArr) {
                LogUtil.a("WechatBindFeatureItem", "jumpToFeaturePage onSuccess");
            }
        });
    }

    @Override // com.huawei.ui.homehealth.devicearkui.feature.BaseApplicationsServiceFeatureItem, com.huawei.ui.homehealth.devicearkui.feature.BaseFeatureItem
    public void updateDevice(DeviceInfo deviceInfo) {
        this.e = deviceInfo;
    }
}
