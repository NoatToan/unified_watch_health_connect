package defpackage;

import android.os.IBinder;
import android.os.RemoteException;
import com.huawei.wearengine.MonitorManager;
import com.huawei.wearengine.WearEngineBinderClient;
import com.huawei.wearengine.WearEngineClientInner;
import com.huawei.wearengine.device.Device;
import com.huawei.wearengine.monitor.MonitorData;
import com.huawei.wearengine.monitor.MonitorDataCallback;
import com.huawei.wearengine.monitor.MonitorItem;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public class yjm implements MonitorManager, WearEngineBinderClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f53512a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private IBinder.DeathRecipient f53513b = new IBinder.DeathRecipient() { // from class: yjm.5
        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            yis.b("MonitorServiceProxy", "binderDied enter");
            if (yjm.this.f53514c != null) {
                yjm.this.f53514c.asBinder().unlinkToDeath(yjm.this.f53513b, 0);
                yjm.this.f53514c = null;
            }
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private MonitorManager f53514c = null;

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return null;
    }

    public yjm() {
        e();
    }

    private void a() throws RemoteException {
        synchronized (this.f53512a) {
            if (this.f53514c == null) {
                WearEngineClientInner.c().e();
                IBinder iBinderB = WearEngineClientInner.c().b(3);
                if (iBinderB == null) {
                    throw new yib(2);
                }
                MonitorManager monitorManagerAsInterface = MonitorManager.Stub.asInterface(iBinderB);
                this.f53514c = monitorManagerAsInterface;
                monitorManagerAsInterface.asBinder().linkToDeath(this.f53513b, 0);
            }
        }
    }

    @Override // com.huawei.wearengine.MonitorManager
    public int registerListener(Device device, String str, MonitorItem monitorItem, MonitorDataCallback monitorDataCallback, int i) {
        try {
            a();
            if (this.f53514c == null) {
                return 6;
            }
            c(new ArrayList(Collections.singleton(monitorItem)));
            return this.f53514c.registerListener(device, str, monitorItem, monitorDataCallback, i);
        } catch (RemoteException unused) {
            yis.c("MonitorServiceProxy", "registerListener RemoteException");
            return 12;
        } catch (IllegalStateException e) {
            throw yib.d(e);
        }
    }

    @Override // com.huawei.wearengine.MonitorManager
    public int registerListListener(Device device, String str, List<MonitorItem> list, MonitorDataCallback monitorDataCallback, int i) {
        try {
            a();
            if (this.f53514c == null) {
                return 6;
            }
            c(list);
            return this.f53514c.registerListListener(device, str, list, monitorDataCallback, i);
        } catch (RemoteException unused) {
            yis.c("MonitorServiceProxy", "registerListListener RemoteException");
            return 12;
        } catch (IllegalStateException e) {
            throw yib.d(e);
        }
    }

    @Override // com.huawei.wearengine.MonitorManager
    public int unregisterListener(MonitorDataCallback monitorDataCallback, int i) {
        try {
            a();
            MonitorManager monitorManager = this.f53514c;
            if (monitorManager != null) {
                return monitorManager.unregisterListener(monitorDataCallback, i);
            }
            return 6;
        } catch (RemoteException unused) {
            yis.c("MonitorServiceProxy", "unregisterListener RemoteException");
            return 12;
        } catch (IllegalStateException e) {
            throw yib.d(e);
        }
    }

    @Override // com.huawei.wearengine.MonitorManager
    public MonitorData query(Device device, MonitorItem monitorItem) {
        try {
            a();
            if (this.f53514c != null) {
                if (!b(monitorItem)) {
                    yis.c("MonitorServiceProxy", "query Health version is low");
                    throw new yib(14);
                }
                return this.f53514c.query(device, monitorItem);
            }
            throw new yib(6);
        } catch (RemoteException unused) {
            yis.c("MonitorServiceProxy", "send RemoteException");
            throw new yib(12);
        } catch (IllegalStateException e) {
            throw yib.d(e);
        }
    }

    private boolean b(MonitorItem monitorItem) {
        if (!monitorItem.getName().equals(MonitorItem.MONITOR_ITEM_POWER_MODE.getName()) || ylk.d("powerMode")) {
            return ylk.d("monitor_query");
        }
        return false;
    }

    @Override // com.huawei.wearengine.WearEngineBinderClient
    public void clearBinderProxy() {
        this.f53514c = null;
        yis.b("MonitorServiceProxy", "clearBinderProxy");
    }

    private void e() {
        WearEngineClientInner.c().a(new yhv(new WeakReference(this)));
    }

    private void c(List<MonitorItem> list) {
        if (list == null || list.isEmpty()) {
            yis.c("MonitorServiceProxy", "checkServiceSupportMonitorStatus monitorItemList == null or monitorItemList.isEmpty()");
            throw new yib(5);
        }
        for (MonitorItem monitorItem : list) {
            if (!MonitorItem.MONITOR_ITEM_CONNECTION.getName().equals(monitorItem.getName()) && !ylk.d(monitorItem.getName())) {
                yis.c("MonitorServiceProxy", "checkServiceSupportMonitorStatus Health version is low");
                throw new yib(14);
            }
        }
    }
}
