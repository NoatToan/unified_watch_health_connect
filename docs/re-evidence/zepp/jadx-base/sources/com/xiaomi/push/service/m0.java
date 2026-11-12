package com.xiaomi.push.service;

import com.xiaomi.push.cd;

/* JADX INFO: loaded from: classes22.dex */
class m0 extends XMPushService.j {
    public final /* synthetic */ String b;
    public final /* synthetic */ byte[] c;
    public final /* synthetic */ XMPushService d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(XMPushService xMPushService, int i, String str, byte[] bArr) {
        super(i);
        this.d = xMPushService;
        this.b = str;
        this.c = bArr;
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    public String a() {
        return "send mi push message";
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    /* JADX INFO: renamed from: a */
    public void mo3788a() {
        try {
            f.k(this.d, this.b, this.c);
        } catch (cd e) {
            com.xiaomi.channel.commonutils.logger.b.a(e);
            this.d.a(10, e);
        }
    }
}
