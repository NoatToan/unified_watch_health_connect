package defpackage;

import com.huawei.devicesdk.strategy.ScanStrategy;
import health.compact.a.LogUtil;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Timer;

/* JADX INFO: loaded from: classes23.dex */
public class coc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final coc f1897a = new coc();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f1898b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Set<ScanStrategy> f1899c = new HashSet();
    private Timer e;

    private coc() {
    }

    public void a(Timer timer) {
        this.e = timer;
    }

    public void c(ScanStrategy scanStrategy) {
        synchronized (f1898b) {
            this.f1899c.add(scanStrategy);
        }
    }

    public void a(ScanStrategy scanStrategy) {
        synchronized (f1898b) {
            this.f1899c.remove(scanStrategy);
        }
    }

    public void a() {
        LogUtil.b("ScanStrategyCache", "stop scan");
        Timer timer = this.e;
        if (timer != null) {
            timer.cancel();
            this.e = null;
        }
        synchronized (f1898b) {
            Iterator<ScanStrategy> it = this.f1899c.iterator();
            while (it.hasNext()) {
                it.next().stopScan(true);
                it.remove();
            }
        }
    }

    public static coc c() {
        return f1897a;
    }
}
