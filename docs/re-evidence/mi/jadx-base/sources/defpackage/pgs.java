package defpackage;

import com.xiaomi.push.i;
import com.xiaomi.push.ib;
import com.xiaomi.push.ja;
import com.xiaomi.push.service.XMPushService;
import com.xiaomi.push.service.x;

/* JADX INFO: loaded from: classes11.dex */
public class pgs implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ja f30385a;

    public pgs(ja jaVar) {
        this.f30385a = jaVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        byte[] bArrE = i.e(com.xiaomi.push.service.i.b(this.f30385a.d(), this.f30385a.b(), this.f30385a, ib.Notification));
        if (x.c instanceof XMPushService) {
            ((XMPushService) x.c).a(this.f30385a.d(), bArrE, true);
        } else {
            x9s.o("UNDatas UploadNotificationDatas failed because not xmsf");
        }
    }
}
