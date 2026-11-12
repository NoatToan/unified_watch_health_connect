package com.xiaomi.push.service;

import com.xiaomi.smarthome.framework.api.UserConfig;
import defpackage.hht;
import defpackage.jws;
import defpackage.x9s;

/* JADX INFO: loaded from: classes11.dex */
public class z extends XMPushService.j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f14271b;
    public final /* synthetic */ String c;
    public final /* synthetic */ byte[] d;
    public final /* synthetic */ XMPushService e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(XMPushService xMPushService, int i, int i2, String str, byte[] bArr) {
        super(i);
        this.e = xMPushService;
        this.f14271b = i2;
        this.c = str;
        this.d = bArr;
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    public String a() {
        return "clear account cache.";
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    public void b() {
        o0.g(this.e);
        bg.c().m(UserConfig.KEY_DEVICE_LITE_SORT_GROUP);
        hht.b(this.f14271b);
        this.e.f436a.k(jws.b());
        x9s.o("clear account and start registration. " + this.c);
        this.e.a(this.d, this.c);
    }
}
