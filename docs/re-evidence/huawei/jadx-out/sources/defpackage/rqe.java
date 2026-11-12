package defpackage;

import android.content.Intent;
import android.text.TextUtils;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.SimpleChain;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.homehealth.device.featureaction.featurestrategy.FeatureBaseStrategy;
import java.util.HashMap;

/* JADX INFO: loaded from: classes17.dex */
public class rqe extends FeatureBaseStrategy {
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
        if (this.mDeviceInfo == null) {
            LogUtil.j("CalendarStrategy", "jumpPageToFace deviceInfo == null");
            return false;
        }
        String strD = top.d(deviceInfo);
        if (!TextUtils.isEmpty(strD)) {
            try {
                String strD2 = qxg.d(BaseApplication.getContext(), strD);
                Intent intent = new Intent("com.huawei.intent.action.APP_DATA_SYNC_SWITCH");
                intent.addCategory("android.intent.category.DEFAULT");
                intent.setPackage(strD);
                qrs.c(intent, strD, BaseApplication.getActivity(), strD2);
            } catch (SecurityException unused) {
                LogUtil.e("CalendarStrategy", "onItemClick SecurityException");
            }
            return true;
        }
        HashMap<String, String> map = new HashMap<>();
        map.put("device_id", this.mDeviceInfo.getDeviceIdentify());
        startActivity("com.huawei.ui.homewear21.home.WearHomeCalendarSettingActivity", map);
        return true;
    }
}
