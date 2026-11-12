package defpackage;

import android.content.ContentValues;
import android.content.Context;
import com.huawei.hihealth.HiDeviceInfo;
import com.huawei.hihealth.util.HiBroadcastUtil;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.HiCommonUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class kwy {
    private kuw e;

    private kwy() {
        this.e = kuw.b();
    }

    static class e {
        private static final kwy e = new kwy();
    }

    public static kwy b(Context context) {
        return e.e;
    }

    public static kwy d() {
        return e.e;
    }

    public long c(HiDeviceInfo hiDeviceInfo) {
        LogUtil.d("Debug_DeviceInfoManager", "insertDeviceInfoData()");
        return this.e.insert(kvw.e(hiDeviceInfo));
    }

    public HiDeviceInfo b(String str) {
        if (HiCommonUtil.a(str)) {
            LogUtil.j("Debug_DeviceInfoManager", "queryDeviceInfoData() deviceUUID = null");
            return null;
        }
        return kwf.g(this.e.query(a(), a(str), null, null, null));
    }

    private long b(HiDeviceInfo hiDeviceInfo, HiDeviceInfo hiDeviceInfo2) {
        if (hiDeviceInfo2.equals(hiDeviceInfo)) {
            LogUtil.a("Debug_DeviceInfoManager", "deviceInfo is the same as DB, no update.");
            return 1L;
        }
        ReleaseLogUtil.d("Debug_DeviceInfoManager", "updateDeviceInfoData oldName:", hiDeviceInfo2.getDeviceName(), ", newName:", hiDeviceInfo.getDeviceName());
        return a(hiDeviceInfo);
    }

    private long a(HiDeviceInfo hiDeviceInfo) {
        if (hiDeviceInfo == null || HiCommonUtil.a(hiDeviceInfo.getDeviceUniqueCode())) {
            ReleaseLogUtil.e("Debug_DeviceInfoManager", "updateDeviceInfoData() deviceUUID = null");
            return 0L;
        }
        ContentValues contentValuesE = kvw.e(hiDeviceInfo);
        contentValuesE.remove("createTime");
        int iUpdate = this.e.update(contentValuesE, a(), a(hiDeviceInfo.getDeviceUniqueCode()));
        LogUtil.d("Debug_DeviceInfoManager", "updateDeviceInfoData() updateResult  updateResult = ", Integer.valueOf(iUpdate));
        return iUpdate;
    }

    private long d(HiDeviceInfo hiDeviceInfo) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("model", hiDeviceInfo.getModel());
        return this.e.update(contentValues, "device_unique_code =? ", new String[]{hiDeviceInfo.getDeviceUniqueCode()});
    }

    private boolean d(String str) {
        if (HiCommonUtil.a(str)) {
            LogUtil.j("Debug_DeviceInfoManager", "queryDeviceInfoDataExist() deviceUUID = null");
            return false;
        }
        return kwf.m(this.e.query(a(), a(str), null, null, null));
    }

    public List<HiDeviceInfo> e(int i) {
        return kwf.j(this.e.query("device_type =? ", new String[]{String.valueOf(i)}, null, null, null));
    }

    /* JADX WARN: Code duplicated, block: B:36:0x008b  */
    public boolean e(HiDeviceInfo hiDeviceInfo, boolean z) throws Throwable {
        boolean zB;
        long jC;
        if ("-1".equals(hiDeviceInfo.getDeviceUniqueCode()) && !z) {
            ReleaseLogUtil.e("Debug_DeviceInfoManager", "deviceType or uuid is manual_input, register is not allowed");
            return false;
        }
        try {
            try {
                zB = !ljq.h(BaseApplication.getContext(), 0) ? ljq.b(BaseApplication.getContext(), 0) : false;
                try {
                    HiDeviceInfo hiDeviceInfoB = b(hiDeviceInfo.getDeviceUniqueCode());
                    if (hiDeviceInfoB != null) {
                        jC = b(hiDeviceInfo, hiDeviceInfoB);
                    } else {
                        jC = c(hiDeviceInfo);
                        if (jC > 0) {
                            HiBroadcastUtil.b(BaseApplication.getContext(), hiDeviceInfo);
                        }
                    }
                    if (zB) {
                        ljq.g(BaseApplication.getContext(), 0);
                    }
                    boolean zB2 = kwb.b(jC);
                    if (zB) {
                        ljq.c(BaseApplication.getContext(), 0);
                    }
                    return zB2;
                } catch (Exception e2) {
                    e = e2;
                    ReleaseLogUtil.e("Debug_DeviceInfoManager", "insertOrUpdateDeviceInfoData exception: ", LogAnonymous.b(e));
                    if (zB) {
                        ljq.c(BaseApplication.getContext(), 0);
                    }
                    return false;
                }
            } catch (Throwable th) {
                th = th;
                if (z) {
                    ljq.c(BaseApplication.getContext(), 0);
                }
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            zB = false;
        } catch (Throwable th2) {
            th = th2;
            z = false;
            if (z) {
                ljq.c(BaseApplication.getContext(), 0);
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0064  */
    public boolean e(HiDeviceInfo hiDeviceInfo) throws Throwable {
        boolean zB;
        try {
            try {
                zB = !ljq.h(BaseApplication.getContext(), 0) ? ljq.b(BaseApplication.getContext(), 0) : false;
                try {
                    long jD = d(hiDeviceInfo.getDeviceUniqueCode()) ? d(hiDeviceInfo) : 0L;
                    if (zB) {
                        ljq.g(BaseApplication.getContext(), 0);
                    }
                    boolean zB2 = kwb.b(jD);
                    if (zB) {
                        ljq.c(BaseApplication.getContext(), 0);
                    }
                    return zB2;
                } catch (Exception e2) {
                    e = e2;
                    ReleaseLogUtil.e("Debug_DeviceInfoManager", "insertOrUpdatePhoneModel exception: ", LogAnonymous.b(e));
                    if (zB) {
                        ljq.c(BaseApplication.getContext(), 0);
                    }
                    return false;
                }
            } catch (Throwable th) {
                th = th;
                if (0 != 0) {
                    ljq.c(BaseApplication.getContext(), 0);
                }
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            zB = false;
        } catch (Throwable th2) {
            th = th2;
            if (0 != 0) {
                ljq.c(BaseApplication.getContext(), 0);
            }
            throw th;
        }
    }

    public int c(String str) {
        LogUtil.d("Debug_DeviceInfoManager", "getDeviceId");
        if (HiCommonUtil.a(str)) {
            LogUtil.j("Debug_DeviceInfoManager", "getDeviceId() deviceUUID = null");
            return 0;
        }
        return kwf.f(this.e.query(a(), a(str), null, null, null), "_id");
    }

    public HiDeviceInfo b(int i) {
        return kwf.g(this.e.query("_id =? ", new String[]{Integer.toString(i)}, null, null, null));
    }

    public List<HiDeviceInfo> c(List<Integer> list) {
        int size = list.size();
        StringBuffer stringBuffer = new StringBuffer((size * 2) + 32);
        String[] strArr = new String[size];
        kwb.e("_id", list, stringBuffer, strArr, 0);
        return kwf.j(this.e.query(stringBuffer.toString(), strArr, null, null, null));
    }

    private String a() {
        return "device_unique_code =? ";
    }

    private String[] a(String str) {
        return new String[]{str};
    }

    public int b(int i, ContentValues contentValues) {
        return this.e.update(contentValues, "_id =? ", new String[]{Integer.toString(i)});
    }

    public int c(int i, int i2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("sync_status", Integer.valueOf(i2));
        return this.e.update(contentValues, "_id =? ", new String[]{Integer.toString(i)});
    }

    public List<HiDeviceInfo> a(Integer num) {
        String strE = e();
        String[] strArr = {Integer.toString(num.intValue())};
        LogUtil.d("Debug_DeviceInfoManager", "queryUnSyncDeviceInfoList selection=", strE, ", selectionArgs=", HiJsonUtil.d(strArr));
        return kwf.j(this.e.rawQuery(strE, strArr));
    }

    private String e() {
        return " select hihealth_device._id,hihealth_device.device_unique_code,hihealth_device.deviceName,hihealth_device.device_type,hihealth_device.firmwareVersion,hihealth_device.hardwareVersion,hihealth_device.softwareVersion,hihealth_device.manufacturer,hihealth_device.model,hihealth_device.device_sn,hihealth_device.device_mac,hihealth_device.createTime,hihealth_device.prod_id,hihealth_device.device_udid,hihealth_device.sub_prod_id,hihealth_device.sync_status from hihealth_dataclient INNER JOIN hihealth_device ON hihealth_dataclient.device_id = hihealth_device._id where hihealth_dataclient.cloud_device != 0 and hihealth_device.sync_status = 0 and hihealth_dataclient.user_id =? and hihealth_dataclient.app_id > 0";
    }
}
