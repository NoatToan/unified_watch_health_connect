package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.huawei.featureuserprofile.route.hwgpxmodel.Wpt;
import com.huawei.haf.common.utils.AppInfoUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hihealth.dictionary.constants.ProductMap;
import com.huawei.hihealth.dictionary.constants.ProductMapInfo;
import com.huawei.hihealth.dictionary.utils.ProductMapParseUtil;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.datatypes.HeartDeviceInfo;
import com.huawei.openalliance.ad.db.bean.EventMonitorRecord;
import health.compact.a.KeyValDbManager;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import health.compact.a.util.LogUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class ljm {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map<String, Integer> f40350b = new HashMap<String, Integer>(10) { // from class: ljm.1
        {
            put("e4b0b1d5-2003-4d88-8b5f-c4f64542040b", 82);
            put("a8ba095d-4123-43c4-a30a-0240011c58de", 84);
            put("8358eb90-b40d-11e9-a2a3-2a2ae2dbcce4", 94);
            put("b29df4e3-b1f7-4e40-960d-4cfb63ccca05", 385);
            put("25c6df38-ca23-11e9-a32f-2a2ae2dbcce4", 106);
            put("e835d102-af95-48a6-ae13-2983bc06f5c0", 140);
        }
    };

    public static List<HeartDeviceInfo> c(final Context context) {
        ArrayList arrayList = new ArrayList(10);
        if (context == null) {
            LogUtil.d("HealthDeviceUtils", "buildDeviceInfo device is null");
            return arrayList;
        }
        if (!ProductMapParseUtil.a(context)) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: ljm.4
                @Override // java.lang.Runnable
                public void run() {
                    lql.b(context, 2);
                }
            });
        }
        for (ProductMapInfo productMapInfo : ProductMap.e()) {
            if (!TextUtils.isEmpty(productMapInfo.f())) {
                f40350b.put(productMapInfo.f(), Integer.valueOf(productMapInfo.c()));
            }
        }
        for (Map.Entry<String, DeviceInfo> entry : d(context).entrySet()) {
            String productId = entry.getValue().getProductId();
            Map<String, Integer> map = f40350b;
            if (map.containsKey(productId)) {
                DeviceInfo value = entry.getValue();
                HeartDeviceInfo heartDeviceInfo = new HeartDeviceInfo();
                heartDeviceInfo.setDeviceName(KeyValDbManager.d(BaseApplication.getContext()).c(nio.e(value.getDeviceIdentify())));
                heartDeviceInfo.setmDeviceId(value.getmDeviceId());
                heartDeviceInfo.setProductType(map.get(productId).intValue());
                heartDeviceInfo.setUuid(nio.e(value.getDeviceIdentify()));
                heartDeviceInfo.setDeviceConnectState(-2);
                heartDeviceInfo.setSoftVersion("");
                heartDeviceInfo.setDeviceCapability("");
                arrayList.add(heartDeviceInfo);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0109  */
    /* JADX WARN: Code duplicated, block: B:47:0x010e  */
    private static Map<String, DeviceInfo> d(Context context) throws Throwable {
        Cursor cursor;
        SQLiteDatabase sQLiteDatabase;
        int i;
        Cursor cursor2;
        SQLiteDatabase sQLiteDatabase2;
        Cursor cursorQuery;
        SQLiteDatabase sQLiteDatabase3;
        HashMap map = new HashMap(16);
        try {
            if (context == null) {
                com.huawei.hwlogsmodel.LogUtil.a("HealthDeviceUtils", "getLocalDeviceInfo mContext is null");
                return map;
            }
            SQLiteDatabase sQLiteDatabaseOpenOrCreateDatabase = context.getApplicationContext().openOrCreateDatabase("device.db", 0, null);
            try {
                cursorQuery = sQLiteDatabaseOpenOrCreateDatabase.query("device", new String[]{"productId", "uniqueId", Wpt.MODE, "kind", "name", "mDeviceId", EventMonitorRecord.ADD_TIME}, null, null, null, null, null, null);
                while (cursorQuery.moveToNext()) {
                    try {
                        String string = cursorQuery.getString(4);
                        if (cursorQuery.getLong(6) <= 0) {
                            ReleaseLogUtil.d("HiH_HealthDeviceUtils", "device: ", string, " addTime less than or equal to zero");
                        } else {
                            DeviceInfo deviceInfo = new DeviceInfo();
                            deviceInfo.setDeviceName(string);
                            deviceInfo.setProductId(cursorQuery.getString(0));
                            deviceInfo.setDeviceIdentify(cursorQuery.getString(1));
                            deviceInfo.setSoftVersion("");
                            deviceInfo.setDeviceConnectState(-2);
                            if (cursorQuery.getString(5) == null) {
                                deviceInfo.setmDeviceId("");
                            } else {
                                deviceInfo.setmDeviceId(cursorQuery.getString(5));
                            }
                            map.put(cursorQuery.getString(1), deviceInfo);
                        }
                    } catch (SQLiteException unused) {
                        cursor2 = cursorQuery;
                        sQLiteDatabase2 = sQLiteDatabaseOpenOrCreateDatabase;
                        i = 1;
                        try {
                            Object[] objArr = new Object[i];
                            objArr[0] = "loadDeviceList SQLiteException";
                            com.huawei.hwlogsmodel.LogUtil.j("HealthDeviceUtils", objArr);
                            if (cursor2 != null) {
                                cursor2.close();
                            }
                            if (sQLiteDatabase2 != null) {
                                sQLiteDatabase2.close();
                            }
                        } catch (Throwable th) {
                            th = th;
                            cursorQuery = cursor2;
                            sQLiteDatabase3 = sQLiteDatabase2;
                            sQLiteDatabase = sQLiteDatabase3;
                            cursor = cursorQuery;
                            if (cursor != null) {
                                cursor.close();
                            }
                            if (sQLiteDatabase != null) {
                                sQLiteDatabase.close();
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        sQLiteDatabase3 = sQLiteDatabaseOpenOrCreateDatabase;
                        sQLiteDatabase = sQLiteDatabase3;
                        cursor = cursorQuery;
                        if (cursor != null) {
                            cursor.close();
                        }
                        if (sQLiteDatabase != null) {
                            sQLiteDatabase.close();
                        }
                        throw th;
                    }
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                if (sQLiteDatabaseOpenOrCreateDatabase != null) {
                    sQLiteDatabaseOpenOrCreateDatabase.close();
                    return map;
                }
            } catch (SQLiteException unused2) {
                cursor2 = null;
            } catch (Throwable th3) {
                th = th3;
                sQLiteDatabase3 = sQLiteDatabaseOpenOrCreateDatabase;
                cursorQuery = null;
            }
            return map;
        } catch (SQLiteException unused3) {
            i = 1;
            cursor2 = null;
            sQLiteDatabase2 = null;
        } catch (Throwable th4) {
            th = th4;
            cursor = null;
            sQLiteDatabase = null;
            if (cursor != null) {
                cursor.close();
            }
            if (sQLiteDatabase != null) {
                sQLiteDatabase.close();
            }
            throw th;
        }
    }

    public static void c() {
        ProductMapParseUtil.a(BaseApplication.getContext());
        if (Utils.o()) {
            return;
        }
        int iC = lkb.c(BaseApplication.getContext(), "app_version_code", 0, 0);
        lkb.b(BaseApplication.getContext(), "app_version_code", AppInfoUtils.d(), 0);
        if (iC != AppInfoUtils.d()) {
            ReleaseLogUtil.d("HiH_HealthDeviceUtils", "app upgrade station can't update,the lastVersion:", Integer.valueOf(iC));
        } else {
            ThreadPoolManager.c().execute(new Runnable() { // from class: ljr
                @Override // java.lang.Runnable
                public final void run() {
                    ljm.e();
                }
            });
        }
    }

    static /* synthetic */ void e() {
        if (lql.a(BaseApplication.getContext())) {
            lql.b(BaseApplication.getContext(), 2);
        }
    }
}
