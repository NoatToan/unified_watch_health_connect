package defpackage;

import androidx.media3.common.C;
import com.huawei.devicesdk.callback.DeviceScanCallback;
import com.huawei.devicesdk.entity.ScanMode;
import com.huawei.devicesdk.strategy.ScanStrategy;
import com.huawei.haf.threadpool.ThreadPoolManager;
import health.compact.a.LogUtil;
import health.compact.a.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Semaphore;

/* JADX INFO: loaded from: classes23.dex */
public class cnj {
    private static Semaphore e = new Semaphore(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Timer f1837b;
    private final coi d;

    class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<cmy> f1838a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final DeviceScanCallback f1839b;
        private final List<ScanStrategy> e;

        c(List<ScanStrategy> list, DeviceScanCallback deviceScanCallback, List<cmy> list2) {
            this.e = list;
            this.f1839b = deviceScanCallback;
            this.f1838a = list2;
        }

        @Override // java.lang.Runnable
        public void run() {
            LogUtil.b("DevicesManagement_ScanManage", "scan thread start.");
            try {
                cnj.e.acquire();
            } catch (InterruptedException unused) {
                LogUtil.d("DevicesManagement_ScanManage", "ScanRunnable InterruptedException");
            }
            coc.c().a();
            cnj.this.f1837b = new Timer("DevicesManagement_ScanManage");
            coc.c().a(cnj.this.f1837b);
            Iterator<ScanStrategy> it = this.e.iterator();
            while (it.hasNext()) {
                b(it.next(), this.f1839b, this.f1838a);
            }
            cnj.e.release();
        }

        private void b(final ScanStrategy scanStrategy, DeviceScanCallback deviceScanCallback, List<cmy> list) {
            final cjs cjsVar = new cjs(deviceScanCallback, list);
            scanStrategy.init(cjsVar);
            coc.c().c(scanStrategy);
            scanStrategy.scan();
            cnj.this.f1837b.schedule(new TimerTask() { // from class: cnj.c.1
                @Override // java.util.TimerTask, java.lang.Runnable
                public void run() {
                    cqp.a(100080, "", "", String.valueOf(cjsVar.b()));
                    coc.c().a(scanStrategy);
                    scanStrategy.stopScan(false);
                }
            }, C.DEFAULT_SEEK_FORWARD_INCREMENT_MS);
        }
    }

    private cnj() {
        this.d = coi.b();
    }

    public static cnj c() {
        return e.f1843b;
    }

    public void b(ScanMode scanMode, List<cmy> list, DeviceScanCallback deviceScanCallback) {
        if (scanMode == null || deviceScanCallback == null || list == null) {
            LogUtil.e("DevicesManagement_ScanManage", "scanDevice error. input param is null");
            return;
        }
        ReleaseLogUtil.c("DEVMGR_DevicesManagement_ScanManage", "scanDevice start. type ", scanMode.toString());
        coi coiVar = this.d;
        if (coiVar == null || !coiVar.c()) {
            LogUtil.e("DevicesManagement_ScanManage", "bluetooth is disable");
            return;
        }
        cqp.a(100076, "", "", String.valueOf(scanMode));
        ThreadPoolManager.c().execute(new c(d(scanMode), deviceScanCallback, list));
    }

    public void b() {
        ReleaseLogUtil.c("DEVMGR_DevicesManagement_ScanManage", "stopScanDevice");
        coc.c().a();
    }

    private List<ScanStrategy> d(ScanMode scanMode) {
        cof cofVar = new cof();
        ArrayList arrayList = new ArrayList(16);
        if (scanMode == ScanMode.BR_BLE) {
            arrayList.add(ScanMode.BLE);
            arrayList.add(ScanMode.BR);
        } else {
            arrayList.add(scanMode);
        }
        ArrayList arrayList2 = new ArrayList(16);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object objD = cofVar.d((ScanMode) it.next());
            if (objD instanceof ScanStrategy) {
                arrayList2.add((ScanStrategy) objD);
            }
        }
        return arrayList2;
    }

    static class e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static cnj f1843b = new cnj();
    }
}
