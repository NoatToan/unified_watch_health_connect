package defpackage;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwbtsdk.btcommon.BTDeviceMgrUtil;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.phoneprocess.hihealthkit.KitWearBinderUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.nfc.PluginPayAdapter;
import com.huawei.openalliance.ad.constant.Constants;
import health.compact.a.KeyValDbManager;
import health.compact.a.LocalBroadcast;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
class mkc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static mkj f41790a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static mkc f41791c;
    private static final Object e = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private lof f41792b;
    private Context d = BaseApplication.getContext();
    private ncz g;

    private boolean b(int i, int i2, int i3, int i4) {
        return i == i3 && i2 == i4;
    }

    private mkc() {
        this.f41792b = null;
        LogUtil.j("HwDeviceHandleBtStateMg", "Init HwDeviceDataReceiveMgr.");
        this.f41792b = lof.d(this.d);
        this.g = new ncz();
        f41790a = mkj.d();
    }

    public static mkc e() {
        mkc mkcVar;
        synchronized (e) {
            if (f41791c == null) {
                f41791c = new mkc();
            }
            mkcVar = f41791c;
        }
        return mkcVar;
    }

    public void c(DeviceInfo deviceInfo, int i, byte[] bArr) {
        boolean zN = mkb.n(deviceInfo.getDeviceIdentify());
        LogUtil.a("HwDeviceHandleBtStateMg", "Enter onDataReceived() with handShakeStatus:", Boolean.valueOf(zN));
        byte b2 = bArr[0];
        byte b3 = bArr[1];
        if (b2 == 1 && b3 == 52) {
            LogUtil.a("HwDeviceHandleBtStateMg", "Enter onDataReceived() key lost 5.1.52:");
        }
        if (zN) {
            LogUtil.a("HwDeviceHandleBtStateMg", "Enter onDataReceived() Handshake with dataContents:", eeq.e(bArr));
            d(deviceInfo, b2, b3, bArr, i);
        } else {
            b(deviceInfo, i, bArr);
        }
    }

    private void d(DeviceInfo deviceInfo, int i, int i2, byte[] bArr, int i3) {
        if (b(i, i2, 1, 7)) {
            i(deviceInfo, bArr);
            return;
        }
        if (b(i, i2, 1, 5)) {
            f41790a.c(deviceInfo, bArr, mkf.d().a());
            return;
        }
        if (b(i, i2, 1, 2)) {
            f41790a.d(deviceInfo, bArr, mkf.d().a());
            return;
        }
        if (b(i, i2, 1, 3)) {
            c(deviceInfo, bArr);
            return;
        }
        if (b(i, i2, 1, 18)) {
            n(deviceInfo, bArr);
            return;
        }
        if (b(i, i2, 2, 5)) {
            e(deviceInfo, bArr);
            return;
        }
        if (b(i, i2, 1, 20)) {
            f41790a.b(deviceInfo, bArr);
            return;
        }
        if (b(i, i2, 38, 1)) {
            b(deviceInfo, bArr);
            return;
        }
        if (b(i, i2, 1, 50)) {
            g(deviceInfo, bArr);
        } else if (b(i, i2, 1, 49)) {
            h(deviceInfo, bArr);
        } else {
            e(deviceInfo, i3, bArr);
        }
    }

    private void i(DeviceInfo deviceInfo, byte[] bArr) {
        if (deviceInfo.getDeviceProtocol() == 2) {
            LogUtil.a("HwDeviceHandleBtStateMg", "Start to check Version Response.");
            if (lmw.e(this.d, deviceInfo.getDeviceProtocol(), bArr)) {
                LogUtil.a("HwDeviceHandleBtStateMg", "Get Version Command send timeout. reSendTimes is :", Integer.valueOf(lmu.m()));
                if (lmu.m() < 1) {
                    c(deviceInfo);
                    return;
                } else {
                    f41790a.e(deviceInfo, bArr, mkf.d().a());
                    return;
                }
            }
            f(deviceInfo, bArr);
        }
    }

    private void c(DeviceInfo deviceInfo) {
        lnr lnrVarD = lmw.d(this.d, (BluetoothDevice) null, deviceInfo, true);
        if (lnrVarD == null) {
            LogUtil.j("HwDeviceHandleBtStateMg", "handleGetProductTypeCommandTimeout btDeviceCommand is null");
            return;
        }
        lnrVarD.e(deviceInfo.getDeviceIdentify());
        if (this.f41792b != null) {
            lmu.d(false);
            LogUtil.a("HwDeviceHandleBtStateMg", "Start to set device time.");
            this.f41792b.b(deviceInfo.getDeviceBluetoothType(), lnrVarD);
        }
    }

    private void f(DeviceInfo deviceInfo, byte[] bArr) {
        try {
            lmu.d(true);
            JSONObject jSONObjectA = lmw.a(this.d, bArr);
            int i = jSONObjectA.getInt("type");
            mkb.c(deviceInfo.getDeviceIdentify(), i);
            if (jSONObjectA.has("device_model")) {
                mkb.i(deviceInfo.getDeviceIdentify(), jSONObjectA.getString("device_model"));
            }
            if (jSONObjectA.has("cert_model")) {
                String string = jSONObjectA.getString("cert_model");
                LogUtil.a("HwDeviceHandleBtStateMg", "cert_model is ", string);
                mkb.e(deviceInfo.getDeviceIdentify(), string);
            }
            int iOptInt = jSONObjectA.optInt("device_version_type", -1);
            LogUtil.a("HwDeviceHandleBtStateMg", "device version type is ", Integer.valueOf(iOptInt));
            mkb.a(deviceInfo.getDeviceIdentify(), iOptInt);
            if (jSONObjectA.has("device_manufacture")) {
                String string2 = jSONObjectA.getString("device_manufacture");
                LogUtil.a("HwDeviceHandleBtStateMg", "device_manufacture is", string2);
                mkb.n(deviceInfo.getDeviceIdentify(), string2);
            }
            if (jSONObjectA.has(PluginPayAdapter.KEY_DEVICE_INFO_BT_VERSION)) {
                mkb.d(deviceInfo.getDeviceIdentify(), jSONObjectA.getString(PluginPayAdapter.KEY_DEVICE_INFO_BT_VERSION));
            }
            if (jSONObjectA.has("device_version")) {
                mkb.l(deviceInfo.getDeviceIdentify(), jSONObjectA.getString("device_version"));
            }
            if (jSONObjectA.has(PluginPayAdapter.KEY_DEVICE_INFO_SOFT_VERSION)) {
                mkb.j(deviceInfo.getDeviceIdentify(), jSONObjectA.getString(PluginPayAdapter.KEY_DEVICE_INFO_SOFT_VERSION));
            }
            d(deviceInfo, jSONObjectA);
            f41790a.d(deviceInfo, bArr, jSONObjectA, i, mkf.d().a());
        } catch (JSONException unused) {
            LogUtil.e("HwDeviceHandleBtStateMg", "0xA0200008", "handleGetProductTypeDetails jsonException.");
        }
    }

    private void d(DeviceInfo deviceInfo, JSONObject jSONObject) throws JSONException {
        if (jSONObject.has("device_name")) {
            mkb.g(deviceInfo.getDeviceIdentify(), jSONObject.getString("device_name"));
        }
        if (jSONObject.has("hilink_device_id")) {
            String strA = cqn.a(deviceInfo.getProductType(), jSONObject.getString("hilink_device_id"));
            mkb.o(deviceInfo.getDeviceIdentify(), strA);
            deviceInfo.setHiLinkDeviceId(strA);
        }
        if (jSONObject.has("device_ota_package_name")) {
            deviceInfo.setDeviceOtaPackageName(jSONObject.getString("device_ota_package_name"));
        }
        if (jSONObject.has("power_save")) {
            mkb.d(deviceInfo.getDeviceIdentify(), jSONObject.getInt("power_save"));
        } else {
            mkb.d(deviceInfo.getDeviceIdentify(), 0);
        }
        if (jSONObject.has("udid_from_device")) {
            mkb.m(deviceInfo.getDeviceIdentify(), jSONObject.getString("udid_from_device"));
        }
        if (jSONObject.has("unconverted_udid")) {
            mkb.p(deviceInfo.getDeviceIdentify(), jSONObject.getString("unconverted_udid"));
        }
        if (jSONObject.has("device_factory_reset")) {
            mkb.b(deviceInfo.getDeviceIdentify(), jSONObject.getInt("device_factory_reset"));
            deviceInfo.setDeviceFactoryReset(jSONObject.getInt("device_factory_reset"));
        }
        if (jSONObject.has("device_country_code")) {
            mkb.a(deviceInfo.getDeviceIdentify(), jSONObject.getString("device_country_code"));
            deviceInfo.setCountryCode(jSONObject.getString("device_country_code"));
        }
        if (jSONObject.has("device_emui_version")) {
            mkb.c(deviceInfo.getDeviceIdentify(), jSONObject.getString("device_emui_version"));
            deviceInfo.setEmuiVersion(jSONObject.getString("device_emui_version"));
        }
        if (jSONObject.has("device_multi_link_ble_mac")) {
            mkb.h(deviceInfo.getDeviceIdentify(), jSONObject.getString("device_multi_link_ble_mac"));
            deviceInfo.setMultiLinkBleMac(jSONObject.getString("device_multi_link_ble_mac"));
        }
    }

    private void c(DeviceInfo deviceInfo, byte[] bArr) {
        if (lmw.e(this.d, deviceInfo.getDeviceProtocol(), bArr)) {
            LogUtil.a("HwDeviceHandleBtStateMg", "Get device command id list info send timeout.");
            f41790a.e(deviceInfo, bArr, mkf.d().a());
            return;
        }
        DeviceCapability deviceCapabilityC = mkb.c(deviceInfo.getDeviceIdentify());
        lni.e(deviceInfo.getProductType(), deviceCapabilityC);
        if (lmw.e().contains(3)) {
            deviceCapabilityC.configureContacts(false);
        }
        if (!lmw.a(this.d, bArr, deviceCapabilityC)) {
            LogUtil.a("HwDeviceHandleBtStateMg", "Get device command id list info fail.");
            f41790a.e(deviceInfo, bArr, mkf.d().a());
            return;
        }
        LogUtil.a("HwDeviceHandleBtStateMg", "Start to handle V2 protocol other capability.");
        int iR = mkb.r(deviceInfo.getDeviceIdentify());
        String strL = mkb.l(deviceInfo.getDeviceIdentify());
        String strH = mkb.h(deviceInfo.getDeviceIdentify());
        if (iR == 10 && "73617766697368".equals(strL) && "372E312E31".equals(strH)) {
            LogUtil.a("HwDeviceHandleBtStateMg", "leo problem version, reset capability");
            f41790a.c(deviceCapabilityC);
        }
        if (iR == 10 && "736177736861726B".equals(strL) && ("4E5847313250".equals(strH) || "4E4C4731334E".equals(strH))) {
            LogUtil.a("HwDeviceHandleBtStateMg", "leo problem version, reset heart rate capability");
            deviceCapabilityC.configureSupportHeartRateInfo(false);
        }
        a(deviceInfo, bArr, deviceCapabilityC);
    }

    private void a(DeviceInfo deviceInfo, byte[] bArr, DeviceCapability deviceCapability) {
        LogUtil.a("HwDeviceHandleBtStateMg", "Enter sendExpandCapability");
        if (deviceCapability != null && deviceCapability.isSupportExpandCapability()) {
            lnr lnrVarI = lmw.i();
            lnrVarI.e(deviceInfo.getDeviceIdentify());
            if (this.f41792b != null) {
                LogUtil.a("HwDeviceHandleBtStateMg", "start to send expand capability");
                this.f41792b.b(deviceInfo.getDeviceBluetoothType(), lnrVarI);
                return;
            }
            return;
        }
        a(deviceInfo, deviceCapability);
    }

    private void a(DeviceInfo deviceInfo, DeviceCapability deviceCapability) {
        if (deviceCapability == null || (!deviceCapability.isSupportAccountSwitch() && !deviceCapability.isSupportChangePhonePair())) {
            LogUtil.j("HwDeviceHandleBtStateMg", "change phone pair start not supported change phone pair");
            e(deviceInfo, deviceCapability);
            return;
        }
        LogUtil.a("HwDeviceHandleBtStateMg", "change phone pair start get account judgment result");
        String strC = KeyValDbManager.d(BaseApplication.getContext()).c("user_id");
        if (strC == null || "0".equals(strC) || "com.huawei.health".equals(strC)) {
            LogUtil.j("HwDeviceHandleBtStateMg", "AccountLoginReceiver userId is empty");
            strC = "";
        }
        lnr lnrVarB = lmw.b(strC);
        lnrVarB.e(deviceInfo.getDeviceIdentify());
        if (this.f41792b != null) {
            LogUtil.a("HwDeviceHandleBtStateMg", "start to get account judgment result.");
            this.f41792b.b(deviceInfo.getDeviceBluetoothType(), lnrVarB);
        }
    }

    private void e(DeviceInfo deviceInfo, DeviceCapability deviceCapability) {
        if (deviceCapability != null && deviceCapability.isGoldCard()) {
            LogUtil.a("HwDeviceHandleBtStateMg", "is support gold card");
            lnr lnrVarG = lmw.g();
            lnrVarG.e(deviceInfo.getDeviceIdentify());
            if (this.f41792b != null) {
                LogUtil.a("HwDeviceHandleBtStateMg", "start to get is support gold card");
                this.f41792b.b(deviceInfo.getDeviceBluetoothType(), lnrVarG);
            }
        }
        if (deviceCapability != null && deviceCapability.isSupportAutoDetectMode()) {
            LogUtil.a("HwDeviceHandleBtStateMg", "is support auto detect switch status and work mode");
            lnr lnrVarB = lmw.b();
            lnrVarB.e(deviceInfo.getDeviceIdentify());
            if (this.f41792b != null) {
                LogUtil.a("HwDeviceHandleBtStateMg", "start to get auto detect switch status and work mode");
                this.f41792b.b(deviceInfo.getDeviceBluetoothType(), lnrVarB);
            }
        }
        if (deviceCapability != null && deviceCapability.isSupportSettingRelated()) {
            h(deviceInfo);
            return;
        }
        if (deviceCapability != null && deviceCapability.isSupportZoneId()) {
            mkf.d().b(deviceInfo);
            return;
        }
        if (deviceCapability != null && deviceCapability.isSupportActivityType()) {
            deviceCapability.configureSupportActivityType(true);
            lnr lnrVarF = lmw.f();
            lnrVarF.e(deviceInfo.getDeviceIdentify());
            if (this.f41792b != null) {
                LogUtil.a("HwDeviceHandleBtStateMg", "Start to get device activity type info.");
                this.f41792b.b(deviceInfo.getDeviceBluetoothType(), lnrVarF);
                return;
            }
            return;
        }
        if (deviceCapability == null || !deviceCapability.isSupportMessageSupportInfo()) {
            LogUtil.j("HwDeviceHandleBtStateMg", "not supported activity and notification type");
            j(deviceInfo);
            return;
        }
        deviceCapability.configureSupportMessageSupportInfo(true);
        lnr lnrVarH = lmw.h();
        lnrVarH.e(deviceInfo.getDeviceIdentify());
        if (this.f41792b != null) {
            LogUtil.a("HwDeviceHandleBtStateMg", "start to get device notification type info.");
            this.f41792b.b(deviceInfo.getDeviceBluetoothType(), lnrVarH);
        }
    }

    private void h(DeviceInfo deviceInfo) {
        lnr lnrVarJ = lmw.j();
        lnrVarJ.e(deviceInfo.getDeviceIdentify());
        if (this.f41792b != null) {
            LogUtil.a("HwDeviceHandleBtStateMg", "start to get device setting type info.");
            this.f41792b.b(deviceInfo.getDeviceBluetoothType(), lnrVarJ);
        }
    }

    private void j(DeviceInfo deviceInfo) {
        LogUtil.a("HwDeviceHandleBtStateMg", "Enter handleHandshakeSuccess().");
        lof lofVar = this.f41792b;
        if (lofVar != null && !TextUtils.isEmpty(lofVar.b(deviceInfo.getDeviceIdentify()))) {
            LogUtil.a("HwDeviceHandleBtStateMg", "handleHandshakeSuccess add cancel");
            this.f41792b.a(deviceInfo.getDeviceIdentify());
            this.f41792b.c(deviceInfo.getDeviceIdentify());
            return;
        }
        mkb.c(deviceInfo.getDeviceIdentify(), false);
        String deviceIdentify = deviceInfo.getDeviceIdentify();
        if (TextUtils.isEmpty(deviceInfo.getUuid())) {
            deviceInfo.setUuid(deviceIdentify);
        }
        e(deviceInfo, deviceIdentify);
        String strG = mkb.g(deviceIdentify);
        if (!TextUtils.isEmpty(strG) && deviceInfo.getProductType() == 10) {
            LogUtil.a("HwDeviceHandleBtStateMg", "enter handleHandshakeSuccess() set device model:", strG);
            if (TextUtils.equals(strG, "PORSCHE DESIGN")) {
                deviceInfo.setDeviceName("PORSCHE DESIGN");
            }
        }
        c(deviceInfo, deviceIdentify);
    }

    private void c(DeviceInfo deviceInfo, String str) {
        int iA = f41790a.a(str, mkf.d().a());
        if (iA == -1) {
            LogUtil.a("HwDeviceHandleBtStateMg", "Device List do not has this device.");
            String strA = a();
            deviceInfo.setWearEngineDeviceId(strA);
            LogUtil.a("HwDeviceHandleBtStateMg", "handleHandshakeSuccess wearEngineDeviceId: " + strA);
            b(deviceInfo);
            return;
        }
        if (f41790a.d(str, mkf.d().a())) {
            LogUtil.a("HwDeviceHandleBtStateMg", "Device List has this device. current Mac Address equals active device Mac address.");
            b(deviceInfo, iA);
        } else {
            LogUtil.a("HwDeviceHandleBtStateMg", "Device List has this device. pre MacAddress do not equals current Mac address.");
            e(deviceInfo, iA);
        }
    }

    private void e(DeviceInfo deviceInfo, String str) {
        deviceInfo.setDeviceModel(mkb.i(str));
        deviceInfo.setCertModel(mkb.e(str));
        deviceInfo.setVersionType(mkb.m(str));
        deviceInfo.setBluetoothVersion(mkb.a(str));
        deviceInfo.setSoftVersion(mkb.h(str));
        deviceInfo.setUuid(mkb.x(str));
        deviceInfo.setPowerSaveModel(mkb.t(str));
        deviceInfo.setUdidFromDevice(mkb.p(str));
        deviceInfo.setUnConvertedUdid(mkb.s(str));
        DeviceCapability deviceCapabilityC = mkb.c(str);
        if (deviceCapabilityC != null) {
            deviceInfo.setSupportAccountSwitch(deviceCapabilityC.isSupportAccountSwitch() ? 1 : 0);
        }
        deviceInfo.setManufacture(mkb.o(str));
        deviceInfo.setDeviceUdid(mkb.j(str));
        deviceInfo.setHiLinkDeviceId(mkb.k(str));
        deviceInfo.setDeviceFactoryReset(mkb.f(str));
        String strB = mkb.b(str);
        LogUtil.a("HwDeviceHandleBtStateMg", "enter handleHandshakeSuccess() set device expandCapability:", strB);
        deviceInfo.setExpandCapability(strB);
    }

    public static String a() {
        return UUID.randomUUID().toString().replace(Constants.LINK, "").toUpperCase(Locale.ROOT);
    }

    private void b(DeviceInfo deviceInfo) {
        LogUtil.a("HwDeviceHandleBtStateMg", "Enter addDeviceInfoToList().");
        if (g(deviceInfo)) {
            LogUtil.j("HwDeviceHandleBtStateMg", "addDeviceInfoToList bluetoothSwitch off, return");
            return;
        }
        if (f41790a.a(deviceInfo.getDeviceIdentify(), mkf.d().a()) != -1) {
            LogUtil.a("HwDeviceHandleBtStateMg", "Find the same device during add device.");
            return;
        }
        if (!mkf.d().a().isEmpty()) {
            for (DeviceInfo deviceInfo2 : mkf.d().a()) {
                if (deviceInfo2.getDeviceActiveState() == 1 && !eel.d(deviceInfo2.getProductType()) && !eel.d(deviceInfo.getProductType()) && deviceInfo2.getDeviceIdentify().equals(deviceInfo.getDeviceIdentify())) {
                    LogUtil.a("HwDeviceHandleBtStateMg", "already has active device, and is not from user change,so return");
                    return;
                }
            }
        }
        String deviceIdentify = deviceInfo.getDeviceIdentify();
        LogUtil.a("HwDeviceHandleBtStateMg", "addDeviceIdentify:", BTDeviceMgrUtil.c().e(deviceIdentify), ",device model:", BTDeviceMgrUtil.c().e(deviceInfo.getDeviceModel()));
        mkb.f(deviceIdentify, deviceIdentify);
        mkb.e(deviceIdentify, 2);
        deviceInfo.setDeviceActiveState(1);
        deviceInfo.setDeviceConnectState(2);
        deviceInfo.setLastConnectedTime(System.currentTimeMillis());
        synchronized (mkf.d().e()) {
            if (f41790a.a(deviceIdentify, mkf.d().a()) != -1) {
                LogUtil.j("HwDeviceHandleBtStateMg", "already has the device,so return");
            } else {
                mkf.d().a().add(deviceInfo);
                d(deviceInfo);
            }
        }
    }

    private void d(DeviceInfo deviceInfo) {
        lof lofVar = this.f41792b;
        if (lofVar != null) {
            lofVar.c(deviceInfo.getDeviceIdentify(), deviceInfo.getNodeId(), deviceInfo.getDeviceName(), deviceInfo.getDeviceBluetoothType());
            this.f41792b.b(deviceInfo);
            this.f41792b.e(deviceInfo.getNodeId(), deviceInfo.getDeviceIdentify(), deviceInfo.getDeviceName(), deviceInfo.getDeviceBluetoothType());
        }
        f(deviceInfo);
        mkf.d().i();
        mxc.e().a(deviceInfo, false);
        d();
        mkd.d().d(deviceInfo);
    }

    public void d() {
        LogUtil.a("HwDeviceHandleBtStateMg", "sendDeviceListChangeBroadcast.");
        this.d.sendBroadcast(new Intent("com.huawei.bone.action.DEVICE_LIST_CHANGED"), LocalBroadcast.f36595c);
    }

    private void f(DeviceInfo deviceInfo) {
        LogUtil.a("HwDeviceHandleBtStateMg", "Enter sendConnectStatus");
        if (mkb.c(deviceInfo.getDeviceIdentify()).isSupportConnectStatus()) {
            lnr lnrVarC = lmw.c();
            lnrVarC.e(deviceInfo.getDeviceIdentify());
            if (this.f41792b != null) {
                LogUtil.a("HwDeviceHandleBtStateMg", "start to send connect status.");
                this.f41792b.b(deviceInfo.getDeviceBluetoothType(), lnrVarC);
                return;
            }
            return;
        }
        LogUtil.j("HwDeviceHandleBtStateMg", "not support connect status");
    }

    private void b(DeviceInfo deviceInfo, int i) {
        int iA;
        String deviceIdentify = deviceInfo.getDeviceIdentify();
        LogUtil.a("HwDeviceHandleBtStateMg", "handleDeviceEqualActiveDevice handleDeviceIdentify:", BTDeviceMgrUtil.c().e(deviceIdentify));
        mkb.f(deviceIdentify, deviceIdentify);
        int iR = mkb.r(deviceIdentify);
        List<DeviceInfo> listA = mkf.d().a();
        if (iR == -1 && (iA = mkf.d().a(deviceInfo.getDeviceIdentify())) != -1) {
            DeviceInfo deviceInfo2 = listA.get(iA);
            int productType = deviceInfo2.getProductType();
            mkb.c(deviceInfo2.getDeviceIdentify(), productType);
            if (productType == -1) {
                LogUtil.j("HwDeviceHandleBtStateMg", "list has this device but the product type is unknown.");
                return;
            }
            deviceInfo.setProductType(productType);
        }
        if (i < 0 || i >= listA.size()) {
            return;
        }
        String deviceName = listA.get(i).getDeviceName();
        if ("".equals(deviceName)) {
            String deviceName2 = deviceInfo.getDeviceName();
            LogUtil.d("HwDeviceHandleBtStateMg", "deviceName:", deviceName2);
            if (deviceName2 != null && !"".equals(deviceName2)) {
                listA.get(i).setDeviceName(deviceInfo.getDeviceName());
            } else {
                listA.get(i).setDeviceName(deviceInfo.getDeviceIdentify());
            }
        }
        if (deviceInfo.getDeviceName() != null && !deviceInfo.getDeviceName().equalsIgnoreCase(deviceName)) {
            LogUtil.a("HwDeviceHandleBtStateMg", "device name changed with name:", deviceInfo.getDeviceName());
            listA.get(i).setDeviceName(deviceInfo.getDeviceName());
            mkf.d().i();
        }
        if (g(deviceInfo)) {
            LogUtil.j("HwDeviceHandleBtStateMg", "handleDeviceEqualActiveDevice bluetoothSwitch off, return");
        } else {
            e(deviceInfo, i, deviceIdentify);
        }
    }

    private void e(DeviceInfo deviceInfo, int i) {
        int iA = mkf.d().a(deviceInfo.getDeviceIdentify());
        LogUtil.a("HwDeviceHandleBtStateMg", "handleDeviceUnequalActiveDevice activeDeviceIndex:", Integer.valueOf(iA));
        if (i != -1) {
            int productType = deviceInfo.getProductType();
            mkb.c(deviceInfo.getDeviceIdentify(), productType);
            if (productType == -1 && iA != -1) {
                LogUtil.a("HwDeviceHandleBtStateMg", "currentProductType is unknown.");
                int productType2 = mkf.d().a().get(iA).getProductType();
                mkb.c(deviceInfo.getDeviceIdentify(), productType2);
                if (productType2 == -1) {
                    LogUtil.j("HwDeviceHandleBtStateMg", "list has this device but the product type is unknown.");
                    return;
                }
                deviceInfo.setProductType(productType2);
            }
            if (deviceInfo.getDeviceName() != null) {
                if (!deviceInfo.getDeviceName().equalsIgnoreCase(mkf.d().a().get(i).getDeviceName())) {
                    LogUtil.a("HwDeviceHandleBtStateMg", "device name changed with name:", deviceInfo.getDeviceName());
                    mkf.d().a().get(i).setDeviceName(deviceInfo.getDeviceName());
                    mkf.d().i();
                }
            }
            if (g(deviceInfo)) {
                LogUtil.j("HwDeviceHandleBtStateMg", "handleDeviceUnequalActiveDevice bluetoothSwitch off, return");
                return;
            } else {
                b(deviceInfo, i, iA);
                return;
            }
        }
        LogUtil.j("HwDeviceHandleBtStateMg", "List do not has this device.");
    }

    private void b(DeviceInfo deviceInfo, int i, int i2) {
        String deviceIdentify = deviceInfo.getDeviceIdentify();
        LogUtil.a("HwDeviceHandleBtStateMg", "Wanted Device Identify:", BTDeviceMgrUtil.c().e(deviceIdentify));
        List<DeviceInfo> listA = mkf.d().a();
        if (i2 == -1 && i != -1) {
            LogUtil.a("HwDeviceHandleBtStateMg", "activeDeviceIndex do not exist and deviceInfoIndex exist.");
            listA.get(i).setDeviceActiveState(1);
            f41790a.c(deviceInfo, listA);
            if (this.f41792b != null) {
                LogUtil.a("HwDeviceHandleBtStateMg", "Start to set active device. Start to set current device.");
                this.f41792b.c(deviceInfo.getDeviceIdentify(), deviceInfo.getNodeId(), deviceInfo.getDeviceName(), deviceInfo.getDeviceBluetoothType());
                this.f41792b.b(deviceInfo);
            }
        } else {
            String deviceIdentify2 = listA.get(i2).getDeviceIdentify();
            LogUtil.a("HwDeviceHandleBtStateMg", "Active Device Identify:", BTDeviceMgrUtil.c().e(deviceIdentify2));
            if (!deviceIdentify2.equalsIgnoreCase(deviceIdentify)) {
                LogUtil.a("HwDeviceHandleBtStateMg", "active is unequal with wanted device so set active info.");
                listA.get(i2).setDeviceActiveState(0);
                listA.get(i).setDeviceActiveState(1);
            }
        }
        mkb.f(deviceIdentify, deviceIdentify);
        mkb.e(deviceIdentify, 2);
        deviceInfo.setDeviceConnectState(2);
        deviceInfo.setDeviceActiveState(1);
        deviceInfo.setLastConnectedTime(System.currentTimeMillis());
        a(deviceInfo, i);
        f(deviceInfo);
        mkf.d().i();
        mxc.e().a(deviceInfo, false);
        d();
        mkd.d().d(deviceInfo);
    }

    private void a(DeviceInfo deviceInfo, int i) {
        List<DeviceInfo> listA = mkf.d().a();
        listA.get(i).setDeviceModel(deviceInfo.getDeviceModel());
        listA.get(i).setCertModel(deviceInfo.getCertModel());
        listA.get(i).setVersionType(deviceInfo.getVersionType());
        listA.get(i).setBluetoothVersion(deviceInfo.getBluetoothVersion());
        listA.get(i).setSoftVersion(deviceInfo.getSoftVersion());
        listA.get(i).setUuid(deviceInfo.getUuid());
        listA.get(i).setDeviceIdType(deviceInfo.getDeviceIdType());
        listA.get(i).setPowerSaveModel(deviceInfo.getPowerSaveModel());
        listA.get(i).setUdidFromDevice(deviceInfo.getUdidFromDevice());
        listA.get(i).setUnConvertedUdid(deviceInfo.getUnConvertedUdid());
        listA.get(i).setSupportAccountSwitch(deviceInfo.getSupportAccountSwitch());
        listA.get(i).setDeviceConnectState(2);
        listA.get(i).setManufacture(deviceInfo.getManufacture());
        listA.get(i).setDeviceUdid(deviceInfo.getDeviceUdid());
        listA.get(i).setHiLinkDeviceId(deviceInfo.getHiLinkDeviceId());
        listA.get(i).setDeviceFactoryReset(deviceInfo.getDeviceFactoryReset());
        listA.get(i).setLastConnectedTime(System.currentTimeMillis());
        listA.get(i).setDeviceOtaPackageName(deviceInfo.getDeviceOtaPackageName());
        listA.get(i).setExpandCapability(deviceInfo.getExpandCapability());
        listA.get(i).setCountryCode(deviceInfo.getCountryCode());
        listA.get(i).setEmuiVersion(deviceInfo.getEmuiVersion());
        listA.get(i).setMultiLinkBleMac(deviceInfo.getMultiLinkBleMac());
    }

    private boolean g(DeviceInfo deviceInfo) {
        mkj mkjVar;
        if (mkf.d().f41798b.h() == 3 || (mkjVar = f41790a) == null) {
            return false;
        }
        mkjVar.e(deviceInfo, (byte[]) null, mkf.d().a());
        return true;
    }

    private void e(DeviceInfo deviceInfo, int i, String str) {
        if (mkf.d().a().get(i).getProductType() != deviceInfo.getProductType() && (deviceInfo.getProductType() == 3 || deviceInfo.getProductType() == 10)) {
            LogUtil.a("HwDeviceHandleBtStateMg", "change type:", deviceInfo.getDeviceName());
            mkf.d().a().get(i).setProductType(deviceInfo.getProductType());
            mkf.d().i();
        }
        lof lofVar = this.f41792b;
        if (lofVar != null) {
            lofVar.c(deviceInfo.getDeviceIdentify(), deviceInfo.getNodeId(), deviceInfo.getDeviceName(), deviceInfo.getDeviceBluetoothType());
        }
        mkf.d().a().get(i).setDeviceActiveState(1);
        a(deviceInfo, i);
        deviceInfo.setDeviceConnectState(2);
        deviceInfo.setLastConnectedTime(System.currentTimeMillis());
        mkb.e(str, 2);
        f(deviceInfo);
        mkf.d().i();
        mxc.e().a(deviceInfo, false);
        mkd.d().d(deviceInfo);
    }

    private void n(DeviceInfo deviceInfo, byte[] bArr) {
        if (lmw.e(this.d, deviceInfo.getDeviceProtocol(), bArr)) {
            LogUtil.a("HwDeviceHandleBtStateMg", "Get device activity type info send timeout.");
            f41790a.e(deviceInfo, bArr, mkf.d().a());
            return;
        }
        LogUtil.a("HwDeviceHandleBtStateMg", "Start to handle BT device supported activity type.");
        DeviceCapability deviceCapabilityC = mkb.c(deviceInfo.getDeviceIdentify());
        if (!lmw.c(bArr, deviceCapabilityC)) {
            LogUtil.j("HwDeviceHandleBtStateMg", "Get device activity type info fail.");
            f41790a.e(deviceInfo, bArr, mkf.d().a());
        } else {
            c(deviceInfo, bArr, deviceCapabilityC);
        }
    }

    private void c(DeviceInfo deviceInfo, byte[] bArr, DeviceCapability deviceCapability) {
        if (lmw.b(2, 5, bArr)) {
            if (deviceCapability != null) {
                deviceCapability.configureSupportMessageSupportInfo(true);
            }
            lnr lnrVarH = lmw.h();
            lnrVarH.e(deviceInfo.getDeviceIdentify());
            if (this.f41792b != null) {
                LogUtil.a("HwDeviceHandleBtStateMg", "Start to get device notification type info.");
                this.f41792b.b(deviceInfo.getDeviceBluetoothType(), lnrVarH);
                return;
            }
            return;
        }
        j(deviceInfo);
    }

    private void e(DeviceInfo deviceInfo, byte[] bArr) {
        if (lmw.e(this.d, deviceInfo.getDeviceProtocol(), bArr)) {
            LogUtil.a("HwDeviceHandleBtStateMg", "Get device notification type info send timeout.");
            f41790a.e(deviceInfo, bArr, mkf.d().a());
            return;
        }
        LogUtil.a("HwDeviceHandleBtStateMg", "Start to handle BT device supported notification type.");
        if (!lmw.e(bArr, mkb.c(deviceInfo.getDeviceIdentify()))) {
            LogUtil.j("HwDeviceHandleBtStateMg", "Get device notification type info fail.");
            f41790a.e(deviceInfo, bArr, mkf.d().a());
        } else {
            j(deviceInfo);
        }
    }

    private void b(DeviceInfo deviceInfo, byte[] bArr) {
        if (lmw.e(this.d, deviceInfo.getDeviceProtocol(), bArr)) {
            LogUtil.a("HwDeviceHandleBtStateMg", "handleAutoDetectSwitchStatusAndWorkMode isCommandTimeout true.");
            return;
        }
        boolean[] zArrB = lmw.b(deviceInfo, bArr);
        LogUtil.a("HwDeviceHandleBtStateMg", "handleAutoDetectSwitchStatusAndWorkMode workMode :", Integer.valueOf(deviceInfo.getAutoDetectSwitchStatus()));
        if (deviceInfo.getAutoDetectSwitchStatus() == 0) {
            if (a(deviceInfo)) {
                return;
            } else {
                LogUtil.a("HwDeviceHandleBtStateMg", "handleAutoDetectSwitchStatusAndWorkMode workMode after caseForAw70BandMode:", Integer.valueOf(deviceInfo.getAutoDetectSwitchStatus()));
            }
        } else if (deviceInfo.getAutoDetectSwitchStatus() != 1) {
            LogUtil.d("HwDeviceHandleBtStateMg", "else branch.");
        } else if (e(deviceInfo)) {
            return;
        } else {
            LogUtil.a("HwDeviceHandleBtStateMg", "handleAutoDetectSwitchStatusAndWorkMode workMode after caseForAw70RunMode:", Integer.valueOf(deviceInfo.getAutoDetectSwitchStatus()));
        }
        DeviceCapability deviceCapabilityC = mkb.c(deviceInfo.getDeviceIdentify());
        if (zArrB[0]) {
            LogUtil.a("HwDeviceHandleBtStateMg", "AutoDetectSwitchStatusAndWorkMode support auto detect!");
            deviceCapabilityC.configureSupportAutoDetectMode(true);
        } else {
            LogUtil.a("HwDeviceHandleBtStateMg", "AutoDetectSwitchStatusAndWorkMode Not support auto detect!");
            deviceCapabilityC.configureSupportAutoDetectMode(false);
        }
        if (zArrB[1]) {
            LogUtil.a("HwDeviceHandleBtStateMg", "AutoDetectSwitchStatusAndWorkMode support foot wear!");
            deviceCapabilityC.configureSupportFootWear(true);
        } else {
            LogUtil.a("HwDeviceHandleBtStateMg", "AutoDetectSwitchStatusAndWorkMode not support foot wear");
            deviceCapabilityC.configureSupportFootWear(false);
        }
    }

    private boolean a(DeviceInfo deviceInfo) {
        synchronized (mkf.d().e()) {
            for (DeviceInfo deviceInfo2 : mkf.d().a()) {
                LogUtil.d("HwDeviceHandleBtStateMg", "caseForAw70BandMode info :", deviceInfo2);
                if (deviceInfo2.getDeviceIdentify().equalsIgnoreCase(deviceInfo.getDeviceIdentify())) {
                    LogUtil.a("HwDeviceHandleBtStateMg", "caseForAw70BandMode update work mode.");
                    deviceInfo2.setAutoDetectSwitchStatus(0);
                }
            }
            mxg mxgVarB = mxg.b();
            for (DeviceInfo deviceInfo3 : mkf.d().a()) {
                if (deviceInfo3.getDeviceActiveState() == 1 && !deviceInfo3.getDeviceIdentify().equalsIgnoreCase(deviceInfo.getDeviceIdentify()) && !mxgVarB.e(deviceInfo3.getProductType(), deviceInfo3.getDeviceIdentify())) {
                    f41790a.b(deviceInfo3.getDeviceIdentify());
                    return f41790a.e(deviceInfo3, mkf.d().a());
                }
            }
            return mko.e(deviceInfo);
        }
    }

    private boolean e(DeviceInfo deviceInfo) {
        synchronized (mkf.d().e()) {
            for (DeviceInfo deviceInfo2 : mkf.d().a()) {
                LogUtil.d("HwDeviceHandleBtStateMg", "caseForAw70RunMode info :", deviceInfo2);
                if (deviceInfo2.getDeviceIdentify().equalsIgnoreCase(deviceInfo.getDeviceIdentify())) {
                    LogUtil.a("HwDeviceHandleBtStateMg", "caseForAw70RunMode update work mode in caseForAw70RunMode");
                    deviceInfo2.setAutoDetectSwitchStatus(1);
                }
            }
            f41790a.a(deviceInfo, mkf.d().a());
            mxg mxgVarB = mxg.b();
            for (DeviceInfo deviceInfo3 : mkf.d().a()) {
                if (deviceInfo3.getDeviceActiveState() == 1 && deviceInfo3.getAutoDetectSwitchStatus() == 1 && !deviceInfo3.getDeviceIdentify().equalsIgnoreCase(deviceInfo.getDeviceIdentify()) && !mxgVarB.e(deviceInfo3.getProductType(), deviceInfo3.getDeviceIdentify())) {
                    return f41790a.e(deviceInfo3, mkf.d().a());
                }
            }
            return false;
        }
    }

    private void g(DeviceInfo deviceInfo, byte[] bArr) {
        if (deviceInfo == null || bArr == null) {
            LogUtil.j("HwDeviceHandleBtStateMg", "btDeviceInfo dataContents is null");
        } else {
            if (lmw.e(this.d, deviceInfo.getDeviceProtocol(), bArr)) {
                LogUtil.a("HwDeviceHandleBtStateMg", "handleGetSetZoneId timeout.");
                return;
            }
            LogUtil.a("HwDeviceHandleBtStateMg", "Start to handleGetSetZoneId.");
            lmw.f(bArr);
            d(deviceInfo, mkb.c(deviceInfo.getDeviceIdentify()));
        }
    }

    private void d(DeviceInfo deviceInfo, DeviceCapability deviceCapability) {
        if (deviceCapability != null && deviceCapability.isSupportActivityType()) {
            lnr lnrVarF = lmw.f();
            lnrVarF.e(deviceInfo.getDeviceIdentify());
            if (this.f41792b != null) {
                LogUtil.a("HwDeviceHandleBtStateMg", "Start to get device activity type info.");
                this.f41792b.b(deviceInfo.getDeviceBluetoothType(), lnrVarF);
                return;
            }
            return;
        }
        if (deviceCapability != null && deviceCapability.isSupportMessageSupportInfo()) {
            lnr lnrVarH = lmw.h();
            lnrVarH.e(deviceInfo.getDeviceIdentify());
            if (this.f41792b != null) {
                LogUtil.a("HwDeviceHandleBtStateMg", "start to get device notification type info.");
                this.f41792b.b(deviceInfo.getDeviceBluetoothType(), lnrVarH);
                return;
            }
            return;
        }
        j(deviceInfo);
    }

    private void h(DeviceInfo deviceInfo, byte[] bArr) {
        if (lmw.e(this.d, deviceInfo.getDeviceProtocol(), bArr)) {
            LogUtil.a("HwDeviceHandleBtStateMg", "handleGetSetRelated timeout.");
            return;
        }
        DeviceCapability deviceCapabilityC = mkb.c(deviceInfo.getDeviceIdentify());
        lmw.b(bArr, deviceCapabilityC);
        if (deviceInfo.getDeviceFactoryReset() != 1) {
            LogUtil.a("HwDeviceHandleBtStateMg", "Start to handle handleGetSetRelated.");
            if (deviceCapabilityC != null && deviceCapabilityC.isSupportZoneId()) {
                mkf.d().b(deviceInfo);
                return;
            } else {
                d(deviceInfo, deviceCapabilityC);
                return;
            }
        }
        deviceInfo.setDeviceConnectState(11);
        mkd.d().d(deviceInfo);
    }

    private void e(DeviceInfo deviceInfo, int i, byte[] bArr) {
        byte b2 = bArr[0];
        if (b2 == 26 && bArr[1] == 5) {
            d(deviceInfo, bArr);
            return;
        }
        if (b2 == 26 && bArr[1] == 6) {
            l(deviceInfo, bArr);
            return;
        }
        if (b2 == 1 && bArr[1] == 55) {
            LogUtil.a("HwDeviceHandleBtStateMg", "Enter 5.1.55");
            a(deviceInfo, bArr);
            return;
        }
        if (b2 != 1 || bArr[1] != 48) {
            LogUtil.a("HwDeviceHandleBtStateMg", "handshake report data.");
            if (KitWearBinderUtil.a(deviceInfo, bArr)) {
                LogUtil.a("HwDeviceHandleBtStateMg", "isForThemeData");
                return;
            }
            if (mkf.d().d == null) {
                LogUtil.j("HwDeviceHandleBtStateMg", "mDeviceStateClientCallback is null.");
            } else {
                mkf.d().d.onDataReceived(deviceInfo, i, bArr);
            }
            ndb.b().a(deviceInfo, bArr);
            return;
        }
        LogUtil.a("HwDeviceHandleBtStateMg", "Enter 5.1.48");
        j(deviceInfo, bArr);
    }

    private void d(DeviceInfo deviceInfo, byte[] bArr) {
        if (lmw.e(this.d, deviceInfo.getDeviceProtocol(), bArr)) {
            LogUtil.a("HwDeviceHandleBtStateMg", "account judgment result time out.");
            f41790a.e(deviceInfo, bArr, mkf.d().a());
            return;
        }
        DeviceCapability deviceCapabilityC = mkb.c(deviceInfo.getDeviceIdentify());
        boolean zD = lmw.d(bArr);
        LogUtil.a("HwDeviceHandleBtStateMg", "start handle account judgment result. account judgment result:", Boolean.valueOf(zD));
        if (zD) {
            e(deviceInfo, deviceCapabilityC);
        } else {
            deviceInfo.setDeviceConnectState(9);
            mkd.d().d(deviceInfo);
        }
    }

    private void l(DeviceInfo deviceInfo, byte[] bArr) {
        if (lmw.e(this.d, deviceInfo.getDeviceProtocol(), bArr)) {
            LogUtil.a("HwDeviceHandleBtStateMg", "user select dialog time out.");
            f41790a.e(deviceInfo, bArr, mkf.d().a());
            return;
        }
        LogUtil.a("HwDeviceHandleBtStateMg", "start handle user select restore factory.");
        if (!lmw.h(bArr)) {
            LogUtil.j("HwDeviceHandleBtStateMg", "user cancel restore factory.");
            f41790a.e(deviceInfo, bArr, mkf.d().a());
        } else {
            deviceInfo.setDeviceConnectState(10);
            mkd.d().d(deviceInfo);
        }
    }

    private void a(DeviceInfo deviceInfo, byte[] bArr) {
        LogUtil.a("HwDeviceHandleBtStateMg", "enter handleGetExpandCapability.");
        if (lmw.e(this.d, deviceInfo.getDeviceProtocol(), bArr)) {
            LogUtil.a("HwDeviceHandleBtStateMg", "handleGetSendUserSetting timeout.");
            f41790a.e(deviceInfo, bArr, mkf.d().a());
            return;
        }
        LogUtil.a("HwDeviceHandleBtStateMg", "Start to handle handleGetExpandCapability.");
        String strC = cpf.c(lmw.c(bArr), mkb.i(deviceInfo.getDeviceIdentify()));
        LogUtil.a("HwDeviceHandleBtStateMg", "handleGetExpandCapability :", strC);
        mkb.b(deviceInfo.getDeviceIdentify(), strC);
        deviceInfo.setExpandCapability(strC);
        a(deviceInfo, mkb.c(deviceInfo.getDeviceIdentify()));
    }

    private void j(DeviceInfo deviceInfo, byte[] bArr) {
        LogUtil.a("HwDeviceHandleBtStateMg", "enter handleGetSendUserSetting.");
        if (lmw.e(this.d, deviceInfo.getDeviceProtocol(), bArr)) {
            LogUtil.a("HwDeviceHandleBtStateMg", "handleGetSendUserSetting timeout.");
            f41790a.e(deviceInfo, bArr, mkf.d().a());
            return;
        }
        LogUtil.a("HwDeviceHandleBtStateMg", "Start to handle handleGetSendUserSetting.");
        DeviceCapability deviceCapabilityC = mkb.c(deviceInfo.getDeviceIdentify());
        if (deviceCapabilityC != null && deviceCapabilityC.isSupportZoneId()) {
            mkf.d().b(deviceInfo);
        } else {
            d(deviceInfo, deviceCapabilityC);
        }
    }

    private void b(DeviceInfo deviceInfo, int i, byte[] bArr) {
        LogUtil.a("HwDeviceHandleBtStateMg", "not handshake report data.");
        if (KitWearBinderUtil.a(deviceInfo, bArr)) {
            LogUtil.a("HwDeviceHandleBtStateMg", "isForThemeData");
            return;
        }
        if (f41790a.e(deviceInfo, bArr)) {
            LogUtil.j("HwDeviceHandleBtStateMg", "otherCommandReceivedMethod retry 1.5");
            return;
        }
        if (mkf.d().d != null) {
            mkf.d().d.onDataReceived(deviceInfo, i, bArr);
        } else {
            LogUtil.j("HwDeviceHandleBtStateMg", "mDeviceStateClientCallback is null.");
        }
        ndb.b().a(deviceInfo, bArr);
        ncz nczVar = this.g;
        if (nczVar != null) {
            nczVar.a(deviceInfo, bArr);
        }
    }
}
