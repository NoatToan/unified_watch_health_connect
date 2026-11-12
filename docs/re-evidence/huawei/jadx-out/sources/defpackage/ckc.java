package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.os.Build;
import com.huawei.devicesdk.connect.handshake.HandshakeGeneralCommandBase;
import com.huawei.devicesdk.entity.DeviceInfo;
import com.huawei.devicesdk.entity.SendMode;
import com.huawei.haf.common.exception.ExceptionUtils;
import health.compact.a.LogUtil;
import health.compact.a.ReleaseLogUtil;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class ckc extends HandshakeGeneralCommandBase {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f1670b;
    private boolean e;

    public ckc(int i, boolean z) {
        this.f1670b = i;
        this.e = z;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x00c5  */
    @Override // com.huawei.devicesdk.connect.handshake.HandshakeGeneralCommandBase, com.huawei.devicesdk.connect.handshake.HandshakeCommandBase
    public cmg getDeviceCommand(DeviceInfo deviceInfo) {
        String strD;
        String strC;
        ByteBuffer byteBufferAllocate;
        String strB = b();
        String strA = a();
        String strC2 = c(deviceInfo);
        String str = cph.b(5) + cph.b(6) + cph.b(strC2);
        String strC3 = "";
        if (deviceInfo != null) {
            cpv.a(deviceInfo.getDeviceMac(), cph.b(strC2));
            byte[] bArrE = cjy.e();
            if (cni.b(deviceInfo.getDeviceMac())) {
                String strD2 = cph.d(cni.e());
                if (strD2 != null) {
                    strC = a(strD2, deviceInfo.getDeviceMac());
                    strD = cph.b(7) + cph.b(strD2.length() / 2) + strD2;
                }
            } else {
                String strE = cjy.e(this.f1670b, bArrE, deviceInfo);
                if (bArrE != null) {
                    strC = c(strE);
                    strD = d(strE);
                } else if (strE != null) {
                    strC = cph.b(6) + cph.b(strE.length() / 2) + strE;
                    strD = "";
                }
            }
            if (!cku.c(deviceInfo)) {
                strC3 = c();
            }
            byte[] bArrD = cph.d(strB + strA + str + strC + strD + strC3 + e());
            byteBufferAllocate = ByteBuffer.allocate(bArrD.length + 2);
            byteBufferAllocate.put((byte) 1).put((byte) 14);
            byteBufferAllocate.put(bArrD);
            if (deviceInfo == null && deviceInfo.getDeviceBtType() == 2) {
                return e(deviceInfo, byteBufferAllocate);
            }
            cmg unencryptedDeviceCommand = getUnencryptedDeviceCommand(deviceInfo);
            unencryptedDeviceCommand.a(byteBufferAllocate.array());
            ReleaseLogUtil.c("DEVMGR_BindRequestCommand", cku.d("010E"));
            return unencryptedDeviceCommand;
        }
        LogUtil.e("BindRequestCommand", "requestBindBTDevice deviceInfo is null");
        strD = "";
        strC = strD;
        if (!cku.c(deviceInfo)) {
            strC3 = c();
        }
        byte[] bArrD2 = cph.d(strB + strA + str + strC + strD + strC3 + e());
        byteBufferAllocate = ByteBuffer.allocate(bArrD2.length + 2);
        byteBufferAllocate.put((byte) 1).put((byte) 14);
        byteBufferAllocate.put(bArrD2);
        if (deviceInfo == null) {
        }
        cmg unencryptedDeviceCommand2 = getUnencryptedDeviceCommand(deviceInfo);
        unencryptedDeviceCommand2.a(byteBufferAllocate.array());
        ReleaseLogUtil.c("DEVMGR_BindRequestCommand", cku.d("010E"));
        return unencryptedDeviceCommand2;
    }

    @Override // com.huawei.devicesdk.connect.handshake.HandshakeGeneralCommandBase, com.huawei.devicesdk.connect.handshake.HandshakeCommandBase
    public cmh processReceivedData(DeviceInfo deviceInfo, cmm cmmVar) {
        cmh cmhVar = new cmh();
        if (!cku.d(deviceInfo, cmmVar)) {
            cmhVar.e(13);
            cmhVar.d(50114);
            return cmhVar;
        }
        ReleaseLogUtil.c("DEVMGR_BindRequestCommand", "processReceivedData Frames", cph.d(cmmVar.d()));
        int iA = a(cmmVar.d());
        if (iA == 1) {
            if (deviceInfo.getDeviceBtType() == 2) {
                cpv.d(deviceInfo.getDeviceMac(), cjy.d(deviceInfo.getDeviceMac()));
            }
            this.mNextCommand = new ckq(this.f1670b, !this.e);
            cmhVar.e(12);
            cmhVar.d(100000);
            return cmhVar;
        }
        ReleaseLogUtil.c("DEVMGR_BindRequestCommand", "not allow bond device", Integer.valueOf(iA));
        if (cni.b(deviceInfo.getDeviceMac())) {
            b(deviceInfo.getDeviceMac());
        }
        if (iA == 0 && deviceInfo.getDeviceBtType() == 2) {
            cmhVar.e(55);
            cmhVar.d(50114);
            return cmhVar;
        }
        cmhVar.e(13);
        cmhVar.d(50114);
        return cmhVar;
    }

    @Override // com.huawei.devicesdk.connect.handshake.HandshakeCommandBase
    public String getTag() {
        return "010E";
    }

    private String e() {
        if (cop.g()) {
            String strD = cpd.d(Build.MODEL);
            String strB = cph.b(strD);
            String str = (cph.b(10) + cph.c(strB.length() / 2) + strB) + (cph.b(11) + cph.b(1) + cph.b(10));
            LogUtil.b("BindRequestCommand", "get device mode type id:", strD, " extendParam:", str);
            return str;
        }
        return "";
    }

    private String c() {
        try {
            BluetoothAdapter bluetoothAdapterA = coi.b().a();
            if (bluetoothAdapterA != null) {
                String strB = cph.b(bluetoothAdapterA.getName());
                String strC = cph.c(strB.length() / 2);
                return cph.b(9) + strC + strB;
            }
            return "";
        } catch (SecurityException e) {
            LogUtil.d("BindRequestCommand", "getPhoneModelTlv SecurityException:", ExceptionUtils.c(e));
            return "";
        }
    }

    private static String b() {
        return cph.b(1) + cph.b(0);
    }

    private static String a() {
        return cph.b(3) + cph.b(1) + cph.b(0);
    }

    private String c(DeviceInfo deviceInfo) {
        String strB = cqf.b();
        if (deviceInfo != null) {
            String strD = cpv.d(deviceInfo.getDeviceMac());
            if (!"".equals(strD)) {
                strB = cph.a(strD);
            }
        }
        if (!this.e) {
            return strB;
        }
        String strE = cot.e();
        return (strE == null || strE.length() < 6) ? strE : strE.substring(strE.length() - 6);
    }

    private static String a(String str, String str2) {
        String strD;
        String strD2 = cph.d(cni.e());
        cnh.d().b(str2, strD2);
        cpv.e(str2, 1, cqo.a(strD2));
        cpv.e(str2, 2, cqo.a(strD2));
        String strB = cnh.d().b(str2);
        byte[] bArrD = cph.d(str);
        byte[] bArrD2 = cph.d(strB);
        cml cmlVarC = cnk.c().c(str2);
        if (cmlVarC != null && cmlVarC.e() == 1) {
            LogUtil.b("BindRequestCommand", "getBondKey encrypt ByGcm");
            strD = cph.d(ckg.d("AES/GCM/NoPadding", cph.d(strD2), bArrD2, bArrD));
        } else {
            strD = cph.d(ckg.d("AES/CBC/PKCS5Padding", cph.d(strD2), bArrD2, bArrD));
        }
        if (strD == null) {
            return strD;
        }
        return cph.b(6) + cph.b(strD.length() / 2) + strD;
    }

    private String d(String str) {
        if (str != null && str.length() > 64) {
            String strSubstring = str.substring(0, 32);
            return cph.b(7) + cph.b(strSubstring.length() / 2) + strSubstring;
        }
        LogUtil.d("BindRequestCommand", "getBtIv, key:null.");
        return "";
    }

    private String c(String str) {
        if (str != null && str.length() > 64) {
            return cku.e(str);
        }
        LogUtil.d("BindRequestCommand", "getBtBondKey, key:null.");
        return "";
    }

    private int a(byte[] bArr) {
        if (bArr == null) {
            LogUtil.e("BindRequestCommand", "parse data error, dataContent is null.");
            return 0;
        }
        cqb cqbVarE = cku.e(bArr);
        if (cqbVarE == null) {
            LogUtil.e("BindRequestCommand", "process data error, tlvFather is null");
            return 0;
        }
        List<cqa> listB = cqbVarE.b();
        if (listB != null) {
            for (cqa cqaVar : listB) {
                if (cpb.a(cqaVar.b()) == 2) {
                    return cpb.a(cqaVar.c());
                }
            }
        }
        return 0;
    }

    private void b(String str) {
        cpv.e(str, 1, "");
        cpv.e(str, 2, "");
    }

    private cmg e(DeviceInfo deviceInfo, ByteBuffer byteBuffer) {
        cmg cmgVar = new cmg();
        if (deviceInfo == null) {
            LogUtil.d("BindRequestCommand", "device info is empty when buildCommandMessage");
            return cmgVar;
        }
        cmgVar.d(SendMode.PROTOCOL_TYPE_5A);
        cmg.b bVar = new cmg.b();
        bVar.d(0);
        bVar.b(false);
        cmgVar.a(byteBuffer.array());
        return bVar.a(cmgVar);
    }
}
