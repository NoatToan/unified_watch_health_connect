package defpackage;

import com.huawei.devicesdk.callback.MessageReceiveCallback;
import com.huawei.devicesdk.entity.DeviceInfo;
import com.huawei.devicesdk.strategy.SendStrategy;
import health.compact.a.LogUtil;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class coe extends SendStrategy {
    @Override // com.huawei.devicesdk.strategy.SendStrategy
    public void destroy(String str) {
    }

    @Override // com.huawei.devicesdk.strategy.SendStrategy
    public ArrayList<cmd> getSendFrames(cmg cmgVar, DeviceInfo deviceInfo) {
        ArrayList<cmd> arrayList = new ArrayList<>();
        if (deviceInfo == null) {
            LogUtil.e("SendStrategyInitialDirect", "SendStrategyInitialDirect getSendFrames deviceInfo is null.");
        }
        if (cmgVar == null) {
            LogUtil.e("SendStrategyInitialDirect", "message is null");
            return arrayList;
        }
        byte[] bArrB = cmgVar.b();
        if (bArrB == null) {
            LogUtil.d("SendStrategyInitialDirect", "getSendFrame error. input data is invalid");
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        cmb cmbVar = new cmb();
        cmbVar.a(bArrB);
        cmbVar.c(10);
        arrayList2.add(cmbVar);
        arrayList.add(coo.b(cmgVar, arrayList2));
        return arrayList;
    }

    @Override // com.huawei.devicesdk.strategy.SendStrategy
    public void parseReceiveFrames(DeviceInfo deviceInfo, cmm cmmVar, MessageReceiveCallback messageReceiveCallback) {
        if (deviceInfo == null || cmmVar == null || messageReceiveCallback == null) {
            LogUtil.e("SendStrategyInitialDirect", "SendStrategyInitialDirect parseReceiveFrames device frame or callback exception.");
            return;
        }
        if (cmmVar.d() == null) {
            LogUtil.d("SendStrategyInitialDirect", "response data is invalid");
            messageReceiveCallback.onDataReceived(deviceInfo, e(cmmVar.b(), cmmVar.d()), 0);
        }
        messageReceiveCallback.onDataReceived(deviceInfo, e(cmmVar.b(), cmmVar.d()), 0);
    }

    private cmm e(String str, byte[] bArr) {
        cmm cmmVar = new cmm();
        cmmVar.c(str);
        cmmVar.a(bArr);
        return cmmVar;
    }
}
