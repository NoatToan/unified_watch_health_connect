package com.sogou.map.loc;

/* JADX INFO: loaded from: classes18.dex */
final class k implements Runnable {
    private /* synthetic */ i a;

    public k(i iVar) {
        this.a = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.a.h();
            if (this.a.a.h()) {
                return;
            }
            r0.b("任务尚未完成,立刻启动其他策略!");
            this.a.f();
        } catch (Throwable unused) {
        }
    }
}
