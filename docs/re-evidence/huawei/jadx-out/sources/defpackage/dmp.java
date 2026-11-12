package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.huawei.devicesdk.callback.DeviceScanCallback;
import com.huawei.devicesdk.entity.ScanMode;
import com.huawei.featureuserprofile.route.hwgpxmodel.Wpt;
import com.huawei.haf.common.security.SecurityConstant;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.device.connectivity.comm.MeasurableDevice;
import com.huawei.health.device.model.DeviceExtra;
import com.huawei.health.device.open.MeasureKit;
import com.huawei.health.devicemgr.api.constant.ExecuteMode;
import com.huawei.health.ecologydevice.manager.ResourceManager;
import com.huawei.health.knit.ui.KnitFragment;
import com.huawei.hihealth.HiDeviceInfo;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.device.open.DeviceProvider;
import com.huawei.hihealth.device.open.HealthDevice;
import com.huawei.hihealth.device.open.IDeviceEventHandler;
import com.huawei.hihealth.dictionary.utils.ProductMapParseUtil;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hms.ads.dynamic.a;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.db.bean.EventMonitorRecord;
import com.huawei.pluginhealthzone.interactors.HealthZonePushReceiver;
import health.compact.a.CommonUtil;
import health.compact.a.LocalBroadcast;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class dmp {
    private static dmp d;
    private static final String e = SecurityConstant.f5920a;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f32013a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private DeviceProvider f32014b;

    private boolean c(int i) {
        return i == 2 || i == 1;
    }

    private dmp() {
    }

    public static dmp d() {
        dmp dmpVar;
        synchronized (dmp.class) {
            if (d == null) {
                d = new dmp();
            }
            dmpVar = d;
        }
        return dmpVar;
    }

    public void a(String str, String str2) {
        MeasurableDevice measurableDeviceB = d().b(str);
        if (measurableDeviceB == null) {
            return;
        }
        LogUtil.a("DeviceManager", "sendBroadcastToBluetoothMonitor", " current device is ", measurableDeviceB.getDeviceName());
        MeasureKit measureKitA = dnf.e().a(measurableDeviceB.getMeasureKitUuid());
        if (measureKitA == null || measureKitA.getBackgroundController() == null || !measurableDeviceB.isAutoDevice()) {
            return;
        }
        LogUtil.a("DeviceManager", "sendBroadcastToBluetoothMonitor", " action ", str2);
        Intent intent = new Intent(str2);
        intent.setPackage(dxw.d().getPackageName());
        intent.putExtra("productId", str);
        dxw.d().sendBroadcast(intent, e);
    }

    public void e(String str, String str2, String str3) {
        MeasurableDevice measurableDeviceB = d().b(str2, false);
        if (measurableDeviceB == null) {
            return;
        }
        LogUtil.a("DeviceManager", "sendBroadcastToBluetoothMonitor device is ", measurableDeviceB.getDeviceName());
        MeasureKit measureKitA = dnf.e().a(measurableDeviceB.getMeasureKitUuid());
        if (measureKitA == null || measureKitA.getBackgroundController() == null || !measurableDeviceB.isAutoDevice()) {
            return;
        }
        LogUtil.a("DeviceManager", "sendBroadCastToBluetoothMonitor action ", str3);
        Intent intent = new Intent(str3);
        intent.setPackage(dxw.d().getPackageName());
        intent.putExtra("productId", str);
        intent.putExtra("uniqueId", str2);
        dxw.d().sendBroadcast(intent, e);
    }

    public void e() {
        LogUtil.a("DeviceManager", "enter deleteCloudFromDeviceDB");
        LogUtil.a("DeviceManager", "deleteCloudFromDeviceDB affectedRows:", Integer.valueOf(dmk.d().c("device", "addTime = ?", new String[]{"0"})));
    }

    public ArrayList<String> i() {
        return ecf.c();
    }

    public ArrayList<eby> b() {
        return ecf.a();
    }

    public String b(String str, String str2) {
        MeasurableDevice measurableDeviceB = b(str);
        if (measurableDeviceB == null) {
            LogUtil.j("DeviceManager", "scaleUpdateJump bondedDevice is null");
            return null;
        }
        if (measurableDeviceB instanceof eby) {
            eby ebyVar = (eby) measurableDeviceB;
            LogUtil.a("DeviceManager", "is device");
            if (TextUtils.isEmpty(str2)) {
                return ebyVar.getUniqueId();
            }
        }
        return str2;
    }

    public boolean e(String str, boolean z) {
        eby ebyVar;
        MeasurableDevice measurableDeviceC = c(str, z);
        if (measurableDeviceC instanceof eby) {
            LogUtil.a("DeviceManager", "is device");
            ebyVar = (eby) measurableDeviceC;
        } else {
            ebyVar = null;
        }
        return ebyVar != null;
    }

    public MeasurableDevice b(String str) {
        return c(str, false);
    }

    public MeasurableDevice c(String str, boolean z) {
        ArrayList<ContentValues> arrayListB = b("productId = ?", new String[]{str}, null, null, "addTime DESC", "1");
        if (arrayListB.size() == 0) {
            return null;
        }
        LogUtil.a("DeviceManager", "get bonded device by product id , device record num ", Integer.valueOf(arrayListB.size()));
        return c(arrayListB.get(arrayListB.size() - 1), z);
    }

    public ArrayList<MeasurableDevice> d(String str, boolean z) {
        ArrayList<ContentValues> arrayListB = b("productId = ?", new String[]{str}, null, null, null, null);
        LogUtil.a("DeviceManager", "get bonded devices by productId , device record num = ", Integer.valueOf(arrayListB.size()));
        ArrayList<MeasurableDevice> arrayList = new ArrayList<>();
        Iterator<ContentValues> it = arrayListB.iterator();
        while (it.hasNext()) {
            arrayList.add(c(it.next(), z));
        }
        return arrayList;
    }

    public MeasurableDevice c(String str, String str2) {
        ArrayList<ContentValues> arrayListB = b("productId = ?", new String[]{str}, null, null, "addTime DESC", "1");
        if (arrayListB.size() == 0) {
            return null;
        }
        LogUtil.a("DeviceManager", "get bonded device by product id , device record num ", Integer.valueOf(arrayListB.size()));
        ContentValues contentValuesB = b(arrayListB, str2);
        if (contentValuesB == null) {
            LogUtil.a("DeviceManager", "no this deviceName MeasurableDevice");
            return null;
        }
        return c(contentValuesB, false);
    }

    private ContentValues b(ArrayList<ContentValues> arrayList, String str) {
        for (ContentValues contentValues : arrayList) {
            if (TextUtils.equals(str, contentValues.getAsString("name"))) {
                return contentValues;
            }
        }
        return null;
    }

    private String f(String str, String str2) {
        return str + "#" + str2.substring(str2.length() - 3, str2.length());
    }

    private MeasurableDevice a(ContentValues contentValues) {
        if (contentValues == null) {
            LogUtil.j("DeviceManager", "createMeasureDevice device info is null");
            return null;
        }
        LogUtil.d("DeviceManager", "createMeasureDevice device info", contentValues.toString());
        if (contentValues.getAsInteger(Wpt.MODE) == null) {
            LogUtil.j("DeviceManager", "createMeasureDevice unknow device connect mode");
            return null;
        }
        try {
            Integer asInteger = contentValues.getAsInteger(Wpt.MODE);
            int iIntValue = asInteger.intValue();
            String asString = contentValues.getAsString("uniqueId");
            String asString2 = contentValues.getAsString("kitUuid");
            String asString3 = contentValues.getAsString("productId");
            if (iIntValue == 1) {
                return j(asString, asString2);
            }
            if (iIntValue == 2) {
                return dmu.a(BluetoothAdapter.getDefaultAdapter().getRemoteDevice(asString));
            }
            if (iIntValue == 4) {
                return new dmr();
            }
            if (iIntValue == 16) {
                return new dmt(contentValues.getAsString("name"), asString, 1);
            }
            if (iIntValue == 8) {
                return new eby(asString3);
            }
            if (!i(asString3)) {
                LogUtil.d("DeviceManager", "createMeasureDevice other connect mode = ", asInteger);
                return null;
            }
            return new dmv(contentValues.getAsString("name"), contentValues.getAsString("productId"), contentValues.getAsString("uniqueId"), contentValues.getAsString("sn"));
        } catch (SecurityException unused) {
            LogUtil.e("DeviceManager", "createBlueToothDevice securityException");
            return null;
        }
    }

    private MeasurableDevice j(String str, String str2) {
        MeasurableDevice measurableDeviceB;
        MeasurableDevice measurableDevice = null;
        try {
            BluetoothDevice remoteDevice = BluetoothAdapter.getDefaultAdapter().getRemoteDevice(str);
            if (str2 != null && str2.equals("6d783cfa-eec8-4a62-a6fa-b686fdf02d24")) {
                measurableDeviceB = dmy.e(remoteDevice);
            } else {
                measurableDeviceB = efx.b(remoteDevice);
            }
            measurableDevice = measurableDeviceB;
            if (measurableDevice != null) {
                LogUtil.d("DeviceManager", "createMeasureDevice device:", measurableDevice.getAddress(), "; deviceName:", measurableDevice.getDeviceName());
            }
            return measurableDevice;
        } catch (IllegalArgumentException unused) {
            LogUtil.e("DeviceManager", "can not create bluetooth device, illegal mac address");
            return measurableDevice;
        }
    }

    private MeasurableDevice c(MeasurableDevice measurableDevice, ContentValues contentValues) {
        try {
            String asString = contentValues.getAsString("uniqueId");
            LogUtil.a("DeviceManager", "convertWifiDeviceToBleDevice id:", dyg.b(asString), ", length:", Integer.valueOf(asString.length()));
            BluetoothDevice remoteDevice = BluetoothAdapter.getDefaultAdapter().getRemoteDevice(asString);
            if (remoteDevice == null) {
                return measurableDevice;
            }
            LogUtil.a("DeviceManager", "convertWifiDeviceToBleDevice bluetoothDevice id:", dyg.b(remoteDevice.getAddress()), ",length:", Integer.valueOf(remoteDevice.getAddress().length()));
            efx efxVarB = efx.b(remoteDevice);
            LogUtil.d("DeviceManager", "setDeviceOtherInfo bleDevice:", dyg.b(efxVarB.getAddress()), "; deviceName:", efxVarB.getDeviceName());
            efxVarB.setAutoDevice(measurableDevice.isAutoDevice());
            efxVarB.setDeviceName(measurableDevice.getDeviceName());
            efxVarB.setMeasureKitUuid(measurableDevice.getMeasureKitUuid());
            efxVarB.setKind(measurableDevice.getKind());
            efxVarB.setProductId(measurableDevice.getProductId());
            efxVarB.setSerialNumber(contentValues.getAsString("sn"));
            return efxVarB;
        } catch (IllegalArgumentException unused) {
            LogUtil.e("DeviceManager", "convertWifiDeviceToBleDevice illegal mac address");
            return measurableDevice;
        }
    }

    private void e(eby ebyVar, ContentValues contentValues) {
        eby ebyVarI = ecf.i(ebyVar.getSerialNumber());
        if (ebyVarI != null) {
            LogUtil.a("DeviceManager", "setDeviceOtherInfo mDeviceID", dyg.b(ebyVarI.a().c()));
            ebyVar.a(ebyVarI.d());
            ebyVar.a(ebyVarI.a());
        }
        ebyVar.d(contentValues.getAsString("uniqueId"));
    }

    public void b(String str, String str2, String str3) {
        HealthDevice healthDeviceE = d().e(str, str2);
        Intent intent = new Intent(str3);
        intent.setPackage(dxw.d().getPackageName());
        intent.putExtra("productId", str);
        intent.putExtra("uniqueId", str2);
        e(intent, healthDeviceE, "sendBroadcastToBluetoothMonitorUniversal", str, str3);
    }

    private void e(Intent intent, HealthDevice healthDevice, String str, String str2, String str3) {
        com.huawei.hihealth.device.open.MeasureKit measureKitB;
        if (healthDevice == null) {
            return;
        }
        LogUtil.a("DeviceManager", str, "DeviceManager current device is ", healthDevice.getDeviceName());
        dnf dnfVarE = dnf.e();
        LogUtil.a("DeviceManager", str, "DeviceManager kitUuid:", healthDevice.getUniqueId());
        elh elhVarD = ResourceManager.c().d(str2);
        if (elhVarD == null || (measureKitB = dnfVarE.b(elhVarD.q())) == null || measureKitB.getBackgroundController() == null || dxm.aa(str2)) {
            return;
        }
        LogUtil.a("DeviceManager", str, "DeviceManager sendBroadCastToBluetoothMonitor action ", str3);
        dxw.d().sendBroadcast(intent, e);
    }

    public HealthDevice a(String str) {
        ArrayList<ContentValues> arrayListB = b("productId = ?", new String[]{str}, null, null, "addTime DESC", "1");
        if (arrayListB.size() == 0) {
            return null;
        }
        ContentValues contentValues = arrayListB.get(arrayListB.size() - 1);
        String asString = contentValues.getAsString("name");
        String asString2 = contentValues.getAsString("uniqueId");
        if (TextUtils.isEmpty(contentValues.getAsString("kitUuid"))) {
            return null;
        }
        return h(asString, asString2);
    }

    public HealthDevice e(String str, String str2) {
        ArrayList<ContentValues> arrayListB = b("uniqueId = ?", new String[]{str2}, null, null, "addTime DESC", "1");
        if (arrayListB.size() == 0) {
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || str2.length() < 3) {
                return null;
            }
            return a(f(str, str2));
        }
        ContentValues contentValues = arrayListB.get(arrayListB.size() - 1);
        String asString = contentValues.getAsString("name");
        if (TextUtils.isEmpty(contentValues.getAsString("kitUuid"))) {
            return null;
        }
        return h(asString, str2);
    }

    private HealthDevice h(final String str, final String str2) {
        return new HealthDevice() { // from class: dmp.2
            @Override // com.huawei.hihealth.device.open.HealthDevice
            public boolean doCreatePair(IDeviceEventHandler iDeviceEventHandler) {
                return false;
            }

            @Override // com.huawei.hihealth.device.open.HealthDevice
            public boolean doRemovePair() {
                return false;
            }

            @Override // com.huawei.hihealth.device.open.HealthDevice
            public String getDeviceName() {
                return str;
            }

            @Override // com.huawei.hihealth.device.open.HealthDevice
            public String getAddress() {
                return str2;
            }

            @Override // com.huawei.hihealth.device.open.HealthDevice
            public String getUniqueId() {
                return str2;
            }
        };
    }

    public ArrayList<String> a(com.huawei.health.device.model.HealthDevice.HealthDeviceKind healthDeviceKind) {
        ArrayList<String> arrayList = new ArrayList<>(10);
        if (healthDeviceKind == null) {
            LogUtil.j("DeviceManager", "getBondedProducts device kind is null");
            return arrayList;
        }
        String strName = healthDeviceKind == com.huawei.health.device.model.HealthDevice.HealthDeviceKind.HDK_UNKNOWN ? null : healthDeviceKind.name();
        String[] strArr = strName == null ? null : new String[]{strName};
        Iterator<ContentValues> it = b(strArr != null ? "kind = ?" : null, strArr, null, null, EventMonitorRecord.ADD_TIME, null).iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getAsString("productId"));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0065  */
    /* JADX WARN: Multi-variable type inference failed */
    public static String d(String str) throws Throwable {
        RuntimeException e2;
        String str2;
        Throwable th;
        Cursor cursorD;
        String string = null;
        string = null;
        Cursor cursor = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            try {
                cursorD = dmk.d().d("device", new String[]{"productId"}, "uniqueId = ?", new String[]{str}, null, null, null, null);
                if (cursorD == 0) {
                    if (cursorD == 0) {
                        return "";
                    }
                    cursorD.close();
                    return "";
                }
                while (cursorD.moveToNext()) {
                    try {
                        string = cursorD.getString(0);
                    } catch (SQLiteException e3) {
                        e2 = e3;
                        String str3 = string;
                        cursor = cursorD;
                        str2 = str3;
                        LogUtil.e("DeviceManager", "getBondedProductIdByMac", e2.getMessage());
                        if (cursor != null) {
                            cursor.close();
                        }
                        string = str2;
                    } catch (IllegalArgumentException e4) {
                        e2 = e4;
                        String str4 = string;
                        cursor = cursorD;
                        str2 = str4;
                        LogUtil.e("DeviceManager", "getBondedProductIdByMac", e2.getMessage());
                        if (cursor != null) {
                            cursor.close();
                        }
                        string = str2;
                    } catch (Throwable th2) {
                        th = th2;
                        if (cursorD != 0) {
                            cursorD.close();
                        }
                        throw th;
                    }
                }
                if (cursorD != 0) {
                    cursorD.close();
                }
                if (string == null) {
                    LogUtil.j("DeviceManager", "getBondedProductIdByMac productId is null");
                }
                return string;
            } catch (Throwable th3) {
                th = th3;
                cursorD = string;
            }
        } catch (SQLiteException | IllegalArgumentException e5) {
            e2 = e5;
            str2 = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00b7 A[DONT_GENERATE, PHI: r6
      0x00b7: PHI (r6v3 android.database.Cursor) = (r6v0 android.database.Cursor), (r6v4 android.database.Cursor) binds: [B:32:0x00b5, B:26:0x00a0] A[DONT_GENERATE, DONT_INLINE]] */
    public ArrayList<String> b(com.huawei.health.device.model.HealthDevice.HealthDeviceKind healthDeviceKind) {
        String str;
        ArrayList<String> arrayList = new ArrayList<>(10);
        Cursor cursorD = null;
        try {
            dmk dmkVarD = dmk.d();
            String[] strArr = {"productId", "kitUuid"};
            if (healthDeviceKind == com.huawei.health.device.model.HealthDevice.HealthDeviceKind.HDK_UNKNOWN) {
                str = null;
            } else {
                str = "kind = '" + healthDeviceKind.name() + "'";
            }
            cursorD = dmkVarD.d("device", strArr, str, null, null, null, EventMonitorRecord.ADD_TIME, null);
            if (cursorD != null) {
                while (cursorD.moveToNext()) {
                    String string = cursorD.getString(0);
                    String string2 = cursorD.getString(1);
                    LogUtil.a("DeviceManager", "getBondedProductsForDeviceOnly() productId", string, ", kitUid=", string2);
                    if (!TextUtils.isEmpty(string2)) {
                        try {
                            if (Integer.parseInt(string2) != 0) {
                                if (string != null && string.trim().length() > 0) {
                                    LogUtil.a("DeviceManager", "getBondedProductsForDeviceOnly() add ");
                                    arrayList.add(string);
                                }
                            }
                        } catch (NumberFormatException unused) {
                            LogUtil.e("DeviceManager", "getBondedProductsForDeviceOnly() Exception ");
                        }
                    }
                }
            } else if (cursorD != null) {
                return arrayList;
            }
        } catch (SQLiteException e2) {
            LogUtil.d("DeviceManager", "getBondedProductsForDeviceOnly", e2.getMessage());
        } finally {
            if (0 != 0) {
                cursorD.close();
            }
        }
        return arrayList;
    }

    public void c() {
        String[] strArr = (String[]) pip.f45449c.keySet().toArray(new String[0]);
        StringBuffer stringBuffer = new StringBuffer(10);
        for (int i = 0; i < strArr.length; i++) {
            if (i == strArr.length - 1) {
                stringBuffer.append("kind = ?");
            } else {
                stringBuffer.append("kind = ? OR ");
            }
        }
        int iC = dmk.d().c("device", stringBuffer.toString(), strArr);
        LogUtil.d("DeviceManager", "deleteBondedProductsForDeviceOnly deleteNum:", Integer.valueOf(iC));
        LogUtil.a("DeviceManager", "deleteBondedProductsForDeviceOnly deleteNum:", Integer.valueOf(dmk.d().c("device", "kind = ? and kitUuid != ? ", new String[]{"HDK_HEART_RATE", "0"})));
        if (iC > 0) {
            ecf.d();
        }
    }

    public boolean b(String str, String str2, MeasurableDevice measurableDevice, com.huawei.health.device.callback.IDeviceEventHandler iDeviceEventHandler) {
        if (measurableDevice == null || TextUtils.isEmpty(measurableDevice.getUniqueId()) || measurableDevice.getUniqueId().trim().length() <= 0) {
            LogUtil.j("DeviceManager", "bindDevice device is null or device uniqueId is empty");
            if (iDeviceEventHandler == null) {
                return false;
            }
            iDeviceEventHandler.onStateChanged(-1);
            return false;
        }
        ReleaseLogUtil.d("R_DeviceManager", "DeviceManager bindDevice");
        if (dnf.e().a(str2) == null) {
            return e(str, measurableDevice, iDeviceEventHandler);
        }
        if (dxm.ab(str)) {
            LogUtil.d("DeviceManager", "bindDevice doCreateBond result :", Boolean.valueOf(measurableDevice.doCreateBond(iDeviceEventHandler)));
            return true;
        }
        return a(str, str2, measurableDevice, iDeviceEventHandler);
    }

    private boolean e(String str, MeasurableDevice measurableDevice, com.huawei.health.device.callback.IDeviceEventHandler iDeviceEventHandler) {
        elh elhVarD = ResourceManager.c().d(str);
        if (elhVarD != null && elhVarD.p() != null && "H5".equals(elhVarD.p())) {
            c(str, measurableDevice, "db_device");
            return d(str, a(elhVarD, measurableDevice), measurableDevice, iDeviceEventHandler, measurableDevice.getSerialNumber());
        }
        LogUtil.j("DeviceManager", "deviceKit is null, and is not measure on h5, do nothing");
        if (iDeviceEventHandler == null) {
            return false;
        }
        iDeviceEventHandler.onStateChanged(-1);
        return false;
    }

    public void c(String str, MeasurableDevice measurableDevice, String str2) {
        String strA;
        if (TextUtils.isEmpty(measurableDevice.getDeviceName())) {
            if (str2.equals("db_device")) {
                strA = etn.c(str);
            } else {
                strA = etn.a(str, "en");
            }
            String strReplace = measurableDevice.getUniqueId().replace(":", "");
            measurableDevice.setDeviceName(strA + Constants.LINK + strReplace.substring(strReplace.length() - 3));
            LogUtil.d("DeviceManager", "dbType:", str2, " , ", "name", ":", measurableDevice.getDeviceName());
        }
    }

    private String a(elh elhVar, MeasurableDevice measurableDevice) {
        if (TextUtils.isEmpty(measurableDevice.getMeasureKitUuid())) {
            String strQ = elhVar.q();
            measurableDevice.setMeasureKitUuid(strQ);
            LogUtil.d("DeviceManager", "资源包 kitUuid:", strQ);
        }
        return measurableDevice.getMeasureKitUuid();
    }

    public boolean a(String str, String str2, MeasurableDevice measurableDevice, com.huawei.health.device.callback.IDeviceEventHandler iDeviceEventHandler) {
        return d(str, str2, measurableDevice, iDeviceEventHandler, "");
    }

    public boolean d(String str, String str2, MeasurableDevice measurableDevice, com.huawei.health.device.callback.IDeviceEventHandler iDeviceEventHandler, String str3) {
        if (!a(str, measurableDevice)) {
            d(iDeviceEventHandler);
            return false;
        }
        MeasureKit measureKitI = drw.e().i(str2);
        if (measureKitI != null && com.huawei.health.device.model.HealthDevice.HealthDeviceKind.HDK_WEIGHT.equals(measureKitI.getHealthDataKind())) {
            LogUtil.a("DeviceManager", "saveDevice SharedPreferenceManager set IS_PAIRED_DEVICE");
            SharedPreferenceManager.d(String.valueOf(10024), "isPairedDevice", 1);
        }
        return e(str, measurableDevice, iDeviceEventHandler, d(str, str2, measurableDevice, str3), str3);
    }

    public boolean e(String str, MeasurableDevice measurableDevice, com.huawei.health.device.callback.IDeviceEventHandler iDeviceEventHandler, ContentValues contentValues, String str2) {
        if (dmk.d().e("device", contentValues) == -1) {
            ReleaseLogUtil.e("R_DeviceManager", "fail to insert device data base");
            d(iDeviceEventHandler);
            return false;
        }
        c(str, measurableDevice, "db_hihealth_device");
        a(str, measurableDevice, str2);
        b(str, measurableDevice.getUniqueId(), measurableDevice);
        measurableDevice.doCreateBond(iDeviceEventHandler);
        if (this.f32013a && eqt.c().c(str)) {
            LogUtil.a("DeviceManager", "SupportAutoConnect");
            if (eqt.c().a(measurableDevice.getUniqueId())) {
                b(contentValues);
            }
            return true;
        }
        if (!enq.d().c()) {
            h();
            if (this.f32013a) {
                b(contentValues);
            }
        }
        return true;
    }

    public void b(String str, String str2, MeasurableDevice measurableDevice) {
        e(str, str2, "", measurableDevice);
    }

    public void e(final String str, String str2, String str3, final MeasurableDevice measurableDevice) {
        LogUtil.a("DeviceManager", "enter uploadDeviceToCloud");
        ProductMapParseUtil.a(dxw.d());
        final dyd dydVar = new dyd();
        dydVar.a(str, str2, str3);
        ThreadPoolManager.c().execute(new Runnable() { // from class: dmp.3
            @Override // java.lang.Runnable
            public void run() {
                LogUtil.a("DeviceManager", "enter get wiseDeviceId");
                dmp.this.d(str, measurableDevice, dydVar);
            }
        });
    }

    public ContentValues d(String str, String str2, MeasurableDevice measurableDevice, String str3) {
        elh elhVarD = ResourceManager.c().d(str);
        MeasureKit measureKitA = dnf.e().a(str2);
        ContentValues contentValues = new ContentValues();
        contentValues.put("kind", e(elhVarD, measureKitA));
        contentValues.put(Wpt.MODE, Integer.valueOf(a(elhVarD, measureKitA)));
        boolean zD = d(elhVarD, measureKitA);
        this.f32013a = zD;
        contentValues.put(TtmlNode.TEXT_EMPHASIS_AUTO, Integer.valueOf(zD ? 1 : 0));
        contentValues.put("uniqueId", measurableDevice.getUniqueId());
        contentValues.put("sn", str3);
        String deviceName = measurableDevice.getDeviceName();
        if (TextUtils.isEmpty(deviceName) && elhVarD != null && elhVarD.l() != null) {
            deviceName = etn.c(str, elhVarD.l().d());
            LogUtil.j("DeviceManager", "get deviceName from ResourceManager deviceName = ", deviceName);
        }
        String str4 = deviceName;
        contentValues.put("name", str4);
        contentValues.put("productId", str);
        contentValues.put(EventMonitorRecord.ADD_TIME, Long.valueOf(System.currentTimeMillis()));
        contentValues.put("kitUuid", str2);
        String strE = e(elhVarD, measureKitA);
        int iA = a(elhVarD, measureKitA);
        boolean z = this.f32013a;
        LogUtil.a("DeviceManager", "saveDevice deviceInfo : deviceKind is ", strE, ", deviceMode is ", Integer.valueOf(iA), ", auto is ", Integer.valueOf(z ? 1 : 0), ", uniqueId is ", CommonUtil.n(measurableDevice.getUniqueId()), ", serialNumber is ", CommonUtil.n(str3), ", productId is", CommonUtil.n(str), ", kitUuid is ", str2, ", deviceName is ", str4);
        return contentValues;
    }

    private void d(com.huawei.health.device.callback.IDeviceEventHandler iDeviceEventHandler) {
        if (iDeviceEventHandler != null) {
            iDeviceEventHandler.onStateChanged(-1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(String str, MeasurableDevice measurableDevice, dyd dydVar) {
        String strA = dydVar.a(str, measurableDevice.getUniqueId());
        ContentValues contentValues = new ContentValues();
        contentValues.put("mDeviceId", strA);
        if (dmk.d().d("device", contentValues, "uniqueId= ?", new String[]{measurableDevice.getUniqueId()}) == -1) {
            LogUtil.j("DeviceManager", "fail to udpate wisedeviceid");
        }
    }

    public void i(String str, String str2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(KnitFragment.KEY_EXTRA, str2);
        if (dmk.d().d("device", contentValues, "uniqueId= ?", new String[]{str}) == -1) {
            LogUtil.j("DeviceManager", "fail to update extra");
        }
    }

    public String c(String str, String str2, String str3, String str4) {
        MeasurableDevice measurableDeviceB = d().b(str4, false);
        DeviceExtra deviceExtra = (measurableDeviceB == null || TextUtils.isEmpty(measurableDeviceB.getExtra())) ? null : (DeviceExtra) HiJsonUtil.d(measurableDeviceB.getExtra(), DeviceExtra.class);
        if (deviceExtra == null) {
            deviceExtra = new DeviceExtra();
        }
        if (TextUtils.isEmpty(str)) {
            deviceExtra.getFittings().add(new DeviceExtra.DeviceData(null, str2, str3));
        } else {
            deviceExtra.getAttached().add(new DeviceExtra.DeviceData(str, str2, str3));
        }
        return HiJsonUtil.d(deviceExtra);
    }

    public boolean d(String str, String str2, HealthDevice healthDevice) {
        String uniqueId = healthDevice.getUniqueId();
        com.huawei.hihealth.device.open.MeasureKit measureKitB = dnf.e().b(str2);
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
            long jE = dmk.d().e("device", contentValues);
            c(str, healthDevice);
            if (!enq.d().c() && jE != -1) {
                if (measureKitB.getBackgroundController() != null && !z) {
                    LogUtil.d("DeviceManager", "saveDeviceInfo auto test background measure");
                    Intent intent = new Intent("com.huawei.health.action.DEVICE_CHANGED");
                    intent.setPackage(dxw.d().getPackageName());
                    intent.putExtra("operation", 1);
                    intent.putExtra("uniqueId", uniqueId);
                    intent.putExtra("productId", str);
                    intent.putExtra(Wpt.MODE, 32);
                    intent.putExtra("kind", measureKitB.getHealthDataKind().name());
                    intent.putExtra("name", healthDevice.getDeviceName());
                    LogUtil.a("DeviceManager", "saveDeviceInfo deviceName = ", healthDevice.getDeviceName());
                    dxw.d().sendBroadcast(intent, LocalBroadcast.f36595c);
                }
                return true;
            }
        }
        return false;
    }

    public ArrayList<ContentValues> f() {
        return b(null, null, null, null, null, null);
    }

    public MeasurableDevice a(String str, boolean z) {
        LogUtil.a("DeviceManager", "getBondedDeviceBySerialNumber ", dyg.b(str));
        ArrayList<ContentValues> arrayListB = b("sn = ?", new String[]{str}, null, null, null, null);
        if (njy.e(arrayListB)) {
            LogUtil.j("DeviceManager", "getBondedDeviceByUniqueId not device for uniqueId ", dyg.b(str));
            return null;
        }
        return c(arrayListB.get(arrayListB.size() - 1), z);
    }

    public MeasurableDevice b(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("DeviceManager", "getBondedDeviceByUniqueId uniqueId is null ");
            return null;
        }
        ArrayList<ContentValues> arrayListB = b("uniqueId = ?", new String[]{str}, null, null, null, null);
        if (njy.e(arrayListB)) {
            LogUtil.j("DeviceManager", "getBondedDeviceByUniqueId no device for uniqueId ", dyg.b(str));
            return null;
        }
        LogUtil.a("DeviceManager", "get bonded device by unique id:", dyg.b(str));
        return c(arrayListB.get(arrayListB.size() - 1), z);
    }

    public boolean g(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("DeviceManager", "isBondedDevice uniqueId is null ");
            return false;
        }
        if (!njy.e(b("uniqueId = ?", new String[]{str}, null, null, null, null))) {
            return true;
        }
        LogUtil.j("DeviceManager", "isBondedDevice no device for uniqueId ", dyg.b(str));
        return false;
    }

    private ArrayList<ContentValues> b(String str, String[] strArr, String str2, String str3, String str4, String str5) {
        ArrayList<ContentValues> arrayList = new ArrayList<>(10);
        Cursor cursorD = null;
        try {
            try {
                String[] strArr2 = {"productId", "name", "uniqueId", Wpt.MODE, "kind", "kitUuid", TtmlNode.TEXT_EMPHASIS_AUTO, "sn", "displayName", EventMonitorRecord.ADD_TIME, "mDeviceId", "showInList", KnitFragment.KEY_EXTRA};
                cursorD = dmk.d().d("device", strArr2, str, strArr, str2, str3, str4, str5);
                if (cursorD != null && !cursorD.isClosed()) {
                    while (cursorD.moveToNext()) {
                        ContentValues contentValues = new ContentValues();
                        for (int i = 0; i < 13; i++) {
                            String str6 = strArr2[i];
                            int columnIndex = cursorD.getColumnIndex(str6);
                            if (columnIndex != -1) {
                                contentValues.put(str6, cursorD.getString(columnIndex));
                            }
                        }
                        arrayList.add(contentValues);
                    }
                    if (cursorD != null) {
                        return arrayList;
                    }
                } else if (cursorD != null) {
                    return arrayList;
                }
            } catch (Exception e2) {
                LogUtil.e("DeviceManager", "getBondedDevice", e2.getMessage());
            }
            return arrayList;
        } finally {
            if (cursorD != null) {
                cursorD.close();
            }
        }
    }

    public ContentValues j(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("DeviceManager", "getDeviceInfoByUniqueId uniqueId is null ");
            return null;
        }
        ArrayList<ContentValues> arrayListB = b("uniqueId = ?", new String[]{str}, null, null, null, null);
        if (njy.e(arrayListB)) {
            LogUtil.j("DeviceManager", "getDeviceInfoByUniqueId no device for uniqueId ", dyg.b(str));
            return null;
        }
        return arrayListB.get(0);
    }

    public ArrayList<ContentValues> c(com.huawei.health.device.model.HealthDevice.HealthDeviceKind healthDeviceKind) {
        ArrayList<ContentValues> arrayList = new ArrayList<>(10);
        if (healthDeviceKind == null) {
            LogUtil.j("DeviceManager", "getBondedProducts device kind is null");
            return arrayList;
        }
        return b("kind= ?", new String[]{healthDeviceKind == com.huawei.health.device.model.HealthDevice.HealthDeviceKind.HDK_UNKNOWN ? null : healthDeviceKind.name()}, null, null, "addTime DESC", null);
    }

    public ArrayList<ContentValues> c(String str) {
        ArrayList<ContentValues> arrayList = new ArrayList<>(10);
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("DeviceManager", "getBondedDeviceByProductId device productId is null");
            return arrayList;
        }
        return b("productId= ?", new String[]{str}, null, null, "addTime DESC", null);
    }

    public boolean a(String str, String str2, eby ebyVar, com.huawei.health.device.callback.IDeviceEventHandler iDeviceEventHandler) {
        if (ebyVar == null) {
            LogUtil.j("DeviceManager", "bindWiFiDevice device is null");
            return false;
        }
        LogUtil.a("DeviceManager", "bindWiFiDevice:", dyg.b(ebyVar.a().c()));
        String uniqueId = ebyVar.getUniqueId();
        if (!TextUtils.isEmpty(uniqueId) && uniqueId.trim().length() > 0) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("productId", str);
            contentValues.put("name", ebyVar.getDeviceName());
            contentValues.put("uniqueId", uniqueId);
            contentValues.put(Wpt.MODE, "8");
            contentValues.put("kind", String.valueOf(ebyVar.getKind()));
            contentValues.put("kitUuid", str2);
            contentValues.put(TtmlNode.TEXT_EMPHASIS_AUTO, (Integer) 1);
            contentValues.put("sn", ebyVar.getSerialNumber());
            contentValues.put(EventMonitorRecord.ADD_TIME, Long.valueOf(new Date().getTime()));
            long jE = dmk.d().e("device", contentValues);
            LogUtil.a("DeviceManager", "bindWiFiDevice rowId:", Long.valueOf(jE));
            if (jE != -1) {
                ebyVar.doCreateBond(iDeviceEventHandler);
                h();
                return true;
            }
        }
        return false;
    }

    public boolean b(String str, String str2, eby ebyVar, com.huawei.health.device.callback.IDeviceEventHandler iDeviceEventHandler) {
        return a(str, str2, ebyVar, iDeviceEventHandler, 8);
    }

    public boolean a(String str, String str2, eby ebyVar, com.huawei.health.device.callback.IDeviceEventHandler iDeviceEventHandler, int i) {
        long jD;
        if (ebyVar == null) {
            LogUtil.j("DeviceManager", "bindWiFiUpdateDevice device is null");
            return false;
        }
        LogUtil.a("DeviceManager", "bindWiFiUpdateDevice ", dyg.b(ebyVar.a().c()));
        LogUtil.d("DeviceManager", "bindWiFiUpdateDevice ", ebyVar.toString());
        String strL = !TextUtils.isEmpty(ebyVar.a().l()) ? ebyVar.a().l() : ebyVar.getSerialNumber();
        String strC = !TextUtils.isEmpty(ebyVar.c()) ? ebyVar.c() : strL;
        if (TextUtils.isEmpty(strL) || TextUtils.isEmpty(strC)) {
            LogUtil.j("DeviceManager", "can not update wifi device in table device, serial number or uniqueID is null");
            return false;
        }
        LogUtil.a("DeviceManager", "bindWiFiUpdateDevice uniqueId = ", dyg.b(strC), ",productId = ", str, ", deviceName = ", ebyVar.getDeviceName(), ", sn = ", dyg.b(strL));
        ContentValues contentValues = new ContentValues();
        contentValues.put(Wpt.MODE, "" + i);
        if (d().a(strL, false) == null) {
            LogUtil.a("DeviceManager", "bindWiFiUpdateDevice insert table device");
            contentValues.put("productId", str);
            contentValues.put("name", ebyVar.getDeviceName());
            contentValues.put("uniqueId", strC);
            contentValues.put("kind", String.valueOf(ebyVar.getKind()));
            contentValues.put("kitUuid", str2);
            contentValues.put(TtmlNode.TEXT_EMPHASIS_AUTO, (Integer) 1);
            contentValues.put("sn", strL);
            contentValues.put(EventMonitorRecord.ADD_TIME, Long.valueOf(new Date().getTime()));
            jD = dmk.d().e("device", contentValues);
        } else {
            jD = dmk.d().d("device", contentValues, "sn = ?", new String[]{strL});
        }
        LogUtil.a("DeviceManager", "bindWiFiUpdateDevice rowId:", Long.valueOf(jD));
        if (jD != -1) {
            ebyVar.doCreateBond(iDeviceEventHandler);
            return true;
        }
        if (iDeviceEventHandler != null) {
            LogUtil.a("DeviceManager", "callback PAIRING_FAILED");
            iDeviceEventHandler.onStateChanged(8);
        }
        return false;
    }

    public boolean c(String str, String str2, HealthDevice healthDevice, IDeviceEventHandler iDeviceEventHandler) {
        LogUtil.a("DeviceManager", "DeviceManager bindDeviceUniversal");
        String uniqueId = healthDevice.getUniqueId();
        if (dnf.e().b(str2) == null || uniqueId == null || uniqueId.trim().length() <= 0) {
            return false;
        }
        LogUtil.d("DeviceManager", "bindDeviceUniversal doCreatePair result :", Boolean.valueOf(healthDevice.doCreatePair(iDeviceEventHandler)));
        if (dxm.ac(str)) {
            return true;
        }
        return d(str, str2, healthDevice);
    }

    public boolean m(String str) throws Throwable {
        LogUtil.a("DeviceManager", "DeviceManager unbindWiFiDevice");
        if (str == null) {
            return false;
        }
        eby ebyVarD = ecf.d(str);
        if (ebyVarD == null) {
            LogUtil.j("DeviceManager", "unbindWiFiDevice device is null!");
            return false;
        }
        LogUtil.a("DeviceManager", "unbindWiFiDevice productId ", ebyVarD.getProductId());
        int iC = dmk.d().c("device", "sn = ?", new String[]{ebyVarD.getSerialNumber()});
        LogUtil.a("DeviceManager", "delete device in table device, serial number ", dyg.b(ebyVarD.getSerialNumber()));
        LogUtil.a("DeviceManager", "unbindWiFiDevice isRemoveSuccess:", Boolean.valueOf(ebyVarD.doRemoveBond()), " affectedRows:", Integer.valueOf(iC));
        return true;
    }

    public boolean n(String str) {
        LogUtil.a("DeviceManager", "DeviceManager unbindDevice");
        if (!TextUtils.isEmpty(str)) {
            MeasurableDevice measurableDeviceB = d().b(str);
            if (dmk.d().c("device", "productId = ?", new String[]{str}) <= -1) {
                LogUtil.j("DeviceManager", "unbindDevice delete fail");
                return false;
            }
            if (measurableDeviceB == null) {
                LogUtil.j("DeviceManager", "unbindDevice not find device");
                return false;
            }
            new dyd().c(measurableDeviceB.getUniqueId());
            measurableDeviceB.doRemoveBond();
            if (measurableDeviceB instanceof eby) {
                return true;
            }
            b(measurableDeviceB);
            return true;
        }
        LogUtil.j("DeviceManager", "unbind devcie uniqueId is null");
        return false;
    }

    public boolean l(String str) {
        LogUtil.a("DeviceManager", "DeviceManager unbindDevice by SerialNumber ", dyg.b(str));
        if (!TextUtils.isEmpty(str)) {
            MeasurableDevice measurableDeviceA = d().a(str, false);
            if (dmk.d().c("device", "sn = ?", new String[]{str}) <= -1) {
                LogUtil.j("DeviceManager", "unbindDevice delete fail");
                return false;
            }
            if (measurableDeviceA == null) {
                LogUtil.j("DeviceManager", "unbindDevice not find device");
                return false;
            }
            new dyd().c(measurableDeviceA.getUniqueId());
            measurableDeviceA.doRemoveBond();
            if (measurableDeviceA instanceof eby) {
                return true;
            }
            b(measurableDeviceA);
            return true;
        }
        LogUtil.j("DeviceManager", "unbind devcie uniqueId is null");
        return false;
    }

    private void b(MeasurableDevice measurableDevice) {
        Intent intent = new Intent("com.huawei.health.action.DEVICE_CHANGED");
        intent.setPackage(dxw.d().getPackageName());
        intent.putExtra("operation", -1);
        intent.putExtra("productId", measurableDevice.getProductId());
        intent.putExtra("uniqueId", measurableDevice.getUniqueId());
        dxw.d().sendBroadcast(intent, LocalBroadcast.f36595c);
    }

    public boolean d(String str, String str2) {
        DeviceExtra deviceExtra;
        LogUtil.a("DeviceManager", "DeviceManager unbindDevice fittings by attachUniqueId ", dyg.b(str), ", uniqueId ", dyg.b(str2));
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            LogUtil.j("DeviceManager", "unbind devcie uniqueId is null");
            return false;
        }
        MeasurableDevice measurableDeviceB = d().b(str2, false);
        if (measurableDeviceB != null && !TextUtils.isEmpty(measurableDeviceB.getExtra()) && (deviceExtra = (DeviceExtra) HiJsonUtil.d(measurableDeviceB.getExtra(), DeviceExtra.class)) != null && njy.b(deviceExtra.getAttached())) {
            e(str, str2, deviceExtra);
            if (d(str, str2, deviceExtra)) {
                return true;
            }
        }
        return b(str2, measurableDeviceB);
    }

    public boolean o(String str) {
        DeviceExtra deviceExtra;
        LogUtil.a("DeviceManager", "DeviceManager unbindDevice by uniqueId, ", dyg.b(str));
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("DeviceManager", "unbind devcie uniqueId is null");
            return false;
        }
        MeasurableDevice measurableDeviceB = d().b(str, false);
        if (measurableDeviceB != null && !TextUtils.isEmpty(measurableDeviceB.getExtra()) && (deviceExtra = (DeviceExtra) HiJsonUtil.d(measurableDeviceB.getExtra(), DeviceExtra.class)) != null && njy.b(deviceExtra.getFittings())) {
            c(str, deviceExtra);
        }
        return b(str, measurableDeviceB);
    }

    private boolean b(String str, MeasurableDevice measurableDevice) {
        if (measurableDevice != null) {
            enm.d(measurableDevice.getAddress(), "local");
        }
        if (dmk.d().c("device", "uniqueId = ?", new String[]{str}) <= -1) {
            LogUtil.j("DeviceManager", "unbindDeviceByUniqueId delete fail");
            return false;
        }
        if (measurableDevice == null) {
            LogUtil.j("DeviceManager", "unbindDeviceByUniqueId not find device");
            return false;
        }
        measurableDevice.doRemoveBond();
        if (measurableDevice instanceof eby) {
            return true;
        }
        Intent intent = new Intent("com.huawei.health.action.DEVICE_CHANGED");
        intent.setPackage(dxw.d().getPackageName());
        intent.putExtra("operation", -1);
        intent.putExtra("productId", measurableDevice.getProductId());
        intent.putExtra("uniqueId", measurableDevice.getUniqueId());
        dxw.d().sendBroadcast(intent, LocalBroadcast.f36595c);
        return true;
    }

    private void c(String str, DeviceExtra deviceExtra) {
        for (DeviceExtra.DeviceData deviceData : deviceExtra.getFittings()) {
            if (TextUtils.isEmpty(deviceData.getUniqueId())) {
                LogUtil.j("DeviceManager", "fitting uniqueId is null");
            } else {
                MeasurableDevice measurableDeviceB = d().b(deviceData.getUniqueId(), false);
                if (measurableDeviceB == null || TextUtils.isEmpty(measurableDeviceB.getExtra())) {
                    LogUtil.j("DeviceManager", "deviceFitting or deviceFitting.getExtra is null");
                } else {
                    DeviceExtra deviceExtra2 = (DeviceExtra) HiJsonUtil.d(measurableDeviceB.getExtra(), DeviceExtra.class);
                    if (deviceExtra2 == null || njy.e(deviceExtra2.getAttached())) {
                        LogUtil.j("DeviceManager", "attachExtra or attachExtra.getFittings is null");
                    } else {
                        List<DeviceExtra.DeviceData> attached = deviceExtra2.getAttached();
                        Iterator<DeviceExtra.DeviceData> it = attached.iterator();
                        while (it.hasNext()) {
                            if (str.equals(it.next().getUniqueId())) {
                                it.remove();
                            }
                        }
                        if (attached.size() == 0) {
                            LogUtil.a("DeviceManager", "unbindDeviceByUniqueId deviceFitting by uniqueId, ", dyg.b(deviceData.getUniqueId()));
                            b(deviceData.getUniqueId(), measurableDeviceB);
                        } else {
                            i(deviceData.getUniqueId(), HiJsonUtil.d(deviceExtra2));
                        }
                    }
                }
            }
        }
    }

    private void e(String str, String str2, DeviceExtra deviceExtra) {
        for (DeviceExtra.DeviceData deviceData : deviceExtra.getAttached()) {
            if (TextUtils.isEmpty(deviceData.getUniqueId())) {
                LogUtil.j("DeviceManager", "attached uniqueId is null");
            } else if (deviceData.getUniqueId().equals(str)) {
                MeasurableDevice measurableDeviceB = d().b(str, false);
                if (measurableDeviceB == null || TextUtils.isEmpty(measurableDeviceB.getExtra())) {
                    LogUtil.j("DeviceManager", "attachDevice or attachDevice.getExtra is null");
                } else {
                    DeviceExtra deviceExtra2 = (DeviceExtra) HiJsonUtil.d(measurableDeviceB.getExtra(), DeviceExtra.class);
                    if (deviceExtra2 == null || njy.e(deviceExtra2.getFittings())) {
                        LogUtil.j("DeviceManager", "attachExtra or attachExtra.getFittings is null");
                    } else {
                        List<DeviceExtra.DeviceData> fittings = deviceExtra2.getFittings();
                        Iterator<DeviceExtra.DeviceData> it = fittings.iterator();
                        while (it.hasNext()) {
                            if (str2.equals(it.next().getUniqueId())) {
                                it.remove();
                            }
                        }
                        i(str, fittings.size() > 0 ? HiJsonUtil.d(deviceExtra2) : null);
                        return;
                    }
                }
            } else {
                continue;
            }
        }
    }

    private boolean d(String str, String str2, DeviceExtra deviceExtra) {
        Iterator<DeviceExtra.DeviceData> it = deviceExtra.getAttached().iterator();
        while (it.hasNext()) {
            if (str.equals(it.next().getUniqueId())) {
                it.remove();
            }
        }
        if (deviceExtra.getAttached().size() <= 0) {
            return false;
        }
        i(str2, HiJsonUtil.d(deviceExtra));
        return true;
    }

    public boolean g(String str, String str2) {
        if (!TextUtils.isEmpty(str2) || !TextUtils.isEmpty(str)) {
            HealthDevice healthDeviceE = d().e(str, str2);
            if (dmk.d().c("device", "uniqueId = ?", new String[]{str2}) <= -1) {
                LogUtil.j("DeviceManager", "unbindDeviceUniversal delete fail");
                return false;
            }
            if (healthDeviceE != null) {
                LogUtil.d("DeviceManager", "unbindDeviceUniversal DeviceManager isRemovePair : ", Boolean.valueOf(healthDeviceE.doRemovePair()));
                Intent intent = new Intent("com.huawei.health.action.DEVICE_CHANGED");
                intent.setPackage(dxw.d().getPackageName());
                intent.putExtra("operation", -1);
                intent.putExtra("uniqueId", str2);
                intent.putExtra("productId", str);
                dxw.d().sendBroadcast(intent, LocalBroadcast.f36595c);
                return true;
            }
        }
        return false;
    }

    public boolean c(String str, com.huawei.health.device.model.HealthDevice healthDevice) {
        if (healthDevice == null || TextUtils.isEmpty(healthDevice.getUniqueId()) || healthDevice.getUniqueId().trim().length() <= 0) {
            LogUtil.a("DeviceManager", "Enter bindWearDevice illegal uniqueId");
            return false;
        }
        String uniqueId = healthDevice.getUniqueId();
        LogUtil.a("DeviceManager", "DeviceManager bindWearDevice ", dyg.b(uniqueId));
        ContentValues contentValues = new ContentValues();
        contentValues.put("productId", str);
        contentValues.put("name", healthDevice.getDeviceName());
        contentValues.put("uniqueId", uniqueId);
        contentValues.put(Wpt.MODE, "16");
        contentValues.put("kind", String.valueOf(com.huawei.health.device.model.HealthDevice.HealthDeviceKind.HDK_HEART_RATE));
        contentValues.put("kitUuid", (Integer) 0);
        contentValues.put(TtmlNode.TEXT_EMPHASIS_AUTO, (Integer) 1);
        contentValues.put(EventMonitorRecord.ADD_TIME, Long.valueOf(new Date().getTime()));
        long jE = dmk.d().e("device", contentValues);
        a(str, healthDevice, "");
        if (jE >= 0) {
            return true;
        }
        LogUtil.j("DeviceManager", "bindWearDevice insert into data base fail");
        return false;
    }

    public int a() {
        LogUtil.a("DeviceManager", "DeviceManager deleteWearDevice");
        LogUtil.a("DeviceManager", "Enter deleteWearDevice");
        int iC = dmk.d().c("device", "mode = ? and kind = ? and kitUuid = ? ", new String[]{"16", "HDK_HEART_RATE", "0"});
        LogUtil.a("DeviceManager", "deleteWearDevice num:", Integer.valueOf(iC));
        return iC;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0089 A[DONT_GENERATE, PHI: r6
      0x0089: PHI (r6v2 android.database.Cursor) = (r6v0 android.database.Cursor), (r6v3 android.database.Cursor) binds: [B:24:0x0087, B:16:0x0070] A[DONT_GENERATE, DONT_INLINE]] */
    public int j() {
        LogUtil.a("DeviceManager", "DeviceManager getWearDeviceSize");
        ArrayList arrayList = new ArrayList(10);
        Cursor cursorD = null;
        try {
            try {
                cursorD = dmk.d().d("device", new String[]{"productId", Wpt.MODE, "kind", "kitUuid"}, "mode = ? and kind = ? and kitUuid = ? ", new String[]{"16", "HDK_HEART_RATE", "0"}, null, null, EventMonitorRecord.ADD_TIME, null);
                if (cursorD == null) {
                    return 0;
                }
                while (cursorD.moveToNext()) {
                    String string = cursorD.getString(0);
                    if (!TextUtils.isEmpty(string) && string.trim().length() > 0) {
                        arrayList.add(string);
                    }
                }
            } finally {
                if (0 != 0) {
                    cursorD.close();
                }
            }
        } catch (SQLiteException | NumberFormatException e2) {
            LogUtil.d("DeviceManager", "getWearDeviceSize e = ", e2.getMessage());
            if (0 != 0) {
            }
        }
        return arrayList.size();
    }

    public boolean c(MeasurableDevice measurableDevice) {
        LogUtil.a("DeviceManager", "DeviceManager cancelBinding");
        if (measurableDevice == null) {
            return false;
        }
        measurableDevice.cancelBinding(measurableDevice);
        return true;
    }

    public void c(ScanMode scanMode, List<cmy> list, DeviceScanCallback deviceScanCallback) {
        drc.b().b(scanMode, list, deviceScanCallback);
    }

    public boolean d(String str, IDeviceEventHandler iDeviceEventHandler) {
        LogUtil.a("DeviceManager", "DeviceManager scanDeviceUniversal current device is ", str);
        com.huawei.hihealth.device.open.MeasureKit measureKitB = dnf.e().b(str);
        if (measureKitB == null) {
            LogUtil.j("DeviceManager", "DeviceManager scanDeviceUniversal fail,deviceKit is null");
            return false;
        }
        DeviceProvider deviceProvider = measureKitB.getDeviceProvider();
        this.f32014b = deviceProvider;
        if (deviceProvider != null) {
            return deviceProvider.scanDevice(iDeviceEventHandler);
        }
        return false;
    }

    public boolean h(String str) {
        elh elhVarD = ResourceManager.c().d(str);
        if (elhVarD == null) {
            return false;
        }
        String strO = elhVarD.o();
        LogUtil.a("DeviceManager", "isDeviceKitUniversal deviceInfo entry:", strO);
        if (strO == null) {
            return false;
        }
        return !"NULL".equals(strO);
    }

    public void g() {
        LogUtil.a("DeviceManager", "DeviceManager stopScanUniversal:");
        DeviceProvider deviceProvider = this.f32014b;
        if (deviceProvider != null) {
            deviceProvider.stopScanDevice();
        }
    }

    public int a(ContentValues contentValues, String str, String[] strArr) {
        return (int) dmk.d().d("device", contentValues, str, strArr);
    }

    public void a(String str, com.huawei.health.device.model.HealthDevice healthDevice, String str2) {
        ReleaseLogUtil.d("R_DeviceManager", "registerDeviceInfo param is HealthDevice name:", healthDevice.getDeviceName(), " deviceSn:", CommonUtil.n(str2));
        HiDeviceInfo hiDeviceInfoA = dmn.c().a(str, str2, healthDevice);
        elh elhVarD = ResourceManager.c().d(str);
        try {
            if (elhVarD != null) {
                if (elhVarD.h() == null || elhVarD.h().trim().isEmpty()) {
                    if (CommonUtil.ap()) {
                        ReleaseLogUtil.e("R_DeviceManager", "registerDeviceInfo type 1 deviceName is ", healthDevice.getDeviceName());
                        return;
                    } else {
                        hiDeviceInfoA.setDeviceType(1);
                        ReleaseLogUtil.e("R_DeviceManager", "registerDeviceInfo type 1 deviceName is ", healthDevice.getDeviceName());
                    }
                } else {
                    int iJ = CommonUtil.j(elhVarD.h());
                    if (CommonUtil.cj() && iJ < 2) {
                        iJ = 300;
                    }
                    hiDeviceInfoA.setDeviceType(iJ);
                    LogUtil.d("DeviceManager", "registerDeviceInfo deviceId is ", Integer.valueOf(iJ), " productId is ", str);
                }
            } else if (!(healthDevice instanceof dmt)) {
                LogUtil.j("DeviceManager", "registerDeviceInfo know device type");
            } else {
                hiDeviceInfoA.setDeviceType(((dmt) healthDevice).a());
                LogUtil.a("DeviceManager", "registerDeviceInfo deviceName is ", healthDevice.getDeviceName());
            }
            String strB = era.b(str);
            hiDeviceInfoA.setProdId(strB);
            ReleaseLogUtil.d("R_DeviceManager", "registerDeviceInfo name: ", healthDevice.getDeviceName(), " prodId：", strB);
            ArrayList arrayList = new ArrayList(10);
            arrayList.add(0);
            HiHealthManager.d(dxw.d()).registerDataClient(hiDeviceInfoA, arrayList, null);
        } catch (IllegalArgumentException unused) {
            LogUtil.e("DeviceManager", "registerDeviceInfo set hiDevcieId error, save info fail, please check, originalType");
        }
    }

    private void c(String str, HealthDevice healthDevice) {
        LogUtil.a("DeviceManager", "registerDeviceInfo param is open.HealthDevice");
        HiDeviceInfo hiDeviceInfo = new HiDeviceInfo(1);
        hiDeviceInfo.setDeviceUniqueCode(healthDevice.getUniqueId());
        hiDeviceInfo.setDeviceName(healthDevice.getDeviceName());
        elh elhVarD = ResourceManager.c().d(str);
        if (elhVarD != null) {
            if (elhVarD.h() == null || elhVarD.h().trim().isEmpty()) {
                hiDeviceInfo.setDeviceType(1);
                LogUtil.j("DeviceManager", "registerDeviceInfo type 1 deviceName is ", healthDevice.getDeviceName());
            } else {
                try {
                    hiDeviceInfo.setDeviceType(CommonUtil.j(elhVarD.h()));
                    LogUtil.d("DeviceManager", "registerDeviceInfo deviceId is ", elhVarD.h(), " productId is ", str);
                } catch (IllegalArgumentException unused) {
                    LogUtil.e("DeviceManager", "registerDeviceInfo set error, about open device.");
                    return;
                }
            }
        }
        String strB = era.b(str);
        hiDeviceInfo.setProdId(strB);
        LogUtil.a("DeviceManager", "registerDeviceInfo prodId is：", strB);
        ArrayList arrayList = new ArrayList(10);
        arrayList.add(0);
        HiHealthManager.d(dxw.d()).registerDataClient(hiDeviceInfo, arrayList, null);
    }

    private void h() {
        if (TextUtils.isEmpty(SharedPreferenceManager.e(dxw.d(), "BIND_WEIGHT", "bind_weight_time"))) {
            Context contextD = dxw.d();
            long jCurrentTimeMillis = System.currentTimeMillis();
            SharedPreferenceManager.e(contextD, "BIND_WEIGHT", "bind_weight_time", String.valueOf(jCurrentTimeMillis), new StorageParams());
        }
    }

    private MeasurableDevice c(ContentValues contentValues, boolean z) {
        MeasurableDevice measurableDeviceA;
        String asString = contentValues.getAsString("name");
        String asString2 = contentValues.getAsString("uniqueId");
        Integer asInteger = contentValues.getAsInteger(TtmlNode.TEXT_EMPHASIS_AUTO);
        if (asInteger == null) {
            LogUtil.j("DeviceManager", "can't not get device measure mode ");
            return null;
        }
        if (enq.d().c()) {
            measurableDeviceA = new dms(asString, asString2, asString2);
        } else {
            measurableDeviceA = a(contentValues);
        }
        if (measurableDeviceA == null) {
            return null;
        }
        com.huawei.health.device.model.HealthDevice.HealthDeviceKind healthDeviceKindA = etn.a(contentValues.getAsString("kind"));
        String asString3 = contentValues.getAsString("productId");
        String asString4 = contentValues.getAsString("kitUuid");
        measurableDeviceA.setAutoDevice(asInteger.intValue() == 1);
        measurableDeviceA.setDeviceName(asString);
        measurableDeviceA.setMeasureKitUuid(asString4);
        measurableDeviceA.setKind(healthDeviceKindA);
        measurableDeviceA.setProductId(asString3);
        measurableDeviceA.setSerialNumber(contentValues.getAsString("sn"));
        measurableDeviceA.setShowInList(contentValues.getAsInteger("showInList").intValue());
        measurableDeviceA.setExtra(contentValues.getAsString(KnitFragment.KEY_EXTRA));
        if (!(measurableDeviceA instanceof eby)) {
            LogUtil.j("DeviceManager", "this device is not wifiDevice ");
            return measurableDeviceA;
        }
        if (z && dxm.y(asString3)) {
            LogUtil.a("DeviceManager", "this device is BleDevice ");
            return c(measurableDeviceA, contentValues);
        }
        eby ebyVar = (eby) measurableDeviceA;
        e(ebyVar, contentValues);
        LogUtil.a("DeviceManager", "this device is WiFiDevice and getDeviceInfo().getSource() ==  ", Integer.valueOf(ebyVar.a().m()));
        return measurableDeviceA;
    }

    private void b(ContentValues contentValues) {
        if (contentValues == null) {
            LogUtil.j("DeviceManager", "sendBondNewDeviceBroadcast device info is null");
            return;
        }
        Intent intent = new Intent("com.huawei.health.action.DEVICE_CHANGED");
        intent.setPackage(dxw.d().getPackageName());
        intent.putExtra("operation", 1);
        String[] strArr = {"productId", "uniqueId", Wpt.MODE, "name", "kind"};
        for (int i = 0; i < 5; i++) {
            String str = strArr[i];
            if (!contentValues.containsKey(str)) {
                LogUtil.j("DeviceManager", "sendBondNewDeviceBroadcast device info missing: ", str);
            } else if (Wpt.MODE.equals(str) || TtmlNode.TEXT_EMPHASIS_AUTO.equals(str)) {
                intent.putExtra(str, contentValues.getAsInteger(str));
            } else if (EventMonitorRecord.ADD_TIME.equals(str)) {
                intent.putExtra(str, contentValues.getAsLong(str));
            } else {
                intent.putExtra(str, contentValues.getAsString(str));
            }
        }
        LogUtil.a("DeviceManager", "sendBroadCast deviceName = ", contentValues.getAsString("name"));
        dxw.d().sendBroadcast(intent, LocalBroadcast.f36595c);
    }

    private int a(elh elhVar, MeasureKit measureKit) {
        if (measureKit != null) {
            return dmn.c().b(measureKit);
        }
        if (elhVar != null) {
            return elhVar.v().c();
        }
        LogUtil.j("DeviceManager", "can not determine connect mode, set default connect mode");
        return 0;
    }

    private boolean a(String str, MeasurableDevice measurableDevice) {
        if (measurableDevice != null && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(measurableDevice.getUniqueId())) {
            return true;
        }
        LogUtil.j("DeviceManager", "save device fail, illegal device");
        return false;
    }

    private boolean d(elh elhVar, MeasureKit measureKit) {
        if (elhVar != null && eqt.c().c(elhVar.t()) && ("12".equals(elhVar.r()) || a.t.equals(elhVar.r()))) {
            return true;
        }
        return ((elhVar != null && "10".equals(elhVar.r())) || measureKit == null || measureKit.getBackgroundController() == null) ? false : true;
    }

    private String e(elh elhVar, MeasureKit measureKit) {
        String strName = com.huawei.health.device.model.HealthDevice.HealthDeviceKind.HDK_UNKNOWN.name();
        if (measureKit != null && measureKit.getHealthDataKind() != null) {
            return measureKit.getHealthDataKind().name();
        }
        if (elhVar != null && elhVar.m() != null) {
            return elhVar.m().name();
        }
        LogUtil.j("DeviceManager", "can not determine device kind, set defualt");
        return strName;
    }

    public boolean a(Context context, ContentValues contentValues, String str) {
        if (context == null || contentValues == null || contentValues.size() == 0 || TextUtils.isEmpty(str)) {
            LogUtil.j("DeviceManager", "unbindHaveBindingDevice context or deviceInfo or productId is null");
            return false;
        }
        HashMap map = new HashMap(16);
        map.put("click", "1");
        map.put("device_name", contentValues.getAsString("name"));
        if (!c(contentValues.getAsInteger(com.huawei.operation.utils.Constants.KEY_BLE_SCAN_MODE).intValue()) && !i(str)) {
            LogUtil.a("DeviceManager", "unbindHaveBindingDevice mAdapter.isBluetooth(mMode) = false");
            return false;
        }
        String asString = contentValues.getAsString("uniqueId");
        boolean zN = n(asString, str);
        if (zN) {
            LogUtil.a("DeviceManager", "unbindHaveBindingDevice isUnbind is true");
            drw.e().e(str, asString);
            lmf.d().c(context, AnalyticsValue.HEALTH_PLUGIN_DEVICE_UNBIND_SUCCEED_2060014.value(), map, 0);
        }
        return zN;
    }

    private boolean n(String str, String str2) {
        if (etn.j(str2)) {
            LogUtil.a("DeviceManager", " unbindHaveBindingDevice fitting device unbind");
            return d(emh.b().d(), str);
        }
        if (h(str2)) {
            boolean zG = g(str2, str);
            ecu.d().executeDeviceRelatedLogic(ExecuteMode.CLEAR_AM_16_CACHE, null, "DeviceManager");
            return zG;
        }
        if (TextUtils.isEmpty(str)) {
            return n(str2);
        }
        return o(str);
    }

    public boolean i(String str) {
        return "PRO_GPRS".equals(f(str));
    }

    public String f(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("DeviceManager", "getDeviceProtocol productId is null");
            return "";
        }
        elh elhVarB = ResourceManager.c().b(str);
        if (elhVarB == null) {
            LogUtil.j("DeviceManager", "getDeviceProtocol productInfo is null");
            return "";
        }
        return elhVarB.u();
    }

    public ContentValues e(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("DeviceManager", "getDeviceInfoByName deviceName is null ");
            return null;
        }
        ArrayList<ContentValues> arrayListB = b("name = ?", new String[]{str}, null, null, null, null);
        if (njy.e(arrayListB)) {
            LogUtil.j("DeviceManager", "getDeviceInfoByName no device for deviceName ", str);
            return null;
        }
        return arrayListB.get(0);
    }
}
