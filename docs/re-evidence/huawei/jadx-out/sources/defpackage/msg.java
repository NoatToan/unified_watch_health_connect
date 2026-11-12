package defpackage;

import com.google.common.base.Ascii;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.phoneprocess.mgr.hwcontactsyncmgr.ContactsDataSender;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.nio.ByteBuffer;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class msg {
    public void d(final DeviceInfo deviceInfo) {
        LogUtil.a("ConnectStateChangeHandler", "handleDeviceConnected: ");
        if (deviceInfo == null) {
            LogUtil.j("ConnectStateChangeHandler", "handleDeviceConnected: deviceInfo is null.");
        } else {
            ThreadPoolManager.c().execute(new Runnable() { // from class: mse
                @Override // java.lang.Runnable
                public final void run() {
                    this.f42345b.b(deviceInfo);
                }
            });
        }
    }

    /* synthetic */ void b(DeviceInfo deviceInfo) {
        c("contact_sync_" + mtr.e(deviceInfo.getDeviceIdentify()), deviceInfo);
    }

    public void c(final DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            LogUtil.j("ConnectStateChangeHandler", "handleDeviceDisconnected: deviceInfo is null.");
        } else {
            ThreadPoolManager.c().execute(new Runnable() { // from class: msh
                @Override // java.lang.Runnable
                public final void run() {
                    this.f42347c.e(deviceInfo);
                }
            });
        }
    }

    /* synthetic */ void e(DeviceInfo deviceInfo) {
        if (!a()) {
            LogUtil.j("ConnectStateChangeHandler", "handleDeviceState: have no contacts permissions");
        } else if (!a(deviceInfo)) {
            LogUtil.j("ConnectStateChangeHandler", "handleDeviceState: is not supported sync contact capability.");
        } else if (deviceInfo.getDeviceConnectState() == 3) {
            d();
        }
    }

    private void c(String str, DeviceInfo deviceInfo) {
        LogUtil.a("ConnectStateChangeHandler", "handleReconnectedSync: getSingleFrameDevice", Integer.valueOf(deviceInfo.getSingleFrameDevice()), "getDeviceFactoryReset: ", Integer.valueOf(deviceInfo.getDeviceFactoryReset()));
        msc mscVarC = msc.c();
        if (deviceInfo.getSingleFrameDevice() == 1 && deviceInfo.getDeviceFactoryReset() == 1) {
            ReleaseLogUtil.e("R_ConnectStateChangeHandler", "handleReconnectedSync SingleFrameDevice first pair no sendFile.");
            return;
        }
        if (!mtk.d()) {
            g(deviceInfo);
            mscVarC.a(BaseApplication.getContext(), str);
            LogUtil.j("ConnectStateChangeHandler", "handleReconnectedSync: reconnect ok but cannot sync contacts with no contact permission.");
            return;
        }
        Boolean boolE = mscVarC.e(str);
        LogUtil.a("ConnectStateChangeHandler", "isChangedContacts: ", boolE);
        if (boolE != null && boolE.booleanValue()) {
            LogUtil.a("ConnectStateChangeHandler", "The mobile phone contact does not change.");
        } else {
            mscVarC.c(deviceInfo);
            mscVarC.e(str, 0);
        }
        mscVarC.a(BaseApplication.getContext(), str);
    }

    private void g(DeviceInfo deviceInfo) {
        LogUtil.a("ConnectStateChangeHandler", "responseNoPermissions: report to device with no contacts permission");
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(6);
        byteBufferAllocate.put(Ascii.DEL);
        byteBufferAllocate.put((byte) 4);
        byteBufferAllocate.putInt(100004);
        ContactsDataSender.d().c(4, byteBufferAllocate.array(), deviceInfo);
    }

    private void d() {
        LogUtil.a("ConnectStateChangeHandler", "onDisconnected: ");
        msc.c().a();
    }

    private boolean a(DeviceInfo deviceInfo) {
        Map<String, DeviceCapability> mapQueryDeviceCapability = mkf.e(BaseApplication.getContext()).queryDeviceCapability(1, deviceInfo.getDeviceIdentify(), "ConnectStateChangeHandler");
        if (mapQueryDeviceCapability == null || mapQueryDeviceCapability.isEmpty()) {
            LogUtil.j("ConnectStateChangeHandler", "getDeviceSupportCapacity, deviceCapabilityHashMaps is empty");
            return false;
        }
        DeviceCapability deviceCapability = mapQueryDeviceCapability.get(deviceInfo.getDeviceIdentify());
        if (deviceCapability != null) {
            return deviceCapability.isSupportSyncContacts();
        }
        return false;
    }

    private boolean a() {
        return mtk.d();
    }
}
