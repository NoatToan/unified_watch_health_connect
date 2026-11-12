package com.xiaomi.push;

import java.util.Date;

/* JADX INFO: loaded from: classes22.dex */
class h0 implements bv {
    public final /* synthetic */ br a;

    public h0(br brVar) {
        this.a = brVar;
    }

    @Override // com.xiaomi.push.bv
    public void a(bt btVar) {
        com.xiaomi.channel.commonutils.logger.b.c("[Slim] " + this.a.b.format(new Date()) + " Connection started (" + this.a.c.hashCode() + ")");
    }

    @Override // com.xiaomi.push.bv
    public void a(bt btVar, int i, Exception exc) {
        com.xiaomi.channel.commonutils.logger.b.c("[Slim] " + this.a.b.format(new Date()) + " Connection closed (" + this.a.c.hashCode() + ")");
    }

    @Override // com.xiaomi.push.bv
    public void a(bt btVar, Exception exc) {
        com.xiaomi.channel.commonutils.logger.b.c("[Slim] " + this.a.b.format(new Date()) + " Reconnection failed due to an exception (" + this.a.c.hashCode() + ")");
        exc.printStackTrace();
    }

    @Override // com.xiaomi.push.bv
    public void b(bt btVar) {
        com.xiaomi.channel.commonutils.logger.b.c("[Slim] " + this.a.b.format(new Date()) + " Connection reconnected (" + this.a.c.hashCode() + ")");
    }
}
