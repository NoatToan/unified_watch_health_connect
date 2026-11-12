package defpackage;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.text.TextUtils;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.h5pro.jsmodules.device.MatterDataContans;
import health.compact.a.LogAnonymous;
import health.compact.a.MagicBuild;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes7.dex */
public class eei {
    public static boolean d(DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            LogUtil.j("DeviceCommonUtil", "deviceInfo is null");
            return false;
        }
        String deviceModel = deviceInfo.getDeviceModel();
        if (TextUtils.isEmpty(deviceModel)) {
            LogUtil.j("DeviceCommonUtil", "deviceModel is empty");
            return false;
        }
        List<String> listE = dmw.c().e();
        if (listE == null) {
            LogUtil.e("DeviceCommonUtil", "modelList is null");
            return false;
        }
        Iterator<String> it = listE.iterator();
        while (it.hasNext()) {
            if (deviceModel.contains(it.next())) {
                LogUtil.a("DeviceCommonUtil", "deviceModel is honor");
                return true;
            }
        }
        return false;
    }

    public static boolean b(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("DeviceCommonUtil", "fileName is empty");
            return false;
        }
        List<String> listE = dmw.c().e();
        if (listE == null) {
            LogUtil.e("DeviceCommonUtil", "modelList is null");
            return false;
        }
        Iterator<String> it = listE.iterator();
        while (it.hasNext()) {
            if (str.contains(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static int d(String str) {
        LogUtil.a("DeviceCommonUtil", "getClockStateByDevice encryptDeviceMac: ", str);
        ContentResolver contentResolver = BaseApplication.getContext().getContentResolver();
        Uri uri = Uri.parse(lsu.d);
        Cursor cursor = null;
        try {
            try {
                Cursor cursorQuery = contentResolver.query(uri, new String[]{"clockValue"}, "deviceMac = ?", new String[]{str}, null);
                if (cursorQuery == null) {
                    LogUtil.a("DeviceCommonUtil", "getClockStateByDevice:", -1);
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return -1;
                }
                if (!cursorQuery.moveToFirst()) {
                    LogUtil.a("DeviceCommonUtil", "getClockStateByDevice cursor.moveToFirst is null");
                    ContentValues contentValues = new ContentValues();
                    contentValues.put(MatterDataContans.KEY_MAC_ADDRESS, str);
                    contentValues.put("clockValue", "true");
                    contentResolver.insert(uri, contentValues);
                    LogUtil.a("DeviceCommonUtil", "getClockStateByDevice cursor.moveToFirst is null");
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return 1;
                }
                String string = cursorQuery.getString(cursorQuery.getColumnIndex("clockValue"));
                cursorQuery.close();
                LogUtil.a("DeviceCommonUtil", "getClockStateByDevice:", string);
                if (TextUtils.equals(string, "true")) {
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return 1;
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return 0;
            } catch (Exception unused) {
                LogUtil.e("DeviceCommonUtil", "getClockStateByDevice exception");
                if (0 != 0) {
                    cursor.close();
                }
                LogUtil.a("DeviceCommonUtil", "getClockStateByDevice end return");
                return -1;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    public static void b(String str, boolean z) {
        Cursor cursor = null;
        try {
            try {
                try {
                    try {
                        if (str == null) {
                            LogUtil.j("DeviceCommonUtil", "setClockStateValue deviceMac is null");
                            return;
                        }
                        LogUtil.a("DeviceCommonUtil", "setClockStateValue device: ", str, " clockState: ", Boolean.valueOf(z));
                        LogUtil.a("DeviceCommonUtil", "setClockStateValue encrytDeviceMac: ", str);
                        ContentResolver contentResolver = BaseApplication.getContext().getContentResolver();
                        Uri uri = Uri.parse(lsu.d);
                        String[] strArr = {str};
                        ContentValues contentValues = new ContentValues();
                        contentValues.put(MatterDataContans.KEY_MAC_ADDRESS, str);
                        if (z) {
                            contentValues.put("clockValue", "true");
                        } else {
                            contentValues.put("clockValue", "false");
                        }
                        Cursor cursorQuery = contentResolver.query(uri, null, "deviceMac = ?", strArr, null);
                        if (cursorQuery == null) {
                            LogUtil.a("DeviceCommonUtil", "setClockStateValue cursor is null");
                            contentResolver.insert(uri, contentValues);
                        } else if (cursorQuery.moveToFirst()) {
                            LogUtil.a("DeviceCommonUtil", "setClockStateValue is  query data, update");
                            LogUtil.a("DeviceCommonUtil", "setClockStateValue result: ", Integer.valueOf(contentResolver.update(uri, contentValues, "deviceMac = ?", strArr)));
                        } else {
                            LogUtil.a("DeviceCommonUtil", "setClockStateValue is not query data, insert ");
                            contentResolver.insert(uri, contentValues);
                        }
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                    } catch (Exception e) {
                        LogUtil.e("DeviceCommonUtil", "Exception: ", e.getMessage());
                        if (0 != 0) {
                            cursor.close();
                        }
                    }
                } catch (SQLiteException e2) {
                    LogUtil.a("DeviceCommonUtil", "SQLiteException:", e2.getMessage());
                    if (0 == 0) {
                        return;
                    }
                    cursor.close();
                }
            } catch (IllegalArgumentException e3) {
                LogUtil.e("DeviceCommonUtil", "IllegalArgumentException: ", e3.getMessage());
                if (0 != 0) {
                    cursor.close();
                }
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    public static boolean b() {
        c();
        boolean zEquals = false;
        try {
            Cursor cursorQuery = BaseApplication.getContext().getContentResolver().query(Uri.parse(lsu.e), null, null, null, null);
            try {
                LogUtil.a("DeviceCommonUtil", lsu.a("MidwareAuthority", null, null, null, null));
                if (cursorQuery == null || cursorQuery.getCount() == 0) {
                    LogUtil.j("DeviceCommonUtil", "isMidWareAuthority cursor is null");
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                } else {
                    if (cursorQuery.moveToFirst()) {
                        Integer numA = lsu.a("value", cursorQuery, "DeviceCommonUtil");
                        if (numA == null) {
                            LogUtil.j("DeviceCommonUtil", "isMidWareAuthority columnIndex is null");
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                        } else {
                            zEquals = TextUtils.equals(cursorQuery.getString(numA.intValue()), "true");
                        }
                    }
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    LogUtil.a("DeviceCommonUtil", "isMidwareAuthority result: ", Boolean.valueOf(zEquals));
                    return zEquals;
                }
                return false;
            } catch (Throwable th) {
                if (cursorQuery != null) {
                    try {
                        cursorQuery.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (Exception e) {
            LogUtil.e("DeviceCommonUtil", "isMidWareAuthority exception: ", LogAnonymous.b(e));
        }
    }

    private static void c() {
        LogUtil.a("DeviceCommonUtil", "checkMidWare");
        if (e() == -1 && a()) {
            b((Boolean) true);
        }
    }

    public static void b(Boolean bool) {
        try {
            if (bool == null) {
                LogUtil.j("DeviceCommonUtil", "setMidWareValue null");
                return;
            }
            LogUtil.a("DeviceCommonUtil", "enter setMidWareValue :", bool);
            ContentResolver contentResolver = BaseApplication.getContext().getContentResolver();
            Uri uri = Uri.parse(lsu.e);
            ContentValues contentValues = new ContentValues();
            if (bool.booleanValue()) {
                contentValues.put("value", "true");
            } else {
                contentValues.put("value", "false");
            }
            LogUtil.a("DeviceCommonUtil", "setMidWareValue result: ", Integer.valueOf(contentResolver.update(uri, contentValues, null, null)));
        } catch (SQLiteException e) {
            LogUtil.a("DeviceCommonUtil", "SQLiteException:", e.getMessage());
        } catch (IllegalArgumentException e2) {
            LogUtil.e("DeviceCommonUtil", "IllegalArgumentException: ", e2.getMessage());
        }
    }

    public static int e() {
        String[] strArr = {"value"};
        String[] strArr2 = {"is_Forbidden"};
        try {
            Cursor cursorQuery = BaseApplication.getContext().getContentResolver().query(Uri.parse(lsu.h), strArr, "name=?", strArr2, null);
            try {
                LogUtil.a("DeviceCommonUtil", lsu.a("NotificationFlags", strArr, "name=?", strArr2, null));
                if (cursorQuery == null || cursorQuery.getCount() == 0) {
                    LogUtil.j("DeviceCommonUtil", "isForbidden cursor is null");
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                } else {
                    if (!cursorQuery.moveToFirst()) {
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        LogUtil.a("DeviceCommonUtil", "USE_SYNERGY: DO_NOT_INIT,isForbidden: ", -1);
                        return -1;
                    }
                    Integer numA = lsu.a("value", cursorQuery, "DeviceCommonUtil");
                    if (numA == null) {
                        LogUtil.j("DeviceCommonUtil", "isForbidden columnIndex is null");
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                    } else {
                        int i = cursorQuery.getInt(numA.intValue());
                        LogUtil.a("DeviceCommonUtil", "USE_SYNERGY: ", Boolean.valueOf(i == 1), ",isForbidden: ", Integer.valueOf(i));
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        return i;
                    }
                }
                return -1;
            } catch (Throwable th) {
                if (cursorQuery != null) {
                    try {
                        cursorQuery.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (Exception e) {
            LogUtil.e("DeviceCommonUtil", "isForbidden exception: ", LogAnonymous.b(e));
        }
    }

    public static boolean a() {
        PackageInfo packageInfo;
        PackageManager packageManager = BaseApplication.getContext().getPackageManager();
        try {
            if (MagicBuild.f36615a) {
                packageInfo = packageManager.getPackageInfo("com.hihonor.synergy", 128);
            } else {
                packageInfo = packageManager.getPackageInfo("com.huawei.synergy", 128);
            }
            if (packageInfo == null) {
                LogUtil.j("DeviceCommonUtil", "isMiddleWearSupportHealth packageInfo is null");
                return false;
            }
            String str = packageInfo.versionName;
            LogUtil.a("DeviceCommonUtil", "isMiddleWearSupportHealth version:", str);
            return (str == null || "1.0".equals(str)) ? false : true;
        } catch (PackageManager.NameNotFoundException unused) {
            LogUtil.e("DeviceCommonUtil", "isMiddleWearSupportHealth not exist");
            return false;
        } catch (Exception e) {
            LogUtil.e("DeviceCommonUtil", "checkMiddleWearSupportHealth RuntimeException", ExceptionUtils.c(e));
            return false;
        }
    }

    public static void e(DeviceInfo deviceInfo) {
        LogUtil.a("DeviceCommonUtil", "mProductType", Integer.valueOf(deviceInfo.getProductType()));
        if (deviceInfo.getProductType() == 34) {
            if ("010404".equals(deviceInfo.getManufacture())) {
                deviceInfo.setHiLinkDeviceId("005W");
            } else if ("010303".equals(deviceInfo.getManufacture())) {
                if (deviceInfo.getDeviceModel() == null) {
                    ReleaseLogUtil.e("R_DeviceCommonUtil", "HUAWEI WATCH GT 2 Manufacture getDeviceModel is empty");
                    return;
                } else if (deviceInfo.getDeviceModel().toUpperCase(Locale.ENGLISH).contains("HECTOR")) {
                    deviceInfo.setHiLinkDeviceId("M003");
                } else {
                    deviceInfo.setHiLinkDeviceId("005X");
                }
            }
            LogUtil.d("DeviceCommonUtil", "supplementsHiLinkDeviceId deviceInfo obtain :", deviceInfo.getHiLinkDeviceId());
        }
        LogUtil.d("DeviceCommonUtil", deviceInfo.getDeviceUdid(), " mHiLinkDeviceId not match ");
    }
}
