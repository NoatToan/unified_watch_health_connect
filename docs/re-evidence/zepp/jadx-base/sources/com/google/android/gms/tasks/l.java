package com.google.android.gms.tasks;

/* JADX INFO: loaded from: classes3.dex */
final class l implements Runnable {
    public final /* synthetic */ m a;

    public l(m mVar) {
        this.a = mVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.a.b) {
            m mVar = this.a;
            if (mVar.c != null) {
                mVar.c.onCanceled();
            }
        }
    }
}
