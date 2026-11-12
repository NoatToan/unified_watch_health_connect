package defpackage;

import android.content.Context;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.unitedevice.constant.ConnectState;
import com.huawei.unitedevice.constant.WearEngineModule;
import com.huawei.unitedevice.manager.EngineLogicBaseManager;

/* JADX INFO: loaded from: classes10.dex */
public class mlz extends EngineLogicBaseManager {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile mlz f41907c;
    private static final Object d = new Object();

    @Override // com.huawei.unitedevice.manager.EngineLogicBaseManager
    public void onDeviceConnectionChange(ConnectState connectState, DeviceInfo deviceInfo) {
    }

    private mlz(Context context) {
        super(context);
    }

    public static mlz d() {
        mlz mlzVar;
        synchronized (d) {
            if (f41907c == null) {
                LogUtil.a("HiWearEngineBtProxyManager", "getInstance()");
                f41907c = new mlz(BaseApplication.getContext());
            }
            mlzVar = f41907c;
        }
        return mlzVar;
    }

    public void c(byte[] bArr, int i) {
        xiu.c cVar = new xiu.c();
        try {
            cVar.a(bArr);
            cVar.c(false);
            cVar.b(i);
        } catch (yib unused) {
            LogUtil.e("HiWearEngineBtProxyManager", "sendMessage WearEngineException");
        }
        c(cVar.c());
    }

    @Override // com.huawei.unitedevice.manager.EngineLogicBaseManager
    public void onReceiveDeviceCommand(DeviceInfo deviceInfo, int i, xiu xiuVar) {
        LogUtil.a("HiWearEngineBtProxyManager", "onReceiveDeviceCommand errorCode ", Integer.valueOf(i));
        if (xiuVar != null) {
            byte[] bArrB = xiuVar.b();
            if (bArrB == null || bArrB.length <= 1) {
                LogUtil.j("HiWearEngineBtProxyManager", "data illegal");
                return;
            } else {
                mma.b().a(deviceInfo, bArrB);
                return;
            }
        }
        LogUtil.e("HiWearEngineBtProxyManager", "onReceiveDeviceCommand Message is null");
    }

    @Override // com.huawei.unitedevice.manager.EngineLogicBaseManager
    public WearEngineModule getManagerModule() {
        return WearEngineModule.BTPROXY_MODULE;
    }

    @Override // com.huawei.unitedevice.manager.EngineLogicBaseManager
    public String getWearPkgName() {
        return "com.huawei.health.btproxy";
    }

    @Override // com.huawei.unitedevice.manager.EngineLogicBaseManager
    public String getWearFingerprint() {
        return "BtproxyDistributeNet";
    }

    private void c(xiu xiuVar) {
        sendComand(xiuVar, null);
    }

    public static void e() {
        if (f41907c == null) {
            LogUtil.j("HiWearEngineBtProxyManager", "current instance is null");
            return;
        }
        synchronized (d) {
            f41907c = null;
        }
    }

    public void a() {
        onDestroy();
    }
}
