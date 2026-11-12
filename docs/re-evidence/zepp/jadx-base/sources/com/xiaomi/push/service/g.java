package com.xiaomi.push.service;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.push.cz;
import com.xiaomi.push.df;
import com.xiaomi.push.dt;
import com.xiaomi.push.ee;
import java.util.HashMap;

/* JADX INFO: loaded from: classes22.dex */
final class g extends bp.a {
    public final /* synthetic */ XMPushService c;
    public final /* synthetic */ q d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(String str, long j, XMPushService xMPushService, q qVar) {
        super(str, j);
        this.c = xMPushService;
        this.d = qVar;
    }

    @Override // com.xiaomi.push.service.bp.a
    public void a(bp bpVar) {
        String str;
        String strA = bpVar.a("GAID", "gaid");
        String strB = com.xiaomi.channel.commonutils.android.c.b((Context) this.c);
        if (!com.xiaomi.channel.commonutils.android.c.m3421a((Context) this.c) && !TextUtils.isEmpty(strA)) {
            bpVar.a("GAID", "gaid", "");
            dt dtVar = new dt();
            dtVar.b(this.d.d);
            dtVar.c(df.ClientInfoUpdate.f77a);
            dtVar.a(aw.a());
            dtVar.a(new HashMap());
            dtVar.m3717a().put("rm_gpid", "1");
            byte[] bArrA = ee.a(f.d(this.c.getPackageName(), this.d.d, dtVar, cz.Notification));
            XMPushService xMPushService = this.c;
            xMPushService.a(xMPushService.getPackageName(), bArrA, true);
            str = "not low upload gpid";
        } else {
            if (TextUtils.isEmpty(strB) || TextUtils.equals(strA, strB)) {
                return;
            }
            bpVar.a("GAID", "gaid", strB);
            dt dtVar2 = new dt();
            dtVar2.b(this.d.d);
            dtVar2.c(df.ClientInfoUpdate.f77a);
            dtVar2.a(aw.a());
            dtVar2.a(new HashMap());
            dtVar2.m3717a().put("gaid", strB);
            byte[] bArrA2 = ee.a(f.d(this.c.getPackageName(), this.d.d, dtVar2, cz.Notification));
            XMPushService xMPushService2 = this.c;
            xMPushService2.a(xMPushService2.getPackageName(), bArrA2, true);
            str = "upload gaid. ";
        }
        com.xiaomi.channel.commonutils.logger.b.b(str);
    }
}
