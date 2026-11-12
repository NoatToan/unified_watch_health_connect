package defpackage;

import com.huawei.hmf.tasks.Task;
import com.huawei.hmf.tasks.Tasks;
import com.huawei.wearengine.device.Device;
import com.huawei.wearengine.monitor.MonitorData;
import com.huawei.wearengine.monitor.MonitorDataCallback;
import com.huawei.wearengine.monitor.MonitorItem;
import com.huawei.wearengine.monitor.MonitorListener;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes20.dex */
public final class yjj {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private yjm f53501b;

    private yjj() {
        this.f53501b = new yjm();
    }

    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final yjj f53506a = new yjj();
    }

    public static yjj d() {
        return b.f53506a;
    }

    public Task<Void> c(final Device device, final MonitorItem monitorItem, final MonitorListener monitorListener) {
        return Tasks.callInBackground(new Callable<Void>() { // from class: yjj.2
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public Void call() {
                yir.d(device, "Device can not be null!");
                yir.d(monitorListener, "register single monitor, monitorListener can not be null!");
                MonitorDataCallback monitorDataCallbackE = yjj.this.e(monitorListener);
                int iRegisterListener = yjj.this.f53501b.registerListener(device, ylx.e().getPackageName(), monitorItem, monitorDataCallbackE, System.identityHashCode(monitorListener));
                if (iRegisterListener == 0) {
                    return null;
                }
                throw new yib(iRegisterListener);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public MonitorDataCallback e(final MonitorListener monitorListener) {
        return new MonitorDataCallback.Stub() { // from class: com.huawei.wearengine.monitor.MonitorClient$3
            @Override // com.huawei.wearengine.monitor.MonitorDataCallback
            public void onChanged(int i, MonitorItem monitorItem, MonitorData monitorData) {
                MonitorListener monitorListener2 = monitorListener;
                if (monitorListener2 != null) {
                    monitorListener2.onChanged(i, monitorItem, monitorData);
                }
            }
        };
    }

    public Task<Void> d(final MonitorListener monitorListener) {
        return Tasks.callInBackground(new Callable<Void>() { // from class: yjj.1
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public Void call() {
                yir.d(monitorListener, "Unregister monitorListener can not be null!");
                int iUnregisterListener = yjj.this.f53501b.unregisterListener(yjj.this.e(null), System.identityHashCode(monitorListener));
                if (iUnregisterListener == 0) {
                    return null;
                }
                throw new yib(iUnregisterListener);
            }
        });
    }

    public Task<MonitorData> d(final Device device, final MonitorItem monitorItem) {
        return Tasks.callInBackground(new Callable<MonitorData>() { // from class: yjj.5
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public MonitorData call() {
                yir.d(device, "Device can not be null!");
                yir.d(monitorItem, "MonitorItem can not be null!");
                MonitorData monitorDataQuery = yjj.this.f53501b.query(device, monitorItem);
                if (monitorDataQuery != null) {
                    return monitorDataQuery;
                }
                throw new yib(12);
            }
        });
    }
}
