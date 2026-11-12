package defpackage;

import android.text.TextUtils;
import com.huawei.appgallery.agd.api.AgdConstant;
import com.huawei.devicesdk.connect.handshake.HandshakeGeneralCommandBase;
import com.huawei.devicesdk.entity.DeviceInfo;
import health.compact.a.LogUtil;
import health.compact.a.ReleaseLogUtil;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class ckd extends HandshakeGeneralCommandBase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f1671a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f1672b;
    private cml d;
    private String e;

    public ckd(String str, String str2, cml cmlVar) {
        this.e = str2;
        this.f1672b = str;
        this.d = cmlVar;
    }

    @Override // com.huawei.devicesdk.connect.handshake.HandshakeGeneralCommandBase, com.huawei.devicesdk.connect.handshake.HandshakeCommandBase
    public cmg getDeviceCommand(DeviceInfo deviceInfo) {
        if (this.d == null || this.f1672b == null || this.e == null || deviceInfo == null) {
            LogUtil.e("AccessValidityAuthCommand", "getDeviceCommand error, parameter check is null");
            return super.getDeviceCommand(deviceInfo);
        }
        String str = cph.b(1) + cph.b(19) + (cph.b(1) + cph.b(this.f1672b.length() / 2) + this.f1672b) + (cph.b(2) + cph.b((this.e.length() / 2) + 2) + cph.d(this.d.b()) + this.e);
        if (cni.b(deviceInfo.getDeviceMac())) {
            str = str + (cph.b(3) + cph.b(1) + cph.b(cnh.d().c(deviceInfo.getDeviceMac())));
        }
        byte[] bArrD = cph.d(str);
        cmg unencryptedDeviceCommand = getUnencryptedDeviceCommand(deviceInfo);
        unencryptedDeviceCommand.a(bArrD);
        ReleaseLogUtil.c("DEVMGR_AccessValidityAuthCommand", cku.d("0113"));
        return unencryptedDeviceCommand;
    }

    @Override // com.huawei.devicesdk.connect.handshake.HandshakeGeneralCommandBase, com.huawei.devicesdk.connect.handshake.HandshakeCommandBase
    public cmh processReceivedData(DeviceInfo deviceInfo, cmm cmmVar) {
        cmh cmhVar = new cmh();
        if (!cku.d(deviceInfo, cmmVar)) {
            cmhVar.e(13);
            cmhVar.d(50119);
            return cmhVar;
        }
        cqb cqbVarE = cku.e(cmmVar.d());
        if (cqbVarE == null || coq.d(cqbVarE.b())) {
            LogUtil.e("AccessValidityAuthCommand", "parse Data To Tlv failed");
            cmhVar.e(13);
            cmhVar.d(50119);
            return cmhVar;
        }
        Iterator<cqa> it = cqbVarE.b().iterator();
        if (it.hasNext()) {
            cqa next = it.next();
            int iA = cpb.a(next.b());
            if (iA == 1) {
                return d(deviceInfo, next.c());
            }
            if (iA != 127) {
                LogUtil.d("AccessValidityAuthCommand", "Unknown type : ", next.b());
                cmhVar.e(13);
                cmhVar.d(50119);
                return cmhVar;
            }
            return a(deviceInfo, cpb.a(next.c()));
        }
        cmhVar.e(13);
        cmhVar.d(50119);
        return cmhVar;
    }

    @Override // com.huawei.devicesdk.connect.handshake.HandshakeCommandBase
    public String getTag() {
        return "0113";
    }

    private cmh a(DeviceInfo deviceInfo, int i) {
        ReleaseLogUtil.b("DEVMGR_AccessValidityAuthCommand", "Error code is : ", Integer.valueOf(i));
        cmh cmhVar = new cmh();
        String deviceMac = deviceInfo.getDeviceMac();
        if (!cni.b(deviceInfo.getDeviceMac())) {
            LogUtil.d("AccessValidityAuthCommand", "Error code is : ", Integer.valueOf(i));
            cku.a(deviceMac);
            cmhVar.e(13);
            cmhVar.d(50119);
            return cmhVar;
        }
        if (i == 100012) {
            cpv.d();
            LogUtil.d("AccessValidityAuthCommand", "key lost");
            cmhVar.e(14);
            cmhVar.d(50119);
            return cmhVar;
        }
        if (i == 100011) {
            String strD = cni.d(deviceMac, 1);
            cnh.d().d(strD, deviceMac);
            cpv.e(deviceMac, 2, cqo.a(strD));
            if (TextUtils.isEmpty(strD)) {
                LogUtil.d("AccessValidityAuthCommand", "key lost");
                cpv.d();
                cmhVar.e(14);
                cmhVar.d(50119);
                return cmhVar;
            }
            if (this.d != null) {
                this.mNextCommand = new ckd(cph.d(cni.d(strD + "0100", this.d.g() + this.e)), this.e, this.d);
                cmhVar.e(12);
                cmhVar.d(100000);
                return cmhVar;
            }
        }
        cku.a(deviceMac);
        cmhVar.e(13);
        cmhVar.d(50119);
        return cmhVar;
    }

    private cmh d(DeviceInfo deviceInfo, String str) {
        cmh cmhVar = new cmh();
        boolean zB = b(deviceInfo, str);
        cku.a(deviceInfo.getDeviceMac());
        LogUtil.b("AccessValidityAuthCommand", "checkResult: ", Boolean.valueOf(zB));
        if (zB) {
            if (cni.b(deviceInfo.getDeviceMac()) || deviceInfo.getDeviceBtType() == 2) {
                this.mNextCommand = new cla(this.d);
            } else {
                this.mNextCommand = new ckq(false);
            }
            cmhVar.e(12);
            cmhVar.d(100000);
            return cmhVar;
        }
        if (this.f1671a) {
            LogUtil.b("AccessValidityAuthCommand", "connect failed, key lost");
            cmhVar.e(14);
            cmhVar.d(50119);
            return cmhVar;
        }
        cmhVar.e(13);
        cmhVar.d(50119);
        return cmhVar;
    }

    private boolean b(DeviceInfo deviceInfo, String str) {
        String strC;
        LogUtil.b("AccessValidityAuthCommand", "Enter checkAuthenticTokenValue.");
        cml cmlVar = this.d;
        if (cmlVar != null && cmlVar.g() != null && 16 == this.d.g().length() / 2 && 16 == this.e.length() / 2) {
            if (cni.b(deviceInfo.getDeviceMac())) {
                strC = cni.d(deviceInfo, AgdConstant.INSTALL_TYPE_AUTO, this.d.g() + this.e, this.d.b());
                if (TextUtils.isEmpty(strC)) {
                    this.f1671a = true;
                }
            } else {
                strC = cku.c(this.d, this.e, AgdConstant.INSTALL_TYPE_AUTO);
            }
            if (strC != null) {
                return strC.equalsIgnoreCase(str);
            }
            LogUtil.e("AccessValidityAuthCommand", "0xA0200008", " Authentic codeInfoHex is incorrect.");
            return false;
        }
        LogUtil.e("AccessValidityAuthCommand", "0xA0200008", " Authentic Random parameter is incorrect.");
        return false;
    }
}
