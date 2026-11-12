package com.xiaomi.push.service;

import com.xiaomi.push.ha;
import com.xiaomi.push.ix;
import defpackage.v5s;
import defpackage.x9s;
import defpackage.y0t;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class c extends XMPushService.j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ XMPushService f14205b;
    public final /* synthetic */ ix c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(int i, XMPushService xMPushService, ix ixVar) {
        super(i);
        this.f14205b = xMPushService;
        this.c = ixVar;
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    public String a() {
        return "send ack message for message.";
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    public void b() {
        Map<String, String> mapA;
        try {
            if (y0t.j(this.f14205b)) {
                try {
                    mapA = v5s.a(this.f14205b, this.c);
                } catch (Throwable unused) {
                    mapA = null;
                }
            } else {
                mapA = null;
            }
            i.i(this.f14205b, a.c(this.f14205b, this.c, mapA));
        } catch (ha e) {
            x9s.s(e);
            this.f14205b.a(10, e);
        }
    }
}
