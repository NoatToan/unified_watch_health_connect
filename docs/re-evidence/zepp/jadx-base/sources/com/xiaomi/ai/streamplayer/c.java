package com.xiaomi.ai.streamplayer;

/* JADX INFO: loaded from: classes18.dex */
class c extends Thread {
    public final /* synthetic */ b a;

    public c(b bVar) {
        this.a = bVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        this.a.d();
    }
}
