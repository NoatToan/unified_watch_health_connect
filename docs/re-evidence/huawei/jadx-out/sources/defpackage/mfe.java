package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.datatype.DataDeviceInfo;
import com.huawei.datatype.DeviceCommand;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwbtsdk.btcommon.BTDeviceMgrUtil;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.outofprocess.util.HwWatchFaceUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwversionmgr.manager.HwVersionManager;
import com.huawei.operation.utils.Constants;
import java.nio.ByteBuffer;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class mfe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f41600a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static mfe f41601b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static DataDeviceInfo f41602c;
    private static DataDeviceInfo e;
    private String h;
    private eet f = new eet();
    private Context d = BaseApplication.getContext();

    private mfe() {
    }

    public static mfe d() {
        mfe mfeVar;
        synchronized (f41600a) {
            if (f41601b == null) {
                f41601b = new mfe();
            }
            mfeVar = f41601b;
        }
        return mfeVar;
    }

    public void a(IBaseResponseCallback iBaseResponseCallback) {
        d("", iBaseResponseCallback);
    }

    public void d(String str, IBaseResponseCallback iBaseResponseCallback) {
        ByteBuffer byteBufferC;
        DeviceInfo deviceInfoD;
        LogUtil.a("DeviceVersionInfoSetting", "getFirmwareVersion() mDataDeviceInfo :  ", f41602c, " callback :", iBaseResponseCallback == null ? Constants.NULL : iBaseResponseCallback);
        DataDeviceInfo dataDeviceInfo = f41602c;
        if (!TextUtils.isEmpty(str) && (deviceInfoD = mgi.d("DeviceVersionInfoSetting")) != null && str.equals(deviceInfoD.getDeviceIdentify())) {
            LogUtil.a("DeviceVersionInfoSetting", "aw70DeviceInfo: ", BTDeviceMgrUtil.c().e(deviceInfoD.getDeviceIdentify()));
            dataDeviceInfo = e;
        }
        if (dataDeviceInfo != null && (TextUtils.isEmpty(str) || (str.equals(dataDeviceInfo.getDeviceBtMac()) && !TextUtils.isEmpty(dataDeviceInfo.getDeviceModel())))) {
            if (iBaseResponseCallback != null) {
                iBaseResponseCallback.a(0, dataDeviceInfo);
                return;
            }
            return;
        }
        synchronized (f41600a) {
            DeviceCommand deviceCommand = new DeviceCommand();
            deviceCommand.setServiceID(1);
            deviceCommand.setCommandID(7);
            deviceCommand.setPriority(2);
            if (!TextUtils.isEmpty(str)) {
                deviceCommand.setmIdentify(str);
            }
            if (b() == 0) {
                byteBufferC = ByteBuffer.allocate(2);
                byteBufferC.put((byte) 2);
                byteBufferC.put((byte) 0);
            } else {
                byteBufferC = c();
            }
            d(deviceCommand, byteBufferC, 7, iBaseResponseCallback, true);
        }
    }

    private void d(DeviceCommand deviceCommand, ByteBuffer byteBuffer, int i, IBaseResponseCallback iBaseResponseCallback, boolean z) {
        if (iBaseResponseCallback != null && z) {
            luh.a(i, iBaseResponseCallback);
        }
        deviceCommand.setDataLen(byteBuffer.array().length);
        deviceCommand.setDataContent(byteBuffer.array());
        lvb.e().c(deviceCommand);
    }

    private ByteBuffer c() {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(22);
        byteBufferAllocate.put((byte) 1);
        byteBufferAllocate.put((byte) 0);
        byteBufferAllocate.put((byte) 2);
        byteBufferAllocate.put((byte) 0);
        byteBufferAllocate.put((byte) 3);
        byteBufferAllocate.put((byte) 0);
        byteBufferAllocate.put((byte) 4);
        byteBufferAllocate.put((byte) 0);
        byteBufferAllocate.put((byte) 5);
        byteBufferAllocate.put((byte) 0);
        byteBufferAllocate.put((byte) 6);
        byteBufferAllocate.put((byte) 0);
        e(byteBufferAllocate);
        return byteBufferAllocate;
    }

    private void e(ByteBuffer byteBuffer) {
        byteBuffer.put((byte) 7);
        byteBuffer.put((byte) 0);
        byteBuffer.put((byte) 8);
        byteBuffer.put((byte) 0);
        byteBuffer.put((byte) 9);
        byteBuffer.put((byte) 0);
        byteBuffer.put((byte) 10);
        byteBuffer.put((byte) 0);
        byteBuffer.put((byte) 11);
        byteBuffer.put((byte) 0);
    }

    public Object a(String str, byte[] bArr) {
        DeviceInfo deviceInfoC = mgg.c(str, "DeviceVersionInfoSetting");
        DeviceInfo deviceInfoC2 = mgi.c("DeviceVersionInfoSetting");
        if (str != null && deviceInfoC != null && str.equals(deviceInfoC.getDeviceIdentify())) {
            return d(bArr, str);
        }
        if (str == null || deviceInfoC2 == null || !str.equals(deviceInfoC2.getDeviceIdentify())) {
            LogUtil.a("DeviceVersionInfoSetting", "device is invalid");
            return null;
        }
        return c(bArr, str);
    }

    private Object d(byte[] bArr, String str) {
        Object objA;
        LogUtil.a("DeviceVersionInfoSetting", "Enter caseForNotAw70Device");
        synchronized (f41600a) {
            DataDeviceInfo dataDeviceInfo = new DataDeviceInfo();
            f41602c = dataDeviceInfo;
            dataDeviceInfo.setDeviceOtaPackageName("");
            HwVersionManager.b(this.d).p("");
            if (b() == 0) {
                String strD = "";
                if (bArr.length > 3 && bArr[2] == 127) {
                    LogUtil.e("DeviceVersionInfoSetting", "getResult() get V0 device version info timeout.");
                } else {
                    strD = d(bArr);
                }
                f41602c.setDeviceSoftVersion(strD);
                objA = f41602c;
            } else {
                objA = a(bArr, str);
            }
        }
        return objA;
    }

    private String d(byte[] bArr) {
        LogUtil.a("DeviceVersionInfoSetting", "Enter getV0DeviceVersion().");
        if (bArr == null) {
            LogUtil.e("DeviceVersionInfoSetting", "Parameter is incorrect.");
            return "";
        }
        if (14 != bArr.length) {
            LogUtil.e("DeviceVersionInfoSetting", "V0 device version info is incorrect.");
            return "";
        }
        String strE = eeq.e(bArr);
        if (TextUtils.isEmpty(strE)) {
            LogUtil.j("DeviceVersionInfoSetting", "getDeviceVersion dataInfo is null");
            return "";
        }
        try {
            if (strE.length() < 26) {
                LogUtil.e("DeviceVersionInfoSetting", "getDeviceVersion invalid data");
                return "";
            }
            return String.valueOf(Integer.parseInt(strE.substring(6, 8), 16) / 100) + String.valueOf(Integer.parseInt(strE.substring(8, 10), 16)) + "." + String.format(Locale.ENGLISH, "%02X.", Integer.valueOf(Integer.parseInt(strE.substring(10, 14), 16))) + String.format(Locale.ENGLISH, "%02X.", Integer.valueOf(Integer.parseInt(strE.substring(14, 18), 16))) + String.format(Locale.ENGLISH, "%02X.", Integer.valueOf(Integer.parseInt(strE.substring(18, 22), 16))) + String.format(Locale.ENGLISH, "%02X", Integer.valueOf(Integer.parseInt(strE.substring(22, 26), 16)));
        } catch (NumberFormatException e2) {
            LogUtil.a("DeviceVersionInfoSetting", "getDeviceVersion NumberFormatException", e2.getMessage());
            return "";
        }
    }

    private Object a(byte[] bArr, String str) {
        try {
            String strE = eeq.e(bArr);
            if (strE != null && strE.length() >= 4) {
                ees eesVarB = this.f.b(strE.substring(4, strE.length()));
                c(eesVarB, str);
                c(eesVarB);
                return f41602c;
            }
            LogUtil.j("DeviceVersionInfoSetting", "getString() in valid data");
            return null;
        } catch (eeu e2) {
            LogUtil.e("DeviceVersionInfoSetting", "Exception = " + e2.getMessage());
            return null;
        }
    }

    private void c(ees eesVar, String str) {
        for (eew eewVar : eesVar.e()) {
            try {
                switch (Integer.parseInt(eewVar.e(), 16)) {
                    case 1:
                        f41602c.setBtVersion(eeq.d(eewVar.b()));
                        break;
                    case 2:
                        f41602c.setDeviceType(Integer.parseInt(eewVar.b(), 16));
                        break;
                    case 3:
                        f41602c.setDeviceVersion(eeq.d(eewVar.b()));
                        break;
                    case 4:
                        f41602c.setDevicePhoneNumber(eeq.d(eewVar.b()));
                        break;
                    case 5:
                        f41602c.setDeviceBtMac(eeq.d(eewVar.b()));
                        break;
                    case 6:
                        f41602c.setDeviceImei(eeq.d(eewVar.b()));
                        break;
                    case 7:
                        f41602c.setDeviceSoftVersion(eeq.d(eewVar.b()));
                        b(eewVar, str);
                        break;
                    default:
                        Object[] objArr = new Object[1];
                        objArr[0] = "enter setDeviceBaseAttribute default branch";
                        LogUtil.a("DeviceVersionInfoSetting", objArr);
                        break;
                }
            } catch (NumberFormatException e2) {
                LogUtil.a("DeviceVersionInfoSetting", "setDeviceBaseAttribute NumberFormatException", e2.getMessage());
            }
        }
    }

    private void b(eew eewVar, String str) {
        boolean zD = eey.d(mgg.c(str, "DeviceVersionInfoSetting"), 58);
        LogUtil.a("DeviceVersionInfoSetting", "setBandDeviceVersion isSupportDetect :", Boolean.valueOf(zD));
        DeviceCapability deviceCapabilityA = eej.a(str);
        if (zD || (deviceCapabilityA != null && deviceCapabilityA.isOtaUpdate())) {
            HwVersionManager.b(this.d).e(str, eeq.d(eewVar.b()));
            LogUtil.a("DeviceVersionInfoSetting", "support OTA set device version :", eeq.d(eewVar.b()));
        }
        if (deviceCapabilityA == null || !deviceCapabilityA.isSupportWatchFace()) {
            return;
        }
        HwWatchFaceUtil.d().c(eeq.d(eewVar.b()));
        LogUtil.a("DeviceVersionInfoSetting", "support WatchFace ,set device version :" + eeq.d(eewVar.b()));
    }

    private void c(ees eesVar) {
        for (eew eewVar : eesVar.e()) {
            try {
                int i = Integer.parseInt(eewVar.e(), 16);
                if (i == 15) {
                    f41602c.setDeviceOtaPackageName(eeq.d(eewVar.b()));
                    LogUtil.a("DeviceVersionInfoSetting", "setDeviceOtaPackageName :", eeq.d(eewVar.b()));
                } else if (i != 20) {
                    switch (i) {
                        case 8:
                            f41602c.setDeviceOpenSourceVersion(eeq.d(eewVar.b()));
                            break;
                        case 9:
                            f41602c.setDeviceSn(eeq.d(eewVar.b()));
                            break;
                        case 10:
                            f41602c.setDeviceModel(eeq.d(eewVar.b()));
                            this.h = eeq.d(eewVar.b());
                            break;
                        case 11:
                            f41602c.setDeviceEmmcId(eeq.d(eewVar.b()));
                            break;
                        default:
                            Object[] objArr = new Object[1];
                            objArr[0] = "enter setDeviceAttribute default branch";
                            LogUtil.a("DeviceVersionInfoSetting", objArr);
                            break;
                    }
                } else {
                    HwVersionManager.b(this.d).p(String.valueOf(Integer.parseInt(eewVar.b(), 16)));
                    LogUtil.a("DeviceVersionInfoSetting", "setOtaVersionSupport :", Integer.valueOf(Integer.parseInt(eewVar.b(), 16)));
                }
            } catch (NumberFormatException e2) {
                LogUtil.a("DeviceVersionInfoSetting", "setDeviceAttribute NumberFormatException", e2.getMessage());
            }
        }
    }

    private Object c(byte[] bArr, String str) {
        LogUtil.a("DeviceVersionInfoSetting", "enter caseForAw70Device method");
        try {
            e = new DataDeviceInfo();
            String strE = eeq.e(bArr);
            if (strE != null && strE.length() >= 4) {
                ees eesVarB = this.f.b(strE.substring(4, strE.length()));
                b(eesVarB);
                a(eesVarB, str);
                return e;
            }
            LogUtil.j("DeviceVersionInfoSetting", "getString() in valid data");
            return null;
        } catch (eeu e2) {
            LogUtil.e("DeviceVersionInfoSetting", "Exception tlvException:  ", e2.getMessage());
        }
    }

    private void b(ees eesVar) {
        for (eew eewVar : eesVar.e()) {
            try {
                switch (Integer.parseInt(eewVar.e(), 16)) {
                    case 1:
                        e.setBtVersion(eeq.d(eewVar.b()));
                        break;
                    case 2:
                        e.setDeviceType(Integer.parseInt(eewVar.b(), 16));
                        break;
                    case 3:
                        e.setDeviceVersion(eeq.d(eewVar.b()));
                        break;
                    case 4:
                        e.setDevicePhoneNumber(eeq.d(eewVar.b()));
                        break;
                    case 5:
                        e.setDeviceBtMac(eeq.d(eewVar.b()));
                        break;
                    case 6:
                        e.setDeviceImei(eeq.d(eewVar.b()));
                        break;
                    default:
                        Object[] objArr = new Object[1];
                        objArr[0] = "setAw70DeviceBaseAttribute Enter default branch";
                        LogUtil.a("DeviceVersionInfoSetting", objArr);
                        break;
                }
            } catch (NumberFormatException e2) {
                LogUtil.a("DeviceVersionInfoSetting", "setAw70DeviceBaseAttribute NumberFormatException", e2.getMessage());
            }
        }
    }

    private void a(ees eesVar, String str) {
        for (eew eewVar : eesVar.e()) {
            try {
                switch (Integer.parseInt(eewVar.e(), 16)) {
                    case 7:
                        e.setDeviceSoftVersion(eeq.d(eewVar.b()));
                        HwVersionManager.b(this.d).e(str, eeq.d(eewVar.b()));
                        break;
                    case 8:
                        e.setDeviceOpenSourceVersion(eeq.d(eewVar.b()));
                        break;
                    case 9:
                        e.setDeviceSn(eeq.d(eewVar.b()));
                        break;
                    case 10:
                        e.setDeviceModel(eeq.d(eewVar.b()));
                        this.h = eeq.d(eewVar.b());
                        break;
                    case 11:
                        e.setDeviceEmmcId(eeq.d(eewVar.b()));
                        break;
                    default:
                        Object[] objArr = new Object[1];
                        objArr[0] = "setAw70DeviceAttribute Enter default branch";
                        LogUtil.a("DeviceVersionInfoSetting", objArr);
                        break;
                }
            } catch (NumberFormatException e2) {
                LogUtil.a("DeviceVersionInfoSetting", "setAw70DeviceAttribute NumberFormatException", e2.getMessage());
            }
        }
    }

    private int b() {
        DeviceInfo deviceInfoC = mgg.c("DeviceVersionInfoSetting");
        if (deviceInfoC != null) {
            return deviceInfoC.getDeviceProtocol();
        }
        return -1;
    }

    public void a() {
        i();
    }

    private static void i() {
        f41602c = null;
    }

    public void e() {
        f();
    }

    private static void f() {
        e = null;
    }

    public void d(DeviceInfo deviceInfo) {
        Map<String, DeviceCapability> mapD;
        if (deviceInfo == null || TextUtils.isEmpty(deviceInfo.getDeviceIdentify()) || (mapD = lvb.e().d(1, deviceInfo.getDeviceIdentify(), "DeviceVersionInfoSetting")) == null) {
            return;
        }
        DeviceCapability deviceCapability = mapD.get(deviceInfo.getDeviceIdentify());
        if (deviceCapability == null || !deviceCapability.isSupportGetFirmwareVersion()) {
            LogUtil.e("DeviceVersionInfoSetting", "autoSetUp not Support GetFirmwareVersion");
        } else {
            a(new IBaseResponseCallback() { // from class: mfc
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i, Object obj) {
                    LogUtil.a("DeviceVersionInfoSetting", "autoSendCommend getFirmwareVersion response: " + obj);
                }
            });
        }
    }
}
