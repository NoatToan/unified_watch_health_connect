package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes11.dex */
public class aes implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public wes f935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f936b;

    public void a(Context context) {
        this.f936b = context;
    }

    public void b(wes wesVar) {
        this.f935a = wesVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            wes wesVar = this.f935a;
            if (wesVar != null) {
                wesVar.a();
            }
            x9s.B("begin read and send perf / event");
            wes wesVar2 = this.f935a;
            if (wesVar2 instanceof lsc) {
                tfs.b(this.f936b).d("sp_client_report_status", "event_last_upload_time", System.currentTimeMillis());
            } else if (wesVar2 instanceof svc) {
                tfs.b(this.f936b).d("sp_client_report_status", "perf_last_upload_time", System.currentTimeMillis());
            }
        } catch (Exception e) {
            x9s.s(e);
        }
    }
}
