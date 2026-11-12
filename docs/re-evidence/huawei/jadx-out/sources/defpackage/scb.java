package defpackage;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.activity.ComponentActivity;
import com.huawei.devicefeature.DeviceFeatureSupportApi;
import com.huawei.devicefeature.FeatureSupportCallback;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.SimpleChain;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.homehealth.R;
import com.huawei.ui.homehealth.device.featureaction.FeatureType;
import com.huawei.ui.homehealth.device.featureaction.featurestrategy.FeatureStrategy;
import com.huawei.ui.homehealth.devicearkui.feature.BaseApplicationsServiceFeatureItem;
import health.compact.a.GRSManager;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes17.dex */
public class scb extends BaseApplicationsServiceFeatureItem {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f47932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private DeviceInfo f47933b;

    public scb(ComponentActivity componentActivity) {
        super(componentActivity);
    }

    @Override // com.huawei.ui.homehealth.devicearkui.feature.BaseApplicationsServiceFeatureItem, com.huawei.ui.homehealth.devicearkui.feature.BaseFeatureItem
    public void isSupportFeature(final DeviceInfo deviceInfo, final FeatureSupportCallback featureSupportCallback) {
        lss.a(this.featureSupportApi, new Consumer() { // from class: sci
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                featureSupportCallback.success(((DeviceFeatureSupportApi) obj).isSupportHiResearch(deviceInfo));
            }
        });
    }

    @Override // com.huawei.ui.homehealth.devicearkui.feature.BaseApplicationsServiceFeatureItem
    public void setupViews(View view) {
        if (view == null) {
            return;
        }
        qsp.b((HealthTextView) qsp.a(view, R.id.tab_title), qre.f(R.string.IDS_hw_innovation_research).replace("\n", ""));
        qsp.e((ImageView) qsp.a(view, R.id.device_item_inco), R.mipmap.hi_research_item);
        view.setOnClickListener(new qte(new View.OnClickListener() { // from class: scd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.e.e(view2);
            }
        }));
    }

    /* synthetic */ void e(View view) {
        FeatureStrategy featureStrategyC = rpq.c(FeatureType.RESEARCH);
        Bundle bundle = new Bundle();
        bundle.putString("domainAppgalleryCloudHuawei", this.f47932a);
        featureStrategyC.jumpToFeaturePage(this.f47933b, bundle, new SimpleChain.Emitter() { // from class: scf
            @Override // com.huawei.hwcommonmodel.utils.SimpleChain.Emitter
            public final void onSuccess(Object[] objArr) {
                LogUtil.a("HiResearchFeatureItem", "jumpToFeaturePage onSuccess");
            }
        });
    }

    @Override // com.huawei.ui.homehealth.devicearkui.feature.BaseApplicationsServiceFeatureItem, com.huawei.ui.homehealth.devicearkui.feature.BaseFeatureItem
    public void updateDevice(DeviceInfo deviceInfo) {
        this.f47933b = deviceInfo;
        ThreadPoolManager.c().execute(new Runnable() { // from class: sch
            @Override // java.lang.Runnable
            public final void run() {
                this.f47936b.a();
            }
        });
    }

    /* synthetic */ void a() {
        String url = GRSManager.c(BaseApplication.getContext()).getUrl("domainAppgalleryCloudHuawei");
        this.f47932a = url;
        LogUtil.d("HiResearchFeatureItem", "updateDevice mHostUrl:", url);
    }
}
