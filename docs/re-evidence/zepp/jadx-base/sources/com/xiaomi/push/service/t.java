package com.xiaomi.push.service;

import android.content.Context;
import com.xiaomi.mipush.sdk.ErrorCode;
import com.xiaomi.push.cd;
import com.xiaomi.push.service.XMPushService.b;
import java.util.Collection;

/* JADX INFO: loaded from: classes22.dex */
public class t extends XMPushService.j {
    private XMPushService b;
    private byte[] c;
    private String d;
    private String e;
    private String f;

    public t(XMPushService xMPushService, String str, String str2, String str3, byte[] bArr) {
        super(9);
        this.b = xMPushService;
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
    /* JADX INFO: renamed from: a */
    public void mo3788a() {
        az.b next;
        q qVarA = r.a((Context) this.b);
        if (qVarA == null) {
            try {
                qVarA = r.a(this.b, this.d, this.e, this.f);
            } catch (Exception e) {
                com.xiaomi.channel.commonutils.logger.b.d("fail to register push account. " + e);
            }
        }
        if (qVarA == null) {
            com.xiaomi.channel.commonutils.logger.b.d("no account for registration.");
            u.a(this.b, ErrorCode.ERROR_AUTHERICATION_ERROR, "no account.");
            return;
        }
        com.xiaomi.channel.commonutils.logger.b.m3434a("do registration now.");
        Collection<az.b> collectionA = az.a().a("5");
        if (collectionA.isEmpty()) {
            next = qVarA.a(this.b);
            f.j(this.b, next);
            az.a().a(next);
        } else {
            next = collectionA.iterator().next();
        }
        if (!this.b.m3811d()) {
            u.a(this.d, this.c);
            this.b.a(true);
            return;
        }
        try {
            az.c cVar = next.j;
            if (cVar == az.c.binded) {
                f.k(this.b, this.d, this.c);
            } else if (cVar == az.c.unbind) {
                u.a(this.d, this.c);
                XMPushService xMPushService = this.b;
                xMPushService.getClass();
                xMPushService.a(xMPushService.new b(next));
            }
        } catch (cd e2) {
            com.xiaomi.channel.commonutils.logger.b.d("meet error, disconnect connection. " + e2);
            this.b.a(10, e2);
        }
    }
}
