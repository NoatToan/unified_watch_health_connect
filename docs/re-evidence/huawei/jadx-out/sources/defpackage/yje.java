package defpackage;

import com.huawei.hmf.tasks.Task;
import com.huawei.hmf.tasks.Tasks;
import com.huawei.wearengine.device.Device;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes20.dex */
public final class yje {
    private static volatile yje d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private yjf f53489b = yjf.c();

    private yje() {
    }

    public static yje d() {
        if (d == null) {
            synchronized (yje.class) {
                if (d == null) {
                    d = new yje();
                }
            }
        }
        return d;
    }

    public Task<List<Device>> c() {
        return Tasks.callInBackground(new Callable<List<Device>>() { // from class: yje.3
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public List<Device> call() {
                List<Device> bondedDevices = yje.this.f53489b.getBondedDevices();
                if (bondedDevices != null) {
                    return bondedDevices;
                }
                throw new yib(12);
            }
        });
    }

    public Task<List<Device>> b() {
        return Tasks.callInBackground(new Callable<List<Device>>() { // from class: yje.1
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public List<Device> call() {
                List<Device> commonDevice = yje.this.f53489b.getCommonDevice();
                if (commonDevice != null) {
                    return commonDevice;
                }
                throw new yib(12);
            }
        });
    }

    public Task<Boolean> e() {
        return Tasks.callInBackground(new Callable<Boolean>() { // from class: yje.4
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public Boolean call() {
                return Boolean.valueOf(yje.this.f53489b.hasAvailableDevices());
            }
        });
    }
}
