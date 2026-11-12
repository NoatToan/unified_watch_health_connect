package defpackage;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Debug;
import android.text.TextUtils;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.common.os.MemoryUtils;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import health.compact.a.LogUtil;
import health.compact.a.MagicBuild;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public class coy {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Map<String, cmc> f31234b = new ConcurrentHashMap(16);

    public static boolean d(DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            LogUtil.e("DeviceCommonUtil", "deviceInfo is null");
            return false;
        }
        String deviceModel = deviceInfo.getDeviceModel();
        if (TextUtils.isEmpty(deviceModel)) {
            LogUtil.e("DeviceCommonUtil", "deviceModel is empty");
            return false;
        }
        List<String> listE = dmw.c().e();
        if (listE == null) {
            LogUtil.d("DeviceCommonUtil", "modelList is null");
            return false;
        }
        Iterator<String> it = listE.iterator();
        while (it.hasNext()) {
            if (deviceModel.contains(it.next())) {
                LogUtil.b("DeviceCommonUtil", "deviceModel is honor");
                return true;
            }
        }
        return false;
    }

    public static boolean e() {
        j();
        boolean zEquals = false;
        try {
            Cursor cursorQuery = BaseApplication.b().getContentResolver().query(Uri.parse(lsu.e), null, null, null, null);
            try {
                LogUtil.b("DeviceCommonUtil", lsu.a("MidwareAuthority", null, null, null, null));
                if (cursorQuery == null || cursorQuery.getCount() == 0) {
                    LogUtil.e("DeviceCommonUtil", "isMidWareAuthority cursor is null");
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                } else {
                    if (cursorQuery.moveToFirst()) {
                        Integer numA = lsu.a("value", cursorQuery, "DeviceCommonUtil");
                        if (numA == null) {
                            LogUtil.e("DeviceCommonUtil", "isMidWareAuthority columnIndex is null");
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
                    LogUtil.b("DeviceCommonUtil", "isMidwareAuthority result: ", Boolean.valueOf(zEquals));
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
            LogUtil.d("DeviceCommonUtil", "isMidWareAuthority exception: ", ExceptionUtils.c(e));
        }
    }

    private static void j() {
        LogUtil.b("DeviceCommonUtil", "checkMidWare");
        if (a() == -1 && d()) {
            b((Boolean) true);
        }
    }

    public static void b(Boolean bool) {
        try {
            if (bool == null) {
                LogUtil.e("DeviceCommonUtil", "setMidWareValue null");
                return;
            }
            LogUtil.b("DeviceCommonUtil", "enter setMidWareValue :", bool);
            ContentResolver contentResolver = BaseApplication.b().getContentResolver();
            Uri uri = Uri.parse(lsu.e);
            ContentValues contentValues = new ContentValues();
            if (bool.booleanValue()) {
                contentValues.put("value", "true");
            } else {
                contentValues.put("value", "false");
            }
            LogUtil.b("DeviceCommonUtil", "setMidWareValue result: ", Integer.valueOf(contentResolver.update(uri, contentValues, null, null)));
        } catch (SQLiteException e) {
            LogUtil.b("DeviceCommonUtil", "SQLiteException:", e.getMessage());
        } catch (IllegalArgumentException e2) {
            LogUtil.d("DeviceCommonUtil", "setMidWareValue IllegalArgumentException", ExceptionUtils.c(e2));
        }
    }

    public static int a() {
        String[] strArr = {"value"};
        String[] strArr2 = {"is_Forbidden"};
        try {
            Cursor cursorQuery = BaseApplication.b().getContentResolver().query(Uri.parse(lsu.h), strArr, "name=?", strArr2, null);
            try {
                LogUtil.b("DeviceCommonUtil", lsu.a("NotificationFlags", strArr, "name=?", strArr2, null));
                if (cursorQuery == null || cursorQuery.getCount() == 0) {
                    LogUtil.e("DeviceCommonUtil", "isForbidden cursor is null");
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                } else {
                    if (!cursorQuery.moveToFirst()) {
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        LogUtil.b("DeviceCommonUtil", "USE_SYNERGY: DO_NOT_INIT,isForbidden: ", -1);
                        return -1;
                    }
                    Integer numA = lsu.a("value", cursorQuery, "DeviceCommonUtil");
                    if (numA == null) {
                        LogUtil.e("DeviceCommonUtil", "isForbidden columnIndex is null");
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                    } else {
                        int i = cursorQuery.getInt(numA.intValue());
                        LogUtil.b("DeviceCommonUtil", "USE_SYNERGY: ", Boolean.valueOf(i == 1), ",isForbidden: ", Integer.valueOf(i));
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
            LogUtil.d("DeviceCommonUtil", "isForbidden exception: ", ExceptionUtils.c(e));
        }
    }

    public static boolean d() {
        PackageInfo packageInfo;
        PackageManager packageManager = BaseApplication.b().getPackageManager();
        try {
            if (MagicBuild.f36615a) {
                packageInfo = packageManager.getPackageInfo("com.hihonor.synergy", 128);
            } else {
                packageInfo = packageManager.getPackageInfo("com.huawei.synergy", 128);
            }
            if (packageInfo == null) {
                LogUtil.e("DeviceCommonUtil", "isMiddleWearSupportHealth packageInfo is null");
                return false;
            }
            String str = packageInfo.versionName;
            LogUtil.b("DeviceCommonUtil", "isMiddleWearSupportHealth version:", str);
            return (str == null || "1.0".equals(str)) ? false : true;
        } catch (PackageManager.NameNotFoundException unused) {
            LogUtil.d("DeviceCommonUtil", "isMiddleWearSupportHealth not exist");
            return false;
        }
    }

    public static boolean c() {
        try {
            BaseApplication.b().getPackageManager().getApplicationInfo("com.huawei.iconnect", 0);
            LogUtil.b("DeviceCommonUtil", "iconnect pkg exist.");
            PackageInfo packageInfo = BaseApplication.b().getPackageManager().getPackageInfo("com.huawei.iconnect", 0);
            if (packageInfo != null) {
                int i = packageInfo.versionCode;
                LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "DeviceCommonUtil", "iconnect code: ", Integer.valueOf(i));
                if (i > 1) {
                    return true;
                }
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            LogUtil.d("DeviceCommonUtil", "iconnect pkg do not exist.");
            return false;
        }
    }

    public static String b() {
        return MemoryUtils.e(false) + MemoryUtils.a((Debug.MemoryInfo) null, false);
    }

    public static void e(String str, cmc cmcVar) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        LogUtil.b("DeviceCommonUtil", "deviceIdentify: ", cpl.e(str), " bleDeviceRssi:", Integer.valueOf(cmcVar.e()));
        f31234b.put(str, cmcVar);
    }

    public static cmc b(String str) {
        if (TextUtils.isEmpty(str)) {
            return new cmc();
        }
        if (f31234b.get(str) != null) {
            return f31234b.get(str);
        }
        return new cmc();
    }

    public static void d(String str) {
        if (TextUtils.isEmpty(str) || f31234b.get(str) == null) {
            return;
        }
        LogUtil.b("DeviceCommonUtil", "removeBleDeviceStatus success, deviceIdentify: ", cpl.e(str));
        f31234b.remove(str);
    }
}
