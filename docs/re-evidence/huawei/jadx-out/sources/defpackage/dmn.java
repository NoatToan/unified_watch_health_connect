package defpackage;

import android.content.ContentValues;
import android.content.Intent;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.huawei.featureuserprofile.route.hwgpxmodel.Wpt;
import com.huawei.health.device.open.BleMeasureController;
import com.huawei.health.device.open.MeasureController;
import com.huawei.health.ecologydevice.manager.ResourceManager;
import com.huawei.health.ecologydevice.open.HdpMeasureController;
import com.huawei.hihealth.HiDeviceInfo;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.device.open.HealthDevice;
import com.huawei.hihealth.device.open.MeasureKit;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.db.bean.EventMonitorRecord;
import com.huawei.pluginhealthzone.interactors.HealthZonePushReceiver;
import health.compact.a.CommonUtil;
import health.compact.a.LocalBroadcast;
import java.util.ArrayList;
import java.util.Date;

/* JADX INFO: loaded from: classes7.dex */
public class dmn {
    private static dmn d;
    private static final Object e = new Object();

    private dmn() {
    }

    public static dmn c() {
        dmn dmnVar;
        synchronized (e) {
            if (d == null) {
                LogUtil.j("DeviceManagerHelper", "Enter getInstance");
                d = new dmn();
            }
            dmnVar = d;
        }
        return dmnVar;
    }

    public boolean e(String str, String str2, HealthDevice healthDevice) {
        String uniqueId = healthDevice.getUniqueId();
        MeasureKit measureKitB = dnf.e().b(str2);
        elh elhVarD = ResourceManager.c().d(str);
        boolean z = elhVarD != null && "10".equals(elhVarD.r());
        if (measureKitB != null && uniqueId != null && uniqueId.trim().length() > 0) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("productId", str);
            contentValues.put("name", healthDevice.getDeviceName());
            contentValues.put("uniqueId", uniqueId);
            contentValues.put(Wpt.MODE, HealthZonePushReceiver.PRESSURE_NOTIFY);
            contentValues.put("kind", measureKitB.getHealthDataKind().name());
            contentValues.put("kitUuid", str2);
            contentValues.put(TtmlNode.TEXT_EMPHASIS_AUTO, Integer.valueOf((measureKitB.getBackgroundController() == null || z) ? 0 : 1));
            contentValues.put(EventMonitorRecord.ADD_TIME, Long.valueOf(new Date().getTime()));
            long jB = b(contentValues);
            a(str, healthDevice);
            if (!enq.d().c() && jB != -1) {
                if (measureKitB.getBackgroundController() != null && !z) {
                    LogUtil.d("DeviceManagerHelper", "saveDeviceInfo auto test background measure");
                    Intent intent = new Intent("com.huawei.health.action.DEVICE_CHANGED");
                    intent.setPackage(dxw.d().getPackageName());
                    intent.putExtra("operation", 1);
                    intent.putExtra("uniqueId", uniqueId);
                    intent.putExtra("productId", str);
                    intent.putExtra(Wpt.MODE, 32);
                    intent.putExtra("kind", measureKitB.getHealthDataKind().name());
                    intent.putExtra("name", healthDevice.getDeviceName());
                    LogUtil.a("DeviceManagerHelper", "saveDeviceInfo deviceName = ", healthDevice.getDeviceName());
                    dxw.d().sendBroadcast(intent, LocalBroadcast.f36595c);
                }
                return true;
            }
        }
        return false;
    }

    public int b(com.huawei.health.device.open.MeasureKit measureKit) {
        MeasureController backgroundController = measureKit.getBackgroundController();
        if (backgroundController == null) {
            backgroundController = measureKit.getMeasureController();
        }
        if (backgroundController == null) {
            return 0;
        }
        if (backgroundController instanceof BleMeasureController) {
            return 1;
        }
        return backgroundController instanceof HdpMeasureController ? 2 : 4;
    }

    private long b(ContentValues contentValues) throws Throwable {
        SQLiteDatabase sQLiteDatabaseOpenOrCreateDatabase;
        SQLiteDatabase sQLiteDatabase = null;
        try {
            try {
                sQLiteDatabaseOpenOrCreateDatabase = dxw.d().openOrCreateDatabase("device.db", 0, null);
                try {
                    sQLiteDatabaseOpenOrCreateDatabase.execSQL("create table if not exists device (productId VARCHAR(40) UNIQUE not null, name VARCHAR(64) not null, uniqueId VARCHAR(32) not null, mode VARCHAR(16) not null,kind VARCHAR(16) not null, kitUuid VARCHAR(40) not null,auto integer not null, addTime integer not null)");
                    long jInsert = sQLiteDatabaseOpenOrCreateDatabase.insert("device", null, contentValues);
                    if (sQLiteDatabaseOpenOrCreateDatabase != null) {
                        sQLiteDatabaseOpenOrCreateDatabase.close();
                    }
                    return jInsert;
                } catch (SQLException unused) {
                    sQLiteDatabase = sQLiteDatabaseOpenOrCreateDatabase;
                    LogUtil.d("DeviceManagerHelper", "getRowId SQLException!");
                    if (sQLiteDatabase == null) {
                        return 0L;
                    }
                    sQLiteDatabase.close();
                    return 0L;
                } catch (Exception unused2) {
                    sQLiteDatabase = sQLiteDatabaseOpenOrCreateDatabase;
                    LogUtil.e("DeviceManagerHelper", "getRowId Exception!");
                    if (sQLiteDatabase == null) {
                        return 0L;
                    }
                    sQLiteDatabase.close();
                    return 0L;
                } catch (Throwable th) {
                    th = th;
                    if (sQLiteDatabaseOpenOrCreateDatabase != null) {
                        sQLiteDatabaseOpenOrCreateDatabase.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                sQLiteDatabaseOpenOrCreateDatabase = null;
            }
        } catch (SQLException unused3) {
        } catch (Exception unused4) {
        }
    }

    public HiDeviceInfo a(String str, String str2, com.huawei.health.device.model.HealthDevice healthDevice) {
        HiDeviceInfo hiDeviceInfo = new HiDeviceInfo(1);
        if (!TextUtils.isEmpty(str2) && dxm.y(str)) {
            hiDeviceInfo.setDeviceUniqueCode(str2);
        } else {
            hiDeviceInfo.setDeviceUniqueCode(healthDevice.getUniqueId());
        }
        hiDeviceInfo.setDeviceName(healthDevice.getDeviceName());
        return hiDeviceInfo;
    }

    private void a(String str, HealthDevice healthDevice) {
        LogUtil.a("DeviceManagerHelper", "registerDeviceInfo param is open.HealthDevice");
        HiDeviceInfo hiDeviceInfo = new HiDeviceInfo(1);
        hiDeviceInfo.setDeviceUniqueCode(healthDevice.getUniqueId());
        hiDeviceInfo.setDeviceName(healthDevice.getDeviceName());
        elh elhVarD = ResourceManager.c().d(str);
        if (elhVarD != null) {
            if (elhVarD.h() == null || elhVarD.h().trim().isEmpty()) {
                hiDeviceInfo.setDeviceType(1);
                LogUtil.j("DeviceManagerHelper", "registerDeviceInfo type 1 deviceName is ", healthDevice.getDeviceName());
            } else {
                try {
                    hiDeviceInfo.setDeviceType(CommonUtil.j(elhVarD.h()));
                    LogUtil.d("DeviceManagerHelper", "registerDeviceInfo deviceId is ", elhVarD.h(), " productId is ", str);
                } catch (IllegalArgumentException unused) {
                    LogUtil.e("DeviceManagerHelper", "registerDeviceInfo set error, about open device.");
                    return;
                }
            }
        }
        String strB = era.b(str);
        hiDeviceInfo.setProdId(strB);
        LogUtil.a("DeviceManagerHelper", "registerDeviceInfo prodId is：", strB);
        ArrayList arrayList = new ArrayList();
        arrayList.add(0);
        HiHealthManager.d(dxw.d()).registerDataClient(hiDeviceInfo, arrayList, null);
    }
}
