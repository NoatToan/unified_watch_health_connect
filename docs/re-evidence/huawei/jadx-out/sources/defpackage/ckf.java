package defpackage;

import com.huawei.devicesdk.connect.handshake.HandshakeSimpleCommandBase;
import com.huawei.devicesdk.entity.CharacterOperationType;
import com.huawei.devicesdk.entity.DeviceInfo;
import com.huawei.devicesdk.entity.SimpleDataHead;
import health.compact.a.LogUtil;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public class ckf extends HandshakeSimpleCommandBase {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private byte[] f1678b;
    private byte[] d;
    private static final byte[] e = {57, 56, 53, 54};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final byte[] f1677c = {49, 49, 50, 51};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f1676a = cph.d(cqh.c(1, 33));

    ckf(byte[] bArr) {
        this.f1678b = bArr;
    }

    @Override // com.huawei.devicesdk.connect.handshake.HandshakeCommandBase
    public cmg getDeviceCommand(DeviceInfo deviceInfo) {
        cmg cmgVarConstructDefaultCommandMessage = constructDefaultCommandMessage();
        if (deviceInfo == null) {
            LogUtil.e("AccessAuthenticCommand", "get device command error. device is null");
            return cmgVarConstructDefaultCommandMessage;
        }
        byte[] bArr = this.f1678b;
        if (bArr == null || bArr.length != 16) {
            LogUtil.e("AccessAuthenticCommand", "randA is invalid.");
            return cmgVarConstructDefaultCommandMessage;
        }
        cpl.d("AccessAuthenticCommand", bArr, "randA is valid. randA=", cpl.a(deviceInfo.getDeviceMac()), "get device command, device: ");
        try {
            byte[] bArrB = ckg.b(16);
            this.d = bArrB;
            if (bArrB == null) {
                LogUtil.e("AccessAuthenticCommand", "generate randB error.");
                return cmgVarConstructDefaultCommandMessage;
            }
            cpl.d("AccessAuthenticCommand", bArrB, "generate randB success. randB=");
            byte[] bArrA = a(f1677c);
            int length = bArrA.length;
            if (length == 0) {
                return cmgVarConstructDefaultCommandMessage;
            }
            byte[] bArr2 = this.d;
            int length2 = bArr2.length;
            byte[] bArr3 = new byte[length2 + length];
            System.arraycopy(bArr2, 0, bArr3, 0, length2);
            System.arraycopy(bArrA, 0, bArr3, length2, length);
            cpl.b("AccessAuthenticCommand", bArr3, "generate tokenB success. TokenB=");
            return constructCommandMessage("32330a04-15d9-421a-91c5-2a2d5c7525c9", SimpleDataHead.DB, bArr3);
        } catch (NoSuchAlgorithmException e2) {
            LogUtil.d("AccessAuthenticCommand", "generate randB error. error: ", e2.getLocalizedMessage());
            return cmgVarConstructDefaultCommandMessage;
        }
    }

    @Override // com.huawei.devicesdk.connect.handshake.HandshakeSimpleCommandBase, com.huawei.devicesdk.connect.handshake.HandshakeCommandBase
    public cmh processReceivedData(DeviceInfo deviceInfo, cmm cmmVar) {
        byte[] bArr;
        cmh cmhVar = new cmh();
        if (!checkInputParam(deviceInfo, cmmVar)) {
            cmhVar.e(13);
            cmhVar.d(40102);
            return cmhVar;
        }
        byte[] bArr2 = this.f1678b;
        if (bArr2 == null || bArr2.length != 16 || (bArr = this.d) == null || bArr.length != 16) {
            LogUtil.e("AccessAuthenticCommand", "randA or randB is invalid");
            cmhVar.e(13);
            cmhVar.d(40102);
            return cmhVar;
        }
        if (Arrays.equals(cmmVar.d(), a(e))) {
            this.mNextCommand = new ckm();
            cmhVar.e(12);
            cmhVar.d(100000);
            return cmhVar;
        }
        this.mNextCommand = null;
        cmhVar.e(13);
        cmhVar.d(40102);
        return cmhVar;
    }

    @Override // com.huawei.devicesdk.connect.handshake.HandshakeCommandBase
    public String getTag() {
        return String.valueOf(40102);
    }

    private byte[] a(byte[] bArr) {
        cpl.d("AccessAuthenticCommand", bArr, "generateAuthToken. factor=");
        byte[] bArr2 = f1676a;
        if (bArr2 == null) {
            LogUtil.d("AccessAuthenticCommand", "CAK_BYTES is null");
            return new byte[0];
        }
        byte[] bArr3 = this.f1678b;
        int length = bArr3.length;
        int length2 = this.d.length;
        byte[] bArr4 = new byte[length + length2];
        System.arraycopy(bArr3, 0, bArr4, 0, length);
        System.arraycopy(this.d, 0, bArr4, length, length2);
        cpl.b("AccessAuthenticCommand", bArr4, "combine randA and randB finish. randAB=");
        byte[] bArr5 = new byte[bArr2.length + bArr.length];
        System.arraycopy(bArr2, 0, bArr5, 0, bArr2.length);
        System.arraycopy(bArr, 0, bArr5, bArr2.length, bArr.length);
        cpl.b("AccessAuthenticCommand", bArr4, "generate cak key finish. cakKey=");
        LogUtil.b("AccessAuthenticCommand", "start to create encode info.");
        try {
            byte[] bArrC = ckg.c(ckg.c(bArr5, bArr4), bArr4);
            cpl.d("AccessAuthenticCommand", bArrC, "generateAuthToken finish. code: ");
            return bArrC;
        } catch (UnsupportedEncodingException | InvalidKeyException | NoSuchAlgorithmException e2) {
            LogUtil.d("AccessAuthenticCommand", "generateAuthToken error. error:", e2.getLocalizedMessage());
            return new byte[0];
        }
    }

    @Override // com.huawei.devicesdk.connect.handshake.HandshakeSimpleCommandBase
    public cmg prepare(DeviceInfo deviceInfo) {
        return constructCharacterNotification(CharacterOperationType.ENABLE, "32330a04-15d9-421a-91c5-2a2d5c7525c9");
    }

    @Override // com.huawei.devicesdk.connect.handshake.HandshakeSimpleCommandBase
    public cmg end(DeviceInfo deviceInfo) {
        return constructCharacterNotification(CharacterOperationType.DISABLE, "32330a04-15d9-421a-91c5-2a2d5c7525c9");
    }
}
