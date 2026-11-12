package defpackage;

import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import com.huawei.nfc.PluginPayAdapter;
import com.huawei.wearengine.DeviceManager;
import com.huawei.wearengine.WearEngineBinderClient;
import com.huawei.wearengine.WearEngineClientInner;
import com.huawei.wearengine.device.Device;
import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public class yjf implements DeviceManager, WearEngineBinderClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile yjf f53493a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f53495c = new Object();
    private IBinder.DeathRecipient d = new IBinder.DeathRecipient() { // from class: yjf.5
        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            yis.b("DeviceServiceProxy", "binderDied enter");
            if (yjf.this.f53494b != null) {
                yjf.this.f53494b.asBinder().unlinkToDeath(yjf.this.d, 0);
                yjf.this.f53494b = null;
            }
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private DeviceManager f53494b = null;

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return null;
    }

    private yjf() {
        d();
    }

    private void d(String str) throws RemoteException {
        yis.b("DeviceServiceProxy", "enter syncCheckConnStatus");
        synchronized (this.f53495c) {
            if (this.f53494b == null) {
                yis.b("DeviceServiceProxy", "syncCheckConnStatusm DeviceManager is null.");
                if (TextUtils.isEmpty(str)) {
                    WearEngineClientInner.c().e();
                } else {
                    WearEngineClientInner.c().e(str);
                }
                e();
            }
            yis.b("DeviceServiceProxy", "syncCheckConnStatus DeviceManager is not null.");
        }
    }

    private void e() throws RemoteException {
        IBinder iBinderB = WearEngineClientInner.c().b(1);
        if (iBinderB == null) {
            throw new yib(2);
        }
        DeviceManager deviceManagerAsInterface = DeviceManager.Stub.asInterface(iBinderB);
        this.f53494b = deviceManagerAsInterface;
        deviceManagerAsInterface.asBinder().linkToDeath(this.d, 0);
    }

    public static yjf c() {
        if (f53493a == null) {
            synchronized (yjf.class) {
                if (f53493a == null) {
                    f53493a = new yjf();
                }
            }
        }
        return f53493a;
    }

    @Override // com.huawei.wearengine.DeviceManager
    public List<Device> getBondedDevices() {
        try {
            d("getBondedDevices");
            if (this.f53494b != null) {
                if (ylk.d("device_get_bonded_device_ex")) {
                    return getBondedDeviceEx();
                }
                return this.f53494b.getBondedDevices();
            }
            throw new yib(6);
        } catch (RemoteException unused) {
            yis.c("DeviceServiceProxy", "getBondedDevices RemoteException");
            throw new yib(12);
        } catch (IllegalStateException e) {
            throw yib.d(e);
        }
    }

    @Override // com.huawei.wearengine.DeviceManager
    public List<Device> getAllBondedDevices() {
        try {
            d("getAllBondedDevices");
            if (this.f53494b != null) {
                if (!ylk.d("device_get_all_bonded_device")) {
                    yis.c("DeviceServiceProxy", "getAllBondedDevices Health version is low");
                    throw new yib(14);
                }
                return this.f53494b.getAllBondedDevices();
            }
            throw new yib(6);
        } catch (RemoteException unused) {
            yis.c("DeviceServiceProxy", "getAllBondedDevices RemoteException");
            throw new yib(12);
        } catch (IllegalStateException e) {
            throw yib.d(e);
        }
    }

    @Override // com.huawei.wearengine.DeviceManager
    public List<Device> getCommonDevice() {
        try {
            d("getCommonDevice");
            if (this.f53494b != null) {
                if (!ylk.d("device_get_common_device")) {
                    yis.c("DeviceServiceProxy", "getCommonDevice Health version is low");
                    throw new yib(14);
                }
                return this.f53494b.getCommonDevice();
            }
            throw new yib(6);
        } catch (RemoteException unused) {
            yis.c("DeviceServiceProxy", "getCommonDevice RemoteException");
            throw new yib(12);
        } catch (IllegalStateException e) {
            throw yib.d(e);
        }
    }

    @Override // com.huawei.wearengine.DeviceManager
    public boolean hasAvailableDevices() {
        try {
            d("hasAvailableDevices");
            DeviceManager deviceManager = this.f53494b;
            if (deviceManager != null) {
                return deviceManager.hasAvailableDevices();
            }
            throw new yib(6);
        } catch (RemoteException unused) {
            yis.c("DeviceServiceProxy", "hasAvailableDevices RemoteException");
            throw new yib(12);
        } catch (IllegalStateException e) {
            throw yib.d(e);
        } catch (yib e2) {
            if (e2.e() == 16) {
                return false;
            }
            throw e2;
        }
    }

    @Override // com.huawei.wearengine.DeviceManager
    public int queryDeviceCapability(Device device, int i) {
        try {
            d(null);
            if (this.f53494b != null) {
                if (!ylk.d("query_device_capability")) {
                    yis.c("DeviceServiceProxy", "queryDeviceCapability Health version is low");
                    throw new yib(14);
                }
                return this.f53494b.queryDeviceCapability(device, i);
            }
            throw new yib(6);
        } catch (RemoteException unused) {
            yis.c("DeviceServiceProxy", "queryDeviceCapability RemoteException");
            throw new yib(12);
        } catch (IllegalStateException e) {
            throw yib.d(e);
        }
    }

    @Override // com.huawei.wearengine.DeviceManager
    public String getHiLinkDeviceId(Device device) {
        try {
            d(null);
            if (this.f53494b != null) {
                if (!ylk.d("device_get_hi_link_device_id")) {
                    yis.c("DeviceServiceProxy", "getHiLinkDeviceId Health version is low");
                    throw new yib(14);
                }
                return this.f53494b.getHiLinkDeviceId(device);
            }
            throw new yib(6);
        } catch (RemoteException unused) {
            yis.c("DeviceServiceProxy", "getHiLinkDeviceId RemoteException");
            throw new yib(12);
        } catch (IllegalStateException e) {
            throw yib.d(e);
        }
    }

    @Override // com.huawei.wearengine.DeviceManager
    public List<Device> getBondedDeviceEx() {
        try {
            d(null);
            DeviceManager deviceManager = this.f53494b;
            if (deviceManager != null) {
                return deviceManager.getBondedDeviceEx();
            }
            throw new yib(6);
        } catch (RemoteException unused) {
            yis.c("DeviceServiceProxy", "getBondedDeviceEx RemoteException");
            throw new yib(12);
        } catch (IllegalStateException e) {
            throw yib.d(e);
        }
    }

    @Override // com.huawei.wearengine.DeviceManager
    public String getDeviceSn(Device device) {
        try {
            d(null);
            if (this.f53494b != null) {
                if (!ylk.d(PluginPayAdapter.KEY_DEVICE_INFO_SN)) {
                    yis.c("DeviceServiceProxy", "queryDeviceCapability Health version is low");
                    throw new yib(14);
                }
                return this.f53494b.getDeviceSn(device);
            }
            throw new yib(6);
        } catch (RemoteException unused) {
            yis.c("DeviceServiceProxy", "getDeviceSn RemoteException");
            throw new yib(12);
        } catch (IllegalStateException e) {
            throw yib.d(e);
        }
    }

    @Override // com.huawei.wearengine.WearEngineBinderClient
    public void clearBinderProxy() {
        this.f53494b = null;
        yis.b("DeviceServiceProxy", "clearBinderProxy");
    }

    private void d() {
        WearEngineClientInner.c().a(new yhv(new WeakReference(this)));
    }
}
