package defpackage;

import com.huawei.devicesdk.connect.handshake.HandshakeGeneralCommandBase;
import com.huawei.devicesdk.entity.DeviceInfo;
import com.huawei.devicesdk.entity.SendMode;
import com.huawei.devicesdk.hichain.HiChainAuthManager;
import health.compact.a.LogUtil;
import health.compact.a.ReleaseLogUtil;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public class cks extends HandshakeGeneralCommandBase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte f1686a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f1687b;
    private ByteBuffer d;

    public cks(byte[] bArr, byte b2, long j) {
        if (bArr == null) {
            LogUtil.d("HiChainDataTransmitCommand", "transmitData is null");
            return;
        }
        this.d = ByteBuffer.wrap(bArr);
        this.f1686a = b2;
        this.f1687b = j;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0079  */
    @Override // com.huawei.devicesdk.connect.handshake.HandshakeGeneralCommandBase, com.huawei.devicesdk.connect.handshake.HandshakeCommandBase
    public cmg getDeviceCommand(DeviceInfo deviceInfo) {
        ByteBuffer byteBufferAllocate;
        ByteBuffer byteBuffer = this.d;
        if (byteBuffer == null) {
            LogUtil.d("HiChainDataTransmitCommand", "mTransmitData is null");
            return getUnencryptedDeviceCommand(deviceInfo);
        }
        byte[] bArrE = cph.e(byteBuffer.capacity());
        if (this.f1686a != 0) {
            long j = this.f1687b;
            if (j != 0) {
                byte[] bArrD = cph.d(cph.a(j));
                int length = bArrE.length;
                byteBufferAllocate = ByteBuffer.allocate(length + 3 + this.d.capacity() + 5 + bArrD.length);
                byteBufferAllocate.put((byte) 1).put((byte) 40);
                byteBufferAllocate.put((byte) 1).put(bArrE).put(this.d);
                byteBufferAllocate.put((byte) 2).put((byte) 1).put(this.f1686a);
                byteBufferAllocate.put((byte) 3).put(cph.e(bArrD.length)).put(bArrD);
            } else {
                byteBufferAllocate = ByteBuffer.allocate(bArrE.length + 3 + this.d.capacity());
                byteBufferAllocate.put((byte) 1).put((byte) 40);
                byteBufferAllocate.put((byte) 1).put(bArrE).put(this.d);
            }
        } else {
            byteBufferAllocate = ByteBuffer.allocate(bArrE.length + 3 + this.d.capacity());
            byteBufferAllocate.put((byte) 1).put((byte) 40);
            byteBufferAllocate.put((byte) 1).put(bArrE).put(this.d);
        }
        if (deviceInfo != null && deviceInfo.getDeviceBtType() == 2 && this.f1686a != 0 && this.f1687b != 0) {
            if (cnx.d()) {
                return e(deviceInfo, byteBufferAllocate);
            }
            return b(deviceInfo, byteBufferAllocate);
        }
        return b(deviceInfo, byteBufferAllocate);
    }

    private cmg b(DeviceInfo deviceInfo, ByteBuffer byteBuffer) {
        cmg unencryptedDeviceCommand = getUnencryptedDeviceCommand(deviceInfo);
        unencryptedDeviceCommand.a(byteBuffer.array());
        ReleaseLogUtil.c("DEVMGR_HiChainDataTransmitCommand", cku.d("0128"));
        return unencryptedDeviceCommand;
    }

    @Override // com.huawei.devicesdk.connect.handshake.HandshakeGeneralCommandBase, com.huawei.devicesdk.connect.handshake.HandshakeCommandBase
    public cmh processReceivedData(DeviceInfo deviceInfo, cmm cmmVar) {
        cms cmsVarB;
        cmh cmhVar = new cmh();
        if (!cku.d(deviceInfo, cmmVar)) {
            cmhVar.e(13);
            cmhVar.d(50140);
            return cmhVar;
        }
        cnb cnbVarD = cnc.d(cmmVar.d());
        if (cmz.b(deviceInfo.getDeviceMac())) {
            cmsVarB = cnd.a().c(deviceInfo.getDeviceMac(), cnbVarD);
        } else {
            cmsVarB = HiChainAuthManager.e().b(deviceInfo.getDeviceMac(), cnbVarD.c());
        }
        this.mNextCommand = cmsVarB.e();
        if (cmsVarB.c()) {
            if (this.mNextCommand != null) {
                cmhVar.e(12);
                cmhVar.d(100000);
            } else if (cmz.b(deviceInfo.getDeviceMac()) && cnbVarD.b() == 4) {
                cmhVar.e(55);
                cmhVar.d(50140);
            } else {
                cmhVar.e(17);
                cmhVar.d(50140);
            }
            LogUtil.b("HiChainDataTransmitCommand", "processReceivedData");
            return cmhVar;
        }
        cmhVar.e(13);
        cmhVar.d(50140);
        return cmhVar;
    }

    @Override // com.huawei.devicesdk.connect.handshake.HandshakeCommandBase
    public String getTag() {
        return "0128";
    }

    private cmg e(DeviceInfo deviceInfo, ByteBuffer byteBuffer) {
        cmg cmgVar = new cmg();
        if (deviceInfo == null) {
            LogUtil.d("HiChainDataTransmitCommand", "device info is empty when buildCommandMessage");
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
