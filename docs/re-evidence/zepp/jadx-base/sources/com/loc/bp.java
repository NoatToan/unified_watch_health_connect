package com.loc;

/* JADX INFO: loaded from: classes18.dex */
public abstract class bp {
    public bp a;

    public bp() {
    }

    public bp(bp bpVar) {
        this.a = bpVar;
    }

    public void a(int i) {
        bp bpVar = this.a;
        if (bpVar != null) {
            bpVar.a(i);
        }
    }

    public void a(boolean z) {
        bp bpVar = this.a;
        if (bpVar != null) {
            bpVar.a(z);
        }
    }

    public abstract boolean a();

    public int b() {
        bp bpVar = this.a;
        return Math.min(Integer.MAX_VALUE, bpVar != null ? bpVar.b() : Integer.MAX_VALUE);
    }

    public final boolean c() {
        bp bpVar = this.a;
        if (bpVar != null ? bpVar.c() : true) {
            return a();
        }
        return false;
    }
}
