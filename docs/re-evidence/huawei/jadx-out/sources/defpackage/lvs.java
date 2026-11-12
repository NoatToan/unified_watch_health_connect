package defpackage;

import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes10.dex */
public class lvs {
    public static void b(byte[] bArr) {
        IBaseResponseCallback iBaseResponseCallbackE = lvk.e();
        if (iBaseResponseCallbackE != null) {
            LogUtil.a("BluetoothCommandTestMgr", "requestBluetoothInterface request success data :", eeq.e(bArr));
            iBaseResponseCallbackE.onResponse(0, bArr);
        } else {
            LogUtil.j("BluetoothCommandTestMgr", "requestBluetoothInterface callback is null");
        }
    }
}
