package com.sogou.map.loc;

/* JADX INFO: loaded from: classes18.dex */
final class t implements Runnable {
    private /* synthetic */ s a;

    public t(s sVar) {
        this.a = sVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            try {
                if (this.a.b) {
                    this.a.g();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } finally {
            this.a.c = false;
        }
    }
}
