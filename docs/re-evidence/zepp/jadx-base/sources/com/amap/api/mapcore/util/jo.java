package com.amap.api.mapcore.util;

/* JADX INFO: loaded from: classes2.dex */
public abstract class jo {
    public jo c;

    public jo() {
    }

    public int a() {
        jo joVar = this.c;
        return Math.min(Integer.MAX_VALUE, joVar != null ? joVar.a() : Integer.MAX_VALUE);
    }

    public void a_(boolean z) {
        jo joVar = this.c;
        if (joVar != null) {
            joVar.a_(z);
        }
    }

    public abstract boolean c();

    public final boolean d() {
        jo joVar = this.c;
        if (joVar != null ? joVar.d() : true) {
            return c();
        }
        return false;
    }

    public jo(jo joVar) {
        this.c = joVar;
    }

    public void a_(int i) {
        jo joVar = this.c;
        if (joVar != null) {
            joVar.a_(i);
        }
    }
}
