package com.xiaomi.push.service;

import android.content.Context;
import com.xiaomi.push.bu;
import java.io.IOException;
import org.json.JSONException;

/* JADX INFO: loaded from: classes22.dex */
class y0 extends XMPushService.j {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ String d;
    public final /* synthetic */ byte[] e;
    public final /* synthetic */ XMPushService f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(XMPushService xMPushService, int i, int i2, boolean z, String str, byte[] bArr) {
        super(i);
        this.f = xMPushService;
        this.b = i2;
        this.c = z;
        this.d = str;
        this.e = bArr;
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    public String a() {
        return "clear account cache.";
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    /* JADX INFO: renamed from: a */
    public void mo3788a() throws JSONException, IOException {
        r.m3836a((Context) this.f);
        az.a().m3828a("5");
        com.xiaomi.push.j.a(this.b);
        if (this.c) {
            this.f.m3805a();
        }
        this.f.f186a.c(bu.a());
        com.xiaomi.channel.commonutils.logger.b.m3434a("clear account and start registration. " + this.d);
        this.f.a(this.e, this.d);
    }
}
