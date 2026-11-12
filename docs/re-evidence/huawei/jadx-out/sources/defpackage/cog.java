package defpackage;

import com.huawei.devicesdk.entity.DeviceInfo;
import com.huawei.devicesdk.entity.SimpleDataHead;
import com.huawei.devicesdk.strategy.BaseSendStrategyInitialD;
import health.compact.a.LogUtil;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class cog extends BaseSendStrategyInitialD {
    @Override // com.huawei.devicesdk.strategy.SendStrategy
    public ArrayList<cmd> getSendFrames(cmg cmgVar, DeviceInfo deviceInfo) {
        ArrayList<cmd> arrayList = new ArrayList<>();
        if (deviceInfo == null) {
            LogUtil.e("SendStrategyInitialD", "SendStrategyInitialD getSendFrames deviceInfo is null.");
        }
        if (cmgVar == null) {
            LogUtil.e("SendStrategyInitialD", "message is null");
            return arrayList;
        }
        byte[] bArrB = cmgVar.b();
        if (!isInputDataValid(bArrB)) {
            LogUtil.e("SendStrategyInitialD", "getSendFrame error. input data is invalid");
            return arrayList;
        }
        LogUtil.b("SendStrategyInitialD", "isEncrypt: ", Boolean.valueOf(cmgVar.k()), " dataHead: ", Byte.valueOf(cmgVar.d()));
        LogUtil.b("SendStrategyInitialD", "uuid is " + cmgVar.c() + " command is ", cpl.d(bArrB));
        byte[] bArrB2 = cmgVar.b();
        if (cmgVar.k() && cmgVar.d() == SimpleDataHead.INVALID.getDataHead() && deviceInfo != null) {
            bArrB2 = new cjz().encrypt(bArrB2, deviceInfo.getDeviceMac());
        }
        return constructBluetoothFrame(cmgVar.k(), bArrB2, cmgVar);
    }
}
