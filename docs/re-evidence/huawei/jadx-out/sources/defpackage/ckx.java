package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.os.Build;
import android.text.TextUtils;
import com.huawei.devicesdk.connect.handshake.HandshakeGeneralCommandBase;
import com.huawei.devicesdk.entity.DeviceInfo;
import com.huawei.devicesdk.hichain.HiChainAuthManager;
import com.huawei.haf.common.exception.ExceptionUtils;
import health.compact.a.EmuiBuild;
import health.compact.a.LogUtil;
import health.compact.a.ReleaseLogUtil;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes4.dex */
public class ckx extends HandshakeGeneralCommandBase {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final cml f1693b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f1694c;
    private int d;
    private String e = "phoneIdentify";

    private boolean b(int i) {
        return (i ^ 1) == 4 || (i ^ 2) == 4;
    }

    public ckx(int i, String str, cml cmlVar) {
        d(i);
        this.f1694c = str;
        this.f1693b = cmlVar;
    }

    private void d(int i) {
        boolean z = cnc.d() && cnc.b(i);
        LogUtil.b("SecurityNegotiationCommand", "setAuthenticateMode:", Boolean.valueOf(z), ",deviceSupportType:", Integer.valueOf(i));
        if (z) {
            this.d = 1;
        } else {
            this.d = cmz.c(i) ? 4 : 2;
        }
        LogUtil.b("SecurityNegotiationCommand", "setAuthenticateMode :", Integer.valueOf(this.d));
    }

    @Override // com.huawei.devicesdk.connect.handshake.HandshakeGeneralCommandBase, com.huawei.devicesdk.connect.handshake.HandshakeCommandBase
    public cmg getDeviceCommand(DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            LogUtil.d("SecurityNegotiationCommand", "mTransmitData is null");
            return getUnencryptedDeviceCommand(deviceInfo);
        }
        byte[] bArrH = h();
        cqp.a(100091, cqc.a((Object) deviceInfo.getDeviceName()), "", String.valueOf(this.d));
        String strD = cni.d(deviceInfo.getDeviceMac(), 2);
        LogUtil.b("SecurityNegotiationCommand", "deviceIsReconnect: ", Boolean.valueOf(deviceInfo.isReconnect()), " secretKeyIsNotEmpty: ", Boolean.valueOf(!TextUtils.isEmpty(strD)), " updateKeySuccessLabelIsEmpty: ", Boolean.valueOf(TextUtils.isEmpty(cpv.c(deviceInfo.getDeviceMac()))));
        boolean z = deviceInfo.isReconnect() && !TextUtils.isEmpty(strD) && TextUtils.isEmpty(cpv.c(deviceInfo.getDeviceMac()));
        cpv.c(deviceInfo.getDeviceMac(), "");
        byte[] bArrE = e(z);
        byte[] bArrI = i();
        byte[] bArrB = b();
        byte[] bArrA = a();
        byte[] bArrC = c();
        byte[] bArrF = f();
        cml cmlVar = this.f1693b;
        byte[] bArrC2 = null;
        byte[] bArrD = (cmlVar == null || cmlVar.e() != 1) ? null : d();
        cml cmlVar2 = this.f1693b;
        if (cmlVar2 != null && cmlVar2.f() == 1) {
            bArrC2 = c(deviceInfo.getDeviceMac());
        }
        int length = bArrH.length + 2 + bArrE.length + bArrI.length + bArrB.length + bArrA.length + bArrC.length + bArrF.length;
        if (bArrD != null) {
            length += bArrD.length;
        }
        if (bArrC2 != null) {
            length += bArrC2.length;
        }
        byte[] bArrE2 = e();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length + bArrE2.length);
        byteBufferAllocate.put((byte) 1).put((byte) 51);
        byteBufferAllocate.put(bArrH).put(bArrE).put(bArrI).put(bArrB).put(bArrA).put(bArrC).put(bArrF).put(bArrE2);
        if (bArrD != null) {
            byteBufferAllocate.put(bArrD);
        }
        if (bArrC2 != null) {
            byteBufferAllocate.put(bArrC2);
        }
        cmg unencryptedDeviceCommand = getUnencryptedDeviceCommand(deviceInfo);
        unencryptedDeviceCommand.a(byteBufferAllocate.array());
        ReleaseLogUtil.c("DEVMGR_SecurityNegotiationCommand", cku.d("0133"));
        return unencryptedDeviceCommand;
    }

    private byte[] c(String str) {
        byte[] bArrD = cph.d(cph.b(cku.b(str)));
        byte[] bArrE = cph.e(bArrD.length);
        byte[] bArr = new byte[bArrD.length + 1 + bArrE.length];
        bArr[0] = 14;
        System.arraycopy(bArrE, 0, bArr, 1, bArrE.length);
        System.arraycopy(bArrD, 0, bArr, bArrE.length + 1, bArrD.length);
        return bArr;
    }

    private byte[] d() {
        return new byte[]{13, 1, 1};
    }

    private byte[] h() {
        byte[] bArrF = cph.f(this.d);
        byte[] bArrE = cph.e(bArrF.length);
        byte[] bArr = new byte[bArrF.length + 1 + bArrE.length];
        bArr[0] = 1;
        System.arraycopy(bArrE, 0, bArr, 1, bArrE.length);
        System.arraycopy(bArrF, 0, bArr, bArrE.length + 1, bArrF.length);
        return bArr;
    }

    private byte[] e(boolean z) {
        int i = this.d;
        if (i == 2 || i == 4) {
            LogUtil.b("SecurityNegotiationCommand", "isReconnect:", Boolean.valueOf(z));
            return new byte[]{2, 1, (byte) (z ? 2 : 1)};
        }
        return new byte[0];
    }

    private byte[] i() {
        byte[] bytes = cpb.d().getBytes(StandardCharsets.UTF_8);
        byte[] bArrE = cph.e(bytes.length);
        byte[] bArr = new byte[bytes.length + 1 + bArrE.length];
        bArr[0] = 5;
        System.arraycopy(bArrE, 0, bArr, 1, bArrE.length);
        System.arraycopy(bytes, 0, bArr, bArrE.length + 1, bytes.length);
        return bArr;
    }

    private byte[] b() {
        return new byte[]{3, 1, 1};
    }

    private byte[] a() {
        byte[] bArrF = cph.f(EmuiBuild.e);
        byte[] bArrE = cph.e(bArrF.length);
        byte[] bArr = new byte[bArrF.length + 1 + bArrE.length];
        bArr[0] = 4;
        System.arraycopy(bArrE, 0, bArr, 1, bArrE.length);
        System.arraycopy(bArrF, 0, bArr, bArrE.length + 1, bArrF.length);
        return bArr;
    }

    private byte[] c() {
        if (this.d == 4) {
            LogUtil.b("SecurityNegotiationCommand", "getPhoneMac");
            byte[] bArrE = cph.e(this.e);
            byte[] bArrE2 = cph.e(bArrE.length);
            byte[] bArr = new byte[bArrE.length + 1 + bArrE2.length];
            bArr[0] = 6;
            System.arraycopy(bArrE2, 0, bArr, 1, bArrE2.length);
            System.arraycopy(bArrE, 0, bArr, bArrE2.length + 1, bArrE.length);
            return bArr;
        }
        return new byte[0];
    }

    private byte[] f() {
        try {
            if (this.d == 4) {
                LogUtil.b("SecurityNegotiationCommand", "getPhoneModel");
                BluetoothAdapter bluetoothAdapterA = coi.b().a();
                if (bluetoothAdapterA != null) {
                    byte[] bArrE = cph.e(bluetoothAdapterA.getName());
                    byte[] bArrE2 = cph.e(bArrE.length);
                    byte[] bArr = new byte[bArrE.length + 1 + bArrE2.length];
                    bArr[0] = 7;
                    System.arraycopy(bArrE2, 0, bArr, 1, bArrE2.length);
                    System.arraycopy(bArrE, 0, bArr, bArrE2.length + 1, bArrE.length);
                    return bArr;
                }
            }
        } catch (SecurityException e) {
            LogUtil.d("SecurityNegotiationCommand", "getPhoneModel SecurityException:", ExceptionUtils.c(e));
        }
        return new byte[0];
    }

    private byte[] e() {
        if (this.d == 4) {
            LogUtil.b("SecurityNegotiationCommand", "getDeviceTypeId");
            if (cop.g()) {
                byte[] bArrE = cph.e(cpd.d(Build.MODEL));
                byte[] bArrE2 = cph.e(bArrE.length);
                byte[] bArr = new byte[bArrE.length + 1 + bArrE2.length];
                bArr[0] = 10;
                System.arraycopy(bArrE2, 0, bArr, 1, bArrE2.length);
                System.arraycopy(bArrE, 0, bArr, bArrE2.length + 1, bArrE.length);
                return bArr;
            }
        }
        return new byte[0];
    }

    @Override // com.huawei.devicesdk.connect.handshake.HandshakeGeneralCommandBase, com.huawei.devicesdk.connect.handshake.HandshakeCommandBase
    public cmh processReceivedData(DeviceInfo deviceInfo, cmm cmmVar) {
        cmh cmhVar = new cmh();
        if (!cku.d(deviceInfo, cmmVar)) {
            LogUtil.b("SecurityNegotiationCommand", "Parameter Check Failed");
            cmhVar.e(13);
            cmhVar.d(50151);
            return cmhVar;
        }
        LogUtil.b("SecurityNegotiationCommand", "deal 5.1.51 message");
        int iC = cnc.c(deviceInfo.getDeviceMac(), cmmVar.d(), deviceInfo);
        if (iC == 100000) {
            ReleaseLogUtil.c("DEVMGR_SecurityNegotiationCommand", "start hiChain auth");
            if (coi.e()) {
                LogUtil.e("SecurityNegotiationCommand", "enter subUser");
                cmhVar.e(13);
                cmhVar.d(50151);
                clz.e(1003003);
                return cmhVar;
            }
            this.mNextCommand = HiChainAuthManager.c(deviceInfo.getDeviceMac(), this.f1693b);
            if (this.mNextCommand != null) {
                cmhVar.e(12);
                cmhVar.d(100000);
                return cmhVar;
            }
            cmhVar.e(13);
            cmhVar.d(50151);
            return cmhVar;
        }
        if (b(iC)) {
            c(cmhVar, iC, deviceInfo);
            return cmhVar;
        }
        if (iC == 1 || iC == 2) {
            String deviceMac = deviceInfo.getDeviceMac();
            cnh.d().d(deviceMac, iC);
            return e(cmhVar, deviceMac);
        }
        LogUtil.b("SecurityNegotiationCommand", "resolve 5.1.51 failure !");
        cmhVar.e(13);
        cmhVar.d(50151);
        return cmhVar;
    }

    private void c(cmh cmhVar, int i, DeviceInfo deviceInfo) {
        LogUtil.b("SecurityNegotiationCommand", "isHiChain3 authenticateTypeCode:", Integer.valueOf(i));
        this.mNextCommand = cnd.a().c(deviceInfo.getDeviceName(), deviceInfo.getDeviceMac(), this.f1693b, (i ^ 4) == 1);
        if (this.mNextCommand != null) {
            cmhVar.e(12);
            cmhVar.d(100000);
        } else {
            cmhVar.e(13);
            cmhVar.d(50151);
        }
    }

    @Override // com.huawei.devicesdk.connect.handshake.HandshakeCommandBase
    public String getTag() {
        return "0133";
    }

    private cmh e(cmh cmhVar, String str) {
        if (this.f1693b == null) {
            LogUtil.d("SecurityNegotiationCommand", "HiChainLite Authentic is error, mParameter is null");
            cmhVar.e(13);
            cmhVar.d(50151);
            return cmhVar;
        }
        LogUtil.b("SecurityNegotiationCommand", "start hiChainLite authentic");
        String strD = cni.d(str, 2);
        cnh.d().d(strD, str);
        String str2 = this.f1693b.g() + this.f1694c;
        if (cnh.d().g(str)) {
            LogUtil.b("SecurityNegotiationCommand", "device is reconnect");
            if (TextUtils.isEmpty(strD)) {
                LogUtil.b("SecurityNegotiationCommand", "secretKey is empty");
                cpv.d();
                cmhVar.e(14);
                cmhVar.d(50151);
                return cmhVar;
            }
            this.mNextCommand = new ckd(cph.d(cni.d(strD + "0100", str2)), this.f1694c, this.f1693b);
            cmhVar.e(12);
            cmhVar.d(100000);
            return cmhVar;
        }
        if (TextUtils.isEmpty(cku.c(str))) {
            LogUtil.b("SecurityNegotiationCommand", "pin is empty");
            this.mNextCommand = new ckp(this.f1694c, this.f1693b);
            cmhVar.e(12);
            cmhVar.d(100000);
            return cmhVar;
        }
        this.mNextCommand = new ckd(cni.e("0100", this.f1693b.b(), str2, str), this.f1694c, this.f1693b);
        cmhVar.e(12);
        cmhVar.d(100000);
        return cmhVar;
    }
}
