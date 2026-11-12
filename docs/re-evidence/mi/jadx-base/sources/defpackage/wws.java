package defpackage;

import com.xiaomi.push.service.XMPushService;

/* JADX INFO: loaded from: classes11.dex */
public class wws extends XMPushService.j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f38445b;
    public final /* synthetic */ Exception c;
    public final /* synthetic */ sws d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wws(sws swsVar, int i, int i2, Exception exc) {
        super(i);
        this.d = swsVar;
        this.f38445b = i2;
        this.c = exc;
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    public String a() {
        return "shutdown the connection. " + this.f38445b + ", " + this.c;
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    public void b() {
        this.d.x.a(this.f38445b, this.c);
    }
}
