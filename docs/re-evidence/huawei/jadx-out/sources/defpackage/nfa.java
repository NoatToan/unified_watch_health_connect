package defpackage;

import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes11.dex */
public class nfa implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private lwq f43052a;

    public nfa(lwq lwqVar) {
        this.f43052a = lwqVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        ReleaseLogUtil.d("Dfx_EventLogUploadTask", "start upload task.");
        lwq lwqVar = this.f43052a;
        if (lwqVar == null) {
            LogUtil.a("EventLogUploadTask", "mLogUpload == null");
            return;
        }
        String strH = lwqVar.h();
        if (strH == null) {
            return;
        }
        boolean zB = eei.b(strH);
        this.f43052a.b(zB);
        if (zB) {
            this.f43052a.a("2019");
        } else {
            this.f43052a.a("1019");
        }
        ReleaseLogUtil.d("Dfx_EventLogUploadTask", "isHonorDeviceLog:", Boolean.valueOf(zB));
        nfe.a(this.f43052a);
    }
}
