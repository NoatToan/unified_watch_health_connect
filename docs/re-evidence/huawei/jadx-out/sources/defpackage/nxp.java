package defpackage;

import android.text.TextUtils;
import com.huawei.health.device.model.DeviceInformation;
import com.huawei.hms.kit.awareness.status.CapabilityStatus;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.LogAnonymous;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes12.dex */
public class nxp extends nxv {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private DeviceInformation f43905b = new DeviceInformation();

    public DeviceInformation d() {
        return this.f43905b;
    }

    public DeviceInformation b(byte[] bArr, int i) {
        String strB = b(bArr);
        if (this.f43905b != null) {
            switch (i) {
                case 20006:
                    LogUtil.d("Track_IDEQ_DisParser", "(FTMP_TS) parseDeviceInfoData: mManufacturerString:", strB);
                    this.f43905b.setManufacturerString(strB);
                    break;
                case 20007:
                    LogUtil.d("Track_IDEQ_DisParser", "(FTMP_TS) parseDeviceInfoData: mModelNumber:", strB);
                    this.f43905b.setModelString(strB);
                    break;
                case 20010:
                    LogUtil.d("Track_IDEQ_DisParser", "(FTMP_TS) parseDeviceInfoData: dataSerialNumber:");
                    this.f43905b.setSerialNumber(strB);
                    break;
                case CapabilityStatus.AWA_CAP_CODE_WIFI /* 20011 */:
                    LogUtil.a("Track_IDEQ_DisParser", "(FTMP_TS) parseDeviceInfoData: Hardware Revision String:", strB);
                    this.f43905b.setHardwareVersion(strB);
                    break;
                case CapabilityStatus.AWA_CAP_CODE_APPLICATION /* 20012 */:
                    LogUtil.a("Track_IDEQ_DisParser", "(FTMP_TS) parseDeviceInfoData: Software Revision StringRead:", strB);
                    this.f43905b.setSoftwareVersion(strB);
                    break;
                case 20015:
                    LogUtil.a("Track_IDEQ_DisParser", "(FTMP_TS) parseDeviceInfoData: Firmware Revision String:", strB);
                    this.f43905b.setFirmwareVersion(strB);
                    break;
                case 20016:
                    LogUtil.d("Track_IDEQ_DisParser", "(FTMP_TS) parseDeviceInfoData: System ID:", strB);
                    this.f43905b.setSystemId(strB);
                    break;
            }
        }
        return this.f43905b;
    }

    private String b(byte[] bArr) {
        String str;
        try {
            str = new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            LogUtil.e("Track_IDEQ_DisParser", LogAnonymous.b(e));
            str = "";
        }
        return !TextUtils.isEmpty(str) ? str.trim() : str;
    }

    public void d(String str, int i) {
        DeviceInformation deviceInformation;
        if (i != 20014 || (deviceInformation = this.f43905b) == null) {
            return;
        }
        deviceInformation.setBleDeviceName(str);
    }
}
