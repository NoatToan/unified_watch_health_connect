package com.google.android.play.integrity.internal;

/* JADX INFO: loaded from: classes14.dex */
final class x extends t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ ae f53454a;

    public x(ae aeVar) {
        this.f53454a = aeVar;
    }

    @Override // com.google.android.play.integrity.internal.t
    public final void b() {
        synchronized (this.f53454a.f53414g) {
            try {
                if (this.f53454a.f53420m.get() > 0 && this.f53454a.f53420m.decrementAndGet() > 0) {
                    this.f53454a.f53410c.d("Leaving the connection open for other ongoing calls.", new Object[0]);
                    return;
                }
                ae aeVar = this.f53454a;
                if (aeVar.f53422o != null) {
                    aeVar.f53410c.d("Unbind from service.", new Object[0]);
                    ae aeVar2 = this.f53454a;
                    aeVar2.f53409b.unbindService(aeVar2.f53421n);
                    this.f53454a.f53415h = false;
                    this.f53454a.f53422o = null;
                    this.f53454a.f53421n = null;
                }
                this.f53454a.x();
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
