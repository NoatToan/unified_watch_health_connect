package defpackage;

import com.huawei.openplatform.abl.log.HiAdLog;

/* JADX INFO: loaded from: classes4.dex */
public class ayr implements Runnable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Runnable f803c;

    @Override // java.lang.Runnable
    public void run() {
        Runnable runnable = this.f803c;
        if (runnable != null) {
            try {
                runnable.run();
            } catch (Throwable th) {
                HiAdLog.e("TaskWrapper", "exception in task run");
                HiAdLog.printSafeStackTrace(5, th);
            }
        }
    }

    public ayr(Runnable runnable) {
        this.f803c = runnable;
    }
}
