package defpackage;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hwcommonmodel.utils.SimpleChain;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.homehealth.device.featureaction.featurestrategy.FeatureBaseStrategy;
import com.huawei.ui.homewear21.R;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes17.dex */
public class rsq extends FeatureBaseStrategy {
    @Override // com.huawei.ui.homehealth.device.featureaction.featurestrategy.FeatureBaseStrategy
    public boolean canJumpWithConnect() {
        return false;
    }

    @Override // com.huawei.ui.homehealth.device.featureaction.featurestrategy.FeatureBaseStrategy
    public boolean canJumpWithOtaTransfering() {
        return true;
    }

    @Override // com.huawei.ui.homehealth.device.featureaction.featurestrategy.FeatureStrategy
    public boolean jumpToFeaturePage(DeviceInfo deviceInfo, Bundle bundle, SimpleChain.Emitter emitter) {
        if (super.jumpToFeaturePage(deviceInfo, emitter)) {
            return true;
        }
        String string = bundle.getString("domainAppgalleryCloudHuawei", "");
        Activity activityJ = BaseApplication.j();
        if (activityJ != null) {
            try {
                if (lsj.c(com.huawei.hwcommonmodel.application.BaseApplication.getContext(), "com.huawei.study.hiresearch")) {
                    qrs.c(activityJ.getPackageManager().getLaunchIntentForPackage("com.huawei.study.hiresearch"), "com.huawei.study.hiresearch", activityJ, activityJ.getString(R.string.IDS_hw_innovation_research).replace("\n", ""));
                } else {
                    Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse("market://details?id=com.huawei.study.hiresearch"));
                    intent.addFlags(268435456);
                    c(activityJ, intent, "/#/app/C102552669", "", string);
                }
            } catch (Exception e) {
                ReleaseLogUtil.a("ResearchStrategy", ExceptionUtils.c(e));
            }
            return true;
        }
        LogUtil.e("ResearchStrategy", "startActivity fail for activity is null");
        return false;
    }

    @Override // com.huawei.ui.homehealth.device.featureaction.featurestrategy.FeatureBaseStrategy
    public void reportBiEvent() {
        rdt.d("research");
    }

    private void c(Activity activity, Intent intent, String str, String str2, String str3) {
        if (lsj.c(com.huawei.hwcommonmodel.application.BaseApplication.getContext(), "com.huawei.appmarket")) {
            intent.setPackage("com.huawei.appmarket");
            qrs.c(intent, "com.huawei.appmarket", activity, activity.getString(R.string.IDS_device_fragment_application_market));
            return;
        }
        Intent intent2 = new Intent();
        intent2.setAction(CommonConstant.ACTION.HWID_SCHEME_URL);
        intent2.setData(Uri.parse(str3 + str + str2));
        PackageManager packageManager = activity.getPackageManager();
        if (packageManager != null) {
            LogUtil.a("ResearchStrategy", "checkIsInstalledMarket packageManager is not null");
            ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intent2, 65536);
            if (resolveInfoResolveActivity != null) {
                LogUtil.a("ResearchStrategy", "checkIsInstalledMarket resolveInfo is not null");
                ComponentName componentName = new ComponentName(resolveInfoResolveActivity.activityInfo.packageName, resolveInfoResolveActivity.activityInfo.name);
                intent2.setComponent(componentName);
                qrs.c(intent2, componentName.getPackageName(), activity, activity.getString(R.string.IDS_browser_app_name));
            }
        }
    }
}
