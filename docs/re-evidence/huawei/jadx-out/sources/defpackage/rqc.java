package defpackage;

import android.content.Intent;
import android.text.TextUtils;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.SimpleChain;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.homehealth.device.featureaction.featurestrategy.FeatureBaseStrategy;
import com.huawei.ui.homewear21.home.WearHomeDataSyncSwitchActivity;

/* JADX INFO: loaded from: classes17.dex */
public class rqc extends FeatureBaseStrategy {
    @Override // com.huawei.ui.homehealth.device.featureaction.featurestrategy.FeatureBaseStrategy
    public boolean canJumpWithConnect() {
        return false;
    }

    @Override // com.huawei.ui.homehealth.device.featureaction.featurestrategy.FeatureBaseStrategy
    public void reportBiEvent() {
    }

    @Override // com.huawei.ui.homehealth.device.featureaction.featurestrategy.FeatureBaseStrategy, com.huawei.ui.homehealth.device.featureaction.featurestrategy.FeatureStrategy
    public boolean jumpToFeaturePage(DeviceInfo deviceInfo, SimpleChain.Emitter emitter) {
        if (super.jumpToFeaturePage(deviceInfo, emitter)) {
            return true;
        }
        if (BaseApplication.getActivity() == null) {
            LogUtil.a("ContactManageStrategy", "jumpPageToContact activity is null ");
            return false;
        }
        String strC = top.c();
        if (!TextUtils.isEmpty(strC)) {
            try {
                String strD = qxg.d(BaseApplication.getContext(), strC);
                Intent intent = new Intent("com.huawei.intent.action.APP_DATA_SYNC_SWITCH");
                intent.addCategory("android.intent.category.DEFAULT");
                intent.setPackage(strC);
                qrs.c(intent, strC, BaseApplication.getActivity(), strD);
            } catch (SecurityException unused) {
                LogUtil.e("ContactManageStrategy", "onItemClick SecurityException");
            }
        } else {
            Intent intent2 = new Intent(BaseApplication.getActivity(), (Class<?>) WearHomeDataSyncSwitchActivity.class);
            intent2.putExtra("device_id", this.mDeviceInfo.getDeviceIdentify());
            intent2.putExtra("SHOW_ONLY", "ONLY_CONTACT");
            iov.d(BaseApplication.getActivity(), intent2);
        }
        return true;
    }
}
