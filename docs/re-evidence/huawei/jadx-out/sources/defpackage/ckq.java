package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.common.base.Ascii;
import com.huawei.devicesdk.connect.handshake.HandshakeGeneralCommandBase;
import com.huawei.devicesdk.entity.DeviceInfo;
import com.huawei.hms.hihealth.HiHealthStatusCodes;
import com.huawei.hms.network.okhttp.PublicSuffixDatabase;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.operation.h5pro.jsmodules.device.MatterDataContans;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.BuildConfigProperties;
import health.compact.a.LogUtil;
import health.compact.a.ReleaseLogUtil;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class ckq extends HandshakeGeneralCommandBase {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f1685b;
    private boolean e;

    public ckq(boolean z) {
        this(0, z);
    }

    public ckq(int i, boolean z) {
        this.f1685b = i;
        this.e = z;
    }

    @Override // com.huawei.devicesdk.connect.handshake.HandshakeGeneralCommandBase, com.huawei.devicesdk.connect.handshake.HandshakeCommandBase
    public cmg getDeviceCommand(DeviceInfo deviceInfo) {
        ByteBuffer byteBufferAllocate;
        if (deviceInfo != null && deviceInfo.getDeviceBtType() == 0) {
            byte[] bArrE = clu.e();
            byteBufferAllocate = ByteBuffer.allocate(bArrE.length);
            byteBufferAllocate.put(bArrE);
        } else {
            int length = cku.c(deviceInfo) ? 4 : d().length;
            byteBufferAllocate = ByteBuffer.allocate((length * 2) + 2);
            byteBufferAllocate.put((byte) 1).put((byte) 7);
            for (int i = 0; i < length; i++) {
                byteBufferAllocate.put(d()[i]).put((byte) 0);
            }
        }
        BroadcastManagerUtil.e(BaseApplication.getContext(), d(deviceInfo));
        cmg deviceCommand = super.getDeviceCommand(deviceInfo);
        deviceCommand.a(byteBufferAllocate.array());
        ReleaseLogUtil.c("DEVMGR_GetDeviceVersionCommand", cku.d("0107"));
        return deviceCommand;
    }

    private Intent d(DeviceInfo deviceInfo) {
        Intent intent = new Intent("com.huawei.bone.action.CONNECTION_DATA_SYNC");
        Bundle bundle = new Bundle();
        bundle.putString(MatterDataContans.KEY_MAC_ADDRESS, deviceInfo.getDeviceMac());
        intent.putExtras(bundle);
        return intent;
    }

    @Override // com.huawei.devicesdk.connect.handshake.HandshakeGeneralCommandBase, com.huawei.devicesdk.connect.handshake.HandshakeCommandBase
    public cmh processReceivedData(DeviceInfo deviceInfo, cmm cmmVar) {
        cmh cmhVar = new cmh();
        if (!cku.d(deviceInfo, cmmVar)) {
            cmhVar.e(13);
            cmhVar.d(50107);
            return cmhVar;
        }
        byte[] bArrD = cmmVar.d();
        if (!cku.d(bArrD)) {
            if (this.e) {
                LogUtil.b("GetDeviceVersionCommand", "Resend 5.1.14 command");
                this.mNextCommand = new ckc(this.f1685b, true);
                cmhVar.e(12);
                cmhVar.d(100000);
                return cmhVar;
            }
            cmhVar.e(13);
            cmhVar.d(50107);
            return cmhVar;
        }
        if (!a(bArrD, deviceInfo)) {
            LogUtil.e("GetDeviceVersionCommand", "Get DeviceVersion processReceivedData Failed.");
            cmhVar.e(13);
            cmhVar.d(50107);
            return cmhVar;
        }
        cku.b(deviceInfo);
        if (!e(deviceInfo)) {
            ReleaseLogUtil.d("DEVMGR_GetDeviceVersionCommand", "not exist 0x15 hilink device id.");
            cmhVar.e(13);
            cmhVar.d(HiHealthStatusCodes.INVALID_ACTIVITY_TYPE_IN_ACTIVITY_RECORD);
            return cmhVar;
        }
        if (c(deviceInfo)) {
            LogUtil.b("GetDeviceVersionCommand", "Get DeviceVersion processReceivedData Success.");
            this.mNextCommand = new ckz(false);
            cmhVar.e(12);
            cmhVar.d(100000);
            return cmhVar;
        }
        ReleaseLogUtil.d("DEVMGR_GetDeviceVersionCommand", "not exist 0x09 sn.");
        cmhVar.e(13);
        cmhVar.d(HiHealthStatusCodes.INVALID_ACTIVITY_TYPE_IN_ACTIVITY_RECORD);
        return cmhVar;
    }

    @Override // com.huawei.devicesdk.connect.handshake.HandshakeCommandBase
    public String getTag() {
        return "0107";
    }

    private boolean a(byte[] bArr, DeviceInfo deviceInfo) {
        cqb cqbVarE = cku.e(bArr);
        if (cqbVarE == null) {
            LogUtil.e("GetDeviceVersionCommand", "tlvFather is null");
            return false;
        }
        for (cqa cqaVar : cqbVarE.b()) {
            int iA = cpb.a(cqaVar.b());
            String strC = cqaVar.c();
            LogUtil.b("GetDeviceVersionCommand", "the case is ", Integer.valueOf(cpb.a(cqaVar.b())));
            e(iA, strC, deviceInfo);
        }
        deviceInfo.setUdid(cpg.a(deviceInfo.getDeviceMac(), cph.a(deviceInfo.getDeviceSn())));
        return true;
    }

    private byte[] d() {
        return new byte[]{1, 2, 7, 9, 10, 17, 18, Ascii.SYN, Ascii.SUB, Ascii.GS, Ascii.RS, Ascii.US, 32, PublicSuffixDatabase.i, 34, 35};
    }

    private void e(int i, String str, DeviceInfo deviceInfo) {
        if (str == null) {
            return;
        }
        d(i, str, deviceInfo);
        b(i, str, deviceInfo);
        c(i, str, deviceInfo);
        a(i, str, deviceInfo);
        a(deviceInfo);
    }

    private void a(DeviceInfo deviceInfo) {
        cml cmlVarC = cnk.c().c(deviceInfo.getDeviceMac());
        LogUtil.b("GetDeviceVersionCommand", "getSingleFrameDevice: ", Integer.valueOf(cmlVarC.h()));
        deviceInfo.setSingleFrameDevice(cmlVarC.h());
    }

    private void d(int i, String str, DeviceInfo deviceInfo) {
        byte b2 = (byte) i;
        if (b2 == 1) {
            deviceInfo.setBtVersion(cph.a(str));
            return;
        }
        if (b2 == 3) {
            deviceInfo.setDeviceVersion(cph.a(str));
            return;
        }
        if (b2 == 7) {
            ReleaseLogUtil.c("DEVMGR_GetDeviceVersionCommand", "saveVersionRelateInfo deviceSoftVersion: ", cph.a(str));
            deviceInfo.setDeviceSoftVersion(cph.a(str));
            return;
        }
        if (b2 != 25) {
            switch (b2) {
                case 36:
                    deviceInfo.setDeviceEnterpriseVersion(cph.a(str));
                    break;
                case 37:
                    deviceInfo.setDeviceSplicingProductVersion(cph.a(str));
                    break;
                case 38:
                    deviceInfo.setDeviceOStVersion(cph.a(str));
                    break;
                case 39:
                    deviceInfo.setDeviceOtaSignatureLength(cpb.a(str));
                    break;
                case 40:
                    deviceInfo.setSaleInfo(cph.a(str));
                    break;
                case 41:
                    deviceInfo.setPsiSignature(cph.a(str));
                    break;
            }
            return;
        }
        deviceInfo.setDeviceSubProdId(cph.a(str));
    }

    private void b(int i, String str, DeviceInfo deviceInfo) {
        byte b2 = (byte) i;
        if (b2 == 2) {
            deviceInfo.setDeviceType(cpb.a(str));
            return;
        }
        if (b2 == 10) {
            deviceInfo.setDeviceMode(cph.a(str));
            return;
        }
        if (b2 == 14) {
            deviceInfo.setIdToServerType(cpb.a(str));
            return;
        }
        if (b2 == 22) {
            deviceInfo.setDeviceBtMode(cph.a(str));
            return;
        }
        if (b2 == 26) {
            deviceInfo.setDeviceVersionType(cpb.a(str));
        } else if (b2 == 17) {
            deviceInfo.setCertMode(cph.a(str));
        } else {
            if (b2 != 18) {
                return;
            }
            deviceInfo.setPowerSaveMode(cpb.a(str));
        }
    }

    private void c(int i, String str, DeviceInfo deviceInfo) {
        byte b2 = (byte) i;
        if (b2 == 9) {
            deviceInfo.setDeviceSn(str);
            return;
        }
        if (b2 == 12) {
            String strA = cph.a(str);
            ReleaseLogUtil.c("DEVMGR_GetDeviceVersionCommand", "5.1.7 deviceName is ", strA);
            deviceInfo.setDeviceName(strA);
            return;
        }
        if (b2 == 15) {
            LogUtil.b("GetDeviceVersionCommand", "OTA package name is: ", cph.a(str));
            deviceInfo.setDeviceOtaPackageName(cph.a(str));
            return;
        }
        if (b2 == 27) {
            deviceInfo.setSportVersion(cpb.a(str));
            return;
        }
        if (b2 == 20) {
            int iA = cpb.a(str);
            LogUtil.b("GetDeviceVersionCommand", "Device Ota Area Type:", Integer.valueOf(iA));
            deviceInfo.setDeviceOtaAreaType(iA);
            return;
        }
        if (b2 != 21) {
            switch (b2) {
                case 29:
                    deviceInfo.setDfxDeviceUdid(cph.a(str));
                    break;
                case 30:
                    deviceInfo.setDfxDeviceUdidParameter(cph.a(str));
                    break;
                case 31:
                    deviceInfo.setDeviceFactoryReset(cpb.a(str));
                    break;
                case 32:
                    deviceInfo.setCountryCode(cph.a(str));
                    break;
                case 33:
                    deviceInfo.setEmuiVersion(cph.a(str));
                    break;
                case 34:
                    deviceInfo.setMultiLinkBleMac(cph.a(str));
                    break;
                case 35:
                    a(str, deviceInfo);
                    break;
            }
            return;
        }
        deviceInfo.setDeviceHilinkId(cqn.a(deviceInfo.getDeviceType(), cph.a(str)));
    }

    private void a(int i, String str, DeviceInfo deviceInfo) {
        switch ((byte) i) {
            case 42:
                deviceInfo.setDeviceFid(cph.a(str));
                break;
            case 43:
                deviceInfo.setOsType(cpb.a(str));
                break;
            case 44:
                deviceInfo.setApiVersion(cpb.a(str));
                break;
            case 45:
                deviceInfo.setAbi(cph.a(str));
                break;
        }
    }

    private void a(String str, DeviceInfo deviceInfo) {
        List<String> listAsList = Arrays.asList(str.split("2C"));
        for (int i = 0; i < listAsList.size(); i++) {
            if (i == 0 || i == 1) {
                String str2 = listAsList.get(i);
                if (str2.endsWith("00") && str2.length() > 2) {
                    listAsList.set(i, str2.substring(0, str2.length() - 2));
                }
            }
        }
        deviceInfo.setFieldList(listAsList);
        LogUtil.b("GetDeviceVersionCommand", "the arrayList size is ", Integer.valueOf(listAsList.size()));
    }

    private boolean e(DeviceInfo deviceInfo) {
        if (!BuildConfigProperties.a("IS_RELEASE_VERSION", false) && deviceInfo.getDeviceType() >= 55) {
            String deviceHilinkId = deviceInfo.getDeviceHilinkId();
            if (TextUtils.isEmpty(deviceHilinkId) || deviceHilinkId.length() == 0) {
                LogUtil.b("GetDeviceVersionCommand", "isExistHiLinkDeviceId not exist hilink device id.");
                return false;
            }
            if (deviceHilinkId.length() != 4) {
                LogUtil.b("GetDeviceVersionCommand", "isExistHiLinkDeviceId hilinkDeviceId length is error.");
                return false;
            }
        }
        LogUtil.b("GetDeviceVersionCommand", "isExistHiLinkDeviceId exist hilink device id.");
        return true;
    }

    private boolean c(DeviceInfo deviceInfo) {
        if (!BuildConfigProperties.a("IS_RELEASE_VERSION", false) && deviceInfo.getDeviceType() >= 72 && deviceInfo.getDeviceType() != 75 && TextUtils.isEmpty(deviceInfo.getDeviceSn())) {
            LogUtil.e("GetDeviceVersionCommand", "sn is invalid.");
            return false;
        }
        LogUtil.b("GetDeviceVersionCommand", "isExistSn new device sn is empty, Pairing is not allowed.");
        return true;
    }
}
