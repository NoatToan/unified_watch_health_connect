package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class jqr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public hqr f23038a;

    public abstract hqr a();

    public synchronized hqr b() {
        try {
            if (this.f23038a == null) {
                this.f23038a = a();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f23038a;
    }
}
