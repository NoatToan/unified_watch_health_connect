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
import com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwcommonmodel.utils.SimpleChain;
import com.huawei.hwdevice.outofprocess.mgr.device.CloudDeviceInfo;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.ui.homehealth.R;
import com.huawei.ui.homehealth.device.featureaction.FeatureType;
import com.huawei.ui.homehealth.device.featureaction.featurestrategy.FeatureStrategy;
import com.huawei.ui.homehealth.devicearkui.feature.BaseFeatureItem;
import health.compact.a.SharedPreferenceManager;
import java.util.HashMap;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes17.dex */
public class sbl extends BaseFeatureItem {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f47918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private View f47919b;
    private Gson d;
    private DeviceInfo e;

    @Override // com.huawei.ui.homehealth.devicearkui.feature.BaseFeatureItem
    public boolean isNeedUpdate() {
        return true;
    }

    public sbl(ComponentActivity componentActivity) {
        super(componentActivity);
        this.f47918a = true;
        this.d = new Gson();
    }

    @Override // com.huawei.ui.homehealth.devicearkui.feature.BaseFeatureItem
    public void isSupportFeature(final DeviceInfo deviceInfo, FeatureSupportCallback featureSupportCallback) {
        featureSupportCallback.success(true);
        if (deviceInfo instanceof CloudDeviceInfo) {
            LogUtil.j("GeneralSettingsItem", "Cloud device");
            this.f47918a = false;
            return;
        }
        if (deviceInfo.getVersionType() != 0) {
            LogUtil.j("GeneralSettingsItem", "the device not release");
            this.f47918a = false;
            return;
        }
        if (eei.d(deviceInfo)) {
            LogUtil.j("GeneralSettingsItem", "HonorDevice");
            this.f47918a = false;
        } else if (etn.d(BaseApplication.getContext()) && lvi.l(deviceInfo.getProductType()) && SharedPreferenceManager.c(com.huawei.haf.application.BaseApplication.b(), LoginInit.getInstance(com.huawei.haf.application.BaseApplication.b()).getAccountInfo(1011))) {
            LogUtil.j("GeneralSettingsItem", "Honor Device");
            this.f47918a = false;
        } else {
            lss.a(this.featureSupportApi, new Consumer() { // from class: sbu
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    this.f47926c.b(deviceInfo, (DeviceFeatureSupportApi) obj);
                }
            });
        }
    }

    /* synthetic */ void b(DeviceInfo deviceInfo, DeviceFeatureSupportApi deviceFeatureSupportApi) {
        deviceFeatureSupportApi.isServiceSupport(deviceInfo, new DeviceFeatureSupportApi.ServiceSupportCallBack() { // from class: sbr
            @Override // com.huawei.devicefeature.DeviceFeatureSupportApi.ServiceSupportCallBack
            public final void onResult(String str) {
                this.f47923c.b(str);
            }
        });
    }

    /* synthetic */ void b(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("GeneralSettingsItem", "isSupportFeature result isEmpty");
            this.f47918a = false;
            return;
        }
        tlg tlgVar = (tlg) new Gson().fromJson(str, tlg.class);
        if (tlgVar == null) {
            LogUtil.j("GeneralSettingsItem", "isSupportFeature resultModel == null");
            this.f47918a = false;
        } else {
            boolean zEquals = "Y".equals(tlgVar.b().c());
            this.f47918a = zEquals;
            LogUtil.a("GeneralSettingsItem", "isServiceSupport :", Boolean.valueOf(zEquals));
        }
    }

    @Override // com.huawei.ui.homehealth.devicearkui.feature.BaseFeatureItem
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View view = this.f47919b;
        if (view != null) {
            return view;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_device_feature, viewGroup, false);
        this.f47919b = viewInflate;
        b(viewInflate);
        return this.f47919b;
    }

    private void b(View view) {
        if (view == null) {
            return;
        }
        qsp.e((TextView) qsp.a(view, R.id.tab_title), R.string.IDS_device_guide_text5);
        qsp.e((ImageView) qsp.a(view, R.id.device_item_inco), R.mipmap.device_general_settings);
        view.setOnClickListener(new qte(new View.OnClickListener() { // from class: sbt
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.e.a(view2);
            }
        }));
    }

    /* synthetic */ void a(View view) {
        FeatureStrategy featureStrategyC = rpq.c(FeatureType.DEVICE_SETTING);
        Bundle bundle = new Bundle();
        bundle.putBoolean("isSupportService", this.f47918a);
        a();
        LogUtil.a("GeneralSettingsItem", "jumpToFeaturePage isServiceSupport :", Boolean.valueOf(this.f47918a));
        featureStrategyC.jumpToFeaturePage(this.e, bundle, new SimpleChain.Emitter() { // from class: sbp
            @Override // com.huawei.hwcommonmodel.utils.SimpleChain.Emitter
            public final void onSuccess(Object[] objArr) {
                LogUtil.a("GeneralSettingsItem", "jumpToFeaturePage onSuccess");
            }
        });
    }

    private void a() {
        lmn lmnVar = new lmn();
        HashMap map = new HashMap(4);
        map.put("pageId", "Device_0003");
        lmnVar.d(map);
        HashMap map2 = new HashMap(4);
        map2.put("event", 0);
        map2.put(FunctionSetBeanReader.BI_ELEMENT, "m0");
        map2.put("moduleName", "main_page");
        lmnVar.e(map2);
        LogUtil.d("GeneralSettingsItem", "enterGeneralSettingPageBiEvent: ", AnalyticsValue.DEVICE_GENERAL_SETTING_H1010001003.value(), ", ", lmnVar.toString());
        lmf.d().a(BaseApplication.getContext(), AnalyticsValue.DEVICE_GENERAL_SETTING_H1010001003.value(), lmnVar, 0);
    }

    @Override // com.huawei.ui.homehealth.devicearkui.feature.BaseFeatureItem
    public void updateDevice(DeviceInfo deviceInfo) {
        this.e = deviceInfo;
    }
}
