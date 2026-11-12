package defpackage;

import android.content.Context;
import android.os.Process;
import android.os.SystemClock;
import android.provider.Settings;
import com.huawei.health.device.fatscale.multiusers.MultiUsersManager;
import com.huawei.health.device.fatscale.multiusers.WeightDataManager;
import com.huawei.hihealth.HiUserInfo;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.data.listener.HiCommonListener;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class dcf {
    public static boolean d(Context context) {
        int i;
        if (context == null) {
            LogUtil.a("MainActivityHelper", "get gesture navigation state failed, context is null");
            return false;
        }
        try {
            i = Settings.Secure.getInt(context.getContentResolver(), "secure_gesture_navigation");
        } catch (Settings.SettingNotFoundException e) {
            LogUtil.a("MainActivityHelper", "isGestureNavigationOpen SettingNotFoundException : ", e.getMessage());
            i = -1;
        }
        LogUtil.a("MainActivityHelper", "isGestureNavigationOpen getSystemSetting state : ", Integer.valueOf(i));
        return i == 1;
    }

    public static void b(String str, String str2) {
        HashMap map = new HashMap();
        map.put("click", "1");
        if (str2 != null) {
            map.put("type", str2);
        }
        lmf.d().c(BaseApplication.getContext(), str, map, 0);
    }

    public static void c(final Context context) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        HiHealthManager.d(BaseApplication.getContext()).fetchUserData(new HiCommonListener() { // from class: dcf.4
            @Override // com.huawei.hihealth.data.listener.HiCommonListener
            public void onSuccess(int i, Object obj) {
                LogUtil.a("MainActivityHelper", "Enter initWeightUserData callback onSuccess");
                LogUtil.a("PluginDevice_PluginDevice", "getHealthAPI HiCommonListener onSuccess pid = ", Integer.valueOf(Process.myPid()), ",tid = ", Integer.valueOf(Process.myTid()));
                if (obj != null) {
                    List list = (List) obj;
                    if (njy.e(list)) {
                        LogUtil.j("MainActivityHelper", "initWeightUserData onSuccess userInfos is null or size is zero");
                        return;
                    }
                    HiUserInfo hiUserInfo = (HiUserInfo) list.get(0);
                    if (hiUserInfo == null) {
                        LogUtil.j("MainActivityHelper", "initWeightUserData onSuccess HiUserInfo is null");
                        return;
                    }
                    int gender = hiUserInfo.getGender();
                    if (gender != 2 && gender != 0 && gender != 1) {
                        gender = -100;
                    }
                    dnj dnjVar = new dnj();
                    dnjVar.e(hiUserInfo.getAge());
                    dnjVar.e((byte) gender);
                    dnjVar.c(hiUserInfo.getHeight());
                    dnjVar.e(hiUserInfo.getWeight());
                    dnjVar.d(hiUserInfo.getBirthday());
                    dnjVar.d(LoginInit.getInstance(context).getAccountInfo(1011));
                    MultiUsersManager.INSTANCE.initMultiUsers(dnjVar);
                    WeightDataManager.INSTANCE.readAllWeightDataOfUser();
                }
            }

            @Override // com.huawei.hihealth.data.listener.HiCommonListener
            public void onFailure(int i, Object obj) {
                LogUtil.e("MainActivityHelper", "initWeightUserData falied to retrieve user info, all weight data won't be displayed!");
            }
        });
        LogUtil.a("MainActivityHelper", "initWeightUserData finished, time cost:", Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime));
    }
}
