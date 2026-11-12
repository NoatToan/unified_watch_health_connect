package defpackage;

import com.xiaomi.push.service.XMPushService;

/* JADX INFO: loaded from: classes11.dex */
public class uws extends XMPushService.j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f36238b;
    public final /* synthetic */ long c;
    public final /* synthetic */ sws d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uws(sws swsVar, int i, long j, long j2) {
        super(i);
        this.d = swsVar;
        this.f36238b = j;
        this.c = j2;
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    public String a() {
        return "check the ping-pong." + this.c;
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    public void b() {
        Thread.yield();
        if (!this.d.D() || this.d.r(this.f36238b)) {
            return;
        }
        cdt.c(this.d.x).m();
        this.d.x.a(22, (Exception) null);
    }
}
