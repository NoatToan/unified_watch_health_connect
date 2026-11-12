package defpackage;

import com.xiaomi.push.service.XMPushService;

/* JADX INFO: loaded from: classes11.dex */
public class bus extends XMPushService.j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zts f4626b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bus(zts ztsVar, int i) {
        super(i);
        this.f4626b = ztsVar;
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    public String a() {
        return "Handling bind stats";
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    public void b() {
        this.f4626b.e();
    }
}
