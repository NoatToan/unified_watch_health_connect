package com.xiaomi.mipush.sdk;

import com.xiaomi.push.service.at;

/* JADX INFO: loaded from: classes22.dex */
class u extends at.a {
    public final /* synthetic */ d c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(d dVar, int i, String str) {
        super(i, str);
        this.c = dVar;
    }

    @Override // com.xiaomi.push.service.at.a
    public void a() {
        if (!this.c.c) {
            this.c.c = true;
            g.b(this.c.a);
        }
    }
}
