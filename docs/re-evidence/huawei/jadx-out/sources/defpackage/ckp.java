package defpackage;

import com.huawei.devicesdk.connect.handshake.HandshakeGeneralCommandBase;
import com.huawei.devicesdk.entity.DeviceInfo;
import com.huawei.devicesdk.hichain.HiChainAuthManager;
import com.huawei.unitedevice.entity.UniteDevice;
import health.compact.a.LogUtil;
import health.compact.a.ReleaseLogUtil;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class ckp extends HandshakeGeneralCommandBase {
    private cml d;
    private String e;

    public ckp(cml cmlVar) {
        this("", cmlVar);
    }

    public ckp(String str, cml cmlVar) {
        this.e = str;
        this.d = cmlVar;
    }

    @Override // com.huawei.devicesdk.connect.handshake.HandshakeGeneralCommandBase, com.huawei.devicesdk.connect.handshake.HandshakeCommandBase
    public cmg getDeviceCommand(DeviceInfo deviceInfo) {
        boolean z;
        ArrayList arrayList = new ArrayList(cju.d().getDeviceList().values());
        if (!arrayList.isEmpty() && deviceInfo != null) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                if (deviceInfo.getDeviceMac().equals(((UniteDevice) it.next()).getIdentify())) {
                    z = true;
                    break;
                }
            }
            LogUtil.b("GetDevicePinCodeCommand", "isEffectiveDevice:", Boolean.valueOf(z));
            if (z) {
                cqp.a(100081, cqc.a((Object) deviceInfo.getDeviceName()), "", "");
            }
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.put((byte) 1).put((byte) 44);
        byteBufferAllocate.put((byte) 1).put((byte) 0);
        cmg unencryptedDeviceCommand = getUnencryptedDeviceCommand(deviceInfo);
        unencryptedDeviceCommand.a(byteBufferAllocate.array());
        ReleaseLogUtil.c("DEVMGR_GetDevicePinCodeCommand", cku.d("012C"));
        return unencryptedDeviceCommand;
    }

    @Override // com.huawei.devicesdk.connect.handshake.HandshakeGeneralCommandBase, com.huawei.devicesdk.connect.handshake.HandshakeCommandBase
    public cmh processReceivedData(DeviceInfo deviceInfo, cmm cmmVar) {
        cmh cmhVar = new cmh();
        if (!cku.d(deviceInfo, cmmVar) || this.d == null) {
            LogUtil.b("GetDevicePinCodeCommand", "Parameter Check Failed");
            cmhVar.e(13);
            cmhVar.d(50144);
            return cmhVar;
        }
        LogUtil.b("GetDevicePinCodeCommand", "start deal 5.1.44 message");
        String strC = cnc.c(cmmVar.d(), cku.a(this.d.b()), deviceInfo.getDeviceMac());
        cqp.a(100017, deviceInfo.getDeviceName(), strC, "");
        String deviceMac = deviceInfo.getDeviceMac();
        if ("-1".equals(strC)) {
            LogUtil.b("GetDevicePinCodeCommand", "PIN_ERROR pinCode: ", strC);
            HiChainAuthManager.e().e(deviceMac);
            cmhVar.e(13);
            cmhVar.d(50144);
            return cmhVar;
        }
        cku.b(deviceMac, strC);
        if (cnc.a(deviceMac)) {
            return d(cmhVar, deviceMac);
        }
        if (cmz.b(deviceMac)) {
            return a(cmhVar, deviceMac);
        }
        if (cni.b(deviceMac)) {
            return c(cmhVar, deviceMac);
        }
        LogUtil.d("GetDevicePinCodeCommand", "device's authType unknown");
        cmhVar.e(13);
        cmhVar.d(50144);
        return cmhVar;
    }

    private cmh d(cmh cmhVar, String str) {
        this.mNextCommand = HiChainAuthManager.e().b(str);
        if (this.mNextCommand != null) {
            cmhVar.e(12);
            cmhVar.d(100000);
            return cmhVar;
        }
        cmhVar.e(13);
        cmhVar.d(50144);
        return cmhVar;
    }

    private cmh a(cmh cmhVar, String str) {
        this.mNextCommand = cnd.a().c(str);
        if (this.mNextCommand != null) {
            cmhVar.e(12);
            cmhVar.d(100000);
            return cmhVar;
        }
        cmhVar.e(13);
        cmhVar.d(50144);
        return cmhVar;
    }

    private cmh c(cmh cmhVar, String str) {
        this.mNextCommand = new ckd(cni.e("0100", this.d.b(), this.d.g() + this.e, str), this.e, this.d);
        cmhVar.e(12);
        cmhVar.d(100000);
        return cmhVar;
    }

    @Override // com.huawei.devicesdk.connect.handshake.HandshakeCommandBase
    public String getTag() {
        return "012C";
    }
}
