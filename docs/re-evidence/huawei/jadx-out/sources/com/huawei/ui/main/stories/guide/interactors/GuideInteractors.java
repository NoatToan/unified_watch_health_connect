package com.huawei.ui.main.stories.guide.interactors;

import android.content.Context;
import com.huawei.hihealth.HiUserPreference;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hwbasemgr.HwBaseManager;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes19.dex */
public class GuideInteractors extends HwBaseManager {
    private Context d;

    public GuideInteractors(Context context) {
        super(BaseApplication.getContext());
        this.d = BaseApplication.getContext();
    }

    @Override // com.huawei.hwbasemgr.HwBaseManager
    public Integer getModuleId() {
        return 10005;
    }

    public boolean i() {
        LogUtil.a("GuideInteractors", "isShowSuccessFlagInSharePreference enter");
        return "true".equals(getSharedPreference("KEY_GUIDE_SET_SHOW_HIHEALTH_DOWNLOAD_ACTIVITY_FLAG"));
    }

    public void a(String str) {
        LogUtil.a("GuideInteractors", "setOutsideOpenActivityFlagInSharePreference enter:", str);
        setSharedPreference("KEY_OUTSIDE_OPEN_ACTIVITY_FLAG", str, null);
    }

    public String c() {
        String sharedPreference = getSharedPreference("KEY_OUTSIDE_OPEN_ACTIVITY_FLAG");
        LogUtil.a("GuideInteractors", "getOutsideOpenActivityFlagInSharePreference enter:", sharedPreference);
        return sharedPreference;
    }

    @Override // com.huawei.hwbasemgr.HwBaseManager
    public void onDestroy() {
        super.onDestroy();
        CommonUtil.d(this.d);
    }

    public void c(boolean z) {
        LogUtil.a("GuideInteractors", "setPairedEarSuccessFlagInSharePreference", Boolean.valueOf(z));
        setSharedPreference("key_ear_pair_success_from_pair_activity", String.valueOf(z), null);
    }

    public boolean e() {
        LogUtil.a("GuideInteractors", "isPairedEarFlagInSharePreference");
        return "true".equals(getSharedPreference("key_ear_pair_success_from_pair_activity"));
    }

    public void j(boolean z) {
        LogUtil.a("GuideInteractors", "setPairedXiaoYiSuccessFlagInSharePreference", Boolean.valueOf(z));
        setSharedPreference("key_xiao_yi_pair_success_from_pair_activity", String.valueOf(z), null);
    }

    public boolean f() {
        LogUtil.a("GuideInteractors", "isPairedXiaoYiFlagInSharePreference");
        return "true".equals(getSharedPreference("key_xiao_yi_pair_success_from_pair_activity"));
    }

    public void e(boolean z) {
        LogUtil.a("GuideInteractors", "setDeviceConnectFlagInSharePreference enter isBind is ", Boolean.valueOf(z));
        setSharedPreference("key_device_connect_success", String.valueOf(z), null);
    }

    public boolean b() {
        LogUtil.a("GuideInteractors", "isConnectFlagInSharePreference enter");
        return "true".equals(getSharedPreference("key_device_connect_success"));
    }

    public void b(boolean z) {
        LogUtil.a("GuideInteractors", "setAndroidWearOpen eSim FlagInSharePreference enter", Boolean.valueOf(z));
        setSharedPreference("key_pair_success_from_pair_activity", String.valueOf(z), null);
    }

    public boolean a() {
        LogUtil.a("GuideInteractors", "getAndroidWearOpen eSim FlagInSharePreference enter");
        return "true".equals(getSharedPreference("key_pair_success_from_pair_activity"));
    }

    public void a(boolean z) {
        LogUtil.a("GuideInteractors", "setPairedGuideFlagInSharePreference", Boolean.valueOf(z));
        setSharedPreference("key_guide_pair_success_from_pair_activity", String.valueOf(z), null);
    }

    public boolean h() {
        LogUtil.a("GuideInteractors", "isPairedGuideFlagInSharePreference");
        return "true".equals(getSharedPreference("key_guide_pair_success_from_pair_activity"));
    }

    public boolean d(String str) {
        LogUtil.a("GuideInteractors", "isShowUserGuideFlagInSharePreference");
        return "true".equals(getSharedPreference(str));
    }

    public void c(String str) {
        LogUtil.a("GuideInteractors", "setShowUserGuideFlagInSharePreference");
        setSharedPreference("keyUserGuidePage" + str, "true", null);
    }

    public void c(String str, boolean z) {
        ReleaseLogUtil.d("R_GuideInteractors", "setsetShowSyncAccountSharePreference enter ", Boolean.valueOf(z));
        setSharedPreference("KEY_SHOW_SYNC_ACCOUNT_ON_HOME_ACTIVITY_FLAG".concat(str), String.valueOf(z), null);
    }

    public boolean e(String str) {
        LogUtil.a("GuideInteractors", "isShowSyncAccountFlagInSharePreference enter");
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(10008), "currentIsNoCloud");
        ReleaseLogUtil.d("R_GuideInteractors", "isShowSyncAccountFlag isNoCloudToWithCloud:", strE);
        if ("1".equals(strE)) {
            LogUtil.a("GuideInteractors", "this is noCloud with cloud scenes");
            SharedPreferenceManager.e(this.d, Integer.toString(10008), "currentIsNoCloud", "0", null);
            return true;
        }
        HiUserPreference userPreference = HiHealthManager.d(this.d).getUserPreference("sync_account_dialog_mark");
        if (userPreference != null) {
            String value = userPreference.getValue();
            ReleaseLogUtil.d("R_GuideInteractors", "isShowSyncAccountFlag getValueFromDevice:", value);
            if ("1".equals(value)) {
                LogUtil.a("GuideInteractors", "getValueFromDevice scenes");
                HiHealthManager.d(this.d).setUserPreference(new HiUserPreference("sync_account_dialog_mark", "0"), false);
                return true;
            }
        } else {
            ReleaseLogUtil.e("R_GuideInteractors", "isShowSyncAccountFlag userPreference is null");
        }
        boolean zEquals = "COMPLETE".equals(getSharedPreference("KEY_SHOW_SYNC_ACCOUNT_ARK_UI_ON_REMINDERS_FLAG".concat(str)));
        ReleaseLogUtil.d("R_GuideInteractors", "isShowSyncAccountFlag accountSyncFinishedValue = ", Boolean.valueOf(zEquals));
        if (zEquals) {
            return false;
        }
        boolean zEquals2 = "true".equals(getSharedPreference("KEY_SHOW_SYNC_ACCOUNT_ON_HOME_ACTIVITY_FLAG".concat(str)));
        ReleaseLogUtil.d("R_GuideInteractors", "isShowSyncAccountFlag isDefaultSyncAccountFlag = ", Boolean.valueOf(zEquals2));
        return zEquals2;
    }

    public void d(boolean z) {
        LogUtil.a("GuideInteractors", "setAndroidWearOpen eSim Flag InSharePreference enter", Boolean.valueOf(z));
        setSharedPreference("key_device_auto_checked_tips", String.valueOf(z), null);
    }

    public boolean d() {
        LogUtil.a("GuideInteractors", "getAndroidWearOpen eSim Flag InSharePreference enter");
        return "true".equals(getSharedPreference("key_device_auto_checked_tips"));
    }
}
