package de.greenrobot.event;

/* JADX INFO: loaded from: classes22.dex */
class a implements Runnable {
    private final e a = new e();
    private final EventBus b;

    public a(EventBus eventBus) {
        this.b = eventBus;
    }

    public void a(h hVar, Object obj) {
        this.a.a(d.a(hVar, obj));
        this.b.b().execute(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        d dVarB = this.a.b();
        if (dVarB == null) {
            throw new IllegalStateException("No pending post available");
        }
        this.b.d(dVarB);
    }
}
