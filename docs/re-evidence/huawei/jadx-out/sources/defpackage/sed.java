package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import com.google.gson.Gson;
import com.huawei.devicefeature.DeviceFeatureSupportApi;
import com.huawei.devicefeature.FeatureSupportCallback;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.SimpleChain;
import com.huawei.hwdevice.outofprocess.mgr.device.CloudDeviceInfo;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.h5pro.jsmodules.DeviceHiCare;
import com.huawei.ui.homehealth.R;
import com.huawei.ui.homehealth.device.featureaction.FeatureType;
import com.huawei.ui.homehealth.device.featureaction.featurestrategy.FeatureStrategy;
import com.huawei.ui.homehealth.devicearkui.feature.BaseFeatureItem;
import health.compact.a.SharedPreferenceManager;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes17.dex */
public class sed extends BaseFeatureItem {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private View f47977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private DeviceInfo f47978b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Gson f47979c;
    private tlg d;

    public sed(ComponentActivity componentActivity) {
        super(componentActivity);
    }

    @Override // com.huawei.ui.homehealth.devicearkui.feature.BaseFeatureItem
    public void isSupportFeature(final DeviceInfo deviceInfo, final FeatureSupportCallback featureSupportCallback) {
        if (deviceInfo instanceof CloudDeviceInfo) {
            LogUtil.j("ServiceSupportItem", "Cloud device");
            featureSupportCallback.success(false);
            return;
        }
        if (deviceInfo.getVersionType() != 0) {
            LogUtil.j("ServiceSupportItem", "the device not release");
            featureSupportCallback.success(false);
            return;
        }
        if (eei.d(deviceInfo)) {
            LogUtil.j("ServiceSupportItem", "HonorDevice");
            featureSupportCallback.success(false);
        } else if (etn.d(BaseApplication.getContext()) && lvi.l(deviceInfo.getProductType()) && SharedPreferenceManager.c(com.huawei.haf.application.BaseApplication.b(), LoginInit.getInstance(com.huawei.haf.application.BaseApplication.b()).getAccountInfo(1011))) {
            LogUtil.j("ServiceSupportItem", "Honor Device");
            featureSupportCallback.success(false);
        } else {
            lss.a(this.featureSupportApi, new Consumer() { // from class: see
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    this.f47981b.d(deviceInfo, featureSupportCallback, (DeviceFeatureSupportApi) obj);
                }
            });
        }
    }

    /* synthetic */ void d(DeviceInfo deviceInfo, final FeatureSupportCallback featureSupportCallback, DeviceFeatureSupportApi deviceFeatureSupportApi) {
        deviceFeatureSupportApi.isServiceSupport(deviceInfo, new DeviceFeatureSupportApi.ServiceSupportCallBack() { // from class: sem
            @Override // com.huawei.devicefeature.DeviceFeatureSupportApi.ServiceSupportCallBack
            public final void onResult(String str) {
                this.f47985a.e(featureSupportCallback, str);
            }
        });
    }

    /* synthetic */ void e(FeatureSupportCallback featureSupportCallback, String str) {
        featureSupportCallback.success(a(str));
    }

    private boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (this.f47979c == null) {
            this.f47979c = new Gson();
        }
        tlg tlgVar = (tlg) this.f47979c.fromJson(str, tlg.class);
        this.d = tlgVar;
        if (tlgVar == null) {
            return false;
        }
        return "Y".equals(tlgVar.b().c());
    }

    @Override // com.huawei.ui.homehealth.devicearkui.feature.BaseFeatureItem
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View view = this.f47977a;
        if (view != null) {
            return view;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_device_feature, viewGroup, false);
        this.f47977a = viewInflate;
        d(viewInflate);
        return this.f47977a;
    }

    private void d(View view) {
        if (view == null) {
            return;
        }
        qsp.e((TextView) qsp.a(view, R.id.tab_title), R.string.ids_wear_home_service_support);
        qsp.e((ImageView) qsp.a(view, R.id.device_item_inco), R.mipmap.device_service_support);
        view.setOnClickListener(new qte(new View.OnClickListener() { // from class: sej
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f47982c.c(view2);
            }
        }));
    }

    /* synthetic */ void c(View view) {
        if (this.d == null) {
            LogUtil.j("ServiceSupportItem", "jump ServiceSupport fail");
            return;
        }
        FeatureStrategy featureStrategyC = rpq.c(FeatureType.SERVICE_SUPPORT);
        Bundle bundle = new Bundle();
        bundle.putString("url", this.d.b().e());
        bundle.putString("siteCode", this.d.b().d());
        bundle.putString(DeviceHiCare.KEY_SITE_LANG, this.d.b().b());
        featureStrategyC.jumpToFeaturePage(this.f47978b, bundle, new SimpleChain.Emitter() { // from class: seh
            @Override // com.huawei.hwcommonmodel.utils.SimpleChain.Emitter
            public final void onSuccess(Object[] objArr) {
                LogUtil.a("ServiceSupportItem", "jumpToFeaturePage onSuccess");
            }
        });
    }

    @Override // com.huawei.ui.homehealth.devicearkui.feature.BaseFeatureItem
    public void updateDevice(DeviceInfo deviceInfo) {
        this.f47978b = deviceInfo;
    }
}
