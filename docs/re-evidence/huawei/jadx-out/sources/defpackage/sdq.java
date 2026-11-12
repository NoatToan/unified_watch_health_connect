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
import com.huawei.ui.commonui.imageview.HealthImageView;
import com.huawei.ui.homehealth.R;
import com.huawei.ui.homehealth.device.featureaction.FeatureType;
import com.huawei.ui.homehealth.devicearkui.feature.BaseApplicationsServiceFeatureItem;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes17.dex */
public class sdq extends BaseApplicationsServiceFeatureItem {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthTextView f47965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthImageView f47966b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private DeviceInfo f47967c;
    private boolean d;
    private boolean e;

    public sdq(ComponentActivity componentActivity) {
        super(componentActivity);
    }

    @Override // com.huawei.ui.homehealth.devicearkui.feature.BaseApplicationsServiceFeatureItem, com.huawei.ui.homehealth.devicearkui.feature.BaseFeatureItem
    public void isSupportFeature(final DeviceInfo deviceInfo, final FeatureSupportCallback featureSupportCallback) {
        lss.a(this.featureSupportApi, new Consumer<DeviceFeatureSupportApi>() { // from class: sdq.1
            @Override // java.util.function.Consumer
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void accept(DeviceFeatureSupportApi deviceFeatureSupportApi) {
                sdq.this.d = deviceFeatureSupportApi.isSupportEmotionPressure(deviceInfo);
                sdq.this.d();
                if (sdq.this.d) {
                    featureSupportCallback.success(true);
                    return;
                }
                sdq.this.e = deviceFeatureSupportApi.isSupportPressure(deviceInfo);
                if (sdq.this.e) {
                    featureSupportCallback.success(true);
                } else {
                    featureSupportCallback.success(false);
                }
            }
        });
    }

    @Override // com.huawei.ui.homehealth.devicearkui.feature.BaseApplicationsServiceFeatureItem
    public void setupViews(View view) {
        if (view == null) {
            return;
        }
        this.f47965a = (HealthTextView) qsp.a(view, R.id.tab_title);
        HealthImageView healthImageView = (HealthImageView) qsp.a(view, R.id.device_item_inco);
        this.f47966b = healthImageView;
        qsp.e((ImageView) healthImageView, R.mipmap.device_pressure);
        view.setOnClickListener(new qte(new View.OnClickListener() { // from class: sds
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f47969c.d(view2);
            }
        }));
    }

    /* synthetic */ void d(View view) {
        if (this.d) {
            rpq.c(FeatureType.EMOTION_MONITOR).jumpToFeaturePage(this.f47967c, new SimpleChain.Emitter() { // from class: sdr
                @Override // com.huawei.hwcommonmodel.utils.SimpleChain.Emitter
                public final void onSuccess(Object[] objArr) {
                    LogUtil.a("PressureFeatureItem", "jumpToFeaturePage onSuccess");
                }
            });
        } else if (this.e) {
            rpq.c(FeatureType.PRESS_MONITOR).jumpToFeaturePage(this.f47967c, new SimpleChain.Emitter() { // from class: sdo
                @Override // com.huawei.hwcommonmodel.utils.SimpleChain.Emitter
                public final void onSuccess(Object[] objArr) {
                    LogUtil.a("PressureFeatureItem", "jumpToFeaturePage onSuccess");
                }
            });
        }
    }

    @Override // com.huawei.ui.homehealth.devicearkui.feature.BaseApplicationsServiceFeatureItem, com.huawei.ui.homehealth.devicearkui.feature.BaseFeatureItem
    public void updateDevice(DeviceInfo deviceInfo) {
        this.f47967c = deviceInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        if (this.d) {
            qsp.e((TextView) this.f47965a, R.string.IDS_hw_show_main_home_page_card_emotion_title);
            qsp.e((ImageView) this.f47966b, R.mipmap.device_emotion_health);
        } else {
            qsp.e((TextView) this.f47965a, R.string.IDS_settings_one_level_menu_settings_item_text_id14);
            qsp.e((ImageView) this.f47966b, R.mipmap.device_pressure);
        }
    }
}
