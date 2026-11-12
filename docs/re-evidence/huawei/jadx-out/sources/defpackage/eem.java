package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.datatypes.HealthSupportModel;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.DbManager;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.Utils;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class eem {
    /* JADX WARN: Code duplicated, block: B:10:0x003d  */
    /* JADX WARN: Code duplicated, block: B:13:0x004e  */
    /* JADX WARN: Code duplicated, block: B:14:0x0059  */
    public static HealthSupportModel c() {
        HealthSupportModel healthSupportModel;
        boolean zO;
        Gson gson = new Gson();
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10024), "wear_join_supported_device");
        if (!TextUtils.isEmpty(strE)) {
            try {
                healthSupportModel = (HealthSupportModel) gson.fromJson(strE, HealthSupportModel.class);
            } catch (JsonSyntaxException unused) {
                LogUtil.e("CompatibilityUtil", "JsonSyntaxException.");
                healthSupportModel = null;
            }
            if (healthSupportModel == null) {
                healthSupportModel = new HealthSupportModel();
            }
            healthSupportModel.setSupportNyx(lrp.h);
            zO = Utils.o();
            if (zO) {
                healthSupportModel.setSupportR1(false);
                healthSupportModel.setSupportLeo(true);
                healthSupportModel.setSupportPro(true);
            } else {
                healthSupportModel.setSupportR1(lrp.f);
                LogUtil.a("CompatibilityUtil", "beta version support leo.");
                healthSupportModel.setSupportLeo(true);
                healthSupportModel.setSupportPro(true);
            }
            LogUtil.a("CompatibilityUtil", "getHealthSupportModel:", healthSupportModel.toString(), "isOversea:", Boolean.valueOf(zO));
            return healthSupportModel;
        }
        LogUtil.j("CompatibilityUtil", "json is empty.");
        healthSupportModel = null;
        if (healthSupportModel == null) {
            healthSupportModel = new HealthSupportModel();
        }
        healthSupportModel.setSupportNyx(lrp.h);
        zO = Utils.o();
        if (zO) {
            healthSupportModel.setSupportR1(false);
            healthSupportModel.setSupportLeo(true);
            healthSupportModel.setSupportPro(true);
        } else {
            healthSupportModel.setSupportR1(lrp.f);
            LogUtil.a("CompatibilityUtil", "beta version support leo.");
            healthSupportModel.setSupportLeo(true);
            healthSupportModel.setSupportPro(true);
        }
        LogUtil.a("CompatibilityUtil", "getHealthSupportModel:", healthSupportModel.toString(), "isOversea:", Boolean.valueOf(zO));
        return healthSupportModel;
    }

    public static void a(List<DeviceInfo> list, String str) {
        LogUtil.a("CompatibilityUtil", "Enter refreshDeviceSizeForWear tag:", str);
        int i = 0;
        if (list != null) {
            Iterator<DeviceInfo> it = list.iterator();
            while (it.hasNext()) {
                if (it.next().getProductType() != 16) {
                    i++;
                }
            }
            LogUtil.a("CompatibilityUtil", "deviceInfoListlist:", Integer.valueOf(list.size()), "number:", Integer.valueOf(i));
        } else {
            LogUtil.j("CompatibilityUtil", "list is null, so number is 0.");
        }
        a(i);
    }

    private static void a(int i) {
        DbManager.a(BaseApplication.getContext(), String.valueOf(10024), "device_size_device_table", 2, "deviceSizeKey varchar primary key ,deviceSizeValue deviceSizeValue varchar");
        ContentValues contentValues = new ContentValues();
        contentValues.put("deviceSizeKey", "deviceSizeValue");
        contentValues.put("deviceSizeValue", String.valueOf(i));
        if (b()) {
            DbManager.d dVar = new DbManager.d();
            dVar.b(BaseApplication.getContext());
            dVar.c(String.valueOf(10024));
            dVar.b("device_size_device_table");
            dVar.e(2);
            DbManager.d(dVar, contentValues, (String) null);
            return;
        }
        DbManager.c(BaseApplication.getContext(), String.valueOf(10024), "device_size_device_table", 2, contentValues);
    }

    private static boolean b() {
        Cursor cursorC = DbManager.c(BaseApplication.getContext(), String.valueOf(10024), "device_size_device_table", 2, "deviceSizeKey='deviceSizeValue'");
        boolean z = false;
        if (cursorC != null) {
            z = cursorC.getCount() > 0;
            cursorC.close();
        }
        LogUtil.a("CompatibilityUtil", "isHaveKeyInfo:", Boolean.valueOf(z));
        return z;
    }

    public static String a() {
        LogUtil.a("CompatibilityUtil", "enter getHasDeviceDbInfo getHasDeviceDbInfo selection: ", "deviceSizeKey='deviceSizeValue'");
        Cursor cursor = null;
        try {
            try {
                Cursor cursorC = DbManager.c(BaseApplication.getContext(), String.valueOf(10024), "device_size_device_table", 2, "deviceSizeKey='deviceSizeValue'");
                if (cursorC == null) {
                    LogUtil.j("CompatibilityUtil", "Query Storage Data fail.");
                    if (cursorC != null && !cursorC.isClosed()) {
                        cursorC.close();
                    }
                    return "";
                }
                String string = cursorC.moveToNext() ? cursorC.getString(cursorC.getColumnIndex("deviceSizeValue")) : "";
                LogUtil.a("CompatibilityUtil", "content is ", string);
                if (cursorC != null && !cursorC.isClosed()) {
                    cursorC.close();
                }
                return string;
            } catch (Exception unused) {
                LogUtil.e("CompatibilityUtil", "Query Storage exception.");
                if (0 != 0 && !cursor.isClosed()) {
                    cursor.close();
                }
                return "";
            }
        } catch (Throwable th) {
            if (0 != 0 && !cursor.isClosed()) {
                cursor.close();
            }
            throw th;
        }
    }
}
