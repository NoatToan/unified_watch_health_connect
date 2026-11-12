package com.sogou.map.loc;

/* JADX INFO: loaded from: classes18.dex */
class v {
    public k2 a;
    private u b;
    private u c;

    public v(u uVar, u uVar2) {
        this.b = uVar;
        this.c = uVar2;
    }

    public final k2 a() {
        k2 k2Var = new k2();
        u uVar = this.b;
        if (uVar != null) {
            k2Var.a(uVar);
        }
        u uVar2 = this.c;
        if (uVar2 != null) {
            k2Var.e(uVar2);
        }
        return k2Var;
    }

    public synchronized k2 b(boolean z) {
        k2 k2Var = this.a;
        if (k2Var != null && !k2Var.h()) {
            return this.a;
        }
        k2 k2VarA = a();
        this.a = k2VarA;
        return k2VarA;
    }
}
