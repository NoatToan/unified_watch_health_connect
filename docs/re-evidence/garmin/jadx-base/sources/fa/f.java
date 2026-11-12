package fa;

/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f70012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f70013b;

    public f() {
        this(c.f70004a);
    }

    public final synchronized boolean a() {
        if (this.f70013b) {
            return false;
        }
        this.f70013b = true;
        notifyAll();
        return true;
    }

    public f(c cVar) {
        this.f70012a = cVar;
    }
}
