package com.xiaomi.push;

/* JADX INFO: loaded from: classes22.dex */
class q0 extends o.b {
    public final /* synthetic */ boolean b;
    public final /* synthetic */ String c;
    public final /* synthetic */ o d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(o oVar, o.a aVar, boolean z, String str) {
        super(aVar);
        this.d = oVar;
        this.b = z;
        this.c = str;
    }

    @Override // com.xiaomi.push.o.b
    public void a() {
        super.a();
    }

    @Override // com.xiaomi.push.o.b
    public void b() {
        if (this.b) {
            return;
        }
        this.d.d.edit().putLong(this.c, System.currentTimeMillis()).commit();
    }
}
