package com.xiaomi.push.service;

import com.xiaomi.push.ha;
import com.xiaomi.push.service.XMPushService.b;
import com.xiaomi.smarthome.framework.api.UserConfig;
import defpackage.iht;
import defpackage.x9s;
import java.util.Collection;
import java.util.Objects;

/* JADX INFO: loaded from: classes11.dex */
public class p0 extends XMPushService.j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public XMPushService f14251b;
    public byte[] c;
    public String d;
    public String e;
    public String f;

    public p0(XMPushService xMPushService, String str, String str2, String str3, byte[] bArr) {
        super(9);
        this.f14251b = xMPushService;
        this.d = str;
        this.c = bArr;
        this.e = str2;
        this.f = str3;
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    public String a() {
        return "register app";
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    public void b() {
        bg.b next;
        n0 n0VarB = o0.b(this.f14251b);
        if (n0VarB == null) {
            try {
                n0VarB = o0.c(this.f14251b, this.d, this.e, this.f);
            } catch (Exception e) {
                x9s.D("fail to register push account. " + e);
            }
        }
        if (n0VarB == null) {
            x9s.D("no account for registration.");
            iht.a(this.f14251b, 70000002, "no account.");
            return;
        }
        x9s.o("do registration now.");
        Collection<bg.b> collectionF = bg.c().f(UserConfig.KEY_DEVICE_LITE_SORT_GROUP);
        if (collectionF.isEmpty()) {
            next = n0VarB.a(this.f14251b);
            i.j(this.f14251b, next);
            bg.c().l(next);
        } else {
            next = collectionF.iterator().next();
        }
        if (!this.f14251b.m836c()) {
            iht.e(this.d, this.c);
            this.f14251b.a(true);
            return;
        }
        try {
            bg.c cVar = next.m;
            if (cVar == bg.c.binded) {
                i.l(this.f14251b, this.d, this.c);
            } else if (cVar == bg.c.unbind) {
                iht.e(this.d, this.c);
                XMPushService xMPushService = this.f14251b;
                Objects.requireNonNull(xMPushService);
                xMPushService.a(xMPushService.new b(next));
            }
        } catch (ha e2) {
            x9s.D("meet error, disconnect connection. " + e2);
            this.f14251b.a(10, e2);
        }
    }
}
