package com.xiaomi.ai.streamplayer;

/* JADX INFO: loaded from: classes18.dex */
class h implements Runnable {
    public final /* synthetic */ f a;

    public h(f fVar) {
        this.a = fVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.a.f();
        synchronized (this) {
            this.a.b.release();
            this.a.f = true;
        }
    }
}
