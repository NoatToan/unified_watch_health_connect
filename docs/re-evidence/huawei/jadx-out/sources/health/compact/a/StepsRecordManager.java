package health.compact.a;

import com.huawei.health.icommon.LocalStepDataReport;
import defpackage.lsl;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public class StepsRecordManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ReportController f36650a;
    private StepsRecord d = new StepsRecord();
    private long e = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AtomicBoolean f36651b = new AtomicBoolean(true);

    public StepsRecordManager() {
        this.f36650a = null;
        this.f36650a = new ReportController();
    }

    public void d(LocalStepDataReport localStepDataReport) {
        if (localStepDataReport == null) {
            return;
        }
        synchronized (this) {
            this.f36650a.b(localStepDataReport);
        }
    }

    public void a(long j, StepsRecord stepsRecord) {
        synchronized (this) {
            if (this.f36651b.get()) {
                b(j);
            }
            this.d.a(stepsRecord);
        }
    }

    private void b(long j) {
        long j2 = this.e;
        if (j2 == 0 || !lsl.c(j, j2)) {
            a();
            this.e = j;
        }
    }

    void a() {
        synchronized (this) {
            this.e = 0L;
            this.d.b();
        }
    }

    public void b(boolean z) {
        synchronized (this) {
            if (!this.f36651b.get() || c()) {
                StepsRecord stepsRecord = new StepsRecord();
                stepsRecord.a(this.d);
                this.f36650a.c(stepsRecord, z);
            }
        }
    }

    public boolean c() {
        synchronized (this) {
            if (this.e != 0 && this.d.d()) {
                return true;
            }
            return false;
        }
    }

    public void d() {
        synchronized (this) {
            this.f36651b.set(false);
        }
    }

    public StepsRecord b() {
        StepsRecord stepsRecord;
        synchronized (this) {
            stepsRecord = this.d;
        }
        return stepsRecord;
    }
}
