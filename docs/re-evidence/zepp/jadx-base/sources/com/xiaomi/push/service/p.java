package com.xiaomi.push.service;

/* JADX INFO: loaded from: classes22.dex */
final class p extends com.xiaomi.push.o.a {
    public final /* synthetic */ String a;
    public final /* synthetic */ aq b;
    public final /* synthetic */ int c;

    public p(String str, aq aqVar, int i) {
        this.a = str;
        this.b = aqVar;
        this.c = i;
    }

    @Override // com.xiaomi.push.o.a
    public String a() {
        return this.a;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.b.a(this.c);
    }
}
