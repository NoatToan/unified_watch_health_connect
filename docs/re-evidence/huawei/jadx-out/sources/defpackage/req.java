package defpackage;

import android.content.Context;
import com.huawei.health.deviceconnect.callback.PingCallback;
import com.huawei.health.deviceconnect.callback.SendCallback;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.device.activity.alipay.BindAlipayProgressActivity;
import com.huawei.unitedevice.constant.ConnectState;
import com.huawei.unitedevice.constant.WearEngineModule;
import com.huawei.unitedevice.manager.EngineLogicBaseManager;
import java.util.Arrays;

/* JADX INFO: loaded from: classes43.dex */
public class req extends EngineLogicBaseManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile req f47233a;
    private static final Object e = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private xiu f47234b;
    private BindAlipayProgressActivity d;

    private req(Context context) {
        super(context);
    }

    public static req e() {
        req reqVar;
        synchronized (e) {
            LogUtil.a("HiWearEngineBindAlipayManager", "getInstance()");
            if (f47233a == null) {
                f47233a = new req(BaseApplication.getContext());
            }
            reqVar = f47233a;
        }
        return reqVar;
    }

    public void c(BindAlipayProgressActivity bindAlipayProgressActivity) {
        this.d = bindAlipayProgressActivity;
    }

    public void b(PingCallback pingCallback) {
        LogUtil.a("HiWearEngineBindAlipayManager", "pingDevice");
        pingComand(pingCallback, getWearPkgName());
    }

    @Override // com.huawei.unitedevice.manager.EngineLogicBaseManager
    public void onReceiveDeviceCommand(DeviceInfo deviceInfo, int i, xiu xiuVar) {
        LogUtil.a("HiWearEngineBindAlipayManager", "onReceiveDeviceCommand errorCode:", Integer.valueOf(i));
        BindAlipayProgressActivity bindAlipayProgressActivity = this.d;
        if (bindAlipayProgressActivity != null) {
            bindAlipayProgressActivity.c(xiuVar);
        }
    }

    public void e(xiu xiuVar) {
        LogUtil.a("HiWearEngineBindAlipayManager", "sendCommandToDevice");
        sendComand(xiuVar, new SendCallback() { // from class: req.5
            @Override // com.huawei.health.deviceconnect.callback.SendCallback
            public void onSendResult(int i) {
                LogUtil.a("HiWearEngineBindAlipayManager", "sendCommandToDevice errorCode:", Integer.valueOf(i));
            }

            @Override // com.huawei.health.deviceconnect.callback.SendCallback
            public void onSendProgress(long j) {
                LogUtil.d("HiWearEngineBindAlipayManager", "sendCommandToDevice progress:", Long.valueOf(j));
            }

            @Override // com.huawei.health.deviceconnect.callback.SendCallback
            public void onFileTransferReport(String str) {
                LogUtil.a("HiWearEngineBindAlipayManager", "sendCommandToDevice onFileTransferReport transferWay: ", str);
            }
        });
    }

    public void b(int i) {
        xiu.c cVar = new xiu.c();
        try {
            cVar.a(a(i));
        } catch (yib unused) {
            LogUtil.e("HiWearEngineBindAlipayManager", "sendMessage WearEngineException");
        }
        xiu xiuVarC = cVar.c();
        this.f47234b = xiuVarC;
        e(xiuVarC);
    }

    private byte[] a(int i) {
        LogUtil.a("HiWearEngineBindAlipayManager", "createGetBindCodeMsg:", Integer.valueOf(i));
        byte[] bArr = new byte[128];
        byte[] bArrC = c(1);
        System.arraycopy(bArrC, 0, bArr, 0, bArrC.length);
        int length = bArrC.length;
        byte[] bArrC2 = c(539034416);
        System.arraycopy(bArrC2, 0, bArr, length, bArrC2.length);
        int length2 = length + bArrC2.length;
        byte[] bArrC3 = c(i);
        System.arraycopy(bArrC3, 0, bArr, length2, bArrC3.length);
        return Arrays.copyOf(bArr, length2 + bArrC3.length);
    }

    private static byte[] c(int i) {
        return new byte[]{(byte) (i & 255), (byte) ((i >> 8) & 255), (byte) ((i >> 16) & 255), (byte) ((i >> 24) & 255)};
    }

    @Override // com.huawei.unitedevice.manager.EngineLogicBaseManager
    public WearEngineModule getManagerModule() {
        return WearEngineModule.BIND_ALIPAY_MODULE;
    }

    @Override // com.huawei.unitedevice.manager.EngineLogicBaseManager
    public String getWearPkgName() {
        return "com.eg.harmony.watch.AlipayGphone";
    }

    @Override // com.huawei.unitedevice.manager.EngineLogicBaseManager
    public String getWearFingerprint() {
        return "com.eg.harmony.watch.AlipayGphone_BDZmAwy1v1blOaTo4DAwBFZklG1fstXlaPZZLxJ2OJMGEL1FeayJ8NnzAFFGbBP4jkVH96MFJvxrFwV/E6hpwtc=";
    }

    @Override // com.huawei.unitedevice.manager.EngineLogicBaseManager
    public void onDeviceConnectionChange(ConnectState connectState, DeviceInfo deviceInfo) {
        LogUtil.j("HiWearEngineBindAlipayManager", "onDeviceConnectionChange");
    }
}
