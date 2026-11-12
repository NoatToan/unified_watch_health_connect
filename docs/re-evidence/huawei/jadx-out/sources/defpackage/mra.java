package defpackage;

import android.text.TextUtils;
import android.util.Log;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.phoneprocess.mgr.hwcalendarmgr.calendardb.CalendarDbBean;
import com.huawei.hwdevice.phoneprocess.mgr.hwcalendarmgr.calendardb.CalendarSyncStateBean;
import com.huawei.hwdevice.phoneprocess.mgr.hwcalendarmgr.calendardb.SecurityCalendarDbHelper;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class mra {
    public static void c(String str, int i, long j) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("CacheDatabaseUtils", "setSyncAllContactsFlag: deviceId is null or empty.");
            return;
        }
        int i2 = i == 0 ? 0 : 16;
        mqz mqzVarB = mqz.b(BaseApplication.getContext());
        List<CalendarSyncStateBean> listC = mqzVarB.c(mtv.a(str));
        LogUtil.a("CacheDatabaseUtils", "setSyncAllContactsFlag: start, queried size: ", Integer.valueOf(listC.size()));
        if (listC.isEmpty()) {
            mqzVarB.a(mtv.a(new CalendarSyncStateBean(str, str, i2, j)));
            return;
        }
        CalendarSyncStateBean calendarSyncStateBean = listC.get(0);
        if (calendarSyncStateBean == null) {
            LogUtil.j("CacheDatabaseUtils", "setSyncAllContactsFlag: deviceSyncStateBean is null.");
            return;
        }
        long minor = calendarSyncStateBean.getMinor();
        calendarSyncStateBean.setSyncAllFlag(i);
        calendarSyncStateBean.setMinor(minor + j);
        mqzVarB.b(mtv.a(calendarSyncStateBean));
    }

    public static long e(boolean z) {
        List<CalendarSyncStateBean> listC = mqz.b(BaseApplication.getContext()).c(mtv.a(b(z)));
        LogUtil.a("CacheDatabaseUtils", "syncedMinor: start, queried size: ", Integer.valueOf(listC.size()));
        if (listC.isEmpty()) {
            return 0L;
        }
        CalendarSyncStateBean calendarSyncStateBean = listC.get(0);
        if (calendarSyncStateBean == null) {
            LogUtil.j("CacheDatabaseUtils", "setSyncAllContactsFlag: deviceSyncStateBean is null.");
            return 0L;
        }
        return calendarSyncStateBean.getMinor();
    }

    public static boolean e(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            LogUtil.j("CacheDatabaseUtils", "isSynchronizedOnce: deviceId is null or empty.");
            return false;
        }
        LogUtil.a("CacheDatabaseUtils", "isSynchronizedOnce: enter. received major is ", str);
        return CommonUtil.k(BaseApplication.getContext()).equalsIgnoreCase(str);
    }

    public static void a(String str, String str2, List<CalendarDbBean> list, long j, boolean z) {
        if (TextUtils.isEmpty(str2) || list == null || list.isEmpty()) {
            Log.w("CacheDatabaseUtils", "saveSyncedContacts: input parameters are invalid.");
            return;
        }
        mrb mrbVarE = mrb.e(BaseApplication.getContext());
        if (e(str, str2)) {
            mrbVarE.a(list, str2);
        } else {
            mrbVarE.e(list, str2);
        }
        if (z) {
            c(str2, 16, j);
        }
    }

    public static void a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            Log.w("CacheDatabaseUtils", "saveDeletedContacts: input parameters are invalid.");
        } else {
            mrb.e(BaseApplication.getContext()).c(str2, str);
        }
    }

    public static void b(String str) {
        if (TextUtils.isEmpty(str)) {
            Log.w("CacheDatabaseUtils", "createSyncDataTable: deviceId is null or empty.");
        } else {
            mrb.e(BaseApplication.getContext()).d(str);
        }
    }

    public static List<CalendarDbBean> a(String str) {
        return mrb.e(BaseApplication.getContext()).c(str);
    }

    public static void a(List<String> list) {
        if (list == null || list.isEmpty()) {
            LogUtil.j("CacheDatabaseUtils", "clearDeviceFromDb: deviceIdList is null or empty.");
            return;
        }
        LogUtil.a("CacheDatabaseUtils", "clearDeviceFromDb: list size: ", Integer.valueOf(list.size()));
        mqz.b(BaseApplication.getContext()).d(list);
        SecurityCalendarDbHelper securityCalendarDbHelperE = SecurityCalendarDbHelper.e(BaseApplication.getContext());
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            securityCalendarDbHelperE.d(it.next());
        }
    }

    public static String b(boolean z) {
        DeviceInfo deviceInfo = null;
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_MAIN_DEVICES, null, "CacheDatabaseUtils");
        if (deviceList.size() == 0) {
            LogUtil.j("CacheDatabaseUtils", "getContactedDeviceMac: the object of HwDeviceMgr is null. ");
            return "00:00:00:00:00:00";
        }
        if (deviceList.size() > 0) {
            for (DeviceInfo deviceInfo2 : deviceList) {
                if (!eel.d(deviceInfo2.getProductType())) {
                    deviceInfo = deviceInfo2;
                    break;
                }
            }
        }
        if (deviceInfo == null) {
            LogUtil.j("CacheDatabaseUtils", "getContactedDeviceMac: the object of DeviceInfo is null. ");
            return "00:00:00:00:00:00";
        }
        String deviceIdentify = deviceInfo.getDeviceIdentify();
        return mri.d(TextUtils.isEmpty(deviceIdentify) ? "00:00:00:00:00:00" : deviceIdentify, z);
    }

    public static void b() {
        mrb.e(BaseApplication.getContext());
        mqz.b(BaseApplication.getContext());
    }
}
