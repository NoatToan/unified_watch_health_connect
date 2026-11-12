package com.xiaomi.push;

/* JADX INFO: loaded from: classes22.dex */
class r0 extends o.b {
    public final /* synthetic */ o b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(o oVar, o.a aVar) {
        super(aVar);
        this.b = oVar;
    }

    @Override // com.xiaomi.push.o.b
    public void b() {
        synchronized (this.b.c) {
            this.b.b.remove(this.a.a());
        }
    }
}
