package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.content.ContentValues;
import android.text.TextUtils;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.huawei.featureuserprofile.route.hwgpxmodel.Wpt;
import com.huawei.health.device.api.DeviceDataBaseHelperApi;
import com.huawei.health.device.api.DeviceManagerApi;
import com.huawei.health.device.api.MeasureKitManagerApi;
import com.huawei.health.device.model.HealthDevice;
import com.huawei.health.device.open.BleMeasureController;
import com.huawei.health.device.open.MeasureController;
import com.huawei.health.device.open.MeasureKit;
import com.huawei.health.ecologydevice.manager.ResourceManager;
import com.huawei.health.ecologydevice.open.HdpMeasureController;
import com.huawei.health.ecologydevice.ui.measure.fragment.utils.BrDevice;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.db.bean.EventMonitorRecord;
import health.compact.a.CommonUtil;
import health.compact.a.Services;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes7.dex */
public final class efk {
    public ContentValues b(String str, String str2, String str3, String str4) {
        String str5;
        elh elhVarD = ResourceManager.c().d(str);
        if (elhVarD == null) {
            LogUtil.j("EcologyDeviceManager", "productInfo is null");
            return null;
        }
        String strQ = elhVarD.q();
        MeasureKit healthDeviceKit = ((MeasureKitManagerApi) Services.b("PluginDevice", MeasureKitManagerApi.class)).getHealthDeviceKit(strQ);
        ContentValues contentValues = new ContentValues();
        contentValues.put("kind", c(elhVarD, healthDeviceKit));
        contentValues.put(Wpt.MODE, Integer.valueOf(e(elhVarD, healthDeviceKit)));
        boolean zB = b(elhVarD, healthDeviceKit);
        contentValues.put(TtmlNode.TEXT_EMPHASIS_AUTO, Integer.valueOf(zB ? 1 : 0));
        contentValues.put("uniqueId", str2);
        contentValues.put("sn", "");
        if (!TextUtils.isEmpty(str3) || elhVarD == null || elhVarD.l() == null) {
            str5 = str3;
        } else {
            String strC = etn.c(str, elhVarD.l().d());
            LogUtil.j("EcologyDeviceManager", "get deviceName from ResourceManager deviceName = ", strC);
            str5 = strC;
        }
        contentValues.put("name", str5);
        contentValues.put("productId", str);
        contentValues.put(EventMonitorRecord.ADD_TIME, str4);
        contentValues.put("kitUuid", strQ);
        String strC2 = c(elhVarD, healthDeviceKit);
        int iE = e(elhVarD, healthDeviceKit);
        LogUtil.a("EcologyDeviceManager", "saveDevice deviceInfo : deviceKind is ", strC2, ", deviceMode is ", Integer.valueOf(iE), ", auto is ", Integer.valueOf(zB ? 1 : 0), ", uniqueId is ", CommonUtil.n(str2), ", serialNumber is ", CommonUtil.n(""), ", productId is", CommonUtil.n(str), ", kitUuid is ", strQ, ", deviceName is ", str5);
        return contentValues;
    }

    private String c(elh elhVar, MeasureKit measureKit) {
        String strName = HealthDevice.HealthDeviceKind.HDK_UNKNOWN.name();
        if (elhVar != null && "4bfc5a27-f2b9-4c41-bd9b-a4a2a18f752c".equals(elhVar.t())) {
            return "SMART_HEADPHONES";
        }
        if (measureKit != null && measureKit.getHealthDataKind() != null) {
            return measureKit.getHealthDataKind().name();
        }
        if (elhVar != null && elhVar.m() != null) {
            return elhVar.m().name();
        }
        LogUtil.j("EcologyDeviceManager", "can not determine device kind, set defualt");
        return strName;
    }

    private int e(elh elhVar, MeasureKit measureKit) {
        if (measureKit != null) {
            return a(measureKit);
        }
        if (elhVar != null) {
            return elhVar.v().c();
        }
        LogUtil.j("EcologyDeviceManager", "can not determine connect mode, set default connect mode");
        return 0;
    }

    private int a(MeasureKit measureKit) {
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

    private boolean b(elh elhVar, MeasureKit measureKit) {
        return ((elhVar != null && "10".equals(elhVar.r())) || measureKit == null || measureKit.getBackgroundController() == null) ? false : true;
    }

    public void a(String str, String str2, String str3, String str4) {
        elh elhVarD = ResourceManager.c().d(str3);
        String strC = etn.c(str3, elhVarD == null ? "" : elhVarD.l().d());
        ContentValues deviceInfoByUniqueId = ((DeviceManagerApi) Services.b("PluginDevice", DeviceManagerApi.class)).getDeviceInfoByUniqueId(str);
        if (deviceInfoByUniqueId == null) {
            LogUtil.a("EcologyDeviceManager", "saveDevice");
            a(str, strC, str2, str3, str4, String.valueOf(System.currentTimeMillis()));
            etn.e();
        } else {
            if (era.a(deviceInfoByUniqueId)) {
                LogUtil.a("EcologyDeviceManager", "updateAddTime");
                b(str, str2);
                etn.e();
                return;
            }
            LogUtil.a("EcologyDeviceManager", "All Right.");
        }
    }

    public void e(String str, String str2, String str3) {
        elh elhVarD = ResourceManager.c().d(str3);
        String strC = etn.c(str3, elhVarD == null ? "" : elhVarD.l().d());
        BrDevice brDevice = new BrDevice();
        brDevice.setUniqueId(str);
        brDevice.setMacAddress(str);
        brDevice.setDeviceName(strC);
        ((DeviceManagerApi) Services.b("PluginDevice", DeviceManagerApi.class)).registerDeviceInfo("4bfc5a27-f2b9-4c41-bd9b-a4a2a18f752c", brDevice, str2);
    }

    public void a(String str, String str2, String str3, String str4, String str5, String str6) {
        if (!BluetoothAdapter.checkBluetoothAddress(str)) {
            ReleaseLogUtil.e("R_EcologyDeviceManager", "Incorrect MAC address format:", CommonUtil.n(str));
            return;
        }
        ContentValues contentValuesB = new efk().b(str4, str, str2, str6);
        if (contentValuesB == null) {
            LogUtil.j("EcologyDeviceManager", "deviceInfo is null");
            return;
        }
        contentValuesB.put("sn", str3);
        contentValuesB.put("mDeviceId", str5);
        LogUtil.a("EcologyDeviceManager", "code:", CommonUtil.n(str), ", number:", CommonUtil.n(str3), ", deviceName:", str2, ", addTime:", str6);
        if (((DeviceDataBaseHelperApi) Services.b("PluginDevice", DeviceDataBaseHelperApi.class)).insert(contentValuesB) == -1) {
            LogUtil.j("EcologyDeviceManager", "fail to insert device data base");
        }
    }

    public void b(String str, String str2) {
        LogUtil.a("EcologyDeviceManager", "enter updateAddTime");
        ContentValues contentValues = new ContentValues();
        contentValues.put(EventMonitorRecord.ADD_TIME, Long.valueOf(System.currentTimeMillis()));
        contentValues.put("sn", str2);
        if (((DeviceDataBaseHelperApi) Services.b("PluginDevice", DeviceDataBaseHelperApi.class)).update(contentValues, "uniqueId = ?", new String[]{str}) <= 0) {
            LogUtil.j("EcologyDeviceManager", "fail to update addTime and sn");
        }
    }
}
