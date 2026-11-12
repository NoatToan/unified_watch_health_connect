package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class kqr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public iqr f24200a;

    public abstract iqr a();

    public synchronized iqr b() {
        try {
            if (this.f24200a == null) {
                this.f24200a = a();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f24200a;
    }
}
