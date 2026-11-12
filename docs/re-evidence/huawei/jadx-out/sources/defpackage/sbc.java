package defpackage;

import android.util.Log;
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
import java.util.List;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes17.dex */
public class sbc extends BaseApplicationsServiceFeatureItem {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private DeviceInfo f47911c;
    private View e;

    @Override // com.huawei.ui.homehealth.devicearkui.feature.BaseFeatureItem
    public boolean isNeedUpdate() {
        return true;
    }

    public sbc(ComponentActivity componentActivity) {
        super(componentActivity);
    }

    @Override // com.huawei.ui.homehealth.devicearkui.feature.BaseApplicationsServiceFeatureItem, com.huawei.ui.homehealth.devicearkui.feature.BaseFeatureItem
    public void isSupportFeature(DeviceInfo deviceInfo, FeatureSupportCallback featureSupportCallback) {
        List<String> fieldList = deviceInfo.getFieldList();
        if (fieldList == null || fieldList.isEmpty()) {
            LogUtil.a("ExclusiveGuardianFeatureItem", "exclusiveServiceSupport not support ");
            featureSupportCallback.success(false);
        } else {
            featureSupportCallback.success(true);
        }
    }

    @Override // com.huawei.ui.homehealth.devicearkui.feature.BaseApplicationsServiceFeatureItem
    public void setupViews(View view) {
        if (view == null) {
            return;
        }
        this.e = view;
        c((this.featureSupportApi == null || this.f47911c == null || !this.featureSupportApi.isSupportExclusiveGuardianFromLocal(this.f47911c)) ? 8 : 0);
        qsp.e((TextView) qsp.a(view, R.id.tab_title), R.string.IDS_guardian_service);
        qsp.e((ImageView) qsp.a(view, R.id.device_item_inco), R.mipmap.exclusive_guardian_item);
        view.setOnClickListener(new qte(new View.OnClickListener() { // from class: sbd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f47912b.b(view2);
            }
        }));
    }

    /* synthetic */ void b(View view) {
        rpq.c(FeatureType.EXCLUSIVE_GUARD).jumpToFeaturePage(this.f47911c, new SimpleChain.Emitter() { // from class: sbh
            @Override // com.huawei.hwcommonmodel.utils.SimpleChain.Emitter
            public final void onSuccess(Object[] objArr) {
                LogUtil.a("ExclusiveGuardianFeatureItem", "jumpToFeaturePage onSuccess");
            }
        });
    }

    @Override // com.huawei.ui.homehealth.devicearkui.feature.BaseApplicationsServiceFeatureItem, com.huawei.ui.homehealth.devicearkui.feature.BaseFeatureItem
    public void updateDevice(final DeviceInfo deviceInfo) {
        this.f47911c = deviceInfo;
        LogUtil.a("ExclusiveGuardianFeatureItem", "updateDevice name:", deviceInfo == null ? "nullDevice" : deviceInfo.getDeviceName());
        if (deviceInfo == null) {
            return;
        }
        lss.a(this.featureSupportApi, new Consumer() { // from class: sbj
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                this.f47916c.b(deviceInfo, (DeviceFeatureSupportApi) obj);
            }
        });
    }

    /* synthetic */ void b(final DeviceInfo deviceInfo, DeviceFeatureSupportApi deviceFeatureSupportApi) {
        deviceFeatureSupportApi.isSupportExclusiveGuardian(deviceInfo, new FeatureSupportCallback() { // from class: sbg
            @Override // com.huawei.devicefeature.FeatureSupportCallback
            public final void success(boolean z) {
                this.f47914b.a(deviceInfo, z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void a(final DeviceInfo deviceInfo, final boolean z) {
        if (this.activity == null || this.activity.isDestroyed() || this.activity.isFinishing()) {
            Log.w("ExclusiveGuardianFeatureItem", "activity is null or finish");
        } else {
            this.activity.runOnUiThread(new Runnable() { // from class: sbi
                @Override // java.lang.Runnable
                public final void run() {
                    this.e.c(deviceInfo, z);
                }
            });
        }
    }

    /* synthetic */ void c(DeviceInfo deviceInfo, boolean z) {
        if (!mig.d(this.f47911c, deviceInfo)) {
            Log.w("ExclusiveGuardianFeatureItem", "updateItemView different device");
        } else {
            c(z ? 0 : 8);
        }
    }

    private void c(int i) {
        View view = this.e;
        if (view != null) {
            view.setVisibility(i);
        } else {
            Log.w("ExclusiveGuardianFeatureItem", "updateItemView itemView is null");
        }
    }
}
