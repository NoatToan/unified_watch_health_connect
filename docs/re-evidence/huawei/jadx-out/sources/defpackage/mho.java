package defpackage;

import android.text.TextUtils;
import com.huawei.hihealth.HiUserPreference;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes10.dex */
class mho {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static ReentrantReadWriteLock f41688c = new ReentrantReadWriteLock();
    private static ExecutorService d = Executors.newCachedThreadPool();

    mho() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String h(String str) {
        LogUtil.a("SwtchCldStrgUt", "getUserPreference enter");
        HiUserPreference hiUserPreferenceB = b(str);
        if (hiUserPreferenceB != null) {
            LogUtil.a("SwtchCldStrgUt", "getUserPreference userPreference is not null end");
            return hiUserPreferenceB.getValue();
        }
        LogUtil.a("SwtchCldStrgUt", "getUserPreference end");
        return null;
    }

    public static HiUserPreference b(String str) {
        for (int i = 0; i < 3; i++) {
            HiUserPreference userPreference = HiHealthManager.d(BaseApplication.getContext()).getUserPreference(str);
            if (userPreference != null) {
                return userPreference;
            }
            String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011);
            if (!TextUtils.isEmpty(accountInfo) && HiHealthManager.d(BaseApplication.getContext()).checkHiHealthLogin(accountInfo)) {
                LogUtil.a("SwtchCldStrgUt", "getHiUserPreference isHiHealthLogin is true");
                return HiHealthManager.d(BaseApplication.getContext()).getUserPreference(str);
            }
            try {
                Thread.sleep(300L);
            } catch (InterruptedException unused) {
                ReleaseLogUtil.a("DEVMGR_SwtchCldStrgUt", "getHiUserPreference InterruptedException");
            }
        }
        LogUtil.j("SwtchCldStrgUt", "getHiUserPreference HiUserPreference is null");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static List<HiUserPreference> e(List<String> list) {
        List<HiUserPreference> userPreferenceList = null;
        if (list == null) {
            return null;
        }
        for (int i = 0; i < 3; i++) {
            userPreferenceList = HiHealthManager.d(BaseApplication.getContext()).getUserPreferenceList(list);
            if (userPreferenceList != null) {
                return userPreferenceList;
            }
            String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011);
            if (!TextUtils.isEmpty(accountInfo) && HiHealthManager.d(BaseApplication.getContext()).checkHiHealthLogin(accountInfo)) {
                LogUtil.a("SwtchCldStrgUt", "getHiUserPreferenceList isHiHealthLogin is true");
                return HiHealthManager.d(BaseApplication.getContext()).getUserPreferenceList(list);
            }
            try {
                Thread.sleep(300L);
            } catch (InterruptedException unused) {
                ReleaseLogUtil.a("DEVMGR_SwtchCldStrgUt", "getHiUserPreferenceList InterruptedException");
            }
        }
        LogUtil.j("SwtchCldStrgUt", "getHiUserPreferenceList HiUserPreference is null");
        return userPreferenceList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:11:0x0037  */
    public static String j(String str) {
        String string;
        ReleaseLogUtil.d("DEVMGR_SwtchCldStrgUt", "getSwitchCommonSetting switchKey = ", str);
        String strH = h("custom.wear_common_setting");
        if (strH == null) {
            string = null;
        } else {
            HashMap<String, String> mapG = g(strH);
            boolean zContainsKey = mapG != null ? mapG.containsKey(str) : false;
            ReleaseLogUtil.d("DEVMGR_SwtchCldStrgUt", "getSwitchCommonSetting isContainKeywords = ", Boolean.valueOf(zContainsKey));
            if (zContainsKey) {
                string = mapG.get(str).toString();
            } else {
                string = null;
            }
        }
        ReleaseLogUtil.d("DEVMGR_SwtchCldStrgUt", "getSwitchCommonSetting result = ", string);
        return string;
    }

    public static HashMap<String, String> g(String str) {
        ReleaseLogUtil.d("DEVMGR_SwtchCldStrgUt", "hashStringToHashMap inputString = ", str);
        if (str == null || str.length() < 3) {
            LogUtil.j("SwtchCldStrgUt", "hashStringToHashMap inputString is illegal");
            return null;
        }
        String[] strArrSplit = str.substring(1, str.length() - 1).split(",");
        LogUtil.a("SwtchCldStrgUt", "hashStringToHashMap splitString = ", Arrays.toString(strArrSplit));
        HashMap<String, String> map = new HashMap<>(16);
        for (String str2 : strArrSplit) {
            String[] strArrSplit2 = str2.split("=");
            if (strArrSplit2.length >= 2) {
                String strTrim = strArrSplit2[0].trim();
                LogUtil.a("SwtchCldStrgUt", "hashStringToHashMap key = ", strTrim);
                boolean z = "bt_lost_remind".equals(strTrim) || "auto_light_screen".equals(strTrim) || "rotate_switch_screen".equals(strTrim) || "weather_switch_status".equals(strTrim);
                boolean z2 = "core_sleep_button".equals(strTrim) || "wlan_auto_update".equals(strTrim) || "left_or_right_hand_wear_status".equals(strTrim) || "heart_rate_button".equals(strTrim);
                boolean z3 = "press_auto_monitor_switch_status".equals(strTrim) || "left_or_right_foot_wear_status".equals(strTrim) || "continue_heart_rate".equals(strTrim) || "gps_files_switch_screen".equals(strTrim);
                boolean z4 = "weather_switch_unit_status".equals(strTrim) || "heart_rate_mode".equals(strTrim) || "watch_face_privacy_service_status".equals(strTrim) || "app_market_privacy_service_status".equals(strTrim);
                if (z || z2 || z3 || z4) {
                    String str3 = strArrSplit2[1];
                    LogUtil.a("SwtchCldStrgUt", "hashStringToHashMap value = ", str3);
                    map.put(strTrim, str3);
                }
            }
        }
        LogUtil.a("SwtchCldStrgUt", "hashStringToHashMap map = ", map.toString());
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static HashMap<String, String> f(String str) {
        if (str == null || str.length() < 3) {
            ReleaseLogUtil.e("DEVMGR_SwtchCldStrgUt", "hashStringToHashMapIntelligent inputString is illegal");
            return null;
        }
        String[] strArrSplit = str.substring(1, str.length() - 1).split(",");
        ReleaseLogUtil.d("DEVMGR_SwtchCldStrgUt", "hashStringToHashMapIntelligent splitString = ", Arrays.toString(strArrSplit));
        HashMap<String, String> map = new HashMap<>(16);
        for (String str2 : strArrSplit) {
            String[] strArrSplit2 = str2.split("=");
            if (strArrSplit2.length >= 2) {
                map.put(strArrSplit2[0].trim(), strArrSplit2[1]);
            }
        }
        ReleaseLogUtil.d("DEVMGR_SwtchCldStrgUt", "hashStringToHashMapIntelligent map = ", map.toString());
        return map;
    }

    public static void a(final String str, final String str2, final IBaseResponseCallback iBaseResponseCallback) {
        ReleaseLogUtil.d("DEVMGR_SwtchCldStrgUt", "setSwitchSetting switchKey = ", str);
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("SwtchCldStrgUt", "setSwitchSetting switchKey is null or empty");
        } else {
            d.execute(new Runnable() { // from class: mho.5
                @Override // java.lang.Runnable
                public void run() {
                    mho.f41688c.writeLock().lock();
                    boolean userPreference = HiHealthManager.d(BaseApplication.getContext()).setUserPreference(new HiUserPreference(str, str2), true);
                    mho.f41688c.writeLock().unlock();
                    ReleaseLogUtil.d("DEVMGR_SwtchCldStrgUt", "setSwitchSetting isSuccess = ", Boolean.valueOf(userPreference));
                    IBaseResponseCallback iBaseResponseCallback2 = iBaseResponseCallback;
                    if (iBaseResponseCallback2 != null) {
                        if (userPreference) {
                            iBaseResponseCallback2.a(0, null);
                        } else {
                            iBaseResponseCallback2.a(-1, null);
                        }
                    }
                }
            });
        }
    }

    public static void d(final String str, final String str2, String str3, final IBaseResponseCallback iBaseResponseCallback) {
        ReleaseLogUtil.d("DEVMGR_SwtchCldStrgUt", "differentiating devices, setSwitchSetting switchKey = ", str);
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("SwtchCldStrgUt", "differentiating devices, setSwitchSetting switchKey is null or empty");
        } else if (TextUtils.isEmpty(str3)) {
            ReleaseLogUtil.e("DEVMGR_SwtchCldStrgUt", "differentiating devices, setSwitchSetting identify is null or empty");
        } else {
            final String strC = nio.c(str3);
            d.execute(new Runnable() { // from class: mho.4
                @Override // java.lang.Runnable
                public void run() {
                    HashMap mapF;
                    String strH = mho.h(str);
                    if (!mho.i(strH)) {
                        mapF = mho.f(strH);
                        if (mapF == null) {
                            mapF = new HashMap(16);
                        }
                        mapF.put(strC, str2);
                    } else {
                        mapF = new HashMap(16);
                        mapF.put(strC, str2);
                    }
                    boolean userPreference = HiHealthManager.d(BaseApplication.getContext()).setUserPreference(new HiUserPreference(str, mapF.toString()), false);
                    ReleaseLogUtil.d("DEVMGR_SwtchCldStrgUt", "differentiating devices, setSwitchSetting isSuccess = ", Boolean.valueOf(userPreference));
                    IBaseResponseCallback iBaseResponseCallback2 = iBaseResponseCallback;
                    if (iBaseResponseCallback2 != null) {
                        if (userPreference) {
                            iBaseResponseCallback2.a(0, null);
                        } else {
                            iBaseResponseCallback2.a(-1, null);
                        }
                    }
                }
            });
        }
    }

    public static void a(final List<String> list, final IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a("SwtchCldStrgUt", "getSwitchSetting enter");
        if (list == null || iBaseResponseCallback == null) {
            LogUtil.j("SwtchCldStrgUt", "param error");
        } else {
            d.execute(new Runnable() { // from class: mho.1
                @Override // java.lang.Runnable
                public void run() {
                    mho.f41688c.readLock().lock();
                    List listE = mho.e((List<String>) list);
                    mho.f41688c.readLock().unlock();
                    if (listE == null) {
                        iBaseResponseCallback.a(-1, null);
                    } else {
                        LogUtil.a("SwtchCldStrgUt", "getSwitchSetting size is:", Integer.valueOf(listE.size()));
                        iBaseResponseCallback.a(0, listE);
                    }
                }
            });
        }
    }

    public static void a(final String str, final IBaseResponseCallback iBaseResponseCallback) {
        ReleaseLogUtil.d("DEVMGR_SwtchCldStrgUt", "getSwitchSetting switchKey = ", str);
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("SwtchCldStrgUt", "getSwitchSetting switchKey is null or empty");
        } else if (iBaseResponseCallback == null) {
            ReleaseLogUtil.e("DEVMGR_SwtchCldStrgUt", "getSwitchSetting callback is null");
        } else {
            d.execute(new Runnable() { // from class: mho.3
                @Override // java.lang.Runnable
                public void run() {
                    String value;
                    mho.f41688c.readLock().lock();
                    HiUserPreference hiUserPreferenceB = mho.b(str);
                    if (hiUserPreferenceB == null) {
                        ReleaseLogUtil.d("DEVMGR_SwtchCldStrgUt", "getSwitchSetting userPreference is null");
                        value = mho.j(str);
                    } else {
                        value = hiUserPreferenceB.getValue();
                    }
                    mho.f41688c.readLock().unlock();
                    ReleaseLogUtil.d("DEVMGR_SwtchCldStrgUt", "getSwitchSetting switchSetting = ", value);
                    if (TextUtils.isEmpty(value)) {
                        iBaseResponseCallback.a(-1, null);
                    } else {
                        iBaseResponseCallback.a(0, value);
                    }
                }
            });
        }
    }

    public static void b(final String str, final String str2, final IBaseResponseCallback iBaseResponseCallback) {
        ReleaseLogUtil.d("DEVMGR_SwtchCldStrgUt", "differentiating devices, getSwitchSetting switchKey = ", str);
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("SwtchCldStrgUt", "differentiating devices, getSwitchSetting switchKey is null or empty");
            return;
        }
        if (TextUtils.isEmpty(str2)) {
            ReleaseLogUtil.e("DEVMGR_SwtchCldStrgUt", "differentiating devices, getSwitchSetting identify is null or empty");
        } else if (iBaseResponseCallback == null) {
            ReleaseLogUtil.e("DEVMGR_SwtchCldStrgUt", "differentiating devices, getSwitchSetting callback is null");
        } else {
            final String strC = nio.c(str2);
            d.execute(new Runnable() { // from class: mho.2
                @Override // java.lang.Runnable
                public void run() {
                    String strH = mho.h(str);
                    if (mho.i(strH)) {
                        LogUtil.a("SwtchCldStrgUt", "differentiating devices, getSwitchSetting userPreference = ", strH);
                        iBaseResponseCallback.a(0, strH);
                        return;
                    }
                    if (strH != null) {
                        HashMap mapF = mho.f(strH);
                        if (mapF == null) {
                            ReleaseLogUtil.e("DEVMGR_SwtchCldStrgUt", "differentiating devices, commonSettingDataList is null");
                            iBaseResponseCallback.a(-1, null);
                            return;
                        } else if (mapF.containsKey(strC)) {
                            String string = mapF.get(strC).toString();
                            ReleaseLogUtil.d("DEVMGR_SwtchCldStrgUt", "getSwitchSetting identifySha256 switchSetting = ", string);
                            iBaseResponseCallback.a(0, string);
                            return;
                        } else if (mapF.containsKey(str2)) {
                            String string2 = mapF.get(str2).toString();
                            ReleaseLogUtil.d("DEVMGR_SwtchCldStrgUt", "getSwitchSetting identify switchSetting = ", string2);
                            iBaseResponseCallback.a(0, string2);
                            return;
                        }
                    } else {
                        LogUtil.j("SwtchCldStrgUt", "differentiating devices, getSwitchSetting on HiHealth is null");
                    }
                    iBaseResponseCallback.a(-1, null);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean i(String str) {
        return "true".equals(str) || "false".equals(str);
    }
}
