package com.xiaomi.push.service;

import android.text.TextUtils;
import com.xiaomi.push.ib;
import com.xiaomi.push.il;
import com.xiaomi.push.ja;
import defpackage.gbs;
import defpackage.k8s;
import java.util.HashMap;

/* JADX INFO: loaded from: classes11.dex */
public class j extends v.a {
    public final /* synthetic */ XMPushService c;
    public final /* synthetic */ n0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(String str, long j, XMPushService xMPushService, n0 n0Var) {
        super(str, j);
        this.c = xMPushService;
        this.d = n0Var;
    }

    @Override // com.xiaomi.push.service.v.a
    public void a(v vVar) {
        k8s k8sVarA = k8s.a(this.c);
        String strD = vVar.d("MSAID", "msaid");
        String strA = k8sVarA.a();
        if (TextUtils.isEmpty(strA) || TextUtils.equals(strD, strA)) {
            return;
        }
        vVar.g("MSAID", "msaid", strA);
        ja jaVar = new ja();
        jaVar.b(this.d.d);
        jaVar.c(il.ClientInfoUpdate.f125a);
        jaVar.a(gbs.a());
        jaVar.a(new HashMap());
        k8sVarA.d(jaVar.m763a());
        byte[] bArrE = com.xiaomi.push.i.e(i.b(this.c.getPackageName(), this.d.d, jaVar, ib.Notification));
        XMPushService xMPushService = this.c;
        xMPushService.a(xMPushService.getPackageName(), bArrE, true);
    }
}
