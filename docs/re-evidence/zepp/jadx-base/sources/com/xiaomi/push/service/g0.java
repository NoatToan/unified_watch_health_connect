package com.xiaomi.push.service;

import android.util.Base64;
import com.xiaomi.push.C1648r;
import com.xiaomi.push.ao;

/* JADX INFO: loaded from: classes22.dex */
class g0 extends C1648r.b {
    public boolean a = false;
    public final /* synthetic */ bn b;

    public g0(bn bnVar) {
        this.b = bnVar;
    }

    @Override // com.xiaomi.push.C1648r.b
    public void b() {
        try {
            a.a(com.xiaomi.channel.commonutils.android.k.m3431a()).a();
            com.xiaomi.push.at.a aVarA = com.xiaomi.push.at.a.a(Base64.decode(ao.a(com.xiaomi.channel.commonutils.android.k.m3431a(), "https://resolver.msg.global.xiaomi.net/psc/?t=a", null), 10));
            if (aVarA != null) {
                this.b.b = aVarA;
                this.a = true;
                this.b.m();
            }
        } catch (Exception e) {
            com.xiaomi.channel.commonutils.logger.b.m3434a("fetch config failure: " + e.getMessage());
        }
    }

    @Override // com.xiaomi.push.C1648r.b
    public void c() {
        bn.a[] aVarArr;
        this.b.c = null;
        if (this.a) {
            synchronized (this.b) {
                aVarArr = (bn.a[]) this.b.a.toArray(new bn.a[this.b.a.size()]);
            }
            for (bn.a aVar : aVarArr) {
                aVar.a(this.b.b);
            }
        }
    }
}
