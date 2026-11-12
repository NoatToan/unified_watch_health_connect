package com.xiaomi.push.service;

import com.xiaomi.push.ha;
import defpackage.x9s;

/* JADX INFO: loaded from: classes11.dex */
public class a0 extends XMPushService.j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f14191b;
    public final /* synthetic */ byte[] c;
    public final /* synthetic */ XMPushService d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(XMPushService xMPushService, int i, String str, byte[] bArr) {
        super(i);
        this.d = xMPushService;
        this.f14191b = str;
        this.c = bArr;
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    public String a() {
        return "send mi push message";
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    public void b() {
        try {
            i.l(this.d, this.f14191b, this.c);
        } catch (ha e) {
            x9s.s(e);
            this.d.a(10, e);
        }
    }
}
