package com.sogou.map.loc;

/* JADX INFO: loaded from: classes18.dex */
final class j2 implements Runnable {
    private /* synthetic */ SGLocClient a;

    public j2(SGLocClient sGLocClient) {
        this.a = sGLocClient;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.a) {
            try {
                try {
                    long j = this.a.n;
                    if (!this.a.o && !this.a.p && j >= 0) {
                        this.a.h.removeCallbacks(this.a.t);
                        byte b = this.a.e;
                        if (b == 1 || b == 2) {
                            if (this.a.k) {
                                this.a.h.postDelayed(this.a.t, Math.max(0L, (j - 1000) - (j0.q() - this.a.q)));
                            } else {
                                this.a.h.postDelayed(this.a.t, Math.max(0L, j - (j0.q() - this.a.q)));
                            }
                        } else if (b == 4 || b == 8) {
                            this.a.h.postDelayed(this.a.t, Math.max(0L, j - (j0.q() - this.a.q)));
                        }
                    }
                } catch (Throwable unused) {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
