package com.sogou.map.loc;

/* JADX INFO: loaded from: classes18.dex */
final class w extends v {
    private final long d;
    private long e;
    private u f;
    private u g;

    public w(u uVar, u uVar2, long j) {
        super(uVar, uVar2);
        this.f = new x(this);
        this.g = new y(this);
        this.d = j;
    }

    @Override // com.sogou.map.loc.v
    public final synchronized k2 b(boolean z) {
        try {
            if (z) {
                k2 k2Var = this.a;
                if (k2Var != null && !k2Var.h()) {
                    return this.a;
                }
                k2 k2VarB = a().b(this.f, this.g);
                this.a = k2VarB;
                return k2VarB;
            }
            k2 k2Var2 = this.a;
            if (k2Var2 != null && (!k2Var2.h() || j0.q() - this.e <= this.d)) {
                if (this.a.h()) {
                    r0.b("使用已有结果");
                }
                return this.a;
            }
            k2 k2VarB2 = a().b(this.f, this.g);
            this.a = k2VarB2;
            return k2VarB2;
        } catch (Throwable th) {
            throw th;
        }
    }
}
