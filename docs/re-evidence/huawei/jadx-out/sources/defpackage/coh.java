package defpackage;

import com.huawei.devicesdk.entity.CharacterOperationType;
import com.huawei.devicesdk.entity.DeviceInfo;
import com.huawei.devicesdk.entity.SimpleDataHead;
import com.huawei.devicesdk.strategy.BaseSendStrategyInitialD;
import health.compact.a.LogUtil;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class coh extends BaseSendStrategyInitialD {
    @Override // com.huawei.devicesdk.strategy.SendStrategy
    public ArrayList<cmd> getSendFrames(cmg cmgVar, DeviceInfo deviceInfo) {
        ArrayList<cmd> arrayList = new ArrayList<>(16);
        if (deviceInfo == null) {
            LogUtil.e("SendStrategyInitialFragment", "SendStrategyInitialFragment getSendFrames deviceInfo is null.");
        }
        if (cmgVar == null) {
            LogUtil.e("SendStrategyInitialFragment", "message is null");
            return arrayList;
        }
        if (cmgVar.e() != CharacterOperationType.WRITE) {
            LogUtil.b("SendStrategyInitialFragment", "return empty data frames. option type is ", cmgVar.e());
            cmd cmdVar = new cmd();
            cmdVar.c(cmgVar.i());
            cmdVar.d(cmgVar.c());
            cmdVar.a(cmgVar.e());
            cmdVar.e(cmgVar.h());
            arrayList.add(cmdVar);
            return arrayList;
        }
        byte[] bArrB = cmgVar.b();
        if (!isInputDataValid(bArrB)) {
            LogUtil.e("SendStrategyInitialFragment", "getSendFrame error. input data is invalid");
            return arrayList;
        }
        LogUtil.b("SendStrategyInitialFragment", "isEncrypt: ", Boolean.valueOf(cmgVar.k()), " dataHead: ", Byte.valueOf(cmgVar.d()));
        if (cmgVar.k() && cmgVar.d() == SimpleDataHead.INVALID.getDataHead() && deviceInfo != null) {
            byte[] bArrE = e(bArrB);
            bArrB = a(new cjz().encrypt(bArrE, deviceInfo.getDeviceMac()), bArrB);
            LogUtil.b("SendStrategyInitialFragment", "content: ", cpl.e(cph.d(bArrE)), " encryptContent: ", cpl.e(cph.d(bArrE)), " combineFrameData: ", cpl.e(cph.d(bArrB)));
        }
        return constructBluetoothFrame(cmgVar.k(), bArrB, cmgVar);
    }

    private byte[] a(byte[] bArr, byte[] bArr2) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArr.length + 2);
        byteBufferAllocate.put(bArr2, 0, 2);
        byteBufferAllocate.put(bArr);
        return byteBufferAllocate.array();
    }

    private byte[] e(byte[] bArr) {
        int length = bArr.length - 2;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length);
        byteBufferAllocate.put(bArr, 2, length);
        return byteBufferAllocate.array();
    }

    @Override // com.huawei.devicesdk.strategy.BaseSendStrategyInitialD
    public boolean isInputDataValid(byte[] bArr) {
        return super.isInputDataValid(bArr) && bArr.length >= 2;
    }
}
