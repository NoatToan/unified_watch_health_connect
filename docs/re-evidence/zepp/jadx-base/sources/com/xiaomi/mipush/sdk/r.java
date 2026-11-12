package com.xiaomi.mipush.sdk;

import android.database.ContentObserver;
import android.os.Handler;
import com.xiaomi.push.service.bf;

/* JADX INFO: loaded from: classes22.dex */
class r extends ContentObserver {
    public final /* synthetic */ ag a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(ag agVar, Handler handler) {
        super(handler);
        this.a = agVar;
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z) {
        ag agVar = this.a;
        agVar.j = Integer.valueOf(bf.a(agVar.b).a());
        if (this.a.j.intValue() != 0) {
            this.a.b.getContentResolver().unregisterContentObserver(this);
            if (com.xiaomi.push.y.m3842a(this.a.b)) {
                this.a.c();
            }
        }
    }
}
