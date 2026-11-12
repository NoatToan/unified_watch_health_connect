package defpackage;

/* JADX INFO: loaded from: classes11.dex */
public class mrv {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f42321b;
    private boolean d;

    mrv(int i, boolean z) {
        this.f42321b = i;
        this.d = z;
    }

    public int d() {
        return this.f42321b;
    }

    public boolean e() {
        return this.d;
    }

    public String toString() {
        return "SyncState{errorCode=" + this.f42321b + ", isNeedSync=" + this.d + '}';
    }
}
