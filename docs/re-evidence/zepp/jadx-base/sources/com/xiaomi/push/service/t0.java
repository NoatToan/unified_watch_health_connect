package com.xiaomi.push.service;

import com.xiaomi.push.bu;
import com.xiaomi.push.bw;
import java.util.Map;

/* JADX INFO: loaded from: classes22.dex */
class t0 extends bu {
    public final /* synthetic */ XMPushService j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(XMPushService xMPushService, Map map, int i, String str, bw bwVar) {
        super(map, i, str, bwVar);
        this.j = xMPushService;
    }

    @Override // com.xiaomi.push.bu
    /* JADX INFO: renamed from: a */
    public byte[] mo3613a() {
        try {
            com.xiaomi.push.au.b bVar = new com.xiaomi.push.au.b();
            bVar.a(bn.a().b());
            return bVar.m3755a();
        } catch (Exception e) {
            com.xiaomi.channel.commonutils.logger.b.m3434a("getOBBString err: " + e.toString());
            return null;
        }
    }
}
